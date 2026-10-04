package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class s4 implements Runnable {
    public final int f19124a = 0;
    public final int f19125b;
    public final boolean f19126c;
    public final Object d;

    public s4(int i10, String str, boolean z10) {
        this.f19125b = i10;
        this.d = str;
        this.f19126c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19124a) {
            case 0:
                boolean z10 = this.f19126c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f19125b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f19125b, this.f19126c);
                return;
        }
    }

    public s4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f19125b = i10;
        this.f19126c = z10;
    }
}
