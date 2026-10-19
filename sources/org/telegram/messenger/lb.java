package org.telegram.messenger;
public final class lb implements Runnable {
    public final int f18867a;
    public final MessagesController f18868b;
    public final a0.h f18869c;
    public final a0.h d;

    public lb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f18867a = i10;
        this.f18868b = messagesController;
        this.f18869c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f18867a) {
            case 0:
                this.f18868b.lambda$checkDeletingTask$85(this.f18869c, this.d);
                return;
            case 1:
                this.f18868b.lambda$updatePrintingStrings$169(this.f18869c, this.d);
                return;
            case 2:
                this.f18868b.lambda$getNewDeleteTask$82(this.f18869c, this.d);
                return;
            default:
                this.f18868b.lambda$checkDeletingTask$84(this.f18869c, this.d);
                return;
        }
    }
}
