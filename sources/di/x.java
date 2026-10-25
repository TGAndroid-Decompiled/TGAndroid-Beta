package di;
public abstract class x extends f8 {
    @Override
    public final void invalidate() {
        if (w.f9282c) {
            w.f9281b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (w.f9282c) {
            w.f9281b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
