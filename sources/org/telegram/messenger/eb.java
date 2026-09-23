package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f16019a;
    public final MessagesController f16020b;
    public final Runnable f16021c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f16019a = 1;
        this.f16020b = messagesController;
        this.f16021c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16019a) {
            case 0:
                this.f16020b.lambda$setUserAdminRole$105(this.d, this.f16021c);
                return;
            case 1:
                this.f16020b.lambda$setCustomChatReactions$467(this.f16021c, this.d);
                return;
            default:
                this.f16020b.lambda$setUserAdminRole$99(this.d, this.f16021c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f16019a = i10;
        this.f16020b = messagesController;
        this.d = j3;
        this.f16021c = runnable;
    }
}
