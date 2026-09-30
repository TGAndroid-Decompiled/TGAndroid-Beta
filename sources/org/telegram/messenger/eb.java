package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f16298a;
    public final MessagesController f16299b;
    public final Runnable f16300c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f16298a = 1;
        this.f16299b = messagesController;
        this.f16300c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16298a) {
            case 0:
                this.f16299b.lambda$setUserAdminRole$105(this.d, this.f16300c);
                return;
            case 1:
                this.f16299b.lambda$setCustomChatReactions$467(this.f16300c, this.d);
                return;
            default:
                this.f16299b.lambda$setUserAdminRole$99(this.d, this.f16300c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f16298a = i10;
        this.f16299b = messagesController;
        this.d = j3;
        this.f16300c = runnable;
    }
}
