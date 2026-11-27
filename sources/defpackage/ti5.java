package defpackage;
public abstract class ti5 extends x6b {
    @Override
    public final void invalidate() {
        if (si5.c) {
            si5.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (si5.c) {
            si5.b.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
