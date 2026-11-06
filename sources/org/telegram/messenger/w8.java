package org.telegram.messenger;
public final class w8 implements Runnable {
    public final int f26263a;
    public final y8 f26264b;
    public final int[] f26265c;

    public w8(y8 y8Var, int[] iArr, int i7) {
        this.f26263a = i7;
        this.f26264b = y8Var;
        this.f26265c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f26263a) {
            case 0:
                this.f26264b.f26596q.add(Integer.valueOf(this.f26265c[0]));
                return;
            default:
                this.f26264b.f26596q.remove(Integer.valueOf(this.f26265c[0]));
                return;
        }
    }
}
