package org.telegram.messenger;
public final class mb implements Runnable {
    public final int f18518a;
    public final MessagesController f18519b;
    public final a0.i f18520c;
    public final a0.i d;

    public mb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.f18518a = i10;
        this.f18519b = messagesController;
        this.f18520c = iVar;
        this.d = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f18518a) {
            case 0:
                this.f18519b.lambda$checkDeletingTask$85(this.f18520c, this.d);
                return;
            case 1:
                this.f18519b.lambda$updatePrintingStrings$169(this.f18520c, this.d);
                return;
            case 2:
                this.f18519b.lambda$getNewDeleteTask$82(this.f18520c, this.d);
                return;
            default:
                this.f18519b.lambda$checkDeletingTask$84(this.f18520c, this.d);
                return;
        }
    }
}
