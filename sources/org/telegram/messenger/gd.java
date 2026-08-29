package org.telegram.messenger;
public final class gd implements Runnable {
    public final int f20342a;
    public final MessagesController f20343b;

    public gd(MessagesController messagesController, int i10) {
        this.f20342a = i10;
        this.f20343b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f20342a) {
            case 0:
                this.f20343b.lambda$processLoadedDeleteTask$87();
                return;
            case 1:
                this.f20343b.lambda$markAllTopicsAsRead$5();
                return;
            case 2:
                this.f20343b.lambda$hidePromoDialog$136();
                return;
            case 3:
                this.f20343b.removePromoDialog();
                return;
            case 4:
                this.f20343b.lambda$putUsers$57();
                return;
            case 5:
                this.f20343b.lambda$didReceivedNotification$42();
                return;
            case 6:
                this.f20343b.lambda$addWebBrowserException$512();
                return;
            case 7:
                this.f20343b.lambda$markAllTopicsAsRead$6();
                return;
            case 8:
                this.f20343b.lambda$removeWebBrowserException$514();
                return;
            case 9:
                this.f20343b.lambda$new$13();
                return;
            case 10:
                this.f20343b.loadAppConfig();
                return;
            case 11:
                this.f20343b.lambda$new$17();
                return;
            default:
                this.f20343b.lambda$new$0();
                return;
        }
    }
}
