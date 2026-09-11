package org.telegram.messenger;

import yf.r;
public final class pa implements Runnable {
    public final int f18695a;
    public final MessagesController f18696b;
    public final r f18697c;

    public pa(MessagesController messagesController, r rVar, int i10) {
        this.f18695a = i10;
        this.f18696b = messagesController;
        this.f18697c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f18695a) {
            case 0:
                this.f18696b.lambda$processUpdateArray$402(this.f18697c);
                return;
            case 1:
                this.f18696b.lambda$processUpdateArray$404(this.f18697c);
                return;
            default:
                this.f18696b.lambda$processUpdateArray$399(this.f18697c);
                return;
        }
    }
}
