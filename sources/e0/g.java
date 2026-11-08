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
import di.h4;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.me;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public final class g {
    public int f10051a;
    public boolean f10052b;
    public boolean f10053c;
    public final Object d;
    public final Object f10054e;
    public final Object f10055f;
    public final Object f10056g;
    public Object h;

    public g(View view) {
        this.h = new Paint(1);
        this.d = new w5(view, 350L, xq.h);
        this.f10055f = new rg0(view);
        this.f10056g = new ic(view);
        i6 i6Var = new i6(false, false, false);
        this.f10054e = i6Var;
        i6Var.w(org.telegram.messenger.g0.L(11.0f));
        i6Var.r(true, true);
        i6Var.setCallback(view);
        i6Var.M = (int) (org.telegram.messenger.g0.f22563q.x * 0.3f);
        this.f10052b = false;
        i6Var.t(id.M0(2131746440, null), false, true);
        String M0 = id.M0(2131746439, null);
        TextPaint textPaint = i6Var.f34550a;
        this.f10051a = (int) Math.ceil(Math.max(textPaint.measureText(M0), textPaint.measureText(id.M0(2131746440, null))));
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
        return new h((IconCompat) this.d, (CharSequence) this.f10054e, (PendingIntent) this.f10055f, (Bundle) this.f10056g, l0VarArr2, l0VarArr, this.f10052b, this.f10051a, this.f10053c);
    }

    public boolean c() {
        vi.h hVar = (vi.h) this.f10054e;
        hVar.getClass();
        vi.h.q();
        ac.e eVar = null;
        byte[] bArr = null;
        eVar = null;
        eVar = null;
        eVar = null;
        eVar = null;
        if (hVar.G == 5 && hVar.f57562z != null && hVar.f57555r == 0 && hVar.f57556s == hVar.j()) {
            hVar.p();
            vi.g gVar = hVar.f57562z;
            long j3 = hVar.j();
            long length = gVar.f57537b.length();
            hVar.a(gVar, length);
            synchronized (hVar.f57549l) {
                if (gVar.d && !gVar.f57539e) {
                    gVar.f57539e = true;
                    hVar.f57548k.execute(new vi.c(hVar, gVar, length, j3, 0));
                    File file = gVar.f57537b;
                    byte[] bArr2 = hVar.B;
                    if (bArr2 != null) {
                        bArr = (byte[]) bArr2.clone();
                    }
                    hVar.C = new ac.e(file, j3, bArr);
                    hVar.s(8);
                    hVar.c();
                    hVar.t();
                    hVar.l("detached_preview");
                    eVar = hVar.C;
                }
            }
        }
        if (eVar == null) {
            return false;
        }
        ((vi.h) this.f10054e).o();
        this.f10053c = true;
        return true;
    }

    public void d(Canvas canvas, RectF rectF, float f10, float f11, int i7, boolean z9, boolean z10) {
        int i10;
        Paint paint = (Paint) this.h;
        rg0 rg0Var = (rg0) this.f10055f;
        i6 i6Var = (i6) this.f10054e;
        if (z9 != this.f10052b) {
            this.f10052b = z9;
            if (z9) {
                i10 = 2131746439;
            } else {
                i10 = 2131746440;
            }
            i6Var.t(id.M0(i10, null), true, true);
        }
        float c10 = i6Var.c();
        float L = org.telegram.messenger.g0.L(17.66f);
        rectF.set(f10 - ((int) (c10 + org.telegram.messenger.g0.L(23.66f))), f11 - L, f10, f11);
        float a10 = ((ic) this.f10056g).a(0.02f) * ((w5) this.d).d(z10);
        if (a10 > 0.0f) {
            paint.setColor(i0.a.o(i7, 30));
            canvas.save();
            canvas.scale(a10, a10, f10, f11);
            float f12 = L / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            i6Var.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(6.0f)), (int) rectF.top, (int) (rectF.right - org.telegram.messenger.g0.L(17.66f)), (int) rectF.bottom);
            i6Var.u(i7);
            i6Var.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(14.0f);
            float f13 = L2 / 2.0f;
            rg0Var.setBounds((int) ((rectF.right - org.telegram.messenger.g0.L(3.33f)) - L2), (int) ((rectF.centerY() - f13) + org.telegram.messenger.g0.L(0.33f)), (int) (rectF.right - org.telegram.messenger.g0.L(3.33f)), (int) (rectF.centerY() + f13 + org.telegram.messenger.g0.L(0.33f)));
            Paint paint2 = rg0Var.f37655b;
            paint2.setColor(i7);
            paint2.setAlpha(rg0Var.d);
            boolean z11 = !z9;
            if (rg0Var.f37657e != z11) {
                rg0Var.f37657e = z11;
                rg0Var.f37654a.invalidate();
            }
            rg0Var.draw(canvas);
            canvas.restore();
        }
    }

    public boolean e() {
        vi.h hVar = (vi.h) this.f10054e;
        hVar.getClass();
        vi.h.q();
        if (hVar.e().f3009a == 5) {
            return true;
        }
        return false;
    }

    public void f() {
        this.f10052b = true;
    }

    public void g(boolean z9) {
        this.f10053c = z9;
        ((ic) this.f10056g).c(z9);
    }

    public boolean h() {
        vi.h hVar = (vi.h) this.f10054e;
        hVar.getClass();
        vi.h.q();
        if (hVar.G != 1) {
            return false;
        }
        File file = hVar.f57541b;
        if ((file.isDirectory() || file.mkdirs()) && file.canWrite()) {
            hVar.h.b("start requested");
            hVar.d();
            hVar.s(2);
            hVar.u(0L, -1L, null);
            return true;
        }
        hVar.g(new IllegalStateException("Output directory is not writable: " + file));
        return false;
    }

    public g(Context context, File file, me meVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f10055f = new Object();
        this.f10056g = new HashMap();
        this.h = new HashSet();
        this.f10051a = 1;
        h4 h4Var = new h4(context, 3);
        h4Var.f9076c = file;
        vi.f fVar = (vi.f) xi.e.f58858c.a();
        if (fVar != null) {
            h4Var.d = fVar;
            h4Var.f9074a = false;
            h4Var.f9077e = new j2.n(11, this, meVar);
            h4Var.f9078f = new m4.d0(this, meVar, false);
            h4Var.f9079g = new w7.s(16, false);
            this.f10054e = new vi.h(h4Var);
            return;
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public g(int i7, PendingIntent pendingIntent, String str) {
        IconCompat e10 = i7 == 0 ? null : IconCompat.e(null, "", i7);
        Bundle bundle = new Bundle();
        this.f10052b = true;
        this.f10053c = true;
        this.d = e10;
        this.f10054e = q.d(str);
        this.f10055f = pendingIntent;
        this.f10056g = bundle;
        this.h = null;
        this.f10052b = true;
        this.f10051a = 0;
        this.f10053c = true;
    }
}
