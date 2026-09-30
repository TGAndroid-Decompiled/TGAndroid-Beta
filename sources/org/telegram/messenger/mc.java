package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f17012a;
    public final MessagesController f17013b;
    public final boolean f17014c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f17012a = i10;
        this.f17013b = messagesController;
        this.f17014c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17012a) {
            case 0:
                this.f17013b.lambda$checkPromoInfo$164(this.f17014c);
                return;
            default:
                this.f17013b.lambda$removeFolderTemporarily$480(this.f17014c);
                return;
        }
    }
}
