package org.telegram.messenger;
public final class bb implements Runnable {
    public final int f16864a;
    public final MessagesController f16865b;
    public final a0.h f16866c;

    public bb(MessagesController messagesController, a0.h hVar, int i10) {
        this.f16864a = i10;
        this.f16865b = messagesController;
        this.f16866c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f16864a) {
            case 0:
                this.f16865b.lambda$processUpdateArray$409(this.f16866c);
                return;
            case 1:
                this.f16865b.lambda$processUpdateArray$410(this.f16866c);
                return;
            default:
                this.f16865b.lambda$getChannelDifference$339(this.f16866c);
                return;
        }
    }
}
