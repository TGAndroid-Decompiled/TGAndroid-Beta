package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class w4 implements Runnable {
    public final int f18597a = 0;
    public final int f18598b;
    public final boolean f18599c;
    public final Object d;

    public w4(int i10, String str, boolean z10) {
        this.f18598b = i10;
        this.d = str;
        this.f18599c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18597a) {
            case 0:
                boolean z10 = this.f18599c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f18598b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f18598b, this.f18599c);
                return;
        }
    }

    public w4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f18598b = i10;
        this.f18599c = z10;
    }
}
