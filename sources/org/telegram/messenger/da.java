package org.telegram.messenger;
public final class da implements Runnable {
    public final int f16178a;
    public final MessagesController f16179b;
    public final int f16180c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f16178a = i11;
        this.f16179b = messagesController;
        this.f16180c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16178a) {
            case 0:
                this.f16179b.lambda$updateTimerProc$157(this.f16180c);
                return;
            case 1:
                this.f16179b.lambda$onFolderEmpty$197(this.f16180c);
                return;
            case 2:
                this.f16179b.lambda$ensureMessagesLoaded$462(this.f16180c);
                return;
            default:
                this.f16179b.lambda$didAddedNewTask$81(this.f16180c);
                return;
        }
    }
}
