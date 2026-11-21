package hi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.nr;
public final class f0 {
    public int f14612a;
    public final org.telegram.ui.Components.d6 f14613b;
    public final ImageReceiver f14614c;
    public e0 d;
    public TextureView f14615e;
    public boolean f14616f;
    public u h;
    public boolean f14622m;
    public c7 f14623n;
    public ValueAnimator f14624o;
    public final g0 f14625p;
    public volatile long f14617g = -1;
    public boolean f14618i = false;
    public final RectF f14619j = new RectF();
    public final RectF f14620k = new RectF();
    public float f14621l = 1.0f;

    public f0(g0 g0Var) {
        this.f14625p = g0Var;
        this.f14613b = new org.telegram.ui.Components.d6(g0Var, 0L, 1200L, nr.f37957g);
        this.f14614c = new ImageReceiver(g0Var);
    }

    public final void a(c7 c7Var) {
        String str;
        float f10;
        e0 e0Var = this.d;
        if (e0Var != null) {
            e0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.f14615e;
        if (textureView != null) {
            org.telegram.messenger.g0.E2(textureView);
            this.f14615e = null;
        }
        this.f14616f = false;
        this.f14623n = c7Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.g0.f24146q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.g0.f24145p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.g0.f24145p));
        if (c7Var != null && c7Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s5 = a8.p0.s(sb2, str, "_exif");
        c7 c7Var2 = this.f14623n;
        g0 g0Var = this.f14625p;
        ImageReceiver imageReceiver = this.f14614c;
        if (c7Var2 == null) {
            imageReceiver.f();
        } else if (c7Var2.K) {
            Bitmap bitmap = c7Var2.M0;
            if (bitmap != null) {
                imageReceiver.v0(bitmap);
            } else {
                Bitmap bitmap2 = c7Var2.f14340b1;
                if (bitmap2 != null) {
                    imageReceiver.v0(bitmap2);
                } else {
                    String str2 = c7Var2.N;
                    if (str2 != null) {
                        imageReceiver.o0(str2, s5, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(g0Var.getContext());
            this.f14615e = textureView2;
            g0Var.addView(textureView2);
            e0 e0Var2 = new e0(this, 0);
            this.d = e0Var2;
            e0Var2.allowMultipleInstances(true);
            this.d.with(this.f14615e);
            this.d.preparePlayer(Uri.fromFile(this.f14623n.L), false, 1.0f);
            e0 e0Var3 = this.d;
            if (!g0Var.f14692w0) {
                c7 c7Var3 = this.f14623n;
                if (!c7Var3.Y && g0Var.f14681o0) {
                    f10 = c7Var3.P;
                    e0Var3.setVolume(f10);
                    if (!g0Var.f14681o0 && !g0Var.f14685r0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f10 = 0.0f;
            e0Var3.setVolume(f10);
            if (!g0Var.f14681o0) {
            }
            this.d.play();
        } else {
            imageReceiver.o0(c7Var2.L.getAbsolutePath(), s5, null, null, 0L);
        }
        g0Var.invalidate();
    }

    public final void b(u uVar, boolean z10) {
        u uVar2 = this.h;
        if (uVar != null) {
            this.h = uVar;
        }
        ValueAnimator valueAnimator = this.f14624o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14624o = null;
        }
        RectF rectF = this.f14620k;
        g0 g0Var = this.f14625p;
        if (z10) {
            boolean z11 = this.f14618i;
            RectF rectF2 = this.f14619j;
            if (!z11) {
                g0.a(g0Var, rectF2, uVar);
            } else {
                org.telegram.messenger.g0.Z1(rectF2, rectF, this.f14621l, rectF2);
            }
            if (uVar == null) {
                g0.a(g0Var, rectF, uVar2);
            } else {
                g0Var.k(rectF, uVar);
            }
            this.f14621l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f14624o = ofFloat;
            ofFloat.addUpdateListener(new fi.d4(this, 2));
            this.f14624o.addListener(new ai.k0(this, 19));
            this.f14624o.setInterpolator(nr.h);
            this.f14624o.setDuration(360L);
            this.f14624o.start();
        } else {
            g0Var.k(rectF, uVar);
            this.f14621l = 1.0f;
        }
        g0Var.invalidate();
        this.f14618i = true;
    }
}
