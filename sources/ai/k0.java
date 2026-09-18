package ai;

import android.view.TextureView;
public abstract class k0 extends TextureView {
    @Override
    public void invalidate() {
        if (i0.f968c) {
            i0.f967b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (i0.f968c) {
            i0.f967b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
