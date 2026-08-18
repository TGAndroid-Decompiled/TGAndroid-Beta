package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsSoundActivity;

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

    public boolean isDefault(long j, long j2) {
        NotificationsController.getSharedPrefKey(j, j2, true);
        return false;
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

    public String getPropertyString(String str, long j, long j2, String str2) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2);
        if (getPreferences().contains(str + sharedPrefKey)) {
            return getPreferences().getString(str + sharedPrefKey, str2);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j, 0L);
        return getPreferences().getString(str + sharedPrefKey2, str2);
    }

    public void removeProperty(String str, long j, long j2) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2);
        getPreferences().edit().remove(str + sharedPrefKey).apply();
    }

    private SharedPreferences getPreferences() {
        return MessagesController.getNotificationsSettings(this.currentAccount);
    }

    public void applyDialogNotificationsSettings(final long j, final long j2, final TLRPC.PeerNotifySettings peerNotifySettings) {
        if (peerNotifySettings == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$applyDialogNotificationsSettings$1(j, j2, peerNotifySettings);
            }
        });
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
            editorEdit.putBoolean("silent_" + sharedPrefKey, peerNotifySettings.silent);
        } else {
            editorEdit.remove("silent_" + sharedPrefKey);
        }
        if ((peerNotifySettings.flags & 64) != 0) {
            editorEdit.putBoolean("stories_" + sharedPrefKey, !peerNotifySettings.stories_muted);
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$applyDialogNotificationsSettings$0();
                }
            });
        }
    }

    public void lambda$applyDialogNotificationsSettings$0() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    public void applySoundSettings(TLRPC.NotificationSound notificationSound, SharedPreferences.Editor editor, long j, long j2, int i, boolean z) {
        String str;
        String str2;
        String str3;
        if (notificationSound == null) {
            return;
        }
        if (j != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2, true);
            str = "sound_" + sharedPrefKey;
            str3 = "sound_path_" + sharedPrefKey;
            str2 = "sound_document_id_" + sharedPrefKey;
        } else if (i == 0) {
            str = "GroupSound";
            str2 = "GroupSoundDocId";
            str3 = "GroupSoundPath";
        } else if (i == 3) {
            str = "StoriesSound";
            str2 = "StoriesSoundDocId";
            str3 = "StoriesSoundPath";
        } else if (i == 1) {
            str = "GlobalSound";
            str2 = "GlobalSoundDocId";
            str3 = "GlobalSoundPath";
        } else if (i == 4 || i == 5) {
            str = "ReactionSound";
            str2 = "ReactionSoundDocId";
            str3 = "ReactionSoundPath";
        } else {
            str = "ChannelSound";
            str2 = "ChannelSoundDocId";
            str3 = "ChannelSoundPath";
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
            editor.putString(str, "Default");
            editor.putString(str3, "Default");
            editor.remove(str2);
            return;
        }
        if (notificationSound instanceof TLRPC.TL_notificationSoundNone) {
            editor.putString(str, "NoSound");
            editor.putString(str3, "NoSound");
            editor.remove(str2);
            return;
        }
        if (notificationSound instanceof TLRPC.TL_notificationSoundLocal) {
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal2 = (TLRPC.TL_notificationSoundLocal) notificationSound;
            editor.putString(str, tL_notificationSoundLocal2.title);
            editor.putString(str3, tL_notificationSoundLocal2.data);
            editor.remove(str2);
            return;
        }
        if (notificationSound instanceof TLRPC.TL_notificationSoundRingtone) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = (TLRPC.TL_notificationSoundRingtone) notificationSound;
            editor.putLong(str2, tL_notificationSoundRingtone.id);
            MediaDataController.getInstance(this.currentAccount).checkRingtones(true);
            if (z && j != 0) {
                editor.putBoolean("custom_" + j, true);
            }
            MediaDataController.getInstance(this.currentAccount).ringtoneDataStore.getDocument(tL_notificationSoundRingtone.id);
        }
    }

    public void setSettingsForDialog(SharedPreferences.Editor editor, TLRPC.Dialog dialog, TLRPC.PeerNotifySettings peerNotifySettings) {
        long peerId = MessageObject.getPeerId(dialog.peer);
        if ((dialog.notify_settings.flags & 2) != 0) {
            editor.putBoolean("silent_" + peerId, dialog.notify_settings.silent);
        } else {
            editor.remove("silent_" + peerId);
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        TLRPC.PeerNotifySettings peerNotifySettings2 = dialog.notify_settings;
        if ((peerNotifySettings2.flags & 4) != 0) {
            if (peerNotifySettings2.mute_until > connectionsManager.getCurrentTime()) {
                if (dialog.notify_settings.mute_until > connectionsManager.getCurrentTime() + 31536000) {
                    editor.putInt("notify2_" + peerId, 2);
                    dialog.notify_settings.mute_until = Integer.MAX_VALUE;
                    return;
                }
                editor.putInt("notify2_" + peerId, 3);
                editor.putInt("notifyuntil_" + peerId, dialog.notify_settings.mute_until);
                return;
            }
            editor.putInt("notify2_" + peerId, 0);
            return;
        }
        editor.remove("notify2_" + peerId);
    }
}
