package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f16757a;
    public final MessagesController f16758b;
    public final a0.i f16759c;
    public final a0.i d;

    public kb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.f16757a = i10;
        this.f16758b = messagesController;
        this.f16759c = iVar;
        this.d = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f16757a) {
            case 0:
                this.f16758b.lambda$checkDeletingTask$86(this.f16759c, this.d);
                return;
            case 1:
                this.f16758b.lambda$updatePrintingStrings$170(this.f16759c, this.d);
                return;
            case 2:
                this.f16758b.lambda$getNewDeleteTask$83(this.f16759c, this.d);
                return;
            default:
                this.f16758b.lambda$checkDeletingTask$85(this.f16759c, this.d);
                return;
        }
    }
}
