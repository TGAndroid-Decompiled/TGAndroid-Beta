package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class x4 implements Runnable {
    public final int f20112a = 0;
    public final int f20113b;
    public final boolean f20114c;
    public final Object d;

    public x4(int i10, String str, boolean z10) {
        this.f20113b = i10;
        this.d = str;
        this.f20114c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20112a) {
            case 0:
                boolean z10 = this.f20114c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f20113b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f20113b, this.f20114c);
                return;
        }
    }

    public x4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f20113b = i10;
        this.f20114c = z10;
    }
}
