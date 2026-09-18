package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f16937a;
    public final MessagesController f16938b;
    public final boolean f16939c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f16937a = i10;
        this.f16938b = messagesController;
        this.f16939c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16937a) {
            case 0:
                this.f16938b.lambda$checkPromoInfo$164(this.f16939c);
                return;
            default:
                this.f16938b.lambda$removeFolderTemporarily$480(this.f16939c);
                return;
        }
    }
}
