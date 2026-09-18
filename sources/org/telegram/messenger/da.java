package org.telegram.messenger;
public final class da implements Runnable {
    public final int f15965a;
    public final MessagesController f15966b;
    public final int f15967c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f15965a = i11;
        this.f15966b = messagesController;
        this.f15967c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15965a) {
            case 0:
                this.f15966b.lambda$updateTimerProc$157(this.f15967c);
                return;
            case 1:
                this.f15966b.lambda$onFolderEmpty$197(this.f15967c);
                return;
            case 2:
                this.f15966b.lambda$ensureMessagesLoaded$462(this.f15967c);
                return;
            default:
                this.f15966b.lambda$didAddedNewTask$81(this.f15967c);
                return;
        }
    }
}
