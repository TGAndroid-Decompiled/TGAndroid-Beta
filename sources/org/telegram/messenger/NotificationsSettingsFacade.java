package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$NotificationSound;
import org.telegram.tgnet.TLRPC$PeerNotifySettings;
import org.telegram.tgnet.TLRPC$TL_notificationSoundDefault;
import org.telegram.tgnet.TLRPC$TL_notificationSoundLocal;
import org.telegram.tgnet.TLRPC$TL_notificationSoundNone;
import org.telegram.tgnet.TLRPC$TL_notificationSoundRingtone;
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
        SharedPreferences.Editor edit = getPreferences().edit();
        SharedPreferences.Editor remove = edit.remove(PROPERTY_NOTIFY + sharedPrefKey);
        SharedPreferences.Editor remove2 = remove.remove(PROPERTY_CUSTOM + sharedPrefKey);
        SharedPreferences.Editor remove3 = remove2.remove(PROPERTY_NOTIFY_UNTIL + sharedPrefKey);
        SharedPreferences.Editor remove4 = remove3.remove(PROPERTY_CONTENT_PREVIEW + sharedPrefKey);
        SharedPreferences.Editor remove5 = remove4.remove(PROPERTY_SILENT + sharedPrefKey);
        remove5.remove(PROPERTY_STORIES_NOTIFY + sharedPrefKey).apply();
    }

    public int getProperty(String str, long j, long j2, int i) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2, true);
        SharedPreferences preferences = getPreferences();
        if (preferences.contains(str + sharedPrefKey)) {
            SharedPreferences preferences2 = getPreferences();
            return preferences2.getInt(str + sharedPrefKey, i);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j, 0L, true);
        SharedPreferences preferences3 = getPreferences();
        return preferences3.getInt(str + sharedPrefKey2, i);
    }

    public long getProperty(String str, long j, long j2, long j3) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2, true);
        SharedPreferences preferences = getPreferences();
        if (preferences.contains(str + sharedPrefKey)) {
            SharedPreferences preferences2 = getPreferences();
            return preferences2.getLong(str + sharedPrefKey, j3);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j, 0L, true);
        SharedPreferences preferences3 = getPreferences();
        return preferences3.getLong(str + sharedPrefKey2, j3);
    }

    public boolean getProperty(String str, long j, long j2, boolean z) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2);
        SharedPreferences preferences = getPreferences();
        if (preferences.contains(str + sharedPrefKey)) {
            SharedPreferences preferences2 = getPreferences();
            return preferences2.getBoolean(str + sharedPrefKey, z);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j, 0L);
        SharedPreferences preferences3 = getPreferences();
        return preferences3.getBoolean(str + sharedPrefKey2, z);
    }

    public String getPropertyString(String str, long j, long j2, String str2) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2);
        SharedPreferences preferences = getPreferences();
        if (preferences.contains(str + sharedPrefKey)) {
            SharedPreferences preferences2 = getPreferences();
            return preferences2.getString(str + sharedPrefKey, str2);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j, 0L);
        SharedPreferences preferences3 = getPreferences();
        return preferences3.getString(str + sharedPrefKey2, str2);
    }

    public void removeProperty(String str, long j, long j2) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2);
        SharedPreferences.Editor edit = getPreferences().edit();
        edit.remove(str + sharedPrefKey).apply();
    }

    private SharedPreferences getPreferences() {
        return MessagesController.getNotificationsSettings(this.currentAccount);
    }

    public void applyDialogNotificationsSettings(final long j, final long j2, final TLRPC$PeerNotifySettings tLRPC$PeerNotifySettings) {
        if (tLRPC$PeerNotifySettings == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsSettingsFacade.this.lambda$applyDialogNotificationsSettings$1(j, j2, tLRPC$PeerNotifySettings);
            }
        });
    }

    public void lambda$applyDialogNotificationsSettings$1(long r20, long r22, org.telegram.tgnet.TLRPC$PeerNotifySettings r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsSettingsFacade.lambda$applyDialogNotificationsSettings$1(long, long, org.telegram.tgnet.TLRPC$PeerNotifySettings):void");
    }

    public void lambda$applyDialogNotificationsSettings$0() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    public void applySoundSettings(TLRPC$NotificationSound tLRPC$NotificationSound, SharedPreferences.Editor editor, long j, long j2, int i, boolean z) {
        String str;
        String str2;
        String str3;
        if (tLRPC$NotificationSound == null) {
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
        if (tLRPC$NotificationSound instanceof TLRPC$TL_notificationSoundLocal) {
            TLRPC$TL_notificationSoundLocal tLRPC$TL_notificationSoundLocal = (TLRPC$TL_notificationSoundLocal) tLRPC$NotificationSound;
            if ("Default".equalsIgnoreCase(tLRPC$TL_notificationSoundLocal.data)) {
                tLRPC$NotificationSound = new TLRPC$TL_notificationSoundDefault();
            } else if ("NoSound".equalsIgnoreCase(tLRPC$TL_notificationSoundLocal.data)) {
                tLRPC$NotificationSound = new TLRPC$TL_notificationSoundNone();
            } else {
                String findRingtonePathByName = NotificationsSoundActivity.findRingtonePathByName(tLRPC$TL_notificationSoundLocal.title);
                if (findRingtonePathByName == null) {
                    return;
                }
                tLRPC$TL_notificationSoundLocal.data = findRingtonePathByName;
            }
        }
        if (tLRPC$NotificationSound instanceof TLRPC$TL_notificationSoundDefault) {
            editor.putString(str, "Default");
            editor.putString(str3, "Default");
            editor.remove(str2);
        } else if (tLRPC$NotificationSound instanceof TLRPC$TL_notificationSoundNone) {
            editor.putString(str, "NoSound");
            editor.putString(str3, "NoSound");
            editor.remove(str2);
        } else if (tLRPC$NotificationSound instanceof TLRPC$TL_notificationSoundLocal) {
            TLRPC$TL_notificationSoundLocal tLRPC$TL_notificationSoundLocal2 = (TLRPC$TL_notificationSoundLocal) tLRPC$NotificationSound;
            editor.putString(str, tLRPC$TL_notificationSoundLocal2.title);
            editor.putString(str3, tLRPC$TL_notificationSoundLocal2.data);
            editor.remove(str2);
        } else if (tLRPC$NotificationSound instanceof TLRPC$TL_notificationSoundRingtone) {
            TLRPC$TL_notificationSoundRingtone tLRPC$TL_notificationSoundRingtone = (TLRPC$TL_notificationSoundRingtone) tLRPC$NotificationSound;
            editor.putLong(str2, tLRPC$TL_notificationSoundRingtone.id);
            MediaDataController.getInstance(this.currentAccount).checkRingtones(true);
            if (z && j != 0) {
                editor.putBoolean(PROPERTY_CUSTOM + j, true);
            }
            MediaDataController.getInstance(this.currentAccount).ringtoneDataStore.getDocument(tLRPC$TL_notificationSoundRingtone.id);
        }
    }

    public void setSettingsForDialog(SharedPreferences.Editor editor, TLRPC$Dialog tLRPC$Dialog, TLRPC$PeerNotifySettings tLRPC$PeerNotifySettings) {
        long peerId = MessageObject.getPeerId(tLRPC$Dialog.peer);
        if ((tLRPC$Dialog.notify_settings.flags & 2) != 0) {
            editor.putBoolean(PROPERTY_SILENT + peerId, tLRPC$Dialog.notify_settings.silent);
        } else {
            editor.remove(PROPERTY_SILENT + peerId);
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        TLRPC$PeerNotifySettings tLRPC$PeerNotifySettings2 = tLRPC$Dialog.notify_settings;
        if ((tLRPC$PeerNotifySettings2.flags & 4) != 0) {
            if (tLRPC$PeerNotifySettings2.mute_until > connectionsManager.getCurrentTime()) {
                if (tLRPC$Dialog.notify_settings.mute_until > connectionsManager.getCurrentTime() + 31536000) {
                    editor.putInt(PROPERTY_NOTIFY + peerId, 2);
                    tLRPC$Dialog.notify_settings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    return;
                }
                editor.putInt(PROPERTY_NOTIFY + peerId, 3);
                editor.putInt(PROPERTY_NOTIFY_UNTIL + peerId, tLRPC$Dialog.notify_settings.mute_until);
                return;
            }
            editor.putInt(PROPERTY_NOTIFY + peerId, 0);
            return;
        }
        editor.remove(PROPERTY_NOTIFY + peerId);
    }
}
