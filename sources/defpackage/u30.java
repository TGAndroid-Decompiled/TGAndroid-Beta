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
public final class u30 {
    public boolean a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public u30(View view) {
        this.h = new Paint(1);
        this.d = new ln(350L, view, d53.h);
        this.f = new c09(view);
        this.g = new u51(view);
        ho hoVar = new ho(false, false, false);
        this.e = hoVar;
        hoVar.w(gm.L(11.0f));
        hoVar.r(true, true);
        hoVar.setCallback(view);
        hoVar.N = (int) (gm.q.x * 0.3f);
        this.a = false;
        hoVar.t(jb6.M0(2131746172, null), false, true);
        String M0 = jb6.M0(2131746171, null);
        TextPaint textPaint = hoVar.a;
        this.b = (int) Math.ceil(Math.max(textPaint.measureText(M0), textPaint.measureText(jb6.M0(2131746172, null))));
    }

    public final void a(lb4 lb4Var) {
        ArrayList arrayList = (ArrayList) this.d;
        int i = 0;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (arrayList.get(i2) == lb4Var) {
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        while (true) {
            if (i < arrayList.size()) {
                if (lb4Var.W0 > ((lb4) arrayList.get(i)).W0) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            arrayList.add(i, lb4Var);
        } else {
            arrayList.add(lb4Var);
        }
    }

    public final void b(boolean z) {
        mp3 mp3Var = (mp3) this.f;
        cc4 cc4Var = (cc4) this.h;
        if (z) {
            mp3Var.a(cc4Var);
            cc4Var.run();
        } else if (this.c) {
        } else {
            this.c = true;
            mp3Var.a(cc4Var);
            mp3Var.d(cc4Var, 20L);
        }
    }

    public final boolean c() {
        h40 h40Var = (h40) this.e;
        h40Var.getClass();
        h40.q();
        m30 m30Var = null;
        byte[] bArr = null;
        m30Var = null;
        m30Var = null;
        m30Var = null;
        m30Var = null;
        if (h40Var.G == 5 && h40Var.z != null && h40Var.r == 0 && h40Var.s == h40Var.j()) {
            h40Var.p();
            f40 f40Var = h40Var.z;
            long j = h40Var.j();
            long length = f40Var.b.length();
            h40Var.a(f40Var, length);
            synchronized (h40Var.l) {
                if (f40Var.d && !f40Var.e) {
                    f40Var.e = true;
                    h40Var.k.execute(new v30(h40Var, f40Var, length, j, (byte) 0));
                    File file = f40Var.b;
                    byte[] bArr2 = h40Var.B;
                    if (bArr2 != null) {
                        bArr = (byte[]) bArr2.clone();
                    }
                    h40Var.C = new m30(file, j, bArr);
                    h40Var.s(8);
                    h40Var.c();
                    h40Var.t();
                    h40Var.l("detached_preview");
                    m30Var = h40Var.C;
                }
            }
        }
        if (m30Var == null) {
            return false;
        }
        ((h40) this.e).o();
        this.c = true;
        return true;
    }

    public final void d(Canvas canvas, RectF rectF, float f, float f2, int i, boolean z, boolean z2) {
        int i2;
        Paint paint = (Paint) this.h;
        c09 c09Var = (c09) this.f;
        ho hoVar = (ho) this.e;
        if (z != this.a) {
            this.a = z;
            if (z) {
                i2 = 2131746171;
            } else {
                i2 = 2131746172;
            }
            hoVar.t(jb6.M0(i2, null), true, true);
        }
        float c = hoVar.c();
        float L = gm.L(17.66f);
        rectF.set(f - ((int) (c + gm.L(23.66f))), f2 - L, f, f2);
        float a = ((u51) this.g).a(0.02f) * ((ln) this.d).d(z2);
        if (a > 0.0f) {
            paint.setColor(on2.p(i, 30));
            canvas.save();
            canvas.scale(a, a, f, f2);
            float f3 = L / 2.0f;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            hoVar.setBounds((int) (rectF.left + gm.L(6.0f)), (int) rectF.top, (int) (rectF.right - gm.L(17.66f)), (int) rectF.bottom);
            hoVar.u(i);
            hoVar.draw(canvas);
            float L2 = gm.L(14.0f);
            float f4 = L2 / 2.0f;
            c09Var.setBounds((int) ((rectF.right - gm.L(3.33f)) - L2), (int) ((rectF.centerY() - f4) + gm.L(0.33f)), (int) (rectF.right - gm.L(3.33f)), (int) (rectF.centerY() + f4 + gm.L(0.33f)));
            Paint paint2 = c09Var.b;
            paint2.setColor(i);
            paint2.setAlpha(c09Var.d);
            boolean z3 = !z;
            if (c09Var.e != z3) {
                c09Var.e = z3;
                c09Var.a.invalidate();
            }
            c09Var.draw(canvas);
            canvas.restore();
        }
    }

    public final boolean e() {
        h40 h40Var = (h40) this.e;
        h40Var.getClass();
        h40.q();
        if (h40Var.e().a == 5) {
            return true;
        }
        return false;
    }

    public final void f(boolean z) {
        this.c = z;
        ((u51) this.g).c(z);
    }

    public final boolean g() {
        h40 h40Var = (h40) this.e;
        h40Var.getClass();
        h40.q();
        if (h40Var.G != 1) {
            return false;
        }
        File file = h40Var.b;
        if ((file.isDirectory() || file.mkdirs()) && file.canWrite()) {
            h40Var.h.b("start requested");
            h40Var.d();
            h40Var.s(2);
            h40Var.u(0L, -1L, null);
            return true;
        }
        h40Var.g(new IllegalStateException("Output directory is not writable: " + file));
        return false;
    }

    public u30(int i, int i2, mp3 mp3Var) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.c = false;
        this.g = new cc4(this, (byte) 0);
        this.h = new cc4(this, (byte) 1);
        this.b = i;
        this.a = i2;
        this.f = mp3Var;
    }

    public u30(Context context, File file, on6 on6Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.f = new Object();
        this.g = new HashMap();
        this.h = new HashSet();
        this.b = 1;
        c40 c40Var = new c40(context, (byte) 0);
        c40Var.c = file;
        e40 e40Var = (e40) yed.c.a();
        if (e40Var != null) {
            c40Var.d = e40Var;
            c40Var.a = false;
            c40Var.e = new hi2(this, on6Var, false, (byte) 7);
            c40Var.f = new lx6(this, on6Var, false, (byte) 5);
            c40Var.g = new dhf((byte) 13);
            this.e = new h40(c40Var);
            return;
        }
        u36.j("Noise suppression mode is required");
        throw null;
    }
}
