package k2;

import ai.p8;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
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
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import b2.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.i4;
import com.google.android.gms.tasks.TaskCompletionSource;
import gg.a2;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import m.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.s8;
import org.telegram.ui.qv0;
import org.telegram.ui.ts0;
import qg.o2;
import qg.v1;
import s4.j1;
import s4.p0;
import s4.q0;
import u2.c1;
import u2.d1;
import u2.o1;
import v7.a8;
import w7.u8;
public final class g0 implements n, e2, y2.g, m.k, n5.b, o0.a, c1, l1, ah.j, lg.e, h81, a2, com.google.android.gms.common.api.internal.s, v1, r4.c, com.google.android.gms.common.api.internal.o, j1, v0.i {
    public final int f14469a;
    public Object f14470b;

    public g0(int i10) {
        this.f14469a = i10;
    }

    @Override
    public boolean A2(int i10) {
        return false;
    }

    @Override
    public void B0(ah.a aVar) {
        aVar.a(((yi) this.f14470b).getThemedColor(i6.f20797d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public void C(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f14470b;
        if (i10 == 0) {
            long j11 = oVar.f51699a;
            tVar = new u2.t(oVar.f51700b);
        } else {
            long j12 = oVar.f51699a;
            Uri uri = oVar.d.f10235c;
            tVar = new u2.t(j10);
        }
        hVar.f15341q.u(tVar, oVar.f51701c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public void D(d1 d1Var) {
        o2.q qVar = (o2.q) d1Var;
        o2.k kVar = (o2.k) this.f14470b;
        kVar.G.D(kVar);
    }

    @Override
    public boolean D0(MessageObject messageObject) {
        return true;
    }

    @Override
    public p9 E2() {
        return null;
    }

    @Override
    public void F(y2.i iVar, long j3, long j10) {
        int size;
        int i10;
        boolean z10;
        long j11;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f14470b;
        long j12 = oVar.f51699a;
        Uri uri = oVar.d.f10235c;
        u2.t tVar = new u2.t(j10);
        hVar.f15337m.getClass();
        hVar.f15341q.q(tVar, oVar.f51701c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f51703f;
        m2.c cVar2 = hVar.H;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f15921m.size();
        }
        long j13 = cVar.b(0).f15940b;
        int i11 = 0;
        while (i11 < size && hVar.H.b(i11).f15940b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.f15921m.size()) {
                e2.a.n("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j11 = -9223372036854775807L;
                long j14 = hVar.N;
                if (j14 != -9223372036854775807L) {
                    i10 = i11;
                    z10 = true;
                    if (cVar.h * 1000 <= j14) {
                        e2.a.n("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.N);
                    }
                } else {
                    i10 = i11;
                    z10 = true;
                }
                hVar.M = 0;
            }
            int i12 = hVar.M;
            hVar.M = i12 + 1;
            if (i12 < hVar.f15337m.m3(oVar.f51701c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.M - 1) * 1000, 5000));
                return;
            }
            hVar.C = new IOException();
            return;
        }
        i10 = i11;
        z10 = true;
        j11 = -9223372036854775807L;
        hVar.H = cVar;
        hVar.I = cVar.d & hVar.I;
        hVar.J = j3 - j10;
        hVar.K = j3;
        hVar.O += i10;
        synchronized (hVar.f15344t) {
            try {
                if (oVar.f51700b.f10267a.equals(hVar.F)) {
                    Uri uri2 = hVar.H.f15919k;
                    if (uri2 == null) {
                        uri2 = u8.a(oVar.d.f10235c);
                    }
                    hVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = hVar.H;
        if (cVar3.d && hVar.L == j11) {
            c5.a aVar = cVar3.f15917i;
            if (aVar != null) {
                String str = aVar.f4198b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                hVar.x(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                hVar.v();
                                return;
                            }
                        }
                        hVar.z(aVar, new ob.a(12));
                        return;
                    }
                    hVar.z(aVar, new Object());
                    return;
                }
                try {
                    hVar.L = e2.d0.S(aVar.f4199c) - hVar.K;
                    hVar.y(z10);
                    return;
                } catch (s0 e7) {
                    hVar.x(e7);
                    return;
                }
            }
            hVar.v();
            return;
        }
        hVar.y(true);
    }

    @Override
    public void H() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public boolean H1() {
        return false;
    }

    @Override
    public void I0() {
        ((vf0) this.f14470b).f31768b.k();
    }

    @Override
    public void J(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f14470b).setResultCode(i10);
    }

    @Override
    public void K() {
        ((vf0) this.f14470b).f31768b.o();
    }

    @Override
    public void K0(float f7) {
        vf0 vf0Var = (vf0) this.f14470b;
        vf0Var.f31768b.setRotation(f7);
        vf0Var.getClass();
        uf0 uf0Var = vf0Var.f31767a;
        if (uf0Var != null) {
            ((ts0) uf0Var).a(false);
        }
    }

    public void M0() {
        o2.q[] qVarArr;
        o2.q[] qVarArr2;
        o2.k kVar = (o2.k) this.f14470b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (o2.q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.f48676a;
        }
        b2.l1[] l1VarArr = new b2.l1[i11];
        int i12 = 0;
        for (o2.q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.f48676a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                l1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new o1(l1VarArr);
        kVar.G.m(kVar);
    }

    @Override
    public boolean M1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void O0(y2.i iVar, long j3, long j10, boolean z10) {
        ((l2.h) this.f14470b).w((y2.o) iVar, j10);
    }

    @Override
    public boolean O1() {
        return false;
    }

    @Override
    public void P(int i10, long j3, long j10) {
        n4.x xVar = ((h0) this.f14470b).X0;
        Handler handler = (Handler) xVar.f16612b;
        if (handler != null) {
            handler.post(new i(xVar, i10, j3, j10, 0));
        }
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R(u1 u1Var) {
        return false;
    }

    @Override
    public boolean R0(long j3) {
        return false;
    }

    @Override
    public boolean S() {
        return false;
    }

    public boolean T0(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: k2.g0.T0(android.view.MotionEvent):boolean");
    }

    @Override
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(u1Var.getContext(), str);
    }

    public byte U0() {
        int read = ((com.google.firebase.messaging.d) this.f14470b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public CharacterStyle U1(u1 u1Var) {
        return null;
    }

    @Override
    public a0.i V() {
        switch (this.f14469a) {
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void V0(int i10, u1 u1Var) {
        ga gaVar = (ga) this.f14470b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f22171s = 2;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ga gaVar = (ga) this.f14470b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f22171s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public int W() {
        return 0;
    }

    public int W0() {
        return ((U0() & 255) << 24) | ((U0() & 255) << 16) | ((U0() & 255) << 8) | (U0() & 255);
    }

    @Override
    public boolean W1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public Cursor X(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f14470b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e7) {
            Log.w("FontsProvider", "Unable to query the content provider", e7);
            return null;
        }
    }

    @Override
    public hh.a Y() {
        return null;
    }

    public int Y0() {
        return ((U0() & Byte.MAX_VALUE) << 21) | ((U0() & Byte.MAX_VALUE) << 14) | ((U0() & Byte.MAX_VALUE) << 7) | (U0() & Byte.MAX_VALUE);
    }

    @Override
    public void Z() {
        x2.p pVar;
        h0 h0Var = (h0) this.f14470b;
        synchronized (h0Var.f11644a) {
            pVar = h0Var.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    public void Z0(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f14470b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override
    public void a(long j3) {
        n4.x xVar = ((h0) this.f14470b).X0;
        Handler handler = (Handler) xVar.f16612b;
        if (handler != null) {
            handler.post(new ai.j(xVar, j3, 13));
        }
    }

    @Override
    public void a0() {
        ((vf0) this.f14470b).f31768b.f15572a.g(1, true);
    }

    public void a1(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((com.google.firebase.messaging.d) this.f14470b).skip(j3 - j10);
            if (skip > 0) {
                j10 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f14469a) {
            case 18:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                Parcel H0 = aVar.H0();
                k7.a.c(H0, (n6.o) this.f14470b);
                try {
                    aVar.f336b.transact(1, H0, null, 1);
                    H0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    H0.recycle();
                    throw th2;
                }
            case 25:
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel H02 = eVar.H0();
                k7.a.d(H02, fVar);
                k7.a.c(H02, (s6.a) this.f14470b);
                H02.writeStrongBinder(null);
                eVar.I0(H02, 2);
                return;
            default:
                v8.j jVar = (v8.j) this.f14470b;
                e8.b bVar = (e8.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                e8.a aVar2 = new e8.a(0, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.f8701a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    iVar.f8709a.transact(19, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e7) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e7);
                    Bundle bundle = Bundle.EMPTY;
                    aVar2.O(Status.h, null);
                    return;
                }
        }
    }

    @Override
    public int b(View view) {
        return p0.z(view) - ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).topMargin;
    }

    @Override
    public boolean b0(u1 u1Var) {
        return false;
    }

    @Override
    public boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public int c() {
        return ((p0) this.f14470b).G();
    }

    @Override
    public int c0() {
        p0 p0Var = (p0) this.f14470b;
        return p0Var.f47774n - p0Var.C();
    }

    @Override
    public boolean c1(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f14470b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                i4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public void d() {
        ((h0) this.f14470b).f14482i1 = true;
    }

    @Override
    public a0.i d0() {
        switch (this.f14469a) {
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean e() {
        return ((ga) this.f14470b).a();
    }

    @Override
    public boolean e0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public qv0 e2() {
        return null;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void f0(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        n4.x xVar = ((h0) this.f14470b).X0;
        Handler handler = (Handler) xVar.f16612b;
        if (handler != null) {
            handler.post(new f(xVar, exc, 1));
        }
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    @Override
    public boolean g2(long j3) {
        return false;
    }

    @Override
    public Object mo27get() {
        return this.f14470b;
    }

    @Override
    public void h(int i10) {
        switch (this.f14469a) {
            case 15:
                ir0 ir0Var = (ir0) this.f14470b;
                mr0 mr0Var = ir0Var.K;
                ir0Var.f27473s = i10;
                if (ir0Var.v != i10) {
                    ir0Var.d.clear();
                }
                int i11 = ir0Var.J;
                if (ir0Var.h() == 0 && !ir0Var.f27469e.e() && !ir0Var.I) {
                    mr0Var.Q.e(false, true);
                } else {
                    mr0Var.f28924x0.b(i11);
                }
                ir0Var.l();
                int i12 = mr0.f28892a1;
                mr0Var.L0(true);
                return;
            default:
                s8 s8Var = (s8) this.f14470b;
                if (!s8Var.f35492n && i10 == s8Var.I) {
                    s8Var.d0(s8Var.M.getText().toString().trim());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        ga gaVar = (ga) this.f14470b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f22171s = 0;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean i0() {
        uf0 uf0Var = ((vf0) this.f14470b).f31767a;
        if (uf0Var == null) {
            return false;
        }
        PhotoViewer photoViewer = ((ts0) uf0Var).f42119a;
        Drawable[] drawableArr = PhotoViewer.U8;
        return photoViewer.O0(-90.0f, false, null);
    }

    @Override
    public boolean i1(int i10, u1 u1Var) {
        if (i10 == ((ga) this.f14470b).f22171s) {
            return true;
        }
        return false;
    }

    @Override
    public boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void k0() {
        ((h0) this.f14470b).f14480g1 = true;
    }

    @Override
    public void l(Canvas canvas) {
        yi yiVar = (yi) this.f14470b;
        canvas.drawColor(yiVar.getThemedColor(i6.f20797d6));
        if (SharedConfig.chatBlurEnabled()) {
            yiVar.F2.b(canvas, -2);
        }
    }

    @Override
    public int l0(u1 u1Var) {
        return 0;
    }

    @Override
    public void n0(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f14470b;
        Handler handler = eVar.f15215f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f15216n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((l.d) arrayList.get(i10)).f15209b) {
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
    public boolean n1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public void o0(k kVar) {
        n4.x xVar = ((h0) this.f14470b).X0;
        Handler handler = (Handler) xVar.f16612b;
        if (handler != null) {
            handler.post(new h(xVar, kVar, 0));
        }
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        r2.k kVar;
        h0 h0Var = (h0) this.f14470b;
        if (Build.VERSION.SDK_INT >= 35 && (kVar = h0Var.Z0) != null) {
            kVar.d(i10);
        }
        n4.x xVar = h0Var.X0;
        Handler handler = (Handler) xVar.f16612b;
        if (handler != null) {
            handler.post(new p8(xVar, i10, 11));
        }
    }

    @Override
    public void onError(k81 k81Var, Exception exc) {
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        ae.m mVar = (ae.m) this.f14470b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n4.x xVar = ((h0) this.f14470b).X0;
        Handler handler = (Handler) xVar.f16612b;
        if (handler != null) {
            handler.post(new bi.f(8, xVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        ll0 ll0Var = (ll0) this.f14470b;
        if (z10 && ll0Var.f28479n.n() >= 0) {
            ll0Var.f28482w = true;
        }
        hh0 hh0Var = ll0Var.f28478f;
        bd0 bd0Var = ll0Var.f28483x;
        hh0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(bd0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(bd0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean p0() {
        return e();
    }

    @Override
    public boolean q() {
        uf0 uf0Var = ((vf0) this.f14470b).f31767a;
        if (uf0Var != null) {
            PhotoViewer photoViewer = ((ts0) uf0Var).f42119a;
            Drawable[] drawableArr = PhotoViewer.U8;
            return photoViewer.N0();
        }
        return false;
    }

    @Override
    public void q0(float f7) {
        ((o2) this.f14470b).setOutlineWidth(f7);
    }

    @Override
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean s0(int i10) {
        switch (this.f14469a) {
            case 15:
                if (i10 == ((ir0) this.f14470b).f27472r) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean t0(b6 b6Var) {
        return false;
    }

    @Override
    public View u0(int i10) {
        return ((p0) this.f14470b).q(i10);
    }

    @Override
    public void v() {
        i2.j0 j0Var = ((h0) this.f14470b).W;
        if (j0Var != null) {
            j0Var.f11758a.f11847g0 = true;
        }
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public int w0(View view) {
        return p0.v(view) + ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public void x(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        g8.c cVar = (g8.c) obj;
        androidx.activity.n nVar2 = ((r7.i) this.f14470b).f47009b;
        synchronized (nVar2) {
            nVar2.f2147b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) nVar2.f2148c).f6655c;
        }
        if (nVar != null) {
            ((r7.c) nVar2.d).c(nVar, 2441);
        }
    }

    @Override
    public void x0(ArrayList arrayList) {
        int i10 = this.f14469a;
    }

    @Override
    public k4.d y(y2.i r4, long r5, long r7, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: k2.g0.y(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public void y0() {
        i2.j0 j0Var = ((h0) this.f14470b).W;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override
    public void z(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f14470b).f15215f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public void z0(k kVar) {
        n4.x xVar = ((h0) this.f14470b).X0;
        Handler handler = (Handler) xVar.f16612b;
        if (handler != null) {
            handler.post(new h(xVar, kVar, 1));
        }
    }

    public g0(Object obj, int i10) {
        this.f14469a = i10;
        this.f14470b = obj;
    }

    @Override
    public float get() {
        return ((o2) this.f14470b).F;
    }

    @Override
    public void onError(Object obj) {
        w0.d e7 = (w0.d) obj;
        kotlin.jvm.internal.i.e(e7, "e");
        ae.m mVar = (ae.m) this.f14470b;
        if (mVar.w()) {
            mVar.resumeWith(a8.a(e7));
        }
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public g0(s6.g gVar, s6.a aVar) {
        this.f14469a = 25;
        this.f14470b = aVar;
    }

    public g0(ArrayList arrayList) {
        this.f14469a = 22;
        this.f14470b = DesugarCollections.unmodifiableList(arrayList);
    }

    public g0(Context context, Uri uri) {
        this.f14469a = 8;
        this.f14470b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public g0(Context context, c30 c30Var) {
        this.f14469a = 12;
        this.f14470b = new b30(context, c30Var);
    }

    @Override
    public void C2() {
    }

    @Override
    public void F0() {
    }

    @Override
    public void X1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q1() {
    }

    @Override
    public void s() {
    }

    @Override
    public void w2() {
    }

    private final void P0(ArrayList arrayList) {
    }

    private final void Q0(ArrayList arrayList) {
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void E0(u1 u1Var) {
    }

    @Override
    public void G(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(u1 u1Var) {
    }

    @Override
    public void J1(u1 u1Var) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void L0(u1 u1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(u1 u1Var) {
    }

    @Override
    public void Q1(u1 u1Var) {
    }

    @Override
    public void S0(u1 u1Var) {
    }

    @Override
    public void S1(MessageObject messageObject) {
    }

    @Override
    public void U(u1 u1Var) {
    }

    @Override
    public void d1(u1 u1Var) {
    }

    @Override
    public void f1(u1 u1Var) {
    }

    @Override
    public void g0(int i10) {
    }

    @Override
    public void k2(u1 u1Var) {
    }

    @Override
    public void m0(u1 u1Var) {
    }

    @Override
    public void o(u1 u1Var) {
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
    public void r(u1 u1Var) {
    }

    @Override
    public void r0(String str) {
    }

    @Override
    public void s2(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K1(u1 u1Var, boolean z10) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void X0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
    }

    @Override
    public void m2(u1 u1Var, long j3) {
    }

    @Override
    public void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void v1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void A1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void D2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void G0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void H0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void b1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void j0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void A0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void C0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void y2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}
