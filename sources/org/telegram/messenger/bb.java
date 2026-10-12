package org.telegram.messenger;
public final class bb implements Runnable {
    public final int f17166a;
    public final MessagesController f17167b;
    public final a0.i f17168c;

    public bb(MessagesController messagesController, a0.i iVar, int i10) {
        this.f17166a = i10;
        this.f17167b = messagesController;
        this.f17168c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17166a) {
            case 0:
                this.f17167b.lambda$processUpdateArray$409(this.f17168c);
                return;
            case 1:
                this.f17167b.lambda$processUpdateArray$410(this.f17168c);
                return;
            default:
                this.f17167b.lambda$getChannelDifference$339(this.f17168c);
                return;
        }
    }
}
