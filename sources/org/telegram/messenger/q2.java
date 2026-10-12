package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f18633a;
    public final FileLoadOperation f18634b;
    public final int f18635c;

    public q2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18633a = i11;
        this.f18634b = fileLoadOperation;
        this.f18635c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18633a) {
            case 0:
                FileLoadOperation.F(this.f18634b, this.f18635c);
                return;
            case 1:
                FileLoadOperation.j(this.f18634b, this.f18635c);
                return;
            case 2:
                FileLoadOperation.y(this.f18634b, this.f18635c);
                return;
            default:
                FileLoadOperation.o(this.f18634b, this.f18635c);
                return;
        }
    }
}
