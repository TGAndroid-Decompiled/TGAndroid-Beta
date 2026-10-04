package org.telegram.messenger;
public final class da implements Runnable {
    public final int f17660a;
    public final MessagesController f17661b;
    public final int f17662c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f17660a = i11;
        this.f17661b = messagesController;
        this.f17662c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17660a) {
            case 0:
                this.f17661b.lambda$updateTimerProc$157(this.f17662c);
                return;
            case 1:
                this.f17661b.lambda$onFolderEmpty$197(this.f17662c);
                return;
            case 2:
                this.f17661b.lambda$ensureMessagesLoaded$462(this.f17662c);
                return;
            default:
                this.f17661b.lambda$didAddedNewTask$81(this.f17662c);
                return;
        }
    }
}
