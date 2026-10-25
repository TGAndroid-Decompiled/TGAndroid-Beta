package org.telegram.messenger;
public final class ea implements Runnable {
    public final int f19985a;
    public final MessagesController f19986b;
    public final int f19987c;

    public ea(MessagesController messagesController, int i10, int i11) {
        this.f19985a = i11;
        this.f19986b = messagesController;
        this.f19987c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19985a) {
            case 0:
                this.f19986b.lambda$updateTimerProc$156(this.f19987c);
                return;
            case 1:
                this.f19986b.lambda$onFolderEmpty$196(this.f19987c);
                return;
            case 2:
                this.f19986b.lambda$ensureMessagesLoaded$467(this.f19987c);
                return;
            default:
                this.f19986b.lambda$didAddedNewTask$80(this.f19987c);
                return;
        }
    }
}
