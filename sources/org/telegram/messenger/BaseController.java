package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.Paint.PersistColorPalette;

public class BaseController {
    protected final int currentAccount;
    private AccountInstance parentAccountInstance;

    public BaseController(int i) {
        this.parentAccountInstance = AccountInstance.getInstance(i);
        this.currentAccount = i;
    }

    public final AccountInstance getAccountInstance() {
        return this.parentAccountInstance;
    }

    public final PersistColorPalette getColorPalette() {
        return this.parentAccountInstance.getColorPalette();
    }

    public final ConnectionsManager getConnectionsManager() {
        return this.parentAccountInstance.getConnectionsManager();
    }

    public final ContactsController getContactsController() {
        return this.parentAccountInstance.getContactsController();
    }

    public final DownloadController getDownloadController() {
        return this.parentAccountInstance.getDownloadController();
    }

    public final FileLoader getFileLoader() {
        return this.parentAccountInstance.getFileLoader();
    }

    public final FileRefController getFileRefController() {
        return this.parentAccountInstance.getFileRefController();
    }

    public final LocationController getLocationController() {
        return this.parentAccountInstance.getLocationController();
    }

    public final MediaDataController getMediaDataController() {
        return this.parentAccountInstance.getMediaDataController();
    }

    public final MemberRequestsController getMemberRequestsController() {
        return this.parentAccountInstance.getMemberRequestsController();
    }

    public final MessagesController getMessagesController() {
        return this.parentAccountInstance.getMessagesController();
    }

    public final MessagesStorage getMessagesStorage() {
        return this.parentAccountInstance.getMessagesStorage();
    }

    public final NotificationCenter getNotificationCenter() {
        return this.parentAccountInstance.getNotificationCenter();
    }

    public final NotificationsController getNotificationsController() {
        return this.parentAccountInstance.getNotificationsController();
    }

    public final SecretChatHelper getSecretChatHelper() {
        return this.parentAccountInstance.getSecretChatHelper();
    }

    public final SendMessagesHelper getSendMessagesHelper() {
        return this.parentAccountInstance.getSendMessagesHelper();
    }

    public final StatsController getStatsController() {
        return this.parentAccountInstance.getStatsController();
    }

    public final UserConfig getUserConfig() {
        return this.parentAccountInstance.getUserConfig();
    }
}
