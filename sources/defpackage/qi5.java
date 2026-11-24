package defpackage;
public abstract class qi5 extends c5b {
    @Override
    public final void invalidate() {
        if (pi5.c) {
            pi5.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (pi5.c) {
            pi5.b.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
