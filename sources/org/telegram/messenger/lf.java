package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f18885a;
    public final MessagesStorage f18886b;
    public final int f18887c;

    public lf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18885a = i11;
        this.f18886b = messagesStorage;
        this.f18887c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18885a) {
            case 0:
                this.f18886b.lambda$readAllDialogs$65(this.f18887c);
                return;
            case 1:
                this.f18886b.lambda$checkIfFolderEmptyInternal$245(this.f18887c);
                return;
            case 2:
                this.f18886b.lambda$clearDownloadQueue$184(this.f18887c);
                return;
            case 3:
                this.f18886b.lambda$putMessagesInternal$196(this.f18887c);
                return;
            case 4:
                this.f18886b.lambda$getDownloadQueue$186(this.f18887c);
                return;
            case 5:
                this.f18886b.lambda$getUnsentMessages$152(this.f18887c);
                return;
            case 6:
                this.f18886b.lambda$checkIfFolderEmpty$246(this.f18887c);
                return;
            default:
                this.f18886b.lambda$clearWidgetDialogs$167(this.f18887c);
                return;
        }
    }
}
