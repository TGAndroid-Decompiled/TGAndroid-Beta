package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
public final class pk2 {
    public int a;
    public final lm b;
    public final ImageReceiver c;
    public ok2 d;
    public TextureView e;
    public boolean f;
    public ek2 h;
    public boolean m;
    public f4b n;
    public ValueAnimator o;
    public final qk2 p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public pk2(qk2 qk2Var) {
        this.p = qk2Var;
        this.b = new lm(qk2Var, 0L, 1200L, s33.g);
        this.c = new ImageReceiver(qk2Var);
    }

    public final void a(f4b f4bVar) {
        String str;
        float f;
        ok2 ok2Var = this.d;
        if (ok2Var != null) {
            ok2Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            gl.B2(textureView);
            this.e = null;
        }
        this.f = false;
        this.n = f4bVar;
        StringBuilder sb = new StringBuilder();
        Point point = gl.q;
        sb.append((int) Math.ceil(point.x / gl.p));
        sb.append("_");
        sb.append((int) Math.ceil(point.y / gl.p));
        if (f4bVar != null && f4bVar.K) {
            str = "_g";
        } else {
            str = "";
        }
        String j = b00.j(sb, str, "_exif");
        f4b f4bVar2 = this.n;
        qk2 qk2Var = this.p;
        ImageReceiver imageReceiver = this.c;
        if (f4bVar2 == null) {
            imageReceiver.f();
        } else if (f4bVar2.K) {
            Bitmap bitmap = f4bVar2.M0;
            if (bitmap != null) {
                imageReceiver.f0(bitmap);
            } else {
                Bitmap bitmap2 = f4bVar2.b1;
                if (bitmap2 != null) {
                    imageReceiver.f0(bitmap2);
                } else {
                    String str2 = f4bVar2.N;
                    if (str2 != null) {
                        imageReceiver.e0(str2, j, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(qk2Var.getContext());
            this.e = textureView2;
            qk2Var.addView(textureView2);
            ok2 ok2Var2 = new ok2(this, (byte) 0);
            this.d = ok2Var2;
            ok2Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.n.L), false, 1.0f);
            ok2 ok2Var3 = this.d;
            if (!qk2Var.w0) {
                f4b f4bVar3 = this.n;
                if (!f4bVar3.Y && qk2Var.o0) {
                    f = f4bVar3.P;
                    ok2Var3.setVolume(f);
                    if (!qk2Var.o0 && !qk2Var.r0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f = 0.0f;
            ok2Var3.setVolume(f);
            if (!qk2Var.o0) {
            }
            this.d.play();
        } else {
            imageReceiver.e0(f4bVar2.L.getAbsolutePath(), j, null, null, 0L);
        }
        qk2Var.invalidate();
    }

    public final void b(ek2 ek2Var, boolean z) {
        ek2 ek2Var2 = this.h;
        if (ek2Var != null) {
            this.h = ek2Var;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o = null;
        }
        RectF rectF = this.k;
        qk2 qk2Var = this.p;
        if (z) {
            boolean z2 = this.i;
            RectF rectF2 = this.j;
            if (!z2) {
                qk2Var.k(rectF2, ek2Var);
            } else {
                gl.X1(rectF2, rectF, this.l, rectF2);
            }
            if (ek2Var == null) {
                qk2Var.k(rectF, ek2Var2);
            } else {
                qk2Var.j(rectF, ek2Var);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new ae0(this, (byte) 3));
            this.o.addListener(new bb1(this, (byte) 29));
            this.o.setInterpolator(s33.h);
            this.o.setDuration(360L);
            this.o.start();
        } else {
            qk2Var.j(rectF, ek2Var);
            this.l = 1.0f;
        }
        qk2Var.invalidate();
        this.i = true;
    }
}
