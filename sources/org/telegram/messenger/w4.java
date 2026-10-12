package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class w4 implements Runnable {
    public final int f19437a = 0;
    public final int f19438b;
    public final boolean f19439c;
    public final Object d;

    public w4(int i10, String str, boolean z10) {
        this.f19438b = i10;
        this.d = str;
        this.f19439c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19437a) {
            case 0:
                boolean z10 = this.f19439c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f19438b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f19438b, this.f19439c);
                return;
        }
    }

    public w4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f19438b = i10;
        this.f19439c = z10;
    }
}
