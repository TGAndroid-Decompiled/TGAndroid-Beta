package org.telegram.messenger;
public final class ga implements Runnable {
    public final int f20333a;
    public final MessagesController f20334b;
    public final int f20335c;

    public ga(MessagesController messagesController, int i10, int i11) {
        this.f20333a = i11;
        this.f20334b = messagesController;
        this.f20335c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20333a) {
            case 0:
                this.f20334b.lambda$updateTimerProc$157(this.f20335c);
                return;
            case 1:
                this.f20334b.lambda$onFolderEmpty$197(this.f20335c);
                return;
            case 2:
                this.f20334b.lambda$ensureMessagesLoaded$462(this.f20335c);
                return;
            default:
                this.f20334b.lambda$didAddedNewTask$81(this.f20335c);
                return;
        }
    }
}
