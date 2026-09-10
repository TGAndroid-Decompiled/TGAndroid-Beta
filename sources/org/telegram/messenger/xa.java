package org.telegram.messenger;

import xf.r;
public final class xa implements Runnable {
    public final int f16956a;
    public final MessagesController f16957b;
    public final r f16958c;

    public xa(MessagesController messagesController, r rVar, int i10) {
        this.f16956a = i10;
        this.f16957b = messagesController;
        this.f16958c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f16956a) {
            case 0:
                this.f16957b.lambda$processUpdateArray$402(this.f16958c);
                return;
            case 1:
                this.f16957b.lambda$processUpdateArray$404(this.f16958c);
                return;
            default:
                this.f16957b.lambda$processUpdateArray$399(this.f16958c);
                return;
        }
    }
}
