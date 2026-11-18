package org.telegram.messenger;
public final class bn implements nr {
    public final int[] f23104a;
    public final di.i9 f23105b;

    public bn(int[] iArr, di.i9 i9Var) {
        this.f23104a = iArr;
        this.f23105b = i9Var;
    }

    @Override
    public final void a(int i7) {
        this.f23104a[0] = i7;
        this.f23105b.run();
    }
}
