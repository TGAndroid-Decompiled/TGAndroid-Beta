package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f16120a;
    public final MessagesController f16121b;
    public final a0.i f16122c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f16120a = i10;
        this.f16121b = messagesController;
        this.f16122c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16120a) {
            case 0:
                this.f16121b.lambda$processUpdateArray$407(this.f16122c);
                return;
            case 1:
                this.f16121b.lambda$processUpdateArray$406(this.f16122c);
                return;
            default:
                this.f16121b.lambda$getChannelDifference$340(this.f16122c);
                return;
        }
    }
}
