package org.telegram.messenger;
public final class vc implements Runnable {
    public final int f19460a;
    public final MessagesController f19461b;
    public final boolean f19462c;

    public vc(int i10, MessagesController messagesController, boolean z10) {
        this.f19460a = i10;
        this.f19461b = messagesController;
        this.f19462c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19460a) {
            case 0:
                this.f19461b.lambda$checkPromoInfo$163(this.f19462c);
                return;
            default:
                this.f19461b.lambda$removeFolderTemporarily$483(this.f19462c);
                return;
        }
    }
}
