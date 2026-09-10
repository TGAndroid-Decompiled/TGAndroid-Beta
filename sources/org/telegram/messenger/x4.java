package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class x4 implements Runnable {
    public final int f16942a = 0;
    public final int f16943b;
    public final boolean f16944c;
    public final Object d;

    public x4(int i10, String str, boolean z10) {
        this.f16943b = i10;
        this.d = str;
        this.f16944c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16942a) {
            case 0:
                boolean z10 = this.f16944c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f16943b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f16943b, this.f16944c);
                return;
        }
    }

    public x4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f16943b = i10;
        this.f16944c = z10;
    }
}
