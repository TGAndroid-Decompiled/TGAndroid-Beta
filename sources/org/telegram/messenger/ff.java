package org.telegram.messenger;
public final class ff implements Runnable {
    public final int f18378a;
    public final MessagesStorage f18379b;
    public final int f18380c;

    public ff(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18378a = i11;
        this.f18379b = messagesStorage;
        this.f18380c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18378a) {
            case 0:
                this.f18379b.lambda$readAllDialogs$65(this.f18380c);
                return;
            case 1:
                this.f18379b.lambda$checkIfFolderEmptyInternal$245(this.f18380c);
                return;
            case 2:
                this.f18379b.lambda$clearDownloadQueue$184(this.f18380c);
                return;
            case 3:
                this.f18379b.lambda$putMessagesInternal$196(this.f18380c);
                return;
            case 4:
                this.f18379b.lambda$getDownloadQueue$186(this.f18380c);
                return;
            case 5:
                this.f18379b.lambda$getUnsentMessages$152(this.f18380c);
                return;
            case 6:
                this.f18379b.lambda$checkIfFolderEmpty$246(this.f18380c);
                return;
            default:
                this.f18379b.lambda$clearWidgetDialogs$167(this.f18380c);
                return;
        }
    }
}
