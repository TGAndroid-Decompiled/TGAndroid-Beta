package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f20436a;
    public final MessagesStorage f20437b;
    public final int f20438c;

    public jf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f20436a = i11;
        this.f20437b = messagesStorage;
        this.f20438c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20436a) {
            case 0:
                this.f20437b.lambda$readAllDialogs$68(this.f20438c);
                return;
            case 1:
                this.f20437b.lambda$checkIfFolderEmptyInternal$248(this.f20438c);
                return;
            case 2:
                this.f20437b.lambda$clearDownloadQueue$187(this.f20438c);
                return;
            case 3:
                this.f20437b.lambda$putMessagesInternal$199(this.f20438c);
                return;
            case 4:
                this.f20437b.lambda$getDownloadQueue$189(this.f20438c);
                return;
            case 5:
                this.f20437b.lambda$getUnsentMessages$155(this.f20438c);
                return;
            case 6:
                this.f20437b.lambda$checkIfFolderEmpty$249(this.f20438c);
                return;
            default:
                this.f20437b.lambda$clearWidgetDialogs$170(this.f20438c);
                return;
        }
    }
}
