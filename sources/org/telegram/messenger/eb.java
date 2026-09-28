package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f16281a;
    public final MessagesController f16282b;
    public final Runnable f16283c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f16281a = 1;
        this.f16282b = messagesController;
        this.f16283c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16281a) {
            case 0:
                this.f16282b.lambda$setUserAdminRole$105(this.d, this.f16283c);
                return;
            case 1:
                this.f16282b.lambda$setCustomChatReactions$467(this.f16283c, this.d);
                return;
            default:
                this.f16282b.lambda$setUserAdminRole$99(this.d, this.f16283c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f16281a = i10;
        this.f16282b = messagesController;
        this.d = j3;
        this.f16283c = runnable;
    }
}
