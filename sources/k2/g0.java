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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.d30;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.pv0;
import org.telegram.ui.ss0;
import qg.n2;
import qg.v1;
import s4.j1;
import s4.p0;
import s4.q0;
import u2.b1;
import u2.c1;
import u2.n1;
import v7.a8;
import w7.u8;
public final class g0 implements n, e2, y2.g, m.k, n5.b, o0.a, b1, l1, ah.j, lg.e, i81, a2, com.google.android.gms.common.api.internal.s, v1, r4.c, com.google.android.gms.common.api.internal.o, j1, v0.i {
    public final int f14468a;
    public Object f14469b;

    public g0(int i10) {
        this.f14468a = i10;
    }

    @Override
    public boolean A2(int i10) {
        return false;
    }

    @Override
    public void B0(ah.a aVar) {
        aVar.a(((yi) this.f14469b).getThemedColor(h6.f20822d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public void C(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f14469b;
        if (i10 == 0) {
            long j11 = oVar.f51820a;
            tVar = new u2.t(oVar.f51821b);
        } else {
            long j12 = oVar.f51820a;
            Uri uri = oVar.d.f10234c;
            tVar = new u2.t(j10);
        }
        hVar.f15380q.u(tVar, oVar.f51822c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public void D(c1 c1Var) {
        o2.q qVar = (o2.q) c1Var;
        o2.k kVar = (o2.k) this.f14469b;
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
        l2.h hVar = (l2.h) this.f14469b;
        long j12 = oVar.f51820a;
        Uri uri = oVar.d.f10234c;
        u2.t tVar = new u2.t(j10);
        hVar.f15376m.getClass();
        hVar.f15380q.q(tVar, oVar.f51822c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f51824f;
        m2.c cVar2 = hVar.H;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f15982m.size();
        }
        long j13 = cVar.b(0).f16001b;
        int i11 = 0;
        while (i11 < size && hVar.H.b(i11).f16001b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.f15982m.size()) {
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
            if (i12 < hVar.f15376m.m3(oVar.f51822c)) {
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
        synchronized (hVar.f15383t) {
            try {
                if (oVar.f51821b.f10266a.equals(hVar.F)) {
                    Uri uri2 = hVar.H.f15980k;
                    if (uri2 == null) {
                        uri2 = u8.a(oVar.d.f10234c);
                    }
                    hVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = hVar.H;
        if (cVar3.d && hVar.L == j11) {
            pf.b bVar = cVar3.f15978i;
            if (bVar != null) {
                String str = (String) bVar.f45626b;
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
                        hVar.z(bVar, new ob.a(12));
                        return;
                    }
                    hVar.z(bVar, new Object());
                    return;
                }
                try {
                    hVar.L = e2.d0.S((String) bVar.f45627c) - hVar.K;
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
        ((wf0) this.f14469b).f32682b.k();
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
        ((ProfileInstallReceiver) this.f14469b).setResultCode(i10);
    }

    @Override
    public void K() {
        ((wf0) this.f14469b).f32682b.o();
    }

    @Override
    public void K0(float f7) {
        wf0 wf0Var = (wf0) this.f14469b;
        wf0Var.f32682b.setRotation(f7);
        wf0Var.getClass();
        vf0 vf0Var = wf0Var.f32681a;
        if (vf0Var != null) {
            ((ss0) vf0Var).a(false);
        }
    }

    public void M0() {
        o2.q[] qVarArr;
        o2.q[] qVarArr2;
        o2.k kVar = (o2.k) this.f14469b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (o2.q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.f48772a;
        }
        b2.l1[] l1VarArr = new b2.l1[i11];
        int i12 = 0;
        for (o2.q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.f48772a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                l1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new n1(l1VarArr);
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
        ((l2.h) this.f14469b).w((y2.o) iVar, j10);
    }

    @Override
    public boolean O1() {
        return false;
    }

    @Override
    public void P(int i10, long j3, long j10) {
        n4.x xVar = ((h0) this.f14469b).X0;
        Handler handler = (Handler) xVar.f16694b;
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
        int read = ((com.google.firebase.messaging.d) this.f14469b).read();
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
        switch (this.f14468a) {
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void V0(int i10, u1 u1Var) {
        ga gaVar = (ga) this.f14469b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f22199s = 2;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ga gaVar = (ga) this.f14469b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f22199s = 2;
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
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f14469b;
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
        h0 h0Var = (h0) this.f14469b;
        synchronized (h0Var.f11643a) {
            pVar = h0Var.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    public void Z0(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f14469b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override
    public void a(long j3) {
        n4.x xVar = ((h0) this.f14469b).X0;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new ai.j(xVar, j3, 13));
        }
    }

    @Override
    public void a0() {
        ((wf0) this.f14469b).f32682b.f15611a.g(1, true);
    }

    public void a1(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((com.google.firebase.messaging.d) this.f14469b).skip(j3 - j10);
            if (skip > 0) {
                j10 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f14468a) {
            case 18:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                Parcel H0 = aVar.H0();
                k7.a.c(H0, (n6.p) this.f14469b);
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
                k7.a.c(H02, (s6.a) this.f14469b);
                H02.writeStrongBinder(null);
                eVar.I0(H02, 2);
                return;
            default:
                v8.j jVar = (v8.j) this.f14469b;
                e8.b bVar = (e8.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                e8.a aVar2 = new e8.a(0, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.f8700a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    iVar.f8708a.transact(19, obtain, null, 1);
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
        return ((p0) this.f14469b).G();
    }

    @Override
    public int c0() {
        p0 p0Var = (p0) this.f14469b;
        return p0Var.f47898n - p0Var.C();
    }

    @Override
    public boolean c1(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f14469b;
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
        ((h0) this.f14469b).f14481i1 = true;
    }

    @Override
    public a0.i d0() {
        switch (this.f14468a) {
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean e() {
        return ((ga) this.f14469b).a();
    }

    @Override
    public boolean e0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public pv0 e2() {
        return null;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void f0(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        n4.x xVar = ((h0) this.f14469b).X0;
        Handler handler = (Handler) xVar.f16694b;
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
        return this.f14469b;
    }

    @Override
    public void h(int i10) {
        switch (this.f14468a) {
            case 15:
                jr0 jr0Var = (jr0) this.f14469b;
                nr0 nr0Var = jr0Var.K;
                jr0Var.f27827s = i10;
                if (jr0Var.v != i10) {
                    jr0Var.d.clear();
                }
                int i11 = jr0Var.J;
                if (jr0Var.h() == 0 && !jr0Var.f27823e.e() && !jr0Var.I) {
                    nr0Var.Q.e(false, true);
                } else {
                    nr0Var.f29263x0.b(i11);
                }
                jr0Var.l();
                int i12 = nr0.f29231a1;
                nr0Var.L0(true);
                return;
            default:
                org.telegram.ui.Wallet.u8 u8Var = (org.telegram.ui.Wallet.u8) this.f14469b;
                if (!u8Var.f35649n && i10 == u8Var.I) {
                    u8Var.d0(u8Var.M.getText().toString().trim());
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
        ga gaVar = (ga) this.f14469b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f22199s = 0;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean i0() {
        vf0 vf0Var = ((wf0) this.f14469b).f32681a;
        if (vf0Var == null) {
            return false;
        }
        PhotoViewer photoViewer = ((ss0) vf0Var).f41883a;
        Drawable[] drawableArr = PhotoViewer.U8;
        return photoViewer.O0(-90.0f, false, null);
    }

    @Override
    public boolean i1(int i10, u1 u1Var) {
        if (i10 == ((ga) this.f14469b).f22199s) {
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
        ((h0) this.f14469b).f14479g1 = true;
    }

    @Override
    public void l(Canvas canvas) {
        yi yiVar = (yi) this.f14469b;
        canvas.drawColor(yiVar.getThemedColor(h6.f20822d6));
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
        l.e eVar = (l.e) this.f14469b;
        Handler handler = eVar.f15254f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f15255n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((l.d) arrayList.get(i10)).f15248b) {
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
        n4.x xVar = ((h0) this.f14469b).X0;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new h(xVar, kVar, 0));
        }
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        r2.k kVar;
        h0 h0Var = (h0) this.f14469b;
        if (Build.VERSION.SDK_INT >= 35 && (kVar = h0Var.Z0) != null) {
            kVar.d(i10);
        }
        n4.x xVar = h0Var.X0;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new p8(xVar, i10, 11));
        }
    }

    @Override
    public void onError(l81 l81Var, Exception exc) {
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        ae.m mVar = (ae.m) this.f14469b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n4.x xVar = ((h0) this.f14469b).X0;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new bi.f(8, xVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        ml0 ml0Var = (ml0) this.f14469b;
        if (z10 && ml0Var.f28881n.n() >= 0) {
            ml0Var.f28884w = true;
        }
        ih0 ih0Var = ml0Var.f28880f;
        yc0 yc0Var = ml0Var.f28885x;
        ih0Var.a(z10, true);
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
    public boolean p0() {
        return e();
    }

    @Override
    public boolean q() {
        vf0 vf0Var = ((wf0) this.f14469b).f32681a;
        if (vf0Var != null) {
            PhotoViewer photoViewer = ((ss0) vf0Var).f41883a;
            Drawable[] drawableArr = PhotoViewer.U8;
            return photoViewer.N0();
        }
        return false;
    }

    @Override
    public void q0(float f7) {
        ((n2) this.f14469b).setOutlineWidth(f7);
    }

    @Override
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean s0(int i10) {
        switch (this.f14468a) {
            case 15:
                if (i10 == ((jr0) this.f14469b).f27826r) {
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
        return ((p0) this.f14469b).q(i10);
    }

    @Override
    public void v() {
        i2.j0 j0Var = ((h0) this.f14469b).W;
        if (j0Var != null) {
            j0Var.f11757a.f11846g0 = true;
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
        androidx.activity.n nVar2 = ((r7.i) this.f14469b).f47133b;
        synchronized (nVar2) {
            nVar2.f2147b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) nVar2.f2148c).f6654c;
        }
        if (nVar != null) {
            ((r7.c) nVar2.d).c(nVar, 2441);
        }
    }

    @Override
    public void x0(ArrayList arrayList) {
        int i10 = this.f14468a;
    }

    @Override
    public k4.d y(y2.i r4, long r5, long r7, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: k2.g0.y(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public void y0() {
        i2.j0 j0Var = ((h0) this.f14469b).W;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override
    public void z(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f14469b).f15254f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public void z0(k kVar) {
        n4.x xVar = ((h0) this.f14469b).X0;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new h(xVar, kVar, 1));
        }
    }

    public g0(Object obj, int i10) {
        this.f14468a = i10;
        this.f14469b = obj;
    }

    @Override
    public float get() {
        return ((n2) this.f14469b).F;
    }

    @Override
    public void onError(Object obj) {
        w0.d e7 = (w0.d) obj;
        kotlin.jvm.internal.i.e(e7, "e");
        ae.m mVar = (ae.m) this.f14469b;
        if (mVar.w()) {
            mVar.resumeWith(a8.a(e7));
        }
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public g0(s6.g gVar, s6.a aVar) {
        this.f14468a = 25;
        this.f14469b = aVar;
    }

    public g0(ArrayList arrayList) {
        this.f14468a = 22;
        this.f14469b = DesugarCollections.unmodifiableList(arrayList);
    }

    public g0(Context context, Uri uri) {
        this.f14468a = 8;
        this.f14469b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public g0(Context context, d30 d30Var) {
        this.f14468a = 12;
        this.f14469b = new c30(context, d30Var);
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
