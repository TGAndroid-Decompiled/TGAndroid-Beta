package org.telegram.messenger;

public final class dd implements Runnable {

    public final int f20047a;

    public final MessagesController f20048b;

    public dd(MessagesController messagesController, int i10) {
        this.f20047a = i10;
        this.f20048b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f20047a) {
            case 0:
                this.f20048b.lambda$processLoadedDeleteTask$87();
                break;
            case 1:
                this.f20048b.lambda$markAllTopicsAsRead$5();
                break;
            case 2:
                this.f20048b.lambda$hidePromoDialog$136();
                break;
            case 3:
                this.f20048b.removePromoDialog();
                break;
            case 4:
                this.f20048b.lambda$putUsers$57();
                break;
            case 5:
                this.f20048b.lambda$didReceivedNotification$42();
                break;
            case 6:
                this.f20048b.lambda$addWebBrowserException$512();
                break;
            case 7:
                this.f20048b.lambda$markAllTopicsAsRead$6();
                break;
            case 8:
                this.f20048b.lambda$removeWebBrowserException$514();
                break;
            case 9:
                this.f20048b.lambda$new$13();
                break;
            case 10:
                this.f20048b.loadAppConfig();
                break;
            case 11:
                this.f20048b.lambda$new$17();
                break;
            default:
                this.f20048b.lambda$new$0();
                break;
        }
    }
}
