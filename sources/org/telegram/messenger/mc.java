package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f16982a;
    public final MessagesController f16983b;
    public final boolean f16984c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f16982a = i10;
        this.f16983b = messagesController;
        this.f16984c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16982a) {
            case 0:
                this.f16983b.lambda$checkPromoInfo$164(this.f16984c);
                return;
            default:
                this.f16983b.lambda$removeFolderTemporarily$480(this.f16984c);
                return;
        }
    }
}
