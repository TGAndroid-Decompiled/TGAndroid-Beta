package jg;

import a8.fg;
import a8.lg;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.cast.f4;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import li.m4;
import li.o4;
import li.r3;
import li.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.ip0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.v20;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.yh0;
import org.telegram.ui.Components.yl;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.pi0;
import org.telegram.ui.ya1;
public class i implements ri, m.e2, y2.g, ip0, e5, li.i0, l.w, l.i, o0.a, u2.e1, lp0, oe.f, tb, q81, zu0, t91, com.google.android.gms.common.api.internal.r, r2.m, s4.j1, com.google.android.gms.common.api.internal.o, sg.w1 {
    public final Object f15725a;

    public i(Object obj) {
        this.f15725a = obj;
    }

    @Override
    public void A(gh ghVar) {
        NotificationCenter.getInstance(n.b0((n) this.f15725a)).doOnIdle(ghVar);
    }

    @Override
    public void B(y2.i iVar, long j10, long j11) {
        int size;
        long j12;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.f15725a;
        long j13 = oVar.f52025a;
        g2.m mVar = oVar.f52026b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        gVar.f16812m.getClass();
        gVar.f16816q.q(uVar, oVar.f52027c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f52028f;
        m2.c cVar2 = gVar.G;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f17943m.size();
        }
        long j14 = cVar.b(0).f17960b;
        int i10 = 0;
        while (i10 < size && gVar.G.b(i10).f17960b < j14) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.f17943m.size()) {
                e2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j15 = gVar.M;
                j12 = -9223372036854775807L;
                if (j15 != -9223372036854775807L && cVar.h * 1000 <= j15) {
                    e2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.M);
                } else {
                    gVar.L = 0;
                }
            }
            int i11 = gVar.L;
            gVar.L = i11 + 1;
            if (i11 < gVar.f16812m.B0(oVar.f52027c)) {
                gVar.D.postDelayed(gVar.v, Math.min((gVar.L - 1) * 1000, 5000));
                return;
            }
            gVar.C = new IOException();
            return;
        }
        j12 = -9223372036854775807L;
        gVar.G = cVar;
        gVar.H = cVar.d & gVar.H;
        gVar.I = j10 - j11;
        gVar.J = j10;
        gVar.N += i10;
        synchronized (gVar.f16819t) {
            try {
                if (oVar.f52026b.f12257a.equals(gVar.E)) {
                    Uri uri = gVar.G.f17941k;
                    if (uri == null) {
                        uri = w7.i0.a(oVar.d.f12230c);
                    }
                    gVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = gVar.G;
        if (cVar3.d && gVar.K == j12) {
            m2.t tVar = cVar3.f17939i;
            if (tVar != null) {
                String str = tVar.f17988b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                gVar.y(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                gVar.w();
                                return;
                            }
                        }
                        gVar.A(tVar, new qb.a(12));
                        return;
                    }
                    gVar.A(tVar, new Object());
                    return;
                }
                try {
                    gVar.K = e2.n0.V(tVar.f17989c) - gVar.J;
                    gVar.z(true);
                    return;
                } catch (b2.x0 e) {
                    gVar.y(e);
                    return;
                }
            }
            gVar.w();
            return;
        }
        gVar.z(true);
    }

    @Override
    public s9 C() {
        m4 m4Var = ((o4) this.f15725a).G;
        if (m4Var != null) {
            return ((r3) m4Var).f17442a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public Cursor D(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15725a;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public boolean F(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.f15725a).getClass();
        return false;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        li.b2 b2Var = (li.b2) this.f15725a;
        b2Var.t0(i10, i11, z10);
        pi0 pi0Var = b2Var.O0;
        if (pi0Var != null) {
            pi0Var.h();
            b2Var.O0 = null;
        }
    }

    @Override
    public void I(CharSequence charSequence) {
        m4 m4Var = ((o4) this.f15725a).G;
        if (m4Var != null) {
            r3 r3Var = (r3) m4Var;
            r3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                r3Var.f17442a.z4(charSequence.toString());
            }
        }
    }

    @Override
    public int J() {
        s4.p0 p0Var = (s4.p0) this.f15725a;
        return p0Var.f47862m - p0Var.E();
    }

    @Override
    public r9 K() {
        return (o4) this.f15725a;
    }

    @Override
    public li.a L() {
        return ((o4) this.f15725a).f17652a;
    }

    @Override
    public boolean M() {
        o4 o4Var = (o4) this.f15725a;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            li.a aVar = o4Var.f17652a;
            if (((r3) m4Var).f17442a.Y4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void O(int i10, int i11) {
        o4 o4Var = (o4) this.f15725a;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            li.a aVar = o4Var.f17652a;
            li.f2 f2Var = ((r3) m4Var).f17442a.R3;
            if (f2Var != null) {
                f2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void P() {
        ((o9) this.f15725a).f31235a.invalidate();
    }

    @Override
    public void Q(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f15725a;
        Handler handler = eVar.f16700f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f16701n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((l.d) arrayList.get(i10)).f16695b) {
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
            dVar = (l.d) arrayList.get(i11);
        }
        handler.postAtTime(new fg(this, dVar, mVar, kVar, false, 2), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public void Q0(ub ubVar, fb fbVar, pg pgVar, yl ylVar) {
        rg0.e((rg0) this.f15725a, true, fbVar, pgVar, ylVar);
    }

    @Override
    public void S() {
        o4 o4Var = (o4) this.f15725a;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            li.a aVar = o4Var.f17652a;
            v3 v3Var = ((r3) m4Var).f17442a;
            li.f2 f2Var = v3Var.R3;
            if (f2Var != null) {
                f2Var.g();
            }
            v3Var.f17556p3.onContentChanged();
        }
    }

    @Override
    public void U(float f7, boolean z10) {
        ya1 ya1Var = (ya1) ((org.telegram.ui.Cells.j0) this.f15725a);
        int i10 = (int) (y6.f23592q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        y6.f23592q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = ya1Var.f45947f.e;
            wl0 wl0Var = (wl0) themeActivity.f36289b.K(themeActivity.f36296f0);
            if (wl0Var != null) {
                ((i9) wl0Var.f47773a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (y6.f23592q * 100.0f))));
            }
            y6.E(true);
        }
    }

    @Override
    public void V(float f7) {
        sg.w0 w0Var = (sg.w0) this.f15725a;
        rg.s0.e(w0Var.f48578a).k("-1", f7);
        w0Var.e.setBrushSize(f7);
    }

    @Override
    public View W(int i10) {
        return ((s4.p0) this.f15725a).q(i10);
    }

    @Override
    public int X(View view) {
        return s4.p0.y(view) + ((ViewGroup.MarginLayoutParams) ((s4.q0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public org.telegram.ui.ActionBar.g1 Z(int i10, Runnable runnable, String str, boolean z10, boolean z11) {
        bw0 bw0Var = (bw0) this.f15725a;
        org.telegram.ui.ActionBar.g1 e = bw0Var.I.e(0, i10, str);
        if (z10) {
            int i11 = y6.f23582p7;
            e.d(bw0Var.p0(i11), bw0Var.p0(i11));
        }
        e.setOnClickListener(new qc0(this, z11, runnable));
        return e;
    }

    @Override
    public void a0() {
        o4 o4Var = (o4) this.f15725a;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            li.a aVar = o4Var.f17652a;
            v3.U1(((r3) m4Var).f17442a);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        q6.a aVar = (q6.a) ((q6.c) obj).u();
        Parcel H0 = aVar.H0();
        l7.a.c(H0, (o6.o) this.f15725a);
        try {
            aVar.f343b.transact(1, H0, null, 1);
            H0.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            H0.recycle();
            throw th2;
        }
    }

    @Override
    public void b(li.g1 g1Var) {
        m4 m4Var = ((o4) this.f15725a).G;
        if (m4Var != null) {
            v3 v3Var = ((r3) m4Var).f17442a;
            v3.S1(v3Var, g1Var);
            v3Var.f17556p3.s(g1Var, true);
        }
    }

    public boolean b0(int i10) {
        n91 n91Var = ((v91) this.f15725a).L;
        if (n91Var == null) {
            return false;
        }
        return n91Var.c(i10);
    }

    @Override
    public void c(float f7) {
        li.y yVar = (li.y) this.f15725a;
        MessageObject messageObject = yVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(yVar.P, f7);
    }

    public s0.d c0(int i10) {
        return null;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15725a;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                f4.e((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public void d(long j10, int i10, int i11, int i12) {
        ((MediaCodec) this.f15725a).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    public s0.d d0(int i10) {
        return null;
    }

    @Override
    public void e(int i10, h2.d dVar, long j10, int i11) {
        ((MediaCodec) this.f15725a).queueSecureInputBuffer(i10, 0, dVar.f12565i, j10, i11);
    }

    public void e0(float f7) {
        v91 v91Var = (v91) this.f15725a;
        View[] viewArr = v91Var.e;
        if (f7 == 1.0f) {
            if (viewArr[1] != null) {
                v91Var.G();
                v91Var.h.put(v91Var.f33634f[1], viewArr[1]);
                v91Var.removeView(viewArr[1]);
                v91Var.F(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            v91Var.A(v91Var.f33632b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (v91Var.f33640y) {
            v91Var.F(view, (1.0f - f7) * viewArr[0].getMeasuredWidth());
            View view2 = viewArr[0];
            v91Var.F(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            v91Var.F(view, (1.0f - f7) * (-viewArr[0].getMeasuredWidth()));
            View view3 = viewArr[0];
            v91Var.F(view3, view3.getMeasuredWidth() * f7);
        }
        v91Var.x(false);
    }

    @Override
    public void f(float f7) {
        MessageObject messageObject = ((li.y) this.f15725a).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    public void f0() {
        o2.q[] qVarArr;
        o2.q[] qVarArr2;
        o2.k kVar = (o2.k) this.f15725a;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (o2.q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.f49450a;
        }
        b2.q1[] q1VarArr = new b2.q1[i11];
        int i12 = 0;
        for (o2.q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.f49450a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                q1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new u2.r1(q1VarArr);
        kVar.G.n(kVar);
    }

    @Override
    public void g(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).f16697z.k().c(false);
        }
        l.w wVar = ((m.h) this.f15725a).e;
        if (wVar != null) {
            wVar.g(kVar, z10);
        }
    }

    public boolean g0(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: jg.i.g0(android.view.MotionEvent):boolean");
    }

    @Override
    public float get() {
        sg.w0 w0Var = (sg.w0) this.f15725a;
        int i10 = w0Var.f48578a;
        rg.m currentBrush = w0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return rg.s0.e(i10).f47583i;
        }
        return rg.s0.e(i10).f("-1", currentBrush.d());
    }

    @Override
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override
    public void h() {
        o4 o4Var = (o4) this.f15725a;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            v3.V1(((r3) m4Var).f17442a, o4Var.f17652a);
        }
    }

    public boolean h0(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void i0(s4.e1 e1Var, b2.v0 v0Var, b2.v0 v0Var2) {
        int i10;
        int i11;
        boolean z10;
        s4.e1 T;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f15725a;
        recyclerView.f3056b.k(e1Var);
        recyclerView.h(e1Var);
        e1Var.q(false);
        s4.g1 g1Var = (s4.g1) recyclerView.f3059c0;
        g1Var.getClass();
        int i13 = v0Var.f3511a;
        int i14 = v0Var.f3512b;
        View view = e1Var.f47773a;
        if (v0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = v0Var2.f3511a;
        }
        int i15 = i10;
        if (v0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = v0Var2.f3512b;
        }
        int i16 = i11;
        if (!e1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = g1Var.r(e1Var, v0Var, i13, i14, i15, i16);
        } else {
            int i17 = e1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i12 = T.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            e1Var.f47778i = (e1Var.h - i18) + (i18 * 1000);
            g1Var.s(e1Var, v0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    @Override
    public boolean j() {
        return false;
    }

    public void j0(s4.e1 e1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f15725a;
        s4.p0 p0Var = recyclerView.f3084x;
        View view = e1Var.f47773a;
        rf.e eVar = recyclerView.f3056b;
        s4.d dVar = p0Var.f47853a;
        s0 s0Var = (s0) dVar.f47755b;
        int indexOfChild = ((RecyclerView) s0Var.f15827b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((lg) dVar.f47756c).D(indexOfChild)) {
                dVar.u(view);
            }
            s0Var.h0(indexOfChild);
        }
        eVar.g(view);
    }

    @Override
    public boolean k(float f7) {
        return false;
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public void l0(y2.i iVar, long j10, long j11, boolean z10) {
        ((l2.g) this.f15725a).x((y2.o) iVar, j10, j11);
    }

    @Override
    public int m(View view) {
        return s4.p0.x(view) - ((ViewGroup.MarginLayoutParams) ((s4.q0) view.getLayoutParams())).leftMargin;
    }

    public void m0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15725a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long o02 = o0();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + o02);
    }

    public void n0(long j10) {
        long o02 = o0();
        if (o02 != j10) {
            if (o02 != -1) {
                if (o02 == -2) {
                    o02 = -2;
                } else {
                    return;
                }
            }
            StringBuilder t10 = a1.g.t(j10, "expected non-string scope or scope ", " but found ");
            t10.append(o02);
            throw new IOException(t10.toString());
        }
    }

    @Override
    public void o(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        rg0.e((rg0) this.f15725a, false, fbVar, dbVar, gbVar);
    }

    public long o0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15725a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        hl0 hl0Var = (hl0) this.f15725a;
        if (z10 && hl0Var.f29017n.n() >= 0) {
            hl0Var.f29020w = true;
        }
        eh0 eh0Var = hl0Var.f29016f;
        xa0 xa0Var = hl0Var.f29021x;
        eh0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(xa0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(xa0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void p(Object obj) {
        ((h8.c) obj).onLocationAvailability((LocationAvailability) this.f15725a);
    }

    @Override
    public void q(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f15725a).f16700f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public void r(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.f15725a;
        m.h hVar = toolbar.f2240a.J;
        if (hVar != null && hVar.h()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.W.f16406c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.a0) it.next()).f2604a.t();
        }
    }

    @Override
    public int s() {
        return ((s4.p0) this.f15725a).D();
    }

    @Override
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f15725a).setParameters(bundle);
    }

    @Override
    public boolean t(l.k kVar) {
        m.h hVar = (m.h) this.f15725a;
        if (kVar == hVar.f17727c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        l.w wVar = hVar.e;
        if (wVar == null) {
            return false;
        }
        return wVar.t(kVar);
    }

    @Override
    public void u(u2.f1 f1Var) {
        o2.q qVar = (o2.q) f1Var;
        o2.k kVar = (o2.k) this.f15725a;
        kVar.G.u(kVar);
    }

    @Override
    public void v() {
        ((bw0) this.f15725a).I.a(-1);
    }

    @Override
    public k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.f15725a;
        long j12 = oVar.f52025a;
        g2.m mVar = oVar.f52026b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        int i11 = oVar.f52027c;
        gVar.f16812m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f12247a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            dVar = y2.l.f52021f;
        } else {
            dVar = new k4.d(0, min, false);
        }
        gVar.f16816q.s(uVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override
    public org.telegram.ui.ActionBar.g1 x(String str) {
        y5 y5Var = ((bw0) this.f15725a).I;
        return y5Var.d(0, 0, null, str, true, true, y5Var.m0);
    }

    @Override
    public boolean x0() {
        return false;
    }

    @Override
    public void z(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.f15725a;
        if (i10 == 0) {
            long j12 = oVar.f52025a;
            uVar = new u2.u(oVar.f52026b, j10);
        } else {
            long j13 = oVar.f52025a;
            g2.m mVar = oVar.f52026b;
            g2.b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        }
        gVar.f16816q.u(uVar, oVar.f52027c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    public i(y6.a aVar) {
        o6.l.h(aVar);
        this.f15725a = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public i(int i10) {
        switch (i10) {
            case 13:
                this.f15725a = new ArrayDeque(16);
                return;
            case 25:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f15725a = new yh0(this);
                    return;
                } else {
                    this.f15725a = new yh0(this);
                    return;
                }
            default:
                this.f15725a = f9.i0.t();
                return;
        }
    }

    public i(Context context, Uri uri) {
        this.f15725a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public i(Context context, w20 w20Var) {
        this.f15725a = new v20(context, w20Var);
    }

    @Override
    public void H() {
    }

    @Override
    public void N() {
    }

    @Override
    public void R() {
    }

    @Override
    public void a() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void l() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }

    @Override
    public void y() {
    }

    @Override
    public void T(Object obj) {
    }

    @Override
    public void Y(TLRPC.User user) {
    }

    @Override
    public void i(boolean z10) {
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
    public void onError(t81 t81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
