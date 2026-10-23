package org.telegram.messenger;
public final class td implements Runnable {
    public final int f19614a;
    public final MessagesController f19615b;

    public td(MessagesController messagesController, int i10) {
        this.f19614a = i10;
        this.f19615b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f19614a) {
            case 0:
                this.f19615b.lambda$hidePromoDialog$135();
                return;
            case 1:
                this.f19615b.lambda$putUsers$56();
                return;
            case 2:
                this.f19615b.removePromoDialog();
                return;
            case 3:
                this.f19615b.lambda$toggleChatJoinToSend$278();
                return;
            case 4:
                this.f19615b.lambda$toggleChannelInvitesHistory$286();
                return;
            case 5:
                this.f19615b.lambda$markAllTopicsAsRead$6();
                return;
            case 6:
                this.f19615b.lambda$removeWebBrowserException$517();
                return;
            case 7:
                this.f19615b.lambda$new$13();
                return;
            case 8:
                this.f19615b.loadAppConfig();
                return;
            case 9:
                this.f19615b.lambda$new$17();
                return;
            case 10:
                this.f19615b.lambda$new$0();
                return;
            case 11:
                this.f19615b.lambda$new$18();
                return;
            default:
                this.f19615b.lambda$new$38();
                return;
        }
    }
}
