package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f17028a;
    public final MessagesController f17029b;
    public final boolean f17030c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f17028a = i10;
        this.f17029b = messagesController;
        this.f17030c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17028a) {
            case 0:
                this.f17029b.lambda$checkPromoInfo$164(this.f17030c);
                return;
            default:
                this.f17029b.lambda$removeFolderTemporarily$480(this.f17030c);
                return;
        }
    }
}
