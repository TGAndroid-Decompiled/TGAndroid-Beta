package org.telegram.messenger;
public final class bb implements Runnable {
    public final int f17167a;
    public final MessagesController f17168b;
    public final a0.i f17169c;

    public bb(MessagesController messagesController, a0.i iVar, int i10) {
        this.f17167a = i10;
        this.f17168b = messagesController;
        this.f17169c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17167a) {
            case 0:
                this.f17168b.lambda$processUpdateArray$409(this.f17169c);
                return;
            case 1:
                this.f17168b.lambda$processUpdateArray$410(this.f17169c);
                return;
            default:
                this.f17168b.lambda$getChannelDifference$339(this.f17169c);
                return;
        }
    }
}
