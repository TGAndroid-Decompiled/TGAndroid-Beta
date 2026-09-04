package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class s4 implements Runnable {
    public final int f18948a = 0;
    public final int f18949b;
    public final boolean f18950c;
    public final Object d;

    public s4(int i10, String str, boolean z10) {
        this.f18949b = i10;
        this.d = str;
        this.f18950c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18948a) {
            case 0:
                boolean z10 = this.f18950c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f18949b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f18949b, this.f18950c);
                return;
        }
    }

    public s4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f18949b = i10;
        this.f18950c = z10;
    }
}
