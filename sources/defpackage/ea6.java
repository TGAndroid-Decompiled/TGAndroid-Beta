package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class ea6 extends TextureView implements qr9, TextureView.SurfaceTextureListener {
    public final kj4 a;
    public volatile Surface b;
    public volatile boolean c;
    public int d;
    public int e;

    public ea6(Context context, kj4 kj4Var) {
        super(context);
        this.a = kj4Var;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    @Override
    public final void a(int i, int i2) {
        hl.c3(new bt(this, i, i2, (byte) 9));
    }

    @Override
    public final boolean b() {
        return this.c;
    }

    public final void c() {
        boolean z;
        if (isAttachedToWindow() && getWindowVisibility() == 0 && isShown()) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
    }

    @Override
    public Surface getSurface() {
        return this.b;
    }

    public int getVideoHeight() {
        return this.e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i);
        int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i2);
        int i4 = this.d;
        if (i4 > 0 && (i3 = this.e) > 0 && defaultSize > 0 && defaultSize2 > 0) {
            float f = i4 / i3;
            setMeasuredDimension(Math.min(defaultSize, Math.round(defaultSize2 * f)), Math.min(defaultSize2, Math.round(defaultSize / f)));
            return;
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.b = new Surface(surfaceTexture);
        kq9.I(this, null);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.b;
        this.b = null;
        kq9.I(this, new ca6(surface, surfaceTexture, (byte) 2));
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i;
        x96 x96Var = (x96) this.a.b;
        if (!x96Var.y) {
            x96Var.onFirstFrameRendered();
        }
        ea6 ea6Var = x96Var.e;
        if (ea6Var != null && ea6Var.isAvailable() && i86.e(512)) {
            int videoWidth = x96Var.e.getVideoWidth();
            int videoHeight = x96Var.e.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                if (x96Var.e.getMeasuredWidth() < x96Var.getMeasuredWidth() || x96Var.e.getMeasuredHeight() < x96Var.getMeasuredHeight()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - x96Var.n >= 100) {
                        x96Var.n = elapsedRealtime;
                        int i2 = 48;
                        if (videoWidth >= videoHeight) {
                            i = Math.max(1, Math.round((videoHeight * 48) / videoWidth));
                        } else {
                            i2 = Math.max(1, Math.round((videoWidth * 48) / videoHeight));
                            i = 48;
                        }
                        Bitmap bitmap = x96Var.h;
                        if (bitmap == null || bitmap.getWidth() != i2 || x96Var.h.getHeight() != i) {
                            x96Var.h = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                        }
                        try {
                            x96Var.e.getBitmap(x96Var.h);
                            Utilities.stackBlurBitmap(x96Var.h, 3);
                            a81 a81Var = x96Var.f;
                            a81Var.c = x96Var.h;
                            a81Var.invalidate();
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        c();
    }

    @Override
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (isAttachedToWindow() && i == 0 && isShown()) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
