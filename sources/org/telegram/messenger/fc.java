package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f16298a;
    public final MessagesController f16299b;
    public final a0.i f16300c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f16298a = i10;
        this.f16299b = messagesController;
        this.f16300c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16298a) {
            case 0:
                this.f16299b.lambda$processUpdateArray$407(this.f16300c);
                return;
            case 1:
                this.f16299b.lambda$processUpdateArray$406(this.f16300c);
                return;
            default:
                this.f16299b.lambda$getChannelDifference$340(this.f16300c);
                return;
        }
    }
}
