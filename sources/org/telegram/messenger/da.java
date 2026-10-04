package org.telegram.messenger;
public final class da implements Runnable {
    public final int f17659a;
    public final MessagesController f17660b;
    public final int f17661c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f17659a = i11;
        this.f17660b = messagesController;
        this.f17661c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17659a) {
            case 0:
                this.f17660b.lambda$updateTimerProc$157(this.f17661c);
                return;
            case 1:
                this.f17660b.lambda$onFolderEmpty$197(this.f17661c);
                return;
            case 2:
                this.f17660b.lambda$ensureMessagesLoaded$462(this.f17661c);
                return;
            default:
                this.f17660b.lambda$didAddedNewTask$81(this.f17661c);
                return;
        }
    }
}
