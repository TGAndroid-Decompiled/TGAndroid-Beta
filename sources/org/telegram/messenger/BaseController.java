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

    protected final AccountInstance getAccountInstance() {
        return this.parentAccountInstance;
    }

    protected final AppGlobalConfig getAppGlobalConfig() {
        return getMessagesController().config;
    }

    protected final MessagesController getMessagesController() {
        return this.parentAccountInstance.getMessagesController();
    }

    protected final ContactsController getContactsController() {
        return this.parentAccountInstance.getContactsController();
    }

    protected final PersistColorPalette getColorPalette() {
        return this.parentAccountInstance.getColorPalette();
    }

    protected final MediaDataController getMediaDataController() {
        return this.parentAccountInstance.getMediaDataController();
    }

    protected final ConnectionsManager getConnectionsManager() {
        return this.parentAccountInstance.getConnectionsManager();
    }

    protected final LocationController getLocationController() {
        return this.parentAccountInstance.getLocationController();
    }

    protected final NotificationsController getNotificationsController() {
        return this.parentAccountInstance.getNotificationsController();
    }

    protected final NotificationCenter getNotificationCenter() {
        return this.parentAccountInstance.getNotificationCenter();
    }

    protected final UserConfig getUserConfig() {
        return this.parentAccountInstance.getUserConfig();
    }

    protected final MessagesStorage getMessagesStorage() {
        return this.parentAccountInstance.getMessagesStorage();
    }

    protected final DownloadController getDownloadController() {
        return this.parentAccountInstance.getDownloadController();
    }

    protected final SendMessagesHelper getSendMessagesHelper() {
        return this.parentAccountInstance.getSendMessagesHelper();
    }

    protected final SecretChatHelper getSecretChatHelper() {
        return this.parentAccountInstance.getSecretChatHelper();
    }

    protected final StatsController getStatsController() {
        return this.parentAccountInstance.getStatsController();
    }

    protected final FileLoader getFileLoader() {
        return this.parentAccountInstance.getFileLoader();
    }

    protected final FileRefController getFileRefController() {
        return this.parentAccountInstance.getFileRefController();
    }

    protected final MemberRequestsController getMemberRequestsController() {
        return this.parentAccountInstance.getMemberRequestsController();
    }
}
