package hi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.er;
public final class d0 {
    public int f14072a;
    public final org.telegram.ui.Components.u5 f14073b;
    public final ImageReceiver f14074c;
    public c0 d;
    public TextureView f14075e;
    public boolean f14076f;
    public s h;
    public boolean f14082m;
    public d7 f14083n;
    public ValueAnimator f14084o;
    public final e0 f14085p;
    public volatile long f14077g = -1;
    public boolean f14078i = false;
    public final RectF f14079j = new RectF();
    public final RectF f14080k = new RectF();
    public float f14081l = 1.0f;

    public d0(e0 e0Var) {
        this.f14085p = e0Var;
        this.f14073b = new org.telegram.ui.Components.u5(e0Var, 0L, 1200L, er.f34420g);
        this.f14074c = new ImageReceiver(e0Var);
    }

    public final void a(d7 d7Var) {
        String str;
        float f10;
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.f14075e;
        if (textureView != null) {
            org.telegram.messenger.g0.E2(textureView);
            this.f14075e = null;
        }
        this.f14076f = false;
        this.f14083n = d7Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.g0.f23611q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.g0.f23610p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.g0.f23610p));
        if (d7Var != null && d7Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s5 = a8.p0.s(sb2, str, "_exif");
        d7 d7Var2 = this.f14083n;
        e0 e0Var = this.f14085p;
        ImageReceiver imageReceiver = this.f14074c;
        if (d7Var2 == null) {
            imageReceiver.f();
        } else if (d7Var2.K) {
            Bitmap bitmap = d7Var2.M0;
            if (bitmap != null) {
                imageReceiver.v0(bitmap);
            } else {
                Bitmap bitmap2 = d7Var2.f14128b1;
                if (bitmap2 != null) {
                    imageReceiver.v0(bitmap2);
                } else {
                    String str2 = d7Var2.N;
                    if (str2 != null) {
                        imageReceiver.o0(str2, s5, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(e0Var.getContext());
            this.f14075e = textureView2;
            e0Var.addView(textureView2);
            c0 c0Var2 = new c0(this, 0);
            this.d = c0Var2;
            c0Var2.allowMultipleInstances(true);
            this.d.with(this.f14075e);
            this.d.preparePlayer(Uri.fromFile(this.f14083n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f14222w0) {
                d7 d7Var3 = this.f14083n;
                if (!d7Var3.Y && e0Var.f14211o0) {
                    f10 = d7Var3.P;
                    c0Var3.setVolume(f10);
                    if (!e0Var.f14211o0 && !e0Var.f14215r0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f10 = 0.0f;
            c0Var3.setVolume(f10);
            if (!e0Var.f14211o0) {
            }
            this.d.play();
        } else {
            imageReceiver.o0(d7Var2.L.getAbsolutePath(), s5, null, null, 0L);
        }
        e0Var.invalidate();
    }

    public final void b(s sVar, boolean z10) {
        s sVar2 = this.h;
        if (sVar != null) {
            this.h = sVar;
        }
        ValueAnimator valueAnimator = this.f14084o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14084o = null;
        }
        RectF rectF = this.f14080k;
        e0 e0Var = this.f14085p;
        if (z10) {
            boolean z11 = this.f14078i;
            RectF rectF2 = this.f14079j;
            if (!z11) {
                e0.a(e0Var, rectF2, sVar);
            } else {
                org.telegram.messenger.g0.Z1(rectF2, rectF, this.f14081l, rectF2);
            }
            if (sVar == null) {
                e0.a(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f14081l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f14084o = ofFloat;
            ofFloat.addUpdateListener(new fi.f4(this, 2));
            this.f14084o.addListener(new ai.j0(this, 19));
            this.f14084o.setInterpolator(er.h);
            this.f14084o.setDuration(360L);
            this.f14084o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f14081l = 1.0f;
        }
        e0Var.invalidate();
        this.f14078i = true;
    }
}
