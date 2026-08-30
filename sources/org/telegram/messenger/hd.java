package org.telegram.messenger;
public final class hd implements Runnable {
    public final int f17399a;
    public final MessagesController f17400b;

    public hd(MessagesController messagesController, int i10) {
        this.f17399a = i10;
        this.f17400b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f17399a) {
            case 0:
                this.f17400b.lambda$processLoadedDeleteTask$87();
                return;
            case 1:
                this.f17400b.lambda$markAllTopicsAsRead$5();
                return;
            case 2:
                this.f17400b.lambda$hidePromoDialog$136();
                return;
            case 3:
                this.f17400b.removePromoDialog();
                return;
            case 4:
                this.f17400b.lambda$putUsers$57();
                return;
            case 5:
                this.f17400b.lambda$didReceivedNotification$42();
                return;
            case 6:
                this.f17400b.lambda$addWebBrowserException$512();
                return;
            case 7:
                this.f17400b.lambda$markAllTopicsAsRead$6();
                return;
            case 8:
                this.f17400b.lambda$removeWebBrowserException$514();
                return;
            case 9:
                this.f17400b.lambda$new$13();
                return;
            case 10:
                this.f17400b.loadAppConfig();
                return;
            case 11:
                this.f17400b.lambda$new$17();
                return;
            default:
                this.f17400b.lambda$new$0();
                return;
        }
    }
}
