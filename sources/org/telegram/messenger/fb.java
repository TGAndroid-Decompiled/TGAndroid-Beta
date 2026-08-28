package org.telegram.messenger;
public final class fb implements Runnable {
    public final int f20278a;
    public final MessagesController f20279b;
    public final a0.h f20280c;
    public final a0.h d;

    public fb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i9) {
        this.f20278a = i9;
        this.f20279b = messagesController;
        this.f20280c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f20278a) {
            case 0:
                this.f20279b.lambda$checkDeletingTask$86(this.f20280c, this.d);
                return;
            case 1:
                this.f20279b.lambda$updatePrintingStrings$170(this.f20280c, this.d);
                return;
            case 2:
                this.f20279b.lambda$getNewDeleteTask$83(this.f20280c, this.d);
                return;
            default:
                this.f20279b.lambda$checkDeletingTask$85(this.f20280c, this.d);
                return;
        }
    }
}
