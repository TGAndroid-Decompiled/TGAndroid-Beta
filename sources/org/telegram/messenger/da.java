package org.telegram.messenger;
public final class da implements Runnable {
    public final int f16201a;
    public final MessagesController f16202b;
    public final int f16203c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f16201a = i11;
        this.f16202b = messagesController;
        this.f16203c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16201a) {
            case 0:
                this.f16202b.lambda$updateTimerProc$157(this.f16203c);
                return;
            case 1:
                this.f16202b.lambda$onFolderEmpty$197(this.f16203c);
                return;
            case 2:
                this.f16202b.lambda$ensureMessagesLoaded$462(this.f16203c);
                return;
            default:
                this.f16202b.lambda$didAddedNewTask$81(this.f16203c);
                return;
        }
    }
}
