package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class t4 implements Runnable {
    public final int f21614a = 0;
    public final int f21615b;
    public final boolean f21616c;
    public final Object d;

    public t4(int i10, String str, boolean z10) {
        this.f21615b = i10;
        this.d = str;
        this.f21616c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21614a) {
            case 0:
                boolean z10 = this.f21616c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f21615b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f21615b, this.f21616c);
                return;
        }
    }

    public t4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f21615b = i10;
        this.f21616c = z10;
    }
}
