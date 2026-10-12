package bi;
public abstract class c0 extends x9 {
    @Override
    public final void invalidate() {
        if (b0.f2849c) {
            b0.f2848b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (b0.f2849c) {
            b0.f2848b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
