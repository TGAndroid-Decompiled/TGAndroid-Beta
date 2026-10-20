package org.telegram.messenger;
public final class mb implements Runnable {
    public final int f18954a;
    public final MessagesController f18955b;
    public final a0.h f18956c;
    public final a0.h d;

    public mb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f18954a = i10;
        this.f18955b = messagesController;
        this.f18956c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f18954a) {
            case 0:
                this.f18955b.lambda$checkDeletingTask$85(this.f18956c, this.d);
                return;
            case 1:
                this.f18955b.lambda$updatePrintingStrings$169(this.f18956c, this.d);
                return;
            case 2:
                this.f18955b.lambda$getNewDeleteTask$82(this.f18956c, this.d);
                return;
            default:
                this.f18955b.lambda$checkDeletingTask$84(this.f18956c, this.d);
                return;
        }
    }
}
