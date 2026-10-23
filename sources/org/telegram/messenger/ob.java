package org.telegram.messenger;
public final class ob implements Runnable {
    public final int f19192a;
    public final MessagesController f19193b;
    public final a0.h f19194c;
    public final a0.h d;

    public ob(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.f19192a = i10;
        this.f19193b = messagesController;
        this.f19194c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        switch (this.f19192a) {
            case 0:
                this.f19193b.lambda$checkDeletingTask$85(this.f19194c, this.d);
                return;
            case 1:
                this.f19193b.lambda$updatePrintingStrings$169(this.f19194c, this.d);
                return;
            case 2:
                this.f19193b.lambda$getNewDeleteTask$82(this.f19194c, this.d);
                return;
            default:
                this.f19193b.lambda$checkDeletingTask$84(this.f19194c, this.d);
                return;
        }
    }
}
