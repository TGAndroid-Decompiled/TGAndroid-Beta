package org.telegram.messenger;
public final class da implements Runnable {
    public final int f15932a;
    public final MessagesController f15933b;
    public final int f15934c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f15932a = i11;
        this.f15933b = messagesController;
        this.f15934c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15932a) {
            case 0:
                this.f15933b.lambda$updateTimerProc$157(this.f15934c);
                return;
            case 1:
                this.f15933b.lambda$onFolderEmpty$197(this.f15934c);
                return;
            case 2:
                this.f15933b.lambda$ensureMessagesLoaded$462(this.f15934c);
                return;
            default:
                this.f15933b.lambda$didAddedNewTask$81(this.f15934c);
                return;
        }
    }
}
