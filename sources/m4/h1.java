package m4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
public final class h1 implements SurfaceHolder {
    public final Surface f16552a;
    public final Rect f16553b;
    public SurfaceHolder.Callback f16554c;

    public h1(Surface surface) {
        this.f16553b = new Rect();
        this.f16552a = surface;
    }

    @Override
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.f16554c = callback;
    }

    @Override
    public final Surface getSurface() {
        return this.f16552a;
    }

    @Override
    public final Rect getSurfaceFrame() {
        return this.f16553b;
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
        if (this.f16554c == callback) {
            this.f16554c = null;
        }
    }

    @Override
    public final void setFixedSize(int i10, int i11) {
        this.f16553b.set(0, 0, i10, i11);
        SurfaceHolder.Callback callback = this.f16554c;
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
        this.f16553b = rect;
        this.f16552a = surface;
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
