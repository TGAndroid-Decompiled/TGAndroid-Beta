package org.telegram.messenger;
public final class sb implements Runnable {
    public final int f21222a;
    public final MessagesController f21223b;
    public final a0.h f21224c;
    public final a0.h d;

    public sb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f21222a = i10;
        this.f21223b = messagesController;
        this.f21224c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f21222a) {
            case 0:
                this.f21223b.lambda$checkDeletingTask$85(this.f21224c, this.d);
                return;
            case 1:
                this.f21223b.lambda$updatePrintingStrings$169(this.f21224c, this.d);
                return;
            case 2:
                this.f21223b.lambda$getNewDeleteTask$82(this.f21224c, this.d);
                return;
            default:
                this.f21223b.lambda$checkDeletingTask$84(this.f21224c, this.d);
                return;
        }
    }
}
