package org.telegram.messenger;
public final class nc implements Runnable {
    public final int f21057a;
    public final MessagesController f21058b;
    public final boolean f21059c;

    public nc(int i10, MessagesController messagesController, boolean z10) {
        this.f21057a = i10;
        this.f21058b = messagesController;
        this.f21059c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21057a) {
            case 0:
                this.f21058b.lambda$checkPromoInfo$164(this.f21059c);
                return;
            default:
                this.f21058b.lambda$removeFolderTemporarily$480(this.f21059c);
                return;
        }
    }
}
