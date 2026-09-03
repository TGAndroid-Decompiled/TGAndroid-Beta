package org.telegram.messenger;
public final class ta implements Runnable {
    public final int f18469a;
    public final MessagesController f18470b;
    public final kf.t f18471c;

    public ta(MessagesController messagesController, kf.t tVar, int i10) {
        this.f18469a = i10;
        this.f18470b = messagesController;
        this.f18471c = tVar;
    }

    @Override
    public final void run() {
        switch (this.f18469a) {
            case 0:
                this.f18470b.lambda$processUpdateArray$402(this.f18471c);
                return;
            case 1:
                this.f18470b.lambda$processUpdateArray$404(this.f18471c);
                return;
            default:
                this.f18470b.lambda$processUpdateArray$399(this.f18471c);
                return;
        }
    }
}
