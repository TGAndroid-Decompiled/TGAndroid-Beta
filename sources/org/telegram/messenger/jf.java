package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f18068a;
    public final MessagesStorage f18069b;
    public final int f18070c;

    public jf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18068a = i11;
        this.f18069b = messagesStorage;
        this.f18070c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18068a) {
            case 0:
                this.f18069b.lambda$readAllDialogs$65(this.f18070c);
                return;
            case 1:
                this.f18069b.lambda$checkIfFolderEmptyInternal$245(this.f18070c);
                return;
            case 2:
                this.f18069b.lambda$clearDownloadQueue$184(this.f18070c);
                return;
            case 3:
                this.f18069b.lambda$putMessagesInternal$196(this.f18070c);
                return;
            case 4:
                this.f18069b.lambda$getDownloadQueue$186(this.f18070c);
                return;
            case 5:
                this.f18069b.lambda$getUnsentMessages$152(this.f18070c);
                return;
            case 6:
                this.f18069b.lambda$checkIfFolderEmpty$246(this.f18070c);
                return;
            default:
                this.f18069b.lambda$clearWidgetDialogs$167(this.f18070c);
                return;
        }
    }
}
