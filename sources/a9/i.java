package a9;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.u;
import androidx.biometric.y;
import androidx.fragment.app.b0;
import androidx.fragment.app.f0;
import androidx.fragment.app.k0;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.upstream.e0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.p0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.cast.x4;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.g0;
import f2.t1;
import f2.x0;
import f2.y0;
import g7.g5;
import j4.d1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import jh.e9;
import jh.f9;
import jh.g4;
import jh.l3;
import lh.m6;
import lh.q6;
import m.f2;
import m.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
import org.telegram.ui.oy0;
import r0.j0;
import r0.m1;

public final class i implements a0, androidx.activity.result.b, com.google.android.gms.common.api.internal.o, v0, y2.b, t1, r0.o, s, OnCompleteListener, d1, e9, f2, x90, j61, l.j, l0 {

    public final int f180a;

    public Object f181b;

    public i(int i10, boolean z10) {
        this.f180a = i10;
    }

    public static com.google.android.gms.common.api.internal.p N(Looper looper, Object obj, String str) {
        y5.l.i(obj, "Listener must not be null");
        y5.l.i(looper, "Looper must not be null");
        return new com.google.android.gms.common.api.internal.p(looper, obj, str);
    }

    @Override
    public View A(int i10) {
        return ((x0) this.f181b).q(i10);
    }

    @Override
    public void C(v5.a aVar) {
        x xVar = (x) this.f181b;
        xVar.f3374o.lock();
        try {
            xVar.f3371l = aVar;
            x.l(xVar);
        } finally {
            xVar.f3374o.unlock();
        }
    }

    @Override
    public long D() {
        long jMin = Long.MAX_VALUE;
        for (d1 d1Var : (d1[]) this.f181b) {
            long jD = d1Var.D();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override
    public int G(View view) {
        return x0.v(view) + ((ViewGroup.MarginLayoutParams) ((y0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public void H(int i10, int i11, CharSequence charSequence, boolean z10) {
        lh.g gVar = ((lh.m) this.f181b).f16338f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i10 + charSequence.length());
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public void I(long j10) {
        for (d1 d1Var : (d1[]) this.f181b) {
            d1Var.I(j10);
        }
    }

    @Override
    public m1 I0(View view, m1 m1Var) {
        boolean z10;
        boolean z11;
        int iD = m1Var.d();
        g.r rVar = (g.r) this.f181b;
        Context context = rVar.f6296e;
        int iD2 = m1Var.d();
        ActionBarContextView actionBarContextView = rVar.f6311y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rVar.f6311y.getLayoutParams();
            boolean z12 = true;
            if (rVar.f6311y.isShown()) {
                if (rVar.f6301h0 == null) {
                    rVar.f6301h0 = new Rect();
                    rVar.f6302i0 = new Rect();
                }
                Rect rect = rVar.f6301h0;
                Rect rect2 = rVar.f6302i0;
                rect.set(m1Var.b(), m1Var.d(), m1Var.c(), m1Var.a());
                ViewGroup viewGroup = rVar.F;
                Method method = w3.f17498a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e9) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e9);
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                m1 m1VarF = j0.f(rVar.F);
                int iB = m1VarF == null ? 0 : m1VarF.b();
                int iC = m1VarF == null ? 0 : m1VarF.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || rVar.H != null) {
                    View view2 = rVar.H;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            rVar.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    rVar.H = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    rVar.F.addView(rVar.H, -1, layoutParams);
                }
                View view4 = rVar.H;
                z12 = view4 != null;
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = rVar.H;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? f0.e.c(context, 2131099654) : f0.e.c(context, 2131099653));
                }
                if (!rVar.M && z12) {
                    iD2 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                rVar.f6311y.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = rVar.H;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return j0.h(view, iD != iD2 ? m1Var.f(m1Var.b(), iD2, m1Var.c(), m1Var.a()) : m1Var);
    }

    @Override
    public void J(Object obj) {
        switch (this.f180a) {
            case 2:
                androidx.biometric.p pVar = (androidx.biometric.p) this.f181b;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(2131701349));
                    }
                    y yVar = pVar.f1062h0;
                    if (yVar.f1080n) {
                        Executor nVar = yVar.d;
                        if (nVar == null) {
                            nVar = new androidx.biometric.n(1);
                        }
                        nVar.execute(new androidx.biometric.g(pVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    y yVar2 = pVar.f1062h0;
                    if (yVar2.f1087u == null) {
                        yVar2.f1087u = new z();
                    }
                    y.h(yVar2.f1087u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                t tVar = (t) obj;
                androidx.fragment.app.p pVar2 = (androidx.fragment.app.p) this.f181b;
                if (tVar == null || !pVar2.f1505n0) {
                    return;
                }
                pVar2.getClass();
                throw new IllegalStateException("Fragment " + pVar2 + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    public void L(u5.k kVar, u uVar) {
        k0 k0Var = (k0) this.f181b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        k0 k0Var2 = (k0) this.f181b;
        androidx.biometric.p pVar = (androidx.biometric.p) k0Var2.D("androidx.biometric.BiometricFragment");
        if (pVar == null) {
            pVar = new androidx.biometric.p();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
            aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            k0Var2.A(true);
            k0Var2.E();
        }
        v vVarK = pVar.k();
        if (vVarK == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        y yVar = pVar.f1062h0;
        yVar.f1073f = kVar;
        int i10 = kVar.f48421a;
        if (i10 == 0) {
            i10 = uVar != null ? 15 : 255;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23 || i11 >= 30 || i10 != 15 || uVar != null) {
            yVar.f1074g = uVar;
        } else {
            yVar.f1074g = g7.m.a();
        }
        if (pVar.Q()) {
            pVar.f1062h0.f1077k = pVar.q(2131701339);
        } else {
            pVar.f1062h0.f1077k = null;
        }
        if (pVar.Q() && new a5.n(new androidx.biometric.s(vVarK, 0)).g(255) != 0) {
            pVar.f1062h0.f1080n = true;
            pVar.S();
        } else if (pVar.f1062h0.f1082p) {
            pVar.f1061g0.postDelayed(new androidx.biometric.o(pVar), 600L);
        } else {
            pVar.X();
        }
    }

    public c2.u M() {
        if (((ArrayList) this.f181b) == null) {
            return c2.u.f2348c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", (ArrayList) this.f181b);
        return new c2.u(bundle, (ArrayList) this.f181b);
    }

    public void O(c2.q qVar, c2.n nVar, Collection collection) {
        c2.e eVar = (c2.e) this.f181b;
        if (qVar != eVar.f2272y || nVar == null) {
            if (qVar == eVar.f2254e) {
                if (nVar != null) {
                    eVar.n(eVar.d, nVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        c2.y yVar = eVar.f2271x.f2390a;
        String strD = nVar.d();
        c2.z zVar = new c2.z(yVar, strD, eVar.b(yVar, strD), false);
        zVar.i(nVar);
        if (eVar.d == zVar) {
            return;
        }
        eVar.h(eVar, zVar, eVar.f2272y, 3, eVar.f2271x, collection);
        eVar.f2271x = null;
        eVar.f2272y = null;
    }

    public void P(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f181b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override
    public void a(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f181b;
        f0 f0Var = (f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = f0Var.f1433a;
        int i10 = f0Var.f1434b;
        androidx.fragment.app.s sVarQ = j0Var.f1447c.q(str);
        if (sVarQ != null) {
            sVarQ.x(i10, aVar.f906a, aVar.f907b);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f180a) {
            case 17:
                g8.e eVar = (g8.e) this.f181b;
                p7.b bVar = (p7.b) obj;
                bVar.getClass();
                p7.a aVar = new p7.a(1, (TaskCompletionSource) obj2);
                try {
                    p7.i iVar = (p7.i) bVar.u();
                    Bundle bundleG = bVar.G();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = p7.c.f45510a;
                    parcelObtain.writeInt(1);
                    eVar.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeInt(1);
                    bundleG.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(aVar);
                    try {
                        iVar.f45518a.transact(14, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e9) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e9);
                    Bundle bundle = Bundle.EMPTY;
                    g5.a(Status.h, Boolean.FALSE, aVar.f45509b);
                    return;
                }
            default:
                w7.a aVar2 = (w7.a) this.f181b;
                l7.d dVar = new l7.d(0, (TaskCompletionSource) obj2);
                l7.c cVar = (l7.c) ((l7.f) obj).u();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i11 = l7.a.f15444a;
                parcelObtain2.writeStrongBinder(dVar);
                parcelObtain2.writeInt(1);
                aVar2.writeToParcel(parcelObtain2, 0);
                cVar.E0(parcelObtain2, 2);
                return;
        }
    }

    @Override
    public boolean b() {
        for (d1 d1Var : (d1[]) this.f181b) {
            if (d1Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void d(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        m4.g gVar = (m4.g) this.f181b;
        long j12 = t0Var.f3043a;
        Uri uri = t0Var.d.f3090c;
        j4.p pVar = new j4.p();
        gVar.f17680n.getClass();
        gVar.f17683q.d(pVar, t0Var.f3045c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public int f(View view) {
        return x0.z(view) - ((ViewGroup.MarginLayoutParams) ((y0) view.getLayoutParams())).topMargin;
    }

    @Override
    public long g() {
        long jMin = Long.MAX_VALUE;
        for (d1 d1Var : (d1[]) this.f181b) {
            long jG = d1Var.g();
            if (jG != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jG);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override
    public void g1(long j10, int i10, l3 l3Var) {
        oy0 oy0Var = (oy0) this.f181b;
        int i11 = ProfileStoriesView.f36200o0;
        oy0Var.f(true, false);
        l3Var.run();
    }

    @Override
    public Object mo28get() {
        return new d3.j((Context) ((oc.a) this.f181b).mo28get(), "com.google.android.datatransport.events", Integer.valueOf(d3.j.d).intValue());
    }

    @Override
    public com.google.android.exoplayer2.upstream.k0 h(n0 n0Var, IOException iOException, int i10) {
        long jMin;
        t0 t0Var = (t0) n0Var;
        m4.g gVar = (m4.g) this.f181b;
        long j10 = t0Var.f3043a;
        Uri uri = t0Var.d.f3090c;
        j4.p pVar = new j4.p();
        int i11 = t0Var.f3045c;
        gVar.f17680n.getClass();
        if (!(iOException instanceof h3.t1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof e0) && !(iOException instanceof p0)) {
            int i12 = com.google.android.exoplayer2.upstream.n.f3009b;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i10 - 1) * 1000, 5000);
                    break;
                }
                if ((cause instanceof com.google.android.exoplayer2.upstream.n) && ((com.google.android.exoplayer2.upstream.n) cause).f3010a == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        com.google.android.exoplayer2.upstream.k0 k0Var = jMin == -9223372036854775807L ? q0.f3029f : new com.google.android.exoplayer2.upstream.k0(0, jMin, false);
        gVar.f17683q.i(pVar, i11, iOException, !k0Var.a());
        return k0Var;
    }

    @Override
    public void i(Object obj) {
        ((r7.c) obj).onLocationAvailability((LocationAvailability) this.f181b);
    }

    @Override
    public void j(l.l lVar, MenuItem menuItem) {
        ((l.f) this.f181b).f15290f.removeCallbacksAndMessages(lVar);
    }

    @Override
    public void k(l.l lVar) {
        k5.i iVar = ((ActionMenuView) this.f181b).G;
        if (iVar != null) {
            iVar.k(lVar);
        }
    }

    @Override
    public void l(n0 n0Var, long j10, long j11) {
        t0 t0Var = (t0) n0Var;
        m4.g gVar = (m4.g) this.f181b;
        long j12 = t0Var.f3043a;
        Uri uri = t0Var.d.f3090c;
        j4.p pVar = new j4.p();
        gVar.f17680n.getClass();
        gVar.f17683q.f(pVar, t0Var.f3045c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        n4.c cVar = (n4.c) t0Var.f3047f;
        n4.c cVar2 = gVar.H;
        int size = cVar2 == null ? 0 : cVar2.f18227m.size();
        long j13 = cVar.b(0).f18245b;
        int i10 = 0;
        while (i10 < size && gVar.H.b(i10).f18245b < j13) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.f18227m.size()) {
                d5.a.K("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = gVar.N;
                if (j14 == -9223372036854775807L || cVar.h * 1000 > j14) {
                    gVar.M = 0;
                } else {
                    d5.a.K("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.N);
                }
            }
            int i11 = gVar.M;
            gVar.M = i11 + 1;
            if (i11 < gVar.f17680n.z3(t0Var.f3045c)) {
                gVar.D.postDelayed(gVar.v, Math.min((gVar.M - 1) * 1000, 5000));
                return;
            } else {
                gVar.C = new x4();
                return;
            }
        }
        gVar.H = cVar;
        gVar.I = cVar.d & gVar.I;
        gVar.J = j10 - j11;
        gVar.K = j10;
        synchronized (gVar.f17686t) {
            try {
                if (t0Var.f3044b.f3022a == gVar.F) {
                    Uri uri2 = gVar.H.f18225k;
                    if (uri2 == null) {
                        uri2 = t0Var.d.f3090c;
                    }
                    gVar.F = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (size != 0) {
            gVar.O += i10;
            gVar.u(true);
            return;
        }
        n4.c cVar3 = gVar.H;
        if (!cVar3.d) {
            gVar.u(true);
            return;
        }
        c9.b bVar = cVar3.f18223i;
        if (bVar == null) {
            gVar.t();
            return;
        }
        String str = bVar.f2566b;
        if (g0.a(str, "urn:mpeg:dash:utc:direct:2014") || g0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                gVar.L = g0.K(bVar.f2567c) - gVar.K;
                gVar.u(true);
                return;
            } catch (h3.t1 e9) {
                d5.a.p("DashMediaSource", "Failed to resolve time offset.", e9);
                gVar.u(true);
                return;
            }
        }
        if (g0.a(str, "urn:mpeg:dash:utc:http-iso:2014") || g0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            t0 t0Var2 = new t0(gVar.f17691z, Uri.parse(bVar.f2567c), 5, new m4.f());
            gVar.A.f(t0Var2, new m4.d(gVar), 1);
            gVar.f17683q.k(new j4.p(t0Var2.f3044b), t0Var2.f3045c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (g0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || g0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            t0 t0Var3 = new t0(gVar.f17691z, Uri.parse(bVar.f2567c), 5, new za.b(14));
            gVar.A.f(t0Var3, new m4.d(gVar), 1);
            gVar.f17683q.k(new j4.p(t0Var3.f3044b), t0Var3.f3045c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (g0.a(str, "urn:mpeg:dash:utc:ntp:2014") || g0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            gVar.t();
        } else {
            d5.a.p("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
            gVar.u(true);
        }
    }

    @Override
    public int n() {
        return ((x0) this.f181b).G();
    }

    @Override
    public void onComplete(Task task) {
        j8.e0 e0Var = (j8.e0) this.f181b;
        if (task.isSuccessful()) {
            i8.m.K0(e0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            i8.m.K0(e0Var, false, null);
        }
    }

    @Override
    public void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        q6 q6Var = (q6) this.f181b;
        m6 m6Var = q6Var.H;
        AndroidUtilities.cancelRunOnUIThread(m6Var);
        m61 m61Var = q6Var.f16590y;
        if (m61Var == null || !m61Var.z()) {
            return;
        }
        AndroidUtilities.runOnUIThread(m6Var);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((q6) this.f181b).i();
    }

    @Override
    public boolean q(long j10) {
        boolean zQ;
        boolean z10 = false;
        do {
            long jG = g();
            if (jG == Long.MIN_VALUE) {
                return z10;
            }
            zQ = false;
            for (d1 d1Var : (d1[]) this.f181b) {
                long jG2 = d1Var.g();
                boolean z11 = jG2 != Long.MIN_VALUE && jG2 <= j10;
                if (jG2 == jG || z11) {
                    zQ |= d1Var.q(j10);
                }
            }
            z10 |= zQ;
        } while (zQ);
        return z10;
    }

    @Override
    public void r(int i10) {
        v5.a aVar;
        x xVar = (x) this.f181b;
        Lock lock = xVar.f3374o;
        lock.lock();
        try {
            if (xVar.f3373n || (aVar = xVar.f3372m) == null || !aVar.c()) {
                xVar.f3373n = false;
                x.k(xVar, i10);
            } else {
                xVar.f3373n = true;
                xVar.f3366e.onConnectionSuspended(i10);
            }
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void s(Bundle bundle) {
        x xVar = (x) this.f181b;
        xVar.f3374o.lock();
        try {
            Bundle bundle2 = xVar.f3370k;
            if (bundle2 == null) {
                xVar.f3370k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.f3371l = v5.a.f48783e;
            x.l(xVar);
        } finally {
            xVar.f3374o.unlock();
        }
    }

    @Override
    public boolean t(l.l lVar, MenuItem menuItem) {
        m.l lVar2 = ((ActionMenuView) this.f181b).L;
        if (lVar2 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((ga.c) lVar2).f6834b).S.d).iterator();
        while (it.hasNext()) {
            if (((b0) it.next()).f1420a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Paint.FontMetricsInt u() {
        return ((lh.m) this.f181b).f16338f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public int v() {
        x0 x0Var = (x0) this.f181b;
        return x0Var.f5863n - x0Var.C();
    }

    @Override
    public void y(l.l lVar, l.n nVar) {
        l.f fVar = (l.f) this.f181b;
        Handler handler = fVar.f15290f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f15291n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (lVar == ((l.e) arrayList.get(i10)).f15284b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new bf.e(this, i11 < arrayList.size() ? (l.e) arrayList.get(i11) : null, nVar, lVar, 7), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public boolean y0(long j10, int i10, int i11, int i12, f9 f9Var) {
        ImageReceiver imageReceiver;
        g4 g4Var;
        g4 g4Var2;
        f9Var.f13334b = null;
        f9Var.f13335c = null;
        oy0 oy0Var = (oy0) this.f181b;
        iz0 iz0Var = oy0Var.h;
        ArrayList arrayList = oy0Var.f36222w;
        if (oy0Var.J < 0.2f) {
            f9Var.f13334b = iz0Var.getImageReceiver();
            f9Var.f13335c = null;
            f9Var.f13333a = iz0Var;
            f9Var.h = 0.0f;
            f9Var.f13339i = AndroidUtilities.displaySize.y;
            f9Var.f13338g = (View) oy0Var.getParent();
            f9Var.d = oy0Var.f36224y;
            f9Var.f13344n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                imageReceiver = null;
                g4Var = null;
                g4Var2 = null;
                break;
            }
            g4 g4Var3 = (g4) arrayList.get(i13);
            if (g4Var3.f13357e >= 1.0f && g4Var3.f13354a == i11) {
                int i14 = i13 - 1;
                int i15 = i13 - 2;
                g4 g4VarD = ProfileStoriesView.d(i14 >= 0 ? (g4) arrayList.get(i14) : null, i15 >= 0 ? (g4) arrayList.get(i15) : null, g4Var3);
                imageReceiver = g4Var3.f13355b;
                g4Var2 = g4VarD;
                g4Var = g4Var3;
                break;
            }
            i13++;
        }
        if (imageReceiver == null) {
            return false;
        }
        f9Var.f13335c = imageReceiver;
        f9Var.f13334b = null;
        f9Var.f13333a = oy0Var;
        f9Var.h = 0.0f;
        f9Var.f13339i = AndroidUtilities.displaySize.y;
        f9Var.f13338g = (View) oy0Var.getParent();
        if (g4Var == null || g4Var2 == null) {
            f9Var.f13337f = null;
            return true;
        }
        f9Var.f13337f = new f1.a(this, new RectF(g4Var.f13364m), g4Var, new RectF(g4Var2.f13364m), g4Var2);
        return true;
    }

    public i(Object obj, int i10) {
        this.f180a = i10;
        this.f181b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public i(int i10) {
        this.f180a = i10;
        switch (i10) {
            case 28:
                this.f181b = new d5.z(10);
                break;
            default:
                this.f181b = Collections.newSetFromMap(new WeakHashMap());
                break;
        }
    }

    public i(j3.e eVar) {
        this.f180a = 20;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(eVar.f12321a).setFlags(eVar.f12322b).setUsage(eVar.f12323c);
        int i10 = g0.f4795a;
        if (i10 >= 29) {
            j3.c.a(usage, eVar.d);
        }
        if (i10 >= 32) {
            j3.d.a(usage, eVar.f12324e);
        }
        this.f181b = usage.build();
    }

    public i(LaunchActivity launchActivity, Executor executor, e7.t tVar) {
        this.f180a = 3;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 k0VarS = launchActivity.s();
            y yVar = (y) new a5.n(launchActivity).l(y.class);
            this.f181b = k0VarS;
            yVar.d = executor;
            yVar.f1072e = tVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void K(String str) {
    }

    @Override
    public void e(boolean z10) {
    }

    @Override
    public void onSeekFinished(i3.a aVar) {
    }

    @Override
    public void onSeekStarted(i3.a aVar) {
    }

    @Override
    public void onError(m61 m61Var, Exception exc) {
    }

    @Override
    public void c(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void x(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
