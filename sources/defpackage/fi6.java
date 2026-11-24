package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;
public final class fi6 {
    public final t96 a;
    public SurfaceView d;
    public Bitmap e;
    public Bitmap f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Paint c = new Paint(2);
    public final fp4 m = new fp4(this, (byte) 1);
    public final tp5 n = new tp5(this, (byte) 27);

    public fi6(t96 t96Var) {
        this.a = t96Var;
    }

    public final void a() {
        this.l = SystemClock.uptimeMillis() + 1500;
        if (this.k) {
            this.b.removeCallbacks(this.n);
            this.k = false;
        }
        b();
    }

    public final void b() {
        if (this.g && !this.i && this.d != null && !this.j && !this.k) {
            if (SystemClock.uptimeMillis() < this.l) {
                this.j = true;
                Choreographer.getInstance().postFrameCallback(this.m);
                return;
            }
            this.k = true;
            this.b.postDelayed(this.n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.g && !this.i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f.getHeight() != max2) {
                        this.f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    Bitmap bitmap2 = this.f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new ok(this, bitmap2, (byte) 1), this.b);
                    } catch (Exception e) {
                        this.h = false;
                        fa4.g(e, true);
                    }
                }
            }
            b();
        }
    }

    public final void d() {
        if (this.j) {
            Choreographer.getInstance().removeFrameCallback(this.m);
            this.j = false;
        }
        if (this.k) {
            this.b.removeCallbacks(this.n);
            this.k = false;
        }
    }
}
