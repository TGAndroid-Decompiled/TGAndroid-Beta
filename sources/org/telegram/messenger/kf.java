package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f18867a;
    public final MessagesStorage f18868b;
    public final int f18869c;

    public kf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18867a = i11;
        this.f18868b = messagesStorage;
        this.f18869c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18867a) {
            case 0:
                this.f18868b.lambda$readAllDialogs$65(this.f18869c);
                return;
            case 1:
                this.f18868b.lambda$checkIfFolderEmptyInternal$245(this.f18869c);
                return;
            case 2:
                this.f18868b.lambda$clearDownloadQueue$184(this.f18869c);
                return;
            case 3:
                this.f18868b.lambda$putMessagesInternal$196(this.f18869c);
                return;
            case 4:
                this.f18868b.lambda$getDownloadQueue$186(this.f18869c);
                return;
            case 5:
                this.f18868b.lambda$getUnsentMessages$152(this.f18869c);
                return;
            case 6:
                this.f18868b.lambda$checkIfFolderEmpty$246(this.f18869c);
                return;
            default:
                this.f18868b.lambda$clearWidgetDialogs$167(this.f18869c);
                return;
        }
    }
}
