package org.telegram.messenger;
public final class lb implements Runnable {
    public final int f20846a;
    public final MessagesController f20847b;
    public final a0.h f20848c;
    public final a0.h d;

    public lb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f20846a = i10;
        this.f20847b = messagesController;
        this.f20848c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f20846a) {
            case 0:
                this.f20847b.lambda$checkDeletingTask$86(this.f20848c, this.d);
                return;
            case 1:
                this.f20847b.lambda$updatePrintingStrings$170(this.f20848c, this.d);
                return;
            case 2:
                this.f20847b.lambda$getNewDeleteTask$83(this.f20848c, this.d);
                return;
            default:
                this.f20847b.lambda$checkDeletingTask$85(this.f20848c, this.d);
                return;
        }
    }
}
