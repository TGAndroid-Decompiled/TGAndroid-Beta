package org.telegram.messenger;
public final class rb implements Runnable {
    public final int f16224a;
    public final MessagesController f16225b;
    public final a0.i f16226c;
    public final a0.i d;

    public rb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.f16224a = i10;
        this.f16225b = messagesController;
        this.f16226c = iVar;
        this.d = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f16224a) {
            case 0:
                this.f16225b.lambda$checkDeletingTask$86(this.f16226c, this.d);
                return;
            case 1:
                this.f16225b.lambda$updatePrintingStrings$170(this.f16226c, this.d);
                return;
            case 2:
                this.f16225b.lambda$getNewDeleteTask$83(this.f16226c, this.d);
                return;
            default:
                this.f16225b.lambda$checkDeletingTask$85(this.f16226c, this.d);
                return;
        }
    }
}
