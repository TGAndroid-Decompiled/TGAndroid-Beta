package org.telegram.messenger;
public final class ha implements Runnable {
    public final int f18509a;
    public final MessagesController f18510b;
    public final int f18511c;

    public ha(MessagesController messagesController, int i10, int i11) {
        this.f18509a = i11;
        this.f18510b = messagesController;
        this.f18511c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18509a) {
            case 0:
                this.f18510b.lambda$updateTimerProc$156(this.f18511c);
                return;
            case 1:
                this.f18510b.lambda$onFolderEmpty$196(this.f18511c);
                return;
            case 2:
                this.f18510b.lambda$ensureMessagesLoaded$465(this.f18511c);
                return;
            default:
                this.f18510b.lambda$didAddedNewTask$80(this.f18511c);
                return;
        }
    }
}
