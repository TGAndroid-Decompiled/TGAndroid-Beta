package fi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.wq;
public final class d0 {
    public int f11772a;
    public final org.telegram.ui.Components.v5 f11773b;
    public final ImageReceiver f11774c;
    public c0 d;
    public TextureView f11775e;
    public boolean f11776f;
    public s h;
    public boolean f11782m;
    public e7 f11783n;
    public ValueAnimator f11784o;
    public final e0 f11785p;
    public volatile long f11777g = -1;
    public boolean f11778i = false;
    public final RectF f11779j = new RectF();
    public final RectF f11780k = new RectF();
    public float f11781l = 1.0f;

    public d0(e0 e0Var) {
        this.f11785p = e0Var;
        this.f11773b = new org.telegram.ui.Components.v5(e0Var, 0L, 1200L, wq.f40047g);
        this.f11774c = new ImageReceiver(e0Var);
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
        TextureView textureView = this.f11775e;
        if (textureView != null) {
            org.telegram.messenger.g0.E2(textureView);
            this.f11775e = null;
        }
        this.f11776f = false;
        this.f11783n = e7Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.g0.f22567q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.g0.f22566p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.g0.f22566p));
        if (e7Var != null && e7Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s5 = a8.p0.s(sb2, str, "_exif");
        e7 e7Var2 = this.f11783n;
        e0 e0Var = this.f11785p;
        ImageReceiver imageReceiver = this.f11774c;
        if (e7Var2 == null) {
            imageReceiver.f();
        } else if (e7Var2.K) {
            Bitmap bitmap = e7Var2.M0;
            if (bitmap != null) {
                imageReceiver.v0(bitmap);
            } else {
                Bitmap bitmap2 = e7Var2.f11885b1;
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
            this.f11775e = textureView2;
            e0Var.addView(textureView2);
            c0 c0Var2 = new c0(this, 0);
            this.d = c0Var2;
            c0Var2.allowMultipleInstances(true);
            this.d.with(this.f11775e);
            this.d.preparePlayer(Uri.fromFile(this.f11783n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f11854v0) {
                e7 e7Var3 = this.f11783n;
                if (!e7Var3.Y && e0Var.f11844n0) {
                    f10 = e7Var3.P;
                    c0Var3.setVolume(f10);
                    if (!e0Var.f11844n0 && !e0Var.f11847q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f10 = 0.0f;
            c0Var3.setVolume(f10);
            if (!e0Var.f11844n0) {
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
        ValueAnimator valueAnimator = this.f11784o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11784o = null;
        }
        RectF rectF = this.f11780k;
        e0 e0Var = this.f11785p;
        if (z9) {
            boolean z10 = this.f11778i;
            RectF rectF2 = this.f11779j;
            if (!z10) {
                e0.a(e0Var, rectF2, sVar);
            } else {
                org.telegram.messenger.g0.Z1(rectF2, rectF, this.f11781l, rectF2);
            }
            if (sVar == null) {
                e0.a(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f11781l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f11784o = ofFloat;
            ofFloat.addUpdateListener(new di.n4(this, 2));
            this.f11784o.addListener(new bi.t5(this, 17));
            this.f11784o.setInterpolator(wq.h);
            this.f11784o.setDuration(360L);
            this.f11784o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f11781l = 1.0f;
        }
        e0Var.invalidate();
        this.f11778i = true;
    }
}
