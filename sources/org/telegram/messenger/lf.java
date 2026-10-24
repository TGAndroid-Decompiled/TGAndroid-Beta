package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f18953a;
    public final MessagesStorage f18954b;
    public final int f18955c;

    public lf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18953a = i11;
        this.f18954b = messagesStorage;
        this.f18955c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18953a) {
            case 0:
                this.f18954b.lambda$readAllDialogs$65(this.f18955c);
                return;
            case 1:
                this.f18954b.lambda$checkIfFolderEmptyInternal$245(this.f18955c);
                return;
            case 2:
                this.f18954b.lambda$clearDownloadQueue$184(this.f18955c);
                return;
            case 3:
                this.f18954b.lambda$putMessagesInternal$196(this.f18955c);
                return;
            case 4:
                this.f18954b.lambda$getDownloadQueue$186(this.f18955c);
                return;
            case 5:
                this.f18954b.lambda$getUnsentMessages$152(this.f18955c);
                return;
            case 6:
                this.f18954b.lambda$checkIfFolderEmpty$246(this.f18955c);
                return;
            default:
                this.f18954b.lambda$clearWidgetDialogs$167(this.f18955c);
                return;
        }
    }
}
