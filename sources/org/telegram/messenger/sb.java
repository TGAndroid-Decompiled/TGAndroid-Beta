package org.telegram.messenger;
public final class sb implements Runnable {
    public final int f21200a;
    public final MessagesController f21201b;
    public final a0.h f21202c;
    public final a0.h d;

    public sb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f21200a = i10;
        this.f21201b = messagesController;
        this.f21202c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f21200a) {
            case 0:
                this.f21201b.lambda$checkDeletingTask$85(this.f21202c, this.d);
                return;
            case 1:
                this.f21201b.lambda$updatePrintingStrings$169(this.f21202c, this.d);
                return;
            case 2:
                this.f21201b.lambda$getNewDeleteTask$82(this.f21202c, this.d);
                return;
            default:
                this.f21201b.lambda$checkDeletingTask$84(this.f21202c, this.d);
                return;
        }
    }
}
