package org.telegram.messenger;
public final class ga implements Runnable {
    public final int f20155a;
    public final MessagesController f20156b;
    public final ag.y f20157c;

    public ga(MessagesController messagesController, ag.y yVar, int i10) {
        this.f20155a = i10;
        this.f20156b = messagesController;
        this.f20157c = yVar;
    }

    @Override
    public final void run() {
        switch (this.f20155a) {
            case 0:
                this.f20156b.lambda$processUpdateArray$409(this.f20157c);
                return;
            case 1:
                this.f20156b.lambda$processUpdateArray$404(this.f20157c);
                return;
            default:
                this.f20156b.lambda$processUpdateArray$407(this.f20157c);
                return;
        }
    }
}
