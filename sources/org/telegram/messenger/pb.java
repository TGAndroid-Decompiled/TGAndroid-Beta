package org.telegram.messenger;
public final class pb implements Runnable {
    public final int f17794a;
    public final MessagesController f17795b;
    public final a0.h f17796c;
    public final a0.h d;

    public pb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f17794a = i10;
        this.f17795b = messagesController;
        this.f17796c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f17794a) {
            case 0:
                this.f17795b.lambda$checkDeletingTask$85(this.f17796c, this.d);
                return;
            case 1:
                this.f17795b.lambda$updatePrintingStrings$169(this.f17796c, this.d);
                return;
            case 2:
                this.f17795b.lambda$getNewDeleteTask$82(this.f17796c, this.d);
                return;
            default:
                this.f17795b.lambda$checkDeletingTask$84(this.f17796c, this.d);
                return;
        }
    }
}
