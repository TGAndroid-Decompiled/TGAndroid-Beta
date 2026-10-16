package org.telegram.messenger;
public final class db implements Runnable {
    public final int f16765a;
    public final MessagesController f16766b;
    public final zf.s f16767c;

    public db(MessagesController messagesController, zf.s sVar, int i10) {
        this.f16765a = i10;
        this.f16766b = messagesController;
        this.f16767c = sVar;
    }

    @Override
    public final void run() {
        switch (this.f16765a) {
            case 0:
                this.f16766b.lambda$processUpdateArray$402(this.f16767c);
                return;
            case 1:
                this.f16766b.lambda$processUpdateArray$405(this.f16767c);
                return;
            default:
                this.f16766b.lambda$processUpdateArray$407(this.f16767c);
                return;
        }
    }
}
