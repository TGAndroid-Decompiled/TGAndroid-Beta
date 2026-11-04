package hi;

import a0.h;
import a3.k;
import a3.m;
import a3.t;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.b0;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.g4;
import com.google.android.gms.tasks.TaskCompletionSource;
import d2.v0;
import g2.n0;
import gi.v5;
import i2.c0;
import i2.n;
import i2.v;
import i6.r;
import i6.s;
import ii.j4;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import ji.h0;
import ji.i0;
import ji.q;
import k2.p1;
import kg.e1;
import kg.u1;
import l.i;
import mi.b3;
import mi.b6;
import mi.c2;
import mi.g1;
import mi.g2;
import mi.h1;
import mi.h3;
import mi.i4;
import mi.j0;
import mi.l4;
import mi.n4;
import mi.n5;
import mi.o3;
import mi.p3;
import mi.q3;
import mi.r3;
import mi.s3;
import mi.t3;
import mi.y0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.messenger.g0;
import org.telegram.messenger.g10;
import org.telegram.messenger.hs;
import org.telegram.messenger.ju;
import org.telegram.messenger.l0;
import org.telegram.messenger.m0;
import org.telegram.messenger.o2;
import org.telegram.messenger.oa;
import org.telegram.messenger.wi;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dt0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.Components.zh;
import org.telegram.ui.ce;
import org.telegram.ui.k00;
import org.telegram.ui.vf0;
import org.telegram.ui.vq0;
import org.telegram.ui.wm;
import w2.u;
public final class d implements dt0, p, h0, u1, zh, i, r4, j0, r3, g1, k, o0.b, oa, ec, c51, l1, qe.d {
    public final int f14428a;
    public Object f14429b;

    public d(int i3, boolean z10) {
        this.f14428a = i3;
    }

    @Override
    public void A(int i3, int i10) {
        g2 g2Var;
        n5 n5Var = (n5) this.f14429b;
        b3 b3Var = n5Var.F;
        if (b3Var != null && n5Var.f20029a != null && (g2Var = b3Var.f19478a.R3) != null) {
            g2Var.f(i3, i10);
        }
    }

    @Override
    public void B1(Editable editable) {
        n5 n5Var = (n5) this.f14429b;
        mi.a aVar = n5Var.f20029a;
        if (aVar != null) {
            aVar.f19446s = true;
            aVar.f19445r = n5Var.f19769r.f19656l2;
        }
        n5Var.w();
        b3 b3Var = n5Var.F;
        if (b3Var != null && n5Var.f20029a != null) {
            b3Var.a();
        }
    }

    @Override
    public h C0() {
        return null;
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
        ((ju) this.f14429b).t0(true);
    }

    @Override
    public f60 D1(View view) {
        return f60.H((c2) this.f14429b, view);
    }

    @Override
    public void E1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        sf.c.t(q1Var.getContext(), str);
    }

    @Override
    public void F(boolean z10) {
        g gVar = (g) this.f14429b;
        qe.a aVar = gVar.Z;
        if (aVar != null) {
            aVar.a(z10, true);
        }
        k00 k00Var = gVar.f47068s;
        if (k00Var != null) {
            k00Var.invalidate();
        }
    }

    @Override
    public void F1() {
        switch (this.f14428a) {
            case 13:
                y0 y0Var = (y0) this.f14429b;
                o3 o3Var = y0Var.T;
                if (o3Var != null) {
                    mi.a aVar = y0Var.f20029a;
                    t3 t3Var = o3Var.f19790a;
                    g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.g();
                    }
                    t3Var.f19916p3.onContentChanged();
                    return;
                }
                return;
            default:
                n4 n4Var = (n4) this.f14429b;
                l4 l4Var = n4Var.H;
                if (l4Var != null) {
                    mi.a aVar2 = n4Var.f20029a;
                    t3 t3Var2 = ((p3) l4Var).f19805a;
                    g2 g2Var2 = t3Var2.R3;
                    if (g2Var2 != null) {
                        g2Var2.g();
                    }
                    t3Var2.f19916p3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public CharacterStyle G1(q1 q1Var) {
        return null;
    }

    @Override
    public void H0() {
        boolean z10;
        q qVar = (q) this.f14429b;
        qe.a aVar = qVar.f16356a;
        i0 i0Var = qVar.f16364w;
        if (i0Var.f16324n && i0Var.f16322l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        qVar.d.f35594g3.O(true);
    }

    @Override
    public void H1(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
        z9 z9Var = (z9) this.f14429b;
        org.telegram.ui.Cells.f fVar = z9Var.E;
        if (z9Var.a()) {
            z9Var.f31071y = 2;
            g0.r(fVar);
            g0.i3(fVar, 5000L);
        }
    }

    @Override
    public boolean I1(q1 q1Var, zi ziVar) {
        return false;
    }

    @Override
    public boolean J0(long j10) {
        return false;
    }

    @Override
    public boolean J1(int i3) {
        return true;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        ((mi.p) this.f14429b).L(z10, i3, i10, 0L, false);
        mi.p pVar = (mi.p) this.f14429b;
        vf0 vf0Var = pVar.P;
        if (vf0Var != null) {
            vf0Var.h();
            pVar.P = null;
        }
    }

    @Override
    public boolean L1() {
        return false;
    }

    @Override
    public void M(m mVar, long j10, long j11, int i3) {
        u uVar;
        t tVar = (t) mVar;
        n2.h hVar = (n2.h) this.f14429b;
        if (i3 == 0) {
            long j12 = tVar.f110a;
            uVar = new u(tVar.f111b, j10);
        } else {
            long j13 = tVar.f110a;
            n nVar = tVar.f111b;
            c0 c0Var = tVar.d;
            uVar = new u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        }
        hVar.f20167q.u(uVar, tVar.f112c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i3);
    }

    @Override
    public boolean M0(h1 h1Var) {
        return false;
    }

    @Override
    public void O(int i3) {
        ((c2) this.f14429b).t0(74, i3);
    }

    @Override
    public h9 O0() {
        switch (this.f14428a) {
            case 13:
                o3 o3Var = ((y0) this.f14429b).T;
                if (o3Var == null) {
                    return null;
                }
                return o3Var.f19790a.getTextSelectionHelper();
            default:
                l4 l4Var = ((n4) this.f14429b).H;
                if (l4Var != null) {
                    return ((p3) l4Var).f19805a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void O1() {
        c2 c2Var = (c2) this.f14429b;
        c2Var.E0();
        c2Var.H0();
    }

    @Override
    public boolean P0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean P1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S(q1 q1Var) {
        return false;
    }

    @Override
    public vq0 S1() {
        return null;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public Cursor T0(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f14429b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override
    public void T1(q3 q3Var, View view) {
        c2 c2Var = (c2) this.f14429b;
        f60 H = f60.H(c2Var, view);
        H.Q = true;
        c2Var.f19541y0 = i4.c(H, c2Var, c2Var.getParentActivity(), c2Var.getResourceProvider(), q3Var, false);
    }

    @Override
    public boolean U0(l.k kVar, MenuItem menuItem) {
        switch (this.f14428a) {
            case 9:
                m.k kVar2 = ((ActionMenuView) this.f14429b).Q;
                if (kVar2 != null) {
                    Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((v5) kVar2).f13688b).f1397a0.d).iterator();
                    while (it.hasNext()) {
                        if (((b0) it.next()).f1801a.p()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                ((Toolbar) this.f14429b).getClass();
                return false;
        }
    }

    @Override
    public boolean V1(long j10) {
        return false;
    }

    @Override
    public void W(s3 s3Var, View view) {
        c2 c2Var = (c2) this.f14429b;
        f60 H = f60.H(c2Var, view);
        H.Q = true;
        c2Var.getParentActivity();
        c2Var.getResourceProvider();
        c2Var.f19541y0 = i4.b(H, c2Var, s3Var, false);
    }

    @Override
    public void W0(CharSequence charSequence) {
        switch (this.f14428a) {
            case 13:
                o3 o3Var = ((y0) this.f14429b).T;
                if (o3Var != null) {
                    o3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        o3Var.f19790a.w4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                l4 l4Var = ((n4) this.f14429b).H;
                if (l4Var != null) {
                    p3 p3Var = (p3) l4Var;
                    p3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        p3Var.f19805a.w4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void W1(q1 q1Var, int i3, float f10, float f11, boolean z10) {
        z9 z9Var = (z9) this.f14429b;
        org.telegram.ui.Cells.f fVar = z9Var.E;
        if (z9Var.a()) {
            z9Var.f31071y = 0;
            q1Var.invalidate();
            g0.r(fVar);
            g0.i3(fVar, 5000L);
        }
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public boolean X0(zi ziVar) {
        return f1.a(ziVar);
    }

    @Override
    public boolean X1(boolean z10) {
        return false;
    }

    @Override
    public void Y(ng ngVar) {
        hs.f(lg.m.f0((lg.m) this.f14429b)).d(ngVar);
    }

    @Override
    public boolean Y1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public kh.a Z() {
        return null;
    }

    @Override
    public void Z0(b6 b6Var, String str) {
        c2 c2Var = (c2) this.f14429b;
        if (c2Var.A0 == null) {
            c2Var.A0 = new fa.f(new l5.b(this, 8), c2Var.getResourceProvider());
        }
        c2Var.A0.k(b6Var, str);
    }

    @Override
    public void a0() {
        int i3;
        c2 c2Var = (c2) this.f14429b;
        h3 h3Var = c2Var.Q.f19928v3;
        if (h3Var != null && h3Var.x() && c2Var.Q.F4()) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c2Var.C0(i3, true);
        c2Var.D0();
        c2Var.B0();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f14428a) {
            case 1:
                i6.q qVar = new i6.q(0, (TaskCompletionSource) obj2);
                i6.i iVar = (i6.i) ((s) obj).m();
                Parcel P0 = iVar.P0();
                com.google.android.gms.internal.cast.u.d(P0, qVar);
                P0.writeStringArray((String[]) this.f14429b);
                iVar.U0(P0, 5);
                return;
            case 2:
                j7.f fVar = new j7.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
                gVar.f6590c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i3 = s7.a.f54671a;
                obtain.writeStrongBinder(fVar);
                s7.a.b(obtain, (GetCredentialRequest) this.f14429b);
                s7.a.b(obtain, gVar);
                ((j7.b) ((j7.d) ((j7.e) obj).m())).H0(obtain, 1);
                return;
            default:
                k7.a aVar = new k7.a((TaskCompletionSource) obj2);
                k7.i iVar2 = (k7.i) ((k7.c) obj).m();
                String str = ((k7.b) this.f14429b).f16900l;
                Parcel L0 = iVar2.L0();
                int i10 = k7.f.f16904a;
                L0.writeStrongBinder(aVar);
                L0.writeString(str);
                iVar2.M0(L0, 2);
                return;
        }
    }

    @Override
    public void b(l.k kVar) {
        switch (this.f14428a) {
            case 9:
                d dVar = ((ActionMenuView) this.f14429b).L;
                if (dVar != null) {
                    dVar.b(kVar);
                    return;
                }
                return;
            default:
                Toolbar toolbar = (Toolbar) this.f14429b;
                m.h hVar = toolbar.f1396a.K;
                if (hVar == null || !hVar.g()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.f1397a0.d).iterator();
                    while (it.hasNext()) {
                        ((b0) it.next()).f1801a.t();
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean b0(q1 q1Var) {
        return false;
    }

    @Override
    public void b1(mi.a aVar) {
        c2 c2Var = (c2) this.f14429b;
        if (aVar != null && (aVar.f19431b instanceof TL_iv.pageBlockMap) && g0.J1(c2Var)) {
            bi biVar = new bi(c2Var.getParentActivity(), c2Var, false, false, false, c2Var.getResourceProvider());
            biVar.U3 = new mb.b(15);
            biVar.H1 = true;
            biVar.f32272s3.setVisibility(8);
            biVar.f32269r4 = new aa.a(c2Var, aVar, biVar, 12);
            biVar.e1();
            biVar.show();
        }
    }

    @Override
    public void b2(ArrayList arrayList) {
        e1 e1Var = (e1) this.f14429b;
        String str = e1Var.f16990a0;
        if (str != null) {
            e1Var.U(str, e1Var.f16994d0, e1Var.f16996e0, e1Var.f16993c0, e1Var.f16991b0);
        }
    }

    @Override
    public boolean c() {
        return ((z9) this.f14429b).a();
    }

    @Override
    public boolean c0(h1 h1Var) {
        return false;
    }

    @Override
    public void c2() {
        switch (this.f14428a) {
            case 13:
                y0 y0Var = (y0) this.f14429b;
                o3 o3Var = y0Var.T;
                if (o3Var != null) {
                    mi.a aVar = y0Var.f20029a;
                    t3.S1(o3Var.f19790a);
                    return;
                }
                return;
            default:
                n4 n4Var = (n4) this.f14429b;
                l4 l4Var = n4Var.H;
                if (l4Var != null) {
                    mi.a aVar2 = n4Var.f20029a;
                    t3.S1(((p3) l4Var).f19805a);
                    return;
                }
                return;
        }
    }

    @Override
    public void close() {
        switch (this.f14428a) {
            case 3:
                ((q) this.f14429b).finishFragment();
                return;
            default:
                ContentProviderClient contentProviderClient = (ContentProviderClient) this.f14429b;
                if (contentProviderClient != null) {
                    if (contentProviderClient instanceof AutoCloseable) {
                        contentProviderClient.close();
                        return;
                    } else if (contentProviderClient instanceof ExecutorService) {
                        g4.e((ExecutorService) contentProviderClient);
                        return;
                    } else {
                        contentProviderClient.release();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public boolean d0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    public String d2(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            oa.d dVar = (oa.d) this.f14429b;
            oa.e eVar = new oa.e(stringWriter, dVar.f20947a, dVar.f20948b, dVar.f20949c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f20951b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public boolean e(float f10) {
        boolean z10;
        int[] iArr;
        c2 c2Var = (c2) this.f14429b;
        FrameLayout frameLayout = c2Var.f19537w0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f10 >= iArr[1]) {
                z10 = true;
                c2.e0(c2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        c2.e0(c2Var, z10, true);
        return z10;
    }

    @Override
    public g9 e1() {
        switch (this.f14428a) {
            case 13:
                return (y0) this.f14429b;
            default:
                return (n4) this.f14429b;
        }
    }

    @Override
    public boolean e2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void f(h1 h1Var) {
        switch (this.f14428a) {
            case 13:
                o3 o3Var = ((y0) this.f14429b).T;
                if (o3Var != null) {
                    t3 t3Var = o3Var.f19790a;
                    t3.Q1(t3Var, h1Var);
                    t3Var.f19916p3.E(h1Var, true);
                    return;
                }
                return;
            case 14:
            default:
                b3 b3Var = ((n5) this.f14429b).F;
                if (b3Var != null) {
                    t3 t3Var2 = b3Var.f19478a;
                    t3.Q1(t3Var2, h1Var);
                    t3Var2.f19916p3.E(h1Var, true);
                    return;
                }
                return;
            case 15:
                l4 l4Var = ((n4) this.f14429b).H;
                if (l4Var != null) {
                    t3 t3Var3 = ((p3) l4Var).f19805a;
                    t3.Q1(t3Var3, h1Var);
                    t3Var3.f19916p3.E(h1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public void f1(q1 q1Var, int i3) {
        z9 z9Var = (z9) this.f14429b;
        org.telegram.ui.Cells.f fVar = z9Var.E;
        if (z9Var.a()) {
            z9Var.f31071y = 2;
            q1Var.invalidate();
            g0.r(fVar);
            g0.i3(fVar, 5000L);
        }
    }

    @Override
    public String g(q1 q1Var) {
        return null;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public void g1(CharSequence charSequence) {
        b3 b3Var = ((n5) this.f14429b).F;
        if (b3Var != null && charSequence != null && charSequence.length() > 0) {
            b3Var.f19478a.w4(charSequence.toString());
        }
    }

    public long g2(TimeUnit timeUnit) {
        return timeUnit.convert(((l0) this.f14429b).f23921c, TimeUnit.SECONDS);
    }

    @Override
    public void h(m mVar, long j10, long j11) {
        int size;
        long j12;
        t tVar = (t) mVar;
        n2.h hVar = (n2.h) this.f14429b;
        long j13 = tVar.f110a;
        n nVar = tVar.f111b;
        c0 c0Var = tVar.d;
        u uVar = new u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        hVar.f20163m.getClass();
        hVar.f20167q.q(uVar, tVar.f112c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        o2.c cVar = (o2.c) tVar.f114f;
        o2.c cVar2 = hVar.G;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f20522m.size();
        }
        long j14 = cVar.b(0).f20541b;
        int i3 = 0;
        while (i3 < size && hVar.G.b(i3).f20541b < j14) {
            i3++;
        }
        if (cVar.d) {
            if (size - i3 > cVar.f20522m.size()) {
                g2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j15 = hVar.M;
                j12 = -9223372036854775807L;
                if (j15 != -9223372036854775807L && cVar.h * 1000 <= j15) {
                    g2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.M);
                } else {
                    hVar.L = 0;
                }
            }
            int i10 = hVar.L;
            hVar.L = i10 + 1;
            if (i10 < hVar.f20163m.F4(tVar.f112c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.L - 1) * 1000, 5000));
                return;
            }
            hVar.C = new IOException();
            return;
        }
        j12 = -9223372036854775807L;
        hVar.G = cVar;
        hVar.H = cVar.d & hVar.H;
        hVar.I = j10 - j11;
        hVar.J = j10;
        hVar.N += i3;
        synchronized (hVar.f20170t) {
            try {
                if (tVar.f111b.f14564a.equals(hVar.E)) {
                    Uri uri = hVar.G.f20520k;
                    if (uri == null) {
                        uri = a.a.a(tVar.d.f14529c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        o2.c cVar3 = hVar.G;
        if (cVar3.d && hVar.K == j12) {
            e5.a aVar = cVar3.f20518i;
            if (aVar != null) {
                String str = aVar.f9554b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                hVar.y(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                hVar.w();
                                return;
                            }
                        }
                        hVar.A(aVar, new ra.e(15));
                        return;
                    }
                    hVar.A(aVar, new Object());
                    return;
                }
                try {
                    hVar.K = n0.V(aVar.f9555c) - hVar.J;
                    hVar.z(true);
                    return;
                } catch (v0 e10) {
                    hVar.y(e10);
                    return;
                }
            }
            hVar.w();
            return;
        }
        hVar.z(true);
    }

    @Override
    public float h1() {
        return p1.d(9.66f, pi.a.d(((g) this.f14429b).f14434c0), 0);
    }

    @Override
    public void i0(long j10) {
        ((q) this.f14429b).presentFragment(wm.ra(j10));
    }

    @Override
    public void invalidate() {
        ((q1) ((j1) this.f14429b).f29417b).invalidate();
    }

    @Override
    public int j0(q1 q1Var) {
        return 0;
    }

    @Override
    public mi.a j1() {
        switch (this.f14428a) {
            case 13:
                return ((y0) this.f14429b).f20029a;
            default:
                return ((n4) this.f14429b).f20029a;
        }
    }

    public l1.f1 j2() {
        zd.u uVar = (zd.u) this.f14429b;
        uVar.getClass();
        Object obj = zd.u.f60441e.get(uVar);
        if (obj == ae.i.f401a) {
            obj = null;
        }
        return (l1.f1) obj;
    }

    @Override
    public a3.i k(m mVar, long j10, long j11, IOException iOException, int i3) {
        long min;
        a3.i iVar;
        t tVar = (t) mVar;
        n2.h hVar = (n2.h) this.f14429b;
        long j12 = tVar.f110a;
        n nVar = tVar.f111b;
        c0 c0Var = tVar.d;
        u uVar = new u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        int i10 = tVar.f112c;
        hVar.f20163m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof v0) || (th2 instanceof FileNotFoundException) || (th2 instanceof v) || (th2 instanceof a3.p) || ((th2 instanceof i2.k) && ((i2.k) th2).f14552a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i3 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            iVar = a3.q.f106f;
        } else {
            iVar = new a3.i(0, min, false);
        }
        hVar.f20167q.s(uVar, i10, iOException, !iVar.a());
        return iVar;
    }

    @Override
    public h k1() {
        return null;
    }

    public void k2() {
        v5 v5Var = (v5) this.f14429b;
        v5Var.getClass();
        try {
            k8.b bVar = (k8.b) v5Var.f13688b;
            Parcel P0 = bVar.P0();
            int i3 = u7.b.f55736a;
            P0.writeInt(0);
            bVar.T0(P0, 2);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void l(h1 h1Var, int i3, int i10) {
        b3 b3Var;
        h9 textSelectionHelper;
        n5 n5Var = (n5) this.f14429b;
        if (!n5Var.H && i3 != i10 && (b3Var = n5Var.F) != null && (textSelectionHelper = b3Var.f19478a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != n5Var) {
                n5Var.post(new j4(this, h1Var, i10, textSelectionHelper, i3, 4));
            }
        }
    }

    @Override
    public boolean l1() {
        switch (this.f14428a) {
            case 13:
                y0 y0Var = (y0) this.f14429b;
                o3 o3Var = y0Var.T;
                if (o3Var != null) {
                    mi.a aVar = y0Var.f20029a;
                    if (o3Var.f19790a.V4()) {
                        return true;
                    }
                }
                return false;
            default:
                n4 n4Var = (n4) this.f14429b;
                l4 l4Var = n4Var.H;
                if (l4Var != null) {
                    mi.a aVar2 = n4Var.f20029a;
                    if (((p3) l4Var).f19805a.V4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    public void l2() {
        ((t2) this.f14429b).f28611p0 = false;
    }

    @Override
    public boolean m() {
        n5 n5Var = (n5) this.f14429b;
        b3 b3Var = n5Var.F;
        if (b3Var != null && n5Var.f20029a != null) {
            return b3Var.f19478a.V4();
        }
        return false;
    }

    @Override
    public boolean m0() {
        return c();
    }

    @Override
    public int m1() {
        return ((g) this.f14429b).f14435d0;
    }

    @Override
    public boolean m2(int i3) {
        return false;
    }

    @Override
    public boolean n1() {
        return false;
    }

    public void n2() {
        v5 v5Var = (v5) this.f14429b;
        v5Var.getClass();
        try {
            k8.b bVar = (k8.b) v5Var.f13688b;
            Parcel P0 = bVar.P0();
            int i3 = u7.b.f55736a;
            P0.writeInt(0);
            bVar.T0(P0, 3);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean o0(p5 p5Var) {
        return false;
    }

    @Override
    public void onContentChanged() {
        c2 c2Var = (c2) this.f14429b;
        if (c2Var.f19542z0 != null) {
            boolean p32 = c2Var.Q.p3();
            c2Var.M0 = p32;
            c2Var.f19542z0.f(p32);
            c2Var.f19542z0.invalidate();
        }
        c2Var.H0();
        Runnable runnable = c2Var.N0;
        g0.r(runnable);
        g0.i3(runnable, 1000L);
    }

    @Override
    public boolean p1(q1 q1Var, int i3) {
        if (i3 == ((z9) this.f14429b).f31071y) {
            return true;
        }
        return false;
    }

    @Override
    public void q0(m mVar, long j10, long j11, boolean z10) {
        ((n2.h) this.f14429b).x((t) mVar, j10, j11);
    }

    @Override
    public void q1(int i3, int i10) {
        switch (this.f14428a) {
            case 13:
                y0 y0Var = (y0) this.f14429b;
                o3 o3Var = y0Var.T;
                if (o3Var != null) {
                    mi.a aVar = y0Var.f20029a;
                    g2 g2Var = o3Var.f19790a.R3;
                    if (g2Var != null) {
                        g2Var.f(i3, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                n4 n4Var = (n4) this.f14429b;
                l4 l4Var = n4Var.H;
                if (l4Var != null) {
                    mi.a aVar2 = n4Var.f20029a;
                    g2 g2Var2 = ((p3) l4Var).f19805a.R3;
                    if (g2Var2 != null) {
                        g2Var2.f(i3, i10);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public i9 q2() {
        return null;
    }

    @Override
    public void r(int i3) {
        ((e1) this.f14429b).f();
    }

    public void r2(ce ceVar) {
        ((t2) this.f14429b).I0 = ceVar;
    }

    @Override
    public void s1() {
        ((z8) this.f14429b).f40984a.invalidate();
    }

    public void s2() {
        v5 v5Var = (v5) this.f14429b;
        v5Var.getClass();
        try {
            k8.b bVar = (k8.b) v5Var.f13688b;
            Parcel P0 = bVar.P0();
            int i3 = u7.b.f55736a;
            P0.writeInt(0);
            bVar.T0(P0, 1);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean t() {
        return false;
    }

    public void t2(l1.f1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: hi.d.t2(l1.f1):void");
    }

    @Override
    public void u() {
        switch (this.f14428a) {
            case 13:
                y0 y0Var = (y0) this.f14429b;
                o3 o3Var = y0Var.T;
                if (o3Var != null) {
                    t3.T1(o3Var.f19790a, y0Var.f20029a);
                    return;
                }
                return;
            default:
                n4 n4Var = (n4) this.f14429b;
                l4 l4Var = n4Var.H;
                if (l4Var != null) {
                    t3.T1(((p3) l4Var).f19805a, n4Var.f20029a);
                    return;
                }
                return;
        }
    }

    @Override
    public void u0() {
        c2 c2Var = (c2) this.f14429b;
        c2Var.J0 = c2Var.L0;
        c2.e0(c2Var, false, false);
        c2Var.C0(2, true);
    }

    @Override
    public void v1() {
        c2 c2Var = (c2) this.f14429b;
        int i3 = 0;
        c2.e0(c2Var, false, true);
        int i10 = c2Var.J0;
        if (i10 != 2) {
            i3 = i10;
        }
        c2Var.C0(i3, true);
    }

    @Override
    public boolean w1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean x(float f10) {
        return false;
    }

    @Override
    public boolean x0(zi ziVar) {
        return true;
    }

    @Override
    public boolean y1() {
        return false;
    }

    @Override
    public String z(long j10) {
        return null;
    }

    public d(r rVar, String[] strArr) {
        this.f14428a = 1;
        this.f14429b = strArr;
    }

    public d(Object obj, int i3) {
        this.f14428a = i3;
        this.f14429b = obj;
    }

    public d(int i3) {
        this.f14428a = i3;
        switch (i3) {
            case 20:
                this.f14429b = new Object();
                return;
            case 21:
                this.f14429b = new m0();
                return;
            default:
                this.f14429b = new zd.u(l1.g1.f17542b);
                return;
        }
    }

    public d(Context context, Uri uri) {
        this.f14428a = 18;
        this.f14429b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public d(String str, long j10) {
        this.f14428a = 22;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f14429b = new l0(str, j10);
    }

    public d(Context context, e6 e6Var) {
        this.f14428a = 26;
        t2 t2Var = new t2(1, context, e6Var, false);
        this.f14429b = t2Var;
        t2Var.N();
    }

    @Override
    public void A1(q1 q1Var) {
    }

    @Override
    public void B(q1 q1Var) {
    }

    @Override
    public void C(q1 q1Var) {
    }

    @Override
    public void C1(zi ziVar) {
    }

    @Override
    public void D0(q1 q1Var) {
    }

    @Override
    public void G0(q1 q1Var) {
    }

    @Override
    public void I(q1 q1Var) {
    }

    @Override
    public void I0(Object obj) {
    }

    @Override
    public void J(wi wiVar) {
    }

    @Override
    public void K0(q1 q1Var) {
    }

    @Override
    public void N(q1 q1Var) {
    }

    @Override
    public void P(zi ziVar) {
    }

    @Override
    public void Q0(q1 q1Var) {
    }

    @Override
    public void S0(q1 q1Var) {
    }

    @Override
    public void V(q1 q1Var) {
    }

    @Override
    public void V0(h1 h1Var) {
    }

    @Override
    public void Y0(int i3) {
    }

    @Override
    public void Z1(q1 q1Var) {
    }

    @Override
    public void a1(TLRPC.User user) {
    }

    @Override
    public void e0(int i3) {
    }

    @Override
    public void f2(q1 q1Var) {
    }

    @Override
    public void k0(q1 q1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(boolean z10) {
    }

    @Override
    public void p(q1 q1Var) {
    }

    @Override
    public void s(q1 q1Var) {
    }

    @Override
    public void t1(q1 q1Var) {
    }

    @Override
    public void w(q1 q1Var) {
    }

    @Override
    public void y(q1 q1Var) {
    }

    @Override
    public void y0(q1 q1Var) {
    }

    @Override
    public void G() {
    }

    @Override
    public void K1() {
    }

    @Override
    public void R0() {
    }

    @Override
    public void a() {
    }

    @Override
    public void c1() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void q() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void v() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void w0() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void E(h1 h1Var, boolean z10) {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }

    @Override
    public void H(q1 q1Var, o2 o2Var) {
    }

    @Override
    public void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void M1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void Q1(q1 q1Var, g10 g10Var) {
    }

    @Override
    public void U1(String str, String str2) {
    }

    @Override
    public void a2(q1 q1Var, long j10) {
    }

    @Override
    public void d1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void u1(q1 q1Var, boolean z10) {
    }

    @Override
    public void x1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void z1(q1 q1Var, int i3) {
    }

    @Override
    public void A0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void E0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void N0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void i1(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void p0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void p2(q1 q1Var, int i3, int i10) {
    }

    @Override
    public void r1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void N1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }

    @Override
    public void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    @Override
    public void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void t0(q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void i(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    @Override
    public void i2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }

    @Override
    public void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
    }
}
