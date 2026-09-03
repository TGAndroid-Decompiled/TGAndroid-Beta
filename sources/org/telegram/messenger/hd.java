package org.telegram.messenger;
public final class hd implements Runnable {
    public final int f18865a;
    public final MessagesController f18866b;

    public hd(MessagesController messagesController, int i10) {
        this.f18865a = i10;
        this.f18866b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f18865a) {
            case 0:
                this.f18866b.lambda$processLoadedDeleteTask$87();
                return;
            case 1:
                this.f18866b.lambda$markAllTopicsAsRead$5();
                return;
            case 2:
                this.f18866b.lambda$hidePromoDialog$136();
                return;
            case 3:
                this.f18866b.removePromoDialog();
                return;
            case 4:
                this.f18866b.lambda$putUsers$57();
                return;
            case 5:
                this.f18866b.lambda$didReceivedNotification$42();
                return;
            case 6:
                this.f18866b.lambda$addWebBrowserException$512();
                return;
            case 7:
                this.f18866b.lambda$markAllTopicsAsRead$6();
                return;
            case 8:
                this.f18866b.lambda$removeWebBrowserException$514();
                return;
            case 9:
                this.f18866b.lambda$new$13();
                return;
            case 10:
                this.f18866b.loadAppConfig();
                return;
            case 11:
                this.f18866b.lambda$new$17();
                return;
            default:
                this.f18866b.lambda$new$0();
                return;
        }
    }
}
