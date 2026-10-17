package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f19569a;
    public final MessagesController f19570b;
    public final boolean f19571c;

    public tc(int i10, MessagesController messagesController, boolean z10) {
        this.f19569a = i10;
        this.f19570b = messagesController;
        this.f19571c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19569a) {
            case 0:
                this.f19570b.lambda$checkPromoInfo$163(this.f19571c);
                return;
            default:
                this.f19570b.lambda$removeFolderTemporarily$483(this.f19571c);
                return;
        }
    }
}
