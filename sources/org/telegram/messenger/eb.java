package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f16282a;
    public final MessagesController f16283b;
    public final Runnable f16284c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f16282a = 1;
        this.f16283b = messagesController;
        this.f16284c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16282a) {
            case 0:
                this.f16283b.lambda$setUserAdminRole$105(this.d, this.f16284c);
                return;
            case 1:
                this.f16283b.lambda$setCustomChatReactions$467(this.f16284c, this.d);
                return;
            default:
                this.f16283b.lambda$setUserAdminRole$99(this.d, this.f16284c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f16282a = i10;
        this.f16283b = messagesController;
        this.d = j3;
        this.f16284c = runnable;
    }
}
