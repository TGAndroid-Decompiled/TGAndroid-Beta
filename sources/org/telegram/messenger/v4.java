package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class v4 implements Runnable {
    public final int f19710a = 0;
    public final int f19711b;
    public final boolean f19712c;
    public final Object d;

    public v4(int i10, String str, boolean z10) {
        this.f19711b = i10;
        this.d = str;
        this.f19712c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19710a) {
            case 0:
                boolean z10 = this.f19712c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f19711b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f19711b, this.f19712c);
                return;
        }
    }

    public v4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f19711b = i10;
        this.f19712c = z10;
    }
}
