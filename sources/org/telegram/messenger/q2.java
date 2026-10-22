package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f19249a;
    public final FileLoadOperation f19250b;
    public final int f19251c;

    public q2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f19249a = i11;
        this.f19250b = fileLoadOperation;
        this.f19251c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19249a) {
            case 0:
                FileLoadOperation.F(this.f19250b, this.f19251c);
                return;
            case 1:
                FileLoadOperation.j(this.f19250b, this.f19251c);
                return;
            case 2:
                FileLoadOperation.y(this.f19250b, this.f19251c);
                return;
            default:
                FileLoadOperation.o(this.f19250b, this.f19251c);
                return;
        }
    }
}
