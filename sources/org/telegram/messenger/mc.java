package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f17011a;
    public final MessagesController f17012b;
    public final boolean f17013c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f17011a = i10;
        this.f17012b = messagesController;
        this.f17013c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17011a) {
            case 0:
                this.f17012b.lambda$checkPromoInfo$164(this.f17013c);
                return;
            default:
                this.f17012b.lambda$removeFolderTemporarily$480(this.f17013c);
                return;
        }
    }
}
