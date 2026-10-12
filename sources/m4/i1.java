package m4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
public final class i1 implements SurfaceHolder {
    public final Surface f15460a;
    public final Rect f15461b;
    public SurfaceHolder.Callback f15462c;

    public i1(Surface surface) {
        this.f15461b = new Rect();
        this.f15460a = surface;
    }

    @Override
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.f15462c = callback;
    }

    @Override
    public final Surface getSurface() {
        return this.f15460a;
    }

    @Override
    public final Rect getSurfaceFrame() {
        return this.f15461b;
    }

    @Override
    public final boolean isCreating() {
        return false;
    }

    @Override
    public final Canvas lockCanvas() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void removeCallback(SurfaceHolder.Callback callback) {
        if (this.f15462c == callback) {
            this.f15462c = null;
        }
    }

    @Override
    public final void setFixedSize(int i10, int i11) {
        this.f15461b.set(0, 0, i10, i11);
        SurfaceHolder.Callback callback = this.f15462c;
        if (callback != null) {
            callback.surfaceChanged(this, 1, i10, i11);
        }
    }

    @Override
    public final Canvas lockCanvas(Rect rect) {
        throw new UnsupportedOperationException();
    }

    public i1(Surface surface, int i10, int i11) {
        Rect rect = new Rect();
        this.f15461b = rect;
        this.f15460a = surface;
        rect.set(0, 0, i10, i11);
    }

    @Override
    public final void setSizeFromLayout() {
    }

    @Override
    public final void setFormat(int i10) {
    }

    @Override
    public final void setKeepScreenOn(boolean z10) {
    }

    @Override
    public final void setType(int i10) {
    }

    @Override
    public final void unlockCanvasAndPost(Canvas canvas) {
    }
}
