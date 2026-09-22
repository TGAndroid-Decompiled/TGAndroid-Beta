package l;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import b2.q0;
import b2.s0;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.a1;
import e9.g0;
import e9.i0;
import gg.b2;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import m.e2;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.cc1;
import org.telegram.ui.m9;
import org.telegram.ui.ts0;
import org.telegram.ui.u9;
import org.telegram.ui.web.d1;
import pg.b1;
import pg.f1;
import s4.c1;
import s4.h1;
import s4.o0;
import s4.p0;
import w7.y8;
import yh.y3;
public class d implements e2, y2.h, le.d, j, l2.h, to0, le.f, lg.o, s71, b2, u9, com.google.android.gms.common.api.internal.s, h1, w2.a, lq0 {
    public final int f13911a;
    public Object f13912b;

    public d(int i10, boolean z10) {
        this.f13911a = i10;
    }

    @Override
    public void A() {
        ((l9) this.f13912b).f26033a.invalidate();
    }

    @Override
    public void C(float f7, int i10) {
        ((le.j) this.f13912b).i(f7);
    }

    @Override
    public a0.i D() {
        return null;
    }

    @Override
    public void E(l lVar, n nVar) {
        f fVar = (f) this.f13912b;
        Handler handler = fVar.f13928f;
        e eVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f13929n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (lVar == ((e) arrayList.get(i10)).f13923b) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            eVar = (e) arrayList.get(i11);
        }
        handler.postAtTime(new com.google.android.gms.internal.cast.p(this, eVar, nVar, lVar, false, 1), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public boolean F() {
        return true;
    }

    @Override
    public void G(boolean z10) {
        ((ff0) this.f13912b).f24218c.setAspectLock(z10);
    }

    @Override
    public void H(int i10, float f7, float f10, le.e eVar) {
        ((le.j) this.f13912b).i(f7);
    }

    @Override
    public View I(int i10) {
        return ((o0) this.f13912b).q(i10);
    }

    @Override
    public String I0() {
        return ((d1) this.f13912b).f38884i0;
    }

    @Override
    public long J(long j3) {
        ArrayList arrayList = (ArrayList) this.f13912b;
        if (arrayList.isEmpty() || j3 < ((z3.a) arrayList.get(0)).f48401b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((z3.a) arrayList.get(i10)).f48401b;
            int i11 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
            if (i11 == 0) {
                return j10;
            }
            if (i11 < 0) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j11 = aVar.d;
                if (j11 != -9223372036854775807L && j11 <= j3) {
                    return j11;
                }
                return aVar.f48401b;
            }
        }
        z3.a aVar2 = (z3.a) e9.q.l(arrayList);
        long j12 = aVar2.d;
        if (j12 != -9223372036854775807L && j3 >= j12) {
            return j12;
        }
        return aVar2.f48401b;
    }

    @Override
    public void K(String str) {
        d1 d1Var = (d1) this.f13912b;
        try {
            d1Var.P = System.currentTimeMillis();
            d1Var.z("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override
    public boolean L(int i10) {
        if (i10 == ((sq0) this.f13912b).f28302r) {
            return true;
        }
        return false;
    }

    @Override
    public long M() {
        return 0L;
    }

    @Override
    public int N(View view) {
        return o0.y(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public long P(long j3) {
        return 1L;
    }

    @Override
    public long Q(long j3, long j10) {
        return 1L;
    }

    @Override
    public void R(long j3) {
        ArrayList arrayList = (ArrayList) this.f13912b;
        int a02 = a0(j3);
        if (a02 == 0) {
            return;
        }
        long j10 = ((z3.a) arrayList.get(a02 - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            a02--;
        }
        arrayList.subList(0, a02).clear();
    }

    @Override
    public void S(y2.j jVar, long j3, long j10, boolean z10) {
        ((l2.g) this.f13912b).w((y2.p) jVar, j10);
    }

    public void T(HashMap hashMap) {
        if (((SparseArray) this.f13912b) == null) {
            this.f13912b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.f13912b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    public void V() {
        pg.d1 d1Var = ((f1) this.f13912b).d;
        if (d1Var != null) {
            b1 b1Var = d1Var.f41144s;
            if (b1Var != null) {
                d1Var.cancelRunnable(b1Var);
                d1Var.f41144s = null;
            }
            b1 b1Var2 = new b1(d1Var, 1);
            d1Var.f41144s = b1Var2;
            d1Var.postRunnable(b1Var2, 1L);
        }
    }

    public s0.d W(int i10) {
        return null;
    }

    @Override
    public void X(float f7, boolean z10) {
        cc1 cc1Var = (cc1) ((k0) this.f13912b);
        int i10 = (int) (j6.f19341q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        j6.f19341q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = cc1Var.e.e;
            il0 il0Var = (il0) themeActivity.f31856b.L(themeActivity.f31863f0);
            if (il0Var != null) {
                ((f9) il0Var.f42995a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (j6.f19341q * 100.0f))));
            }
            j6.E(true);
        }
    }

    public s0.d Y(int i10) {
        return null;
    }

    @Override
    public void Z(boolean z10) {
        ff0 ff0Var = (ff0) this.f13912b;
        ff0Var.getClass();
        ef0 ef0Var = ff0Var.f24216a;
        if (ef0Var != null) {
            ((ts0) ef0Var).a(z10);
        }
    }

    public int a0(long j3) {
        ArrayList arrayList = (ArrayList) this.f13912b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j3 < ((z3.a) arrayList.get(i10)).f48401b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f13911a) {
            case 18:
                r7.z zVar = (r7.z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel O0 = zVar.O0();
                r7.d.c(O0, (g8.e) this.f13912b);
                r7.d.d(O0, fVar);
                O0.writeString(null);
                zVar.S0(O0, 63);
                return;
            default:
                s6.f fVar2 = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel I0 = eVar.I0();
                k7.a.d(I0, fVar2);
                k7.a.c(I0, (s6.a) this.f13912b);
                eVar.J0(I0, 1);
                return;
        }
    }

    @Override
    public long b(long j3) {
        return 0L;
    }

    public void b0(aa.a aVar) {
        h8.j jVar = (h8.j) this.f13912b;
        jVar.f10151a = aVar;
        Iterator it = jVar.f10153c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f10153c.clear();
        jVar.f10152b = null;
    }

    public boolean c0(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override
    public void clear() {
        ((ArrayList) this.f13912b).clear();
    }

    @Override
    public long d(long j3) {
        ArrayList arrayList = (ArrayList) this.f13912b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((z3.a) arrayList.get(0)).f48401b) {
            return ((z3.a) arrayList.get(0)).f48401b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j10 = aVar.f48401b;
            long j11 = aVar.f48401b;
            if (j3 < j10) {
                long j12 = ((z3.a) arrayList.get(i10 - 1)).d;
                if (j12 != -9223372036854775807L && j12 > j3 && j12 < j11) {
                    return j12;
                }
                return j11;
            }
        }
        long j13 = ((z3.a) e9.q.l(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override
    public void d0() {
        ef0 ef0Var = ((ff0) this.f13912b).f24216a;
        if (ef0Var != null) {
            PhotoViewer photoViewer = ((ts0) ef0Var).f37877a;
            if (photoViewer.f31226c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.p3();
            }
        }
    }

    @Override
    public long e(long j3, long j10) {
        return 0L;
    }

    public void e0(c1 c1Var, q0 q0Var, q0 q0Var2) {
        int i10;
        int i11;
        boolean z10;
        c1 U;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f13912b;
        recyclerView.f2839b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        s4.f1 f1Var = (s4.f1) recyclerView.f2842c0;
        f1Var.getClass();
        int i13 = q0Var.f3202a;
        int i14 = q0Var.f3203b;
        View view = c1Var.f42995a;
        if (q0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = q0Var2.f3202a;
        }
        int i15 = i10;
        if (q0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = q0Var2.f3203b;
        }
        int i16 = i11;
        if (!c1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = f1Var.r(c1Var, q0Var, i13, i14, i15, i16);
        } else {
            int i17 = c1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (U = recyclerView.U(childAt)) != null && !U.j() && (i12 = U.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            c1Var.f43000i = (c1Var.h - i18) + (i18 * 1000);
            f1Var.s(c1Var, q0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    @Override
    public boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override
    public void f(int i10) {
        sq0 sq0Var = (sq0) this.f13912b;
        wq0 wq0Var = sq0Var.K;
        sq0Var.f28303s = i10;
        if (sq0Var.v != i10) {
            sq0Var.d.clear();
        }
        int i11 = sq0Var.J;
        if (sq0Var.h() == 0 && !sq0Var.e.e() && !sq0Var.I) {
            wq0Var.Q.e(false, true);
        } else {
            wq0Var.f30127x0.b(i11);
        }
        sq0Var.l();
        int i12 = wq0.f30096a1;
        wq0Var.K0(true);
    }

    public void f0(c1 c1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f13912b;
        o0 o0Var = recyclerView.f2867x;
        View view = c1Var.f42995a;
        of.e eVar = recyclerView.f2839b;
        lf.h hVar = o0Var.f43087a;
        o0.b bVar = (o0.b) hVar.f14230b;
        int indexOfChild = ((RecyclerView) bVar.f15487b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e6.n) hVar.f14231c).B(indexOfChild)) {
                hVar.Y(view);
            }
            bVar.l(indexOfChild);
        }
        eVar.g(view);
    }

    @Override
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public boolean i(float f7) {
        return false;
    }

    @Override
    public int k(View view) {
        return o0.x(view) - ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public long l(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public int l0() {
        return 0;
    }

    @Override
    public m2.j m(long j3) {
        return (m2.j) this.f13912b;
    }

    @Override
    public k4.d n(y2.j r4, long r5, long r7, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: l.d.n(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public void o(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.p pVar = (y2.p) jVar;
        l2.g gVar = (l2.g) this.f13912b;
        if (i10 == 0) {
            long j11 = pVar.f46621a;
            tVar = new u2.t(pVar.f46622b);
        } else {
            long j12 = pVar.f46621a;
            Uri uri = pVar.d.f9352c;
            tVar = new u2.t(j10);
        }
        gVar.f14044q.s(tVar, pVar.f46623c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public void onDismiss() {
        d1 d1Var = (d1) this.f13912b;
        d1Var.z("scan_qr_popup_closed", null);
        d1Var.f38883h0 = false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        tk0 tk0Var = (tk0) this.f13912b;
        if (z10 && tk0Var.f28489n.n() >= 0) {
            tk0Var.f28492w = true;
        }
        sg0 sg0Var = tk0Var.f28488f;
        jc0 jc0Var = tk0Var.f28493x;
        sg0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(jc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(jc0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void p(y2.j jVar, long j3, long j10) {
        int size;
        int i10;
        long j11;
        y2.p pVar = (y2.p) jVar;
        l2.g gVar = (l2.g) this.f13912b;
        long j12 = pVar.f46621a;
        Uri uri = pVar.d.f9352c;
        u2.t tVar = new u2.t(j10);
        gVar.f14040m.getClass();
        gVar.f14044q.p(tVar, pVar.f46623c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) pVar.f46624f;
        m2.c cVar2 = gVar.H;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f14638m.size();
        }
        long j13 = cVar.b(0).f14655b;
        int i11 = 0;
        while (i11 < size && gVar.H.b(i11).f14655b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.f14638m.size()) {
                e2.a.n("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j11 = -9223372036854775807L;
                long j14 = gVar.N;
                if (j14 != -9223372036854775807L) {
                    i10 = i11;
                    if (cVar.h * 1000 <= j14) {
                        e2.a.n("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.N);
                    }
                } else {
                    i10 = i11;
                }
                gVar.M = 0;
            }
            int i12 = gVar.M;
            gVar.M = i12 + 1;
            if (i12 < gVar.f14040m.L3(pVar.f46623c)) {
                gVar.D.postDelayed(gVar.v, Math.min((gVar.M - 1) * 1000, 5000));
                return;
            }
            gVar.C = new IOException();
            return;
        }
        i10 = i11;
        j11 = -9223372036854775807L;
        gVar.H = cVar;
        gVar.I = cVar.d & gVar.I;
        gVar.J = j3 - j10;
        gVar.K = j3;
        gVar.O += i10;
        synchronized (gVar.f14047t) {
            try {
                if (pVar.f46622b.f9380a.equals(gVar.F)) {
                    Uri uri2 = gVar.H.f14636k;
                    if (uri2 == null) {
                        uri2 = y8.a(pVar.d.f9352c);
                    }
                    gVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = gVar.H;
        if (cVar3.d && gVar.L == j11) {
            c5.a aVar = cVar3.f14634i;
            if (aVar != null) {
                String str = aVar.f3841b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                gVar.x(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                gVar.v();
                                return;
                            }
                        }
                        gVar.z(aVar, new ob.a(12));
                        return;
                    }
                    gVar.z(aVar, new Object());
                    return;
                }
                try {
                    gVar.L = e2.d0.T(aVar.f3842c) - gVar.K;
                    gVar.y(true);
                    return;
                } catch (s0 e) {
                    gVar.x(e);
                    return;
                }
            }
            gVar.v();
            return;
        }
        gVar.y(true);
    }

    @Override
    public void q(l lVar, MenuItem menuItem) {
        ((f) this.f13912b).f13928f.removeCallbacksAndMessages(lVar);
    }

    @Override
    public void r(l lVar) {
        ki.e0 e0Var = ((ActionMenuView) this.f13912b).K;
        if (e0Var != null) {
            e0Var.r(lVar);
        }
    }

    @Override
    public int s() {
        return ((o0) this.f13912b).D();
    }

    @Override
    public long t(long j3, long j10) {
        return 0L;
    }

    @Override
    public void t0() {
        pc k10 = ((y3) this.f13912b).getBulletinFactory().k(false);
        k10.f27321t = true;
        k10.j();
    }

    public String toString() {
        switch (this.f13911a) {
            case 15:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f13912b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public i0 u(long j3) {
        int a02 = a0(j3);
        if (a02 == 0) {
            g0 g0Var = i0.f8083b;
            return a1.e;
        }
        z3.a aVar = (z3.a) ((ArrayList) this.f13912b).get(a02 - 1);
        long j10 = aVar.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            g0 g0Var2 = i0.f8083b;
            return a1.e;
        }
        return aVar.f48400a;
    }

    @Override
    public int v() {
        o0 o0Var = (o0) this.f13912b;
        return o0Var.f43096m - o0Var.E();
    }

    @Override
    public boolean w(l lVar, MenuItem menuItem) {
        m.k kVar = ((ActionMenuView) this.f13912b).P;
        if (kVar != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((k2.e) kVar).f13244b).W.f14231c).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.c0) it.next()).f2401a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public void x() {
        ef0 ef0Var = ((ff0) this.f13912b).f24216a;
        if (ef0Var != null) {
            ((ts0) ef0Var).f37877a.f31242e0.invalidate();
        }
    }

    @Override
    public a0.i y() {
        return null;
    }

    @Override
    public boolean z(z3.a r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: l.d.z(z3.a, long):boolean");
    }

    public d(Object obj, int i10) {
        this.f13911a = i10;
        this.f13912b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public d(s6.g gVar, s6.a aVar) {
        this.f13911a = 23;
        this.f13912b = aVar;
    }

    public d(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f13911a = 17;
        this.f13912b = new GestureDetector(context, onGestureListener, null);
    }

    public d(int i10) {
        this.f13911a = i10;
        switch (i10) {
            case 26:
                this.f13912b = new ArrayList();
                return;
            case 27:
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f13912b = new mh0(this);
                    return;
                } else {
                    this.f13912b = new mh0(this);
                    return;
                }
            case 28:
                this.f13912b = new CopyOnWriteArrayList();
                return;
        }
    }

    @Override
    public void B() {
    }

    @Override
    public void U() {
    }

    @Override
    public void a() {
    }

    @Override
    public void j() {
    }

    @Override
    public void O(ArrayList arrayList) {
    }

    @Override
    public void T0(MrzRecognizer.Result result) {
    }

    @Override
    public void g(boolean z10) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public long c(long j3, long j10) {
        return j10;
    }

    @Override
    public void onError(v71 v71Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
