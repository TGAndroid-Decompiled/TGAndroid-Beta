package org.telegram.messenger;

public final class t4 implements Runnable {

    public final int f21604a = 0;

    public final int f21605b;

    public final boolean f21606c;
    public final Object d;

    public t4(int i10, String str, boolean z10) {
        this.f21605b = i10;
        this.d = str;
        this.f21606c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21604a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f21605b, (String) this.d, this.f21606c);
                break;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f21605b, this.f21606c);
                break;
        }
    }

    public t4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f21605b = i10;
        this.f21606c = z10;
    }
}
