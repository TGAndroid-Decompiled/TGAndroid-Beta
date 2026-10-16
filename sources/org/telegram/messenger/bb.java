package org.telegram.messenger;
public final class bb implements Runnable {
    public final int f16564a;
    public final MessagesController f16565b;
    public final a0.h f16566c;

    public bb(MessagesController messagesController, a0.h hVar, int i10) {
        this.f16564a = i10;
        this.f16565b = messagesController;
        this.f16566c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f16564a) {
            case 0:
                this.f16565b.lambda$processUpdateArray$409(this.f16566c);
                return;
            case 1:
                this.f16565b.lambda$processUpdateArray$410(this.f16566c);
                return;
            default:
                this.f16565b.lambda$getChannelDifference$339(this.f16566c);
                return;
        }
    }
}
