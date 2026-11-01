package org.telegram.messenger;
public final class b9 implements Runnable {
    public final int f14949a;
    public final d9 f14950b;
    public final int[] f14951c;

    public b9(d9 d9Var, int[] iArr, int i10) {
        this.f14949a = i10;
        this.f14950b = d9Var;
        this.f14951c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f14949a) {
            case 0:
                this.f14950b.f15323q.add(Integer.valueOf(this.f14951c[0]));
                return;
            default:
                this.f14950b.f15323q.remove(Integer.valueOf(this.f14951c[0]));
                return;
        }
    }
}
