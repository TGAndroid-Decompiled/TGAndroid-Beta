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
import fi.y3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.ke;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.mc;
public final class g {
    public int f10205a;
    public boolean f10206b;
    public boolean f10207c;
    public final Object d;
    public final Object f10208e;
    public final Object f10209f;
    public final Object f10210g;
    public Object h;

    public g(View view) {
        this.h = new Paint(1);
        this.d = new c6(view, 350L, lr.h);
        this.f10209f = new eh0(view);
        this.f10210g = new mc(view);
        m6 m6Var = new m6(false, false, false);
        this.f10208e = m6Var;
        m6Var.w(org.telegram.messenger.g0.L(11.0f));
        m6Var.r(true, true);
        m6Var.setCallback(view);
        m6Var.N = (int) (org.telegram.messenger.g0.f24121q.x * 0.3f);
        this.f10206b = false;
        m6Var.t(gd.M0(2131746244, null), false, true);
        String M0 = gd.M0(2131746243, null);
        TextPaint textPaint = m6Var.f37375a;
        this.f10205a = (int) Math.ceil(Math.max(textPaint.measureText(M0), textPaint.measureText(gd.M0(2131746244, null))));
    }

    public void a(l0 l0Var) {
        if (((ArrayList) this.h) == null) {
            this.h = new ArrayList();
        }
        ((ArrayList) this.h).add(l0Var);
    }

    public h b() {
        l0[] l0VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.h;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList3.get(i7);
                i7++;
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                arrayList2.add(l0Var);
            }
        }
        l0[] l0VarArr2 = null;
        if (arrayList.isEmpty()) {
            l0VarArr = null;
        } else {
            l0VarArr = (l0[]) arrayList.toArray(new l0[arrayList.size()]);
        }
        if (!arrayList2.isEmpty()) {
            l0VarArr2 = (l0[]) arrayList2.toArray(new l0[arrayList2.size()]);
        }
        return new h((IconCompat) this.d, (CharSequence) this.f10208e, (PendingIntent) this.f10209f, (Bundle) this.f10210g, l0VarArr2, l0VarArr, this.f10206b, this.f10205a, this.f10207c);
    }

    public boolean c() {
        yi.j jVar = (yi.j) this.f10208e;
        jVar.getClass();
        yi.j.q();
        ac.e eVar = null;
        byte[] bArr = null;
        eVar = null;
        eVar = null;
        eVar = null;
        eVar = null;
        if (jVar.G == 5 && jVar.f61338z != null && jVar.f61331r == 0 && jVar.f61332s == jVar.j()) {
            jVar.p();
            yi.h hVar = jVar.f61338z;
            long j3 = jVar.j();
            long length = hVar.f61313b.length();
            jVar.a(hVar, length);
            synchronized (jVar.f61325l) {
                if (hVar.d && !hVar.f61315e) {
                    hVar.f61315e = true;
                    jVar.f61324k.execute(new yi.c(jVar, hVar, length, j3, 0));
                    File file = hVar.f61313b;
                    byte[] bArr2 = jVar.B;
                    if (bArr2 != null) {
                        bArr = (byte[]) bArr2.clone();
                    }
                    jVar.C = new ac.e(file, j3, bArr);
                    jVar.s(8);
                    jVar.c();
                    jVar.t();
                    jVar.l("detached_preview");
                    eVar = jVar.C;
                }
            }
        }
        if (eVar == null) {
            return false;
        }
        ((yi.j) this.f10208e).o();
        this.f10207c = true;
        return true;
    }

    public void d(Canvas canvas, RectF rectF, float f10, float f11, int i7, boolean z10, boolean z11) {
        int i10;
        Paint paint = (Paint) this.h;
        eh0 eh0Var = (eh0) this.f10209f;
        m6 m6Var = (m6) this.f10208e;
        if (z10 != this.f10206b) {
            this.f10206b = z10;
            if (z10) {
                i10 = 2131746243;
            } else {
                i10 = 2131746244;
            }
            m6Var.t(gd.M0(i10, null), true, true);
        }
        float c10 = m6Var.c();
        float L = org.telegram.messenger.g0.L(17.66f);
        rectF.set(f10 - ((int) (c10 + org.telegram.messenger.g0.L(23.66f))), f11 - L, f10, f11);
        float a10 = ((mc) this.f10210g).a(0.02f) * ((c6) this.d).d(z11);
        if (a10 > 0.0f) {
            paint.setColor(i0.a.o(i7, 30));
            canvas.save();
            canvas.scale(a10, a10, f10, f11);
            float f12 = L / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            m6Var.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(6.0f)), (int) rectF.top, (int) (rectF.right - org.telegram.messenger.g0.L(17.66f)), (int) rectF.bottom);
            m6Var.u(i7);
            m6Var.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(14.0f);
            float f13 = L2 / 2.0f;
            eh0Var.setBounds((int) ((rectF.right - org.telegram.messenger.g0.L(3.33f)) - L2), (int) ((rectF.centerY() - f13) + org.telegram.messenger.g0.L(0.33f)), (int) (rectF.right - org.telegram.messenger.g0.L(3.33f)), (int) (rectF.centerY() + f13 + org.telegram.messenger.g0.L(0.33f)));
            Paint paint2 = eh0Var.f34705b;
            paint2.setColor(i7);
            paint2.setAlpha(eh0Var.d);
            boolean z12 = !z10;
            if (eh0Var.f34707e != z12) {
                eh0Var.f34707e = z12;
                eh0Var.f34704a.invalidate();
            }
            eh0Var.draw(canvas);
            canvas.restore();
        }
    }

    public boolean e() {
        yi.j jVar = (yi.j) this.f10208e;
        jVar.getClass();
        yi.j.q();
        if (jVar.e().f2960a == 5) {
            return true;
        }
        return false;
    }

    public void f() {
        this.f10206b = true;
    }

    public void g(boolean z10) {
        this.f10207c = z10;
        ((mc) this.f10210g).c(z10);
    }

    public boolean h() {
        yi.j jVar = (yi.j) this.f10208e;
        jVar.getClass();
        yi.j.q();
        if (jVar.G != 1) {
            return false;
        }
        File file = jVar.f61317b;
        if ((file.isDirectory() || file.mkdirs()) && file.canWrite()) {
            jVar.h.b("start requested");
            jVar.d();
            jVar.s(2);
            jVar.u(0L, -1L, null);
            return true;
        }
        jVar.g(new IllegalStateException("Output directory is not writable: " + file));
        return false;
    }

    public g(Context context, File file, ke keVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f10209f = new Object();
        this.f10210g = new HashMap();
        this.h = new HashSet();
        this.f10205a = 1;
        y3 y3Var = new y3(context, 3);
        y3Var.f12775c = file;
        yi.g gVar = (yi.g) aj.e.f1650c.a();
        if (gVar != null) {
            y3Var.d = gVar;
            y3Var.f12773a = false;
            y3Var.f12776e = new ji.j(this, keVar, false, 9);
            y3Var.f12777f = new k8.a(8, this, keVar);
            y3Var.f12778g = new nb.a(17);
            this.f10208e = new yi.j(y3Var);
            return;
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public g(int i7, PendingIntent pendingIntent, String str) {
        IconCompat e10 = i7 == 0 ? null : IconCompat.e(null, "", i7);
        Bundle bundle = new Bundle();
        this.f10206b = true;
        this.f10207c = true;
        this.d = e10;
        this.f10208e = q.d(str);
        this.f10209f = pendingIntent;
        this.f10210g = bundle;
        this.h = null;
        this.f10206b = true;
        this.f10205a = 0;
        this.f10207c = true;
    }
}
