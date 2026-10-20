package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class x4 implements Runnable {
    public final int f20048a = 0;
    public final int f20049b;
    public final boolean f20050c;
    public final Object d;

    public x4(int i10, String str, boolean z10) {
        this.f20049b = i10;
        this.d = str;
        this.f20050c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20048a) {
            case 0:
                boolean z10 = this.f20050c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f20049b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f20049b, this.f20050c);
                return;
        }
    }

    public x4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f20049b = i10;
        this.f20050c = z10;
    }
}
