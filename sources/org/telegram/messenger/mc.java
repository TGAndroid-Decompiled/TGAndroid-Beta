package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f18366a;
    public final MessagesController f18367b;
    public final boolean f18368c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f18366a = i10;
        this.f18367b = messagesController;
        this.f18368c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18366a) {
            case 0:
                this.f18367b.lambda$checkPromoInfo$164(this.f18368c);
                return;
            default:
                this.f18367b.lambda$removeFolderTemporarily$480(this.f18368c);
                return;
        }
    }
}
