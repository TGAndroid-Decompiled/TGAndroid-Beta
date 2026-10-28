package org.telegram.messenger;
public final class ce implements Runnable {
    public final int f19826a;
    public final MessagesController f19827b;

    public ce(MessagesController messagesController, int i10) {
        this.f19826a = i10;
        this.f19827b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f19826a) {
            case 0:
                this.f19827b.lambda$toggleChatJoinToSend$278();
                return;
            case 1:
                this.f19827b.lambda$toggleChannelInvitesHistory$286();
                return;
            case 2:
                this.f19827b.lambda$markAllTopicsAsRead$6();
                return;
            case 3:
                this.f19827b.lambda$removeWebBrowserException$520();
                return;
            case 4:
                this.f19827b.lambda$removeWebBrowserException$520();
                return;
            case 5:
                this.f19827b.lambda$new$13();
                return;
            case 6:
                this.f19827b.loadAppConfig();
                return;
            case 7:
                this.f19827b.lambda$new$17();
                return;
            case 8:
                this.f19827b.lambda$new$0();
                return;
            case 9:
                this.f19827b.lambda$new$18();
                return;
            case 10:
                this.f19827b.lambda$new$38();
                return;
            case 11:
                this.f19827b.requestIsUserContactBlocked();
                return;
            default:
                this.f19827b.lambda$new$511();
                return;
        }
    }
}
