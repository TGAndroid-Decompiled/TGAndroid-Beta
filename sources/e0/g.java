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
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m6;
public final class g {
    public int f10195a;
    public boolean f10196b;
    public boolean f10197c;
    public final Object d;
    public final Object f10198e;
    public final Object f10199f;
    public final Object f10200g;
    public Object h;

    public g(View view) {
        this.h = new Paint(1);
        this.d = new c6(view, 350L, kr.h);
        this.f10199f = new fh0(view);
        this.f10200g = new lc(view);
        m6 m6Var = new m6(false, false, false);
        this.f10198e = m6Var;
        m6Var.w(org.telegram.messenger.g0.L(11.0f));
        m6Var.r(true, true);
        m6Var.setCallback(view);
        m6Var.N = (int) (org.telegram.messenger.g0.f24226q.x * 0.3f);
        this.f10196b = false;
        m6Var.t(gd.N0(2131746243, null), false, true);
        String N0 = gd.N0(2131746242, null);
        TextPaint textPaint = m6Var.f37392a;
        this.f10195a = (int) Math.ceil(Math.max(textPaint.measureText(N0), textPaint.measureText(gd.N0(2131746243, null))));
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
        return new h((IconCompat) this.d, (CharSequence) this.f10198e, (PendingIntent) this.f10199f, (Bundle) this.f10200g, l0VarArr2, l0VarArr, this.f10196b, this.f10195a, this.f10197c);
    }

    public boolean c() {
        yi.j jVar = (yi.j) this.f10198e;
        jVar.getClass();
        yi.j.q();
        ac.e eVar = null;
        byte[] bArr = null;
        eVar = null;
        eVar = null;
        eVar = null;
        eVar = null;
        if (jVar.G == 5 && jVar.f61468z != null && jVar.f61461r == 0 && jVar.f61462s == jVar.j()) {
            jVar.p();
            yi.h hVar = jVar.f61468z;
            long j3 = jVar.j();
            long length = hVar.f61443b.length();
            jVar.a(hVar, length);
            synchronized (jVar.f61455l) {
                if (hVar.d && !hVar.f61445e) {
                    hVar.f61445e = true;
                    jVar.f61454k.execute(new yi.c(jVar, hVar, length, j3, 0));
                    File file = hVar.f61443b;
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
        ((yi.j) this.f10198e).o();
        this.f10197c = true;
        return true;
    }

    public void d(Canvas canvas, RectF rectF, float f10, float f11, int i7, boolean z10, boolean z11) {
        int i10;
        Paint paint = (Paint) this.h;
        fh0 fh0Var = (fh0) this.f10199f;
        m6 m6Var = (m6) this.f10198e;
        if (z10 != this.f10196b) {
            this.f10196b = z10;
            if (z10) {
                i10 = 2131746242;
            } else {
                i10 = 2131746243;
            }
            m6Var.t(gd.N0(i10, null), true, true);
        }
        float c10 = m6Var.c();
        float L = org.telegram.messenger.g0.L(17.66f);
        rectF.set(f10 - ((int) (c10 + org.telegram.messenger.g0.L(23.66f))), f11 - L, f10, f11);
        float a10 = ((lc) this.f10200g).a(0.02f) * ((c6) this.d).d(z11);
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
            fh0Var.setBounds((int) ((rectF.right - org.telegram.messenger.g0.L(3.33f)) - L2), (int) ((rectF.centerY() - f13) + org.telegram.messenger.g0.L(0.33f)), (int) (rectF.right - org.telegram.messenger.g0.L(3.33f)), (int) (rectF.centerY() + f13 + org.telegram.messenger.g0.L(0.33f)));
            Paint paint2 = fh0Var.f35135b;
            paint2.setColor(i7);
            paint2.setAlpha(fh0Var.d);
            boolean z12 = !z10;
            if (fh0Var.f35137e != z12) {
                fh0Var.f35137e = z12;
                fh0Var.f35134a.invalidate();
            }
            fh0Var.draw(canvas);
            canvas.restore();
        }
    }

    public boolean e() {
        yi.j jVar = (yi.j) this.f10198e;
        jVar.getClass();
        yi.j.q();
        if (jVar.e().f2932a == 5) {
            return true;
        }
        return false;
    }

    public void f() {
        this.f10196b = true;
    }

    public void g(boolean z10) {
        this.f10197c = z10;
        ((lc) this.f10200g).c(z10);
    }

    public boolean h() {
        yi.j jVar = (yi.j) this.f10198e;
        jVar.getClass();
        yi.j.q();
        if (jVar.G != 1) {
            return false;
        }
        File file = jVar.f61447b;
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
        this.f10199f = new Object();
        this.f10200g = new HashMap();
        this.h = new HashSet();
        this.f10195a = 1;
        y3 y3Var = new y3(context, 3);
        y3Var.f12777c = file;
        yi.g gVar = (yi.g) aj.e.f1622c.a();
        if (gVar != null) {
            y3Var.d = gVar;
            y3Var.f12775a = false;
            y3Var.f12778e = new j6.k(10, this, keVar);
            y3Var.f12779f = new jb.m(this, keVar, false, 9);
            y3Var.f12780g = new nb.a(17);
            this.f10198e = new yi.j(y3Var);
            return;
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public g(int i7, PendingIntent pendingIntent, String str) {
        IconCompat e10 = i7 == 0 ? null : IconCompat.e(null, "", i7);
        Bundle bundle = new Bundle();
        this.f10196b = true;
        this.f10197c = true;
        this.d = e10;
        this.f10198e = q.d(str);
        this.f10199f = pendingIntent;
        this.f10200g = bundle;
        this.h = null;
        this.f10196b = true;
        this.f10195a = 0;
        this.f10197c = true;
    }
}
