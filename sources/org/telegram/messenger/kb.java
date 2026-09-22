package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f16816a;
    public final MessagesController f16817b;
    public final a0.i f16818c;
    public final a0.i d;

    public kb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.f16816a = i10;
        this.f16817b = messagesController;
        this.f16818c = iVar;
        this.d = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f16816a) {
            case 0:
                this.f16817b.lambda$checkDeletingTask$86(this.f16818c, this.d);
                return;
            case 1:
                this.f16817b.lambda$updatePrintingStrings$170(this.f16818c, this.d);
                return;
            case 2:
                this.f16817b.lambda$getNewDeleteTask$83(this.f16818c, this.d);
                return;
            default:
                this.f16817b.lambda$checkDeletingTask$85(this.f16818c, this.d);
                return;
        }
    }
}
