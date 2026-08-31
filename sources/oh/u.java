package oh;
public abstract class u extends r7 {
    @Override
    public final void invalidate() {
        if (t.f17753c) {
            t.f17752b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (t.f17753c) {
            t.f17752b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
