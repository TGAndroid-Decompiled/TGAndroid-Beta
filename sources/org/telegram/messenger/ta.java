package org.telegram.messenger;
public final class ta implements Runnable {
    public final int f20085a;
    public final MessagesController f20086b;
    public final lf.t f20087c;

    public ta(MessagesController messagesController, lf.t tVar, int i10) {
        this.f20085a = i10;
        this.f20086b = messagesController;
        this.f20087c = tVar;
    }

    @Override
    public final void run() {
        switch (this.f20085a) {
            case 0:
                this.f20086b.lambda$processUpdateArray$402(this.f20087c);
                return;
            case 1:
                this.f20086b.lambda$processUpdateArray$404(this.f20087c);
                return;
            default:
                this.f20086b.lambda$processUpdateArray$399(this.f20087c);
                return;
        }
    }
}
