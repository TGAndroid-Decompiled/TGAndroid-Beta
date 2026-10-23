package org.telegram.messenger;
public final class xc implements Runnable {
    public final int f20075a;
    public final MessagesController f20076b;
    public final boolean f20077c;

    public xc(int i10, MessagesController messagesController, boolean z10) {
        this.f20075a = i10;
        this.f20076b = messagesController;
        this.f20077c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20075a) {
            case 0:
                this.f20076b.lambda$checkPromoInfo$163(this.f20077c);
                return;
            default:
                this.f20076b.lambda$removeFolderTemporarily$483(this.f20077c);
                return;
        }
    }
}
