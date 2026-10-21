package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f18541a;
    public final MessagesStorage f18542b;
    public final int f18543c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18541a = i11;
        this.f18542b = messagesStorage;
        this.f18543c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18541a) {
            case 0:
                this.f18542b.lambda$readAllDialogs$65(this.f18543c);
                return;
            case 1:
                this.f18542b.lambda$checkIfFolderEmptyInternal$245(this.f18543c);
                return;
            case 2:
                this.f18542b.lambda$clearDownloadQueue$184(this.f18543c);
                return;
            case 3:
                this.f18542b.lambda$putMessagesInternal$196(this.f18543c);
                return;
            case 4:
                this.f18542b.lambda$getDownloadQueue$186(this.f18543c);
                return;
            case 5:
                this.f18542b.lambda$getUnsentMessages$152(this.f18543c);
                return;
            case 6:
                this.f18542b.lambda$checkIfFolderEmpty$246(this.f18543c);
                return;
            default:
                this.f18542b.lambda$clearWidgetDialogs$167(this.f18543c);
                return;
        }
    }
}
