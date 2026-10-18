package org.telegram.messenger;
public final class lb implements Runnable {
    public final int f18864a;
    public final MessagesController f18865b;
    public final a0.h f18866c;
    public final a0.h d;

    public lb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f18864a = i10;
        this.f18865b = messagesController;
        this.f18866c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f18864a) {
            case 0:
                this.f18865b.lambda$checkDeletingTask$85(this.f18866c, this.d);
                return;
            case 1:
                this.f18865b.lambda$updatePrintingStrings$169(this.f18866c, this.d);
                return;
            case 2:
                this.f18865b.lambda$getNewDeleteTask$82(this.f18866c, this.d);
                return;
            default:
                this.f18865b.lambda$checkDeletingTask$84(this.f18866c, this.d);
                return;
        }
    }
}
