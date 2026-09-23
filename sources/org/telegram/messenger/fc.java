package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f16106a;
    public final MessagesController f16107b;
    public final a0.i f16108c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f16106a = i10;
        this.f16107b = messagesController;
        this.f16108c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16106a) {
            case 0:
                this.f16107b.lambda$processUpdateArray$407(this.f16108c);
                return;
            case 1:
                this.f16107b.lambda$processUpdateArray$406(this.f16108c);
                return;
            default:
                this.f16107b.lambda$getChannelDifference$340(this.f16108c);
                return;
        }
    }
}
