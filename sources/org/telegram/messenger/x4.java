package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class x4 implements Runnable {
    public final int f20045a = 0;
    public final int f20046b;
    public final boolean f20047c;
    public final Object d;

    public x4(int i10, String str, boolean z10) {
        this.f20046b = i10;
        this.d = str;
        this.f20047c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20045a) {
            case 0:
                boolean z10 = this.f20047c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f20046b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f20046b, this.f20047c);
                return;
        }
    }

    public x4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f20046b = i10;
        this.f20047c = z10;
    }
}
