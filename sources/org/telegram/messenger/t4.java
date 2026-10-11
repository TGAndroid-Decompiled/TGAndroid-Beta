package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class t4 implements Runnable {
    public final int f19251a = 0;
    public final int f19252b;
    public final boolean f19253c;
    public final Object d;

    public t4(int i10, String str, boolean z10) {
        this.f19252b = i10;
        this.d = str;
        this.f19253c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19251a) {
            case 0:
                boolean z10 = this.f19253c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f19252b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.f19252b, this.f19253c);
                return;
        }
    }

    public t4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f19252b = i10;
        this.f19253c = z10;
    }
}
