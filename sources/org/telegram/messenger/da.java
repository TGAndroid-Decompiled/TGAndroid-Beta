package org.telegram.messenger;
public final class da implements Runnable {
    public final int f15956a;
    public final MessagesController f15957b;
    public final int f15958c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f15956a = i11;
        this.f15957b = messagesController;
        this.f15958c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15956a) {
            case 0:
                this.f15957b.lambda$updateTimerProc$157(this.f15958c);
                return;
            case 1:
                this.f15957b.lambda$onFolderEmpty$197(this.f15958c);
                return;
            case 2:
                this.f15957b.lambda$ensureMessagesLoaded$462(this.f15958c);
                return;
            default:
                this.f15957b.lambda$didAddedNewTask$81(this.f15958c);
                return;
        }
    }
}
