package org.telegram.messenger;
public final class mb implements Runnable {
    public final int f19360a;
    public final MessagesController f19361b;
    public final a0.h f19362c;
    public final a0.h d;

    public mb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f19360a = i10;
        this.f19361b = messagesController;
        this.f19362c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f19360a) {
            case 0:
                this.f19361b.lambda$checkDeletingTask$86(this.f19362c, this.d);
                return;
            case 1:
                this.f19361b.lambda$updatePrintingStrings$170(this.f19362c, this.d);
                return;
            case 2:
                this.f19361b.lambda$getNewDeleteTask$83(this.f19362c, this.d);
                return;
            default:
                this.f19361b.lambda$checkDeletingTask$85(this.f19362c, this.d);
                return;
        }
    }
}
