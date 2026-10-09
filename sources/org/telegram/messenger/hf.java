package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f18058a;
    public final MessagesStorage f18059b;
    public final int f18060c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18058a = i11;
        this.f18059b = messagesStorage;
        this.f18060c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18058a) {
            case 0:
                this.f18059b.lambda$readAllDialogs$65(this.f18060c);
                return;
            case 1:
                this.f18059b.lambda$checkIfFolderEmptyInternal$245(this.f18060c);
                return;
            case 2:
                this.f18059b.lambda$clearDownloadQueue$184(this.f18060c);
                return;
            case 3:
                this.f18059b.lambda$putMessagesInternal$196(this.f18060c);
                return;
            case 4:
                this.f18059b.lambda$getDownloadQueue$186(this.f18060c);
                return;
            case 5:
                this.f18059b.lambda$getUnsentMessages$152(this.f18060c);
                return;
            case 6:
                this.f18059b.lambda$checkIfFolderEmpty$246(this.f18060c);
                return;
            default:
                this.f18059b.lambda$clearWidgetDialogs$167(this.f18060c);
                return;
        }
    }
}
