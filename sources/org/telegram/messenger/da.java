package org.telegram.messenger;
public final class da implements Runnable {
    public final int f18165a;
    public final MessagesController f18166b;
    public final int f18167c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f18165a = i11;
        this.f18166b = messagesController;
        this.f18167c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18165a) {
            case 0:
                this.f18166b.lambda$updateTimerProc$156(this.f18167c);
                return;
            case 1:
                this.f18166b.lambda$onFolderEmpty$196(this.f18167c);
                return;
            case 2:
                this.f18166b.lambda$ensureMessagesLoaded$465(this.f18167c);
                return;
            default:
                this.f18166b.lambda$didAddedNewTask$80(this.f18167c);
                return;
        }
    }
}
