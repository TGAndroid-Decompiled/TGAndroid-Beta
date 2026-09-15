package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class s4 implements Runnable {
    public final int f17283a = 0;
    public final int f17284b;
    public final boolean f17285c;
    public final Object d;

    public s4(int i10, String str, boolean z10) {
        this.f17284b = i10;
        this.d = str;
        this.f17285c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17283a) {
            case 0:
                boolean z10 = this.f17285c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f17284b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.f17284b, this.f17285c);
                return;
        }
    }

    public s4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f17284b = i10;
        this.f17285c = z10;
    }
}
