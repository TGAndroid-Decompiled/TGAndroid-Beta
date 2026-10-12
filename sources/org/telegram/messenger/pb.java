package org.telegram.messenger;
public final class pb implements Runnable {
    public final int f18562a;
    public final MessagesController f18563b;
    public final a0.i f18564c;
    public final a0.i d;

    public pb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.f18562a = i10;
        this.f18563b = messagesController;
        this.f18564c = iVar;
        this.d = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f18562a) {
            case 0:
                this.f18563b.lambda$checkDeletingTask$85(this.f18564c, this.d);
                return;
            case 1:
                this.f18563b.lambda$updatePrintingStrings$169(this.f18564c, this.d);
                return;
            case 2:
                this.f18563b.lambda$getNewDeleteTask$82(this.f18564c, this.d);
                return;
            default:
                this.f18563b.lambda$checkDeletingTask$84(this.f18564c, this.d);
                return;
        }
    }
}
