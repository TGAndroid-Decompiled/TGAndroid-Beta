package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

public class BaseController {
    protected int currentAccount;
    private AccountInstance parentAccountInstance;

    public BaseController(int i) {
        this.parentAccountInstance = AccountInstance.getInstance(i);
        this.currentAccount = i;
    }

    public final AccountInstance getAccountInstance() {
        return this.parentAccountInstance;
    }

    public final MessagesController getMessagesController() {
        return this.parentAccountInstance.getMessagesController();
    }

    public final ContactsController getContactsController() {
        return this.parentAccountInstance.getContactsController();
    }

    public final MediaDataController getMediaDataController() {
        return this.parentAccountInstance.getMediaDataController();
    }

    public final ConnectionsManager getConnectionsManager() {
        return this.parentAccountInstance.getConnectionsManager();
    }

    public final LocationController getLocationController() {
        return this.parentAccountInstance.getLocationController();
    }

    public final NotificationsController getNotificationsController() {
        return this.parentAccountInstance.getNotificationsController();
    }

    public final NotificationCenter getNotificationCenter() {
        return this.parentAccountInstance.getNotificationCenter();
    }

    public final UserConfig getUserConfig() {
        return this.parentAccountInstance.getUserConfig();
    }

    public final MessagesStorage getMessagesStorage() {
        return this.parentAccountInstance.getMessagesStorage();
    }

    public final DownloadController getDownloadController() {
        return this.parentAccountInstance.getDownloadController();
    }

    public final SendMessagesHelper getSendMessagesHelper() {
        return this.parentAccountInstance.getSendMessagesHelper();
    }

    public final SecretChatHelper getSecretChatHelper() {
        return this.parentAccountInstance.getSecretChatHelper();
    }

    public final StatsController getStatsController() {
        return this.parentAccountInstance.getStatsController();
    }

    public final FileLoader getFileLoader() {
        return this.parentAccountInstance.getFileLoader();
    }

    public final FileRefController getFileRefController() {
        return this.parentAccountInstance.getFileRefController();
    }

    public final MemberRequestsController getMemberRequestsController() {
        return this.parentAccountInstance.getMemberRequestsController();
    }
}
