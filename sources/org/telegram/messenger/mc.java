package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f16765a;
    public final MessagesController f16766b;
    public final boolean f16767c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f16765a = i10;
        this.f16766b = messagesController;
        this.f16767c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16765a) {
            case 0:
                this.f16766b.lambda$checkPromoInfo$164(this.f16767c);
                return;
            default:
                this.f16766b.lambda$removeFolderTemporarily$480(this.f16767c);
                return;
        }
    }
}
