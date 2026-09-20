package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f16259a;
    public final MessagesController f16260b;
    public final Runnable f16261c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f16259a = 1;
        this.f16260b = messagesController;
        this.f16261c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16259a) {
            case 0:
                this.f16260b.lambda$setUserAdminRole$105(this.d, this.f16261c);
                return;
            case 1:
                this.f16260b.lambda$setCustomChatReactions$467(this.f16261c, this.d);
                return;
            default:
                this.f16260b.lambda$setUserAdminRole$99(this.d, this.f16261c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f16259a = i10;
        this.f16260b = messagesController;
        this.d = j3;
        this.f16261c = runnable;
    }
}
