package org.telegram.messenger;
public final class ha implements Runnable {
    public final int f17390a;
    public final MessagesController f17391b;
    public final int f17392c;

    public ha(MessagesController messagesController, int i10, int i11) {
        this.f17390a = i11;
        this.f17391b = messagesController;
        this.f17392c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17390a) {
            case 0:
                this.f17391b.lambda$updateTimerProc$157(this.f17392c);
                return;
            case 1:
                this.f17391b.lambda$onFolderEmpty$197(this.f17392c);
                return;
            case 2:
                this.f17391b.lambda$ensureMessagesLoaded$462(this.f17392c);
                return;
            default:
                this.f17391b.lambda$didAddedNewTask$81(this.f17392c);
                return;
        }
    }
}
