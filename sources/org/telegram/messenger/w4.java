package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class w4 implements Runnable {
    public final int f19436a = 0;
    public final int f19437b;
    public final boolean f19438c;
    public final Object d;

    public w4(int i10, String str, boolean z10) {
        this.f19437b = i10;
        this.d = str;
        this.f19438c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19436a) {
            case 0:
                boolean z10 = this.f19438c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f19437b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f19437b, this.f19438c);
                return;
        }
    }

    public w4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f19437b = i10;
        this.f19438c = z10;
    }
}
