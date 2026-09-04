package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f18775a;
    public final MessagesController f18776b;
    public final r f18777c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f18775a = i10;
        this.f18776b = messagesController;
        this.f18777c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f18775a) {
            case 0:
                this.f18776b.lambda$processUpdateArray$402(this.f18777c);
                return;
            case 1:
                this.f18776b.lambda$processUpdateArray$404(this.f18777c);
                return;
            default:
                this.f18776b.lambda$processUpdateArray$399(this.f18777c);
                return;
        }
    }
}
