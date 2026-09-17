package org.telegram.messenger;
public final class jb implements Runnable {
    public final int f18083a;
    public final MessagesController f18084b;
    public final a0.i f18085c;
    public final a0.i d;

    public jb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.f18083a = i10;
        this.f18084b = messagesController;
        this.f18085c = iVar;
        this.d = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f18083a) {
            case 0:
                this.f18084b.lambda$checkDeletingTask$86(this.f18085c, this.d);
                return;
            case 1:
                this.f18084b.lambda$updatePrintingStrings$170(this.f18085c, this.d);
                return;
            case 2:
                this.f18084b.lambda$getNewDeleteTask$83(this.f18085c, this.d);
                return;
            default:
                this.f18084b.lambda$checkDeletingTask$85(this.f18085c, this.d);
                return;
        }
    }
}
