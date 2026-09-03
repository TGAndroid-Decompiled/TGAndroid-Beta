package org.telegram.messenger;
public final class ta implements Runnable {
    public final int f20087a;
    public final MessagesController f20088b;
    public final lf.t f20089c;

    public ta(MessagesController messagesController, lf.t tVar, int i10) {
        this.f20087a = i10;
        this.f20088b = messagesController;
        this.f20089c = tVar;
    }

    @Override
    public final void run() {
        switch (this.f20087a) {
            case 0:
                this.f20088b.lambda$processUpdateArray$402(this.f20089c);
                return;
            case 1:
                this.f20088b.lambda$processUpdateArray$404(this.f20089c);
                return;
            default:
                this.f20088b.lambda$processUpdateArray$399(this.f20089c);
                return;
        }
    }
}
