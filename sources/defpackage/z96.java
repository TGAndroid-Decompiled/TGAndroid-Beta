package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class z96 extends TextureView implements aq9, TextureView.SurfaceTextureListener {
    public final lj4 a;
    public volatile Surface b;
    public volatile boolean c;
    public int d;
    public int e;

    public z96(Context context, lj4 lj4Var) {
        super(context);
        this.a = lj4Var;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    @Override
    public final void a(int i, int i2) {
        gm.c3(new cu(this, i, i2, (byte) 9));
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
        vo9.I(this, null);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.b;
        this.b = null;
        vo9.I(this, new x96(surface, surfaceTexture, (byte) 2));
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i;
        t96 t96Var = (t96) this.a.a;
        if (!t96Var.y) {
            t96Var.onFirstFrameRendered();
        }
        z96 z96Var = t96Var.e;
        if (z96Var != null && z96Var.isAvailable() && e86.e(512)) {
            int videoWidth = t96Var.e.getVideoWidth();
            int videoHeight = t96Var.e.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                if (t96Var.e.getMeasuredWidth() < t96Var.getMeasuredWidth() || t96Var.e.getMeasuredHeight() < t96Var.getMeasuredHeight()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - t96Var.n >= 100) {
                        t96Var.n = elapsedRealtime;
                        int i2 = 48;
                        if (videoWidth >= videoHeight) {
                            i = Math.max(1, Math.round((videoHeight * 48) / videoWidth));
                        } else {
                            i2 = Math.max(1, Math.round((videoWidth * 48) / videoHeight));
                            i = 48;
                        }
                        Bitmap bitmap = t96Var.h;
                        if (bitmap == null || bitmap.getWidth() != i2 || t96Var.h.getHeight() != i) {
                            t96Var.h = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                        }
                        try {
                            t96Var.e.getBitmap(t96Var.h);
                            Utilities.stackBlurBitmap(t96Var.h, 3);
                            a91 a91Var = t96Var.f;
                            a91Var.c = t96Var.h;
                            a91Var.invalidate();
                        } catch (Exception e) {
                            fc4.g(e, true);
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
