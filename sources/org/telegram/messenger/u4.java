package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class u4 implements Runnable {
    public final int f18540a = 0;
    public final int f18541b;
    public final boolean f18542c;
    public final Object d;

    public u4(int i10, String str, boolean z4) {
        this.f18541b = i10;
        this.d = str;
        this.f18542c = z4;
    }

    @Override
    public final void run() {
        switch (this.f18540a) {
            case 0:
                boolean z4 = this.f18542c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f18541b, (String) this.d, z4);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f18541b, this.f18542c);
                return;
        }
    }

    public u4(int i10, MessagesController messagesController, boolean z4) {
        this.d = messagesController;
        this.f18541b = i10;
        this.f18542c = z4;
    }
}
