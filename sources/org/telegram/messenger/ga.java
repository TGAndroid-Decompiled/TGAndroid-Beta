package org.telegram.messenger;
public final class ga implements Runnable {
    public final int f17310a;
    public final MessagesController f17311b;
    public final int f17312c;

    public ga(MessagesController messagesController, int i10, int i11) {
        this.f17310a = i11;
        this.f17311b = messagesController;
        this.f17312c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17310a) {
            case 0:
                this.f17311b.lambda$updateTimerProc$156(this.f17312c);
                return;
            case 1:
                this.f17311b.lambda$onFolderEmpty$196(this.f17312c);
                return;
            case 2:
                this.f17311b.lambda$ensureMessagesLoaded$465(this.f17312c);
                return;
            default:
                this.f17311b.lambda$didAddedNewTask$80(this.f17312c);
                return;
        }
    }
}
