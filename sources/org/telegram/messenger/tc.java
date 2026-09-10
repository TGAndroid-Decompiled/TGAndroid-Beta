package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f16399a;
    public final MessagesController f16400b;
    public final boolean f16401c;

    public tc(int i10, MessagesController messagesController, boolean z10) {
        this.f16399a = i10;
        this.f16400b = messagesController;
        this.f16401c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16399a) {
            case 0:
                this.f16400b.lambda$checkPromoInfo$164(this.f16401c);
                return;
            default:
                this.f16400b.lambda$removeFolderTemporarily$480(this.f16401c);
                return;
        }
    }
}
