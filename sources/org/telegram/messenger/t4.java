package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class t4 implements Runnable {
    public final int f19215a = 0;
    public final int f19216b;
    public final boolean f19217c;
    public final Object d;

    public t4(int i10, String str, boolean z10) {
        this.f19216b = i10;
        this.d = str;
        this.f19217c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19215a) {
            case 0:
                boolean z10 = this.f19217c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f19216b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f19216b, this.f19217c);
                return;
        }
    }

    public t4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f19216b = i10;
        this.f19217c = z10;
    }
}
