package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f18361a;
    public final MessagesController f18362b;
    public final a0.i f18363c;
    public final a0.i d;

    public kb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.f18361a = i10;
        this.f18362b = messagesController;
        this.f18363c = iVar;
        this.d = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f18361a) {
            case 0:
                this.f18362b.lambda$checkDeletingTask$86(this.f18363c, this.d);
                return;
            case 1:
                this.f18362b.lambda$updatePrintingStrings$170(this.f18363c, this.d);
                return;
            case 2:
                this.f18362b.lambda$getNewDeleteTask$83(this.f18363c, this.d);
                return;
            default:
                this.f18362b.lambda$checkDeletingTask$85(this.f18363c, this.d);
                return;
        }
    }
}
