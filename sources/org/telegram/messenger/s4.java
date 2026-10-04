package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class s4 implements Runnable {
    public final int f19123a = 0;
    public final int f19124b;
    public final boolean f19125c;
    public final Object d;

    public s4(int i10, String str, boolean z10) {
        this.f19124b = i10;
        this.d = str;
        this.f19125c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19123a) {
            case 0:
                boolean z10 = this.f19125c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f19124b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f19124b, this.f19125c);
                return;
        }
    }

    public s4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f19124b = i10;
        this.f19125c = z10;
    }
}
