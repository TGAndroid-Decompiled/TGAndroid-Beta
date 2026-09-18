package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class s4 implements Runnable {
    public final int f17464a = 0;
    public final int f17465b;
    public final boolean f17466c;
    public final Object d;

    public s4(int i10, String str, boolean z10) {
        this.f17465b = i10;
        this.d = str;
        this.f17466c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17464a) {
            case 0:
                boolean z10 = this.f17466c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f17465b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f17465b, this.f17466c);
                return;
        }
    }

    public s4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f17465b = i10;
        this.f17466c = z10;
    }
}
