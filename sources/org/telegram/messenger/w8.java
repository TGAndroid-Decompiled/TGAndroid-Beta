package org.telegram.messenger;
public final class w8 implements Runnable {
    public final int f26271a;
    public final y8 f26272b;
    public final int[] f26273c;

    public w8(y8 y8Var, int[] iArr, int i7) {
        this.f26271a = i7;
        this.f26272b = y8Var;
        this.f26273c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f26271a) {
            case 0:
                this.f26272b.f26604q.add(Integer.valueOf(this.f26273c[0]));
                return;
            default:
                this.f26272b.f26604q.remove(Integer.valueOf(this.f26273c[0]));
                return;
        }
    }
}
