package ag;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.a4;
import bi.c6;
import bi.d4;
import bi.i6;
import bi.s4;
import bi.w6;
import bi.z5;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.f8;
import org.telegram.messenger.n20;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.z60;
import org.telegram.ui.pm0;
import org.telegram.ui.sb0;
import v7.p8;
public final class m implements n20, org.telegram.ui.ActionBar.u1, sb0, bi.q0, kt, s4, OnFailureListener, di.p, r9.d, e2.p, e2.o, m4.o0, e2.j, m4.h1, pm0 {
    public final int f629a;
    public final Object f630b;
    public final Object f631c;

    public m(int i10, Object obj, Object obj2) {
        this.f629a = i10;
        this.f630b = obj;
        this.f631c = obj2;
    }

    @Override
    public Object K(bh.d dVar) {
        String str = (String) this.f630b;
        r9.a aVar = (r9.a) this.f631c;
        try {
            Trace.beginSection(str);
            return aVar.f46434f.K(dVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public z60 a(bi.n1 n1Var) {
        bi.t tVar = (bi.t) ((n4.q) this.f630b).f13528b;
        z60 z60Var = new z60(tVar, (p6) this.f631c, n1Var, false, false, true);
        tVar.H = z60Var;
        return z60Var;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f629a) {
            case 20:
                m4.j1 j1Var = (m4.j1) this.f630b;
                b2.u1 u1Var = (b2.u1) this.f631c;
                m4.n1 n1Var = (m4.n1) obj;
                j1Var.getClass();
                e9.q0 q0Var = u1Var.H;
                if (!q0Var.isEmpty()) {
                    b2.t1 c10 = u1Var.a().c();
                    e9.m2 it = q0Var.values().iterator();
                    while (it.hasNext()) {
                        b2.q1 q1Var = (b2.q1) it.next();
                        b2.p1 p1Var = (b2.p1) j1Var.d.f6442n.get(q1Var.f2196a.f2188b);
                        if (p1Var != null && q1Var.f2196a.f2187a == p1Var.f2187a) {
                            c10.a(new b2.q1(p1Var, q1Var.f2197b));
                        } else {
                            c10.a(q1Var);
                        }
                    }
                    u1Var = c10.b();
                }
                n1Var.p(u1Var);
                return;
            case 21:
                m4.w wVar = (m4.w) this.f631c;
                m4.n1 n1Var2 = (m4.n1) obj;
                m4.f0 f0Var = (m4.f0) ((m4.j1) this.f630b).f12789a.get();
                if (f0Var != null && !f0Var.j()) {
                    f0Var.g(wVar, false);
                    return;
                }
                return;
            default:
                m4.j1 j1Var2 = (m4.j1) this.f630b;
                Surface surface = (Surface) this.f631c;
                m4.n1 n1Var3 = (m4.n1) obj;
                ((m4.f0) j1Var2.f12789a.get()).getClass();
                if (surface == null) {
                    n1Var3.R(null);
                    j1Var2.f12793i = null;
                    return;
                }
                m4.i1 i1Var = new m4.i1(surface);
                j1Var2.f12793i = i1Var;
                n1Var3.R(i1Var);
                return;
        }
    }

    @Override
    public void b(m4.w wVar) {
        switch (this.f629a) {
            case 18:
                ((m4.e) this.f631c).f(((m4.p0) this.f630b).h.f12755t);
                return;
            default:
                m4.p0 p0Var = (m4.p0) this.f630b;
                p0Var.getClass();
                String str = ((n4.h) this.f631c).f13499a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                m4.n1 n1Var = p0Var.h.f12755t;
                if (!n1Var.n0(17)) {
                    e2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                b2.o1 y02 = n1Var.y0();
                b2.n1 n1Var2 = new b2.n1();
                for (int i10 = 0; i10 < y02.o(); i10++) {
                    if (TextUtils.equals(y02.m(i10, n1Var2, 0L).f2139c.f2181a, str)) {
                        n1Var.P(i10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void c(Object obj, b2.v vVar) {
        ((j2.b) obj).r((b2.f1) this.f631c, new hf.b(vVar, ((j2.g) this.f630b).e));
    }

    @Override
    public void d(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: ag.m.d(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public void e(int i10) {
        switch (this.f629a) {
            case 27:
                mg.o0 o0Var = (mg.o0) this.f630b;
                mg.o0 o0Var2 = (mg.o0) this.f631c;
                if (i10 == 1) {
                    o0Var.a(null);
                    return;
                } else if (i10 != 3) {
                    o0Var2.a(null);
                    return;
                } else {
                    return;
                }
            default:
                r20 r20Var = (r20) this.f630b;
                r20 r20Var2 = (r20) this.f631c;
                if (i10 == 1) {
                    r20Var.a(null);
                    return;
                } else if (i10 != 3) {
                    r20Var2.a(null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public Object f(m4.f0 f0Var, m4.w wVar, int i10) {
        switch (this.f629a) {
            case 23:
                m4.h1 h1Var = (m4.h1) this.f630b;
                m4.v0 v0Var = (m4.v0) this.f631c;
                if (f0Var.j()) {
                    return p8.b(new m4.t1(-100));
                }
                return e2.l0.g0((j9.y) h1Var.f(f0Var, wVar, i10), new androidx.car.app.utils.a(f0Var, wVar, v0Var, 7));
            default:
                m4.h1 h1Var2 = (m4.h1) this.f630b;
                m4.g1 g1Var = (m4.g1) this.f631c;
                if (f0Var.j()) {
                    return p8.b(new m4.t1(-100));
                }
                return e2.l0.g0((j9.y) h1Var2.f(f0Var, wVar, i10), new androidx.car.app.utils.a(f0Var, wVar, g1Var, 8));
        }
    }

    @Override
    public void g(n4.q qVar) {
        switch (this.f629a) {
            case 9:
                org.telegram.messenger.i0.g3(new a3.l0((SpannableString) this.f630b, qVar, (org.telegram.ui.h0) this.f631c, 18));
                return;
            default:
                org.telegram.messenger.i0.g3(new a3.l0((SpannableString) this.f630b, qVar, (i6) this.f631c, 19));
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f629a) {
            case 1:
                s0.d(r6.currentAccount).a((i0) this.f630b, ((TL_account.TL_businessChatLink) this.f631c).link);
                return;
            case 16:
                kg.q0 q0Var = (kg.q0) this.f630b;
                ArrayList arrayList = (ArrayList) this.f631c;
                q0Var.dismiss();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = wp.h1((TLRPC.Chat) arrayList.get(i11));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(q0Var.f21584a).sendRequest(tL_channels_updateUsername, new kg.z(q0Var, 1), 64);
                }
                return;
            case 25:
                ((AtomicBoolean) this.f630b).set(true);
                ((mg.p1) this.f631c).run();
                return;
            default:
                ((mg.o0) this.f630b).a((TLRPC.TL_premiumGiftCodeOption) this.f631c);
                return;
        }
    }

    @Override
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        w wVar = (w) this.f630b;
        wVar.f766x = false;
        org.telegram.messenger.i0.r(wVar.e);
        p pVar = wVar.f762n;
        wVar.f767y = document;
        pVar.setSticker(document);
        ((org.telegram.ui.Cells.p8) ((View) this.f631c)).setValueSticker(document);
        wVar.j0(true);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f629a) {
            case 13:
                ((j2.b) obj).n((j2.a) this.f630b, (u2.c0) this.f631c);
                return;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.f630b);
                return;
        }
    }

    @Override
    public void m() {
        switch (this.f629a) {
            case 4:
                ((bi.n0) this.f630b).i();
                ((bi.m0) this.f631c).h0();
                return;
            default:
                z5 z5Var = (z5) this.f630b;
                c6 c6Var = (c6) this.f631c;
                TL_iv.pageTableCell pagetablecell = c6Var.f2906b;
                if (pagetablecell != null) {
                    w6.d(pagetablecell, c6Var.f2905a.getText());
                }
                bi.k3 k3Var = z5Var.E;
                if (k3Var != null && z5Var.f2881a != null) {
                    d4.R1(k3Var.f3169a);
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception e) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f629a) {
            case 7:
                c1.d dVar = (c1.d) this.f630b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f631c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f1948b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
                    str = "GET_INTERRUPTED";
                } else {
                    str = "GET_NO_CREDENTIALS";
                }
                String str3 = "During begin sign in, failure response from one tap: " + e.getMessage();
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            gVar = new w0.k(str3);
                        }
                        gVar = new w0.h(2, str3);
                    } else {
                        if (str.equals("GET_INTERRUPTED")) {
                            gVar = new w0.j(str3);
                        }
                        gVar = new w0.h(2, str3);
                    }
                } else {
                    if (str.equals("GET_CANCELED_TAG")) {
                        gVar = new w0.g(str3);
                    }
                    gVar = new w0.h(2, str3);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal)) {
                    dVar.f().execute(new c1.a(dVar, gVar, 0));
                    return;
                }
                return;
            case 8:
                d1.f fVar = (d1.f) this.f630b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f631c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f1948b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
                    str2 = "CREATE_INTERRUPTED";
                } else {
                    str2 = "CREATE_UNKNOWN";
                }
                String str4 = "During create public key credential, fido registration failure: " + e.getMessage();
                if (str2.equals("CREATE_CANCELED")) {
                    cVar = new w0.b(str4);
                } else if (str2.equals("CREATE_INTERRUPTED")) {
                    cVar = new w0.e(str4);
                } else {
                    cVar = new w0.c(2, str4);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal2)) {
                    Executor executor = fVar.f5642g;
                    if (executor != null) {
                        executor.execute(new d1.a(fVar, cVar, 1));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                return;
            default:
                jg.e2 e2Var = (jg.e2) this.f630b;
                Bitmap bitmap = (Bitmap) this.f631c;
                e2Var.B0 = false;
                f8.g(e, true);
                if (Build.VERSION.SDK_INT >= 24 && (e instanceof fb.a) && e.getMessage() != null && e.getMessage().contains("segmentation optional module to be downloaded") && e2Var.isAttachedToWindow()) {
                    org.telegram.messenger.i0.h3(new d1.e(25, e2Var, bitmap), 2000L);
                    return;
                } else {
                    e2Var.C0 = true;
                    return;
                }
        }
    }

    @Override
    public void run(long j10) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        ((a4) this.f630b).a((String) this.f631c, tL_inlineButtonTypeUserProfile);
    }

    public m(j2.a aVar, Object obj, long j10) {
        this.f629a = 14;
        this.f630b = aVar;
        this.f631c = obj;
    }
}
