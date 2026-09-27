package l;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import b2.s0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import m.e2;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.y81;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.tb1;
import qg.n2;
import qg.v1;
import r0.l1;
import w7.y8;
public final class d implements e2, y2.g, le.e, j, l2.h, o0.b, so0, le.g, l71, r0.n, w81, com.google.android.gms.common.api.internal.s, v1, r4.c, com.google.android.gms.common.api.internal.o, n5.b, OnCompleteListener {
    public final Object f13926a;

    public d(Object obj) {
        this.f13926a = obj;
    }

    @Override
    public long A(long j3, long j10) {
        return 1L;
    }

    @Override
    public void C(float f7, int i10) {
        ((le.k) this.f13926a).i(f7);
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        ((le.k) this.f13926a).i(f7);
    }

    public boolean E(int i10) {
        p81 p81Var = ((y81) this.f13926a).L;
        if (p81Var == null) {
            return false;
        }
        return p81Var.c(i10);
    }

    public StringBuilder F() {
        df.a aVar = (df.a) this.f13926a;
        if (aVar instanceof ye.m) {
            StringBuilder sb2 = ((ye.m) aVar).f47096b.f47082b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    @Override
    public void G(y2.i iVar, long j3, long j10, boolean z10) {
        ((l2.g) this.f13926a).w((y2.o) iVar, j10);
    }

    public void H(float f7) {
        y81 y81Var = (y81) this.f13926a;
        if (f7 == 1.0f) {
            View[] viewArr = y81Var.e;
            View[] viewArr2 = y81Var.e;
            if (viewArr[1] != null) {
                y81Var.G();
                y81Var.h.put(y81Var.f30622f[1], viewArr2[1]);
                y81Var.removeView(viewArr2[1]);
                y81Var.F(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            y81Var.A(y81Var.f30620b);
            return;
        }
        View[] viewArr3 = y81Var.e;
        View[] viewArr4 = y81Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (y81Var.f30628y) {
            y81Var.F(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            y81Var.F(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            y81Var.F(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            y81Var.F(view3, view3.getMeasuredWidth() * f7);
        }
        y81Var.x(false);
    }

    public boolean I(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: l.d.I(android.view.MotionEvent):boolean");
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        om0 om0Var = (om0) this.f13926a;
        om0Var.v.setPadding(defaultWindowInsets.f10579a, defaultWindowInsets.f10580b, defaultWindowInsets.f10581c, defaultWindowInsets.d);
        om0Var.f27146s.requestLayout();
        return l1.f42184b;
    }

    @Override
    public void X(float f7, boolean z10) {
        tb1 tb1Var = (tb1) ((k0) this.f13926a);
        int i10 = (int) (i6.f19290q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        i6.f19290q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = tb1Var.e.e;
            il0 il0Var = (il0) themeActivity.f31839b.L(themeActivity.f31846f0);
            if (il0Var != null) {
                ((e9) il0Var.f43005a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (i6.f19290q * 100.0f))));
            }
            i6.E(true);
        }
    }

    @Override
    public void Z(float f7) {
        ((n2) this.f13926a).setOutlineWidth(f7);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        p6.a aVar = (p6.a) ((p6.c) obj).u();
        Parcel I0 = aVar.I0();
        k7.a.c(I0, (n6.o) this.f13926a);
        try {
            aVar.f315b.transact(1, I0, null, 1);
            I0.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            I0.recycle();
            throw th2;
        }
    }

    @Override
    public long b(long j3) {
        return 0L;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13926a;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public void d(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        g8.c cVar = (g8.c) obj;
        androidx.activity.n nVar2 = ((r7.i) this.f13926a).f42401b;
        synchronized (nVar2) {
            nVar2.f1902b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) nVar2.f1903c).f6129c;
        }
        if (nVar != null) {
            ((r7.c) nVar2.d).c(nVar, 2441);
        }
    }

    @Override
    public long f(long j3, long j10) {
        return 0L;
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public Object mo28get() {
        return new s5.j((Context) ((fd.a) this.f13926a).mo28get(), "com.google.android.datatransport.events", Integer.valueOf(s5.j.d).intValue());
    }

    @Override
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override
    public boolean h(float f7) {
        return false;
    }

    @Override
    public void invalidate() {
        ((rg0) this.f13926a).h.invalidate();
    }

    @Override
    public long j(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public m2.j k(long j3) {
        return (m2.j) this.f13926a;
    }

    @Override
    public k4.d l(y2.i r4, long r5, long r7, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: l.d.l(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public void m(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.f13926a;
        if (i10 == 0) {
            long j11 = oVar.f46622a;
            tVar = new u2.t(oVar.f46623b);
        } else {
            long j12 = oVar.f46622a;
            Uri uri = oVar.d.f9339c;
            tVar = new u2.t(j10);
        }
        gVar.f14058q.s(tVar, oVar.f46624c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public void n(l lVar, MenuItem menuItem) {
        ((f) this.f13926a).f13942f.removeCallbacksAndMessages(lVar);
    }

    @Override
    public long o(long j3, long j10) {
        return 0L;
    }

    @Override
    public void onComplete(Task task) {
        y8.e0 e0Var = (y8.e0) this.f13926a;
        if (task.isSuccessful()) {
            x8.m.M0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        x8.m.M0(e0Var, false, null);
    }

    @Override
    public void p(l lVar) {
        k2.u uVar = ((ActionMenuView) this.f13926a).K;
        if (uVar != null) {
            uVar.p(lVar);
        }
    }

    @Override
    public void q(y2.i iVar, long j3, long j10) {
        int size;
        int i10;
        long j11;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.f13926a;
        long j12 = oVar.f46622a;
        Uri uri = oVar.d.f9339c;
        u2.t tVar = new u2.t(j10);
        gVar.f14054m.getClass();
        gVar.f14058q.p(tVar, oVar.f46624c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f46625f;
        m2.c cVar2 = gVar.H;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f14670m.size();
        }
        long j13 = cVar.b(0).f14687b;
        int i11 = 0;
        while (i11 < size && gVar.H.b(i11).f14687b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.f14670m.size()) {
                e2.a.n("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j11 = -9223372036854775807L;
                long j14 = gVar.N;
                if (j14 != -9223372036854775807L) {
                    i10 = i11;
                    if (cVar.h * 1000 <= j14) {
                        e2.a.n("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.N);
                    }
                } else {
                    i10 = i11;
                }
                gVar.M = 0;
            }
            int i12 = gVar.M;
            gVar.M = i12 + 1;
            if (i12 < gVar.f14054m.L3(oVar.f46624c)) {
                gVar.D.postDelayed(gVar.v, Math.min((gVar.M - 1) * 1000, 5000));
                return;
            }
            gVar.C = new IOException();
            return;
        }
        i10 = i11;
        j11 = -9223372036854775807L;
        gVar.H = cVar;
        gVar.I = cVar.d & gVar.I;
        gVar.J = j3 - j10;
        gVar.K = j3;
        gVar.O += i10;
        synchronized (gVar.f14061t) {
            try {
                if (oVar.f46623b.f9367a.equals(gVar.F)) {
                    Uri uri2 = gVar.H.f14668k;
                    if (uri2 == null) {
                        uri2 = y8.a(oVar.d.f9339c);
                    }
                    gVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = gVar.H;
        if (cVar3.d && gVar.L == j11) {
            lf.g gVar2 = cVar3.f14666i;
            if (gVar2 != null) {
                String str = gVar2.f14246b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                gVar.x(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                gVar.v();
                                return;
                            }
                        }
                        gVar.z(gVar2, new ob.a(12));
                        return;
                    }
                    gVar.z(gVar2, new Object());
                    return;
                }
                try {
                    gVar.L = e2.d0.T(gVar2.f14247c) - gVar.K;
                    gVar.y(true);
                    return;
                } catch (s0 e) {
                    gVar.x(e);
                    return;
                }
            }
            gVar.v();
            return;
        }
        gVar.y(true);
    }

    @Override
    public Cursor r(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13926a;
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
    public boolean s(l lVar, MenuItem menuItem) {
        m.k kVar = ((ActionMenuView) this.f13926a).P;
        if (kVar != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((ka.c) kVar).f13554b).W.d).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.c0) it.next()).f2396a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public void t(l lVar, n nVar) {
        f fVar = (f) this.f13926a;
        Handler handler = fVar.f13942f;
        e eVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f13943n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (lVar == ((e) arrayList.get(i10)).f13937b) {
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
            eVar = (e) arrayList.get(i11);
        }
        handler.postAtTime(new com.google.android.gms.internal.cast.p(this, eVar, nVar, lVar, false, 1), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public void u() {
        ((m9) this.f13926a).f26390a.invalidate();
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public long w() {
        return 0L;
    }

    @Override
    public void x() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void y(int i10, Object obj) {
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
        ((ProfileInstallReceiver) this.f13926a).setResultCode(i10);
    }

    @Override
    public long z(long j3) {
        return 1L;
    }

    public d(int i10) {
        switch (i10) {
            case 26:
                this.f13926a = new z0[zf.b.values().length];
                return;
            default:
                this.f13926a = new LinkedHashMap(5, 1.0f, false);
                return;
        }
    }

    @Override
    public float get() {
        return ((n2) this.f13926a).F;
    }

    public d(Context context, Uri uri) {
        this.f13926a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public d(Context context, o20 o20Var) {
        this.f13926a = new n20(context, o20Var);
    }

    @Override
    public void B() {
    }

    @Override
    public void a() {
    }

    @Override
    public void i() {
    }

    @Override
    public void e(boolean z10) {
    }

    @Override
    public long c(long j3, long j10) {
        return j10;
    }
}
