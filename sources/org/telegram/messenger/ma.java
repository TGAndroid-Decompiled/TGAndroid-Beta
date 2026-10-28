package org.telegram.messenger;
public final class ma implements Runnable {
    public final int f20675a;
    public final MessagesController f20676b;
    public final int f20677c;

    public ma(MessagesController messagesController, int i10, int i11) {
        this.f20675a = i11;
        this.f20676b = messagesController;
        this.f20677c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20675a) {
            case 0:
                this.f20676b.lambda$updateTimerProc$156(this.f20677c);
                return;
            case 1:
                this.f20676b.lambda$onFolderEmpty$196(this.f20677c);
                return;
            case 2:
                this.f20676b.lambda$ensureMessagesLoaded$468(this.f20677c);
                return;
            default:
                this.f20676b.lambda$didAddedNewTask$80(this.f20677c);
                return;
        }
    }
}
