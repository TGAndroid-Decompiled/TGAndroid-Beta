package org.telegram.messenger;
public final class qa implements Runnable {
    public final int f17304a;
    public final MessagesController f17305b;
    public final yf.s f17306c;

    public qa(MessagesController messagesController, yf.s sVar, int i10) {
        this.f17304a = i10;
        this.f17305b = messagesController;
        this.f17306c = sVar;
    }

    @Override
    public final void run() {
        switch (this.f17304a) {
            case 0:
                this.f17305b.lambda$processUpdateArray$402(this.f17306c);
                return;
            case 1:
                this.f17305b.lambda$processUpdateArray$404(this.f17306c);
                return;
            default:
                this.f17305b.lambda$processUpdateArray$399(this.f17306c);
                return;
        }
    }
}
