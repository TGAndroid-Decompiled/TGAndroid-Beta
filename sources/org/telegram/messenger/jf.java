package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f16491a;
    public final MessagesStorage f16492b;
    public final int f16493c;

    public jf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f16491a = i11;
        this.f16492b = messagesStorage;
        this.f16493c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16491a) {
            case 0:
                this.f16492b.lambda$readAllDialogs$65(this.f16493c);
                return;
            case 1:
                this.f16492b.lambda$checkIfFolderEmptyInternal$245(this.f16493c);
                return;
            case 2:
                this.f16492b.lambda$clearDownloadQueue$184(this.f16493c);
                return;
            case 3:
                this.f16492b.lambda$putMessagesInternal$196(this.f16493c);
                return;
            case 4:
                this.f16492b.lambda$getDownloadQueue$186(this.f16493c);
                return;
            case 5:
                this.f16492b.lambda$getUnsentMessages$152(this.f16493c);
                return;
            case 6:
                this.f16492b.lambda$checkIfFolderEmpty$246(this.f16493c);
                return;
            default:
                this.f16492b.lambda$clearWidgetDialogs$167(this.f16493c);
                return;
        }
    }
}
