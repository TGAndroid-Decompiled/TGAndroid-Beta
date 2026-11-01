package l2;

import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import m.x0;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bb;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.j0;
import org.telegram.messenger.js;
import org.telegram.messenger.kj;
import org.telegram.messenger.nc;
import org.telegram.messenger.p0;
import org.telegram.messenger.su;
import org.telegram.messenger.tu;
import org.telegram.messenger.wv;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.o0;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.voip.i2;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.y51;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.k9;
import org.telegram.ui.qe;
import org.telegram.ui.t9;
import org.telegram.ui.vn0;
import org.telegram.ui.web.z0;
import org.telegram.ui.xt;
import org.telegram.ui.zp0;
import qh.i0;
import qh.m0;
import r7.x;
import s4.c0;
import s4.c1;
import s4.g0;
import t7.u;
public class f implements x0, n5.b, bb, ge.a, nn0, vn0, eg.p, nc, t9, s, c0 {
    public final int f11587a;
    public Object f11588b;

    public f(int i10, boolean z10) {
        this.f11587a = i10;
    }

    public void B(int i10) {
        boolean z10;
        TLRPC.TL_exportedNoPaidMessagesToken c10;
        m0 m0Var = ((i0) this.f11588b).e;
        if (m0Var != null && m0Var.d != i10) {
            boolean z11 = true;
            if (m0Var.f45700c.d && i10 == 2) {
                i10 = 1;
            }
            m0Var.d = i10;
            SharedPreferences.Editor edit = m0Var.f().edit();
            if (m0Var.d == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            edit.putBoolean("qrNoPaidPermanent", z10).apply();
            int i11 = m0Var.d;
            if (i11 == 0) {
                if (m0Var.f45702n != 0) {
                    ConnectionsManager.getInstance(m0Var.f45698a).cancelRequest(m0Var.f45702n, true);
                    m0Var.f45702n = 0;
                    return;
                }
                return;
            }
            if (i11 == 2 && (c10 = m0Var.c()) != null) {
                m0Var.f45701f = c10;
                m0Var.f45699b.setFreeLink(m0Var.d(c10));
            }
            if (m0Var.d != 1) {
                z11 = false;
            }
            m0Var.n(false, z11);
        }
    }

    @Override
    public void C() {
        int i10 = this.f11587a;
    }

    @Override
    public void E(int i10, int i11) {
        ((g0) this.f11588b).j(i10, i11);
    }

    @Override
    public void G0() {
        switch (this.f11587a) {
            case 11:
                tu tuVar = (tu) this.f11588b;
                tu.i0(tuVar, null);
                tuVar.f18308a0 = null;
                return;
            default:
                ((y51) this.f11588b).h.c(false);
                return;
        }
    }

    @Override
    public boolean I1() {
        switch (this.f11587a) {
            case 11:
                return true;
            default:
                return false;
        }
    }

    @Override
    public void L(String str) {
        z0 z0Var = (z0) this.f11588b;
        try {
            z0Var.P = System.currentTimeMillis();
            z0Var.x("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            f8.g(e, true);
        }
    }

    @Override
    public void N(float f7, float f10) {
        wv wvVar;
        l1 l1Var;
        switch (this.f11587a) {
            case 11:
                tu tuVar = (tu) this.f11588b;
                su suVar = tuVar.f18308a0;
                if (suVar != null && (l1Var = (wvVar = tuVar.f17967a).F) != null) {
                    l1Var.W0(wvVar.E, suVar.f18146c);
                    return;
                }
                return;
            default:
                Runnable runnable = ((y51) this.f11588b).f32732j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public void O(long j10, long j11, long j12, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f11588b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j10);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray();
            longSparseArray.put(j10, longSparseArray2);
        }
        LongSparseArray longSparseArray3 = (LongSparseArray) longSparseArray2.get(j11);
        if (longSparseArray3 == null) {
            longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j11, longSparseArray3);
        }
        longSparseArray3.get(j12);
        longSparseArray3.put(j12, obj);
    }

    public Object P(long j10, long j11, long j12) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.f11588b).get(j10);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j11)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j12);
        longSparseArray.remove(j12);
        return obj;
    }

    @Override
    public String P0() {
        return ((z0) this.f11588b).f43071i0;
    }

    public void Q() {
        ((z2) this.f11588b).f21609o0 = false;
    }

    @Override
    public void Q0(int i10, int i11) {
        ((g0) this.f11588b).p(i10, i11);
    }

    public void R(qe qeVar) {
        ((z2) this.f11588b).H0 = qeVar;
    }

    public void S() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f11588b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long U = U();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + U);
    }

    public void T(long j10) {
        long U = U();
        if (U != j10) {
            if (U != -1) {
                if (U == -2) {
                    U = -2;
                } else {
                    return;
                }
            }
            StringBuilder s10 = a1.g.s(j10, "expected non-string scope or scope ", " but found ");
            s10.append(U);
            throw new IOException(s10.toString());
        }
    }

    public long U() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f11588b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void V() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((b40) this.f11588b).f24618a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public boolean V0(float f7, float f10) {
        switch (this.f11587a) {
            case 11:
                tu tuVar = (tu) this.f11588b;
                su h02 = tu.h0(tuVar, f7, f10);
                h02 = (h02 == null || h02.f18145b) ? null : null;
                tuVar.f18308a0 = h02;
                if (h02 != null) {
                    return true;
                }
                return false;
            default:
                int L = org.telegram.messenger.i0.L(9.0f);
                RectF rectF = ((y51) this.f11588b).f32730g;
                float f11 = -L;
                rectF.inset(f11, f11);
                boolean contains = rectF.contains(f7, f10);
                float f12 = L;
                rectF.inset(f12, f12);
                return contains;
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        x xVar = (x) ((r7.k) obj).v();
        r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
        Parcel P0 = xVar.P0();
        int i10 = r7.d.f46352a;
        P0.writeInt(1);
        ((g8.c) this.f11588b).writeToParcel(P0, 0);
        r7.d.c(P0, fVar);
        P0.writeString(null);
        xVar.T0(P0, 63);
    }

    @Override
    public void b(ArrayList arrayList) {
        b40.a((b40) this.f11588b, false, arrayList);
    }

    @Override
    public void d() {
        ae0 ae0Var = ((be0) this.f11588b).f24714a;
        if (ae0Var != null) {
            ((zp0) ae0Var).f44037a.f33477e0.invalidate();
        }
    }

    @Override
    public boolean d1(View view, float f7, float f10) {
        switch (this.f11587a) {
            case 11:
                tu tuVar = (tu) this.f11588b;
                if (tuVar.f18308a0 != null) {
                    su h02 = tu.h0(tuVar, f7, f10);
                    su suVar = tuVar.f18308a0;
                    if (h02 == suVar) {
                        wv wvVar = tuVar.f17967a;
                        l1 l1Var = wvVar.F;
                        if (l1Var != null) {
                            l1Var.q1(wvVar.E, suVar.f18146c);
                        }
                        return true;
                    }
                }
                return false;
            default:
                return false;
        }
    }

    public f e(float f7) {
        j8.f fVar = (j8.f) this.f11588b;
        fVar.e = 0.5f;
        fVar.f9720f = f7;
        return this;
    }

    @Override
    public void g(boolean z10) {
        ((be0) this.f11588b).f24716c.setAspectLock(z10);
    }

    @Override
    public Object get() {
        switch (this.f11587a) {
            case 3:
                return new li.k((Context) ((k2.m0) this.f11588b).f10701a, new u(21), new oa.d(21), 5);
            default:
                String packageName = ((Context) ((zc.a) this.f11588b).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f11587a) {
            case 13:
                StringBuilder sb2 = new StringBuilder();
                xt xtVar = (xt) this.f11588b;
                sb2.append((Object) xtVar.f21895a.getText());
                sb2.append(" ");
                sb2.append((Object) xtVar.f21896b.getText());
                return sb2.toString();
            default:
                StringBuilder sb3 = new StringBuilder();
                w7 w7Var = (w7) this.f11588b;
                sb3.append(dd.G(w7Var.f32121t2 / 60, "Minutes", new Object[0]));
                sb3.append(' ');
                sb3.append(dd.G(w7Var.f32121t2 % 60, "Seconds", new Object[0]));
                String sb4 = sb3.toString();
                return dd.a0("AccDescrPlayerDuration", null, 2131754806, sb4, dd.G(w7Var.f32123u2 / 60, "Minutes", new Object[0]) + ' ' + dd.G(w7Var.f32123u2 % 60, "Seconds", new Object[0]));
        }
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f11587a) {
            case 11:
            default:
                return ViewConfiguration.getLongPressTimeout();
        }
    }

    @Override
    public boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
        switch (this.f11587a) {
            case 18:
                rg0 rg0Var = ((ug0) this.f11588b).h.G0;
                if (rg0Var != null) {
                    rg0Var.d();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean j0() {
        switch (this.f11587a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void k(boolean z10, float f7) {
        float c10;
        switch (this.f11587a) {
            case 13:
                xt xtVar = (xt) this.f11588b;
                if (f7 <= 0.25f) {
                    c10 = a1.g.c(f7, 0.25f, 536576.0f, 512000);
                } else {
                    float f10 = f7 - 0.25f;
                    if (f10 < 0.25f) {
                        c10 = a1.g.c(f10, 0.25f, 9437184.0f, 1048576);
                    } else {
                        float f11 = f10 - 0.25f;
                        if (f11 <= 0.25f) {
                            c10 = a1.g.c(f11, 0.25f, 9.437184E7f, 10485760);
                        } else {
                            c10 = a1.g.c(f11 - 0.25f, 0.25f, (float) (2097152000 - 104857600), 104857600);
                        }
                    }
                }
                int i10 = (int) c10;
                long j10 = i10;
                boolean z11 = true;
                xtVar.f21896b.setText(dd.a0("AutodownloadSizeLimitUpTo", null, 2131753772, org.telegram.messenger.i0.i0(j10, false, false)));
                xtVar.d = j10;
                t8[] t8VarArr = xtVar.h;
                AnimatorSet[] animatorSetArr = xtVar.f43455n;
                if (xtVar.e == DataAutoDownloadActivity.o0(xtVar.f43456r)) {
                    xtVar.f43454f.setText(dd.a0("AutoDownloadPreloadVideoInfo", null, 2131753810, org.telegram.messenger.i0.i0(j10, false, false)));
                    if (i10 <= 2097152) {
                        z11 = false;
                    }
                    if (z11 != t8VarArr[0].isEnabled()) {
                        ArrayList arrayList = new ArrayList();
                        t8VarArr[0].e(arrayList, z11);
                        AnimatorSet animatorSet = animatorSetArr[0];
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            animatorSetArr[0] = null;
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSetArr[0] = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        animatorSetArr[0].addListener(new i2(xtVar, 3));
                        animatorSetArr[0].setDuration(150L);
                        animatorSetArr[0].start();
                        return;
                    }
                    return;
                }
                return;
            default:
                if (z10) {
                    MediaController.B().i0(MediaController.B().f14483u0, f7);
                }
                kj kjVar = MediaController.B().f14483u0;
                if (kjVar != null && kjVar.I3()) {
                    ((w7) this.f11588b).b1(kjVar, false);
                    return;
                }
                return;
        }
    }

    @Override
    public void l(boolean z10) {
        be0 be0Var = (be0) this.f11588b;
        be0Var.getClass();
        ae0 ae0Var = be0Var.f24714a;
        if (ae0Var != null) {
            ((zp0) ae0Var).b(z10);
        }
    }

    @Override
    public void m(View view, float f7, float f10) {
        int i10 = this.f11587a;
    }

    @Override
    public void n() {
        ae0 ae0Var = ((be0) this.f11588b).f24714a;
        if (ae0Var != null) {
            PhotoViewer photoViewer = ((zp0) ae0Var).f44037a;
            if (photoViewer.f33461c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.t3();
            }
        }
    }

    @Override
    public void n0(int i10, int i11) {
        ((g0) this.f11588b).o(i10, i11);
    }

    public void o(s4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f11588b;
        int i10 = aVar.f47876a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        return;
                    }
                    recyclerView.f1924y.X(recyclerView, aVar.f47877b, aVar.d);
                    return;
                }
                recyclerView.f1924y.a0(recyclerView, aVar.f47877b, aVar.d, aVar.f47878c);
                return;
            }
            recyclerView.f1924y.Y(recyclerView, aVar.f47877b, aVar.d);
            return;
        }
        recyclerView.f1924y.V(recyclerView, aVar.f47877b, aVar.d);
    }

    @Override
    public void o1(View view, float f7, float f10) {
        int i10 = this.f11587a;
    }

    @Override
    public void onDismiss() {
        z0 z0Var = (z0) this.f11588b;
        z0Var.x("scan_qr_popup_closed", null);
        z0Var.f43070h0 = false;
    }

    public LongSparseArray p(long j10, long j11) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.f11588b).get(j10);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j11);
    }

    @Override
    public int p0() {
        switch (this.f11587a) {
            case 13:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ci0 B;
        switch (this.f11587a) {
            case 18:
                return;
            default:
                boolean[] zArr = (boolean[]) this.f11588b;
                if (z10 && (B = imageReceiver.B()) != null && !zArr[0]) {
                    B.N(0, false, false);
                    org.telegram.messenger.i0.g3(new o0(B, 0));
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    @Override
    public void r(float f7, float f10) {
        switch (this.f11587a) {
            case 11:
                tu tuVar = (tu) this.f11588b;
                su h02 = tu.h0(tuVar, f7, f10);
                su suVar = tuVar.f18308a0;
                if (h02 != suVar) {
                    suVar = null;
                }
                tu.i0(tuVar, suVar);
                return;
            default:
                return;
        }
    }

    @Override
    public void s(int i10, Drawable drawable) {
        int i11 = this.f11587a;
    }

    public boolean t() {
        return ((j0) this.f11588b).f16393c;
    }

    @Override
    public void t0() {
        switch (this.f11587a) {
            case 11:
                tu tuVar = (tu) this.f11588b;
                tu.i0(tuVar, tuVar.f18308a0);
                return;
            default:
                ((y51) this.f11588b).h.c(true);
                return;
        }
    }

    public String toString() {
        switch (this.f11587a) {
            case 22:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f11588b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public void u(View view, float f7, float f10) {
        int i10 = this.f11587a;
    }

    public SparseIntArray v(long j10) {
        return (SparseIntArray) ((a0.h) this.f11588b).f(j10);
    }

    public void w(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f11588b;
        int r10 = recyclerView.e.r();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < r10; i15++) {
            View q6 = recyclerView.e.q(i15);
            c1 U = RecyclerView.U(q6);
            if (U != null && !U.r() && (i13 = U.f47911c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f47917l) == 0) {
                    if (U.f47918m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f47918m = arrayList;
                        U.f47919n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f47918m.add(obj);
                }
                ((s4.o0) q6.getLayoutParams()).f48005c = true;
            }
        }
        hf.e eVar = recyclerView.f1894b;
        ArrayList arrayList2 = (ArrayList) eVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c1 c1Var = (c1) arrayList2.get(size);
            if (c1Var != null && (i12 = c1Var.f47911c) >= i10 && i12 < i14) {
                c1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.f1925y0 = true;
    }

    public void x(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.f11588b;
        int r10 = recyclerView.e.r();
        for (int i12 = 0; i12 < r10; i12++) {
            c1 U = RecyclerView.U(recyclerView.e.q(i12));
            if (U != null && !U.r() && U.f47911c >= i10) {
                U.n(i11, false);
                recyclerView.f1918u0.f48067f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1894b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            c1 c1Var = (c1) arrayList.get(i13);
            if (c1Var != null && c1Var.f47911c >= i10) {
                c1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1923x0 = true;
    }

    @Override
    public void x1(int i10, int i11) {
        ((g0) this.f11588b).n(i10, i11, null);
    }

    public void y(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f11588b;
        int r10 = recyclerView.e.r();
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
        for (int i20 = 0; i20 < r10; i20++) {
            c1 U = RecyclerView.U(recyclerView.e.q(i20));
            if (U != null && (i18 = U.f47911c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.f1918u0.f48067f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1894b.e;
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
            if (c1Var != null && (i17 = c1Var.f47911c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    c1Var.n(i11 - i10, false);
                } else {
                    c1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1923x0 = true;
    }

    public f(Object obj, int i10) {
        this.f11587a = i10;
        this.f11588b = obj;
    }

    public f(int i10) {
        this.f11587a = i10;
        switch (i10) {
            case 8:
                this.f11588b = new p0();
                return;
            case 9:
                this.f11588b = new LongSparseArray();
                return;
            case 25:
                this.f11588b = new a0.h();
                return;
            default:
                this.f11588b = new ArrayDeque(16);
                return;
        }
    }

    public f(String str, boolean z10) {
        this.f11587a = 7;
        this.f11588b = new j0(str, z10);
    }

    public f(Context context, p6 p6Var) {
        this.f11587a = 12;
        z2 z2Var = new z2(1, context, p6Var, false);
        this.f11588b = z2Var;
        z2Var.O();
    }

    private final void K() {
    }

    private final void M() {
    }

    private final void z(ImageReceiver imageReceiver) {
    }

    @Override
    public void X0(js jsVar) {
    }

    @Override
    public void a(int i10) {
    }

    @Override
    public void c(int i10) {
    }

    private final void A(float f7, float f10) {
    }

    private final void h(int i10, Drawable drawable) {
    }

    private final void i(int i10, Drawable drawable) {
    }

    private final void D(View view, float f7, float f10) {
    }

    private final void F(View view, float f7, float f10) {
    }

    private final void G(View view, float f7, float f10) {
    }

    private final void H(View view, float f7, float f10) {
    }

    private final void I(View view, float f7, float f10) {
    }

    private final void J(View view, float f7, float f10) {
    }

    private final void f(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
