package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f16487a;
    public final MessagesStorage f16488b;
    public final int f16489c;

    public jf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f16487a = i11;
        this.f16488b = messagesStorage;
        this.f16489c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16487a) {
            case 0:
                this.f16488b.lambda$readAllDialogs$65(this.f16489c);
                return;
            case 1:
                this.f16488b.lambda$checkIfFolderEmptyInternal$245(this.f16489c);
                return;
            case 2:
                this.f16488b.lambda$clearDownloadQueue$184(this.f16489c);
                return;
            case 3:
                this.f16488b.lambda$putMessagesInternal$196(this.f16489c);
                return;
            case 4:
                this.f16488b.lambda$getDownloadQueue$186(this.f16489c);
                return;
            case 5:
                this.f16488b.lambda$getUnsentMessages$152(this.f16489c);
                return;
            case 6:
                this.f16488b.lambda$checkIfFolderEmpty$246(this.f16489c);
                return;
            default:
                this.f16488b.lambda$clearWidgetDialogs$167(this.f16489c);
                return;
        }
    }
}
