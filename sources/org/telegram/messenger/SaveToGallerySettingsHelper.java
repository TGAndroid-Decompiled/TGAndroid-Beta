package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import org.telegram.messenger.FilePathDatabase;
public class SaveToGallerySettingsHelper {
    public static String CHANNELS_PREF_NAME = "channels_save_gallery_exceptions";
    public static final long DEFAULT_VIDEO_LIMIT = 104857600;
    public static String GROUPS_PREF_NAME = "groups_save_gallery_exceptions";
    public static final long MAX_VIDEO_LIMIT = 4194304000L;
    public static String USERS_PREF_NAME = "users_save_gallery_exceptions";
    public static SharedSettings channels;
    public static SharedSettings groups;
    public static SharedSettings user;

    public static class DialogException extends Settings {
        public long dialogId;

        @Override
        public CharSequence createDescription(int i9) {
            StringBuilder sb2 = new StringBuilder();
            if (enabled()) {
                if (this.savePhoto) {
                    sb2.append(LocaleController.getString(R.string.SaveToGalleryPhotos));
                }
                if (this.saveVideo) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    long j10 = this.limitVideo;
                    if (j10 > 0 && j10 < 4194304000L) {
                        sb2.append(LocaleController.formatString("SaveToGalleryVideosUpTo", R.string.SaveToGalleryVideosUpTo, AndroidUtilities.formatFileSize(j10, true, false)));
                        return sb2;
                    }
                    sb2.append(LocaleController.formatString("SaveToGalleryVideos", R.string.SaveToGalleryVideos, new Object[0]));
                }
                return sb2;
            }
            sb2.append(LocaleController.getString(R.string.SaveToGalleryOff));
            return sb2;
        }
    }

    public static abstract class Settings {
        public long limitVideo = 104857600;
        public boolean savePhoto;
        public boolean saveVideo;

        public abstract CharSequence createDescription(int i9);

        public boolean enabled() {
            if (!this.savePhoto && !this.saveVideo) {
                return false;
            }
            return true;
        }

        public void toggle() {
            if (enabled()) {
                this.saveVideo = false;
                this.savePhoto = false;
                return;
            }
            this.savePhoto = true;
            this.saveVideo = true;
        }
    }

    public static class SharedSettings extends Settings {
        private int type;

        public boolean needSave(FilePathDatabase.FileMeta fileMeta, MessageObject messageObject, int i9) {
            boolean z10;
            long j10;
            DialogException dialogException = UserConfig.getInstance(i9).getSaveGalleryExceptions(this.type).get(fileMeta.dialogId);
            if (messageObject != null && (messageObject.isOutOwner() || messageObject.isSecretMedia())) {
                return false;
            }
            if ((messageObject != null && messageObject.isVideo()) || fileMeta.messageType == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (messageObject != null) {
                j10 = messageObject.getSize();
            } else {
                j10 = fileMeta.messageSize;
            }
            boolean z11 = this.saveVideo;
            boolean z12 = this.savePhoto;
            long j11 = this.limitVideo;
            if (dialogException != null) {
                z11 = dialogException.saveVideo;
                z12 = dialogException.savePhoto;
                j11 = dialogException.limitVideo;
            }
            if (z10) {
                if (z11 && (j11 == -1 || j10 < j11)) {
                    return true;
                }
            } else if (z12) {
                return true;
            }
            return false;
        }

        public static SharedSettings read(String str, SharedPreferences sharedPreferences) {
            SharedSettings sharedSettings = new SharedSettings();
            sharedSettings.savePhoto = sharedPreferences.getBoolean(str + "_save_gallery_photo", false);
            sharedSettings.saveVideo = sharedPreferences.getBoolean(str + "_save_gallery_video", false);
            sharedSettings.limitVideo = sharedPreferences.getLong(str + "_save_gallery_limitVideo", 104857600L);
            return sharedSettings;
        }

        public void save(String str, SharedPreferences sharedPreferences) {
            sharedPreferences.edit().putBoolean(ta.b.j(str, "_save_gallery_photo"), this.savePhoto).putBoolean(ta.b.j(str, "_save_gallery_video"), this.saveVideo).putLong(ta.b.j(str, "_save_gallery_limitVideo"), this.limitVideo).apply();
        }

        @Override
        public CharSequence createDescription(int i9) {
            StringBuilder sb2 = new StringBuilder();
            if (enabled()) {
                if (this.savePhoto) {
                    sb2.append(LocaleController.getString(R.string.SaveToGalleryPhotos));
                }
                if (this.saveVideo) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.SaveToGalleryVideos));
                    long j10 = this.limitVideo;
                    if (j10 > 0 && j10 < 4194304000L) {
                        sb2.append(" (");
                        sb2.append(AndroidUtilities.formatFileSize(this.limitVideo, true, false));
                        sb2.append(")");
                    }
                }
            } else {
                sb2.append(LocaleController.getString(R.string.SaveToGalleryOff));
            }
            LongSparseArray<DialogException> saveGalleryExceptions = UserConfig.getInstance(i9).getSaveGalleryExceptions(this.type);
            if (saveGalleryExceptions.size() != 0) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(LocaleController.formatPluralString("Exception", saveGalleryExceptions.size(), Integer.valueOf(saveGalleryExceptions.size())));
            }
            return sb2;
        }

        @Override
        public void toggle() {
            super.toggle();
            SaveToGallerySettingsHelper.saveSettings(this.type);
        }
    }

    public static Settings getSettings(int i9) {
        if (i9 == 1) {
            return user;
        }
        if (i9 == 2) {
            return groups;
        }
        if (i9 == 4) {
            return channels;
        }
        return null;
    }

    public static void load(SharedPreferences sharedPreferences) {
        int i9;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (sharedPreferences.getBoolean("save_gallery", false) && BuildVars.NO_SCOPED_STORAGE) {
            i9 = 7;
        } else {
            i9 = sharedPreferences.getInt("save_gallery_flags", -1);
        }
        if (i9 != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            SharedSettings sharedSettings = new SharedSettings();
            user = sharedSettings;
            if ((i9 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sharedSettings.saveVideo = z10;
            sharedSettings.savePhoto = z10;
            sharedSettings.limitVideo = 104857600L;
            sharedSettings.save("user", sharedPreferences);
            SharedSettings sharedSettings2 = new SharedSettings();
            groups = sharedSettings2;
            SharedSettings sharedSettings3 = user;
            if ((i9 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            sharedSettings3.saveVideo = z11;
            sharedSettings2.savePhoto = z11;
            sharedSettings2.limitVideo = 104857600L;
            sharedSettings2.save("groups", sharedPreferences);
            SharedSettings sharedSettings4 = new SharedSettings();
            channels = sharedSettings4;
            if ((i9 & 4) != 0) {
                z12 = true;
            }
            sharedSettings4.saveVideo = z12;
            sharedSettings4.savePhoto = z12;
            sharedSettings4.limitVideo = 104857600L;
            sharedSettings4.save("channels", sharedPreferences);
        } else {
            user = SharedSettings.read("user", sharedPreferences);
            groups = SharedSettings.read("groups", sharedPreferences);
            channels = SharedSettings.read("channels", sharedPreferences);
        }
        user.type = 1;
        groups.type = 2;
        channels.type = 4;
    }

    public static LongSparseArray<DialogException> loadExceptions(SharedPreferences sharedPreferences) {
        LongSparseArray<DialogException> longSparseArray = new LongSparseArray<>();
        int i9 = sharedPreferences.getInt("count", 0);
        for (int i10 = 0; i10 < i9; i10++) {
            DialogException dialogException = new DialogException();
            dialogException.dialogId = sharedPreferences.getLong(i10 + "_dialog_id", 0L);
            dialogException.savePhoto = sharedPreferences.getBoolean(i10 + "_photo", false);
            dialogException.saveVideo = sharedPreferences.getBoolean(i10 + "_video", false);
            dialogException.limitVideo = sharedPreferences.getLong(i10 + "_limitVideo", 104857600L);
            long j10 = dialogException.dialogId;
            if (j10 != 0) {
                longSparseArray.put(j10, dialogException);
            }
        }
        return longSparseArray;
    }

    public static boolean needSave(int i9, FilePathDatabase.FileMeta fileMeta, MessageObject messageObject, int i10) {
        SharedSettings sharedSettings;
        if (i9 == 1) {
            sharedSettings = user;
        } else if (i9 == 4) {
            sharedSettings = channels;
        } else if (i9 == 2) {
            sharedSettings = groups;
        } else {
            return false;
        }
        return sharedSettings.needSave(fileMeta, messageObject, i10);
    }

    public static void saveExceptions(SharedPreferences sharedPreferences, LongSparseArray<DialogException> longSparseArray) {
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", longSparseArray.size());
        for (int i9 = 0; i9 < longSparseArray.size(); i9++) {
            DialogException valueAt = longSparseArray.valueAt(i9);
            edit.putLong(ta.b.c(i9, "_dialog_id"), valueAt.dialogId);
            edit.putBoolean(i9 + "_photo", valueAt.savePhoto);
            edit.putBoolean(i9 + "_video", valueAt.saveVideo);
            edit.putLong(i9 + "_limitVideo", valueAt.limitVideo);
        }
        edit.apply();
    }

    public static void saveSettings(int i9) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        if (i9 == 1) {
            user.save("user", sharedPreferences);
        } else if (i9 == 2) {
            groups.save("groups", sharedPreferences);
        } else if (i9 == 4) {
            channels.save("channels", sharedPreferences);
        }
    }
}
