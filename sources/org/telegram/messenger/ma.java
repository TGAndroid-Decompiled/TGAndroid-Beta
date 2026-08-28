package org.telegram.messenger;
public final class ma implements Runnable {
    public final int f20957a;
    public final MessagesController f20958b;
    public final ff.u f20959c;

    public ma(MessagesController messagesController, ff.u uVar, int i9) {
        this.f20957a = i9;
        this.f20958b = messagesController;
        this.f20959c = uVar;
    }

    @Override
    public final void run() {
        switch (this.f20957a) {
            case 0:
                this.f20958b.lambda$processUpdateArray$402(this.f20959c);
                return;
            case 1:
                this.f20958b.lambda$processUpdateArray$404(this.f20959c);
                return;
            default:
                this.f20958b.lambda$processUpdateArray$399(this.f20959c);
                return;
        }
    }
}
