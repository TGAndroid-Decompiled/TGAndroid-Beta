package org.telegram.messenger;
public final class ea implements Runnable {
    public final int f18261a;
    public final MessagesController f18262b;
    public final int f18263c;

    public ea(MessagesController messagesController, int i10, int i11) {
        this.f18261a = i11;
        this.f18262b = messagesController;
        this.f18263c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18261a) {
            case 0:
                this.f18262b.lambda$updateTimerProc$156(this.f18263c);
                return;
            case 1:
                this.f18262b.lambda$onFolderEmpty$196(this.f18263c);
                return;
            case 2:
                this.f18262b.lambda$ensureMessagesLoaded$465(this.f18263c);
                return;
            default:
                this.f18262b.lambda$didAddedNewTask$80(this.f18263c);
                return;
        }
    }
}
