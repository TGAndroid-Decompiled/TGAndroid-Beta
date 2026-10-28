package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f21302a;
    public final MessagesController f21303b;
    public final boolean f21304c;

    public tc(int i10, MessagesController messagesController, boolean z10) {
        this.f21302a = i10;
        this.f21303b = messagesController;
        this.f21304c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21302a) {
            case 0:
                this.f21303b.lambda$checkPromoInfo$163(this.f21304c);
                return;
            default:
                this.f21303b.lambda$removeFolderTemporarily$486(this.f21304c);
                return;
        }
    }
}
