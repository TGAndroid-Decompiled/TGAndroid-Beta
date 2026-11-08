package org.telegram.messenger;
public final class w8 implements Runnable {
    public final int f26274a;
    public final y8 f26275b;
    public final int[] f26276c;

    public w8(y8 y8Var, int[] iArr, int i7) {
        this.f26274a = i7;
        this.f26275b = y8Var;
        this.f26276c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f26274a) {
            case 0:
                this.f26275b.f26613q.add(Integer.valueOf(this.f26276c[0]));
                return;
            default:
                this.f26275b.f26613q.remove(Integer.valueOf(this.f26276c[0]));
                return;
        }
    }
}
