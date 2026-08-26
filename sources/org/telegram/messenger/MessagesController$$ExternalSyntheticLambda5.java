package org.telegram.messenger;

public final class MessagesController$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;

    public MessagesController$$ExternalSyntheticLambda5(MessagesController messagesController, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$markAllTopicsAsRead$6();
                break;
            case 1:
                this.f$0.lambda$processLoadedDeleteTask$87();
                break;
            case 2:
                this.f$0.lambda$markAllTopicsAsRead$5();
                break;
            case 3:
                this.f$0.lambda$hidePromoDialog$136();
                break;
            case 4:
                this.f$0.removePromoDialog();
                break;
            case 5:
                this.f$0.lambda$putUsers$57();
                break;
            case 6:
                this.f$0.lambda$didReceivedNotification$42();
                break;
            case 7:
                this.f$0.lambda$addWebBrowserException$512();
                break;
            case 8:
                this.f$0.lambda$removeWebBrowserException$514();
                break;
            case 9:
                this.f$0.lambda$new$13();
                break;
            case 10:
                this.f$0.loadAppConfig();
                break;
            case 11:
                this.f$0.lambda$new$17();
                break;
            default:
                this.f$0.lambda$new$0();
                break;
        }
    }
}
