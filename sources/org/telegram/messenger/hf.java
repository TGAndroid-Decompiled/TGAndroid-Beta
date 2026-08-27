package org.telegram.messenger;

public final class hf implements Runnable {

    public final int f20494a;

    public final MessagesStorage f20495b;

    public final int f20496c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f20494a = i11;
        this.f20495b = messagesStorage;
        this.f20496c = i10;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f20494a) {
            case 0:
                this.f20495b.lambda$readAllDialogs$65(this.f20496c);
                break;
            case 1:
                this.f20495b.lambda$checkIfFolderEmptyInternal$245(this.f20496c);
                break;
            case 2:
                this.f20495b.lambda$clearDownloadQueue$184(this.f20496c);
                break;
            case 3:
                this.f20495b.lambda$putMessagesInternal$196(this.f20496c);
                break;
            case 4:
                this.f20495b.lambda$getDownloadQueue$186(this.f20496c);
                break;
            case 5:
                this.f20495b.lambda$getUnsentMessages$152(this.f20496c);
                break;
            case 6:
                this.f20495b.lambda$checkIfFolderEmpty$246(this.f20496c);
                break;
            default:
                this.f20495b.lambda$clearWidgetDialogs$167(this.f20496c);
                break;
        }
    }
}
