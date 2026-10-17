package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class v4 implements Runnable {
    public final int f19712a = 0;
    public final int f19713b;
    public final boolean f19714c;
    public final Object d;

    public v4(int i10, String str, boolean z10) {
        this.f19713b = i10;
        this.d = str;
        this.f19714c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19712a) {
            case 0:
                boolean z10 = this.f19714c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f19713b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f19713b, this.f19714c);
                return;
        }
    }

    public v4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f19713b = i10;
        this.f19714c = z10;
    }
}
