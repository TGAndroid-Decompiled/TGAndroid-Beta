package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f16031a;
    public final MessagesController f16032b;
    public final Runnable f16033c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f16031a = 1;
        this.f16032b = messagesController;
        this.f16033c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16031a) {
            case 0:
                this.f16032b.lambda$setUserAdminRole$105(this.d, this.f16033c);
                return;
            case 1:
                this.f16032b.lambda$setCustomChatReactions$467(this.f16033c, this.d);
                return;
            default:
                this.f16032b.lambda$setUserAdminRole$99(this.d, this.f16033c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f16031a = i10;
        this.f16032b = messagesController;
        this.d = j3;
        this.f16033c = runnable;
    }
}
