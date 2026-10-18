package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class v4 implements Runnable {
    public final int f19713a = 0;
    public final int f19714b;
    public final boolean f19715c;
    public final Object d;

    public v4(int i10, String str, boolean z10) {
        this.f19714b = i10;
        this.d = str;
        this.f19715c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19713a) {
            case 0:
                boolean z10 = this.f19715c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f19714b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f19714b, this.f19715c);
                return;
        }
    }

    public v4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f19714b = i10;
        this.f19715c = z10;
    }
}
