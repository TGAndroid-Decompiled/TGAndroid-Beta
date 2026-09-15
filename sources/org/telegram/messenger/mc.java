package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f16756a;
    public final MessagesController f16757b;
    public final boolean f16758c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f16756a = i10;
        this.f16757b = messagesController;
        this.f16758c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16756a) {
            case 0:
                this.f16757b.lambda$checkPromoInfo$164(this.f16758c);
                return;
            default:
                this.f16757b.lambda$removeFolderTemporarily$480(this.f16758c);
                return;
        }
    }
}
