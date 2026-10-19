package org.telegram.messenger;
public final class uc implements Runnable {
    public final int f19654a;
    public final MessagesController f19655b;
    public final boolean f19656c;

    public uc(int i10, MessagesController messagesController, boolean z10) {
        this.f19654a = i10;
        this.f19655b = messagesController;
        this.f19656c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19654a) {
            case 0:
                this.f19655b.lambda$checkPromoInfo$163(this.f19656c);
                return;
            default:
                this.f19655b.lambda$removeFolderTemporarily$483(this.f19656c);
                return;
        }
    }
}
