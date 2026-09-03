package org.telegram.messenger;
public final class oc implements Runnable {
    public final int f17992a;
    public final MessagesController f17993b;
    public final boolean f17994c;

    public oc(int i10, MessagesController messagesController, boolean z4) {
        this.f17992a = i10;
        this.f17993b = messagesController;
        this.f17994c = z4;
    }

    @Override
    public final void run() {
        switch (this.f17992a) {
            case 0:
                this.f17993b.lambda$checkPromoInfo$164(this.f17994c);
                return;
            default:
                this.f17993b.lambda$removeFolderTemporarily$480(this.f17994c);
                return;
        }
    }
}
