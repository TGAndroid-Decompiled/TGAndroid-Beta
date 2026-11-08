package fi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.xq;
public final class d0 {
    public int f11768a;
    public final org.telegram.ui.Components.w5 f11769b;
    public final ImageReceiver f11770c;
    public c0 d;
    public TextureView f11771e;
    public boolean f11772f;
    public s h;
    public boolean f11778m;
    public e7 f11779n;
    public ValueAnimator f11780o;
    public final e0 f11781p;
    public volatile long f11773g = -1;
    public boolean f11774i = false;
    public final RectF f11775j = new RectF();
    public final RectF f11776k = new RectF();
    public float f11777l = 1.0f;

    public d0(e0 e0Var) {
        this.f11781p = e0Var;
        this.f11769b = new org.telegram.ui.Components.w5(e0Var, 0L, 1200L, xq.f40367g);
        this.f11770c = new ImageReceiver(e0Var);
    }

    public final void a(e7 e7Var) {
        String str;
        float f10;
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.f11771e;
        if (textureView != null) {
            org.telegram.messenger.g0.E2(textureView);
            this.f11771e = null;
        }
        this.f11772f = false;
        this.f11779n = e7Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.g0.f22563q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.g0.f22562p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.g0.f22562p));
        if (e7Var != null && e7Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s5 = a8.p0.s(sb2, str, "_exif");
        e7 e7Var2 = this.f11779n;
        e0 e0Var = this.f11781p;
        ImageReceiver imageReceiver = this.f11770c;
        if (e7Var2 == null) {
            imageReceiver.f();
        } else if (e7Var2.K) {
            Bitmap bitmap = e7Var2.M0;
            if (bitmap != null) {
                imageReceiver.v0(bitmap);
            } else {
                Bitmap bitmap2 = e7Var2.f11881b1;
                if (bitmap2 != null) {
                    imageReceiver.v0(bitmap2);
                } else {
                    String str2 = e7Var2.N;
                    if (str2 != null) {
                        imageReceiver.o0(str2, s5, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(e0Var.getContext());
            this.f11771e = textureView2;
            e0Var.addView(textureView2);
            c0 c0Var2 = new c0(this, 0);
            this.d = c0Var2;
            c0Var2.allowMultipleInstances(true);
            this.d.with(this.f11771e);
            this.d.preparePlayer(Uri.fromFile(this.f11779n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f11850v0) {
                e7 e7Var3 = this.f11779n;
                if (!e7Var3.Y && e0Var.f11840n0) {
                    f10 = e7Var3.P;
                    c0Var3.setVolume(f10);
                    if (!e0Var.f11840n0 && !e0Var.f11843q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f10 = 0.0f;
            c0Var3.setVolume(f10);
            if (!e0Var.f11840n0) {
            }
            this.d.play();
        } else {
            imageReceiver.o0(e7Var2.L.getAbsolutePath(), s5, null, null, 0L);
        }
        e0Var.invalidate();
    }

    public final void b(s sVar, boolean z9) {
        s sVar2 = this.h;
        if (sVar != null) {
            this.h = sVar;
        }
        ValueAnimator valueAnimator = this.f11780o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11780o = null;
        }
        RectF rectF = this.f11776k;
        e0 e0Var = this.f11781p;
        if (z9) {
            boolean z10 = this.f11774i;
            RectF rectF2 = this.f11775j;
            if (!z10) {
                e0.a(e0Var, rectF2, sVar);
            } else {
                org.telegram.messenger.g0.Z1(rectF2, rectF, this.f11777l, rectF2);
            }
            if (sVar == null) {
                e0.a(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f11777l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f11780o = ofFloat;
            ofFloat.addUpdateListener(new di.m4(this, 2));
            this.f11780o.addListener(new bi.t5(this, 17));
            this.f11780o.setInterpolator(xq.h);
            this.f11780o.setDuration(360L);
            this.f11780o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f11777l = 1.0f;
        }
        e0Var.invalidate();
        this.f11774i = true;
    }
}
