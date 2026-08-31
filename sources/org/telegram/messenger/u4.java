package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class u4 implements Runnable {
    public final int f20163a = 0;
    public final int f20164b;
    public final boolean f20165c;
    public final Object d;

    public u4(int i10, String str, boolean z4) {
        this.f20164b = i10;
        this.d = str;
        this.f20165c = z4;
    }

    @Override
    public final void run() {
        switch (this.f20163a) {
            case 0:
                boolean z4 = this.f20165c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f20164b, (String) this.d, z4);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f20164b, this.f20165c);
                return;
        }
    }

    public u4(int i10, MessagesController messagesController, boolean z4) {
        this.d = messagesController;
        this.f20164b = i10;
        this.f20165c = z4;
    }
}
