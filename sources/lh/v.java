package lh;

import android.view.TextureView;
public abstract class v extends TextureView {
    @Override
    public void invalidate() {
        if (t.f16248c) {
            t.f16247b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (t.f16248c) {
            t.f16247b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
