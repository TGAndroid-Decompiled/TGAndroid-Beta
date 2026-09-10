package org.telegram.messenger;
public final class lb implements Runnable {
    public final int f15702a;
    public final MessagesController f15703b;
    public final Runnable f15704c;
    public final long d;

    public lb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f15702a = 1;
        this.f15703b = messagesController;
        this.f15704c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f15702a) {
            case 0:
                this.f15703b.lambda$setUserAdminRole$105(this.d, this.f15704c);
                return;
            case 1:
                this.f15703b.lambda$setCustomChatReactions$467(this.f15704c, this.d);
                return;
            default:
                this.f15703b.lambda$setUserAdminRole$99(this.d, this.f15704c);
                return;
        }
    }

    public lb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f15702a = i10;
        this.f15703b = messagesController;
        this.d = j3;
        this.f15704c = runnable;
    }
}
