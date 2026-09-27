package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f17006a;
    public final MessagesController f17007b;
    public final boolean f17008c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f17006a = i10;
        this.f17007b = messagesController;
        this.f17008c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17006a) {
            case 0:
                this.f17007b.lambda$checkPromoInfo$164(this.f17008c);
                return;
            default:
                this.f17007b.lambda$removeFolderTemporarily$480(this.f17008c);
                return;
        }
    }
}
