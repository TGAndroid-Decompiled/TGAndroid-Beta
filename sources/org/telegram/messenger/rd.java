package org.telegram.messenger;
public final class rd implements Runnable {
    public final int f19090a;
    public final MessagesController f19091b;

    public rd(MessagesController messagesController, int i10) {
        this.f19090a = i10;
        this.f19091b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f19090a) {
            case 0:
                this.f19091b.lambda$hidePromoDialog$135();
                return;
            case 1:
                this.f19091b.lambda$putUsers$56();
                return;
            case 2:
                this.f19091b.removePromoDialog();
                return;
            case 3:
                this.f19091b.lambda$toggleChatJoinToSend$278();
                return;
            case 4:
                this.f19091b.lambda$toggleChannelInvitesHistory$286();
                return;
            case 5:
                this.f19091b.lambda$markAllTopicsAsRead$6();
                return;
            case 6:
                this.f19091b.lambda$removeWebBrowserException$517();
                return;
            case 7:
                this.f19091b.lambda$new$13();
                return;
            case 8:
                this.f19091b.loadAppConfig();
                return;
            case 9:
                this.f19091b.lambda$new$17();
                return;
            case 10:
                this.f19091b.lambda$new$0();
                return;
            case 11:
                this.f19091b.lambda$new$18();
                return;
            default:
                this.f19091b.lambda$new$38();
                return;
        }
    }
}
