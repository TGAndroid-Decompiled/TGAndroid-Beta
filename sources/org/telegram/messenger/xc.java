package org.telegram.messenger;
public final class xc implements Runnable {
    public final int f20140a;
    public final MessagesController f20141b;
    public final boolean f20142c;

    public xc(int i10, MessagesController messagesController, boolean z10) {
        this.f20140a = i10;
        this.f20141b = messagesController;
        this.f20142c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20140a) {
            case 0:
                this.f20141b.lambda$checkPromoInfo$163(this.f20142c);
                return;
            default:
                this.f20141b.lambda$removeFolderTemporarily$483(this.f20142c);
                return;
        }
    }
}
