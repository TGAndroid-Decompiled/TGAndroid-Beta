package ei;

import android.view.TextureView;
public abstract class y extends TextureView {
    @Override
    public void invalidate() {
        if (w.f11144c) {
            w.f11143b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i3, int i10, int i11, int i12) {
        if (w.f11144c) {
            w.f11143b.add(this);
        } else {
            super.invalidate(i3, i10, i11, i12);
        }
    }
}
