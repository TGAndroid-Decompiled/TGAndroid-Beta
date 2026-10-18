package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f19575a;
    public final MessagesController f19576b;
    public final boolean f19577c;

    public tc(int i10, MessagesController messagesController, boolean z10) {
        this.f19575a = i10;
        this.f19576b = messagesController;
        this.f19577c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19575a) {
            case 0:
                this.f19576b.lambda$checkPromoInfo$163(this.f19577c);
                return;
            default:
                this.f19576b.lambda$removeFolderTemporarily$483(this.f19577c);
                return;
        }
    }
}
