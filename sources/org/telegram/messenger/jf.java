package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f16736a;
    public final MessagesStorage f16737b;
    public final int f16738c;

    public jf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f16736a = i11;
        this.f16737b = messagesStorage;
        this.f16738c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16736a) {
            case 0:
                this.f16737b.lambda$readAllDialogs$65(this.f16738c);
                return;
            case 1:
                this.f16737b.lambda$checkIfFolderEmptyInternal$245(this.f16738c);
                return;
            case 2:
                this.f16737b.lambda$clearDownloadQueue$184(this.f16738c);
                return;
            case 3:
                this.f16737b.lambda$putMessagesInternal$196(this.f16738c);
                return;
            case 4:
                this.f16737b.lambda$getDownloadQueue$186(this.f16738c);
                return;
            case 5:
                this.f16737b.lambda$getUnsentMessages$152(this.f16738c);
                return;
            case 6:
                this.f16737b.lambda$checkIfFolderEmpty$246(this.f16738c);
                return;
            default:
                this.f16737b.lambda$clearWidgetDialogs$167(this.f16738c);
                return;
        }
    }
}
