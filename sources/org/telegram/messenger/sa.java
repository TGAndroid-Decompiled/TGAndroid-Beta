package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f21197a;
    public final MessagesController f21198b;
    public final ag.y f21199c;

    public sa(MessagesController messagesController, ag.y yVar, int i10) {
        this.f21197a = i10;
        this.f21198b = messagesController;
        this.f21199c = yVar;
    }

    @Override
    public final void run() {
        switch (this.f21197a) {
            case 0:
                this.f21198b.lambda$processUpdateArray$405(this.f21199c);
                return;
            case 1:
                this.f21198b.lambda$processUpdateArray$408(this.f21199c);
                return;
            default:
                this.f21198b.lambda$processUpdateArray$410(this.f21199c);
                return;
        }
    }
}
