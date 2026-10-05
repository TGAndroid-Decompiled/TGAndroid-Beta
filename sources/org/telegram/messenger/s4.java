package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class s4 implements Runnable {
    public final int f19135a = 0;
    public final int f19136b;
    public final boolean f19137c;
    public final Object d;

    public s4(int i10, String str, boolean z10) {
        this.f19136b = i10;
        this.d = str;
        this.f19137c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19135a) {
            case 0:
                boolean z10 = this.f19137c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f19136b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f19136b, this.f19137c);
                return;
        }
    }

    public s4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f19136b = i10;
        this.f19137c = z10;
    }
}
