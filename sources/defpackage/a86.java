package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class a86 extends TextureView implements zn9, TextureView.SurfaceTextureListener {
    public final gi3 a;
    public volatile Surface b;
    public volatile boolean c;
    public int d;
    public int e;

    public a86(Context context, gi3 gi3Var) {
        super(context);
        this.a = gi3Var;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    @Override
    public final void a(int i, int i2) {
        gl.d3(new bt(this, i, i2, (byte) 9));
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
        um9.I(this, null);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.b;
        this.b = null;
        um9.I(this, new y76(surface, surfaceTexture, (byte) 2));
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i;
        u76 u76Var = (u76) this.a.a;
        if (!u76Var.y) {
            u76Var.onFirstFrameRendered();
        }
        a86 a86Var = u76Var.e;
        if (a86Var != null && a86Var.isAvailable() && e66.e(512)) {
            int videoWidth = u76Var.e.getVideoWidth();
            int videoHeight = u76Var.e.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                if (u76Var.e.getMeasuredWidth() < u76Var.getMeasuredWidth() || u76Var.e.getMeasuredHeight() < u76Var.getMeasuredHeight()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - u76Var.n >= 100) {
                        u76Var.n = elapsedRealtime;
                        int i2 = 48;
                        if (videoWidth >= videoHeight) {
                            i = Math.max(1, Math.round((videoHeight * 48) / videoWidth));
                        } else {
                            i2 = Math.max(1, Math.round((videoWidth * 48) / videoHeight));
                            i = 48;
                        }
                        Bitmap bitmap = u76Var.h;
                        if (bitmap == null || bitmap.getWidth() != i2 || u76Var.h.getHeight() != i) {
                            u76Var.h = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                        }
                        try {
                            u76Var.e.getBitmap(u76Var.h);
                            Utilities.stackBlurBitmap(u76Var.h, 3);
                            s71 s71Var = u76Var.f;
                            s71Var.c = u76Var.h;
                            s71Var.invalidate();
                        } catch (Exception e) {
                            fa4.g(e, true);
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
