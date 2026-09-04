package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f18155a;
    public final MessagesController f18156b;
    public final a0.i f18157c;
    public final a0.i d;

    public kb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.f18155a = i10;
        this.f18156b = messagesController;
        this.f18157c = iVar;
        this.d = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f18155a) {
            case 0:
                this.f18156b.lambda$checkDeletingTask$86(this.f18157c, this.d);
                return;
            case 1:
                this.f18156b.lambda$updatePrintingStrings$170(this.f18157c, this.d);
                return;
            case 2:
                this.f18156b.lambda$getNewDeleteTask$83(this.f18157c, this.d);
                return;
            default:
                this.f18156b.lambda$checkDeletingTask$85(this.f18157c, this.d);
                return;
        }
    }
}
