package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class wz4 implements d27, y27, ty9, x66, tka, l71, heb, hqb, li1, qec, xg4, SuccessContinuation, mm4, dn3, gja {
    public static volatile wz4 b;
    public static volatile wz4 d;
    public Object a;
    public static final Object c = new Object();
    public static final egd e = new egd((byte) 2);

    public wz4(byte b2) {
        switch (b2) {
            case 1:
                this.a = new ConcurrentHashMap();
                return;
            case 2:
                zee zeeVar = zee.c;
                oqd oqdVar = new oqd(new bde[]{sjf.h, e});
                Charset charset = x7e.a;
                this.a = oqdVar;
                return;
            case 19:
                this.a = new LinkedHashMap();
                return;
            case 28:
                this.a = new zh6();
                return;
            default:
                this.a = new HashSet();
                return;
        }
    }

    public static wz4 E() {
        if (d == null) {
            synchronized (c) {
                if (d == null) {
                    d = new wz4((byte) 1);
                }
            }
        }
        wz4 wz4Var = d;
        xve.h(wz4Var);
        return wz4Var;
    }

    public final lj A(float f, float f2, int i, int i2) {
        int i3;
        lj b2;
        lj b3;
        int i4 = (int) (f2 * f);
        int max = Math.max(0, i - i4);
        rj0 rj0Var = (rj0) this.a;
        int min = Math.min(rj0Var.a - 1, i + i4) - max;
        float f3 = 3.0f * f;
        if (min >= f3) {
            int max2 = Math.max(0, i2 - i4);
            int min2 = Math.min(rj0Var.b - 1, i2 + i4) - max2;
            if (min2 >= f3) {
                rj0 rj0Var2 = (rj0) this.a;
                mj mjVar = new mj(rj0Var2, max, max2, min, min2, f);
                int i5 = mjVar.e;
                int i6 = mjVar.c;
                int i7 = i5 + i6;
                int i8 = mjVar.f;
                int i9 = (i8 / 2) + mjVar.d;
                int[] iArr = new int[3];
                for (int i10 = 0; i10 < i8; i10++) {
                    if ((i10 & 1) == 0) {
                        i3 = (i10 + 1) / 2;
                    } else {
                        i3 = -((i10 + 1) / 2);
                    }
                    int i11 = i3 + i9;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i12 = i6;
                    while (i12 < i7 && !rj0Var2.b(i12, i11)) {
                        i12++;
                    }
                    int i13 = 0;
                    while (i12 < i7) {
                        if (rj0Var2.b(i12, i11)) {
                            if (i13 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i13 == 2) {
                                if (mjVar.a(iArr) && (b3 = mjVar.b(i11, i12, iArr)) != null) {
                                    return b3;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i13 = 1;
                            } else {
                                i13++;
                                iArr[i13] = iArr[i13] + 1;
                            }
                        } else {
                            if (i13 == 1) {
                                i13++;
                            }
                            iArr[i13] = iArr[i13] + 1;
                        }
                        i12++;
                    }
                    if (mjVar.a(iArr) && (b2 = mjVar.b(i11, i7, iArr)) != null) {
                        return b2;
                    }
                }
                ArrayList arrayList = mjVar.b;
                if (!arrayList.isEmpty()) {
                    return (lj) arrayList.get(0);
                }
                throw tm7.a();
            }
            throw tm7.a();
        }
        throw tm7.a();
    }

    @Override
    public final boolean B(f27 f27Var, MenuItem menuItem) {
        f9 f9Var = ((ActionMenuView) this.a).Q;
        if (f9Var != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((j09) f9Var).b).a0.c).iterator();
            while (it.hasNext()) {
                if (((dq4) it.next()).a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final SparseIntArray C(long j) {
        return (SparseIntArray) ((zh6) this.a).f(j);
    }

    public final Set F() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.a)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.a);
        }
        return unmodifiableSet;
    }

    public final sh2 G() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (sh2 sh2Var : ((LinkedHashMap) this.a).values()) {
            arrayList.add(sh2Var.b);
            arrayList2.add(sh2Var.c);
            arrayList3.add(sh2Var.d);
            arrayList4.add(sh2Var.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()]);
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += iArr2.length;
        }
        int i = (int) j;
        if (j == i) {
            z = true;
        } else {
            z = false;
        }
        yve.d(j, "the total number of elements (%s) in the arrays must fit in an int", z);
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i2, iArr4.length);
            i2 += iArr4.length;
        }
        return new sh2(iArr3, tse.a((long[][]) arrayList2.toArray(new long[arrayList2.size()])), tse.a((long[][]) arrayList3.toArray(new long[arrayList3.size()])), tse.a((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
    }

    @Override
    public final void H() {
        ((lc0) this.a).a.invalidate();
    }

    public final float I(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        wz4 wz4Var;
        int i13;
        boolean z3 = true;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int abs = Math.abs(i7 - i5);
        int abs2 = Math.abs(i8 - i6);
        int i14 = 2;
        int i15 = (-abs) / 2;
        int i16 = -1;
        if (i5 < i7) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        if (i6 < i8) {
            i16 = 1;
        }
        int i17 = i7 + i9;
        int i18 = i5;
        int i19 = i6;
        int i20 = 0;
        while (true) {
            if (i18 != i17) {
                if (z) {
                    i12 = i18;
                    i11 = i19;
                } else {
                    i11 = i18;
                    i12 = i19;
                }
                boolean z4 = z;
                if (i20 == z3) {
                    z2 = z3;
                    i13 = abs;
                    wz4Var = this;
                } else {
                    z2 = false;
                    wz4Var = this;
                    i13 = abs;
                }
                if (z2 == ((rj0) wz4Var.a).b(i11, i12)) {
                    if (i20 == 2) {
                        return dte.b(i18, i19, i5, i6);
                    }
                    i20++;
                }
                i15 += abs2;
                if (i15 > 0) {
                    if (i19 == i8) {
                        i10 = 2;
                        break;
                    }
                    i19 += i16;
                    i15 -= i13;
                }
                i18 += i9;
                abs = i13;
                z = z4;
                z3 = true;
                i14 = 2;
            } else {
                i10 = i14;
                break;
            }
        }
        if (i20 == i10) {
            return dte.b(i17, i8, i5, i6);
        }
        return Float.NaN;
    }

    public final float J(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        rj0 rj0Var = (rj0) this.a;
        float I = I(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else {
            int i7 = rj0Var.a;
            if (i5 >= i7) {
                int i8 = i7 - 1;
                f = ((i7 - 1) - i) / (i5 - i);
                i5 = i8;
            } else {
                f = 1.0f;
            }
        }
        float f3 = i2;
        int i9 = (int) (f3 - ((i4 - i2) * f));
        if (i9 < 0) {
            f2 = f3 / (i2 - i9);
        } else {
            int i10 = rj0Var.b;
            if (i9 >= i10) {
                f2 = ((i10 - 1) - i2) / (i9 - i2);
                i6 = i10 - 1;
            } else {
                i6 = i9;
                f2 = 1.0f;
            }
        }
        return (I(i, i2, (int) (((i5 - i) * f2) + i), i6) + I) - 1.0f;
    }

    public final void K(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        if (!(serviceConnection instanceof y9f) && concurrentHashMap.containsKey(serviceConnection)) {
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

    public final boolean L(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((h3d.a(context).a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof y9f)) {
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
    public final void Q1(f27 f27Var) {
        l09 l09Var = ((ActionMenuView) this.a).L;
        if (l09Var != null) {
            l09Var.Q1(f27Var);
        }
    }

    @Override
    public final boolean a() {
        wh1 wh1Var = (wh1) this.a;
        if (wh1.m0(wh1Var) != null) {
            return wh1.n0(wh1Var).a();
        }
        return aob.I.o();
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
        ((z61) this.a).h0();
    }

    @Override
    public final boolean d(qg4 qg4Var) {
        return false;
    }

    @Override
    public final float e0() {
        return c00.d(9.66f, eg0.f(at0.Y((at0) this.a).b), 0);
    }

    @Override
    public final void f(f27 f27Var, boolean z) {
        boolean z2;
        int i;
        bp bpVar;
        cp cpVar = (cp) this.a;
        f27 k = f27Var.k();
        int i2 = 0;
        if (k != f27Var) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f27Var = k;
        }
        bp[] bpVarArr = cpVar.V;
        if (bpVarArr != null) {
            i = bpVarArr.length;
        } else {
            i = 0;
        }
        while (true) {
            if (i2 < i) {
                bpVar = bpVarArr[i2];
                if (bpVar != null && bpVar.h == f27Var) {
                    break;
                }
                i2++;
            } else {
                bpVar = null;
                break;
            }
        }
        if (bpVar != null) {
            if (z2) {
                cpVar.f(bpVar.a, bpVar, k);
                cpVar.h(bpVar, true);
                return;
            }
            cpVar.h(bpVar, z);
        }
    }

    @Override
    public final void f0(boolean z) {
        ((vnc) this.a).setLanguagePillHidden(z);
    }

    @Override
    public final void g(t61 t61Var, c71 c71Var, boolean z) {
        HashSet hashSet;
        int i;
        z61 z61Var = (z61) this.a;
        if (t61Var != null) {
            if (z61Var.e0.j.size() <= 0 && !z) {
                if (z61Var.H > 0 && z61Var.getParentActivity() != null) {
                    t61Var.getClass();
                    d71 d71Var = new d71(true);
                    SparseArray sparseArray = t61Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = d71Var.d;
                    if (obj != null) {
                        arrayList.addAll(((u61) sparseArray.get(0)).b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((u61) sparseArray.get(1)).b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = d71Var.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((u61) sparseArray.get(2)).b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = d71Var.f;
                    if (obj3 != null) {
                        arrayList3.addAll(((u61) sparseArray.get(3)).b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = d71Var.g;
                    if (obj4 != null) {
                        arrayList4.addAll(((u61) sparseArray.get(4)).b);
                    }
                    int i2 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = d71Var.j;
                        if (i2 >= size) {
                            break;
                        }
                        hashSet.add((c71) arrayList.get(i2));
                        if (((c71) arrayList.get(i2)).d == 0) {
                            d71Var.r += ((c71) arrayList.get(i2)).c;
                            i = i2;
                        } else {
                            i = i2;
                            d71Var.s += ((c71) arrayList.get(i)).c;
                        }
                        i2 = i + 1;
                    }
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        hashSet.add((c71) arrayList2.get(i3));
                        d71Var.t += ((c71) arrayList2.get(i3)).c;
                    }
                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                        hashSet.add((c71) arrayList3.get(i4));
                        d71Var.u += ((c71) arrayList3.get(i4)).c;
                    }
                    for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                        hashSet.add((c71) arrayList4.get(i5));
                        d71Var.v += ((c71) arrayList4.get(i5)).c;
                    }
                    d71Var.m = true;
                    d71Var.n = true;
                    d71Var.o = true;
                    d71Var.p = true;
                    d71Var.q = true;
                    Collections.sort(arrayList, new ta((byte) 14));
                    Collections.sort(arrayList2, new ta((byte) 14));
                    Collections.sort(arrayList3, new ta((byte) 14));
                    Collections.sort(arrayList4, new ta((byte) 14));
                    Collections.sort(d71Var.h, new ta((byte) 14));
                    df3 df3Var = new df3(z61Var, t61Var, d71Var, new qx6(z61Var, t61Var, (byte) 11));
                    z61Var.a0 = df3Var;
                    z61Var.showDialog(df3Var);
                    return;
                }
                return;
            }
            d71 d71Var2 = z61Var.e0;
            HashSet hashSet2 = d71Var2.j;
            HashSet hashSet3 = d71Var2.l;
            long j = t61Var.a;
            SparseArray sparseArray2 = t61Var.d;
            if (!hashSet3.contains(Long.valueOf(j))) {
                for (int i6 = 0; i6 < sparseArray2.size(); i6++) {
                    ArrayList arrayList5 = ((u61) sparseArray2.valueAt(i6)).b;
                    int size2 = arrayList5.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj5 = arrayList5.get(i7);
                        i7++;
                        c71 c71Var2 = (c71) obj5;
                        if (hashSet2.add(c71Var2)) {
                            d71Var2.k += c71Var2.c;
                        }
                    }
                }
            } else {
                for (int i8 = 0; i8 < sparseArray2.size(); i8++) {
                    ArrayList arrayList6 = ((u61) sparseArray2.valueAt(i8)).b;
                    int size3 = arrayList6.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj6 = arrayList6.get(i9);
                        i9++;
                        c71 c71Var3 = (c71) obj6;
                        if (hashSet2.remove(c71Var3)) {
                            d71Var2.k -= c71Var3.c;
                        }
                    }
                }
            }
            d71Var2.c();
            z61Var.N.e();
            z61Var.x0();
        } else if (c71Var != null) {
            z61Var.e0.i(c71Var);
            z61Var.N.e();
            z61Var.x0();
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        cx cxVar = (cx) this.a;
        byte b2 = cxVar.b;
        return String.valueOf(Math.round((cxVar.a.getProgress() * (cxVar.c - b2)) + b2));
    }

    @Override
    public final long i(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        return 0L;
    }

    @Override
    public final int i0() {
        cx cxVar = (cx) this.a;
        return cxVar.c - cxVar.b;
    }

    @Override
    public final void invalidate() {
        ((wb2) ((ob2) this.a).b).invalidate();
    }

    @Override
    public final int j0() {
        return at0.Z((at0) this.a).d;
    }

    @Override
    public final Object k(nm4 nm4Var, zw2 zw2Var) {
        Object k = ((ym4) this.a).k(new z73(nm4Var, (byte) 0), zw2Var);
        if (k == vx2.a) {
            return k;
        }
        return g9c.a;
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
    public final void m0(RectF rectF) {
        rectF.set(((vnc) this.a).R);
    }

    @Override
    public final boolean n(float f) {
        return false;
    }

    @Override
    public final void o(boolean z, float f) {
        byte b2;
        cx cxVar = (cx) this.a;
        int round = Math.round(((cxVar.c - b2) * f) + cxVar.b);
        if (round != xea.V0) {
            xea.V0 = round;
            SharedPreferences.Editor edit = uc7.e1().edit();
            edit.putInt("iv_font_size", xea.V0);
            edit.commit();
            cxVar.f.v0[0].getAdapter().E.clear();
            o oVar = cxVar.f;
            for (int i = 0; i < 2; i++) {
                oVar.v0[i].c.f();
                ex exVar = oVar.v0[i].c;
                ArrayList arrayList = exVar.d;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i2);
                    if (pageBlock != null) {
                        pageBlock.cachedWidth = 0;
                        pageBlock.cachedHeight = 0;
                    }
                }
                Utilities.e.a(exVar.M);
                Utilities.e.d(exVar.M, 100L);
            }
            cxVar.invalidate();
        }
    }

    @Override
    public final int q() {
        return 1;
    }

    @Override
    public final void r(r47 r47Var) {
        xo2 xo2Var = (xo2) this.a;
        xo2Var.t1.presentFragment(nx9.N(xo2Var.a, r47Var));
        xo2Var.dismiss();
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void t(boolean z) {
        fm0 fm0Var = ((at0) this.a).s;
        if (fm0Var != null) {
            fm0Var.a(z, true);
        }
    }

    @Override
    public final Task then(Object obj) {
        hba hbaVar = (hba) obj;
        yy2 yy2Var = ((wy2) this.a).e;
        if (hbaVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        sy2 sy2Var = yy2.r;
        return Tasks.whenAll(yy2Var.h(), yy2Var.m.h((i03) yy2Var.e.b, null));
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void v() {
        z61 z61Var = (z61) this.a;
        d71 d71Var = z61Var.e0;
        if (d71Var != null && d71Var.j.size() > 0) {
            z61Var.e0.d();
            l61 l61Var = z61Var.N;
            if (l61Var != null) {
                l61Var.f(false);
                z61Var.N.e();
            }
        }
    }

    @Override
    public final void w(boolean z) {
        wh1 wh1Var = (wh1) this.a;
        if (wh1.o0(wh1Var) instanceof vh1) {
            wh1 wh1Var2 = ((vh1) wh1.p0(wh1Var)).a;
            wh1Var2.K = !wh1Var2.K;
            wh1Var2.k1();
            wh1Var2.g1(false);
        }
        wh1Var.b1(a(), false);
        wh1Var.g1(false);
    }

    @Override
    public final View x0() {
        return (vnc) this.a;
    }

    public final void y(sh2 sh2Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        long[] jArr = sh2Var.e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(sh2Var.e[0]), sh2Var);
        }
    }

    public final float z(th4 th4Var, th4 th4Var2) {
        int i = (int) th4Var.b;
        int i2 = (int) th4Var2.b;
        float J = J((int) th4Var.a, i, (int) th4Var2.a, i2);
        float J2 = J((int) th4Var2.a, i2, (int) th4Var.a, i);
        if (Float.isNaN(J)) {
            return J2 / 7.0f;
        }
        if (Float.isNaN(J2)) {
            return J / 7.0f;
        }
        return (J + J2) / 14.0f;
    }

    @Override
    public final boolean z0(f27 f27Var) {
        Window.Callback callback;
        cp cpVar = (cp) this.a;
        if (f27Var == f27Var.k() && cpVar.P && (callback = cpVar.f.getCallback()) != null && !cpVar.a0) {
            callback.onMenuOpened(108, f27Var);
            return true;
        }
        return true;
    }

    @Override
    public final void c() {
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void j(boolean z) {
    }

    @Override
    public final void h(r47 r47Var, View view, int i) {
    }

    public wz4(al5 al5Var) {
        xve.h(al5Var);
        this.a = al5Var;
    }

    public wz4(Object obj) {
        this.a = obj;
    }
}
