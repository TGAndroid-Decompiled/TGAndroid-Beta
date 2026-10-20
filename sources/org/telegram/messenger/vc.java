package org.telegram.messenger;
public final class vc implements Runnable {
    public final int f19741a;
    public final MessagesController f19742b;
    public final boolean f19743c;

    public vc(int i10, MessagesController messagesController, boolean z10) {
        this.f19741a = i10;
        this.f19742b = messagesController;
        this.f19743c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19741a) {
            case 0:
                this.f19742b.lambda$checkPromoInfo$163(this.f19743c);
                return;
            default:
                this.f19742b.lambda$removeFolderTemporarily$483(this.f19743c);
                return;
        }
    }
}
