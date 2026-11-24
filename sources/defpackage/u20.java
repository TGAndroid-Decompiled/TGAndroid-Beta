package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public final class u20 {
    public boolean a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public u20(View view) {
        this.h = new Paint(1);
        this.d = new lm(350L, view, s33.h);
        this.f = new by8(view);
        this.g = new n41(view);
        gn gnVar = new gn(false, false, false);
        this.e = gnVar;
        gnVar.w(gl.L(11.0f));
        gnVar.r(true, true);
        gnVar.setCallback(view);
        gnVar.N = (int) (gl.q.x * 0.3f);
        this.a = false;
        gnVar.t(k96.M0(2131746246, null), false, true);
        String M0 = k96.M0(2131746245, null);
        TextPaint textPaint = gnVar.a;
        this.b = (int) Math.ceil(Math.max(textPaint.measureText(M0), textPaint.measureText(k96.M0(2131746246, null))));
    }

    public final void a(l94 l94Var) {
        ArrayList arrayList = (ArrayList) this.d;
        int i = 0;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (arrayList.get(i2) == l94Var) {
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        while (true) {
            if (i < arrayList.size()) {
                if (l94Var.W0 > ((l94) arrayList.get(i)).W0) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            arrayList.add(i, l94Var);
        } else {
            arrayList.add(l94Var);
        }
    }

    public final void b(boolean z) {
        co3 co3Var = (co3) this.f;
        ca4 ca4Var = (ca4) this.h;
        if (z) {
            co3Var.a(ca4Var);
            ca4Var.run();
        } else if (this.c) {
        } else {
            this.c = true;
            co3Var.a(ca4Var);
            co3Var.d(ca4Var, 20L);
        }
    }

    public final boolean c() {
        h30 h30Var = (h30) this.e;
        h30Var.getClass();
        h30.q();
        m20 m20Var = null;
        byte[] bArr = null;
        m20Var = null;
        m20Var = null;
        m20Var = null;
        m20Var = null;
        if (h30Var.G == 5 && h30Var.z != null && h30Var.r == 0 && h30Var.s == h30Var.j()) {
            h30Var.p();
            f30 f30Var = h30Var.z;
            long j = h30Var.j();
            long length = f30Var.b.length();
            h30Var.a(f30Var, length);
            synchronized (h30Var.l) {
                if (f30Var.d && !f30Var.e) {
                    f30Var.e = true;
                    h30Var.k.execute(new v20(h30Var, f30Var, length, j, (byte) 0));
                    File file = f30Var.b;
                    byte[] bArr2 = h30Var.B;
                    if (bArr2 != null) {
                        bArr = (byte[]) bArr2.clone();
                    }
                    h30Var.C = new m20(file, j, bArr);
                    h30Var.s(8);
                    h30Var.c();
                    h30Var.t();
                    h30Var.l("detached_preview");
                    m20Var = h30Var.C;
                }
            }
        }
        if (m20Var == null) {
            return false;
        }
        ((h30) this.e).o();
        this.c = true;
        return true;
    }

    public final void d(Canvas canvas, RectF rectF, float f, float f2, int i, boolean z, boolean z2) {
        int i2;
        Paint paint = (Paint) this.h;
        by8 by8Var = (by8) this.f;
        gn gnVar = (gn) this.e;
        if (z != this.a) {
            this.a = z;
            if (z) {
                i2 = 2131746245;
            } else {
                i2 = 2131746246;
            }
            gnVar.t(k96.M0(i2, null), true, true);
        }
        float c = gnVar.c();
        float L = gl.L(17.66f);
        rectF.set(f - ((int) (c + gl.L(23.66f))), f2 - L, f, f2);
        float a = ((n41) this.g).a(0.02f) * ((lm) this.d).d(z2);
        if (a > 0.0f) {
            paint.setColor(bm2.o(i, 30));
            canvas.save();
            canvas.scale(a, a, f, f2);
            float f3 = L / 2.0f;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            gnVar.setBounds((int) (rectF.left + gl.L(6.0f)), (int) rectF.top, (int) (rectF.right - gl.L(17.66f)), (int) rectF.bottom);
            gnVar.u(i);
            gnVar.draw(canvas);
            float L2 = gl.L(14.0f);
            float f4 = L2 / 2.0f;
            by8Var.setBounds((int) ((rectF.right - gl.L(3.33f)) - L2), (int) ((rectF.centerY() - f4) + gl.L(0.33f)), (int) (rectF.right - gl.L(3.33f)), (int) (rectF.centerY() + f4 + gl.L(0.33f)));
            Paint paint2 = by8Var.b;
            paint2.setColor(i);
            paint2.setAlpha(by8Var.d);
            boolean z3 = !z;
            if (by8Var.e != z3) {
                by8Var.e = z3;
                by8Var.a.invalidate();
            }
            by8Var.draw(canvas);
            canvas.restore();
        }
    }

    public final boolean e() {
        h30 h30Var = (h30) this.e;
        h30Var.getClass();
        h30.q();
        if (h30Var.e().a == 5) {
            return true;
        }
        return false;
    }

    public final void f(boolean z) {
        this.c = z;
        ((n41) this.g).c(z);
    }

    public final boolean g() {
        h30 h30Var = (h30) this.e;
        h30Var.getClass();
        h30.q();
        if (h30Var.G != 1) {
            return false;
        }
        File file = h30Var.b;
        if ((file.isDirectory() || file.mkdirs()) && file.canWrite()) {
            h30Var.h.b("start requested");
            h30Var.d();
            h30Var.s(2);
            h30Var.u(0L, -1L, null);
            return true;
        }
        h30Var.g(new IllegalStateException("Output directory is not writable: " + file));
        return false;
    }

    public u20(int i, int i2, co3 co3Var) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.c = false;
        this.g = new ca4(this, (byte) 0);
        this.h = new ca4(this, (byte) 1);
        this.b = i;
        this.a = i2;
        this.f = co3Var;
    }

    public u20(Context context, File file, ml6 ml6Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.f = new Object();
        this.g = new HashMap();
        this.h = new HashSet();
        this.b = 1;
        c30 c30Var = new c30(context, (byte) 0);
        c30Var.c = file;
        e30 e30Var = (e30) wcd.c.a();
        if (e30Var != null) {
            c30Var.d = e30Var;
            c30Var.a = false;
            c30Var.e = new lv6(this, ml6Var, (byte) 5);
            c30Var.f = new tg2(this, ml6Var, false, (byte) 6);
            c30Var.g = new cff((byte) 13);
            this.e = new h30(c30Var);
            return;
        }
        w26.j("Noise suppression mode is required");
        throw null;
    }
}
