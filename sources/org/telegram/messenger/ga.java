package org.telegram.messenger;
public final class ga implements Runnable {
    public final int f17674a;
    public final MessagesController f17675b;
    public final int f17676c;

    public ga(MessagesController messagesController, int i10, int i11) {
        this.f17674a = i11;
        this.f17675b = messagesController;
        this.f17676c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17674a) {
            case 0:
                this.f17675b.lambda$updateTimerProc$156(this.f17676c);
                return;
            case 1:
                this.f17675b.lambda$onFolderEmpty$196(this.f17676c);
                return;
            case 2:
                this.f17675b.lambda$ensureMessagesLoaded$465(this.f17676c);
                return;
            default:
                this.f17675b.lambda$didAddedNewTask$80(this.f17676c);
                return;
        }
    }
}
