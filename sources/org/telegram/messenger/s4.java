package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class s4 implements Runnable {
    public final int f19130a = 0;
    public final int f19131b;
    public final boolean f19132c;
    public final Object d;

    public s4(int i10, String str, boolean z10) {
        this.f19131b = i10;
        this.d = str;
        this.f19132c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19130a) {
            case 0:
                boolean z10 = this.f19132c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f19131b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f19131b, this.f19132c);
                return;
        }
    }

    public s4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f19131b = i10;
        this.f19132c = z10;
    }
}
