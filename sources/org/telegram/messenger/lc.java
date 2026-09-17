package org.telegram.messenger;
public final class lc implements Runnable {
    public final int f18289a;
    public final MessagesController f18290b;
    public final boolean f18291c;

    public lc(int i10, MessagesController messagesController, boolean z10) {
        this.f18289a = i10;
        this.f18290b = messagesController;
        this.f18291c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18289a) {
            case 0:
                this.f18290b.lambda$checkPromoInfo$164(this.f18291c);
                return;
            default:
                this.f18290b.lambda$removeFolderTemporarily$480(this.f18291c);
                return;
        }
    }
}
