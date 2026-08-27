package org.telegram.messenger;

public final class lc implements Runnable {

    public final int f20869a;

    public final MessagesController f20870b;

    public final boolean f20871c;

    public lc(int i10, MessagesController messagesController, boolean z10) {
        this.f20869a = i10;
        this.f20870b = messagesController;
        this.f20871c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20869a) {
            case 0:
                this.f20870b.lambda$checkPromoInfo$164(this.f20871c);
                break;
            default:
                this.f20870b.lambda$removeFolderTemporarily$480(this.f20871c);
                break;
        }
    }
}
