package org.telegram.messenger;
public final class ed implements Runnable {
    public final int f17551a;
    public final MessagesController f17552b;

    public ed(MessagesController messagesController, int i10) {
        this.f17551a = i10;
        this.f17552b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f17551a) {
            case 0:
                this.f17552b.lambda$processLoadedDeleteTask$87();
                return;
            case 1:
                this.f17552b.lambda$markAllTopicsAsRead$5();
                return;
            case 2:
                this.f17552b.lambda$hidePromoDialog$136();
                return;
            case 3:
                this.f17552b.removePromoDialog();
                return;
            case 4:
                this.f17552b.lambda$putUsers$57();
                return;
            case 5:
                this.f17552b.lambda$didReceivedNotification$42();
                return;
            case 6:
                this.f17552b.lambda$addWebBrowserException$512();
                return;
            case 7:
                this.f17552b.lambda$markAllTopicsAsRead$6();
                return;
            case 8:
                this.f17552b.lambda$removeWebBrowserException$514();
                return;
            case 9:
                this.f17552b.lambda$new$13();
                return;
            case 10:
                this.f17552b.loadAppConfig();
                return;
            case 11:
                this.f17552b.lambda$new$17();
                return;
            default:
                this.f17552b.lambda$new$0();
                return;
        }
    }
}
