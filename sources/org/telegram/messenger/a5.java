package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f19593a = 0;
    public final int f19594b;
    public final boolean f19595c;
    public final Object d;

    public a5(int i10, String str, boolean z10) {
        this.f19594b = i10;
        this.d = str;
        this.f19595c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19593a) {
            case 0:
                boolean z10 = this.f19595c;
                ImageLoader.AnonymousClass5.b(this.f19594b, (String) this.d, z10);
                return;
            default:
                MessagesController.p8(this.f19594b, (MessagesController) this.d, this.f19595c);
                return;
        }
    }

    public a5(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f19594b = i10;
        this.f19595c = z10;
    }
}
