package org.telegram.messenger;

public final class jb implements Runnable {

    public final int f20666a;

    public final MessagesController f20667b;

    public final a0.h f20668c;
    public final a0.h d;

    public jb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f20666a = i10;
        this.f20667b = messagesController;
        this.f20668c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f20666a) {
            case 0:
                this.f20667b.lambda$checkDeletingTask$86(this.f20668c, this.d);
                break;
            case 1:
                this.f20667b.lambda$updatePrintingStrings$170(this.f20668c, this.d);
                break;
            case 2:
                this.f20667b.lambda$getNewDeleteTask$83(this.f20668c, this.d);
                break;
            default:
                this.f20667b.lambda$checkDeletingTask$85(this.f20668c, this.d);
                break;
        }
    }
}
