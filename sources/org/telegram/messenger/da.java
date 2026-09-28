package org.telegram.messenger;
public final class da implements Runnable {
    public final int f16200a;
    public final MessagesController f16201b;
    public final int f16202c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f16200a = i11;
        this.f16201b = messagesController;
        this.f16202c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16200a) {
            case 0:
                this.f16201b.lambda$updateTimerProc$157(this.f16202c);
                return;
            case 1:
                this.f16201b.lambda$onFolderEmpty$197(this.f16202c);
                return;
            case 2:
                this.f16201b.lambda$ensureMessagesLoaded$462(this.f16202c);
                return;
            default:
                this.f16201b.lambda$didAddedNewTask$81(this.f16202c);
                return;
        }
    }
}
