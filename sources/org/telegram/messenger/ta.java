package org.telegram.messenger;
public final class ta implements Runnable {
    public final int f18485a;
    public final MessagesController f18486b;
    public final lf.t f18487c;

    public ta(MessagesController messagesController, lf.t tVar, int i10) {
        this.f18485a = i10;
        this.f18486b = messagesController;
        this.f18487c = tVar;
    }

    @Override
    public final void run() {
        switch (this.f18485a) {
            case 0:
                this.f18486b.lambda$processUpdateArray$402(this.f18487c);
                return;
            case 1:
                this.f18486b.lambda$processUpdateArray$404(this.f18487c);
                return;
            default:
                this.f18486b.lambda$processUpdateArray$399(this.f18487c);
                return;
        }
    }
}
