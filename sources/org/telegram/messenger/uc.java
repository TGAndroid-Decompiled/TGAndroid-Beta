package org.telegram.messenger;
public final class uc implements Runnable {
    public final int f19651a;
    public final MessagesController f19652b;
    public final boolean f19653c;

    public uc(int i10, MessagesController messagesController, boolean z10) {
        this.f19651a = i10;
        this.f19652b = messagesController;
        this.f19653c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19651a) {
            case 0:
                this.f19652b.lambda$checkPromoInfo$163(this.f19653c);
                return;
            default:
                this.f19652b.lambda$removeFolderTemporarily$483(this.f19653c);
                return;
        }
    }
}
