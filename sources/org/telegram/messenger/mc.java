package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f16754a;
    public final MessagesController f16755b;
    public final boolean f16756c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f16754a = i10;
        this.f16755b = messagesController;
        this.f16756c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16754a) {
            case 0:
                this.f16755b.lambda$checkPromoInfo$164(this.f16756c);
                return;
            default:
                this.f16755b.lambda$removeFolderTemporarily$480(this.f16756c);
                return;
        }
    }
}
