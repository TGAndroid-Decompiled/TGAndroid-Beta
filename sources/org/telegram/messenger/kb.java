package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f16824a;
    public final MessagesController f16825b;
    public final a0.i f16826c;
    public final a0.i d;

    public kb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.f16824a = i10;
        this.f16825b = messagesController;
        this.f16826c = iVar;
        this.d = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f16824a) {
            case 0:
                this.f16825b.lambda$checkDeletingTask$86(this.f16826c, this.d);
                return;
            case 1:
                this.f16825b.lambda$updatePrintingStrings$170(this.f16826c, this.d);
                return;
            case 2:
                this.f16825b.lambda$getNewDeleteTask$83(this.f16826c, this.d);
                return;
            default:
                this.f16825b.lambda$checkDeletingTask$85(this.f16826c, this.d);
                return;
        }
    }
}
