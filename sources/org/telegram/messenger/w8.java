package org.telegram.messenger;
public final class w8 implements Runnable {
    public final int f27704a;
    public final y8 f27705b;
    public final int[] f27706c;

    public w8(y8 y8Var, int[] iArr, int i7) {
        this.f27704a = i7;
        this.f27705b = y8Var;
        this.f27706c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f27704a) {
            case 0:
                this.f27705b.f28033q.add(Integer.valueOf(this.f27706c[0]));
                return;
            default:
                this.f27705b.f28033q.remove(Integer.valueOf(this.f27706c[0]));
                return;
        }
    }
}
