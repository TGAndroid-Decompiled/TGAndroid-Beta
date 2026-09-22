package org.telegram.messenger;
public final class da implements Runnable {
    public final int f16196a;
    public final MessagesController f16197b;
    public final int f16198c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f16196a = i11;
        this.f16197b = messagesController;
        this.f16198c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16196a) {
            case 0:
                this.f16197b.lambda$updateTimerProc$157(this.f16198c);
                return;
            case 1:
                this.f16197b.lambda$onFolderEmpty$197(this.f16198c);
                return;
            case 2:
                this.f16197b.lambda$ensureMessagesLoaded$462(this.f16198c);
                return;
            default:
                this.f16197b.lambda$didAddedNewTask$81(this.f16198c);
                return;
        }
    }
}
