package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f18799a;
    public final MessagesStorage f18800b;
    public final int f18801c;

    public kf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18799a = i11;
        this.f18800b = messagesStorage;
        this.f18801c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18799a) {
            case 0:
                this.f18800b.lambda$readAllDialogs$65(this.f18801c);
                return;
            case 1:
                this.f18800b.lambda$checkIfFolderEmptyInternal$245(this.f18801c);
                return;
            case 2:
                this.f18800b.lambda$clearDownloadQueue$184(this.f18801c);
                return;
            case 3:
                this.f18800b.lambda$putMessagesInternal$196(this.f18801c);
                return;
            case 4:
                this.f18800b.lambda$getDownloadQueue$186(this.f18801c);
                return;
            case 5:
                this.f18800b.lambda$getUnsentMessages$152(this.f18801c);
                return;
            case 6:
                this.f18800b.lambda$checkIfFolderEmpty$246(this.f18801c);
                return;
            default:
                this.f18800b.lambda$clearWidgetDialogs$167(this.f18801c);
                return;
        }
    }
}
