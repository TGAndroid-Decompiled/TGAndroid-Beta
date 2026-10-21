package org.telegram.messenger;
public final class vc implements Runnable {
    public final int f19738a;
    public final MessagesController f19739b;
    public final boolean f19740c;

    public vc(int i10, MessagesController messagesController, boolean z10) {
        this.f19738a = i10;
        this.f19739b = messagesController;
        this.f19740c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19738a) {
            case 0:
                this.f19739b.lambda$checkPromoInfo$163(this.f19740c);
                return;
            default:
                this.f19739b.lambda$removeFolderTemporarily$483(this.f19740c);
                return;
        }
    }
}
