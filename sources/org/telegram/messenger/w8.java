package org.telegram.messenger;
public final class w8 implements Runnable {
    public final int f27318a;
    public final y8 f27319b;
    public final int[] f27320c;

    public w8(y8 y8Var, int[] iArr, int i7) {
        this.f27318a = i7;
        this.f27319b = y8Var;
        this.f27320c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f27318a) {
            case 0:
                this.f27319b.f27682q.add(Integer.valueOf(this.f27320c[0]));
                return;
            default:
                this.f27319b.f27682q.remove(Integer.valueOf(this.f27320c[0]));
                return;
        }
    }
}
