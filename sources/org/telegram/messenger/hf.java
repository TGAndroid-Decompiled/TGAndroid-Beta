package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f17916a;
    public final MessagesStorage f17917b;
    public final int f17918c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f17916a = i11;
        this.f17917b = messagesStorage;
        this.f17918c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17916a) {
            case 0:
                this.f17917b.lambda$readAllDialogs$65(this.f17918c);
                return;
            case 1:
                this.f17917b.lambda$checkIfFolderEmptyInternal$245(this.f17918c);
                return;
            case 2:
                this.f17917b.lambda$clearDownloadQueue$184(this.f17918c);
                return;
            case 3:
                this.f17917b.lambda$putMessagesInternal$196(this.f17918c);
                return;
            case 4:
                this.f17917b.lambda$getDownloadQueue$186(this.f17918c);
                return;
            case 5:
                this.f17917b.lambda$getUnsentMessages$152(this.f17918c);
                return;
            case 6:
                this.f17917b.lambda$checkIfFolderEmpty$246(this.f17918c);
                return;
            default:
                this.f17917b.lambda$clearWidgetDialogs$167(this.f17918c);
                return;
        }
    }
}
