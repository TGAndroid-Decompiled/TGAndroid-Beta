package org.telegram.messenger;

import zf.r;
public final class db implements Runnable {
    public final int f18250a;
    public final MessagesController f18251b;
    public final r f18252c;

    public db(MessagesController messagesController, r rVar, int i10) {
        this.f18250a = i10;
        this.f18251b = messagesController;
        this.f18252c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f18250a) {
            case 0:
                this.f18251b.lambda$processUpdateArray$402(this.f18252c);
                return;
            case 1:
                this.f18251b.lambda$processUpdateArray$405(this.f18252c);
                return;
            default:
                this.f18251b.lambda$processUpdateArray$407(this.f18252c);
                return;
        }
    }
}
