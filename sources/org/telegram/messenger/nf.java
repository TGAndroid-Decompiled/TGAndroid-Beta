package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f19475a;
    public final MessagesStorage f19476b;
    public final int f19477c;

    public nf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f19475a = i11;
        this.f19476b = messagesStorage;
        this.f19477c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19475a) {
            case 0:
                this.f19476b.lambda$readAllDialogs$65(this.f19477c);
                return;
            case 1:
                this.f19476b.lambda$checkIfFolderEmptyInternal$245(this.f19477c);
                return;
            case 2:
                this.f19476b.lambda$clearDownloadQueue$184(this.f19477c);
                return;
            case 3:
                this.f19476b.lambda$putMessagesInternal$196(this.f19477c);
                return;
            case 4:
                this.f19476b.lambda$getDownloadQueue$186(this.f19477c);
                return;
            case 5:
                this.f19476b.lambda$getUnsentMessages$152(this.f19477c);
                return;
            case 6:
                this.f19476b.lambda$checkIfFolderEmpty$246(this.f19477c);
                return;
            default:
                this.f19476b.lambda$clearWidgetDialogs$167(this.f19477c);
                return;
        }
    }
}
