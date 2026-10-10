package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f18062a;
    public final MessagesStorage f18063b;
    public final int f18064c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18062a = i11;
        this.f18063b = messagesStorage;
        this.f18064c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18062a) {
            case 0:
                this.f18063b.lambda$readAllDialogs$65(this.f18064c);
                return;
            case 1:
                this.f18063b.lambda$checkIfFolderEmptyInternal$245(this.f18064c);
                return;
            case 2:
                this.f18063b.lambda$clearDownloadQueue$184(this.f18064c);
                return;
            case 3:
                this.f18063b.lambda$putMessagesInternal$196(this.f18064c);
                return;
            case 4:
                this.f18063b.lambda$getDownloadQueue$186(this.f18064c);
                return;
            case 5:
                this.f18063b.lambda$getUnsentMessages$152(this.f18064c);
                return;
            case 6:
                this.f18063b.lambda$checkIfFolderEmpty$246(this.f18064c);
                return;
            default:
                this.f18063b.lambda$clearWidgetDialogs$167(this.f18064c);
                return;
        }
    }
}
