package org.telegram.messenger;
public final class vc implements Runnable {
    public final int f19422a;
    public final MessagesController f19423b;
    public final boolean f19424c;

    public vc(int i10, MessagesController messagesController, boolean z10) {
        this.f19422a = i10;
        this.f19423b = messagesController;
        this.f19424c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19422a) {
            case 0:
                this.f19423b.lambda$checkPromoInfo$163(this.f19424c);
                return;
            default:
                this.f19423b.lambda$removeFolderTemporarily$483(this.f19424c);
                return;
        }
    }
}
