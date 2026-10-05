package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f18573a;
    public final MessagesController f18574b;
    public final boolean f18575c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f18573a = i10;
        this.f18574b = messagesController;
        this.f18575c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18573a) {
            case 0:
                this.f18574b.lambda$checkPromoInfo$164(this.f18575c);
                return;
            default:
                this.f18574b.lambda$removeFolderTemporarily$480(this.f18575c);
                return;
        }
    }
}
