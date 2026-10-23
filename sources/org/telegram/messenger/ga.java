package org.telegram.messenger;
public final class ga implements Runnable {
    public final int f18432a;
    public final MessagesController f18433b;
    public final int f18434c;

    public ga(MessagesController messagesController, int i10, int i11) {
        this.f18432a = i11;
        this.f18433b = messagesController;
        this.f18434c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18432a) {
            case 0:
                this.f18433b.lambda$updateTimerProc$156(this.f18434c);
                return;
            case 1:
                this.f18433b.lambda$onFolderEmpty$196(this.f18434c);
                return;
            case 2:
                this.f18433b.lambda$ensureMessagesLoaded$465(this.f18434c);
                return;
            default:
                this.f18433b.lambda$didAddedNewTask$80(this.f18434c);
                return;
        }
    }
}
