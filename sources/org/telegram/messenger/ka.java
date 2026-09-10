package org.telegram.messenger;
public final class ka implements Runnable {
    public final int f15603a;
    public final MessagesController f15604b;
    public final int f15605c;

    public ka(MessagesController messagesController, int i10, int i11) {
        this.f15603a = i11;
        this.f15604b = messagesController;
        this.f15605c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15603a) {
            case 0:
                this.f15604b.lambda$updateTimerProc$157(this.f15605c);
                return;
            case 1:
                this.f15604b.lambda$onFolderEmpty$197(this.f15605c);
                return;
            case 2:
                this.f15604b.lambda$ensureMessagesLoaded$462(this.f15605c);
                return;
            default:
                this.f15604b.lambda$didAddedNewTask$81(this.f15605c);
                return;
        }
    }
}
