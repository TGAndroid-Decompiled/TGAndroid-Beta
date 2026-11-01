package org.telegram.messenger;
public final class ct implements Runnable {
    public final int f15206a;
    public final pt f15207b;
    public final long f15208c;
    public final long d;

    public ct(pt ptVar, long j10, long j11, int i10) {
        this.f15206a = i10;
        this.f15207b = ptVar;
        this.f15208c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f15206a) {
            case 0:
                pt ptVar = this.f15207b;
                ptVar.F = this.f15208c;
                ptVar.G = this.d;
                return;
            default:
                this.f15207b.o(this.f15208c, this.d);
                return;
        }
    }
}
