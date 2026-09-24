package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f16547a;
    public final MessagesStorage f16548b;
    public final int f16549c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f16547a = i11;
        this.f16548b = messagesStorage;
        this.f16549c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16547a) {
            case 0:
                this.f16548b.lambda$readAllDialogs$65(this.f16549c);
                return;
            case 1:
                this.f16548b.lambda$checkIfFolderEmptyInternal$245(this.f16549c);
                return;
            case 2:
                this.f16548b.lambda$clearDownloadQueue$184(this.f16549c);
                return;
            case 3:
                this.f16548b.lambda$putMessagesInternal$196(this.f16549c);
                return;
            case 4:
                this.f16548b.lambda$getDownloadQueue$186(this.f16549c);
                return;
            case 5:
                this.f16548b.lambda$getUnsentMessages$152(this.f16549c);
                return;
            case 6:
                this.f16548b.lambda$checkIfFolderEmpty$246(this.f16549c);
                return;
            default:
                this.f16548b.lambda$clearWidgetDialogs$167(this.f16549c);
                return;
        }
    }
}
