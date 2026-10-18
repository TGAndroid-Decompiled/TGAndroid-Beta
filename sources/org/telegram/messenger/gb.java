package org.telegram.messenger;
public final class gb implements Runnable {
    public final int f18446a;
    public final MessagesController f18447b;
    public final long f18448c;
    public final int d;
    public final boolean e;
    public final int f18449f;
    public final int h;

    public gb(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18446a = i13;
        this.f18447b = messagesController;
        this.f18448c = j10;
        this.d = i10;
        this.e = z10;
        this.f18449f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18446a) {
            case 0:
                int i10 = this.f18449f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18447b.lambda$markDialogAsRead$242(this.f18448c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f18449f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18447b.lambda$markDialogAsRead$243(this.f18448c, i15, this.e, i13, i14);
                return;
        }
    }
}
