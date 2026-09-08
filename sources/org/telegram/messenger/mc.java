package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f18393a;
    public final MessagesController f18394b;
    public final boolean f18395c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f18393a = i10;
        this.f18394b = messagesController;
        this.f18395c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18393a) {
            case 0:
                this.f18394b.lambda$checkPromoInfo$164(this.f18395c);
                return;
            default:
                this.f18394b.lambda$removeFolderTemporarily$480(this.f18395c);
                return;
        }
    }
}
