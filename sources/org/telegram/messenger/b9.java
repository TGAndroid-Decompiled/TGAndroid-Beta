package org.telegram.messenger;
public final class b9 implements Runnable {
    public final int f14749a;
    public final d9 f14750b;
    public final int[] f14751c;

    public b9(d9 d9Var, int[] iArr, int i10) {
        this.f14749a = i10;
        this.f14750b = d9Var;
        this.f14751c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f14749a) {
            case 0:
                this.f14750b.f15208q.add(Integer.valueOf(this.f14751c[0]));
                return;
            default:
                this.f14750b.f15208q.remove(Integer.valueOf(this.f14751c[0]));
                return;
        }
    }
}
