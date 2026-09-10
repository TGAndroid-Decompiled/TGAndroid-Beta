package org.telegram.messenger;
public final class md implements Runnable {
    public final int f15778a;
    public final MessagesController f15779b;

    public md(MessagesController messagesController, int i10) {
        this.f15778a = i10;
        this.f15779b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f15778a) {
            case 0:
                this.f15779b.lambda$processLoadedDeleteTask$87();
                return;
            case 1:
                this.f15779b.lambda$markAllTopicsAsRead$5();
                return;
            case 2:
                this.f15779b.lambda$hidePromoDialog$136();
                return;
            case 3:
                this.f15779b.removePromoDialog();
                return;
            case 4:
                this.f15779b.lambda$putUsers$57();
                return;
            case 5:
                this.f15779b.lambda$didReceivedNotification$42();
                return;
            case 6:
                this.f15779b.lambda$addWebBrowserException$512();
                return;
            case 7:
                this.f15779b.lambda$markAllTopicsAsRead$6();
                return;
            case 8:
                this.f15779b.lambda$removeWebBrowserException$514();
                return;
            case 9:
                this.f15779b.lambda$new$13();
                return;
            case 10:
                this.f15779b.loadAppConfig();
                return;
            case 11:
                this.f15779b.lambda$new$17();
                return;
            default:
                this.f15779b.lambda$new$0();
                return;
        }
    }
}
