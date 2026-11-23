package hi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.nr;
public final class e0 {
    public int f14483a;
    public final org.telegram.ui.Components.d6 f14484b;
    public final ImageReceiver f14485c;
    public d0 d;
    public TextureView f14486e;
    public boolean f14487f;
    public s h;
    public boolean f14493m;
    public d7 f14494n;
    public ValueAnimator f14495o;
    public final f0 f14496p;
    public volatile long f14488g = -1;
    public boolean f14489i = false;
    public final RectF f14490j = new RectF();
    public final RectF f14491k = new RectF();
    public float f14492l = 1.0f;

    public e0(f0 f0Var) {
        this.f14496p = f0Var;
        this.f14484b = new org.telegram.ui.Components.d6(f0Var, 0L, 1200L, nr.f37918g);
        this.f14485c = new ImageReceiver(f0Var);
    }

    public final void a(d7 d7Var) {
        String str;
        float f10;
        d0 d0Var = this.d;
        if (d0Var != null) {
            d0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.f14486e;
        if (textureView != null) {
            org.telegram.messenger.g0.E2(textureView);
            this.f14486e = null;
        }
        this.f14487f = false;
        this.f14494n = d7Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.g0.f24010q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.g0.f24009p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.g0.f24009p));
        if (d7Var != null && d7Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s5 = a8.p0.s(sb2, str, "_exif");
        d7 d7Var2 = this.f14494n;
        f0 f0Var = this.f14496p;
        ImageReceiver imageReceiver = this.f14485c;
        if (d7Var2 == null) {
            imageReceiver.f();
        } else if (d7Var2.K) {
            Bitmap bitmap = d7Var2.M0;
            if (bitmap != null) {
                imageReceiver.v0(bitmap);
            } else {
                Bitmap bitmap2 = d7Var2.f14367b1;
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
            TextureView textureView2 = new TextureView(f0Var.getContext());
            this.f14486e = textureView2;
            f0Var.addView(textureView2);
            d0 d0Var2 = new d0(this, 0);
            this.d = d0Var2;
            d0Var2.allowMultipleInstances(true);
            this.d.with(this.f14486e);
            this.d.preparePlayer(Uri.fromFile(this.f14494n.L), false, 1.0f);
            d0 d0Var3 = this.d;
            if (!f0Var.f14589w0) {
                d7 d7Var3 = this.f14494n;
                if (!d7Var3.Y && f0Var.f14578o0) {
                    f10 = d7Var3.P;
                    d0Var3.setVolume(f10);
                    if (!f0Var.f14578o0 && !f0Var.f14582r0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f10 = 0.0f;
            d0Var3.setVolume(f10);
            if (!f0Var.f14578o0) {
            }
            this.d.play();
        } else {
            imageReceiver.o0(d7Var2.L.getAbsolutePath(), s5, null, null, 0L);
        }
        f0Var.invalidate();
    }

    public final void b(s sVar, boolean z10) {
        s sVar2 = this.h;
        if (sVar != null) {
            this.h = sVar;
        }
        ValueAnimator valueAnimator = this.f14495o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14495o = null;
        }
        RectF rectF = this.f14491k;
        f0 f0Var = this.f14496p;
        if (z10) {
            boolean z11 = this.f14489i;
            RectF rectF2 = this.f14490j;
            if (!z11) {
                f0.a(f0Var, rectF2, sVar);
            } else {
                org.telegram.messenger.g0.Z1(rectF2, rectF, this.f14492l, rectF2);
            }
            if (sVar == null) {
                f0.a(f0Var, rectF, sVar2);
            } else {
                f0Var.k(rectF, sVar);
            }
            this.f14492l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f14495o = ofFloat;
            ofFloat.addUpdateListener(new fi.d4(this, 2));
            this.f14495o.addListener(new ai.f0(this, 19));
            this.f14495o.setInterpolator(nr.h);
            this.f14495o.setDuration(360L);
            this.f14495o.start();
        } else {
            f0Var.k(rectF, sVar);
            this.f14492l = 1.0f;
        }
        f0Var.invalidate();
        this.f14489i = true;
    }
}
