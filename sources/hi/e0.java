package hi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.lr;
public final class e0 {
    public int f14506a;
    public final org.telegram.ui.Components.c6 f14507b;
    public final ImageReceiver f14508c;
    public d0 d;
    public TextureView f14509e;
    public boolean f14510f;
    public t h;
    public boolean f14516m;
    public d7 f14517n;
    public ValueAnimator f14518o;
    public final f0 f14519p;
    public volatile long f14511g = -1;
    public boolean f14512i = false;
    public final RectF f14513j = new RectF();
    public final RectF f14514k = new RectF();
    public float f14515l = 1.0f;

    public e0(f0 f0Var) {
        this.f14519p = f0Var;
        this.f14507b = new org.telegram.ui.Components.c6(f0Var, 0L, 1200L, lr.f37209g);
        this.f14508c = new ImageReceiver(f0Var);
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
        TextureView textureView = this.f14509e;
        if (textureView != null) {
            org.telegram.messenger.g0.E2(textureView);
            this.f14509e = null;
        }
        this.f14510f = false;
        this.f14517n = d7Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.g0.f24118q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.g0.f24117p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.g0.f24117p));
        if (d7Var != null && d7Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s5 = a8.p0.s(sb2, str, "_exif");
        d7 d7Var2 = this.f14517n;
        f0 f0Var = this.f14519p;
        ImageReceiver imageReceiver = this.f14508c;
        if (d7Var2 == null) {
            imageReceiver.f();
        } else if (d7Var2.K) {
            Bitmap bitmap = d7Var2.M0;
            if (bitmap != null) {
                imageReceiver.v0(bitmap);
            } else {
                Bitmap bitmap2 = d7Var2.f14390b1;
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
            this.f14509e = textureView2;
            f0Var.addView(textureView2);
            d0 d0Var2 = new d0(this, 0);
            this.d = d0Var2;
            d0Var2.allowMultipleInstances(true);
            this.d.with(this.f14509e);
            this.d.preparePlayer(Uri.fromFile(this.f14517n.L), false, 1.0f);
            d0 d0Var3 = this.d;
            if (!f0Var.f14637w0) {
                d7 d7Var3 = this.f14517n;
                if (!d7Var3.Y && f0Var.f14626o0) {
                    f10 = d7Var3.P;
                    d0Var3.setVolume(f10);
                    if (!f0Var.f14626o0 && !f0Var.f14630r0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f10 = 0.0f;
            d0Var3.setVolume(f10);
            if (!f0Var.f14626o0) {
            }
            this.d.play();
        } else {
            imageReceiver.o0(d7Var2.L.getAbsolutePath(), s5, null, null, 0L);
        }
        f0Var.invalidate();
    }

    public final void b(t tVar, boolean z10) {
        t tVar2 = this.h;
        if (tVar != null) {
            this.h = tVar;
        }
        ValueAnimator valueAnimator = this.f14518o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14518o = null;
        }
        RectF rectF = this.f14514k;
        f0 f0Var = this.f14519p;
        if (z10) {
            boolean z11 = this.f14512i;
            RectF rectF2 = this.f14513j;
            if (!z11) {
                f0.a(f0Var, rectF2, tVar);
            } else {
                org.telegram.messenger.g0.Z1(rectF2, rectF, this.f14515l, rectF2);
            }
            if (tVar == null) {
                f0.a(f0Var, rectF, tVar2);
            } else {
                f0Var.k(rectF, tVar);
            }
            this.f14515l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f14518o = ofFloat;
            ofFloat.addUpdateListener(new fi.d4(this, 2));
            this.f14518o.addListener(new ai.j0(this, 19));
            this.f14518o.setInterpolator(lr.h);
            this.f14518o.setDuration(360L);
            this.f14518o.start();
        } else {
            f0Var.k(rectF, tVar);
            this.f14515l = 1.0f;
        }
        f0Var.invalidate();
        this.f14512i = true;
    }
}
