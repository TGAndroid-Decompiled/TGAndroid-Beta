package org.telegram.messenger;
public final class mb implements Runnable {
    public final int f17838a;
    public final MessagesController f17839b;
    public final a0.h f17840c;
    public final a0.h d;

    public mb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f17838a = i10;
        this.f17839b = messagesController;
        this.f17840c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f17838a) {
            case 0:
                this.f17839b.lambda$checkDeletingTask$86(this.f17840c, this.d);
                return;
            case 1:
                this.f17839b.lambda$updatePrintingStrings$170(this.f17840c, this.d);
                return;
            case 2:
                this.f17839b.lambda$getNewDeleteTask$83(this.f17840c, this.d);
                return;
            default:
                this.f17839b.lambda$checkDeletingTask$85(this.f17840c, this.d);
                return;
        }
    }
}
