package org.telegram.messenger;
public final class mb implements Runnable {
    public final int f18552a;
    public final MessagesController f18553b;
    public final a0.i f18554c;
    public final a0.i d;

    public mb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.f18552a = i10;
        this.f18553b = messagesController;
        this.f18554c = iVar;
        this.d = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f18552a) {
            case 0:
                this.f18553b.lambda$checkDeletingTask$85(this.f18554c, this.d);
                return;
            case 1:
                this.f18553b.lambda$updatePrintingStrings$169(this.f18554c, this.d);
                return;
            case 2:
                this.f18553b.lambda$getNewDeleteTask$82(this.f18554c, this.d);
                return;
            default:
                this.f18553b.lambda$checkDeletingTask$84(this.f18554c, this.d);
                return;
        }
    }
}
