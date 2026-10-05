package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f18969a;
    public final MessagesController f18970b;
    public final r f18971c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f18969a = i10;
        this.f18970b = messagesController;
        this.f18971c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f18969a) {
            case 0:
                this.f18970b.lambda$processUpdateArray$402(this.f18971c);
                return;
            case 1:
                this.f18970b.lambda$processUpdateArray$404(this.f18971c);
                return;
            default:
                this.f18970b.lambda$processUpdateArray$399(this.f18971c);
                return;
        }
    }
}
