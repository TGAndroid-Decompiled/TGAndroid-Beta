package org.telegram.messenger;
public final class ha implements Runnable {
    public final int f18856a;
    public final MessagesController f18857b;
    public final int f18858c;

    public ha(MessagesController messagesController, int i10, int i11) {
        this.f18856a = i11;
        this.f18857b = messagesController;
        this.f18858c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18856a) {
            case 0:
                this.f18857b.lambda$updateTimerProc$157(this.f18858c);
                return;
            case 1:
                this.f18857b.lambda$onFolderEmpty$197(this.f18858c);
                return;
            case 2:
                this.f18857b.lambda$ensureMessagesLoaded$462(this.f18858c);
                return;
            default:
                this.f18857b.lambda$didAddedNewTask$81(this.f18858c);
                return;
        }
    }
}
