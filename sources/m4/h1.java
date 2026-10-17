package m4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
public final class h1 implements SurfaceHolder {
    public final Surface f16544a;
    public final Rect f16545b;
    public SurfaceHolder.Callback f16546c;

    public h1(Surface surface) {
        this.f16545b = new Rect();
        this.f16544a = surface;
    }

    @Override
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.f16546c = callback;
    }

    @Override
    public final Surface getSurface() {
        return this.f16544a;
    }

    @Override
    public final Rect getSurfaceFrame() {
        return this.f16545b;
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
        if (this.f16546c == callback) {
            this.f16546c = null;
        }
    }

    @Override
    public final void setFixedSize(int i10, int i11) {
        this.f16545b.set(0, 0, i10, i11);
        SurfaceHolder.Callback callback = this.f16546c;
        if (callback != null) {
            callback.surfaceChanged(this, 1, i10, i11);
        }
    }

    @Override
    public final Canvas lockCanvas(Rect rect) {
        throw new UnsupportedOperationException();
    }

    public h1(Surface surface, int i10, int i11) {
        Rect rect = new Rect();
        this.f16545b = rect;
        this.f16544a = surface;
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
