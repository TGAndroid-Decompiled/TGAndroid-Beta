package org.telegram.messenger;
public final class mb implements Runnable {
    public final int f17818a;
    public final MessagesController f17819b;
    public final a0.h f17820c;
    public final a0.h d;

    public mb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f17818a = i10;
        this.f17819b = messagesController;
        this.f17820c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f17818a) {
            case 0:
                this.f17819b.lambda$checkDeletingTask$86(this.f17820c, this.d);
                return;
            case 1:
                this.f17819b.lambda$updatePrintingStrings$170(this.f17820c, this.d);
                return;
            case 2:
                this.f17819b.lambda$getNewDeleteTask$83(this.f17820c, this.d);
                return;
            default:
                this.f17819b.lambda$checkDeletingTask$85(this.f17820c, this.d);
                return;
        }
    }
}
