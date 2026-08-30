package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class u4 implements Runnable {
    public final int f18558a = 0;
    public final int f18559b;
    public final boolean f18560c;
    public final Object d;

    public u4(int i10, String str, boolean z4) {
        this.f18559b = i10;
        this.d = str;
        this.f18560c = z4;
    }

    @Override
    public final void run() {
        switch (this.f18558a) {
            case 0:
                boolean z4 = this.f18560c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f18559b, (String) this.d, z4);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f18559b, this.f18560c);
                return;
        }
    }

    public u4(int i10, MessagesController messagesController, boolean z4) {
        this.d = messagesController;
        this.f18559b = i10;
        this.f18560c = z4;
    }
}
