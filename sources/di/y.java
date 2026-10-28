package di;

import android.view.TextureView;
public abstract class y extends TextureView {
    @Override
    public void invalidate() {
        if (w.f9281c) {
            w.f9280b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (w.f9281c) {
            w.f9280b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
