package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f17235a;
    public final FileLoadOperation f17236b;
    public final boolean f17237c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f17235a = i10;
        this.f17236b = fileLoadOperation;
        this.f17237c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17235a) {
            case 0:
                FileLoadOperation.d(this.f17236b, this.f17237c);
                return;
            case 1:
                FileLoadOperation.g(this.f17236b, this.f17237c);
                return;
            case 2:
                FileLoadOperation.n(this.f17236b, this.f17237c);
                return;
            default:
                FileLoadOperation.b(this.f17236b, this.f17237c);
                return;
        }
    }
}
