package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f19572a;
    public final MessagesController f19573b;
    public final boolean f19574c;

    public tc(int i10, MessagesController messagesController, boolean z10) {
        this.f19572a = i10;
        this.f19573b = messagesController;
        this.f19574c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19572a) {
            case 0:
                this.f19573b.lambda$checkPromoInfo$163(this.f19574c);
                return;
            default:
                this.f19573b.lambda$removeFolderTemporarily$483(this.f19574c);
                return;
        }
    }
}
