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
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
public final class g {
    public int f10231a;
    public boolean f10232b;
    public boolean f10233c;
    public final Object d;
    public final Object f10234e;
    public final Object f10235f;
    public final Object f10236g;
    public Object h;

    public g(View view) {
        this.h = new Paint(1);
        this.d = new d6(view, 350L, nr.h);
        this.f10235f = new gh0(view);
        this.f10236g = new mc(view);
        n6 n6Var = new n6(false, false, false);
        this.f10234e = n6Var;
        n6Var.w(org.telegram.messenger.g0.L(11.0f));
        n6Var.r(true, true);
        n6Var.setCallback(view);
        n6Var.N = (int) (org.telegram.messenger.g0.f24146q.x * 0.3f);
        this.f10232b = false;
        n6Var.t(gd.N0(2131746243, null), false, true);
        String N0 = gd.N0(2131746242, null);
        TextPaint textPaint = n6Var.f37789a;
        this.f10231a = (int) Math.ceil(Math.max(textPaint.measureText(N0), textPaint.measureText(gd.N0(2131746243, null))));
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
        return new h((IconCompat) this.d, (CharSequence) this.f10234e, (PendingIntent) this.f10235f, (Bundle) this.f10236g, l0VarArr2, l0VarArr, this.f10232b, this.f10231a, this.f10233c);
    }

    public boolean c() {
        yi.j jVar = (yi.j) this.f10234e;
        jVar.getClass();
        yi.j.q();
        ac.e eVar = null;
        byte[] bArr = null;
        eVar = null;
        eVar = null;
        eVar = null;
        eVar = null;
        if (jVar.G == 5 && jVar.f61380z != null && jVar.f61373r == 0 && jVar.f61374s == jVar.j()) {
            jVar.p();
            yi.h hVar = jVar.f61380z;
            long j3 = jVar.j();
            long length = hVar.f61355b.length();
            jVar.a(hVar, length);
            synchronized (jVar.f61367l) {
                if (hVar.d && !hVar.f61357e) {
                    hVar.f61357e = true;
                    jVar.f61366k.execute(new yi.c(jVar, hVar, length, j3, 0));
                    File file = hVar.f61355b;
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
        ((yi.j) this.f10234e).o();
        this.f10233c = true;
        return true;
    }

    public void d(Canvas canvas, RectF rectF, float f10, float f11, int i7, boolean z10, boolean z11) {
        int i10;
        Paint paint = (Paint) this.h;
        gh0 gh0Var = (gh0) this.f10235f;
        n6 n6Var = (n6) this.f10234e;
        if (z10 != this.f10232b) {
            this.f10232b = z10;
            if (z10) {
                i10 = 2131746242;
            } else {
                i10 = 2131746243;
            }
            n6Var.t(gd.N0(i10, null), true, true);
        }
        float c10 = n6Var.c();
        float L = org.telegram.messenger.g0.L(17.66f);
        rectF.set(f10 - ((int) (c10 + org.telegram.messenger.g0.L(23.66f))), f11 - L, f10, f11);
        float a10 = ((mc) this.f10236g).a(0.02f) * ((d6) this.d).d(z11);
        if (a10 > 0.0f) {
            paint.setColor(i0.a.o(i7, 30));
            canvas.save();
            canvas.scale(a10, a10, f10, f11);
            float f12 = L / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            n6Var.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(6.0f)), (int) rectF.top, (int) (rectF.right - org.telegram.messenger.g0.L(17.66f)), (int) rectF.bottom);
            n6Var.u(i7);
            n6Var.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(14.0f);
            float f13 = L2 / 2.0f;
            gh0Var.setBounds((int) ((rectF.right - org.telegram.messenger.g0.L(3.33f)) - L2), (int) ((rectF.centerY() - f13) + org.telegram.messenger.g0.L(0.33f)), (int) (rectF.right - org.telegram.messenger.g0.L(3.33f)), (int) (rectF.centerY() + f13 + org.telegram.messenger.g0.L(0.33f)));
            Paint paint2 = gh0Var.f35556b;
            paint2.setColor(i7);
            paint2.setAlpha(gh0Var.d);
            boolean z12 = !z10;
            if (gh0Var.f35558e != z12) {
                gh0Var.f35558e = z12;
                gh0Var.f35555a.invalidate();
            }
            gh0Var.draw(canvas);
            canvas.restore();
        }
    }

    public boolean e() {
        yi.j jVar = (yi.j) this.f10234e;
        jVar.getClass();
        yi.j.q();
        if (jVar.e().f2973a == 5) {
            return true;
        }
        return false;
    }

    public void f() {
        this.f10232b = true;
    }

    public void g(boolean z10) {
        this.f10233c = z10;
        ((mc) this.f10236g).c(z10);
    }

    public boolean h() {
        yi.j jVar = (yi.j) this.f10234e;
        jVar.getClass();
        yi.j.q();
        if (jVar.G != 1) {
            return false;
        }
        File file = jVar.f61359b;
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
        this.f10235f = new Object();
        this.f10236g = new HashMap();
        this.h = new HashSet();
        this.f10231a = 1;
        y3 y3Var = new y3(context, 3);
        y3Var.f12812c = file;
        yi.g gVar = (yi.g) aj.e.f1663c.a();
        if (gVar != null) {
            y3Var.d = gVar;
            y3Var.f12810a = false;
            y3Var.f12813e = new ji.l(this, keVar, false, 9);
            y3Var.f12814f = new k8.a(8, this, keVar);
            y3Var.f12815g = new nb.a(17);
            this.f10234e = new yi.j(y3Var);
            return;
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public g(int i7, PendingIntent pendingIntent, String str) {
        IconCompat e10 = i7 == 0 ? null : IconCompat.e(null, "", i7);
        Bundle bundle = new Bundle();
        this.f10232b = true;
        this.f10233c = true;
        this.d = e10;
        this.f10234e = q.d(str);
        this.f10235f = pendingIntent;
        this.f10236g = bundle;
        this.h = null;
        this.f10232b = true;
        this.f10231a = 0;
        this.f10233c = true;
    }
}
