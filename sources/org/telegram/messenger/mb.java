package org.telegram.messenger;
public final class mb implements Runnable {
    public final int f18950a;
    public final MessagesController f18951b;
    public final a0.h f18952c;
    public final a0.h d;

    public mb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f18950a = i10;
        this.f18951b = messagesController;
        this.f18952c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f18950a) {
            case 0:
                this.f18951b.lambda$checkDeletingTask$85(this.f18952c, this.d);
                return;
            case 1:
                this.f18951b.lambda$updatePrintingStrings$169(this.f18952c, this.d);
                return;
            case 2:
                this.f18951b.lambda$getNewDeleteTask$82(this.f18952c, this.d);
                return;
            default:
                this.f18951b.lambda$checkDeletingTask$84(this.f18952c, this.d);
                return;
        }
    }
}
