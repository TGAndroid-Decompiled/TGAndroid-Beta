package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f18190a;
    public final MessagesStorage f18191b;
    public final int f18192c;

    public lf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18190a = i11;
        this.f18191b = messagesStorage;
        this.f18192c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18190a) {
            case 0:
                this.f18191b.lambda$readAllDialogs$65(this.f18192c);
                return;
            case 1:
                this.f18191b.lambda$checkIfFolderEmptyInternal$245(this.f18192c);
                return;
            case 2:
                this.f18191b.lambda$clearDownloadQueue$184(this.f18192c);
                return;
            case 3:
                this.f18191b.lambda$putMessagesInternal$196(this.f18192c);
                return;
            case 4:
                this.f18191b.lambda$getDownloadQueue$186(this.f18192c);
                return;
            case 5:
                this.f18191b.lambda$getUnsentMessages$152(this.f18192c);
                return;
            case 6:
                this.f18191b.lambda$checkIfFolderEmpty$246(this.f18192c);
                return;
            default:
                this.f18191b.lambda$clearWidgetDialogs$167(this.f18192c);
                return;
        }
    }
}
