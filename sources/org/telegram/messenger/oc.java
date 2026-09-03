package org.telegram.messenger;
public final class oc implements Runnable {
    public final int f19559a;
    public final MessagesController f19560b;
    public final boolean f19561c;

    public oc(int i10, MessagesController messagesController, boolean z4) {
        this.f19559a = i10;
        this.f19560b = messagesController;
        this.f19561c = z4;
    }

    @Override
    public final void run() {
        switch (this.f19559a) {
            case 0:
                this.f19560b.lambda$checkPromoInfo$164(this.f19561c);
                return;
            default:
                this.f19560b.lambda$removeFolderTemporarily$480(this.f19561c);
                return;
        }
    }
}
