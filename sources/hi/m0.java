package hi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.kr;
public final class m0 {
    public int f14864a;
    public final org.telegram.ui.Components.c6 f14865b;
    public final ImageReceiver f14866c;
    public l0 d;
    public TextureView f14867e;
    public boolean f14868f;
    public b0 h;
    public boolean f14874m;
    public x7 f14875n;
    public ValueAnimator f14876o;
    public final n0 f14877p;
    public volatile long f14869g = -1;
    public boolean f14870i = false;
    public final RectF f14871j = new RectF();
    public final RectF f14872k = new RectF();
    public float f14873l = 1.0f;

    public m0(n0 n0Var) {
        this.f14877p = n0Var;
        this.f14865b = new org.telegram.ui.Components.c6(n0Var, 0L, 1200L, kr.f36859g);
        this.f14866c = new ImageReceiver(n0Var);
    }

    public final void a(x7 x7Var) {
        String str;
        float f10;
        l0 l0Var = this.d;
        if (l0Var != null) {
            l0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.f14867e;
        if (textureView != null) {
            org.telegram.messenger.g0.E2(textureView);
            this.f14867e = null;
        }
        this.f14868f = false;
        this.f14875n = x7Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.g0.f24226q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.g0.f24225p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.g0.f24225p));
        if (x7Var != null && x7Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s5 = a8.p0.s(sb2, str, "_exif");
        x7 x7Var2 = this.f14875n;
        n0 n0Var = this.f14877p;
        ImageReceiver imageReceiver = this.f14866c;
        if (x7Var2 == null) {
            imageReceiver.f();
        } else if (x7Var2.K) {
            Bitmap bitmap = x7Var2.M0;
            if (bitmap != null) {
                imageReceiver.w0(bitmap);
            } else {
                Bitmap bitmap2 = x7Var2.f15738b1;
                if (bitmap2 != null) {
                    imageReceiver.w0(bitmap2);
                } else {
                    String str2 = x7Var2.N;
                    if (str2 != null) {
                        imageReceiver.p0(str2, s5, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(n0Var.getContext());
            this.f14867e = textureView2;
            n0Var.addView(textureView2);
            l0 l0Var2 = new l0(this, 0);
            this.d = l0Var2;
            l0Var2.allowMultipleInstances(true);
            this.d.with(this.f14867e);
            this.d.preparePlayer(Uri.fromFile(this.f14875n.L), false, 1.0f);
            l0 l0Var3 = this.d;
            if (!n0Var.f14994w0) {
                x7 x7Var3 = this.f14875n;
                if (!x7Var3.Y && n0Var.f14983o0) {
                    f10 = x7Var3.P;
                    l0Var3.setVolume(f10);
                    if (!n0Var.f14983o0 && !n0Var.f14987r0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f10 = 0.0f;
            l0Var3.setVolume(f10);
            if (!n0Var.f14983o0) {
            }
            this.d.play();
        } else {
            imageReceiver.p0(x7Var2.L.getAbsolutePath(), s5, null, null, 0L);
        }
        n0Var.invalidate();
    }

    public final void b(b0 b0Var, boolean z10) {
        b0 b0Var2 = this.h;
        if (b0Var != null) {
            this.h = b0Var;
        }
        ValueAnimator valueAnimator = this.f14876o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14876o = null;
        }
        RectF rectF = this.f14872k;
        n0 n0Var = this.f14877p;
        if (z10) {
            boolean z11 = this.f14870i;
            RectF rectF2 = this.f14871j;
            if (!z11) {
                n0.a(n0Var, rectF2, b0Var);
            } else {
                org.telegram.messenger.g0.Z1(rectF2, rectF, this.f14873l, rectF2);
            }
            if (b0Var == null) {
                n0.a(n0Var, rectF, b0Var2);
            } else {
                n0Var.k(rectF, b0Var);
            }
            this.f14873l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f14876o = ofFloat;
            ofFloat.addUpdateListener(new fi.d4(this, 2));
            this.f14876o.addListener(new ai.g0(this, 19));
            this.f14876o.setInterpolator(kr.h);
            this.f14876o.setDuration(360L);
            this.f14876o.start();
        } else {
            n0Var.k(rectF, b0Var);
            this.f14873l = 1.0f;
        }
        n0Var.invalidate();
        this.f14870i = true;
    }
}
