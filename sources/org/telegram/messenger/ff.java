package org.telegram.messenger;
public final class ff implements Runnable {
    public final int f18373a;
    public final MessagesStorage f18374b;
    public final int f18375c;

    public ff(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18373a = i11;
        this.f18374b = messagesStorage;
        this.f18375c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18373a) {
            case 0:
                this.f18374b.lambda$readAllDialogs$65(this.f18375c);
                return;
            case 1:
                this.f18374b.lambda$checkIfFolderEmptyInternal$245(this.f18375c);
                return;
            case 2:
                this.f18374b.lambda$clearDownloadQueue$184(this.f18375c);
                return;
            case 3:
                this.f18374b.lambda$putMessagesInternal$196(this.f18375c);
                return;
            case 4:
                this.f18374b.lambda$getDownloadQueue$186(this.f18375c);
                return;
            case 5:
                this.f18374b.lambda$getUnsentMessages$152(this.f18375c);
                return;
            case 6:
                this.f18374b.lambda$checkIfFolderEmpty$246(this.f18375c);
                return;
            default:
                this.f18374b.lambda$clearWidgetDialogs$167(this.f18375c);
                return;
        }
    }
}
