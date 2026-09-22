package k2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.y5;
import org.telegram.ui.pv0;
import pg.u0;
import qg.w1;
import qg.x0;
import s4.c1;
import s4.p0;
import u2.d1;
import u2.e1;
import u2.p1;
import v7.u7;
public class e implements m.k, to0, o0.a, d1, l1, ah.k, me.a, w1, com.google.android.gms.common.api.internal.o, s4.e0, n5.b, v0.i, com.google.android.gms.common.api.internal.s {
    public final int f13243a;
    public Object f13244b;

    public e(int i10) {
        this.f13243a = i10;
    }

    @Override
    public boolean B1() {
        return false;
    }

    public void C(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.f13244b;
        int L = recyclerView.e.L();
        for (int i12 = 0; i12 < L; i12++) {
            c1 V = RecyclerView.V(recyclerView.e.K(i12));
            if (V != null && !V.r() && V.f42997c >= i10) {
                V.n(i11, false);
                recyclerView.f2862t0.f43156f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2839b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            c1 c1Var = (c1) arrayList.get(i13);
            if (c1Var != null && c1Var.f42997c >= i10) {
                c1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2866w0 = true;
    }

    @Override
    public void D(int i10, int i11) {
        ((s4.h0) this.f13244b).p(i10, i11);
    }

    public void G(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f13244b;
        int L = recyclerView.e.L();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < L; i20++) {
            c1 V = RecyclerView.V(recyclerView.e.K(i20));
            if (V != null && (i18 = V.f42997c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    V.n(i11 - i10, false);
                } else {
                    V.n(i14, false);
                }
                recyclerView.f2862t0.f43156f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2839b.e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            c1 c1Var = (c1) arrayList.get(i21);
            if (c1Var != null && (i17 = c1Var.f42997c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    c1Var.n(i11 - i10, false);
                } else {
                    c1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2866w0 = true;
    }

    @Override
    public boolean G1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    public void H() {
        o2.q[] qVarArr;
        o2.q[] qVarArr2;
        o2.k kVar = (o2.k) this.f13244b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (o2.q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.f43786a;
        }
        b2.l1[] l1VarArr = new b2.l1[i11];
        int i12 = 0;
        for (o2.q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.f43786a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                l1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new p1(l1VarArr);
        kVar.G.a(kVar);
    }

    @Override
    public boolean I1() {
        return false;
    }

    public boolean J(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: k2.e.J(android.view.MotionEvent):boolean");
    }

    public e K(int i10) {
        if (i10 == 16) {
            i10 = 12;
        }
        ((AudioAttributes.Builder) this.f13244b).setUsage(i10);
        return this;
    }

    @Override
    public void M0(int i10, int i11) {
        ((s4.h0) this.f13244b).t(i10, i11);
    }

    @Override
    public boolean N0(long j3) {
        return false;
    }

    @Override
    public void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public CharacterStyle O1(u1 u1Var) {
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ja jaVar = (ja) this.f13244b;
        org.telegram.ui.Cells.g gVar = jaVar.v;
        if (jaVar.a()) {
            jaVar.f20528s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public void Q0(int i10, u1 u1Var) {
        ja jaVar = (ja) this.f13244b;
        org.telegram.ui.Cells.g gVar = jaVar.v;
        if (jaVar.a()) {
            jaVar.f20528s = 2;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean Q1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    public void U(int i10) {
        K(i10);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public Object W() {
        if (n7.a.f15340b == null) {
            n7.a.f15340b = new Exception();
        }
        synchronized (n7.a.f15339a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override
    public void X(float f7, boolean z10) {
        mg.h hVar = (mg.h) this.f13244b;
        float f10 = hVar.f15056b;
        float z11 = e2.z(hVar.f15057c, f10, f7, f10);
        hVar.d = z11;
        if (z10) {
            q6 q6Var = hVar.e;
            q6Var.getClass();
            q6Var.c(null, z11);
        }
        hVar.invalidate();
    }

    @Override
    public boolean X0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public pv0 Y1() {
        return null;
    }

    @Override
    public boolean a0(u1 u1Var) {
        return false;
    }

    @Override
    public boolean a2(long j3) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        v8.j jVar = (v8.j) this.f13244b;
        e8.b bVar = (e8.b) obj;
        Bundle G = bVar.G();
        G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        e8.a aVar = new e8.a(0, (TaskCompletionSource) obj2);
        try {
            e8.i iVar = (e8.i) bVar.u();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.f8042a;
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f8050a.transact(19, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            Bundle bundle = Bundle.EMPTY;
            aVar.O(Status.h, null);
        }
    }

    @Override
    public void b(Canvas canvas) {
        switch (this.f13243a) {
            case 10:
                vi viVar = (vi) this.f13244b;
                canvas.drawColor(viVar.getThemedColor(j6.f19109d6));
                if (SharedConfig.chatBlurEnabled()) {
                    viVar.C2.b(canvas, -2);
                    return;
                }
                return;
            default:
                wq0 wq0Var = (wq0) this.f13244b;
                canvas.drawColor(wq0Var.getThemedColor(j6.f19109d6));
                if (SharedConfig.chatBlurEnabled()) {
                    wq0Var.O0.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean b0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void b2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        ja jaVar = (ja) this.f13244b;
        org.telegram.ui.Cells.g gVar = jaVar.v;
        if (jaVar.a()) {
            jaVar.f20528s = 0;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void c(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.f13244b);
    }

    @Override
    public boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13244b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                k4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public Cursor d(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13244b;
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
    public boolean d1(int i10, u1 u1Var) {
        if (i10 == ((ja) this.f13244b).f20528s) {
            return true;
        }
        return false;
    }

    @Override
    public boolean e() {
        return ((ja) this.f13244b).a();
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean forceEnableVibration() {
        return false;
    }

    public n4.a g() {
        return new n4.a(((AudioAttributes.Builder) this.f13244b).build());
    }

    @Override
    public Object mo28get() {
        String packageName = ((Context) ((fd.a) this.f13244b).mo28get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public CharSequence getContentDescription() {
        mg.h hVar = (mg.h) this.f13244b;
        float f7 = hVar.f15056b;
        return String.valueOf(Math.round((hVar.f15055a.getProgress() * (hVar.f15057c - f7)) + f7));
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public String h(u1 u1Var) {
        return null;
    }

    @Override
    public int i0(u1 u1Var) {
        return 0;
    }

    @Override
    public boolean i1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override
    public void k0(int i10, int i11) {
        ((s4.h0) this.f13244b).s(i10, i11);
    }

    @Override
    public void k1(int i10, int i11) {
        ((s4.h0) this.f13244b).r(i10, i11, null);
    }

    @Override
    public void l(e1 e1Var) {
        o2.q qVar = (o2.q) e1Var;
        o2.k kVar = (o2.k) this.f13244b;
        kVar.G.l(kVar);
    }

    @Override
    public int l0() {
        return 0;
    }

    @Override
    public boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void m(float f7) {
        x0 x0Var = (x0) this.f13244b;
        u0.e(x0Var.f42017a).k("-1", f7);
        x0Var.e.setBrushSize(f7);
    }

    @Override
    public boolean m0() {
        return e();
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        x61 x61Var = (x61) this.f13244b;
        float f11 = -dp;
        x61Var.f30233g.inset(f11, f11);
        boolean contains = x61Var.f30233g.contains(f7, f10);
        float f12 = dp;
        x61Var.f30233g.inset(f12, f12);
        return contains;
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((x61) this.f13244b).f30235j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        ((x61) this.f13244b).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        ((x61) this.f13244b).h.c(false);
    }

    @Override
    public void onError(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        zd.m mVar = (zd.m) this.f13244b;
        if (mVar.w()) {
            mVar.resumeWith(u7.a(e));
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        zd.m mVar = (zd.m) this.f13244b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public boolean p0(y5 y5Var) {
        return false;
    }

    public void q(s4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f13244b;
        int i10 = aVar.f42959a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        return;
                    }
                    recyclerView.f2867x.X(recyclerView, aVar.f42960b, aVar.d);
                    return;
                }
                recyclerView.f2867x.a0(recyclerView, aVar.f42960b, aVar.d, aVar.f42961c);
                return;
            }
            recyclerView.f2867x.Y(recyclerView, aVar.f42960b, aVar.d);
            return;
        }
        recyclerView.f2867x.V(recyclerView, aVar.f42960b, aVar.d);
    }

    public String v(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            ka.d dVar = (ka.d) this.f13244b;
            ka.e eVar = new ka.e(stringWriter, dVar.f13568a, dVar.f13569b, dVar.f13570c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f13572b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public boolean v2(int i10) {
        return false;
    }

    @Override
    public String w(long j3) {
        return null;
    }

    public void x(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f13244b;
        int L = recyclerView.e.L();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < L; i15++) {
            View K = recyclerView.e.K(i15);
            c1 V = RecyclerView.V(K);
            if (V != null && !V.r() && (i13 = V.f42997c) >= i10 && i13 < i14) {
                V.a(2);
                if (obj == null) {
                    V.a(1024);
                } else if ((1024 & V.f43003l) == 0) {
                    if (V.f43004m == null) {
                        ArrayList arrayList = new ArrayList();
                        V.f43004m = arrayList;
                        V.f43005n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    V.f43004m.add(obj);
                }
                ((p0) K.getLayoutParams()).f43103c = true;
            }
        }
        of.e eVar = recyclerView.f2839b;
        ArrayList arrayList2 = (ArrayList) eVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c1 c1Var = (c1) arrayList2.get(size);
            if (c1Var != null && (i12 = c1Var.f42997c) >= i10 && i12 < i14) {
                c1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.f2868x0 = true;
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void y(ah.a aVar) {
        switch (this.f13243a) {
            case 10:
                aVar.a(((vi) this.f13244b).getThemedColor(j6.f19109d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                aVar.a(((wq0) this.f13244b).getThemedColor(j6.f19109d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    @Override
    public s9 z2() {
        return null;
    }

    public e(Object obj, int i10) {
        this.f13243a = i10;
        this.f13244b = obj;
    }

    public e(TextView textView) {
        this.f13243a = 17;
        this.f13244b = new q1.g(textView);
    }

    @Override
    public float get() {
        x0 x0Var = (x0) this.f13244b;
        int i10 = x0Var.f42017a;
        pg.m currentBrush = x0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).f41328i;
        }
        return u0.e(i10).f("-1", currentBrush.d());
    }

    public e(Context context, Uri uri) {
        this.f13243a = 7;
        this.f13244b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public e(Context context, l20 l20Var) {
        this.f13243a = 11;
        this.f13244b = new k20(context, l20Var);
    }

    public e() {
        this.f13243a = 5;
        this.f13244b = new AudioAttributes.Builder();
    }

    public e(int i10, int i11) {
        this.f13243a = 12;
        this.f13244b = ApplicationLoader.applicationContext.getSharedPreferences(a4.a.l(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override
    public void A0() {
    }

    @Override
    public void B() {
    }

    @Override
    public void R1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void l1() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q2() {
    }

    @Override
    public void s() {
    }

    @Override
    public void x2() {
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void D1(u1 u1Var) {
    }

    @Override
    public void E0(u1 u1Var) {
    }

    @Override
    public void F(u1 u1Var) {
    }

    @Override
    public void G0(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(u1 u1Var) {
    }

    @Override
    public void K1(u1 u1Var) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void M1(MessageObject messageObject) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void O0(u1 u1Var) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void Y0(u1 u1Var) {
    }

    @Override
    public void a1(u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void e2(u1 u1Var) {
    }

    @Override
    public void j0(u1 u1Var) {
    }

    @Override
    public void m2(u1 u1Var) {
    }

    @Override
    public void o(u1 u1Var) {
    }

    @Override
    public void o0(String str) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void z(u1 u1Var) {
    }

    @Override
    public void z0(u1 u1Var) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void E1(u1 u1Var, boolean z10) {
    }

    @Override
    public void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void S0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void g2(u1 u1Var, long j3) {
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
    }

    @Override
    public void n1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void q1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void B0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void C0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void W0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void g0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override
    public void r0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void v1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void y2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void U1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void w0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
