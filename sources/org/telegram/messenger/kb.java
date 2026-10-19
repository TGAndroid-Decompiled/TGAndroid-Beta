package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f18780a;
    public final MessagesController f18781b;
    public final a0.h f18782c;
    public final a0.h d;

    public kb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f18780a = i10;
        this.f18781b = messagesController;
        this.f18782c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f18780a) {
            case 0:
                this.f18781b.lambda$checkDeletingTask$85(this.f18782c, this.d);
                return;
            case 1:
                this.f18781b.lambda$updatePrintingStrings$169(this.f18782c, this.d);
                return;
            case 2:
                this.f18781b.lambda$getNewDeleteTask$82(this.f18782c, this.d);
                return;
            default:
                this.f18781b.lambda$checkDeletingTask$84(this.f18782c, this.d);
                return;
        }
    }
}
