package org.telegram.messenger;
public final class lb implements Runnable {
    public final int f18866a;
    public final MessagesController f18867b;
    public final long f18868c;
    public final int d;
    public final boolean e;
    public final int f18869f;
    public final int h;

    public lb(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18866a = i13;
        this.f18867b = messagesController;
        this.f18868c = j10;
        this.d = i10;
        this.e = z10;
        this.f18869f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18866a) {
            case 0:
                int i10 = this.f18869f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18867b.lambda$markDialogAsRead$242(this.f18868c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f18869f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18867b.lambda$markDialogAsRead$243(this.f18868c, i15, this.e, i13, i14);
                return;
        }
    }
}
