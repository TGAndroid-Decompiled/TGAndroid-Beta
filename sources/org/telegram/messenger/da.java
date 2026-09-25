package org.telegram.messenger;
public final class da implements Runnable {
    public final int f16193a;
    public final MessagesController f16194b;
    public final int f16195c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f16193a = i11;
        this.f16194b = messagesController;
        this.f16195c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16193a) {
            case 0:
                this.f16194b.lambda$updateTimerProc$157(this.f16195c);
                return;
            case 1:
                this.f16194b.lambda$onFolderEmpty$197(this.f16195c);
                return;
            case 2:
                this.f16194b.lambda$ensureMessagesLoaded$462(this.f16195c);
                return;
            default:
                this.f16194b.lambda$didAddedNewTask$81(this.f16195c);
                return;
        }
    }
}
