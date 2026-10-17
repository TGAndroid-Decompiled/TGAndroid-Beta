package org.telegram.messenger;
public final class gb implements Runnable {
    public final int f18447a;
    public final MessagesController f18448b;
    public final long f18449c;
    public final int d;
    public final boolean e;
    public final int f18450f;
    public final int h;

    public gb(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18447a = i13;
        this.f18448b = messagesController;
        this.f18449c = j10;
        this.d = i10;
        this.e = z10;
        this.f18450f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18447a) {
            case 0:
                int i10 = this.f18450f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18448b.lambda$markDialogAsRead$242(this.f18449c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f18450f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18448b.lambda$markDialogAsRead$243(this.f18449c, i15, this.e, i13, i14);
                return;
        }
    }
}
