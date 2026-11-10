package di;
public abstract class w extends x7 {
    @Override
    public final void invalidate() {
        if (v.f9856c) {
            v.f9855b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (v.f9856c) {
            v.f9855b.add(this);
        } else {
            super.invalidate(i7, i10, i11, i12);
        }
    }
}
