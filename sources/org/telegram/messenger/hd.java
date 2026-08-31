package org.telegram.messenger;
public final class hd implements Runnable {
    public final int f18863a;
    public final MessagesController f18864b;

    public hd(MessagesController messagesController, int i10) {
        this.f18863a = i10;
        this.f18864b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f18863a) {
            case 0:
                this.f18864b.lambda$processLoadedDeleteTask$87();
                return;
            case 1:
                this.f18864b.lambda$markAllTopicsAsRead$5();
                return;
            case 2:
                this.f18864b.lambda$hidePromoDialog$136();
                return;
            case 3:
                this.f18864b.removePromoDialog();
                return;
            case 4:
                this.f18864b.lambda$putUsers$57();
                return;
            case 5:
                this.f18864b.lambda$didReceivedNotification$42();
                return;
            case 6:
                this.f18864b.lambda$addWebBrowserException$512();
                return;
            case 7:
                this.f18864b.lambda$markAllTopicsAsRead$6();
                return;
            case 8:
                this.f18864b.lambda$removeWebBrowserException$514();
                return;
            case 9:
                this.f18864b.lambda$new$13();
                return;
            case 10:
                this.f18864b.loadAppConfig();
                return;
            case 11:
                this.f18864b.lambda$new$17();
                return;
            default:
                this.f18864b.lambda$new$0();
                return;
        }
    }
}
