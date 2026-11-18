package org.telegram.messenger;
public final class w8 implements Runnable {
    public final int f27658a;
    public final y8 f27659b;
    public final int[] f27660c;

    public w8(y8 y8Var, int[] iArr, int i7) {
        this.f27658a = i7;
        this.f27659b = y8Var;
        this.f27660c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f27658a) {
            case 0:
                this.f27659b.f28098q.add(Integer.valueOf(this.f27660c[0]));
                return;
            default:
                this.f27659b.f28098q.remove(Integer.valueOf(this.f27660c[0]));
                return;
        }
    }
}
