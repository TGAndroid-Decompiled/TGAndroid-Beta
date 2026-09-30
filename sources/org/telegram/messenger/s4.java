package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class s4 implements Runnable {
    public final int f17528a = 0;
    public final int f17529b;
    public final boolean f17530c;
    public final Object d;

    public s4(int i10, String str, boolean z10) {
        this.f17529b = i10;
        this.d = str;
        this.f17530c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17528a) {
            case 0:
                boolean z10 = this.f17530c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f17529b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f17529b, this.f17530c);
                return;
        }
    }

    public s4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f17529b = i10;
        this.f17530c = z10;
    }
}
