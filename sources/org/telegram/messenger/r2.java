package org.telegram.messenger;
public final class r2 implements Runnable {
    public final int f21088a;
    public final FileLoadOperation f21089b;
    public final int f21090c;

    public r2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f21088a = i11;
        this.f21089b = fileLoadOperation;
        this.f21090c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21088a) {
            case 0:
                FileLoadOperation.F(this.f21089b, this.f21090c);
                return;
            case 1:
                FileLoadOperation.j(this.f21089b, this.f21090c);
                return;
            case 2:
                FileLoadOperation.y(this.f21089b, this.f21090c);
                return;
            default:
                FileLoadOperation.o(this.f21089b, this.f21090c);
                return;
        }
    }
}
