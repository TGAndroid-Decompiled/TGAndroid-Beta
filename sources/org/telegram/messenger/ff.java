package org.telegram.messenger;
public final class ff implements Runnable {
    public final int f18381a;
    public final MessagesStorage f18382b;
    public final int f18383c;

    public ff(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18381a = i11;
        this.f18382b = messagesStorage;
        this.f18383c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18381a) {
            case 0:
                this.f18382b.lambda$readAllDialogs$65(this.f18383c);
                return;
            case 1:
                this.f18382b.lambda$checkIfFolderEmptyInternal$245(this.f18383c);
                return;
            case 2:
                this.f18382b.lambda$clearDownloadQueue$184(this.f18383c);
                return;
            case 3:
                this.f18382b.lambda$putMessagesInternal$196(this.f18383c);
                return;
            case 4:
                this.f18382b.lambda$getDownloadQueue$186(this.f18383c);
                return;
            case 5:
                this.f18382b.lambda$getUnsentMessages$152(this.f18383c);
                return;
            case 6:
                this.f18382b.lambda$checkIfFolderEmpty$246(this.f18383c);
                return;
            default:
                this.f18382b.lambda$clearWidgetDialogs$167(this.f18383c);
                return;
        }
    }
}
