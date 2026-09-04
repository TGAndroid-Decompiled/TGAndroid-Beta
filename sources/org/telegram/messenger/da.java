package org.telegram.messenger;
public final class da implements Runnable {
    public final int f17464a;
    public final MessagesController f17465b;
    public final int f17466c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f17464a = i11;
        this.f17465b = messagesController;
        this.f17466c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17464a) {
            case 0:
                this.f17465b.lambda$updateTimerProc$157(this.f17466c);
                return;
            case 1:
                this.f17465b.lambda$onFolderEmpty$197(this.f17466c);
                return;
            case 2:
                this.f17465b.lambda$ensureMessagesLoaded$462(this.f17466c);
                return;
            default:
                this.f17465b.lambda$didAddedNewTask$81(this.f17466c);
                return;
        }
    }
}
