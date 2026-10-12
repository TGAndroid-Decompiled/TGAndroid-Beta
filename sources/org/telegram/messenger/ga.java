package org.telegram.messenger;
public final class ga implements Runnable {
    public final int f17675a;
    public final MessagesController f17676b;
    public final int f17677c;

    public ga(MessagesController messagesController, int i10, int i11) {
        this.f17675a = i11;
        this.f17676b = messagesController;
        this.f17677c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17675a) {
            case 0:
                this.f17676b.lambda$updateTimerProc$156(this.f17677c);
                return;
            case 1:
                this.f17676b.lambda$onFolderEmpty$196(this.f17677c);
                return;
            case 2:
                this.f17676b.lambda$ensureMessagesLoaded$465(this.f17677c);
                return;
            default:
                this.f17676b.lambda$didAddedNewTask$80(this.f17677c);
                return;
        }
    }
}
