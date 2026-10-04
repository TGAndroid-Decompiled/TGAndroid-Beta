package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f18571a;
    public final MessagesController f18572b;
    public final boolean f18573c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f18571a = i10;
        this.f18572b = messagesController;
        this.f18573c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18571a) {
            case 0:
                this.f18572b.lambda$checkPromoInfo$164(this.f18573c);
                return;
            default:
                this.f18572b.lambda$removeFolderTemporarily$480(this.f18573c);
                return;
        }
    }
}
