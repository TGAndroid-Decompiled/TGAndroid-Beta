package org.telegram.messenger;

import yf.r;
public final class pa implements Runnable {
    public final int f18722a;
    public final MessagesController f18723b;
    public final r f18724c;

    public pa(MessagesController messagesController, r rVar, int i10) {
        this.f18722a = i10;
        this.f18723b = messagesController;
        this.f18724c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f18722a) {
            case 0:
                this.f18723b.lambda$processUpdateArray$402(this.f18724c);
                return;
            case 1:
                this.f18723b.lambda$processUpdateArray$404(this.f18724c);
                return;
            default:
                this.f18723b.lambda$processUpdateArray$399(this.f18724c);
                return;
        }
    }
}
