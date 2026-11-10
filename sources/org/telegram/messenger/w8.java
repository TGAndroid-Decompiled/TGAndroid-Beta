package org.telegram.messenger;
public final class w8 implements Runnable {
    public final int f26278a;
    public final y8 f26279b;
    public final int[] f26280c;

    public w8(y8 y8Var, int[] iArr, int i7) {
        this.f26278a = i7;
        this.f26279b = y8Var;
        this.f26280c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f26278a) {
            case 0:
                this.f26279b.f26617q.add(Integer.valueOf(this.f26280c[0]));
                return;
            default:
                this.f26279b.f26617q.remove(Integer.valueOf(this.f26280c[0]));
                return;
        }
    }
}
