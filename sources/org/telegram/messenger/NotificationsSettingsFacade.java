package org.telegram.messenger;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.RingtoneManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public class NotificationsSettingsFacade {
    public static final String PROPERTY_CONTENT_PREVIEW = "content_preview_";
    public static final String PROPERTY_CUSTOM = "custom_";
    public static final String PROPERTY_NOTIFY = "notify2_";
    public static final String PROPERTY_NOTIFY_UNTIL = "notifyuntil_";
    public static final String PROPERTY_SILENT = "silent_";
    public static final String PROPERTY_STORIES_NOTIFY = "stories_";
    private final int currentAccount;

    public NotificationsSettingsFacade(int i10) {
        this.currentAccount = i10;
    }

    private SharedPreferences getPreferences() {
        return MessagesController.getNotificationsSettings(this.currentAccount);
    }

    public void lambda$applyDialogNotificationsSettings$0() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    public void lambda$applyDialogNotificationsSettings$1(long j10, long j11, TLRPC.PeerNotifySettings peerNotifySettings) {
        boolean z10;
        int i10;
        int i11;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11, true);
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        NotificationsController notificationsController = NotificationsController.getInstance(this.currentAccount);
        int iC = y1.c("notify2_", sharedPrefKey, getPreferences(), -1);
        boolean z11 = true;
        int iC2 = y1.c("notifyuntil_", sharedPrefKey, getPreferences(), 0);
        SharedPreferences.Editor editorEdit = getPreferences().edit();
        if ((peerNotifySettings.flags & 2) != 0) {
            editorEdit.putBoolean(s3.c.e("silent_", sharedPrefKey), peerNotifySettings.silent);
        } else {
            editorEdit.remove("silent_" + sharedPrefKey);
        }
        if ((peerNotifySettings.flags & 64) != 0) {
            editorEdit.putBoolean(s3.c.e("stories_", sharedPrefKey), !peerNotifySettings.stories_muted);
        } else {
            editorEdit.remove("stories_" + sharedPrefKey);
        }
        TLRPC.Dialog dialog = j11 == 0 ? (TLRPC.Dialog) messagesController.dialogs_dict.f(j10) : null;
        if (dialog != null) {
            dialog.notify_settings = peerNotifySettings;
        }
        if ((peerNotifySettings.flags & 4) == 0) {
            boolean z12 = true;
            if (iC != -1) {
                if (dialog != null) {
                    dialog.notify_settings.mute_until = 0;
                }
                editorEdit.remove("notify2_" + sharedPrefKey);
            } else {
                z12 = false;
            }
            if (j11 == 0) {
                messagesStorage.setDialogFlags(j10, 0L);
            }
            z11 = z12;
        } else if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
            if (peerNotifySettings.mute_until <= connectionsManager.getCurrentTime() + 31536000) {
                if (iC == 3 && iC2 == peerNotifySettings.mute_until) {
                    z11 = false;
                } else {
                    editorEdit.putInt("notify2_" + sharedPrefKey, 3);
                    editorEdit.putInt("notifyuntil_" + sharedPrefKey, peerNotifySettings.mute_until);
                    if (dialog != null) {
                        dialog.notify_settings.mute_until = 0;
                    }
                }
                i11 = peerNotifySettings.mute_until;
            } else if (iC != 2) {
                editorEdit.putInt("notify2_" + sharedPrefKey, 2);
                if (dialog != null) {
                    dialog.notify_settings.mute_until = Integer.MAX_VALUE;
                }
                i11 = 0;
            } else {
                i11 = 0;
                z11 = false;
            }
            if (j11 == 0) {
                messagesStorage.setDialogFlags(j10, (((long) i11) << 32) | 1);
                notificationsController.removeNotificationsForDialog(j10);
            }
        } else {
            if (iC == 0 || iC == 1) {
                z10 = false;
            } else {
                if (dialog != null) {
                    TLRPC.PeerNotifySettings peerNotifySettings2 = dialog.notify_settings;
                    i10 = 0;
                    peerNotifySettings2.mute_until = 0;
                } else {
                    i10 = 0;
                }
                editorEdit.putInt("notify2_" + sharedPrefKey, i10);
                z10 = true;
            }
            if (j11 == 0) {
                messagesStorage.setDialogFlags(j10, 0L);
            }
            z11 = z10;
        }
        applySoundSettings(peerNotifySettings.android_sound, editorEdit, j10, j11, 0, false);
        editorEdit.apply();
        if (z11) {
            AndroidUtilities.runOnUIThread(new rg(this, 2));
        }
    }

    public void applyDialogNotificationsSettings(long j10, long j11, TLRPC.PeerNotifySettings peerNotifySettings) {
        if (peerNotifySettings == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new e5.w(this, j10, j11, peerNotifySettings, 10));
    }

    public void applySoundSettings(TLRPC.NotificationSound notificationSound, SharedPreferences.Editor editor, long j10, long j11, int i10, boolean z10) {
        String strE;
        String strE2;
        String strE3;
        int i11;
        TLRPC.NotificationSound tL_notificationSoundNone;
        String str;
        if (notificationSound == null) {
            return;
        }
        int i12 = 1;
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11, true);
            strE = s3.c.e("sound_", sharedPrefKey);
            strE3 = s3.c.e("sound_path_", sharedPrefKey);
            strE2 = s3.c.e("sound_document_id_", sharedPrefKey);
        } else if (i10 == 0) {
            strE = "GroupSound";
            strE2 = "GroupSoundDocId";
            strE3 = "GroupSoundPath";
        } else if (i10 == 3) {
            strE = "StoriesSound";
            strE2 = "StoriesSoundDocId";
            strE3 = "StoriesSoundPath";
        } else if (i10 == 1) {
            strE = "GlobalSound";
            strE2 = "GlobalSoundDocId";
            strE3 = "GlobalSoundPath";
        } else if (i10 == 4 || i10 == 5) {
            strE = "ReactionSound";
            strE2 = "ReactionSoundDocId";
            strE3 = "ReactionSoundPath";
        } else {
            strE = "ChannelSound";
            strE2 = "ChannelSoundDocId";
            strE3 = "ChannelSoundPath";
        }
        String str2 = strE3;
        String str3 = strE;
        String str4 = strE2;
        if (notificationSound instanceof TLRPC.TL_notificationSoundLocal) {
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = (TLRPC.TL_notificationSoundLocal) notificationSound;
            if ("Default".equalsIgnoreCase(tL_notificationSoundLocal.data)) {
                tL_notificationSoundNone = new TLRPC.TL_notificationSoundDefault();
            } else if ("NoSound".equalsIgnoreCase(tL_notificationSoundLocal.data)) {
                tL_notificationSoundNone = new TLRPC.TL_notificationSoundNone();
            } else {
                String str5 = tL_notificationSoundLocal.title;
                if (str5 == null) {
                    i11 = i13;
                    str = null;
                } else {
                    try {
                        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
                        ringtoneManager.setType(2);
                        Cursor cursor = ringtoneManager.getCursor();
                        while (true) {
                            if (cursor.moveToNext()) {
                                String string = cursor.getString(i12);
                                StringBuilder sb2 = new StringBuilder();
                                i11 = i13;
                                try {
                                    sb2.append(cursor.getString(2));
                                    sb2.append("/");
                                    sb2.append(cursor.getString(0));
                                    String string2 = sb2.toString();
                                    if (str5.equalsIgnoreCase(string)) {
                                        str = string2;
                                    } else {
                                        i13 = i11;
                                        i12 = 1;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    FileLog.e(th);
                                    str = null;
                                }
                            } else {
                                i11 = i13;
                                str = null;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i11 = i13;
                    }
                }
                if (str == null) {
                    return;
                } else {
                    tL_notificationSoundLocal.data = str;
                }
            }
            i11 = i13;
            if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundDefault) {
                editor.putString(str3, "Default");
                editor.putString(str2, "Default");
                editor.remove(str4);
                return;
            }
            if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundNone) {
                editor.putString(str3, "NoSound");
                editor.putString(str2, "NoSound");
                editor.remove(str4);
                return;
            }
            if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundLocal) {
                TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal2 = (TLRPC.TL_notificationSoundLocal) tL_notificationSoundNone;
                editor.putString(str3, tL_notificationSoundLocal2.title);
                editor.putString(str2, tL_notificationSoundLocal2.data);
                editor.remove(str4);
                return;
            }
            if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundRingtone) {
                TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = (TLRPC.TL_notificationSoundRingtone) tL_notificationSoundNone;
                editor.putLong(str4, tL_notificationSoundRingtone.f22505id);
                MediaDataController.getInstance(this.currentAccount).checkRingtones(true);
                if (z10 && i11 != 0) {
                    editor.putBoolean("custom_" + j10, true);
                }
                MediaDataController.getInstance(this.currentAccount).ringtoneDataStore.c(tL_notificationSoundRingtone.f22505id);
            }
        }
        i11 = i13;
        tL_notificationSoundNone = notificationSound;
        if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundDefault) {
            editor.putString(str3, "Default");
            editor.putString(str2, "Default");
            editor.remove(str4);
            return;
        }
        if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundNone) {
            editor.putString(str3, "NoSound");
            editor.putString(str2, "NoSound");
            editor.remove(str4);
            return;
        }
        if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundLocal) {
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal3 = (TLRPC.TL_notificationSoundLocal) tL_notificationSoundNone;
            editor.putString(str3, tL_notificationSoundLocal3.title);
            editor.putString(str2, tL_notificationSoundLocal3.data);
            editor.remove(str4);
            return;
        }
        if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundRingtone) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone2 = (TLRPC.TL_notificationSoundRingtone) tL_notificationSoundNone;
            editor.putLong(str4, tL_notificationSoundRingtone2.f22505id);
            MediaDataController.getInstance(this.currentAccount).checkRingtones(true);
            if (z10) {
                editor.putBoolean("custom_" + j10, true);
            }
            MediaDataController.getInstance(this.currentAccount).ringtoneDataStore.c(tL_notificationSoundRingtone2.f22505id);
        }
    }

    public void clearPreference(long j10, long j11) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11, true);
        getPreferences().edit().remove("notify2_" + sharedPrefKey).remove("custom_" + sharedPrefKey).remove("notifyuntil_" + sharedPrefKey).remove("content_preview_" + sharedPrefKey).remove("silent_" + sharedPrefKey).remove("stories_" + sharedPrefKey).apply();
    }

    public int getProperty(String str, long j10, long j11, int i10) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11, true);
        if (getPreferences().contains(str + sharedPrefKey)) {
            return getPreferences().getInt(str + sharedPrefKey, i10);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j10, 0L, true);
        return getPreferences().getInt(str + sharedPrefKey2, i10);
    }

    public String getPropertyString(String str, long j10, long j11, String str2) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        if (getPreferences().contains(str + sharedPrefKey)) {
            return getPreferences().getString(str + sharedPrefKey, str2);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j10, 0L);
        return getPreferences().getString(str + sharedPrefKey2, str2);
    }

    public boolean isDefault(long j10, long j11) {
        NotificationsController.getSharedPrefKey(j10, j11, true);
        return false;
    }

    public void removeProperty(String str, long j10, long j11) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        getPreferences().edit().remove(str + sharedPrefKey).apply();
    }

    public void setSettingsForDialog(SharedPreferences.Editor editor, TLRPC.Dialog dialog, TLRPC.PeerNotifySettings peerNotifySettings) {
        long peerId = MessageObject.getPeerId(dialog.peer);
        if ((dialog.notify_settings.flags & 2) != 0) {
            editor.putBoolean(a9.p.l(peerId, "silent_"), dialog.notify_settings.silent);
        } else {
            editor.remove("silent_" + peerId);
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        TLRPC.PeerNotifySettings peerNotifySettings2 = dialog.notify_settings;
        if ((peerNotifySettings2.flags & 4) == 0) {
            editor.remove("notify2_" + peerId);
            return;
        }
        if (peerNotifySettings2.mute_until <= connectionsManager.getCurrentTime()) {
            editor.putInt("notify2_" + peerId, 0);
        } else {
            if (dialog.notify_settings.mute_until > connectionsManager.getCurrentTime() + 31536000) {
                editor.putInt("notify2_" + peerId, 2);
                dialog.notify_settings.mute_until = Integer.MAX_VALUE;
                return;
            }
            editor.putInt("notify2_" + peerId, 3);
            editor.putInt(a9.p.l(peerId, "notifyuntil_"), dialog.notify_settings.mute_until);
        }
    }

    public long getProperty(String str, long j10, long j11, long j12) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11, true);
        if (getPreferences().contains(str + sharedPrefKey)) {
            return getPreferences().getLong(str + sharedPrefKey, j12);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j10, 0L, true);
        return getPreferences().getLong(str + sharedPrefKey2, j12);
    }

    public boolean getProperty(String str, long j10, long j11, boolean z10) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        if (getPreferences().contains(str + sharedPrefKey)) {
            return getPreferences().getBoolean(str + sharedPrefKey, z10);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j10, 0L);
        return getPreferences().getBoolean(str + sharedPrefKey2, z10);
    }
}
