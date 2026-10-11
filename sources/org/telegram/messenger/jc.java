package org.telegram.messenger;
public final class jc implements Runnable {
    public final int f18297a;
    public final MessagesController f18298b;
    public final long f18299c;
    public final Runnable d;

    public jc(long j3, Runnable runnable, MessagesController messagesController) {
        this.f18297a = 2;
        this.f18298b = messagesController;
        this.d = runnable;
        this.f18299c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18297a) {
            case 0:
                this.f18298b.lambda$setUserAdminRole$104(this.f18299c, this.d);
                return;
            case 1:
                this.f18298b.lambda$setUserAdminRole$98(this.f18299c, this.d);
                return;
            default:
                this.f18298b.lambda$setCustomChatReactions$470(this.d, this.f18299c);
                return;
        }
    }

    public jc(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f18297a = i10;
        this.f18298b = messagesController;
        this.f18299c = j3;
        this.d = runnable;
    }
}
