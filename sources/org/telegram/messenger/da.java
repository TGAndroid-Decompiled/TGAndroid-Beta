package org.telegram.messenger;
public final class da implements Runnable {
    public final int f16187a;
    public final MessagesController f16188b;
    public final int f16189c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f16187a = i11;
        this.f16188b = messagesController;
        this.f16189c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16187a) {
            case 0:
                this.f16188b.lambda$updateTimerProc$157(this.f16189c);
                return;
            case 1:
                this.f16188b.lambda$onFolderEmpty$197(this.f16189c);
                return;
            case 2:
                this.f16188b.lambda$ensureMessagesLoaded$462(this.f16189c);
                return;
            default:
                this.f16188b.lambda$didAddedNewTask$81(this.f16189c);
                return;
        }
    }
}
