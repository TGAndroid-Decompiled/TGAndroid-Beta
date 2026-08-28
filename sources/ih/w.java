package ih;
public abstract class w extends u7 {
    @Override
    public final void invalidate() {
        if (v.f12218c) {
            v.f12217b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i9, int i10, int i11, int i12) {
        if (v.f12218c) {
            v.f12217b.add(this);
        } else {
            super.invalidate(i9, i10, i11, i12);
        }
    }
}
