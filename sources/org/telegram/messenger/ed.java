package org.telegram.messenger;
public final class ed implements Runnable {
    public final int f16046a;
    public final MessagesController f16047b;

    public ed(MessagesController messagesController, int i10) {
        this.f16046a = i10;
        this.f16047b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f16046a) {
            case 0:
                this.f16047b.lambda$processLoadedDeleteTask$87();
                return;
            case 1:
                this.f16047b.lambda$markAllTopicsAsRead$5();
                return;
            case 2:
                this.f16047b.lambda$hidePromoDialog$136();
                return;
            case 3:
                this.f16047b.removePromoDialog();
                return;
            case 4:
                this.f16047b.lambda$putUsers$57();
                return;
            case 5:
                this.f16047b.lambda$didReceivedNotification$42();
                return;
            case 6:
                this.f16047b.lambda$addWebBrowserException$512();
                return;
            case 7:
                this.f16047b.lambda$markAllTopicsAsRead$6();
                return;
            case 8:
                this.f16047b.lambda$removeWebBrowserException$514();
                return;
            case 9:
                this.f16047b.lambda$new$13();
                return;
            case 10:
                this.f16047b.loadAppConfig();
                return;
            case 11:
                this.f16047b.lambda$new$17();
                return;
            default:
                this.f16047b.lambda$new$0();
                return;
        }
    }
}
