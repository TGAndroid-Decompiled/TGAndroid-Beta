package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f18360a;
    public final MessagesController f18361b;
    public final a0.i f18362c;
    public final a0.i d;

    public kb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.f18360a = i10;
        this.f18361b = messagesController;
        this.f18362c = iVar;
        this.d = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f18360a) {
            case 0:
                this.f18361b.lambda$checkDeletingTask$86(this.f18362c, this.d);
                return;
            case 1:
                this.f18361b.lambda$updatePrintingStrings$170(this.f18362c, this.d);
                return;
            case 2:
                this.f18361b.lambda$getNewDeleteTask$83(this.f18362c, this.d);
                return;
            default:
                this.f18361b.lambda$checkDeletingTask$85(this.f18362c, this.d);
                return;
        }
    }
}
