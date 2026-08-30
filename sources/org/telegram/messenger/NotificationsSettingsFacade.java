package org.telegram.messenger;

import android.content.SharedPreferences;
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
        TLRPC.Dialog dialog;
        boolean z4;
        int i10;
        int i11;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11, true);
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        NotificationsController notificationsController = NotificationsController.getInstance(this.currentAccount);
        int c3 = y3.c("notify2_", sharedPrefKey, getPreferences(), -1);
        boolean z10 = true;
        int c10 = y3.c("notifyuntil_", sharedPrefKey, getPreferences(), 0);
        SharedPreferences.Editor edit = getPreferences().edit();
        if ((peerNotifySettings.flags & 2) != 0) {
            edit.putBoolean(vh.v2.e("silent_", sharedPrefKey), peerNotifySettings.silent);
        } else {
            edit.remove("silent_" + sharedPrefKey);
        }
        if ((peerNotifySettings.flags & 64) != 0) {
            edit.putBoolean(vh.v2.e("stories_", sharedPrefKey), !peerNotifySettings.stories_muted);
        } else {
            edit.remove("stories_" + sharedPrefKey);
        }
        int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i12 == 0) {
            dialog = (TLRPC.Dialog) messagesController.dialogs_dict.f(j10);
        } else {
            dialog = null;
        }
        if (dialog != null) {
            dialog.notify_settings = peerNotifySettings;
        }
        if ((peerNotifySettings.flags & 4) != 0) {
            if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
                if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime() + 31536000) {
                    if (c3 != 2) {
                        edit.putInt("notify2_" + sharedPrefKey, 2);
                        if (dialog != null) {
                            dialog.notify_settings.mute_until = Integer.MAX_VALUE;
                        }
                        i11 = 0;
                    } else {
                        i11 = 0;
                        z10 = false;
                    }
                } else {
                    if (c3 == 3 && c10 == peerNotifySettings.mute_until) {
                        z10 = false;
                    } else {
                        edit.putInt("notify2_" + sharedPrefKey, 3);
                        edit.putInt("notifyuntil_" + sharedPrefKey, peerNotifySettings.mute_until);
                        if (dialog != null) {
                            dialog.notify_settings.mute_until = 0;
                        }
                    }
                    i11 = peerNotifySettings.mute_until;
                }
                if (i12 == 0) {
                    messagesStorage.setDialogFlags(j10, (i11 << 32) | 1);
                    notificationsController.removeNotificationsForDialog(j10);
                }
            } else {
                if (c3 != 0 && c3 != 1) {
                    if (dialog != null) {
                        TLRPC.PeerNotifySettings peerNotifySettings2 = dialog.notify_settings;
                        i10 = 0;
                        peerNotifySettings2.mute_until = 0;
                    } else {
                        i10 = 0;
                    }
                    edit.putInt("notify2_" + sharedPrefKey, i10);
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i12 == 0) {
                    messagesStorage.setDialogFlags(j10, 0L);
                }
                z10 = z4;
            }
        } else {
            boolean z11 = true;
            if (c3 != -1) {
                if (dialog != null) {
                    dialog.notify_settings.mute_until = 0;
                }
                edit.remove("notify2_" + sharedPrefKey);
            } else {
                z11 = false;
            }
            if (i12 == 0) {
                messagesStorage.setDialogFlags(j10, 0L);
            }
            z10 = z11;
        }
        applySoundSettings(peerNotifySettings.android_sound, edit, j10, j11, 0, false);
        edit.apply();
        if (z10) {
            AndroidUtilities.runOnUIThread(new xg(this, 2));
        }
    }

    public void applyDialogNotificationsSettings(long j10, long j11, TLRPC.PeerNotifySettings peerNotifySettings) {
        if (peerNotifySettings == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new i5.x(this, j10, j11, peerNotifySettings, 10));
    }

    public void applySoundSettings(org.telegram.tgnet.TLRPC.NotificationSound r19, android.content.SharedPreferences.Editor r20, long r21, long r23, int r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsSettingsFacade.applySoundSettings(org.telegram.tgnet.TLRPC$NotificationSound, android.content.SharedPreferences$Editor, long, long, int, boolean):void");
    }

    public void clearPreference(long j10, long j11) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11, true);
        SharedPreferences.Editor edit = getPreferences().edit();
        SharedPreferences.Editor remove = edit.remove("notify2_" + sharedPrefKey);
        SharedPreferences.Editor remove2 = remove.remove("custom_" + sharedPrefKey);
        SharedPreferences.Editor remove3 = remove2.remove("notifyuntil_" + sharedPrefKey);
        SharedPreferences.Editor remove4 = remove3.remove("content_preview_" + sharedPrefKey);
        SharedPreferences.Editor remove5 = remove4.remove("silent_" + sharedPrefKey);
        remove5.remove("stories_" + sharedPrefKey).apply();
    }

    public int getProperty(String str, long j10, long j11, int i10) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11, true);
        SharedPreferences preferences = getPreferences();
        if (preferences.contains(str + sharedPrefKey)) {
            SharedPreferences preferences2 = getPreferences();
            return preferences2.getInt(str + sharedPrefKey, i10);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j10, 0L, true);
        SharedPreferences preferences3 = getPreferences();
        return preferences3.getInt(str + sharedPrefKey2, i10);
    }

    public String getPropertyString(String str, long j10, long j11, String str2) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        SharedPreferences preferences = getPreferences();
        if (preferences.contains(str + sharedPrefKey)) {
            SharedPreferences preferences2 = getPreferences();
            return preferences2.getString(str + sharedPrefKey, str2);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j10, 0L);
        SharedPreferences preferences3 = getPreferences();
        return preferences3.getString(str + sharedPrefKey2, str2);
    }

    public boolean isDefault(long j10, long j11) {
        NotificationsController.getSharedPrefKey(j10, j11, true);
        return false;
    }

    public void removeProperty(String str, long j10, long j11) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        SharedPreferences.Editor edit = getPreferences().edit();
        edit.remove(str + sharedPrefKey).apply();
    }

    public void setSettingsForDialog(SharedPreferences.Editor editor, TLRPC.Dialog dialog, TLRPC.PeerNotifySettings peerNotifySettings) {
        long peerId = MessageObject.getPeerId(dialog.peer);
        if ((dialog.notify_settings.flags & 2) != 0) {
            editor.putBoolean(android.support.v4.media.a.n(peerId, "silent_"), dialog.notify_settings.silent);
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
                editor.putInt(android.support.v4.media.a.n(peerId, "notifyuntil_"), dialog.notify_settings.mute_until);
                return;
            }
            editor.putInt("notify2_" + peerId, 0);
            return;
        }
        editor.remove("notify2_" + peerId);
    }

    public long getProperty(String str, long j10, long j11, long j12) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11, true);
        SharedPreferences preferences = getPreferences();
        if (preferences.contains(str + sharedPrefKey)) {
            SharedPreferences preferences2 = getPreferences();
            return preferences2.getLong(str + sharedPrefKey, j12);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j10, 0L, true);
        SharedPreferences preferences3 = getPreferences();
        return preferences3.getLong(str + sharedPrefKey2, j12);
    }

    public boolean getProperty(String str, long j10, long j11, boolean z4) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        SharedPreferences preferences = getPreferences();
        if (preferences.contains(str + sharedPrefKey)) {
            SharedPreferences preferences2 = getPreferences();
            return preferences2.getBoolean(str + sharedPrefKey, z4);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j10, 0L);
        SharedPreferences preferences3 = getPreferences();
        return preferences3.getBoolean(str + sharedPrefKey2, z4);
    }
}
