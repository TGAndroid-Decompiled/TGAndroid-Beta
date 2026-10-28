package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f20613a;
    public final MessagesStorage f20614b;
    public final int f20615c;

    public lf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f20613a = i11;
        this.f20614b = messagesStorage;
        this.f20615c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20613a) {
            case 0:
                this.f20614b.lambda$readAllDialogs$68(this.f20615c);
                return;
            case 1:
                this.f20614b.lambda$checkIfFolderEmptyInternal$249(this.f20615c);
                return;
            case 2:
                this.f20614b.lambda$clearDownloadQueue$188(this.f20615c);
                return;
            case 3:
                this.f20614b.lambda$putMessagesInternal$200(this.f20615c);
                return;
            case 4:
                this.f20614b.lambda$getDownloadQueue$190(this.f20615c);
                return;
            case 5:
                this.f20614b.lambda$getUnsentMessages$156(this.f20615c);
                return;
            case 6:
                this.f20614b.lambda$checkIfFolderEmpty$250(this.f20615c);
                return;
            default:
                this.f20614b.lambda$clearWidgetDialogs$171(this.f20615c);
                return;
        }
    }
}
