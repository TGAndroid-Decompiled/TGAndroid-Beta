package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f18056a;
    public final MessagesStorage f18057b;
    public final int f18058c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18056a = i11;
        this.f18057b = messagesStorage;
        this.f18058c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18056a) {
            case 0:
                this.f18057b.lambda$readAllDialogs$65(this.f18058c);
                return;
            case 1:
                this.f18057b.lambda$checkIfFolderEmptyInternal$245(this.f18058c);
                return;
            case 2:
                this.f18057b.lambda$clearDownloadQueue$184(this.f18058c);
                return;
            case 3:
                this.f18057b.lambda$putMessagesInternal$196(this.f18058c);
                return;
            case 4:
                this.f18057b.lambda$getDownloadQueue$186(this.f18058c);
                return;
            case 5:
                this.f18057b.lambda$getUnsentMessages$152(this.f18058c);
                return;
            case 6:
                this.f18057b.lambda$checkIfFolderEmpty$246(this.f18058c);
                return;
            default:
                this.f18057b.lambda$clearWidgetDialogs$167(this.f18058c);
                return;
        }
    }
}
