package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class qx4 implements wz6, r07, zu9, t46, aha, d71, kab, imb, ka8, gj, s09, SuccessContinuation, rx9, h86, co7, kt8, f39 {
    public static volatile qx4 b;
    public static volatile qx4 d;
    public final Object a;
    public static final Object c = new Object();
    public static final lbd e = new lbd((byte) 2);

    public qx4(byte b2) {
        switch (b2) {
            case 1:
                this.a = new ConcurrentHashMap();
                return;
            case 2:
                jae jaeVar = jae.c;
                xdd xddVar = new xdd(new l8e[]{cff.h, e});
                Charset charset = h3e.a;
                this.a = xddVar;
                return;
            case 23:
                this.a = new hwa(o4c.b);
                return;
            default:
                this.a = new HashSet();
                return;
        }
    }

    public static qx4 I() {
        if (d == null) {
            synchronized (c) {
                if (d == null) {
                    d = new qx4((byte) 1);
                }
            }
        }
        qx4 qx4Var = d;
        fre.h(qx4Var);
        return qx4Var;
    }

    @Override
    public final boolean B(yz6 yz6Var, MenuItem menuItem) {
        e9 e9Var = ((ActionMenuView) this.a).Q;
        if (e9Var != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((ln8) e9Var).b).a0.c).iterator();
            while (it.hasNext()) {
                if (((zn4) it.next()).a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final void C0(k86 k86Var, long j, long j2, int i) {
        cv7 cv7Var = (cv7) k86Var;
        q53 q53Var = (q53) this.a;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        if (i != 0) {
            zxa zxaVar = cv7Var.d;
            e86Var.d = zxaVar.c;
            e86Var.e = zxaVar.d;
            e86Var.f = j2;
            e86Var.g = zxaVar.b;
        }
        q53Var.r.u(new f86(e86Var), cv7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override
    public final boolean D(yz6 yz6Var) {
        Window.Callback callback;
        bp bpVar = (bp) this.a;
        if (yz6Var == yz6Var.k() && bpVar.P && (callback = bpVar.f.getCallback()) != null && !bpVar.a0) {
            callback.onMenuOpened(108, yz6Var);
            return true;
        }
        return true;
    }

    @Override
    public final void D2(Object obj) {
        e16 e16Var = (e16) obj;
        ze3 ze3Var = (ze3) this.a;
        if (e16Var != null && ze3Var.s0) {
            w44.d(ze3Var, " did not return a View from onCreateView() or this was called before onCreateView().", "Fragment ");
        }
    }

    @Override
    public final void E(boolean z) {
        nh1 nh1Var = (nh1) this.a;
        if (nh1.v0(nh1Var) instanceof mh1) {
            nh1 nh1Var2 = ((mh1) nh1.w0(nh1Var)).a;
            nh1Var2.K = !nh1Var2.K;
            nh1Var2.j1();
            nh1Var2.f1(false);
        }
        nh1Var.a1(a(), false);
        nh1Var.f1(false);
    }

    @Override
    public final void F() {
        ((jc0) this.a).a.invalidate();
    }

    public final fwa G() {
        Object objectVolatile = ex.a.getObjectVolatile((hwa) this.a, hwa.e);
        if (objectVolatile == zad.a) {
            objectVolatile = null;
        }
        return (fwa) objectVolatile;
    }

    @Override
    public final void H() {
        r61 r61Var = (r61) this.a;
        v61 v61Var = r61Var.e0;
        if (v61Var != null && v61Var.j.size() > 0) {
            r61Var.e0.d();
            d61 d61Var = r61Var.N;
            if (d61Var != null) {
                d61Var.f(false);
                r61Var.N.e();
            }
        }
    }

    public final StringBuilder J() {
        x1 x1Var = (x1) this.a;
        if (x1Var instanceof uu7) {
            StringBuilder sb = ((uu7) x1Var).b.b;
            if (sb.length() != 0) {
                return sb;
            }
            return null;
        }
        return null;
    }

    public final Set K() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.a)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.a);
        }
        return unmodifiableSet;
    }

    public final void L(defpackage.fwa r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx4.L(fwa):void");
    }

    public final void M(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        if (!(serviceConnection instanceof h5f) && concurrentHashMap.containsKey(serviceConnection)) {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                }
                return;
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean N(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((ryc.a(context).a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof h5f)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean bindService = context.bindService(intent, serviceConnection, i);
                if (!bindService) {
                    return false;
                }
                return bindService;
            } finally {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
            }
        }
        return context.bindService(intent, serviceConnection, i);
    }

    @Override
    public final float P() {
        return b00.c(9.66f, dg0.d(ss0.Y((ss0) this.a).b), 0);
    }

    @Override
    public final int Q() {
        return ss0.Z((ss0) this.a).d;
    }

    @Override
    public final void U(k86 k86Var, long j, long j2) {
        int size;
        long j3;
        cv7 cv7Var = (cv7) k86Var;
        q53 q53Var = (q53) this.a;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        q53Var.n.getClass();
        q53Var.r.p(f86Var, cv7Var.c);
        h53 h53Var = (h53) cv7Var.f;
        h53 h53Var2 = q53Var.J;
        if (h53Var2 == null) {
            size = 0;
        } else {
            size = h53Var2.l.size();
        }
        long j4 = h53Var.b(0).b;
        int i = 0;
        while (i < size && q53Var.J.b(i).b < j4) {
            i++;
        }
        if (h53Var.d) {
            if (size - i > h53Var.l.size()) {
                lad.f("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j5 = q53Var.P;
                j3 = -9223372036854775807L;
                if (j5 != -9223372036854775807L && h53Var.h * 1000 <= j5) {
                    lad.f("DashMediaSource", "Loaded stale dynamic manifest: " + h53Var.h + ", " + q53Var.P);
                } else {
                    q53Var.O = 0;
                }
            }
            int i2 = q53Var.O;
            q53Var.O = i2 + 1;
            if (i2 < q53Var.n.v3(cv7Var.c)) {
                q53Var.I.postDelayed(q53Var.w, Math.min((q53Var.O - 1) * 1000, 5000));
                return;
            }
            q53Var.H = new IOException();
            return;
        }
        j3 = -9223372036854775807L;
        q53Var.J = h53Var;
        q53Var.K &= h53Var.d;
        q53Var.L = j - j2;
        q53Var.M = j;
        q53Var.Q += i;
        Uri uri = cv7Var.b.a;
        synchronized (q53Var.u) {
            km5 listIterator = q53Var.B.listIterator(0);
            while (true) {
                if (!listIterator.hasNext()) {
                    break;
                } else if (uri.equals(((s96) listIterator.next()).a)) {
                    if (!h53Var.m.isEmpty()) {
                        q53Var.B = h53Var.m;
                    } else {
                        q53Var.B = mm5.u(new s96(jrd.a(cv7Var.d.c)));
                    }
                }
            }
        }
        h53 h53Var3 = q53Var.J;
        if (h53Var3.d && q53Var.N == j3) {
            ce3 ce3Var = h53Var3.i;
            if (ce3Var != null) {
                String str = ce3Var.b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                q53Var.y(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                q53Var.w();
                                return;
                            }
                        }
                        q53Var.A(ce3Var, new eef((byte) 16));
                        return;
                    }
                    q53Var.A(ce3Var, new Object());
                    return;
                }
                try {
                    q53Var.N = g8c.W(ce3Var.c) - q53Var.M;
                    q53Var.z(true);
                    return;
                } catch (av7 e2) {
                    q53Var.y(e2);
                    return;
                }
            }
            q53Var.w();
            return;
        }
        q53Var.z(true);
    }

    @Override
    public final boolean a() {
        nh1 nh1Var = (nh1) this.a;
        if (nh1.t0(nh1Var) != null) {
            return nh1.u0(nh1Var).a();
        }
        return bkb.I.o();
    }

    @Override
    public final int a0() {
        bx bxVar = (bx) this.a;
        return bxVar.c - bxVar.b;
    }

    @Override
    public final int b(long j) {
        if (j < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final void clear() {
        ((r61) this.a).h0();
    }

    @Override
    public final void d(yz6 yz6Var, boolean z) {
        boolean z2;
        int i;
        ap apVar;
        bp bpVar = (bp) this.a;
        yz6 k = yz6Var.k();
        int i2 = 0;
        if (k != yz6Var) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            yz6Var = k;
        }
        ap[] apVarArr = bpVar.V;
        if (apVarArr != null) {
            i = apVarArr.length;
        } else {
            i = 0;
        }
        while (true) {
            if (i2 < i) {
                apVar = apVarArr[i2];
                if (apVar != null && apVar.h == yz6Var) {
                    break;
                }
                i2++;
            } else {
                apVar = null;
                break;
            }
        }
        if (apVar != null) {
            if (z2) {
                bpVar.f(apVar.a, apVar, k);
                bpVar.h(apVar, true);
                return;
            }
            bpVar.h(apVar, z);
        }
    }

    @Override
    public final boolean mo8e(float f, float f2, int i, View view) {
        af4 af4Var = (af4) this.a;
        if (view instanceof iba) {
            af4Var.f(((iba) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof lba) {
            af4Var.f(((lba) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof eba) {
            af4Var.f(((eba) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof bw2) {
            af4Var.f(((bw2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof ue3) {
                if (!af4Var.p0.t()) {
                    ue3 ue3Var = (ue3) view;
                    if (ue3Var.b0(f)) {
                        af4Var.j0.w(ue3Var);
                        return true;
                    }
                }
                af4Var.f(((ue3) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public final void f() {
        ((af4) this.a).j0.finish();
    }

    @Override
    public final void g(float f) {
        ((af4) this.a).j0.m(f);
    }

    @Override
    public final Object mo9get() {
        return new c44((mt8) ((mo5) this.a).a);
    }

    @Override
    public final CharSequence getContentDescription() {
        bx bxVar = (bx) this.a;
        byte b2 = bxVar.b;
        return String.valueOf(Math.round((bxVar.a.getProgress() * (bxVar.c - b2)) + b2));
    }

    @Override
    public final long h(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        return 0L;
    }

    @Override
    public final void i(l61 l61Var, u61 u61Var, boolean z) {
        HashSet hashSet;
        int i;
        r61 r61Var = (r61) this.a;
        if (l61Var != null) {
            if (r61Var.e0.j.size() <= 0 && !z) {
                if (r61Var.H > 0 && r61Var.getParentActivity() != null) {
                    l61Var.getClass();
                    v61 v61Var = new v61(true);
                    SparseArray sparseArray = l61Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = v61Var.d;
                    if (obj != null) {
                        arrayList.addAll(((m61) sparseArray.get(0)).b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((m61) sparseArray.get(1)).b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = v61Var.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((m61) sparseArray.get(2)).b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = v61Var.f;
                    if (obj3 != null) {
                        arrayList3.addAll(((m61) sparseArray.get(3)).b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = v61Var.g;
                    if (obj4 != null) {
                        arrayList4.addAll(((m61) sparseArray.get(4)).b);
                    }
                    int i2 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = v61Var.j;
                        if (i2 >= size) {
                            break;
                        }
                        hashSet.add((u61) arrayList.get(i2));
                        if (((u61) arrayList.get(i2)).d == 0) {
                            v61Var.r += ((u61) arrayList.get(i2)).c;
                            i = i2;
                        } else {
                            i = i2;
                            v61Var.s += ((u61) arrayList.get(i)).c;
                        }
                        i2 = i + 1;
                    }
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        hashSet.add((u61) arrayList2.get(i3));
                        v61Var.t += ((u61) arrayList2.get(i3)).c;
                    }
                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                        hashSet.add((u61) arrayList3.get(i4));
                        v61Var.u += ((u61) arrayList3.get(i4)).c;
                    }
                    for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                        hashSet.add((u61) arrayList4.get(i5));
                        v61Var.v += ((u61) arrayList4.get(i5)).c;
                    }
                    v61Var.m = true;
                    v61Var.n = true;
                    v61Var.o = true;
                    v61Var.p = true;
                    v61Var.q = true;
                    Collections.sort(arrayList, new sa((byte) 14));
                    Collections.sort(arrayList2, new sa((byte) 14));
                    Collections.sort(arrayList3, new sa((byte) 14));
                    Collections.sort(arrayList4, new sa((byte) 14));
                    Collections.sort(v61Var.h, new sa((byte) 14));
                    je3 je3Var = new je3(r61Var, l61Var, v61Var, new lv6(r61Var, l61Var, (byte) 11));
                    r61Var.a0 = je3Var;
                    r61Var.showDialog(je3Var);
                    return;
                }
                return;
            }
            v61 v61Var2 = r61Var.e0;
            HashSet hashSet2 = v61Var2.j;
            HashSet hashSet3 = v61Var2.l;
            long j = l61Var.a;
            SparseArray sparseArray2 = l61Var.d;
            if (!hashSet3.contains(Long.valueOf(j))) {
                for (int i6 = 0; i6 < sparseArray2.size(); i6++) {
                    ArrayList arrayList5 = ((m61) sparseArray2.valueAt(i6)).b;
                    int size2 = arrayList5.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj5 = arrayList5.get(i7);
                        i7++;
                        u61 u61Var2 = (u61) obj5;
                        if (hashSet2.add(u61Var2)) {
                            v61Var2.k += u61Var2.c;
                        }
                    }
                }
            } else {
                for (int i8 = 0; i8 < sparseArray2.size(); i8++) {
                    ArrayList arrayList6 = ((m61) sparseArray2.valueAt(i8)).b;
                    int size3 = arrayList6.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj6 = arrayList6.get(i9);
                        i9++;
                        u61 u61Var3 = (u61) obj6;
                        if (hashSet2.remove(u61Var3)) {
                            v61Var2.k -= u61Var3.c;
                        }
                    }
                }
            }
            v61Var2.c();
            r61Var.N.e();
            r61Var.w0();
        } else if (u61Var != null) {
            r61Var.e0.i(u61Var);
            r61Var.N.e();
            r61Var.w0();
        }
    }

    @Override
    public final void j(boolean z, float f) {
        byte b2;
        bx bxVar = (bx) this.a;
        int round = Math.round(((bxVar.c - b2) * f) + bxVar.b);
        if (round != gba.V0) {
            gba.V0 = round;
            SharedPreferences.Editor edit = na7.c1().edit();
            edit.putInt("iv_font_size", gba.V0);
            edit.commit();
            bxVar.f.v0[0].getAdapter().E.clear();
            o oVar = bxVar.f;
            for (int i = 0; i < 2; i++) {
                oVar.v0[i].c.f();
                dx dxVar = oVar.v0[i].c;
                ArrayList arrayList = dxVar.d;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i2);
                    if (pageBlock != null) {
                        pageBlock.cachedWidth = 0;
                        pageBlock.cachedHeight = 0;
                    }
                }
                Utilities.e.a(dxVar.M);
                Utilities.e.d(dxVar.M, 100L);
            }
            bxVar.invalidate();
        }
    }

    @Override
    public final TextureView k0() {
        return ((mu1) this.a).M8;
    }

    @Override
    public final List l(long j) {
        if (j >= 0) {
            return (List) this.a;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final boolean n(float f) {
        return false;
    }

    @Override
    public final void o(boolean z) {
        fm0 fm0Var = ((ss0) this.a).s;
        if (fm0Var != null) {
            fm0Var.a(z, true);
        }
    }

    @Override
    public final void o1(yz6 yz6Var) {
        v39 v39Var = ((ActionMenuView) this.a).L;
        if (v39Var != null) {
            v39Var.o1(yz6Var);
        }
    }

    @Override
    public final void q(View view, h19 h19Var, boolean z, boolean z2) {
        fd2 fd2Var = (fd2) this.a;
        fd2Var.a.lb(null, fd2Var.e, fd2Var.b, view, 0.0f, 0.0f, h19Var, false, z, z2, false);
        gl.c3(new hq1(this, (byte) 24));
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        e72 e72Var = (e72) this.a;
        e72Var.M(z, i, i2, 0L, false);
        j47 j47Var = e72Var.P;
        if (j47Var != null) {
            j47Var.g();
            e72Var.P = null;
        }
    }

    @Override
    public final int t() {
        return 1;
    }

    @Override
    public final Task then(Object obj) {
        q7a q7aVar = (q7a) obj;
        lv6 lv6Var = (lv6) this.a;
        if (q7aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        dy2 dy2Var = (dy2) lv6Var.c;
        yx2 yx2Var = dy2.r;
        dy2Var.h();
        dy2Var.m.h((pz2) dy2Var.e.b, null);
        dy2Var.q.trySetResult(null);
        return Tasks.forResult(null);
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void u0(k27 k27Var) {
        mu1 mu1Var;
        Bitmap bitmap;
        if (k27Var == null) {
            return;
        }
        if (MediaController.w().D(k27Var)) {
            int i = 0;
            while (true) {
                int childCount = ((mu1) this.a).A0.getChildCount();
                mu1Var = (mu1) this.a;
                if (i >= childCount) {
                    break;
                }
                if (mu1Var.A0.getChildAt(i) instanceof gb2) {
                    gb2 gb2Var = (gb2) ((mu1) this.a).A0.getChildAt(i);
                    if (gb2Var.getMessageObject() != null && gb2Var.getMessageObject().e1() == k27Var.e1()) {
                        km m = gb2Var.getPhotoImage().m();
                        if (m.c0) {
                            m.stop();
                        }
                        Bitmap m2 = m.m();
                        if (m2 != null) {
                            try {
                                jr1 jr1Var = ((mu1) this.a).Ta;
                                int width = m2.getWidth();
                                int height = m2.getHeight();
                                v58 v58Var = jr1Var.d;
                                if (v58Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = ((TextureView) v58Var.d).getBitmap(width, height);
                                }
                                new Canvas(m2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th) {
                                fa4.g(th, true);
                            }
                        }
                    }
                }
                i++;
            }
            mu1Var.X5(true);
            MediaController w = MediaController.w();
            mu1 mu1Var2 = (mu1) this.a;
            w.o0(mu1Var2.M8, mu1Var2.L8, mu1Var2.J8, true);
        }
        ((mu1) this.a).A0.invalidate();
    }

    @Override
    public final void v(k86 k86Var, long j, long j2, boolean z) {
        ((q53) this.a).x((cv7) k86Var, j, j2);
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final i86 w1(k86 k86Var, long j, long j2, IOException iOException, int i) {
        int size;
        int i2;
        i86 i86Var;
        s96 s96Var;
        cv7 cv7Var = (cv7) k86Var;
        q53 q53Var = (q53) this.a;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        dd ddVar = new dd(iOException, i, (byte) 8);
        synchronized (q53Var.u) {
            size = q53Var.B.size();
            km5 listIterator = q53Var.B.listIterator(0);
            i2 = 0;
            while (listIterator.hasNext()) {
                Long l = (Long) q53Var.A.get(((s96) listIterator.next()).b);
                if (l != null && l.longValue() > j) {
                    i2++;
                }
            }
        }
        c86 c86Var = new c86(false, size, i2, 1, 0);
        q53Var.n.getClass();
        d86 u3 = i2f.u3(c86Var, ddVar);
        if (u3 != null && u3.a == 1) {
            Uri uri = cv7Var.b.a;
            synchronized (q53Var.u) {
                km5 listIterator2 = q53Var.B.listIterator(0);
                while (true) {
                    if (listIterator2.hasNext()) {
                        s96Var = (s96) listIterator2.next();
                        if (uri.equals(s96Var.a)) {
                            break;
                        }
                    } else {
                        s96Var = null;
                        break;
                    }
                }
                if (s96Var != null) {
                    q53Var.A.put(s96Var.b, Long.valueOf(u3.b + j));
                }
            }
            if (s96Var != null) {
                q53Var.I.postDelayed(q53Var.w, 0L);
                q53Var.r.s(f86Var, cv7Var.c, iOException, true);
                q53Var.n.getClass();
                return mv6.y;
            }
        }
        q53Var.n.getClass();
        long w3 = i2f.w3(ddVar);
        if (w3 == -9223372036854775807L) {
            i86Var = mv6.E;
        } else {
            i86Var = new i86(0, w3);
        }
        boolean a = i86Var.a();
        q53Var.r.s(f86Var, cv7Var.c, iOException, !a);
        if (!a) {
            q53Var.n.getClass();
        }
        return i86Var;
    }

    @Override
    public final void z(k27 k27Var) {
        mu1 mu1Var = (mu1) this.a;
        mu1Var.A0.J0(true);
        mu1Var.A0.D0();
        if (MediaController.w().D(k27Var)) {
            mu1Var.m1.removeView(mu1Var.J8);
            mu1Var.J8 = null;
            mu1Var.M8 = null;
            mu1Var.L8 = null;
        }
        for (int i = 0; i < mu1Var.A0.getChildCount(); i++) {
            if (mu1Var.A0.getChildAt(i) instanceof gb2) {
                gb2 gb2Var = (gb2) mu1Var.A0.getChildAt(i);
                if (gb2Var.getMessageObject() != null && gb2Var.getMessageObject().e1() == k27Var.e1()) {
                    gb2Var.getPhotoImage().v0(false, true);
                }
            }
        }
    }

    @Override
    public final void A() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void k(boolean z) {
    }

    public qx4(yi5 yi5Var) {
        fre.h(yi5Var);
        this.a = yi5Var;
    }

    public qx4(Object obj) {
        this.a = obj;
    }

    public qx4(EditText editText) {
        this.a = new tg2(editText);
    }

    @Override
    public final void x(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
