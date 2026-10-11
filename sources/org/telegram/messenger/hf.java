package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f18096a;
    public final MessagesStorage f18097b;
    public final int f18098c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18096a = i11;
        this.f18097b = messagesStorage;
        this.f18098c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18096a) {
            case 0:
                this.f18097b.lambda$readAllDialogs$65(this.f18098c);
                return;
            case 1:
                this.f18097b.lambda$checkIfFolderEmptyInternal$245(this.f18098c);
                return;
            case 2:
                this.f18097b.lambda$clearDownloadQueue$184(this.f18098c);
                return;
            case 3:
                this.f18097b.lambda$putMessagesInternal$196(this.f18098c);
                return;
            case 4:
                this.f18097b.lambda$getDownloadQueue$186(this.f18098c);
                return;
            case 5:
                this.f18097b.lambda$getUnsentMessages$152(this.f18098c);
                return;
            case 6:
                this.f18097b.lambda$checkIfFolderEmpty$246(this.f18098c);
                return;
            default:
                this.f18097b.lambda$clearWidgetDialogs$167(this.f18098c);
                return;
        }
    }
}
