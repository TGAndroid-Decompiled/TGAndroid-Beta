package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f18356a;
    public final MessagesController f18357b;
    public final a0.i f18358c;
    public final a0.i d;

    public kb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.f18356a = i10;
        this.f18357b = messagesController;
        this.f18358c = iVar;
        this.d = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f18356a) {
            case 0:
                this.f18357b.lambda$checkDeletingTask$86(this.f18358c, this.d);
                return;
            case 1:
                this.f18357b.lambda$updatePrintingStrings$170(this.f18358c, this.d);
                return;
            case 2:
                this.f18357b.lambda$getNewDeleteTask$83(this.f18358c, this.d);
                return;
            default:
                this.f18357b.lambda$checkDeletingTask$85(this.f18358c, this.d);
                return;
        }
    }
}
