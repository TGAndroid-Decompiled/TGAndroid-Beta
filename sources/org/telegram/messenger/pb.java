package org.telegram.messenger;
public final class pb implements Runnable {
    public final int f19194a;
    public final MessagesController f19195b;
    public final a0.h f19196c;
    public final a0.h d;

    public pb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f19194a = i10;
        this.f19195b = messagesController;
        this.f19196c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f19194a) {
            case 0:
                this.f19195b.lambda$checkDeletingTask$85(this.f19196c, this.d);
                return;
            case 1:
                this.f19195b.lambda$updatePrintingStrings$169(this.f19196c, this.d);
                return;
            case 2:
                this.f19195b.lambda$getNewDeleteTask$82(this.f19196c, this.d);
                return;
            default:
                this.f19195b.lambda$checkDeletingTask$84(this.f19196c, this.d);
                return;
        }
    }
}
