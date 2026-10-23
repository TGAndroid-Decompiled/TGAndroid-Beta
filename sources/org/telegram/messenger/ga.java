package org.telegram.messenger;
public final class ga implements Runnable {
    public final int f18498a;
    public final MessagesController f18499b;
    public final int f18500c;

    public ga(MessagesController messagesController, int i10, int i11) {
        this.f18498a = i11;
        this.f18499b = messagesController;
        this.f18500c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18498a) {
            case 0:
                this.f18499b.lambda$updateTimerProc$156(this.f18500c);
                return;
            case 1:
                this.f18499b.lambda$onFolderEmpty$196(this.f18500c);
                return;
            case 2:
                this.f18499b.lambda$ensureMessagesLoaded$465(this.f18500c);
                return;
            default:
                this.f18499b.lambda$didAddedNewTask$80(this.f18500c);
                return;
        }
    }
}
