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
    public int f14615a;
    public final org.telegram.ui.Components.d6 f14616b;
    public final ImageReceiver f14617c;
    public e0 d;
    public TextureView f14618e;
    public boolean f14619f;
    public u h;
    public boolean f14625m;
    public c7 f14626n;
    public ValueAnimator f14627o;
    public final g0 f14628p;
    public volatile long f14620g = -1;
    public boolean f14621i = false;
    public final RectF f14622j = new RectF();
    public final RectF f14623k = new RectF();
    public float f14624l = 1.0f;

    public f0(g0 g0Var) {
        this.f14628p = g0Var;
        this.f14616b = new org.telegram.ui.Components.d6(g0Var, 0L, 1200L, nr.f37961g);
        this.f14617c = new ImageReceiver(g0Var);
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
        TextureView textureView = this.f14618e;
        if (textureView != null) {
            org.telegram.messenger.g0.E2(textureView);
            this.f14618e = null;
        }
        this.f14619f = false;
        this.f14626n = c7Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.g0.f24046q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.g0.f24045p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.g0.f24045p));
        if (c7Var != null && c7Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s5 = a8.p0.s(sb2, str, "_exif");
        c7 c7Var2 = this.f14626n;
        g0 g0Var = this.f14628p;
        ImageReceiver imageReceiver = this.f14617c;
        if (c7Var2 == null) {
            imageReceiver.f();
        } else if (c7Var2.K) {
            Bitmap bitmap = c7Var2.M0;
            if (bitmap != null) {
                imageReceiver.v0(bitmap);
            } else {
                Bitmap bitmap2 = c7Var2.f14343b1;
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
            this.f14618e = textureView2;
            g0Var.addView(textureView2);
            e0 e0Var2 = new e0(this, 0);
            this.d = e0Var2;
            e0Var2.allowMultipleInstances(true);
            this.d.with(this.f14618e);
            this.d.preparePlayer(Uri.fromFile(this.f14626n.L), false, 1.0f);
            e0 e0Var3 = this.d;
            if (!g0Var.f14695w0) {
                c7 c7Var3 = this.f14626n;
                if (!c7Var3.Y && g0Var.f14684o0) {
                    f10 = c7Var3.P;
                    e0Var3.setVolume(f10);
                    if (!g0Var.f14684o0 && !g0Var.f14688r0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f10 = 0.0f;
            e0Var3.setVolume(f10);
            if (!g0Var.f14684o0) {
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
        ValueAnimator valueAnimator = this.f14627o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14627o = null;
        }
        RectF rectF = this.f14623k;
        g0 g0Var = this.f14628p;
        if (z10) {
            boolean z11 = this.f14621i;
            RectF rectF2 = this.f14622j;
            if (!z11) {
                g0.a(g0Var, rectF2, uVar);
            } else {
                org.telegram.messenger.g0.Z1(rectF2, rectF, this.f14624l, rectF2);
            }
            if (uVar == null) {
                g0.a(g0Var, rectF, uVar2);
            } else {
                g0Var.k(rectF, uVar);
            }
            this.f14624l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f14627o = ofFloat;
            ofFloat.addUpdateListener(new fi.d4(this, 2));
            this.f14627o.addListener(new ai.k0(this, 19));
            this.f14627o.setInterpolator(nr.h);
            this.f14627o.setDuration(360L);
            this.f14627o.start();
        } else {
            g0Var.k(rectF, uVar);
            this.f14624l = 1.0f;
        }
        g0Var.invalidate();
        this.f14621i = true;
    }
}
