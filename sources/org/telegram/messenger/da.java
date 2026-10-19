package org.telegram.messenger;
public final class da implements Runnable {
    public final int f18168a;
    public final MessagesController f18169b;
    public final int f18170c;

    public da(MessagesController messagesController, int i10, int i11) {
        this.f18168a = i11;
        this.f18169b = messagesController;
        this.f18170c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18168a) {
            case 0:
                this.f18169b.lambda$updateTimerProc$156(this.f18170c);
                return;
            case 1:
                this.f18169b.lambda$onFolderEmpty$196(this.f18170c);
                return;
            case 2:
                this.f18169b.lambda$ensureMessagesLoaded$465(this.f18170c);
                return;
            default:
                this.f18169b.lambda$didAddedNewTask$80(this.f18170c);
                return;
        }
    }
}
