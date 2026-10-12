package org.telegram.messenger;
public final class db implements Runnable {
    public final int f17068a;
    public final MessagesController f17069b;
    public final zf.s f17070c;

    public db(MessagesController messagesController, zf.s sVar, int i10) {
        this.f17068a = i10;
        this.f17069b = messagesController;
        this.f17070c = sVar;
    }

    @Override
    public final void run() {
        switch (this.f17068a) {
            case 0:
                this.f17069b.lambda$processUpdateArray$402(this.f17070c);
                return;
            case 1:
                this.f17069b.lambda$processUpdateArray$405(this.f17070c);
                return;
            default:
                this.f17069b.lambda$processUpdateArray$407(this.f17070c);
                return;
        }
    }
}
