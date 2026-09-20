package org.telegram.messenger;
public final class da implements Runnable {
    public final int f16181a;
    public final MessagesController f16182b;
    public final int f16183c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f16181a = i11;
        this.f16182b = messagesController;
        this.f16183c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16181a) {
            case 0:
                this.f16182b.lambda$updateTimerProc$157(this.f16183c);
                return;
            case 1:
                this.f16182b.lambda$onFolderEmpty$197(this.f16183c);
                return;
            case 2:
                this.f16182b.lambda$ensureMessagesLoaded$462(this.f16183c);
                return;
            default:
                this.f16182b.lambda$didAddedNewTask$81(this.f16183c);
                return;
        }
    }
}
