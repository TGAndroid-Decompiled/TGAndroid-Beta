package org.telegram.messenger;
public final class pb implements Runnable {
    public final int f18561a;
    public final MessagesController f18562b;
    public final a0.i f18563c;
    public final a0.i d;

    public pb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.f18561a = i10;
        this.f18562b = messagesController;
        this.f18563c = iVar;
        this.d = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f18561a) {
            case 0:
                this.f18562b.lambda$checkDeletingTask$85(this.f18563c, this.d);
                return;
            case 1:
                this.f18562b.lambda$updatePrintingStrings$169(this.f18563c, this.d);
                return;
            case 2:
                this.f18562b.lambda$getNewDeleteTask$82(this.f18563c, this.d);
                return;
            default:
                this.f18562b.lambda$checkDeletingTask$84(this.f18563c, this.d);
                return;
        }
    }
}
