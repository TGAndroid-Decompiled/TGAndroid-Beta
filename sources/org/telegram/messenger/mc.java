package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f18572a;
    public final MessagesController f18573b;
    public final boolean f18574c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f18572a = i10;
        this.f18573b = messagesController;
        this.f18574c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18572a) {
            case 0:
                this.f18573b.lambda$checkPromoInfo$164(this.f18574c);
                return;
            default:
                this.f18573b.lambda$removeFolderTemporarily$480(this.f18574c);
                return;
        }
    }
}
