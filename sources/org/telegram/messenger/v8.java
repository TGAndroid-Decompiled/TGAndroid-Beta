package org.telegram.messenger;
public final class v8 implements Runnable {
    public final int f27431a;
    public final x8 f27432b;
    public final int[] f27433c;

    public v8(x8 x8Var, int[] iArr, int i7) {
        this.f27431a = i7;
        this.f27432b = x8Var;
        this.f27433c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f27431a) {
            case 0:
                this.f27432b.f27937q.add(Integer.valueOf(this.f27433c[0]));
                return;
            default:
                this.f27432b.f27937q.remove(Integer.valueOf(this.f27433c[0]));
                return;
        }
    }
}
