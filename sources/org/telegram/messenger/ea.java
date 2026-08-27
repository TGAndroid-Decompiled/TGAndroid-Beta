package org.telegram.messenger;

public final class ea implements Runnable {

    public final int f20135a;

    public final MessagesController f20136b;

    public final int f20137c;

    public ea(MessagesController messagesController, int i10, int i11) {
        this.f20135a = i11;
        this.f20136b = messagesController;
        this.f20137c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20135a) {
            case 0:
                this.f20136b.lambda$updateTimerProc$157(this.f20137c);
                break;
            case 1:
                this.f20136b.lambda$onFolderEmpty$197(this.f20137c);
                break;
            case 2:
                this.f20136b.lambda$ensureMessagesLoaded$462(this.f20137c);
                break;
            default:
                this.f20136b.lambda$didAddedNewTask$81(this.f20137c);
                break;
        }
    }
}
