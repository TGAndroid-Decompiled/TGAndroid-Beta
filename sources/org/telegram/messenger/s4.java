package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class s4 implements Runnable {
    public final int f18975a = 0;
    public final int f18976b;
    public final boolean f18977c;
    public final Object d;

    public s4(int i10, String str, boolean z10) {
        this.f18976b = i10;
        this.d = str;
        this.f18977c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18975a) {
            case 0:
                boolean z10 = this.f18977c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f18976b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f18976b, this.f18977c);
                return;
        }
    }

    public s4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f18976b = i10;
        this.f18977c = z10;
    }
}
