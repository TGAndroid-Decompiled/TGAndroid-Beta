package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class t4 implements Runnable {
    public final int f19209a = 0;
    public final int f19210b;
    public final boolean f19211c;
    public final Object d;

    public t4(int i10, String str, boolean z10) {
        this.f19210b = i10;
        this.d = str;
        this.f19211c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19209a) {
            case 0:
                boolean z10 = this.f19211c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f19210b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f19210b, this.f19211c);
                return;
        }
    }

    public t4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f19210b = i10;
        this.f19211c = z10;
    }
}
