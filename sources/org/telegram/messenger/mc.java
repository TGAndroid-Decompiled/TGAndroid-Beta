package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f18568a;
    public final MessagesController f18569b;
    public final boolean f18570c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f18568a = i10;
        this.f18569b = messagesController;
        this.f18570c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18568a) {
            case 0:
                this.f18569b.lambda$checkPromoInfo$164(this.f18570c);
                return;
            default:
                this.f18569b.lambda$removeFolderTemporarily$480(this.f18570c);
                return;
        }
    }
}
