package org.telegram.messenger;
public final class w8 implements Runnable {
    public final int f26177a;
    public final y8 f26178b;
    public final int[] f26179c;

    public w8(y8 y8Var, int[] iArr, int i3) {
        this.f26177a = i3;
        this.f26178b = y8Var;
        this.f26179c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f26177a) {
            case 0:
                this.f26178b.f26548q.add(Integer.valueOf(this.f26179c[0]));
                return;
            default:
                this.f26178b.f26548q.remove(Integer.valueOf(this.f26179c[0]));
                return;
        }
    }
}
