package org.telegram.messenger;
public final class hc implements Runnable {
    public final int f20487a;
    public final MessagesController f20488b;
    public final boolean f20489c;

    public hc(int i9, MessagesController messagesController, boolean z10) {
        this.f20487a = i9;
        this.f20488b = messagesController;
        this.f20489c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20487a) {
            case 0:
                this.f20488b.lambda$checkPromoInfo$164(this.f20489c);
                return;
            default:
                this.f20488b.lambda$removeFolderTemporarily$480(this.f20489c);
                return;
        }
    }
}
