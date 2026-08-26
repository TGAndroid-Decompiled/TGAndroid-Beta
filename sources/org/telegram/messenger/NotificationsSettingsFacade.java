package org.telegram.messenger;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.RingtoneManager;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda37;

public class NotificationsSettingsFacade {
    public static final String PROPERTY_CONTENT_PREVIEW = "content_preview_";
    public static final String PROPERTY_CUSTOM = "custom_";
    public static final String PROPERTY_NOTIFY = "notify2_";
    public static final String PROPERTY_NOTIFY_UNTIL = "notifyuntil_";
    public static final String PROPERTY_SILENT = "silent_";
    public static final String PROPERTY_STORIES_NOTIFY = "stories_";
    private final int currentAccount;

    public NotificationsSettingsFacade(int i) {
        this.currentAccount = i;
    }

    private SharedPreferences getPreferences() {
        return MessagesController.getNotificationsSettings(this.currentAccount);
    }

    public void lambda$applyDialogNotificationsSettings$0() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    public void lambda$applyDialogNotificationsSettings$1(long j, long j2, TLRPC.PeerNotifySettings peerNotifySettings) {
        boolean z;
        int i;
        int i2;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2, true);
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        NotificationsController notificationsController = NotificationsController.getInstance(this.currentAccount);
        int iM = ArticleViewer.IBlock.CC.m("notify2_", sharedPrefKey, getPreferences(), -1);
        boolean z2 = true;
        int iM2 = ArticleViewer.IBlock.CC.m("notifyuntil_", sharedPrefKey, getPreferences(), 0);
        SharedPreferences.Editor editorEdit = getPreferences().edit();
        if ((peerNotifySettings.flags & 2) != 0) {
            editorEdit.putBoolean(zzil.m("silent_", sharedPrefKey), peerNotifySettings.silent);
        } else {
            editorEdit.remove("silent_" + sharedPrefKey);
        }
        if ((peerNotifySettings.flags & 64) != 0) {
            editorEdit.putBoolean(zzil.m("stories_", sharedPrefKey), !peerNotifySettings.stories_muted);
        } else {
            editorEdit.remove("stories_" + sharedPrefKey);
        }
        TLRPC.Dialog dialog = j2 == 0 ? (TLRPC.Dialog) messagesController.dialogs_dict.get(j) : null;
        if (dialog != null) {
            dialog.notify_settings = peerNotifySettings;
        }
        if ((peerNotifySettings.flags & 4) == 0) {
            boolean z3 = true;
            if (iM != -1) {
                if (dialog != null) {
                    dialog.notify_settings.mute_until = 0;
                }
                editorEdit.remove("notify2_" + sharedPrefKey);
            } else {
                z3 = false;
            }
            if (j2 == 0) {
                messagesStorage.setDialogFlags(j, 0L);
            }
            z2 = z3;
        } else if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
            if (peerNotifySettings.mute_until <= connectionsManager.getCurrentTime() + 31536000) {
                if (iM == 3 && iM2 == peerNotifySettings.mute_until) {
                    z2 = false;
                } else {
                    editorEdit.putInt("notify2_" + sharedPrefKey, 3);
                    editorEdit.putInt("notifyuntil_" + sharedPrefKey, peerNotifySettings.mute_until);
                    if (dialog != null) {
                        dialog.notify_settings.mute_until = 0;
                    }
                }
                i2 = peerNotifySettings.mute_until;
            } else if (iM != 2) {
                editorEdit.putInt("notify2_" + sharedPrefKey, 2);
                if (dialog != null) {
                    dialog.notify_settings.mute_until = Integer.MAX_VALUE;
                }
                i2 = 0;
            } else {
                i2 = 0;
                z2 = false;
            }
            if (j2 == 0) {
                messagesStorage.setDialogFlags(j, (((long) i2) << 32) | 1);
                notificationsController.removeNotificationsForDialog(j);
            }
        } else {
            if (iM == 0 || iM == 1) {
                z = false;
            } else {
                if (dialog != null) {
                    TLRPC.PeerNotifySettings peerNotifySettings2 = dialog.notify_settings;
                    i = 0;
                    peerNotifySettings2.mute_until = 0;
                } else {
                    i = 0;
                }
                editorEdit.putInt("notify2_" + sharedPrefKey, i);
                z = true;
            }
            if (j2 == 0) {
                messagesStorage.setDialogFlags(j, 0L);
            }
            z2 = z;
        }
        applySoundSettings(peerNotifySettings.android_sound, editorEdit, j, j2, 0, false);
        editorEdit.apply();
        if (z2) {
            AndroidUtilities.runOnUIThread(new SecretChatHelper$$ExternalSyntheticLambda22(this, 3));
        }
    }

    public void applyDialogNotificationsSettings(long j, long j2, TLRPC.PeerNotifySettings peerNotifySettings) {
        if (peerNotifySettings == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new LaunchActivity$$ExternalSyntheticLambda37(7, j, j2, this, peerNotifySettings));
    }

    public void applySoundSettings(TLRPC.NotificationSound notificationSound, SharedPreferences.Editor editor, long j, long j2, int i, boolean z) {
        String strM;
        String strM2;
        String strM3;
        int i2;
        TLRPC.NotificationSound tL_notificationSoundNone;
        String string;
        if (notificationSound == null) {
            return;
        }
        int i3 = 1;
        int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i4 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2, true);
            strM = zzil.m("sound_", sharedPrefKey);
            strM3 = zzil.m("sound_path_", sharedPrefKey);
            strM2 = zzil.m("sound_document_id_", sharedPrefKey);
        } else if (i == 0) {
            strM = "GroupSound";
            strM2 = "GroupSoundDocId";
            strM3 = "GroupSoundPath";
        } else if (i == 3) {
            strM = "StoriesSound";
            strM2 = "StoriesSoundDocId";
            strM3 = "StoriesSoundPath";
        } else if (i == 1) {
            strM = "GlobalSound";
            strM2 = "GlobalSoundDocId";
            strM3 = "GlobalSoundPath";
        } else if (i == 4 || i == 5) {
            strM = "ReactionSound";
            strM2 = "ReactionSoundDocId";
            strM3 = "ReactionSoundPath";
        } else {
            strM = "ChannelSound";
            strM2 = "ChannelSoundDocId";
            strM3 = "ChannelSoundPath";
        }
        String str = strM3;
        String str2 = strM;
        String str3 = strM2;
        if (notificationSound instanceof TLRPC.TL_notificationSoundLocal) {
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = (TLRPC.TL_notificationSoundLocal) notificationSound;
            if ("Default".equalsIgnoreCase(tL_notificationSoundLocal.data)) {
                tL_notificationSoundNone = new TLRPC.TL_notificationSoundDefault();
            } else if ("NoSound".equalsIgnoreCase(tL_notificationSoundLocal.data)) {
                tL_notificationSoundNone = new TLRPC.TL_notificationSoundNone();
            } else {
                String str4 = tL_notificationSoundLocal.title;
                if (str4 == null) {
                    i2 = i4;
                    string = null;
                } else {
                    try {
                        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
                        ringtoneManager.setType(2);
                        Cursor cursor = ringtoneManager.getCursor();
                        while (true) {
                            if (cursor.moveToNext()) {
                                String string2 = cursor.getString(i3);
                                StringBuilder sb = new StringBuilder();
                                i2 = i4;
                                try {
                                    sb.append(cursor.getString(2));
                                    sb.append("/");
                                    sb.append(cursor.getString(0));
                                    string = sb.toString();
                                    if (!str4.equalsIgnoreCase(string2)) {
                                        i4 = i2;
                                        i3 = 1;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    FileLog.e(th);
                                    string = null;
                                }
                            } else {
                                i2 = i4;
                                string = null;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i2 = i4;
                    }
                }
                if (string == null) {
                    return;
                } else {
                    tL_notificationSoundLocal.data = string;
                }
            }
            i2 = i4;
            if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundDefault) {
                editor.putString(str2, "Default");
                editor.putString(str, "Default");
                editor.remove(str3);
                return;
            }
            if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundNone) {
                editor.putString(str2, "NoSound");
                editor.putString(str, "NoSound");
                editor.remove(str3);
                return;
            }
            if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundLocal) {
                TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal2 = (TLRPC.TL_notificationSoundLocal) tL_notificationSoundNone;
                editor.putString(str2, tL_notificationSoundLocal2.title);
                editor.putString(str, tL_notificationSoundLocal2.data);
                editor.remove(str3);
                return;
            }
            if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundRingtone) {
                TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = (TLRPC.TL_notificationSoundRingtone) tL_notificationSoundNone;
                editor.putLong(str3, tL_notificationSoundRingtone.id);
                MediaDataController.getInstance(this.currentAccount).checkRingtones(true);
                if (z && i2 != 0) {
                    editor.putBoolean("custom_" + j, true);
                }
                MediaDataController.getInstance(this.currentAccount).ringtoneDataStore.getDocument(tL_notificationSoundRingtone.id);
            }
        }
        i2 = i4;
        tL_notificationSoundNone = notificationSound;
        if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundDefault) {
            editor.putString(str2, "Default");
            editor.putString(str, "Default");
            editor.remove(str3);
            return;
        }
        if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundNone) {
            editor.putString(str2, "NoSound");
            editor.putString(str, "NoSound");
            editor.remove(str3);
            return;
        }
        if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundLocal) {
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal3 = (TLRPC.TL_notificationSoundLocal) tL_notificationSoundNone;
            editor.putString(str2, tL_notificationSoundLocal3.title);
            editor.putString(str, tL_notificationSoundLocal3.data);
            editor.remove(str3);
            return;
        }
        if (tL_notificationSoundNone instanceof TLRPC.TL_notificationSoundRingtone) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone2 = (TLRPC.TL_notificationSoundRingtone) tL_notificationSoundNone;
            editor.putLong(str3, tL_notificationSoundRingtone2.id);
            MediaDataController.getInstance(this.currentAccount).checkRingtones(true);
            if (z) {
                editor.putBoolean("custom_" + j, true);
            }
            MediaDataController.getInstance(this.currentAccount).ringtoneDataStore.getDocument(tL_notificationSoundRingtone2.id);
        }
    }

    public void clearPreference(long j, long j2) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2, true);
        getPreferences().edit().remove("notify2_" + sharedPrefKey).remove("custom_" + sharedPrefKey).remove("notifyuntil_" + sharedPrefKey).remove("content_preview_" + sharedPrefKey).remove("silent_" + sharedPrefKey).remove("stories_" + sharedPrefKey).apply();
    }

    public int getProperty(String str, long j, long j2, int i) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2, true);
        if (getPreferences().contains(str + sharedPrefKey)) {
            return getPreferences().getInt(str + sharedPrefKey, i);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j, 0L, true);
        return getPreferences().getInt(str + sharedPrefKey2, i);
    }

    public String getPropertyString(String str, long j, long j2, String str2) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2);
        if (getPreferences().contains(str + sharedPrefKey)) {
            return getPreferences().getString(str + sharedPrefKey, str2);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j, 0L);
        return getPreferences().getString(str + sharedPrefKey2, str2);
    }

    public boolean isDefault(long j, long j2) {
        NotificationsController.getSharedPrefKey(j, j2, true);
        return false;
    }

    public void removeProperty(String str, long j, long j2) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2);
        getPreferences().edit().remove(str + sharedPrefKey).apply();
    }

    public void setSettingsForDialog(SharedPreferences.Editor editor, TLRPC.Dialog dialog, TLRPC.PeerNotifySettings peerNotifySettings) {
        long peerId = MessageObject.getPeerId(dialog.peer);
        if ((dialog.notify_settings.flags & 2) != 0) {
            editor.putBoolean(Log.m(peerId, "silent_"), dialog.notify_settings.silent);
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
            editor.putInt(Log.m(peerId, "notifyuntil_"), dialog.notify_settings.mute_until);
        }
    }

    public long getProperty(String str, long j, long j2, long j3) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2, true);
        if (getPreferences().contains(str + sharedPrefKey)) {
            return getPreferences().getLong(str + sharedPrefKey, j3);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j, 0L, true);
        return getPreferences().getLong(str + sharedPrefKey2, j3);
    }

    public boolean getProperty(String str, long j, long j2, boolean z) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2);
        if (getPreferences().contains(str + sharedPrefKey)) {
            return getPreferences().getBoolean(str + sharedPrefKey, z);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j, 0L);
        return getPreferences().getBoolean(str + sharedPrefKey2, z);
    }
}
