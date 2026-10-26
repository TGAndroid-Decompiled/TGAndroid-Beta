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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.v20;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.Components.yl;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ni0;
import org.telegram.ui.wa1;
public class i implements ri, m.e2, y2.g, hp0, e5, li.i0, l.w, l.i, o0.a, u2.e1, kp0, oe.f, tb, p81, yu0, s91, com.google.android.gms.common.api.internal.r, r2.m, s4.j1, com.google.android.gms.common.api.internal.o, sg.x1 {
    public final Object f15726a;

    public i(Object obj) {
        this.f15726a = obj;
    }

    @Override
    public void A(gh ghVar) {
        NotificationCenter.getInstance(n.b0((n) this.f15726a)).doOnIdle(ghVar);
    }

    @Override
    public void B(y2.i iVar, long j10, long j11) {
        int size;
        long j12;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.f15726a;
        long j13 = oVar.f51967a;
        g2.m mVar = oVar.f51968b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f12231c, b0Var.d, j10, j11, b0Var.f12230b);
        gVar.f16813m.getClass();
        gVar.f16817q.q(uVar, oVar.f51969c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f51970f;
        m2.c cVar2 = gVar.G;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f17944m.size();
        }
        long j14 = cVar.b(0).f17961b;
        int i10 = 0;
        while (i10 < size && gVar.G.b(i10).f17961b < j14) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.f17944m.size()) {
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
            if (i11 < gVar.f16813m.B0(oVar.f51969c)) {
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
        synchronized (gVar.f16820t) {
            try {
                if (oVar.f51968b.f12258a.equals(gVar.E)) {
                    Uri uri = gVar.G.f17942k;
                    if (uri == null) {
                        uri = w7.h0.a(oVar.d.f12231c);
                    }
                    gVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = gVar.G;
        if (cVar3.d && gVar.K == j12) {
            m2.t tVar = cVar3.f17940i;
            if (tVar != null) {
                String str = tVar.f17989b;
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
                    gVar.K = e2.n0.V(tVar.f17990c) - gVar.J;
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
        m4 m4Var = ((o4) this.f15726a).G;
        if (m4Var != null) {
            return ((r3) m4Var).f17443a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public Cursor D(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15726a;
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
        ((Toolbar) this.f15726a).getClass();
        return false;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        li.b2 b2Var = (li.b2) this.f15726a;
        b2Var.t0(i10, i11, z10);
        ni0 ni0Var = b2Var.O0;
        if (ni0Var != null) {
            ni0Var.h();
            b2Var.O0 = null;
        }
    }

    @Override
    public void I(CharSequence charSequence) {
        m4 m4Var = ((o4) this.f15726a).G;
        if (m4Var != null) {
            r3 r3Var = (r3) m4Var;
            r3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                r3Var.f17443a.z4(charSequence.toString());
            }
        }
    }

    @Override
    public int J() {
        s4.p0 p0Var = (s4.p0) this.f15726a;
        return p0Var.f47827m - p0Var.E();
    }

    @Override
    public r9 K() {
        return (o4) this.f15726a;
    }

    @Override
    public li.a L() {
        return ((o4) this.f15726a).f17653a;
    }

    @Override
    public boolean M() {
        o4 o4Var = (o4) this.f15726a;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            li.a aVar = o4Var.f17653a;
            if (((r3) m4Var).f17443a.Y4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void O(int i10, int i11) {
        o4 o4Var = (o4) this.f15726a;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            li.a aVar = o4Var.f17653a;
            li.f2 f2Var = ((r3) m4Var).f17443a.R3;
            if (f2Var != null) {
                f2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void P() {
        ((o9) this.f15726a).f31228a.invalidate();
    }

    @Override
    public void Q(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f15726a;
        Handler handler = eVar.f16701f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f16702n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((l.d) arrayList.get(i10)).f16696b) {
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
        qg0.e((qg0) this.f15726a, true, fbVar, pgVar, ylVar);
    }

    @Override
    public void S() {
        o4 o4Var = (o4) this.f15726a;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            li.a aVar = o4Var.f17653a;
            v3 v3Var = ((r3) m4Var).f17443a;
            li.f2 f2Var = v3Var.R3;
            if (f2Var != null) {
                f2Var.g();
            }
            v3Var.f17557p3.onContentChanged();
        }
    }

    @Override
    public void U(float f7, boolean z10) {
        wa1 wa1Var = (wa1) ((org.telegram.ui.Cells.j0) this.f15726a);
        int i10 = (int) (y6.f23591q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        y6.f23591q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = wa1Var.f45059f.e;
            vl0 vl0Var = (vl0) themeActivity.f36265b.K(themeActivity.f36272f0);
            if (vl0Var != null) {
                ((i9) vl0Var.f47738a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (y6.f23591q * 100.0f))));
            }
            y6.E(true);
        }
    }

    @Override
    public void V(float f7) {
        sg.x0 x0Var = (sg.x0) this.f15726a;
        rg.s0.e(x0Var.f48553a).k("-1", f7);
        x0Var.e.setBrushSize(f7);
    }

    @Override
    public View W(int i10) {
        return ((s4.p0) this.f15726a).q(i10);
    }

    @Override
    public int X(View view) {
        return s4.p0.y(view) + ((ViewGroup.MarginLayoutParams) ((s4.q0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public org.telegram.ui.ActionBar.g1 Z(int i10, Runnable runnable, String str, boolean z10, boolean z11) {
        aw0 aw0Var = (aw0) this.f15726a;
        org.telegram.ui.ActionBar.g1 e = aw0Var.I.e(0, i10, str);
        if (z10) {
            int i11 = y6.f23581p7;
            e.d(aw0Var.p0(i11), aw0Var.p0(i11));
        }
        e.setOnClickListener(new pc0(this, z11, runnable));
        return e;
    }

    @Override
    public void a0() {
        o4 o4Var = (o4) this.f15726a;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            li.a aVar = o4Var.f17653a;
            v3.U1(((r3) m4Var).f17443a);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        q6.a aVar = (q6.a) ((q6.c) obj).u();
        Parcel H0 = aVar.H0();
        l7.a.c(H0, (o6.o) this.f15726a);
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
        m4 m4Var = ((o4) this.f15726a).G;
        if (m4Var != null) {
            v3 v3Var = ((r3) m4Var).f17443a;
            v3.S1(v3Var, g1Var);
            v3Var.f17557p3.s(g1Var, true);
        }
    }

    public boolean b0(int i10) {
        m91 m91Var = ((u91) this.f15726a).L;
        if (m91Var == null) {
            return false;
        }
        return m91Var.c(i10);
    }

    @Override
    public void c(float f7) {
        li.y yVar = (li.y) this.f15726a;
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
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15726a;
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
        ((MediaCodec) this.f15726a).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    public s0.d d0(int i10) {
        return null;
    }

    @Override
    public void e(int i10, h2.d dVar, long j10, int i11) {
        ((MediaCodec) this.f15726a).queueSecureInputBuffer(i10, 0, dVar.f12566i, j10, i11);
    }

    public void e0(float f7) {
        u91 u91Var = (u91) this.f15726a;
        View[] viewArr = u91Var.e;
        if (f7 == 1.0f) {
            if (viewArr[1] != null) {
                u91Var.G();
                u91Var.h.put(u91Var.f33319f[1], viewArr[1]);
                u91Var.removeView(viewArr[1]);
                u91Var.F(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            u91Var.A(u91Var.f33317b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (u91Var.f33325y) {
            u91Var.F(view, (1.0f - f7) * viewArr[0].getMeasuredWidth());
            View view2 = viewArr[0];
            u91Var.F(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            u91Var.F(view, (1.0f - f7) * (-viewArr[0].getMeasuredWidth()));
            View view3 = viewArr[0];
            u91Var.F(view3, view3.getMeasuredWidth() * f7);
        }
        u91Var.x(false);
    }

    @Override
    public void f(float f7) {
        MessageObject messageObject = ((li.y) this.f15726a).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    public void f0() {
        o2.q[] qVarArr;
        o2.q[] qVarArr2;
        o2.k kVar = (o2.k) this.f15726a;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (o2.q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.f49415a;
        }
        b2.q1[] q1VarArr = new b2.q1[i11];
        int i12 = 0;
        for (o2.q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.f49415a;
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
            ((l.d0) kVar).f16698z.k().c(false);
        }
        l.w wVar = ((m.h) this.f15726a).e;
        if (wVar != null) {
            wVar.g(kVar, z10);
        }
    }

    public boolean g0(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: jg.i.g0(android.view.MotionEvent):boolean");
    }

    @Override
    public float get() {
        sg.x0 x0Var = (sg.x0) this.f15726a;
        int i10 = x0Var.f48553a;
        rg.m currentBrush = x0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return rg.s0.e(i10).f47548i;
        }
        return rg.s0.e(i10).f("-1", currentBrush.d());
    }

    @Override
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override
    public void h() {
        o4 o4Var = (o4) this.f15726a;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            v3.V1(((r3) m4Var).f17443a, o4Var.f17653a);
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
        RecyclerView recyclerView = (RecyclerView) this.f15726a;
        recyclerView.f3056b.k(e1Var);
        recyclerView.h(e1Var);
        e1Var.q(false);
        s4.g1 g1Var = (s4.g1) recyclerView.f3059c0;
        g1Var.getClass();
        int i13 = v0Var.f3511a;
        int i14 = v0Var.f3512b;
        View view = e1Var.f47738a;
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
            e1Var.f47743i = (e1Var.h - i18) + (i18 * 1000);
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
        RecyclerView recyclerView = (RecyclerView) this.f15726a;
        s4.p0 p0Var = recyclerView.f3084x;
        View view = e1Var.f47738a;
        rf.e eVar = recyclerView.f3056b;
        s4.d dVar = p0Var.f47818a;
        s0 s0Var = (s0) dVar.f47720b;
        int indexOfChild = ((RecyclerView) s0Var.f15828b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((lg) dVar.f47721c).B(indexOfChild)) {
                dVar.t(view);
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
        ((l2.g) this.f15726a).x((y2.o) iVar, j10, j11);
    }

    @Override
    public int m(View view) {
        return s4.p0.x(view) - ((ViewGroup.MarginLayoutParams) ((s4.q0) view.getLayoutParams())).leftMargin;
    }

    public void m0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15726a;
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
        qg0.e((qg0) this.f15726a, false, fbVar, dbVar, gbVar);
    }

    public long o0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15726a;
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
        gl0 gl0Var = (gl0) this.f15726a;
        if (z10 && gl0Var.f28594n.n() >= 0) {
            gl0Var.f28597w = true;
        }
        dh0 dh0Var = gl0Var.f28593f;
        wa0 wa0Var = gl0Var.f28598x;
        dh0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(wa0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(wa0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void p(Object obj) {
        ((h8.c) obj).onLocationAvailability((LocationAvailability) this.f15726a);
    }

    @Override
    public void q(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f15726a).f16701f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public void r(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.f15726a;
        m.h hVar = toolbar.f2240a.J;
        if (hVar != null && hVar.h()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.W.f16407c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.a0) it.next()).f2604a.t();
        }
    }

    @Override
    public int s() {
        return ((s4.p0) this.f15726a).D();
    }

    @Override
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f15726a).setParameters(bundle);
    }

    @Override
    public boolean t(l.k kVar) {
        m.h hVar = (m.h) this.f15726a;
        if (kVar == hVar.f17728c) {
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
        o2.k kVar = (o2.k) this.f15726a;
        kVar.G.u(kVar);
    }

    @Override
    public void v() {
        ((aw0) this.f15726a).I.a(-1);
    }

    @Override
    public k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.f15726a;
        long j12 = oVar.f51967a;
        g2.m mVar = oVar.f51968b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f12231c, b0Var.d, j10, j11, b0Var.f12230b);
        int i11 = oVar.f51969c;
        gVar.f16813m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f12248a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            dVar = y2.l.f51963f;
        } else {
            dVar = new k4.d(0, min, false);
        }
        gVar.f16817q.s(uVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override
    public org.telegram.ui.ActionBar.g1 x(String str) {
        y5 y5Var = ((aw0) this.f15726a).I;
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
        l2.g gVar = (l2.g) this.f15726a;
        if (i10 == 0) {
            long j12 = oVar.f51967a;
            uVar = new u2.u(oVar.f51968b, j10);
        } else {
            long j13 = oVar.f51967a;
            g2.m mVar = oVar.f51968b;
            g2.b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f12231c, b0Var.d, j10, j11, b0Var.f12230b);
        }
        gVar.f16817q.u(uVar, oVar.f51969c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    public i(y6.a aVar) {
        o6.l.h(aVar);
        this.f15726a = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public i(int i10) {
        switch (i10) {
            case 13:
                this.f15726a = new ArrayDeque(16);
                return;
            case 25:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f15726a = new xh0(this);
                    return;
                } else {
                    this.f15726a = new xh0(this);
                    return;
                }
            default:
                this.f15726a = f9.i0.t();
                return;
        }
    }

    public i(Context context, Uri uri) {
        this.f15726a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public i(Context context, w20 w20Var) {
        this.f15726a = new v20(context, w20Var);
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
    public void onError(s81 s81Var, Exception exc) {
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
