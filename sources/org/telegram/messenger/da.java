package org.telegram.messenger;
public final class da implements Runnable {
    public final int f16141a;
    public final MessagesController f16142b;
    public final int f16143c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f16141a = i11;
        this.f16142b = messagesController;
        this.f16143c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16141a) {
            case 0:
                this.f16142b.lambda$updateTimerProc$157(this.f16143c);
                return;
            case 1:
                this.f16142b.lambda$onFolderEmpty$197(this.f16143c);
                return;
            case 2:
                this.f16142b.lambda$ensureMessagesLoaded$462(this.f16143c);
                return;
            default:
                this.f16142b.lambda$didAddedNewTask$81(this.f16143c);
                return;
        }
    }
}
