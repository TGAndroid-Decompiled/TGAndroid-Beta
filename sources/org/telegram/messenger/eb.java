package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f16267a;
    public final MessagesController f16268b;
    public final Runnable f16269c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f16267a = 1;
        this.f16268b = messagesController;
        this.f16269c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16267a) {
            case 0:
                this.f16268b.lambda$setUserAdminRole$105(this.d, this.f16269c);
                return;
            case 1:
                this.f16268b.lambda$setCustomChatReactions$467(this.f16269c, this.d);
                return;
            default:
                this.f16268b.lambda$setUserAdminRole$99(this.d, this.f16269c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f16267a = i10;
        this.f16268b = messagesController;
        this.d = j3;
        this.f16269c = runnable;
    }
}
