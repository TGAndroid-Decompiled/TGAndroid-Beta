package nh;
public abstract class v extends r7 {
    @Override
    public final void invalidate() {
        if (u.f15945c) {
            u.f15944b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (u.f15945c) {
            u.f15944b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
