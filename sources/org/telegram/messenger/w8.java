package org.telegram.messenger;
public final class w8 implements Runnable {
    public final int f27668a;
    public final y8 f27669b;
    public final int[] f27670c;

    public w8(y8 y8Var, int[] iArr, int i7) {
        this.f27668a = i7;
        this.f27669b = y8Var;
        this.f27670c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f27668a) {
            case 0:
                this.f27669b.f27997q.add(Integer.valueOf(this.f27670c[0]));
                return;
            default:
                this.f27669b.f27997q.remove(Integer.valueOf(this.f27670c[0]));
                return;
        }
    }
}
