package org.telegram.messenger;
public final class rf implements Runnable {
    public final int f16233a;
    public final MessagesStorage f16234b;
    public final int f16235c;

    public rf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f16233a = i11;
        this.f16234b = messagesStorage;
        this.f16235c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16233a) {
            case 0:
                this.f16234b.lambda$readAllDialogs$65(this.f16235c);
                return;
            case 1:
                this.f16234b.lambda$checkIfFolderEmptyInternal$245(this.f16235c);
                return;
            case 2:
                this.f16234b.lambda$clearDownloadQueue$184(this.f16235c);
                return;
            case 3:
                this.f16234b.lambda$putMessagesInternal$196(this.f16235c);
                return;
            case 4:
                this.f16234b.lambda$getDownloadQueue$186(this.f16235c);
                return;
            case 5:
                this.f16234b.lambda$getUnsentMessages$152(this.f16235c);
                return;
            case 6:
                this.f16234b.lambda$checkIfFolderEmpty$246(this.f16235c);
                return;
            default:
                this.f16234b.lambda$clearWidgetDialogs$167(this.f16235c);
                return;
        }
    }
}
