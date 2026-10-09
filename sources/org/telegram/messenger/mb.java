package org.telegram.messenger;
public final class mb implements Runnable {
    public final int f18514a;
    public final MessagesController f18515b;
    public final a0.i f18516c;
    public final a0.i d;

    public mb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.f18514a = i10;
        this.f18515b = messagesController;
        this.f18516c = iVar;
        this.d = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f18514a) {
            case 0:
                this.f18515b.lambda$checkDeletingTask$85(this.f18516c, this.d);
                return;
            case 1:
                this.f18515b.lambda$updatePrintingStrings$169(this.f18516c, this.d);
                return;
            case 2:
                this.f18515b.lambda$getNewDeleteTask$82(this.f18516c, this.d);
                return;
            default:
                this.f18515b.lambda$checkDeletingTask$84(this.f18516c, this.d);
                return;
        }
    }
}
