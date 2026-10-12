package org.telegram.messenger;
public final class pb implements Runnable {
    public final int f18094a;
    public final MessagesController f18095b;
    public final a0.h f18096c;
    public final a0.h d;

    public pb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f18094a = i10;
        this.f18095b = messagesController;
        this.f18096c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f18094a) {
            case 0:
                this.f18095b.lambda$checkDeletingTask$85(this.f18096c, this.d);
                return;
            case 1:
                this.f18095b.lambda$updatePrintingStrings$169(this.f18096c, this.d);
                return;
            case 2:
                this.f18095b.lambda$getNewDeleteTask$82(this.f18096c, this.d);
                return;
            default:
                this.f18095b.lambda$checkDeletingTask$84(this.f18096c, this.d);
                return;
        }
    }
}
