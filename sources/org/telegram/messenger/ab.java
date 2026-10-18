package org.telegram.messenger;

import zf.r;
public final class ab implements Runnable {
    public final int f17855a;
    public final MessagesController f17856b;
    public final r f17857c;

    public ab(MessagesController messagesController, r rVar, int i10) {
        this.f17855a = i10;
        this.f17856b = messagesController;
        this.f17857c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17855a) {
            case 0:
                this.f17856b.lambda$processUpdateArray$402(this.f17857c);
                return;
            case 1:
                this.f17856b.lambda$processUpdateArray$405(this.f17857c);
                return;
            default:
                this.f17856b.lambda$processUpdateArray$407(this.f17857c);
                return;
        }
    }
}
