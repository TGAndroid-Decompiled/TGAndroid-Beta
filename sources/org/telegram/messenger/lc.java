package org.telegram.messenger;
public final class lc implements Runnable {
    public final int f18316a;
    public final MessagesController f18317b;
    public final boolean f18318c;

    public lc(int i10, MessagesController messagesController, boolean z10) {
        this.f18316a = i10;
        this.f18317b = messagesController;
        this.f18318c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18316a) {
            case 0:
                this.f18317b.lambda$checkPromoInfo$164(this.f18318c);
                return;
            default:
                this.f18317b.lambda$removeFolderTemporarily$480(this.f18318c);
                return;
        }
    }
}
