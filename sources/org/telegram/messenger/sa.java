package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f21530a;
    public final MessagesController f21531b;
    public final jf.t f21532c;

    public sa(MessagesController messagesController, jf.t tVar, int i10) {
        this.f21530a = i10;
        this.f21531b = messagesController;
        this.f21532c = tVar;
    }

    @Override
    public final void run() {
        switch (this.f21530a) {
            case 0:
                this.f21531b.lambda$processUpdateArray$402(this.f21532c);
                return;
            case 1:
                this.f21531b.lambda$processUpdateArray$404(this.f21532c);
                return;
            default:
                this.f21531b.lambda$processUpdateArray$399(this.f21532c);
                return;
        }
    }
}
