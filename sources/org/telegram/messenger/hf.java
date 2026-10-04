package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f18057a;
    public final MessagesStorage f18058b;
    public final int f18059c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18057a = i11;
        this.f18058b = messagesStorage;
        this.f18059c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18057a) {
            case 0:
                this.f18058b.lambda$readAllDialogs$65(this.f18059c);
                return;
            case 1:
                this.f18058b.lambda$checkIfFolderEmptyInternal$245(this.f18059c);
                return;
            case 2:
                this.f18058b.lambda$clearDownloadQueue$184(this.f18059c);
                return;
            case 3:
                this.f18058b.lambda$putMessagesInternal$196(this.f18059c);
                return;
            case 4:
                this.f18058b.lambda$getDownloadQueue$186(this.f18059c);
                return;
            case 5:
                this.f18058b.lambda$getUnsentMessages$152(this.f18059c);
                return;
            case 6:
                this.f18058b.lambda$checkIfFolderEmpty$246(this.f18059c);
                return;
            default:
                this.f18058b.lambda$clearWidgetDialogs$167(this.f18059c);
                return;
        }
    }
}
