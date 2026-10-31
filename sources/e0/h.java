package e0;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import k2.t0;
import org.telegram.messenger.cd;
import org.telegram.messenger.me;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.th0;
public final class h {
    public int f6019a;
    public boolean f6020b;
    public boolean f6021c;
    public final Object d;
    public final Object e;
    public final Object f6022f;
    public final Object f6023g;
    public Object h;

    public h(View view) {
        this.h = new Paint(1);
        this.d = new t5(view, 350L, gr.h);
        this.f6022f = new th0(view);
        this.f6023g = new dc(view);
        e6 e6Var = new e6(false, false, false);
        this.e = e6Var;
        e6Var.w(org.telegram.messenger.i0.L(11.0f));
        e6Var.r(true, true);
        e6Var.setCallback(view);
        e6Var.M = (int) (org.telegram.messenger.i0.f16026q.x * 0.3f);
        this.f6020b = false;
        e6Var.t(cd.L0(2131746454, null), false, true);
        String L0 = cd.L0(2131746453, null);
        TextPaint textPaint = e6Var.f25693a;
        this.f6019a = (int) Math.ceil(Math.max(textPaint.measureText(L0), textPaint.measureText(cd.L0(2131746454, null))));
    }

    public void a(n0 n0Var) {
        if (((ArrayList) this.h) == null) {
            this.h = new ArrayList();
        }
        ((ArrayList) this.h).add(n0Var);
    }

    public i b() {
        n0[] n0VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.h;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                n0 n0Var = (n0) obj;
                n0Var.getClass();
                arrayList2.add(n0Var);
            }
        }
        n0[] n0VarArr2 = null;
        if (arrayList.isEmpty()) {
            n0VarArr = null;
        } else {
            n0VarArr = (n0[]) arrayList.toArray(new n0[arrayList.size()]);
        }
        if (!arrayList2.isEmpty()) {
            n0VarArr2 = (n0[]) arrayList2.toArray(new n0[arrayList2.size()]);
        }
        return new i((IconCompat) this.d, (CharSequence) this.e, (PendingIntent) this.f6022f, (Bundle) this.f6023g, n0VarArr2, n0VarArr, this.f6020b, this.f6019a, this.f6021c);
    }

    public boolean c() {
        ki.k kVar = (ki.k) this.e;
        kVar.getClass();
        ki.k.q();
        ki.g gVar = null;
        byte[] bArr = null;
        gVar = null;
        gVar = null;
        gVar = null;
        gVar = null;
        if (kVar.G == 5 && kVar.f11433z != null && kVar.f11426r == 0 && kVar.f11427s == kVar.j()) {
            kVar.p();
            ki.j jVar = kVar.f11433z;
            long j10 = kVar.j();
            long length = jVar.f11410b.length();
            kVar.a(jVar, length);
            synchronized (kVar.f11420l) {
                if (jVar.d && !jVar.e) {
                    jVar.e = true;
                    kVar.f11419k.execute(new ki.c(kVar, jVar, length, j10, 0));
                    File file = jVar.f11410b;
                    byte[] bArr2 = kVar.B;
                    if (bArr2 != null) {
                        bArr = (byte[]) bArr2.clone();
                    }
                    kVar.C = new ki.g(file, j10, bArr);
                    kVar.s(8);
                    kVar.c();
                    kVar.t();
                    kVar.l("detached_preview");
                    gVar = kVar.C;
                }
            }
        }
        if (gVar == null) {
            return false;
        }
        ((ki.k) this.e).o();
        this.f6021c = true;
        return true;
    }

    public void d(Canvas canvas, RectF rectF, float f7, float f10, int i10, boolean z10, boolean z11) {
        int i11;
        Paint paint = (Paint) this.h;
        th0 th0Var = (th0) this.f6022f;
        e6 e6Var = (e6) this.e;
        if (z10 != this.f6020b) {
            this.f6020b = z10;
            if (z10) {
                i11 = 2131746453;
            } else {
                i11 = 2131746454;
            }
            e6Var.t(cd.L0(i11, null), true, true);
        }
        float c10 = e6Var.c();
        float L = org.telegram.messenger.i0.L(17.66f);
        rectF.set(f7 - ((int) (c10 + org.telegram.messenger.i0.L(23.66f))), f10 - L, f7, f10);
        float a2 = ((dc) this.f6023g).a(0.02f) * ((t5) this.d).d(z11);
        if (a2 > 0.0f) {
            paint.setColor(i0.b.o(i10, 30));
            canvas.save();
            canvas.scale(a2, a2, f7, f10);
            float f11 = L / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
            e6Var.setBounds((int) (rectF.left + org.telegram.messenger.i0.L(6.0f)), (int) rectF.top, (int) (rectF.right - org.telegram.messenger.i0.L(17.66f)), (int) rectF.bottom);
            e6Var.u(i10);
            e6Var.draw(canvas);
            float L2 = org.telegram.messenger.i0.L(14.0f);
            float f12 = L2 / 2.0f;
            th0Var.setBounds((int) ((rectF.right - org.telegram.messenger.i0.L(3.33f)) - L2), (int) ((rectF.centerY() - f12) + org.telegram.messenger.i0.L(0.33f)), (int) (rectF.right - org.telegram.messenger.i0.L(3.33f)), (int) (rectF.centerY() + f12 + org.telegram.messenger.i0.L(0.33f)));
            Paint paint2 = th0Var.f30579b;
            paint2.setColor(i10);
            paint2.setAlpha(th0Var.d);
            boolean z12 = !z10;
            if (th0Var.e != z12) {
                th0Var.e = z12;
                th0Var.f30578a.invalidate();
            }
            th0Var.draw(canvas);
            canvas.restore();
        }
    }

    public boolean e() {
        ki.k kVar = (ki.k) this.e;
        kVar.getClass();
        ki.k.q();
        if (kVar.e().f425a == 5) {
            return true;
        }
        return false;
    }

    public void f() {
        this.f6020b = true;
    }

    public void g(boolean z10) {
        this.f6021c = z10;
        ((dc) this.f6023g).c(z10);
    }

    public boolean h() {
        ki.k kVar = (ki.k) this.e;
        kVar.getClass();
        ki.k.q();
        if (kVar.G != 1) {
            return false;
        }
        File file = kVar.f11413b;
        if ((file.isDirectory() || file.mkdirs()) && file.canWrite()) {
            kVar.h.b("start requested");
            kVar.d();
            kVar.s(2);
            kVar.u(0L, -1L, null);
            return true;
        }
        kVar.g(new IllegalStateException("Output directory is not writable: " + file));
        return false;
    }

    public h(Context context, File file, me meVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f6022f = new Object();
        this.f6023g = new HashMap();
        this.h = new HashSet();
        this.f6019a = 1;
        t0 t0Var = new t0(context, 1);
        t0Var.f10768c = file;
        ki.i iVar = (ki.i) mi.e.f13386c.a();
        if (iVar != null) {
            t0Var.d = iVar;
            t0Var.f10767b = false;
            t0Var.e = new m5.e(this, meVar, false, 6);
            t0Var.f10769f = new m4.c(8, this, meVar);
            t0Var.f10770g = new oa.d(13);
            this.e = new ki.k(t0Var);
            return;
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public h(int i10, String str, PendingIntent pendingIntent) {
        IconCompat e = i10 == 0 ? null : IconCompat.e(null, "", i10);
        Bundle bundle = new Bundle();
        this.f6020b = true;
        this.f6021c = true;
        this.d = e;
        this.e = r.d(str);
        this.f6022f = pendingIntent;
        this.f6023g = bundle;
        this.h = null;
        this.f6020b = true;
        this.f6019a = 0;
        this.f6021c = true;
    }
}
