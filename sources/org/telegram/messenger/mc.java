package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f16751a;
    public final MessagesController f16752b;
    public final boolean f16753c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f16751a = i10;
        this.f16752b = messagesController;
        this.f16753c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16751a) {
            case 0:
                this.f16752b.lambda$checkPromoInfo$164(this.f16753c);
                return;
            default:
                this.f16752b.lambda$removeFolderTemporarily$480(this.f16753c);
                return;
        }
    }
}
