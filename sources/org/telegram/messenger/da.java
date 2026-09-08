package org.telegram.messenger;
public final class da implements Runnable {
    public final int f17491a;
    public final MessagesController f17492b;
    public final int f17493c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f17491a = i11;
        this.f17492b = messagesController;
        this.f17493c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17491a) {
            case 0:
                this.f17492b.lambda$updateTimerProc$157(this.f17493c);
                return;
            case 1:
                this.f17492b.lambda$onFolderEmpty$197(this.f17493c);
                return;
            case 2:
                this.f17492b.lambda$ensureMessagesLoaded$462(this.f17493c);
                return;
            default:
                this.f17492b.lambda$didAddedNewTask$81(this.f17493c);
                return;
        }
    }
}
