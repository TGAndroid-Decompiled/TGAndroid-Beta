package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f17127a;
    public final MessagesController f17128b;
    public final r f17129c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f17127a = i10;
        this.f17128b = messagesController;
        this.f17129c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17127a) {
            case 0:
                this.f17128b.lambda$processUpdateArray$402(this.f17129c);
                return;
            case 1:
                this.f17128b.lambda$processUpdateArray$404(this.f17129c);
                return;
            default:
                this.f17128b.lambda$processUpdateArray$399(this.f17129c);
                return;
        }
    }
}
