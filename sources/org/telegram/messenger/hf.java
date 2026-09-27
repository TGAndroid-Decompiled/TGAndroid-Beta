package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f16559a;
    public final MessagesStorage f16560b;
    public final int f16561c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f16559a = i11;
        this.f16560b = messagesStorage;
        this.f16561c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16559a) {
            case 0:
                this.f16560b.lambda$readAllDialogs$65(this.f16561c);
                return;
            case 1:
                this.f16560b.lambda$checkIfFolderEmptyInternal$245(this.f16561c);
                return;
            case 2:
                this.f16560b.lambda$clearDownloadQueue$184(this.f16561c);
                return;
            case 3:
                this.f16560b.lambda$putMessagesInternal$196(this.f16561c);
                return;
            case 4:
                this.f16560b.lambda$getDownloadQueue$186(this.f16561c);
                return;
            case 5:
                this.f16560b.lambda$getUnsentMessages$152(this.f16561c);
                return;
            case 6:
                this.f16560b.lambda$checkIfFolderEmpty$246(this.f16561c);
                return;
            default:
                this.f16560b.lambda$clearWidgetDialogs$167(this.f16561c);
                return;
        }
    }
}
