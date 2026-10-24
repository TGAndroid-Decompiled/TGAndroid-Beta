package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class y4 implements Runnable {
    public final int f20189a = 0;
    public final int f20190b;
    public final boolean f20191c;
    public final Object d;

    public y4(int i10, String str, boolean z10) {
        this.f20190b = i10;
        this.d = str;
        this.f20191c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20189a) {
            case 0:
                boolean z10 = this.f20191c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f20190b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f20190b, this.f20191c);
                return;
        }
    }

    public y4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f20190b = i10;
        this.f20191c = z10;
    }
}
