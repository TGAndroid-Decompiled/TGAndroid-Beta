package org.telegram.messenger;
public final class pd implements Runnable {
    public final int f19278a;
    public final MessagesController f19279b;

    public pd(MessagesController messagesController, int i10) {
        this.f19278a = i10;
        this.f19279b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f19278a) {
            case 0:
                this.f19279b.lambda$hidePromoDialog$135();
                return;
            case 1:
                this.f19279b.lambda$putUsers$56();
                return;
            case 2:
                this.f19279b.removePromoDialog();
                return;
            case 3:
                this.f19279b.lambda$toggleChatJoinToSend$278();
                return;
            case 4:
                this.f19279b.lambda$toggleChannelInvitesHistory$286();
                return;
            case 5:
                this.f19279b.lambda$markAllTopicsAsRead$6();
                return;
            case 6:
                this.f19279b.lambda$removeWebBrowserException$517();
                return;
            case 7:
                this.f19279b.lambda$new$13();
                return;
            case 8:
                this.f19279b.loadAppConfig();
                return;
            case 9:
                this.f19279b.lambda$new$17();
                return;
            case 10:
                this.f19279b.lambda$new$0();
                return;
            case 11:
                this.f19279b.lambda$new$18();
                return;
            default:
                this.f19279b.lambda$new$38();
                return;
        }
    }
}
