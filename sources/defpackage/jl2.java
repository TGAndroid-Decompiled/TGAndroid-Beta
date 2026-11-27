package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
public final class jl2 {
    public int a;
    public final mm b;
    public final ImageReceiver c;
    public il2 d;
    public TextureView e;
    public boolean f;
    public zk2 h;
    public boolean m;
    public c8b n;
    public ValueAnimator o;
    public final kl2 p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public jl2(kl2 kl2Var) {
        this.p = kl2Var;
        this.b = new mm(kl2Var, 0L, 1200L, k43.g);
        this.c = new ImageReceiver(kl2Var);
    }

    public final void a(c8b c8bVar) {
        String str;
        float f;
        il2 il2Var = this.d;
        if (il2Var != null) {
            il2Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            hl.B2(textureView);
            this.e = null;
        }
        this.f = false;
        this.n = c8bVar;
        StringBuilder sb = new StringBuilder();
        Point point = hl.q;
        sb.append((int) Math.ceil(point.x / hl.p));
        sb.append("_");
        sb.append((int) Math.ceil(point.y / hl.p));
        if (c8bVar != null && c8bVar.K) {
            str = "_g";
        } else {
            str = "";
        }
        String k = c00.k(sb, str, "_exif");
        c8b c8bVar2 = this.n;
        kl2 kl2Var = this.p;
        ImageReceiver imageReceiver = this.c;
        if (c8bVar2 == null) {
            imageReceiver.f();
        } else if (c8bVar2.K) {
            Bitmap bitmap = c8bVar2.M0;
            if (bitmap != null) {
                imageReceiver.f0(bitmap);
            } else {
                Bitmap bitmap2 = c8bVar2.b1;
                if (bitmap2 != null) {
                    imageReceiver.f0(bitmap2);
                } else {
                    String str2 = c8bVar2.N;
                    if (str2 != null) {
                        imageReceiver.e0(str2, k, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(kl2Var.getContext());
            this.e = textureView2;
            kl2Var.addView(textureView2);
            il2 il2Var2 = new il2(this, (byte) 0);
            this.d = il2Var2;
            il2Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.n.L), false, 1.0f);
            il2 il2Var3 = this.d;
            if (!kl2Var.w0) {
                c8b c8bVar3 = this.n;
                if (!c8bVar3.Y && kl2Var.o0) {
                    f = c8bVar3.P;
                    il2Var3.setVolume(f);
                    if (!kl2Var.o0 && !kl2Var.r0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f = 0.0f;
            il2Var3.setVolume(f);
            if (!kl2Var.o0) {
            }
            this.d.play();
        } else {
            imageReceiver.e0(c8bVar2.L.getAbsolutePath(), k, null, null, 0L);
        }
        kl2Var.invalidate();
    }

    public final void b(zk2 zk2Var, boolean z) {
        zk2 zk2Var2 = this.h;
        if (zk2Var != null) {
            this.h = zk2Var;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o = null;
        }
        RectF rectF = this.k;
        kl2 kl2Var = this.p;
        if (z) {
            boolean z2 = this.i;
            RectF rectF2 = this.j;
            if (!z2) {
                kl2Var.k(rectF2, zk2Var);
            } else {
                hl.X1(rectF2, rectF, this.l, rectF2);
            }
            if (zk2Var == null) {
                kl2Var.k(rectF, zk2Var2);
            } else {
                kl2Var.j(rectF, zk2Var);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new ce0(this, (byte) 3));
            this.o.addListener(new jb1(this, (byte) 29));
            this.o.setInterpolator(k43.h);
            this.o.setDuration(360L);
            this.o.start();
        } else {
            kl2Var.j(rectF, zk2Var);
            this.l = 1.0f;
        }
        kl2Var.invalidate();
        this.i = true;
    }
}
