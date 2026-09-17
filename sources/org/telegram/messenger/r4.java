package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class r4 implements Runnable {
    public final int f18896a = 0;
    public final int f18897b;
    public final boolean f18898c;
    public final Object d;

    public r4(int i10, String str, boolean z10) {
        this.f18897b = i10;
        this.d = str;
        this.f18898c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18896a) {
            case 0:
                boolean z10 = this.f18898c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f18897b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f18897b, this.f18898c);
                return;
        }
    }

    public r4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f18897b = i10;
        this.f18898c = z10;
    }
}
