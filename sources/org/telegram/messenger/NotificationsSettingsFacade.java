package org.telegram.messenger;

import android.content.SharedPreferences;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsSoundActivity;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda199;

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
        int i3 = getPreferences().getInt("notify2_" + sharedPrefKey, -1);
        int i4 = getPreferences().getInt("notifyuntil_" + sharedPrefKey, 0);
        SharedPreferences.Editor editorEdit = getPreferences().edit();
        if ((peerNotifySettings.flags & 2) != 0) {
            editorEdit.putBoolean(zzii.m("silent_", sharedPrefKey), peerNotifySettings.silent);
        } else {
            editorEdit.remove("silent_" + sharedPrefKey);
        }
        if ((peerNotifySettings.flags & 64) != 0) {
            editorEdit.putBoolean(zzii.m("stories_", sharedPrefKey), !peerNotifySettings.stories_muted);
        } else {
            editorEdit.remove("stories_" + sharedPrefKey);
        }
        TLRPC.Dialog dialog = j2 == 0 ? (TLRPC.Dialog) messagesController.dialogs_dict.get(j) : null;
        if (dialog != null) {
            dialog.notify_settings = peerNotifySettings;
        }
        if ((peerNotifySettings.flags & 4) == 0) {
            z = true;
            if (i3 != -1) {
                if (dialog != null) {
                    dialog.notify_settings.mute_until = 0;
                }
                editorEdit.remove("notify2_" + sharedPrefKey);
            } else {
                z = false;
            }
            if (j2 == 0) {
                messagesStorage.setDialogFlags(j, 0L);
            }
        } else if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
            if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime() + 31536000) {
                if (i3 != 2) {
                    editorEdit.putInt("notify2_" + sharedPrefKey, 2);
                    if (dialog != null) {
                        dialog.notify_settings.mute_until = Integer.MAX_VALUE;
                    }
                    z = true;
                } else {
                    z = false;
                }
                i2 = 0;
            } else {
                if (i3 == 3 && i4 == peerNotifySettings.mute_until) {
                    z = false;
                } else {
                    editorEdit.putInt("notify2_" + sharedPrefKey, 3);
                    editorEdit.putInt("notifyuntil_" + sharedPrefKey, peerNotifySettings.mute_until);
                    if (dialog != null) {
                        dialog.notify_settings.mute_until = 0;
                    }
                    z = true;
                }
                i2 = peerNotifySettings.mute_until;
            }
            if (j2 == 0) {
                messagesStorage.setDialogFlags(j, (((long) i2) << 32) | 1);
                notificationsController.removeNotificationsForDialog(j);
            }
        } else {
            if (i3 != 0) {
                z = true;
                if (i3 != 1) {
                    if (dialog != null) {
                        i = 0;
                        dialog.notify_settings.mute_until = 0;
                    } else {
                        i = 0;
                    }
                    editorEdit.putInt("notify2_" + sharedPrefKey, i);
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (j2 == 0) {
                messagesStorage.setDialogFlags(j, 0L);
            }
        }
        boolean z2 = z;
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
        Utilities.globalQueue.postRunnable(new StarGiftSheet$$ExternalSyntheticLambda199(this, j, j2, peerNotifySettings, 9));
    }

    public void applySoundSettings(TLRPC.NotificationSound notificationSound, SharedPreferences.Editor editor, long j, long j2, int i, boolean z) {
        String strM;
        String strM2;
        String strM3;
        if (notificationSound == null) {
            return;
        }
        if (j != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2, true);
            strM = zzii.m("sound_", sharedPrefKey);
            strM3 = zzii.m("sound_path_", sharedPrefKey);
            strM2 = zzii.m("sound_document_id_", sharedPrefKey);
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
        if (notificationSound instanceof TLRPC.TL_notificationSoundLocal) {
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = (TLRPC.TL_notificationSoundLocal) notificationSound;
            if ("Default".equalsIgnoreCase(tL_notificationSoundLocal.data)) {
                notificationSound = new TLRPC.TL_notificationSoundDefault();
            } else if ("NoSound".equalsIgnoreCase(tL_notificationSoundLocal.data)) {
                notificationSound = new TLRPC.TL_notificationSoundNone();
            } else {
                String strFindRingtonePathByName = NotificationsSoundActivity.findRingtonePathByName(tL_notificationSoundLocal.title);
                if (strFindRingtonePathByName == null) {
                    return;
                } else {
                    tL_notificationSoundLocal.data = strFindRingtonePathByName;
                }
            }
        }
        if (notificationSound instanceof TLRPC.TL_notificationSoundDefault) {
            editor.putString(strM, "Default");
            editor.putString(strM3, "Default");
            editor.remove(strM2);
            return;
        }
        if (notificationSound instanceof TLRPC.TL_notificationSoundNone) {
            editor.putString(strM, "NoSound");
            editor.putString(strM3, "NoSound");
            editor.remove(strM2);
            return;
        }
        if (notificationSound instanceof TLRPC.TL_notificationSoundLocal) {
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal2 = (TLRPC.TL_notificationSoundLocal) notificationSound;
            editor.putString(strM, tL_notificationSoundLocal2.title);
            editor.putString(strM3, tL_notificationSoundLocal2.data);
            editor.remove(strM2);
            return;
        }
        if (notificationSound instanceof TLRPC.TL_notificationSoundRingtone) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = (TLRPC.TL_notificationSoundRingtone) notificationSound;
            editor.putLong(strM2, tL_notificationSoundRingtone.id);
            MediaDataController.getInstance(this.currentAccount).checkRingtones(true);
            if (z && j != 0) {
                editor.putBoolean("custom_" + j, true);
            }
            MediaDataController.getInstance(this.currentAccount).ringtoneDataStore.getDocument(tL_notificationSoundRingtone.id);
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
