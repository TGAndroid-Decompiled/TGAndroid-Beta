package ai;
public abstract class j0 extends na {
    @Override
    public final void invalidate() {
        if (i0.f965c) {
            i0.f964b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (i0.f965c) {
            i0.f964b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
