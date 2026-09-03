package org.telegram.messenger;
public final class ha implements Runnable {
    public final int f17370a;
    public final MessagesController f17371b;
    public final int f17372c;

    public ha(MessagesController messagesController, int i10, int i11) {
        this.f17370a = i11;
        this.f17371b = messagesController;
        this.f17372c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17370a) {
            case 0:
                this.f17371b.lambda$updateTimerProc$157(this.f17372c);
                return;
            case 1:
                this.f17371b.lambda$onFolderEmpty$197(this.f17372c);
                return;
            case 2:
                this.f17371b.lambda$ensureMessagesLoaded$462(this.f17372c);
                return;
            default:
                this.f17371b.lambda$didAddedNewTask$81(this.f17372c);
                return;
        }
    }
}
