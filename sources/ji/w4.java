package ji;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Components.ai0;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Components.y20;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.s8;
import org.telegram.ui.vv0;
import org.telegram.ui.zs0;
import w7.u8;
public class w4 implements j0, m.g2, y2.g, m.z0, n5.b, o0.a, u2.e1, org.telegram.ui.Cells.l1, bh.h, mg.e, f81, hg.z1, com.google.android.gms.common.api.internal.s, r2.m, com.google.android.gms.common.api.internal.o, rg.x1, s4.h1 {
    public final int f13594a;
    public Object f13595b;

    public w4(Object obj, int i10) {
        this.f13594a = i10;
        this.f13595b = obj;
    }

    @Override
    public void A(y2.i iVar, long j10, long j11) {
        int size;
        long j12;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.f13595b;
        long j13 = oVar.f48545a;
        g2.m mVar = oVar.f48546b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        gVar.f14509m.getClass();
        gVar.f14513q.r(uVar, oVar.f48547c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f48548f;
        m2.c cVar2 = gVar.G;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f15065m.size();
        }
        long j14 = cVar.b(0).f15082b;
        int i10 = 0;
        while (i10 < size && gVar.G.b(i10).f15082b < j14) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.f15065m.size()) {
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
            if (i11 < gVar.f14509m.y3(oVar.f48547c)) {
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
        synchronized (gVar.f14516t) {
            try {
                if (oVar.f48546b.f9886a.equals(gVar.E)) {
                    Uri uri = gVar.G.f15063k;
                    if (uri == null) {
                        uri = u8.a(oVar.d.f9859c);
                    }
                    gVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = gVar.G;
        if (cVar3.d && gVar.K == j12) {
            m2.t tVar = cVar3.f15061i;
            if (tVar != null) {
                String str = (String) tVar.f15110b;
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
                        gVar.A(tVar, new sb.a(12));
                        return;
                    }
                    gVar.A(tVar, new Object());
                    return;
                }
                try {
                    gVar.K = e2.m0.V((String) tVar.f15111c) - gVar.J;
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
    public boolean A1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void C0() {
        y4 y4Var = (y4) this.f13595b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            a aVar = y4Var.f13123a;
            x3 x3Var = q3Var.f13480a;
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            x3Var.f13630f3.onContentChanged();
        }
    }

    @Override
    public boolean C1() {
        return false;
    }

    @Override
    public int D() {
        return ((s4.n0) this.f13595b).D();
    }

    @Override
    public boolean E0(int i10) {
        switch (this.f13594a) {
            case 16:
                if (i10 == ((er0) this.f13595b).f24460r) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public void F(u2.f1 f1Var) {
        o2.q qVar = (o2.q) f1Var;
        o2.k kVar = (o2.k) this.f13595b;
        kVar.G.F(kVar);
    }

    @Override
    public void G0(float f7) {
        rg.y0 y0Var = (rg.y0) this.f13595b;
        qg.s0.e(y0Var.f44366a).k("-1", f7);
        y0Var.e.setBrushSize(f7);
    }

    @Override
    public void H() {
        ((uf0) this.f13595b).f29367b.o();
    }

    @Override
    public View J0(int i10) {
        return ((s4.n0) this.f13595b).q(i10);
    }

    @Override
    public void J1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override
    public a0.h K() {
        switch (this.f13594a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean K0(long j10) {
        return false;
    }

    @Override
    public CharacterStyle K1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public void L1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ga gaVar = (ga) this.f13595b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f20949s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public int M0(View view) {
        return s4.n0.y(view) + ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public boolean M1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void N0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        ga gaVar = (ga) this.f13595b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f20949s = 2;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void O0(ArrayList arrayList) {
        int i10 = this.f13594a;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public void Q0() {
        ((uf0) this.f13595b).f29367b.k();
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public void R0() {
        y4 y4Var = (y4) this.f13595b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            a aVar = y4Var.f13123a;
            x3.P1(q3Var.f13480a);
        }
    }

    @Override
    public boolean R1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public vv0 S1() {
        return null;
    }

    @Override
    public boolean T0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean T1(long j10) {
        return false;
    }

    @Override
    public int U() {
        s4.n0 n0Var = (s4.n0) this.f13595b;
        return n0Var.f44939m - n0Var.E();
    }

    @Override
    public void U1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
        ga gaVar = (ga) this.f13595b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f20949s = 0;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public void V0(float f7) {
        uf0 uf0Var = (uf0) this.f13595b;
        uf0Var.f29367b.setRotation(f7);
        uf0Var.getClass();
        tf0 tf0Var = uf0Var.f29366a;
        if (tf0Var != null) {
            ((zs0) tf0Var).a(false);
        }
    }

    @Override
    public boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public o9 W() {
        q3 q3Var = ((y4) this.f13595b).N;
        if (q3Var != null) {
            return q3Var.f13480a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public Cursor X(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13595b;
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
    public void X0(y2.i iVar, long j10, long j11, boolean z10) {
        ((l2.g) this.f13595b).x((y2.o) iVar, j10, j11);
    }

    @Override
    public ih.a Y() {
        return null;
    }

    public void Y0() {
        qg.a1 a1Var = ((qg.c1) this.f13595b).d;
        if (a1Var != null) {
            qg.z0 z0Var = a1Var.f43128s;
            if (z0Var != null) {
                a1Var.cancelRunnable(z0Var);
                a1Var.f43128s = null;
            }
            qg.z0 z0Var2 = new qg.z0(a1Var, 1);
            a1Var.f43128s = z0Var2;
            a1Var.postRunnable(z0Var2, 1L);
        }
    }

    @Override
    public boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    public s0.c Z0(int i10) {
        return null;
    }

    @Override
    public void a(h1 h1Var) {
        q3 q3Var = ((y4) this.f13595b).N;
        if (q3Var != null) {
            x3 x3Var = q3Var.f13480a;
            x3.N1(x3Var, h1Var);
            x3Var.f13630f3.V(h1Var, true);
        }
    }

    @Override
    public void a0(CharSequence charSequence) {
        q3 q3Var = ((y4) this.f13595b).N;
        if (q3Var != null) {
            q3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                q3Var.f13480a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public boolean a1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        if (i10 == ((ga) this.f13595b).f20949s) {
            return true;
        }
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f13594a) {
            case 19:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                Parcel H0 = aVar.H0();
                k7.a.c(H0, (n6.o) this.f13595b);
                try {
                    aVar.f319b.transact(1, H0, null, 1);
                    H0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    H0.recycle();
                    throw th2;
                }
            default:
                s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel H02 = eVar.H0();
                k7.a.d(H02, fVar);
                k7.a.c(H02, (s6.a) this.f13595b);
                eVar.I0(H02, 1);
                return;
        }
    }

    @Override
    public void b(long j10, int i10, int i11, int i12) {
        ((MediaCodec) this.f13595b).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public void b0() {
        ((uf0) this.f13595b).f29367b.f15559a.g(1, true);
    }

    public String b1(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            la.d dVar = (la.d) this.f13595b;
            la.e eVar = new la.e(stringWriter, dVar.f14646a, dVar.f14647b, dVar.f14648c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f14650b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public boolean c() {
        return ((ga) this.f13595b).a();
    }

    @Override
    public boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    public s0.c c1(int i10) {
        return null;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13595b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                com.google.android.gms.internal.cast.i4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public void d(int i10, h2.d dVar, long j10, int i11) {
        ((MediaCodec) this.f13595b).queueSecureInputBuffer(i10, 0, dVar.f10326i, j10, i11);
    }

    public void d1() {
        o2.q[] qVarArr;
        o2.q[] qVarArr2;
        o2.k kVar = (o2.k) this.f13595b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (o2.q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.f46033a;
        }
        b2.q1[] q1VarArr = new b2.q1[i11];
        int i12 = 0;
        for (o2.q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.f46033a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                q1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new u2.r1(q1VarArr);
        kVar.G.q(kVar);
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean e1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public boolean e2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void f(int i10) {
        switch (this.f13594a) {
            case 16:
                er0 er0Var = (er0) this.f13595b;
                ir0 ir0Var = er0Var.K;
                er0Var.f24461s = i10;
                if (er0Var.v != i10) {
                    er0Var.d.clear();
                }
                int i11 = er0Var.J;
                if (er0Var.h() == 0 && !er0Var.e.e() && !er0Var.I) {
                    ir0Var.Q.e(false, true);
                } else {
                    ir0Var.f25770x0.b(i11);
                }
                er0Var.l();
                int i12 = ir0.f25739a1;
                ir0Var.L0(true);
                return;
            default:
                s8 s8Var = (s8) this.f13595b;
                if (!s8Var.f33436n && i10 == s8Var.I) {
                    s8Var.d0(s8Var.M.getText().toString().trim());
                    return;
                }
                return;
        }
    }

    @Override
    public String g(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public n9 g0() {
        return (y4) this.f13595b;
    }

    @Override
    public Object mo27get() {
        return new m.h3((Context) ((a9.r) this.f13595b).f357a, new rb.b(24), new pb.a(24), 3);
    }

    @Override
    public void h() {
        y4 y4Var = (y4) this.f13595b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            x3.Q1(q3Var.f13480a, y4Var.f13123a);
        }
    }

    @Override
    public int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public a j0() {
        return ((y4) this.f13595b).f13123a;
    }

    public boolean j1(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: ji.w4.j1(android.view.MotionEvent):boolean");
    }

    @Override
    public void k(Canvas canvas) {
        vi viVar = (vi) this.f13595b;
        canvas.drawColor(viVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
        if (SharedConfig.chatBlurEnabled()) {
            viVar.F2.b(canvas, -2);
        }
    }

    @Override
    public a0.h k0() {
        switch (this.f13594a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    public boolean k1(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override
    public int l(View view) {
        return s4.n0.x(view) - ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public boolean l0() {
        return c();
    }

    @Override
    public void m0(bh.a aVar) {
        aVar.a(((vi) this.f13595b).getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    public void m1(s4.b1 b1Var, b2.v0 v0Var, b2.v0 v0Var2) {
        int i10;
        int i11;
        boolean z10;
        s4.b1 T;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f13595b;
        recyclerView.f1993b.k(b1Var);
        recyclerView.h(b1Var);
        b1Var.q(false);
        s4.e1 e1Var = (s4.e1) recyclerView.f1996c0;
        e1Var.getClass();
        int i13 = v0Var.f2448a;
        int i14 = v0Var.f2449b;
        View view = b1Var.f44838a;
        if (v0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = v0Var2.f2448a;
        }
        int i15 = i10;
        if (v0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = v0Var2.f2449b;
        }
        int i16 = i11;
        if (!b1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = e1Var.r(b1Var, v0Var, i13, i14, i15, i16);
        } else {
            int i17 = b1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i12 = T.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            b1Var.f44843i = (b1Var.h - i18) + (i18 * 1000);
            e1Var.s(b1Var, v0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void n1(s4.b1 b1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f13595b;
        s4.n0 n0Var = recyclerView.f2021x;
        View view = b1Var.f44838a;
        qf.e eVar = recyclerView.f1993b;
        m.h3 h3Var = n0Var.f44930a;
        h5 h5Var = (h5) h3Var.f14850b;
        int indexOfChild = ((RecyclerView) h5Var.f13315b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ad.d) h3Var.f14851c).G(indexOfChild)) {
                h3Var.X(view);
            }
            h5Var.j(indexOfChild);
        }
        eVar.g(view);
    }

    @Override
    public boolean o0(org.telegram.ui.Components.b6 b6Var) {
        return false;
    }

    public void o1() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f13595b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long r12 = r1();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + r12);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        hl0 hl0Var = (hl0) this.f13595b;
        if (z10 && hl0Var.f25353n.n() >= 0) {
            hl0Var.f25356w = true;
        }
        gh0 gh0Var = hl0Var.f25352f;
        yc0 yc0Var = hl0Var.f25357x;
        gh0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(yc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(yc0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean p() {
        tf0 tf0Var = ((uf0) this.f13595b).f29366a;
        if (tf0Var != null) {
            PhotoViewer photoViewer = ((zs0) tf0Var).f42417a;
            Drawable[] drawableArr = PhotoViewer.U8;
            return photoViewer.N0();
        }
        return false;
    }

    @Override
    public boolean p0() {
        y4 y4Var = (y4) this.f13595b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            a aVar = y4Var.f13123a;
            if (q3Var.f13480a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void p1(long j10) {
        long r12 = r1();
        if (r12 != j10) {
            if (r12 != -1) {
                if (r12 == -2) {
                    r12 = -2;
                } else {
                    return;
                }
            }
            StringBuilder t10 = a1.g.t(j10, "expected non-string scope or scope ", " but found ");
            t10.append(r12);
            throw new IOException(t10.toString());
        }
    }

    @Override
    public boolean p2(int i10) {
        return false;
    }

    @Override
    public boolean r0() {
        tf0 tf0Var = ((uf0) this.f13595b).f29366a;
        if (tf0Var == null) {
            return false;
        }
        PhotoViewer photoViewer = ((zs0) tf0Var).f42417a;
        Drawable[] drawableArr = PhotoViewer.U8;
        return photoViewer.O0(-90.0f, false, null);
    }

    public long r1() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f13595b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f13595b).setParameters(bundle);
    }

    @Override
    public void t0(int i10, int i11) {
        y4 y4Var = (y4) this.f13595b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            a aVar = y4Var.f13123a;
            h2 h2Var = q3Var.f13480a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override
    public p9 t2() {
        return null;
    }

    public String toString() {
        switch (this.f13594a) {
            case 28:
                te.b bVar = te.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((s4.b) this.f13595b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void v(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.f13595b);
    }

    @Override
    public k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.f13595b;
        long j12 = oVar.f48545a;
        g2.m mVar = oVar.f48546b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        int i11 = oVar.f48547c;
        gVar.f14509m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f9876a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            dVar = y2.l.f48541f;
        } else {
            dVar = new k4.d(0, min, false);
        }
        gVar.f14513q.t(uVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override
    public void w0(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f13595b;
        Handler handler = eVar.f14397f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f14398n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((l.d) arrayList.get(i10)).f14392b) {
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
        handler.postAtTime(new com.google.android.gms.internal.cast.p(this, dVar, mVar, kVar, false, 1), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public boolean w1() {
        return false;
    }

    @Override
    public String x(long j10) {
        return null;
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void y(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.f13595b;
        if (i10 == 0) {
            long j12 = oVar.f48545a;
            uVar = new u2.u(oVar.f48546b, j10);
        } else {
            long j13 = oVar.f48545a;
            g2.m mVar = oVar.f48546b;
            g2.b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        }
        gVar.f14513q.v(uVar, oVar.f48547c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public void z(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f13595b).f14397f.removeCallbacksAndMessages(kVar);
    }

    public w4(s6.g gVar, s6.a aVar) {
        this.f13594a = 27;
        this.f13595b = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public w4(int i10) {
        this.f13594a = i10;
        switch (i10) {
            case 24:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f13595b = new ai0(this);
                    return;
                } else {
                    this.f13595b = new ai0(this);
                    return;
                }
            case 28:
                return;
            default:
                this.f13595b = new ArrayDeque(16);
                return;
        }
    }

    @Override
    public float get() {
        rg.y0 y0Var = (rg.y0) this.f13595b;
        int i10 = y0Var.f44366a;
        qg.m currentBrush = y0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return qg.s0.e(i10).f43312i;
        }
        return qg.s0.e(i10).f("-1", currentBrush.d());
    }

    public w4(Context context, Uri uri) {
        this.f13594a = 9;
        this.f13595b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public w4(Context context, y20 y20Var) {
        this.f13594a = 13;
        this.f13595b = new x20(context, y20Var);
    }

    private final void f1(ArrayList arrayList) {
    }

    private final void h1(ArrayList arrayList) {
    }

    @Override
    public void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void C(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void E1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void G(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void H0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void H1(MessageObject messageObject) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(int i10) {
    }

    @Override
    public void J(int i10) {
    }

    @Override
    public void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void L0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void U0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void X1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void f2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void n(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void n0(String str) {
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
    public void r(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void x1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void y0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void O1() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void g1() {
    }

    @Override
    public void j() {
    }

    @Override
    public void j2() {
    }

    @Override
    public void o() {
    }

    @Override
    public void r2() {
    }

    @Override
    public void s() {
    }

    @Override
    public void s0() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void B1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void N1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
    }

    @Override
    public void P0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void P1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void Z1(org.telegram.ui.Cells.u1 u1Var, long j10) {
    }

    @Override
    public void i1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void onError(i81 i81Var, Exception exc) {
    }

    @Override
    public void y1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void S0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void s2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public void Q1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void l2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}
