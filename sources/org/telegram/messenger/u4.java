package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class u4 implements Runnable {
    public final int f20165a = 0;
    public final int f20166b;
    public final boolean f20167c;
    public final Object d;

    public u4(int i10, String str, boolean z4) {
        this.f20166b = i10;
        this.d = str;
        this.f20167c = z4;
    }

    @Override
    public final void run() {
        switch (this.f20165a) {
            case 0:
                boolean z4 = this.f20167c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f20166b, (String) this.d, z4);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f20166b, this.f20167c);
                return;
        }
    }

    public u4(int i10, MessagesController messagesController, boolean z4) {
        this.d = messagesController;
        this.f20166b = i10;
        this.f20167c = z4;
    }
}
