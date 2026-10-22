package org.telegram.messenger;
public final class ud implements Runnable {
    public final int f19690a;
    public final MessagesController f19691b;

    public ud(MessagesController messagesController, int i10) {
        this.f19690a = i10;
        this.f19691b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f19690a) {
            case 0:
                this.f19691b.lambda$hidePromoDialog$135();
                return;
            case 1:
                this.f19691b.lambda$putUsers$56();
                return;
            case 2:
                this.f19691b.removePromoDialog();
                return;
            case 3:
                this.f19691b.lambda$toggleChatJoinToSend$278();
                return;
            case 4:
                this.f19691b.lambda$toggleChannelInvitesHistory$286();
                return;
            case 5:
                this.f19691b.lambda$markAllTopicsAsRead$6();
                return;
            case 6:
                this.f19691b.lambda$removeWebBrowserException$517();
                return;
            case 7:
                this.f19691b.lambda$new$13();
                return;
            case 8:
                this.f19691b.loadAppConfig();
                return;
            case 9:
                this.f19691b.lambda$new$17();
                return;
            case 10:
                this.f19691b.lambda$new$0();
                return;
            case 11:
                this.f19691b.lambda$new$18();
                return;
            default:
                this.f19691b.lambda$new$38();
                return;
        }
    }
}
