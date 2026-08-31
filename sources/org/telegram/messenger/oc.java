package org.telegram.messenger;
public final class oc implements Runnable {
    public final int f19557a;
    public final MessagesController f19558b;
    public final boolean f19559c;

    public oc(int i10, MessagesController messagesController, boolean z4) {
        this.f19557a = i10;
        this.f19558b = messagesController;
        this.f19559c = z4;
    }

    @Override
    public final void run() {
        switch (this.f19557a) {
            case 0:
                this.f19558b.lambda$checkPromoInfo$164(this.f19559c);
                return;
            default:
                this.f19558b.lambda$removeFolderTemporarily$480(this.f19559c);
                return;
        }
    }
}
