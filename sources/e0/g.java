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
import di.i4;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.me;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
public final class g {
    public int f10056a;
    public boolean f10057b;
    public boolean f10058c;
    public final Object d;
    public final Object f10059e;
    public final Object f10060f;
    public final Object f10061g;
    public Object h;

    public g(View view) {
        this.h = new Paint(1);
        this.d = new v5(view, 350L, wq.h);
        this.f10060f = new rg0(view);
        this.f10061g = new hc(view);
        h6 h6Var = new h6(false, false, false);
        this.f10059e = h6Var;
        h6Var.w(org.telegram.messenger.g0.L(11.0f));
        h6Var.r(true, true);
        h6Var.setCallback(view);
        h6Var.M = (int) (org.telegram.messenger.g0.f22567q.x * 0.3f);
        this.f10057b = false;
        h6Var.t(id.M0(2131746439, null), false, true);
        String M0 = id.M0(2131746438, null);
        TextPaint textPaint = h6Var.f34185a;
        this.f10056a = (int) Math.ceil(Math.max(textPaint.measureText(M0), textPaint.measureText(id.M0(2131746439, null))));
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
        return new h((IconCompat) this.d, (CharSequence) this.f10059e, (PendingIntent) this.f10060f, (Bundle) this.f10061g, l0VarArr2, l0VarArr, this.f10057b, this.f10056a, this.f10058c);
    }

    public boolean c() {
        vi.h hVar = (vi.h) this.f10059e;
        hVar.getClass();
        vi.h.q();
        ac.e eVar = null;
        byte[] bArr = null;
        eVar = null;
        eVar = null;
        eVar = null;
        eVar = null;
        if (hVar.G == 5 && hVar.f57574z != null && hVar.f57567r == 0 && hVar.f57568s == hVar.j()) {
            hVar.p();
            vi.g gVar = hVar.f57574z;
            long j3 = hVar.j();
            long length = gVar.f57549b.length();
            hVar.a(gVar, length);
            synchronized (hVar.f57561l) {
                if (gVar.d && !gVar.f57551e) {
                    gVar.f57551e = true;
                    hVar.f57560k.execute(new vi.c(hVar, gVar, length, j3, 0));
                    File file = gVar.f57549b;
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
        ((vi.h) this.f10059e).o();
        this.f10058c = true;
        return true;
    }

    public void d(Canvas canvas, RectF rectF, float f10, float f11, int i7, boolean z9, boolean z10) {
        int i10;
        Paint paint = (Paint) this.h;
        rg0 rg0Var = (rg0) this.f10060f;
        h6 h6Var = (h6) this.f10059e;
        if (z9 != this.f10057b) {
            this.f10057b = z9;
            if (z9) {
                i10 = 2131746438;
            } else {
                i10 = 2131746439;
            }
            h6Var.t(id.M0(i10, null), true, true);
        }
        float c10 = h6Var.c();
        float L = org.telegram.messenger.g0.L(17.66f);
        rectF.set(f10 - ((int) (c10 + org.telegram.messenger.g0.L(23.66f))), f11 - L, f10, f11);
        float a10 = ((hc) this.f10061g).a(0.02f) * ((v5) this.d).d(z10);
        if (a10 > 0.0f) {
            paint.setColor(i0.a.o(i7, 30));
            canvas.save();
            canvas.scale(a10, a10, f10, f11);
            float f12 = L / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            h6Var.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(6.0f)), (int) rectF.top, (int) (rectF.right - org.telegram.messenger.g0.L(17.66f)), (int) rectF.bottom);
            h6Var.u(i7);
            h6Var.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(14.0f);
            float f13 = L2 / 2.0f;
            rg0Var.setBounds((int) ((rectF.right - org.telegram.messenger.g0.L(3.33f)) - L2), (int) ((rectF.centerY() - f13) + org.telegram.messenger.g0.L(0.33f)), (int) (rectF.right - org.telegram.messenger.g0.L(3.33f)), (int) (rectF.centerY() + f13 + org.telegram.messenger.g0.L(0.33f)));
            Paint paint2 = rg0Var.f37642b;
            paint2.setColor(i7);
            paint2.setAlpha(rg0Var.d);
            boolean z11 = !z9;
            if (rg0Var.f37644e != z11) {
                rg0Var.f37644e = z11;
                rg0Var.f37641a.invalidate();
            }
            rg0Var.draw(canvas);
            canvas.restore();
        }
    }

    public boolean e() {
        vi.h hVar = (vi.h) this.f10059e;
        hVar.getClass();
        vi.h.q();
        if (hVar.e().f3009a == 5) {
            return true;
        }
        return false;
    }

    public void f() {
        this.f10057b = true;
    }

    public void g(boolean z9) {
        this.f10058c = z9;
        ((hc) this.f10061g).c(z9);
    }

    public boolean h() {
        vi.h hVar = (vi.h) this.f10059e;
        hVar.getClass();
        vi.h.q();
        if (hVar.G != 1) {
            return false;
        }
        File file = hVar.f57553b;
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
        this.f10060f = new Object();
        this.f10061g = new HashMap();
        this.h = new HashSet();
        this.f10056a = 1;
        i4 i4Var = new i4(context, 3);
        i4Var.f9111c = file;
        vi.f fVar = (vi.f) xi.e.f58866c.a();
        if (fVar != null) {
            i4Var.d = fVar;
            i4Var.f9109a = false;
            i4Var.f9112e = new j2.n(11, this, meVar);
            i4Var.f9113f = new m4.d0(this, meVar, false);
            i4Var.f9114g = new w7.s(16, false);
            this.f10059e = new vi.h(i4Var);
            return;
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public g(int i7, PendingIntent pendingIntent, String str) {
        IconCompat e10 = i7 == 0 ? null : IconCompat.e(null, "", i7);
        Bundle bundle = new Bundle();
        this.f10057b = true;
        this.f10058c = true;
        this.d = e10;
        this.f10059e = q.d(str);
        this.f10060f = pendingIntent;
        this.f10061g = bundle;
        this.h = null;
        this.f10057b = true;
        this.f10056a = 0;
        this.f10058c = true;
    }
}
