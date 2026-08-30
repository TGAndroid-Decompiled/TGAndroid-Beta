package org.telegram.messenger;
public final class oc implements Runnable {
    public final int f18015a;
    public final MessagesController f18016b;
    public final boolean f18017c;

    public oc(int i10, MessagesController messagesController, boolean z4) {
        this.f18015a = i10;
        this.f18016b = messagesController;
        this.f18017c = z4;
    }

    @Override
    public final void run() {
        switch (this.f18015a) {
            case 0:
                this.f18016b.lambda$checkPromoInfo$164(this.f18017c);
                return;
            default:
                this.f18016b.lambda$removeFolderTemporarily$480(this.f18017c);
                return;
        }
    }
}
