package m4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
public final class i1 implements SurfaceHolder {
    public final Surface f18077a;
    public final Rect f18078b;
    public SurfaceHolder.Callback f18079c;

    public i1(Surface surface) {
        this.f18078b = new Rect();
        this.f18077a = surface;
    }

    @Override
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.f18079c = callback;
    }

    @Override
    public final Surface getSurface() {
        return this.f18077a;
    }

    @Override
    public final Rect getSurfaceFrame() {
        return this.f18078b;
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
        if (this.f18079c == callback) {
            this.f18079c = null;
        }
    }

    @Override
    public final void setFixedSize(int i10, int i11) {
        this.f18078b.set(0, 0, i10, i11);
        SurfaceHolder.Callback callback = this.f18079c;
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
        this.f18078b = rect;
        this.f18077a = surface;
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
