package l;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import m.e2;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.y81;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.tb1;
import qg.n2;
import qg.w1;
import w7.y8;
public final class d implements e2, y2.g, le.e, j, l2.h, to0, le.g, ah.j, w81, com.google.android.gms.common.api.internal.s, w1, r4.c, com.google.android.gms.common.api.internal.o, n5.b, OnCompleteListener {
    public Object f13925a;

    public d(Object obj) {
        this.f13925a = obj;
    }

    @Override
    public long A(long j3, long j10) {
        return 1L;
    }

    @Override
    public void C(float f7, int i10) {
        ((le.k) this.f13925a).i(f7);
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        ((le.k) this.f13925a).i(f7);
    }

    @Override
    public void E(y2.i iVar, long j3, long j10, boolean z10) {
        ((l2.g) this.f13925a).w((y2.o) iVar, j10);
    }

    public void F(HashMap hashMap) {
        if (((SparseArray) this.f13925a) == null) {
            this.f13925a = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.f13925a).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    public boolean G(int i10) {
        p81 p81Var = ((y81) this.f13925a).L;
        if (p81Var == null) {
            return false;
        }
        return p81Var.c(i10);
    }

    public void H(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.f13925a).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void I() {
        HashMap hashMap = (HashMap) this.f13925a;
        for (Map.Entry entry : hashMap.entrySet()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    public StringBuilder J() {
        df.a aVar = (df.a) this.f13925a;
        if (aVar instanceof ye.m) {
            StringBuilder sb2 = ((ye.m) aVar).f47053b.f47039b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    @Override
    public void K(float f7) {
        ((n2) this.f13925a).setOutlineWidth(f7);
    }

    public void L(float f7) {
        y81 y81Var = (y81) this.f13925a;
        if (f7 == 1.0f) {
            View[] viewArr = y81Var.e;
            View[] viewArr2 = y81Var.e;
            if (viewArr[1] != null) {
                y81Var.F();
                y81Var.h.put(y81Var.f30615f[1], viewArr2[1]);
                y81Var.removeView(viewArr2[1]);
                y81Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            y81Var.z(y81Var.f30613b);
            return;
        }
        View[] viewArr3 = y81Var.e;
        View[] viewArr4 = y81Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (y81Var.f30621y) {
            y81Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            y81Var.E(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            y81Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            y81Var.E(view3, view3.getMeasuredWidth() * f7);
        }
        y81Var.w(false);
    }

    @Override
    public void U(ah.a aVar) {
        aVar.a(((wq0) this.f13925a).getThemedColor(h6.f19061d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public void X(float f7, boolean z10) {
        tb1 tb1Var = (tb1) ((k0) this.f13925a);
        int i10 = (int) (h6.f19293q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        h6.f19293q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = tb1Var.e.e;
            il0 il0Var = (il0) themeActivity.f31839b.K(themeActivity.f31846f0);
            if (il0Var != null) {
                ((e9) il0Var.f42962a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (h6.f19293q * 100.0f))));
            }
            h6.E(true);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        p6.a aVar = (p6.a) ((p6.c) obj).u();
        Parcel I0 = aVar.I0();
        k7.a.c(I0, (n6.o) this.f13925a);
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
    public void d(Canvas canvas) {
        wq0 wq0Var = (wq0) this.f13925a;
        canvas.drawColor(wq0Var.getThemedColor(h6.f19061d6));
        if (SharedConfig.chatBlurEnabled()) {
            wq0Var.O0.b(canvas, -3);
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
        return new s5.j((Context) ((fd.a) this.f13925a).mo28get(), "com.google.android.datatransport.events", Integer.valueOf(s5.j.d).intValue());
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
    public long j(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public m2.j k(long j3) {
        return (m2.j) this.f13925a;
    }

    @Override
    public void l(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        g8.c cVar = (g8.c) obj;
        androidx.activity.n nVar2 = ((r7.i) this.f13925a).f42358b;
        synchronized (nVar2) {
            nVar2.f1900b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) nVar2.f1901c).f6128c;
        }
        if (nVar != null) {
            ((r7.c) nVar2.d).c(nVar, 2441);
        }
    }

    @Override
    public k4.d m(y2.i r4, long r5, long r7, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: l.d.m(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public void n(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.f13925a;
        if (i10 == 0) {
            long j11 = oVar.f46579a;
            tVar = new u2.t(oVar.f46580b);
        } else {
            long j12 = oVar.f46579a;
            Uri uri = oVar.d.f9334c;
            tVar = new u2.t(j10);
        }
        gVar.f14057q.s(tVar, oVar.f46581c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public void o(y2.i iVar, long j3, long j10) {
        int size;
        int i10;
        long j11;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.f13925a;
        long j12 = oVar.f46579a;
        Uri uri = oVar.d.f9334c;
        u2.t tVar = new u2.t(j10);
        gVar.f14053m.getClass();
        gVar.f14057q.p(tVar, oVar.f46581c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f46582f;
        m2.c cVar2 = gVar.H;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f14644m.size();
        }
        long j13 = cVar.b(0).f14661b;
        int i11 = 0;
        while (i11 < size && gVar.H.b(i11).f14661b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.f14644m.size()) {
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
            if (i12 < gVar.f14053m.L3(oVar.f46581c)) {
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
        synchronized (gVar.f14060t) {
            try {
                if (oVar.f46580b.f9362a.equals(gVar.F)) {
                    Uri uri2 = gVar.H.f14642k;
                    if (uri2 == null) {
                        uri2 = y8.a(oVar.d.f9334c);
                    }
                    gVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = gVar.H;
        if (cVar3.d && gVar.L == j11) {
            lf.g gVar2 = cVar3.f14640i;
            if (gVar2 != null) {
                String str = gVar2.f14245b;
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
                    gVar.L = e2.d0.T(gVar2.f14246c) - gVar.K;
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
    public void onComplete(Task task) {
        y8.e0 e0Var = (y8.e0) this.f13925a;
        if (task.isSuccessful()) {
            x8.m.M0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        x8.m.M0(e0Var, false, null);
    }

    @Override
    public void p(l lVar, MenuItem menuItem) {
        ((f) this.f13925a).f13941f.removeCallbacksAndMessages(lVar);
    }

    @Override
    public void q() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void r(l lVar) {
        k2.u uVar = ((ActionMenuView) this.f13925a).K;
        if (uVar != null) {
            uVar.r(lVar);
        }
    }

    @Override
    public long s(long j3, long j10) {
        return 0L;
    }

    @Override
    public boolean t(l lVar, MenuItem menuItem) {
        m.k kVar = ((ActionMenuView) this.f13925a).P;
        if (kVar != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((ka.c) kVar).f13552b).W.d).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.c0) it.next()).f2394a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public void u() {
        ((m9) this.f13925a).f26333a.invalidate();
    }

    @Override
    public void v(l lVar, n nVar) {
        f fVar = (f) this.f13925a;
        Handler handler = fVar.f13941f;
        e eVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f13942n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (lVar == ((e) arrayList.get(i10)).f13936b) {
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
    public boolean w() {
        return true;
    }

    @Override
    public void x(int i10, Object obj) {
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
        ((ProfileInstallReceiver) this.f13925a).setResultCode(i10);
    }

    @Override
    public long y() {
        return 0L;
    }

    @Override
    public long z(long j3) {
        return 1L;
    }

    public d(int i10) {
        switch (i10) {
            case 27:
                this.f13925a = new z0[zf.b.values().length];
                return;
            default:
                this.f13925a = new HashMap();
                return;
        }
    }

    @Override
    public float get() {
        return ((n2) this.f13925a).F;
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
