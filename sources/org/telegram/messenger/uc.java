package org.telegram.messenger;
public final class uc implements Runnable {
    public final int f21418a;
    public final MessagesController f21419b;
    public final boolean f21420c;

    public uc(int i10, MessagesController messagesController, boolean z10) {
        this.f21418a = i10;
        this.f21419b = messagesController;
        this.f21420c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21418a) {
            case 0:
                this.f21419b.lambda$checkPromoInfo$163(this.f21420c);
                return;
            default:
                this.f21419b.lambda$removeFolderTemporarily$485(this.f21420c);
                return;
        }
    }
}
