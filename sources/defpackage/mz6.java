package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
public final class mz6 implements SurfaceHolder {
    public final Surface a;
    public final Rect b;
    public SurfaceHolder.Callback c;

    public mz6(Surface surface, int i, int i2) {
        Rect rect = new Rect();
        this.b = rect;
        this.a = surface;
        rect.set(0, 0, i, i2);
    }

    @Override
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.c = callback;
    }

    @Override
    public final Surface getSurface() {
        return this.a;
    }

    @Override
    public final Rect getSurfaceFrame() {
        return this.b;
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
        if (this.c == callback) {
            this.c = null;
        }
    }

    @Override
    public final void setFixedSize(int i, int i2) {
        this.b.set(0, 0, i, i2);
        SurfaceHolder.Callback callback = this.c;
        if (callback != null) {
            callback.surfaceChanged(this, 1, i, i2);
        }
    }

    @Override
    public final Canvas lockCanvas(Rect rect) {
        throw new UnsupportedOperationException();
    }

    public mz6(Surface surface) {
        this.b = new Rect();
        this.a = surface;
    }

    @Override
    public final void setSizeFromLayout() {
    }

    @Override
    public final void setFormat(int i) {
    }

    @Override
    public final void setKeepScreenOn(boolean z) {
    }

    @Override
    public final void setType(int i) {
    }

    @Override
    public final void unlockCanvasAndPost(Canvas canvas) {
    }
}
