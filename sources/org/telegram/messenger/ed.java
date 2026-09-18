package org.telegram.messenger;
public final class ed implements Runnable {
    public final int f16224a;
    public final MessagesController f16225b;

    public ed(MessagesController messagesController, int i10) {
        this.f16224a = i10;
        this.f16225b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f16224a) {
            case 0:
                this.f16225b.lambda$processLoadedDeleteTask$87();
                return;
            case 1:
                this.f16225b.lambda$markAllTopicsAsRead$5();
                return;
            case 2:
                this.f16225b.lambda$hidePromoDialog$136();
                return;
            case 3:
                this.f16225b.removePromoDialog();
                return;
            case 4:
                this.f16225b.lambda$putUsers$57();
                return;
            case 5:
                this.f16225b.lambda$didReceivedNotification$42();
                return;
            case 6:
                this.f16225b.lambda$addWebBrowserException$512();
                return;
            case 7:
                this.f16225b.lambda$markAllTopicsAsRead$6();
                return;
            case 8:
                this.f16225b.lambda$removeWebBrowserException$514();
                return;
            case 9:
                this.f16225b.lambda$new$13();
                return;
            case 10:
                this.f16225b.loadAppConfig();
                return;
            case 11:
                this.f16225b.lambda$new$17();
                return;
            default:
                this.f16225b.lambda$new$0();
                return;
        }
    }
}
