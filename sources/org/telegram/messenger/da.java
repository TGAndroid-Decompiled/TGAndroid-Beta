package org.telegram.messenger;
public final class da implements Runnable {
    public final int f16217a;
    public final MessagesController f16218b;
    public final int f16219c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f16217a = i11;
        this.f16218b = messagesController;
        this.f16219c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16217a) {
            case 0:
                this.f16218b.lambda$updateTimerProc$157(this.f16219c);
                return;
            case 1:
                this.f16218b.lambda$onFolderEmpty$197(this.f16219c);
                return;
            case 2:
                this.f16218b.lambda$ensureMessagesLoaded$462(this.f16219c);
                return;
            default:
                this.f16218b.lambda$didAddedNewTask$81(this.f16219c);
                return;
        }
    }
}
