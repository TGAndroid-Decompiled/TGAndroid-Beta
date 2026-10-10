package org.telegram.messenger;
public final class vc implements Runnable {
    public final int f19426a;
    public final MessagesController f19427b;
    public final boolean f19428c;

    public vc(int i10, MessagesController messagesController, boolean z10) {
        this.f19426a = i10;
        this.f19427b = messagesController;
        this.f19428c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19426a) {
            case 0:
                this.f19427b.lambda$checkPromoInfo$163(this.f19428c);
                return;
            default:
                this.f19427b.lambda$removeFolderTemporarily$483(this.f19428c);
                return;
        }
    }
}
