package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f18191a;
    public final MessagesStorage f18192b;
    public final int f18193c;

    public lf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18191a = i11;
        this.f18192b = messagesStorage;
        this.f18193c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18191a) {
            case 0:
                this.f18192b.lambda$readAllDialogs$65(this.f18193c);
                return;
            case 1:
                this.f18192b.lambda$checkIfFolderEmptyInternal$245(this.f18193c);
                return;
            case 2:
                this.f18192b.lambda$clearDownloadQueue$184(this.f18193c);
                return;
            case 3:
                this.f18192b.lambda$putMessagesInternal$196(this.f18193c);
                return;
            case 4:
                this.f18192b.lambda$getDownloadQueue$186(this.f18193c);
                return;
            case 5:
                this.f18192b.lambda$getUnsentMessages$152(this.f18193c);
                return;
            case 6:
                this.f18192b.lambda$checkIfFolderEmpty$246(this.f18193c);
                return;
            default:
                this.f18192b.lambda$clearWidgetDialogs$167(this.f18193c);
                return;
        }
    }
}
