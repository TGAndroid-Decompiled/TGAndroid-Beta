package org.telegram.messenger;
public final class da implements Runnable {
    public final int f17664a;
    public final MessagesController f17665b;
    public final int f17666c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f17664a = i11;
        this.f17665b = messagesController;
        this.f17666c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17664a) {
            case 0:
                this.f17665b.lambda$updateTimerProc$157(this.f17666c);
                return;
            case 1:
                this.f17665b.lambda$onFolderEmpty$197(this.f17666c);
                return;
            case 2:
                this.f17665b.lambda$ensureMessagesLoaded$462(this.f17666c);
                return;
            default:
                this.f17665b.lambda$didAddedNewTask$81(this.f17666c);
                return;
        }
    }
}
