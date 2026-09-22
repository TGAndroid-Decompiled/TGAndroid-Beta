package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f16114a;
    public final MessagesController f16115b;
    public final a0.i f16116c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f16114a = i10;
        this.f16115b = messagesController;
        this.f16116c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16114a) {
            case 0:
                this.f16115b.lambda$processUpdateArray$407(this.f16116c);
                return;
            case 1:
                this.f16115b.lambda$processUpdateArray$406(this.f16116c);
                return;
            default:
                this.f16115b.lambda$getChannelDifference$340(this.f16116c);
                return;
        }
    }
}
