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
import fi.a4;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.le;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.ug0;
public final class g {
    public int f9887a;
    public boolean f9888b;
    public boolean f9889c;
    public final Object d;
    public final Object f9890e;
    public final Object f9891f;
    public final Object f9892g;
    public Object h;

    public g(View view) {
        this.h = new Paint(1);
        this.d = new u5(view, 350L, er.h);
        this.f9891f = new ug0(view);
        this.f9892g = new dc(view);
        g6 g6Var = new g6(false, false, false);
        this.f9890e = g6Var;
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.r(true, true);
        g6Var.setCallback(view);
        g6Var.N = (int) (org.telegram.messenger.g0.f23611q.x * 0.3f);
        this.f9888b = false;
        g6Var.t(hd.M0(2131746439, null), false, true);
        String M0 = hd.M0(2131746438, null);
        TextPaint textPaint = g6Var.f34831a;
        this.f9887a = (int) Math.ceil(Math.max(textPaint.measureText(M0), textPaint.measureText(hd.M0(2131746439, null))));
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
        return new h((IconCompat) this.d, (CharSequence) this.f9890e, (PendingIntent) this.f9891f, (Bundle) this.f9892g, l0VarArr2, l0VarArr, this.f9888b, this.f9887a, this.f9889c);
    }

    public boolean c() {
        yi.j jVar = (yi.j) this.f9890e;
        jVar.getClass();
        yi.j.q();
        ac.e eVar = null;
        byte[] bArr = null;
        eVar = null;
        eVar = null;
        eVar = null;
        eVar = null;
        if (jVar.G == 5 && jVar.f60774z != null && jVar.f60767r == 0 && jVar.f60768s == jVar.j()) {
            jVar.p();
            yi.i iVar = jVar.f60774z;
            long j3 = jVar.j();
            long length = iVar.f60749b.length();
            jVar.a(iVar, length);
            synchronized (jVar.f60761l) {
                if (iVar.d && !iVar.f60751e) {
                    iVar.f60751e = true;
                    jVar.f60760k.execute(new yi.c(jVar, iVar, length, j3, 0));
                    File file = iVar.f60749b;
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
        ((yi.j) this.f9890e).o();
        this.f9889c = true;
        return true;
    }

    public void d(Canvas canvas, RectF rectF, float f10, float f11, int i7, boolean z10, boolean z11) {
        int i10;
        Paint paint = (Paint) this.h;
        ug0 ug0Var = (ug0) this.f9891f;
        g6 g6Var = (g6) this.f9890e;
        if (z10 != this.f9888b) {
            this.f9888b = z10;
            if (z10) {
                i10 = 2131746438;
            } else {
                i10 = 2131746439;
            }
            g6Var.t(hd.M0(i10, null), true, true);
        }
        float c10 = g6Var.c();
        float L = org.telegram.messenger.g0.L(17.66f);
        rectF.set(f10 - ((int) (c10 + org.telegram.messenger.g0.L(23.66f))), f11 - L, f10, f11);
        float a10 = ((dc) this.f9892g).a(0.02f) * ((u5) this.d).d(z11);
        if (a10 > 0.0f) {
            paint.setColor(i0.a.o(i7, 30));
            canvas.save();
            canvas.scale(a10, a10, f10, f11);
            float f12 = L / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            g6Var.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(6.0f)), (int) rectF.top, (int) (rectF.right - org.telegram.messenger.g0.L(17.66f)), (int) rectF.bottom);
            g6Var.u(i7);
            g6Var.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(14.0f);
            float f13 = L2 / 2.0f;
            ug0Var.setBounds((int) ((rectF.right - org.telegram.messenger.g0.L(3.33f)) - L2), (int) ((rectF.centerY() - f13) + org.telegram.messenger.g0.L(0.33f)), (int) (rectF.right - org.telegram.messenger.g0.L(3.33f)), (int) (rectF.centerY() + f13 + org.telegram.messenger.g0.L(0.33f)));
            Paint paint2 = ug0Var.f40025b;
            paint2.setColor(i7);
            paint2.setAlpha(ug0Var.d);
            boolean z12 = !z10;
            if (ug0Var.f40027e != z12) {
                ug0Var.f40027e = z12;
                ug0Var.f40024a.invalidate();
            }
            ug0Var.draw(canvas);
            canvas.restore();
        }
    }

    public boolean e() {
        yi.j jVar = (yi.j) this.f9890e;
        jVar.getClass();
        yi.j.q();
        if (jVar.e().f2966a == 5) {
            return true;
        }
        return false;
    }

    public void f() {
        this.f9888b = true;
    }

    public void g(boolean z10) {
        this.f9889c = z10;
        ((dc) this.f9892g).c(z10);
    }

    public boolean h() {
        yi.j jVar = (yi.j) this.f9890e;
        jVar.getClass();
        yi.j.q();
        if (jVar.G != 1) {
            return false;
        }
        File file = jVar.f60753b;
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

    public g(Context context, File file, le leVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f9891f = new Object();
        this.f9892g = new HashMap();
        this.h = new HashSet();
        this.f9887a = 1;
        a4 a4Var = new a4(context, 3);
        a4Var.f11407c = file;
        yi.h hVar = (yi.h) aj.e.f1659c.a();
        if (hVar != null) {
            a4Var.d = hVar;
            a4Var.f11405a = false;
            a4Var.f11408e = new ji.j(this, leVar, false, 9);
            a4Var.f11409f = new k8.a(8, this, leVar);
            a4Var.f11410g = new nb.a(17);
            this.f9890e = new yi.j(a4Var);
            return;
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public g(int i7, PendingIntent pendingIntent, String str) {
        IconCompat e10 = i7 == 0 ? null : IconCompat.e(null, "", i7);
        Bundle bundle = new Bundle();
        this.f9888b = true;
        this.f9889c = true;
        this.d = e10;
        this.f9890e = q.d(str);
        this.f9891f = pendingIntent;
        this.f9892g = bundle;
        this.h = null;
        this.f9888b = true;
        this.f9887a = 0;
        this.f9889c = true;
    }
}
