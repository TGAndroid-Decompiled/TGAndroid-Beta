package org.telegram.messenger;
public final class vc implements Runnable {
    public final int f19424a;
    public final MessagesController f19425b;
    public final boolean f19426c;

    public vc(int i10, MessagesController messagesController, boolean z10) {
        this.f19424a = i10;
        this.f19425b = messagesController;
        this.f19426c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19424a) {
            case 0:
                this.f19425b.lambda$checkPromoInfo$163(this.f19426c);
                return;
            default:
                this.f19425b.lambda$removeFolderTemporarily$483(this.f19426c);
                return;
        }
    }
}
