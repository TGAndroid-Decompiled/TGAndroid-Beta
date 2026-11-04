package o4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
public final class g1 implements SurfaceHolder {
    public final Surface f20649a;
    public final Rect f20650b;
    public SurfaceHolder.Callback f20651c;

    public g1(Surface surface) {
        this.f20650b = new Rect();
        this.f20649a = surface;
    }

    @Override
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.f20651c = callback;
    }

    @Override
    public final Surface getSurface() {
        return this.f20649a;
    }

    @Override
    public final Rect getSurfaceFrame() {
        return this.f20650b;
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
        if (this.f20651c == callback) {
            this.f20651c = null;
        }
    }

    @Override
    public final void setFixedSize(int i3, int i10) {
        this.f20650b.set(0, 0, i3, i10);
        SurfaceHolder.Callback callback = this.f20651c;
        if (callback != null) {
            callback.surfaceChanged(this, 1, i3, i10);
        }
    }

    @Override
    public final Canvas lockCanvas(Rect rect) {
        throw new UnsupportedOperationException();
    }

    public g1(Surface surface, int i3, int i10) {
        Rect rect = new Rect();
        this.f20650b = rect;
        this.f20649a = surface;
        rect.set(0, 0, i3, i10);
    }

    @Override
    public final void setSizeFromLayout() {
    }

    @Override
    public final void setFormat(int i3) {
    }

    @Override
    public final void setKeepScreenOn(boolean z10) {
    }

    @Override
    public final void setType(int i3) {
    }

    @Override
    public final void unlockCanvasAndPost(Canvas canvas) {
    }
}
