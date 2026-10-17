package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f18776a;
    public final MessagesController f18777b;
    public final a0.h f18778c;
    public final a0.h d;

    public kb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f18776a = i10;
        this.f18777b = messagesController;
        this.f18778c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f18776a) {
            case 0:
                this.f18777b.lambda$checkDeletingTask$85(this.f18778c, this.d);
                return;
            case 1:
                this.f18777b.lambda$updatePrintingStrings$169(this.f18778c, this.d);
                return;
            case 2:
                this.f18777b.lambda$getNewDeleteTask$82(this.f18778c, this.d);
                return;
            default:
                this.f18777b.lambda$checkDeletingTask$84(this.f18778c, this.d);
                return;
        }
    }
}
