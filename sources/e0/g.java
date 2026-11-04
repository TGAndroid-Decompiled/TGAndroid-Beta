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
import ei.i4;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.ge;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.xq;
public final class g {
    public int f9233a;
    public boolean f9234b;
    public boolean f9235c;
    public final Object d;
    public final Object f9236e;
    public final Object f9237f;
    public final Object f9238g;
    public Object h;

    public g(View view) {
        this.h = new Paint(1);
        this.d = new u5(view, 350L, xq.h);
        this.f9237f = new ug0(view);
        this.f9238g = new gc(view);
        g6 g6Var = new g6(false, false, false);
        this.f9236e = g6Var;
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.r(true, true);
        g6Var.setCallback(view);
        g6Var.M = (int) (org.telegram.messenger.g0.f22608q.x * 0.3f);
        this.f9234b = false;
        g6Var.t(bd.M0(2131746447, null), false, true);
        String M0 = bd.M0(2131746446, null);
        TextPaint textPaint = g6Var.f33981a;
        this.f9233a = (int) Math.ceil(Math.max(textPaint.measureText(M0), textPaint.measureText(bd.M0(2131746447, null))));
    }

    public void a(m0 m0Var) {
        if (((ArrayList) this.h) == null) {
            this.h = new ArrayList();
        }
        ((ArrayList) this.h).add(m0Var);
    }

    public h b() {
        m0[] m0VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.h;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList3.get(i3);
                i3++;
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                arrayList2.add(m0Var);
            }
        }
        m0[] m0VarArr2 = null;
        if (arrayList.isEmpty()) {
            m0VarArr = null;
        } else {
            m0VarArr = (m0[]) arrayList.toArray(new m0[arrayList.size()]);
        }
        if (!arrayList2.isEmpty()) {
            m0VarArr2 = (m0[]) arrayList2.toArray(new m0[arrayList2.size()]);
        }
        return new h((IconCompat) this.d, (CharSequence) this.f9236e, (PendingIntent) this.f9237f, (Bundle) this.f9238g, m0VarArr2, m0VarArr, this.f9234b, this.f9233a, this.f9235c);
    }

    public boolean c() {
        vi.j jVar = (vi.j) this.f9236e;
        jVar.getClass();
        vi.j.q();
        vi.f fVar = null;
        byte[] bArr = null;
        fVar = null;
        fVar = null;
        fVar = null;
        fVar = null;
        if (jVar.G == 5 && jVar.f57003z != null && jVar.f56996r == 0 && jVar.f56997s == jVar.j()) {
            jVar.p();
            vi.i iVar = jVar.f57003z;
            long j10 = jVar.j();
            long length = iVar.f56978b.length();
            jVar.a(iVar, length);
            synchronized (jVar.f56990l) {
                if (iVar.d && !iVar.f56980e) {
                    iVar.f56980e = true;
                    jVar.f56989k.execute(new vi.c(jVar, iVar, length, j10, 0));
                    File file = iVar.f56978b;
                    byte[] bArr2 = jVar.B;
                    if (bArr2 != null) {
                        bArr = (byte[]) bArr2.clone();
                    }
                    jVar.C = new vi.f(file, j10, bArr);
                    jVar.s(8);
                    jVar.c();
                    jVar.t();
                    jVar.l("detached_preview");
                    fVar = jVar.C;
                }
            }
        }
        if (fVar == null) {
            return false;
        }
        ((vi.j) this.f9236e).o();
        this.f9235c = true;
        return true;
    }

    public void d(Canvas canvas, RectF rectF, float f10, float f11, int i3, boolean z10, boolean z11) {
        int i10;
        Paint paint = (Paint) this.h;
        ug0 ug0Var = (ug0) this.f9237f;
        g6 g6Var = (g6) this.f9236e;
        if (z10 != this.f9234b) {
            this.f9234b = z10;
            if (z10) {
                i10 = 2131746446;
            } else {
                i10 = 2131746447;
            }
            g6Var.t(bd.M0(i10, null), true, true);
        }
        float c2 = g6Var.c();
        float L = org.telegram.messenger.g0.L(17.66f);
        rectF.set(f10 - ((int) (c2 + org.telegram.messenger.g0.L(23.66f))), f11 - L, f10, f11);
        float a10 = ((gc) this.f9238g).a(0.02f) * ((u5) this.d).d(z11);
        if (a10 > 0.0f) {
            paint.setColor(i0.a.o(i3, 30));
            canvas.save();
            canvas.scale(a10, a10, f10, f11);
            float f12 = L / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            g6Var.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(6.0f)), (int) rectF.top, (int) (rectF.right - org.telegram.messenger.g0.L(17.66f)), (int) rectF.bottom);
            g6Var.u(i3);
            g6Var.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(14.0f);
            float f13 = L2 / 2.0f;
            ug0Var.setBounds((int) ((rectF.right - org.telegram.messenger.g0.L(3.33f)) - L2), (int) ((rectF.centerY() - f13) + org.telegram.messenger.g0.L(0.33f)), (int) (rectF.right - org.telegram.messenger.g0.L(3.33f)), (int) (rectF.centerY() + f13 + org.telegram.messenger.g0.L(0.33f)));
            Paint paint2 = ug0Var.f38742b;
            paint2.setColor(i3);
            paint2.setAlpha(ug0Var.d);
            boolean z12 = !z10;
            if (ug0Var.f38744e != z12) {
                ug0Var.f38744e = z12;
                ug0Var.f38741a.invalidate();
            }
            ug0Var.draw(canvas);
            canvas.restore();
        }
    }

    public boolean e() {
        vi.j jVar = (vi.j) this.f9236e;
        jVar.getClass();
        vi.j.q();
        if (jVar.e().f156a == 5) {
            return true;
        }
        return false;
    }

    public void f() {
        this.f9234b = true;
    }

    public void g(boolean z10) {
        this.f9235c = z10;
        ((gc) this.f9238g).c(z10);
    }

    public boolean h() {
        vi.j jVar = (vi.j) this.f9236e;
        jVar.getClass();
        vi.j.q();
        if (jVar.G != 1) {
            return false;
        }
        File file = jVar.f56982b;
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

    public g(Context context, File file, ge geVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f9237f = new Object();
        this.f9238g = new HashMap();
        this.h = new HashSet();
        this.f9233a = 1;
        i4 i4Var = new i4(context, 3);
        i4Var.f10404c = file;
        vi.h hVar = (vi.h) xi.e.f58879c.a();
        if (hVar != null) {
            i4Var.d = hVar;
            i4Var.f10402a = false;
            i4Var.f10405e = new mi.h0(5, this, geVar);
            i4Var.f10406f = new m2.t(5, this, geVar);
            i4Var.f10407g = new kb.a(17);
            this.f9236e = new vi.j(i4Var);
            return;
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public g(int i3, PendingIntent pendingIntent, String str) {
        IconCompat e10 = i3 == 0 ? null : IconCompat.e(null, "", i3);
        Bundle bundle = new Bundle();
        this.f9234b = true;
        this.f9235c = true;
        this.d = e10;
        this.f9236e = q.d(str);
        this.f9237f = pendingIntent;
        this.f9238g = bundle;
        this.h = null;
        this.f9234b = true;
        this.f9233a = 0;
        this.f9235c = true;
    }
}
