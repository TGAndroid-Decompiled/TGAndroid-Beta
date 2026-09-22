package org.telegram.messenger;
public final class da implements Runnable {
    public final int f15953a;
    public final MessagesController f15954b;
    public final int f15955c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f15953a = i11;
        this.f15954b = messagesController;
        this.f15955c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15953a) {
            case 0:
                this.f15954b.lambda$updateTimerProc$157(this.f15955c);
                return;
            case 1:
                this.f15954b.lambda$onFolderEmpty$197(this.f15955c);
                return;
            case 2:
                this.f15954b.lambda$ensureMessagesLoaded$462(this.f15955c);
                return;
            default:
                this.f15954b.lambda$didAddedNewTask$81(this.f15955c);
                return;
        }
    }
}
