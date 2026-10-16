package org.telegram.messenger;
public final class ga implements Runnable {
    public final int f17006a;
    public final MessagesController f17007b;
    public final int f17008c;

    public ga(MessagesController messagesController, int i10, int i11) {
        this.f17006a = i11;
        this.f17007b = messagesController;
        this.f17008c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17006a) {
            case 0:
                this.f17007b.lambda$updateTimerProc$156(this.f17008c);
                return;
            case 1:
                this.f17007b.lambda$onFolderEmpty$196(this.f17008c);
                return;
            case 2:
                this.f17007b.lambda$ensureMessagesLoaded$465(this.f17008c);
                return;
            default:
                this.f17007b.lambda$didAddedNewTask$80(this.f17008c);
                return;
        }
    }
}
