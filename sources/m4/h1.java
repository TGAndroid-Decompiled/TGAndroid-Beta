package m4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
public final class h1 implements SurfaceHolder {
    public final Surface f15190a;
    public final Rect f15191b;
    public SurfaceHolder.Callback f15192c;

    public h1(Surface surface) {
        this.f15191b = new Rect();
        this.f15190a = surface;
    }

    @Override
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.f15192c = callback;
    }

    @Override
    public final Surface getSurface() {
        return this.f15190a;
    }

    @Override
    public final Rect getSurfaceFrame() {
        return this.f15191b;
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
        if (this.f15192c == callback) {
            this.f15192c = null;
        }
    }

    @Override
    public final void setFixedSize(int i10, int i11) {
        this.f15191b.set(0, 0, i10, i11);
        SurfaceHolder.Callback callback = this.f15192c;
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
        this.f15191b = rect;
        this.f15190a = surface;
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
