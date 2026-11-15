package org.telegram.messenger;
public final class w8 implements Runnable {
    public final int f27317a;
    public final y8 f27318b;
    public final int[] f27319c;

    public w8(y8 y8Var, int[] iArr, int i7) {
        this.f27317a = i7;
        this.f27318b = y8Var;
        this.f27319c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f27317a) {
            case 0:
                this.f27318b.f27684q.add(Integer.valueOf(this.f27319c[0]));
                return;
            default:
                this.f27318b.f27684q.remove(Integer.valueOf(this.f27319c[0]));
                return;
        }
    }
}
