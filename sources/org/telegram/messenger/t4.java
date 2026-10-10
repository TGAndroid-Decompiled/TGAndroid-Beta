package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class t4 implements Runnable {
    public final int f19213a = 0;
    public final int f19214b;
    public final boolean f19215c;
    public final Object d;

    public t4(int i10, String str, boolean z10) {
        this.f19214b = i10;
        this.d = str;
        this.f19215c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19213a) {
            case 0:
                boolean z10 = this.f19215c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f19214b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f19214b, this.f19215c);
                return;
        }
    }

    public t4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f19214b = i10;
        this.f19215c = z10;
    }
}
