package gi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.xq;
public final class d0 {
    public int f12533a;
    public final org.telegram.ui.Components.u5 f12534b;
    public final ImageReceiver f12535c;
    public c0 d;
    public TextureView f12536e;
    public boolean f12537f;
    public s h;
    public boolean f12543m;
    public f7 f12544n;
    public ValueAnimator f12545o;
    public final e0 f12546p;
    public volatile long f12538g = -1;
    public boolean f12539i = false;
    public final RectF f12540j = new RectF();
    public final RectF f12541k = new RectF();
    public float f12542l = 1.0f;

    public d0(e0 e0Var) {
        this.f12546p = e0Var;
        this.f12534b = new org.telegram.ui.Components.u5(e0Var, 0L, 1200L, xq.f40453g);
        this.f12535c = new ImageReceiver(e0Var);
    }

    public final void a(f7 f7Var) {
        String str;
        float f10;
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.f12536e;
        if (textureView != null) {
            org.telegram.messenger.g0.E2(textureView);
            this.f12536e = null;
        }
        this.f12537f = false;
        this.f12544n = f7Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.g0.f22608q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.g0.f22607p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.g0.f22607p));
        if (f7Var != null && f7Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s6 = a1.g.s(sb2, str, "_exif");
        f7 f7Var2 = this.f12544n;
        e0 e0Var = this.f12546p;
        ImageReceiver imageReceiver = this.f12535c;
        if (f7Var2 == null) {
            imageReceiver.f();
        } else if (f7Var2.K) {
            Bitmap bitmap = f7Var2.M0;
            if (bitmap != null) {
                imageReceiver.v0(bitmap);
            } else {
                Bitmap bitmap2 = f7Var2.f12707b1;
                if (bitmap2 != null) {
                    imageReceiver.v0(bitmap2);
                } else {
                    String str2 = f7Var2.N;
                    if (str2 != null) {
                        imageReceiver.o0(str2, s6, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(e0Var.getContext());
            this.f12536e = textureView2;
            e0Var.addView(textureView2);
            c0 c0Var2 = new c0(this, 0);
            this.d = c0Var2;
            c0Var2.allowMultipleInstances(true);
            this.d.with(this.f12536e);
            this.d.preparePlayer(Uri.fromFile(this.f12544n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f12647w0) {
                f7 f7Var3 = this.f12544n;
                if (!f7Var3.Y && e0Var.f12636o0) {
                    f10 = f7Var3.P;
                    c0Var3.setVolume(f10);
                    if (!e0Var.f12636o0 && !e0Var.f12640r0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f10 = 0.0f;
            c0Var3.setVolume(f10);
            if (!e0Var.f12636o0) {
            }
            this.d.play();
        } else {
            imageReceiver.o0(f7Var2.L.getAbsolutePath(), s6, null, null, 0L);
        }
        e0Var.invalidate();
    }

    public final void b(s sVar, boolean z10) {
        s sVar2 = this.h;
        if (sVar != null) {
            this.h = sVar;
        }
        ValueAnimator valueAnimator = this.f12545o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12545o = null;
        }
        RectF rectF = this.f12541k;
        e0 e0Var = this.f12546p;
        if (z10) {
            boolean z11 = this.f12539i;
            RectF rectF2 = this.f12540j;
            if (!z11) {
                e0.a(e0Var, rectF2, sVar);
            } else {
                org.telegram.messenger.g0.Z1(rectF2, rectF, this.f12542l, rectF2);
            }
            if (sVar == null) {
                e0.a(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f12542l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f12545o = ofFloat;
            ofFloat.addUpdateListener(new ei.n4(this, 2));
            this.f12545o.addListener(new ai.e1(this, 19));
            this.f12545o.setInterpolator(xq.h);
            this.f12545o.setDuration(360L);
            this.f12545o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f12542l = 1.0f;
        }
        e0Var.invalidate();
        this.f12539i = true;
    }
}
