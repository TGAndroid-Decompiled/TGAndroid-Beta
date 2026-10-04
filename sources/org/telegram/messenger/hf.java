package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f18051a;
    public final MessagesStorage f18052b;
    public final int f18053c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18051a = i11;
        this.f18052b = messagesStorage;
        this.f18053c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18051a) {
            case 0:
                this.f18052b.lambda$readAllDialogs$65(this.f18053c);
                return;
            case 1:
                this.f18052b.lambda$checkIfFolderEmptyInternal$245(this.f18053c);
                return;
            case 2:
                this.f18052b.lambda$clearDownloadQueue$184(this.f18053c);
                return;
            case 3:
                this.f18052b.lambda$putMessagesInternal$196(this.f18053c);
                return;
            case 4:
                this.f18052b.lambda$getDownloadQueue$186(this.f18053c);
                return;
            case 5:
                this.f18052b.lambda$getUnsentMessages$152(this.f18053c);
                return;
            case 6:
                this.f18052b.lambda$checkIfFolderEmpty$246(this.f18053c);
                return;
            default:
                this.f18052b.lambda$clearWidgetDialogs$167(this.f18053c);
                return;
        }
    }
}
