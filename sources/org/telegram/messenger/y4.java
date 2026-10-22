package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class y4 implements Runnable {
    public final int f20120a = 0;
    public final int f20121b;
    public final boolean f20122c;
    public final Object d;

    public y4(int i10, String str, boolean z10) {
        this.f20121b = i10;
        this.d = str;
        this.f20122c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20120a) {
            case 0:
                boolean z10 = this.f20122c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f20121b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f20121b, this.f20122c);
                return;
        }
    }

    public y4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f20121b = i10;
        this.f20122c = z10;
    }
}
