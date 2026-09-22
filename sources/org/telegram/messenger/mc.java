package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f16997a;
    public final MessagesController f16998b;
    public final boolean f16999c;

    public mc(int i10, MessagesController messagesController, boolean z10) {
        this.f16997a = i10;
        this.f16998b = messagesController;
        this.f16999c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16997a) {
            case 0:
                this.f16998b.lambda$checkPromoInfo$164(this.f16999c);
                return;
            default:
                this.f16998b.lambda$removeFolderTemporarily$480(this.f16999c);
                return;
        }
    }
}
