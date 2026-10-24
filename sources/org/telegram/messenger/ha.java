package org.telegram.messenger;
public final class ha implements Runnable {
    public final int f18574a;
    public final MessagesController f18575b;
    public final int f18576c;

    public ha(MessagesController messagesController, int i10, int i11) {
        this.f18574a = i11;
        this.f18575b = messagesController;
        this.f18576c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18574a) {
            case 0:
                this.f18575b.lambda$updateTimerProc$156(this.f18576c);
                return;
            case 1:
                this.f18575b.lambda$onFolderEmpty$196(this.f18576c);
                return;
            case 2:
                this.f18575b.lambda$ensureMessagesLoaded$465(this.f18576c);
                return;
            default:
                this.f18575b.lambda$didAddedNewTask$80(this.f18576c);
                return;
        }
    }
}
