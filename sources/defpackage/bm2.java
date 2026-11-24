package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
public final class bm2 {
    public int a;
    public final ln b;
    public final ImageReceiver c;
    public am2 d;
    public TextureView e;
    public boolean f;
    public rl2 h;
    public boolean m;
    public g6b n;
    public ValueAnimator o;
    public final cm2 p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public bm2(cm2 cm2Var) {
        this.p = cm2Var;
        this.b = new ln(cm2Var, 0L, 1200L, d53.g);
        this.c = new ImageReceiver(cm2Var);
    }

    public final void a(g6b g6bVar) {
        String str;
        float f;
        am2 am2Var = this.d;
        if (am2Var != null) {
            am2Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            gm.B2(textureView);
            this.e = null;
        }
        this.f = false;
        this.n = g6bVar;
        StringBuilder sb = new StringBuilder();
        Point point = gm.q;
        sb.append((int) Math.ceil(point.x / gm.p));
        sb.append("_");
        sb.append((int) Math.ceil(point.y / gm.p));
        if (g6bVar != null && g6bVar.K) {
            str = "_g";
        } else {
            str = "";
        }
        String j = b10.j(sb, str, "_exif");
        g6b g6bVar2 = this.n;
        cm2 cm2Var = this.p;
        ImageReceiver imageReceiver = this.c;
        if (g6bVar2 == null) {
            imageReceiver.f();
        } else if (g6bVar2.K) {
            Bitmap bitmap = g6bVar2.M0;
            if (bitmap != null) {
                imageReceiver.f0(bitmap);
            } else {
                Bitmap bitmap2 = g6bVar2.b1;
                if (bitmap2 != null) {
                    imageReceiver.f0(bitmap2);
                } else {
                    String str2 = g6bVar2.N;
                    if (str2 != null) {
                        imageReceiver.e0(str2, j, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(cm2Var.getContext());
            this.e = textureView2;
            cm2Var.addView(textureView2);
            am2 am2Var2 = new am2(this, (byte) 0);
            this.d = am2Var2;
            am2Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.n.L), false, 1.0f);
            am2 am2Var3 = this.d;
            if (!cm2Var.w0) {
                g6b g6bVar3 = this.n;
                if (!g6bVar3.Y && cm2Var.o0) {
                    f = g6bVar3.P;
                    am2Var3.setVolume(f);
                    if (!cm2Var.o0 && !cm2Var.r0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f = 0.0f;
            am2Var3.setVolume(f);
            if (!cm2Var.o0) {
            }
            this.d.play();
        } else {
            imageReceiver.e0(g6bVar2.L.getAbsolutePath(), j, null, null, 0L);
        }
        cm2Var.invalidate();
    }

    public final void b(rl2 rl2Var, boolean z) {
        rl2 rl2Var2 = this.h;
        if (rl2Var != null) {
            this.h = rl2Var;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o = null;
        }
        RectF rectF = this.k;
        cm2 cm2Var = this.p;
        if (z) {
            boolean z2 = this.i;
            RectF rectF2 = this.j;
            if (!z2) {
                cm2Var.k(rectF2, rl2Var);
            } else {
                gm.X1(rectF2, rectF, this.l, rectF2);
            }
            if (rl2Var == null) {
                cm2Var.k(rectF, rl2Var2);
            } else {
                cm2Var.j(rectF, rl2Var);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new af0(this, (byte) 3));
            this.o.addListener(new kh2(this, (byte) 1));
            this.o.setInterpolator(d53.h);
            this.o.setDuration(360L);
            this.o.start();
        } else {
            cm2Var.j(rectF, rl2Var);
            this.l = 1.0f;
        }
        cm2Var.invalidate();
        this.i = true;
    }
}
