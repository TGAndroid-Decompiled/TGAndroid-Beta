package org.telegram.messenger;
public final class w8 implements Runnable {
    public final int f27686a;
    public final y8 f27687b;
    public final int[] f27688c;

    public w8(y8 y8Var, int[] iArr, int i7) {
        this.f27686a = i7;
        this.f27687b = y8Var;
        this.f27688c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f27686a) {
            case 0:
                this.f27687b.f28126q.add(Integer.valueOf(this.f27688c[0]));
                return;
            default:
                this.f27687b.f28126q.remove(Integer.valueOf(this.f27688c[0]));
                return;
        }
    }
}
