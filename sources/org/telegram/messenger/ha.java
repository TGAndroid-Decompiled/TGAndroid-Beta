package org.telegram.messenger;
public final class ha implements Runnable {
    public final int f18854a;
    public final MessagesController f18855b;
    public final int f18856c;

    public ha(MessagesController messagesController, int i10, int i11) {
        this.f18854a = i11;
        this.f18855b = messagesController;
        this.f18856c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18854a) {
            case 0:
                this.f18855b.lambda$updateTimerProc$157(this.f18856c);
                return;
            case 1:
                this.f18855b.lambda$onFolderEmpty$197(this.f18856c);
                return;
            case 2:
                this.f18855b.lambda$ensureMessagesLoaded$462(this.f18856c);
                return;
            default:
                this.f18855b.lambda$didAddedNewTask$81(this.f18856c);
                return;
        }
    }
}
