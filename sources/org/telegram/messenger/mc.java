package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f15775a;
    public final MessagesController f15776b;
    public final a0.i f15777c;

    public mc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f15775a = i10;
        this.f15776b = messagesController;
        this.f15777c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f15775a) {
            case 0:
                this.f15776b.lambda$processUpdateArray$407(this.f15777c);
                return;
            case 1:
                this.f15776b.lambda$processUpdateArray$406(this.f15777c);
                return;
            default:
                this.f15776b.lambda$getChannelDifference$340(this.f15777c);
                return;
        }
    }
}
