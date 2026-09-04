package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f17545a;
    public final MessagesController f17546b;
    public final Runnable f17547c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f17545a = 1;
        this.f17546b = messagesController;
        this.f17547c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17545a) {
            case 0:
                this.f17546b.lambda$setUserAdminRole$105(this.d, this.f17547c);
                return;
            case 1:
                this.f17546b.lambda$setCustomChatReactions$467(this.f17547c, this.d);
                return;
            default:
                this.f17546b.lambda$setUserAdminRole$99(this.d, this.f17547c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f17545a = i10;
        this.f17546b = messagesController;
        this.d = j3;
        this.f17547c = runnable;
    }
}
