package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class r4 implements Runnable {
    public final int f21372a = 0;
    public final int f21373b;
    public final boolean f21374c;
    public final Object d;

    public r4(int i9, String str, boolean z10) {
        this.f21373b = i9;
        this.d = str;
        this.f21374c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21372a) {
            case 0:
                boolean z10 = this.f21374c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f21373b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f21373b, this.f21374c);
                return;
        }
    }

    public r4(int i9, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f21373b = i9;
        this.f21374c = z10;
    }
}
