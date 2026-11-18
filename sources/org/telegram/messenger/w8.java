package org.telegram.messenger;
public final class w8 implements Runnable {
    public final int f27660a;
    public final y8 f27661b;
    public final int[] f27662c;

    public w8(y8 y8Var, int[] iArr, int i7) {
        this.f27660a = i7;
        this.f27661b = y8Var;
        this.f27662c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f27660a) {
            case 0:
                this.f27661b.f28100q.add(Integer.valueOf(this.f27662c[0]));
                return;
            default:
                this.f27661b.f28100q.remove(Integer.valueOf(this.f27662c[0]));
                return;
        }
    }
}
