package m2;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.cb;
import org.telegram.messenger.ea;
import org.telegram.messenger.ef;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.messenger.ra;
import org.telegram.messenger.xa;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.g0;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.r10;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Wallet.ba;
import org.telegram.ui.o10;
import rh.h8;
import s4.i1;
import s4.n0;
import s4.o0;
import zf.l1;
public final class t implements l2.i, xa, ra, l61, q4, wk0, l1, com.google.android.gms.common.api.internal.s, r4.c, hu0, i1, v90 {
    public final int f12683a;
    public Object f12684b;

    public t(Object obj, int i10) {
        this.f12683a = i10;
        this.f12684b = obj;
    }

    @Override
    public long A(long j10, long j11) {
        return 1L;
    }

    public ClipDescription B() {
        return ((t0.h) this.f12684b).getDescription();
    }

    @Override
    public View C(int i10) {
        return ((n0) this.f12684b).q(i10);
    }

    public t D(cb cbVar) {
        ig.i1 i1Var = (ig.i1) this.f12684b;
        LatLng latLng = new LatLng(cbVar.f14971a, cbVar.f14972b);
        i1Var.getClass();
        double d = i1Var.f8330b;
        double d10 = latLng.f5416a;
        i1Var.f8330b = Math.min(d, d10);
        i1Var.f8331c = Math.max(i1Var.f8331c, d10);
        boolean isNaN = Double.isNaN(i1Var.d);
        double d11 = latLng.f5417b;
        if (isNaN) {
            i1Var.d = d11;
            i1Var.e = d11;
            return this;
        }
        double d12 = i1Var.d;
        double d13 = i1Var.e;
        if (d12 > d13 ? !(d12 <= d11 || d11 <= d13) : !(d12 <= d11 && d11 <= d13)) {
            if (((d12 - d11) + 360.0d) % 360.0d < ((d11 - d13) + 360.0d) % 360.0d) {
                i1Var.d = d11;
                return this;
            }
            i1Var.e = d11;
        }
        return this;
    }

    @Override
    public int E(View view) {
        return n0.v(view) + ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public void F(boolean z10) {
        h8 h8Var = (h8) this.f12684b;
        fe.b bVar = h8Var.Y;
        if (bVar != null) {
            bVar.a(z10, true);
        }
        o10 o10Var = h8Var.f40421s;
        if (o10Var != null) {
            o10Var.invalidate();
        }
    }

    public boolean I(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: m2.t.I(android.view.MotionEvent):boolean");
    }

    public void J(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f12684b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        g0 g0Var = (g0) this.f12684b;
        g0Var.q1(i10, i11, z10);
        g0Var.dismiss();
    }

    @Override
    public a0.h M() {
        switch (this.f12683a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void N(int i10, int i11, CharSequence charSequence, boolean z10) {
        vh.f fVar = ((vh.k) this.f12684b).f51340f;
        if (fVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                k6.l(spannableStringBuilder, fVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            fVar.setText(spannableStringBuilder);
            fVar.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public Object O() {
        if (n7.a.f13655b == null) {
            n7.a.f13655b = new Exception();
        }
        synchronized (n7.a.f13654a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override
    public boolean Y(int i10) {
        switch (this.f12683a) {
            case 13:
                if (i10 == ((lp0) this.f12684b).f28158r) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public long a(long j10) {
        return 0L;
    }

    @Override
    public float a1() {
        return i0.a.d(9.66f, ei.b.d(((h8) this.f12684b).f47014b0), 0);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f12683a) {
            case 17:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).v();
                Parcel J0 = aVar.J0();
                k7.a.c(J0, (n6.o) this.f12684b);
                try {
                    aVar.f317b.transact(1, J0, null, 1);
                    J0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    J0.recycle();
                    throw th2;
                }
            default:
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).v();
                Parcel J02 = eVar.J0();
                k7.a.d(J02, fVar);
                k7.a.c(J02, (s6.a) this.f12684b);
                J02.writeStrongBinder(null);
                eVar.K0(J02, 2);
                return;
        }
    }

    @Override
    public void b(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f12684b;
        chatAttachAlertPhotoLayout.L = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.d1(true);
    }

    @Override
    public void c0(ArrayList arrayList) {
        int i10 = this.f12683a;
    }

    @Override
    public boolean d(int i10) {
        if (((ChatAttachAlertPhotoLayout) this.f12684b).G.d(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override
    public long f(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public j g(long j10) {
        return (j) this.f12684b;
    }

    @Override
    public int g1() {
        return ((h8) this.f12684b).f47015c0;
    }

    @Override
    public void h(View view, boolean z10) {
        if (z10 == ((ChatAttachAlertPhotoLayout) this.f12684b).K && (view instanceof v5)) {
            v5 v5Var = (v5) view;
            v5Var.f23315x.d(v5Var);
        }
    }

    @Override
    public void i(int i10) {
        switch (this.f12683a) {
            case 13:
                lp0 lp0Var = (lp0) this.f12684b;
                op0 op0Var = lp0Var.K;
                lp0Var.f28159s = i10;
                if (lp0Var.f28160w != i10) {
                    lp0Var.d.clear();
                }
                int i11 = lp0Var.J;
                if (lp0Var.b() == 0 && !lp0Var.e.e() && !lp0Var.I) {
                    op0Var.I1.e(false, true);
                } else {
                    op0Var.f29134p2.b(i11);
                }
                lp0Var.f();
                int i12 = op0.Q2;
                op0Var.K0(true);
                return;
            default:
                ba baVar = (ba) this.f12684b;
                if (!baVar.f34285r && i10 == baVar.J) {
                    baVar.i0(baVar.N.getText().toString().trim());
                    return;
                }
                return;
        }
    }

    @Override
    public void invalidate() {
        ((q1) ((j1) this.f12684b).f22061b).invalidate();
    }

    @Override
    public boolean j(int i10) {
        ef M = ((ChatAttachAlertPhotoLayout) this.f12684b).G.M(i10);
        if (M != null && ChatAttachAlertPhotoLayout.f23847s1.containsKey(Integer.valueOf(M.C))) {
            return true;
        }
        return false;
    }

    @Override
    public int k(View view) {
        return n0.z(view) - ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).topMargin;
    }

    public ea l() {
        ig.i1 i1Var = (ig.i1) this.f12684b;
        n6.l.i("no included points", !Double.isNaN(i1Var.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(i1Var.f8330b, i1Var.d), new LatLng(i1Var.f8331c, i1Var.e));
        ?? obj = new Object();
        obj.f15374a = latLngBounds;
        return obj;
    }

    public void n(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.f12684b).remove(runnable);
        if (runnable2 != null) {
            i0.r(runnable2);
        }
    }

    @Override
    public long o(long j10, long j11) {
        return 0L;
    }

    @Override
    public void p() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void q() {
        HashMap hashMap = (HashMap) this.f12684b;
        for (Map.Entry entry : hashMap.entrySet()) {
            i0.r((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    @Override
    public void r(int i10, Object obj) {
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
        ((ProfileInstallReceiver) this.f12684b).setResultCode(i10);
    }

    @Override
    public int s() {
        return ((n0) this.f12684b).G();
    }

    @Override
    public boolean t() {
        return true;
    }

    @Override
    public long u() {
        return 0L;
    }

    public android.view.ViewGroup v(android.content.Context r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: m2.t.v(android.content.Context, int):android.view.ViewGroup");
    }

    @Override
    public Paint.FontMetricsInt w() {
        return ((vh.k) this.f12684b).f51340f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public a0.h x() {
        switch (this.f12683a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int y() {
        n0 n0Var = (n0) this.f12684b;
        return n0Var.f47988n - n0Var.C();
    }

    @Override
    public long z(long j10) {
        return 1L;
    }

    public t(s6.g gVar, s6.a aVar) {
        this.f12683a = 25;
        this.f12684b = aVar;
    }

    public t(int i10) {
        this.f12683a = i10;
        switch (i10) {
            case 5:
                return;
            case 12:
                this.f12684b = new HashMap();
                return;
            case 26:
                this.f12684b = new m4.c[sf.b.values().length];
                return;
            default:
                this.f12684b = new SparseArray();
                return;
        }
    }

    public t(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f12683a = 18;
        this.f12684b = new GestureDetector(context, onGestureListener, null);
    }

    public t(ArrayList arrayList) {
        this.f12683a = 22;
        this.f12684b = DesugarCollections.unmodifiableList(arrayList);
    }

    public t(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f12683a = 27;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f12684b = new t0.g(uri, clipDescription, uri2);
        } else {
            this.f12684b = new q5.d(uri, clipDescription, uri2, 6);
        }
    }

    public t(Context context, r10 r10Var) {
        this.f12683a = 10;
        this.f12684b = new q10(context, r10Var);
    }

    private final void G(ArrayList arrayList) {
    }

    private final void H(ArrayList arrayList) {
    }

    @Override
    public void X(String str) {
    }

    @Override
    public long c(long j10, long j11) {
        return j11;
    }

    @Override
    public void L(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void m(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }
}
