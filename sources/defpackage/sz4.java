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
public final class sz4 implements w17, r27, cx9, t66, cja, l81, lcb, job, kj1, tcc, bh4, SuccessContinuation, im4, wn3, qha {
    public static volatile sz4 b;
    public static volatile sz4 d;
    public Object a;
    public static final Object c = new Object();
    public static final ndd e = new ndd((byte) 2);

    public sz4(byte b2) {
        switch (b2) {
            case 1:
                this.a = new ConcurrentHashMap();
                return;
            case 2:
                kce kceVar = kce.c;
                cf9 cf9Var = new cf9(new mae[]{dhf.h, e}, (byte) 28);
                Charset charset = k5e.a;
                this.a = cf9Var;
                return;
            case 19:
                this.a = new LinkedHashMap();
                return;
            case 28:
                this.a = new vh6();
                return;
            default:
                this.a = new HashSet();
                return;
        }
    }

    public static sz4 F() {
        if (d == null) {
            synchronized (c) {
                if (d == null) {
                    d = new sz4((byte) 1);
                }
            }
        }
        sz4 sz4Var = d;
        ite.h(sz4Var);
        return sz4Var;
    }

    @Override
    public final void A() {
        ((jd0) this.a).a.invalidate();
    }

    @Override
    public final boolean B(y17 y17Var, MenuItem menuItem) {
        e9 e9Var = ((ActionMenuView) this.a).Q;
        if (e9Var != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((cf9) e9Var).b).a0.c).iterator();
            while (it.hasNext()) {
                if (((aq4) it.next()).a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final kk C(float f, float f2, int i, int i2) {
        int i3;
        kk b2;
        kk b3;
        int i4 = (int) (f2 * f);
        int max = Math.max(0, i - i4);
        qk0 qk0Var = (qk0) this.a;
        int min = Math.min(qk0Var.a - 1, i + i4) - max;
        float f3 = 3.0f * f;
        if (min >= f3) {
            int max2 = Math.max(0, i2 - i4);
            int min2 = Math.min(qk0Var.b - 1, i2 + i4) - max2;
            if (min2 >= f3) {
                qk0 qk0Var2 = (qk0) this.a;
                lk lkVar = new lk(qk0Var2, max, max2, min, min2, f);
                int i5 = lkVar.e;
                int i6 = lkVar.c;
                int i7 = i5 + i6;
                int i8 = lkVar.f;
                int i9 = (i8 / 2) + lkVar.d;
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
                    while (i12 < i7 && !qk0Var2.b(i12, i11)) {
                        i12++;
                    }
                    int i13 = 0;
                    while (i12 < i7) {
                        if (qk0Var2.b(i12, i11)) {
                            if (i13 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i13 == 2) {
                                if (lkVar.a(iArr) && (b3 = lkVar.b(i11, i12, iArr)) != null) {
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
                    if (lkVar.a(iArr) && (b2 = lkVar.b(i11, i7, iArr)) != null) {
                        return b2;
                    }
                }
                ArrayList arrayList = lkVar.b;
                if (!arrayList.isEmpty()) {
                    return (kk) arrayList.get(0);
                }
                throw xl7.a();
            }
            throw xl7.a();
        }
        throw xl7.a();
    }

    public final SparseIntArray E(long j) {
        return (SparseIntArray) ((vh6) this.a).f(j);
    }

    public final Set G() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.a)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.a);
        }
        return unmodifiableSet;
    }

    public final oi2 H() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (oi2 oi2Var : ((LinkedHashMap) this.a).values()) {
            arrayList.add(oi2Var.b);
            arrayList2.add(oi2Var.c);
            arrayList3.add(oi2Var.d);
            arrayList4.add(oi2Var.e);
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
        jte.d(j, "the total number of elements (%s) in the arrays must fit in an int", z);
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i2, iArr4.length);
            i2 += iArr4.length;
        }
        return new oi2(iArr3, cqe.a((long[][]) arrayList2.toArray(new long[arrayList2.size()])), cqe.a((long[][]) arrayList3.toArray(new long[arrayList3.size()])), cqe.a((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
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
        sz4 sz4Var;
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
                    sz4Var = this;
                } else {
                    z2 = false;
                    sz4Var = this;
                    i13 = abs;
                }
                if (z2 == ((qk0) sz4Var.a).b(i11, i12)) {
                    if (i20 == 2) {
                        return oqe.b(i18, i19, i5, i6);
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
            return oqe.b(i17, i8, i5, i6);
        }
        return Float.NaN;
    }

    public final float J(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        qk0 qk0Var = (qk0) this.a;
        float I = I(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else {
            int i7 = qk0Var.a;
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
            int i10 = qk0Var.b;
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
        if (!(serviceConnection instanceof j7f) && concurrentHashMap.containsKey(serviceConnection)) {
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
                if ((s0d.a(context).a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof j7f)) {
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
    public final void T1(y17 y17Var) {
        oo8 oo8Var = ((ActionMenuView) this.a).L;
        if (oo8Var != null) {
            oo8Var.T1(y17Var);
        }
    }

    @Override
    public final boolean a() {
        vi1 vi1Var = (vi1) this.a;
        if (vi1.u0(vi1Var) != null) {
            return vi1.v0(vi1Var).a();
        }
        return cmb.I.o();
    }

    @Override
    public final int b(long j) {
        if (j < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final float b0() {
        return b10.c(9.66f, eh0.d(au0.Z((au0) this.a).b), 0);
    }

    @Override
    public final void clear() {
        ((y71) this.a).i0();
    }

    @Override
    public final void d(y17 y17Var, boolean z) {
        boolean z2;
        int i;
        aq aqVar;
        bq bqVar = (bq) this.a;
        y17 k = y17Var.k();
        int i2 = 0;
        if (k != y17Var) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            y17Var = k;
        }
        aq[] aqVarArr = bqVar.V;
        if (aqVarArr != null) {
            i = aqVarArr.length;
        } else {
            i = 0;
        }
        while (true) {
            if (i2 < i) {
                aqVar = aqVarArr[i2];
                if (aqVar != null && aqVar.h == y17Var) {
                    break;
                }
                i2++;
            } else {
                aqVar = null;
                break;
            }
        }
        if (aqVar != null) {
            if (z2) {
                bqVar.f(aqVar.a, aqVar, k);
                bqVar.h(aqVar, true);
                return;
            }
            bqVar.h(aqVar, z);
        }
    }

    @Override
    public final void d0(boolean z) {
        ((jlc) this.a).setLanguagePillHidden(z);
    }

    @Override
    public final boolean e(ug4 ug4Var) {
        return false;
    }

    @Override
    public final Object g(jm4 jm4Var, px2 px2Var) {
        Object g = ((mj4) this.a).g(new s83(jm4Var, (byte) 0), px2Var);
        if (g == ly2.a) {
            return g;
        }
        return g7c.a;
    }

    @Override
    public final CharSequence getContentDescription() {
        cy cyVar = (cy) this.a;
        byte b2 = cyVar.b;
        return String.valueOf(Math.round((cyVar.a.getProgress() * (cyVar.c - b2)) + b2));
    }

    @Override
    public final void h(s71 s71Var, b81 b81Var, boolean z) {
        HashSet hashSet;
        int i;
        y71 y71Var = (y71) this.a;
        if (s71Var != null) {
            if (y71Var.e0.j.size() <= 0 && !z) {
                if (y71Var.H > 0 && y71Var.getParentActivity() != null) {
                    s71Var.getClass();
                    c81 c81Var = new c81(true);
                    SparseArray sparseArray = s71Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = c81Var.d;
                    if (obj != null) {
                        arrayList.addAll(((t71) sparseArray.get(0)).b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((t71) sparseArray.get(1)).b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = c81Var.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((t71) sparseArray.get(2)).b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = c81Var.f;
                    if (obj3 != null) {
                        arrayList3.addAll(((t71) sparseArray.get(3)).b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = c81Var.g;
                    if (obj4 != null) {
                        arrayList4.addAll(((t71) sparseArray.get(4)).b);
                    }
                    int i2 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = c81Var.j;
                        if (i2 >= size) {
                            break;
                        }
                        hashSet.add((b81) arrayList.get(i2));
                        if (((b81) arrayList.get(i2)).d == 0) {
                            c81Var.r += ((b81) arrayList.get(i2)).c;
                            i = i2;
                        } else {
                            i = i2;
                            c81Var.s += ((b81) arrayList.get(i)).c;
                        }
                        i2 = i + 1;
                    }
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        hashSet.add((b81) arrayList2.get(i3));
                        c81Var.t += ((b81) arrayList2.get(i3)).c;
                    }
                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                        hashSet.add((b81) arrayList3.get(i4));
                        c81Var.u += ((b81) arrayList3.get(i4)).c;
                    }
                    for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                        hashSet.add((b81) arrayList4.get(i5));
                        c81Var.v += ((b81) arrayList4.get(i5)).c;
                    }
                    c81Var.m = true;
                    c81Var.n = true;
                    c81Var.o = true;
                    c81Var.p = true;
                    c81Var.q = true;
                    Collections.sort(arrayList, new sa((byte) 14));
                    Collections.sort(arrayList2, new sa((byte) 14));
                    Collections.sort(arrayList3, new sa((byte) 14));
                    Collections.sort(arrayList4, new sa((byte) 14));
                    Collections.sort(c81Var.h, new sa((byte) 14));
                    wf3 wf3Var = new wf3(y71Var, s71Var, c81Var, new hi2(y71Var, s71Var, false, (byte) 13));
                    y71Var.a0 = wf3Var;
                    y71Var.showDialog(wf3Var);
                    return;
                }
                return;
            }
            c81 c81Var2 = y71Var.e0;
            HashSet hashSet2 = c81Var2.j;
            HashSet hashSet3 = c81Var2.l;
            long j = s71Var.a;
            SparseArray sparseArray2 = s71Var.d;
            if (!hashSet3.contains(Long.valueOf(j))) {
                for (int i6 = 0; i6 < sparseArray2.size(); i6++) {
                    ArrayList arrayList5 = ((t71) sparseArray2.valueAt(i6)).b;
                    int size2 = arrayList5.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj5 = arrayList5.get(i7);
                        i7++;
                        b81 b81Var2 = (b81) obj5;
                        if (hashSet2.add(b81Var2)) {
                            c81Var2.k += b81Var2.c;
                        }
                    }
                }
            } else {
                for (int i8 = 0; i8 < sparseArray2.size(); i8++) {
                    ArrayList arrayList6 = ((t71) sparseArray2.valueAt(i8)).b;
                    int size3 = arrayList6.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj6 = arrayList6.get(i9);
                        i9++;
                        b81 b81Var3 = (b81) obj6;
                        if (hashSet2.remove(b81Var3)) {
                            c81Var2.k -= b81Var3.c;
                        }
                    }
                }
            }
            c81Var2.c();
            y71Var.N.e();
            y71Var.x0();
        } else if (b81Var != null) {
            y71Var.e0.i(b81Var);
            y71Var.N.e();
            y71Var.x0();
        }
    }

    @Override
    public final int h0() {
        return au0.a0((au0) this.a).d;
    }

    @Override
    public final void invalidate() {
        ((rc2) ((jc2) this.a).b).invalidate();
    }

    @Override
    public final int j0() {
        cy cyVar = (cy) this.a;
        return cyVar.c - cyVar.b;
    }

    @Override
    public final long k(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        return 0L;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void l0(RectF rectF) {
        rectF.set(((jlc) this.a).R);
    }

    @Override
    public final boolean m(float f) {
        return false;
    }

    @Override
    public final void n(boolean z, float f) {
        byte b2;
        cy cyVar = (cy) this.a;
        int round = Math.round(((cyVar.c - b2) * f) + cyVar.b);
        if (round != gda.V0) {
            gda.V0 = round;
            SharedPreferences.Editor edit = oc7.d1().edit();
            edit.putInt("iv_font_size", gda.V0);
            edit.commit();
            cyVar.f.v0[0].getAdapter().E.clear();
            o oVar = cyVar.f;
            for (int i = 0; i < 2; i++) {
                oVar.v0[i].c.f();
                ey eyVar = oVar.v0[i].c;
                ArrayList arrayList = eyVar.d;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i2);
                    if (pageBlock != null) {
                        pageBlock.cachedWidth = 0;
                        pageBlock.cachedHeight = 0;
                    }
                }
                Utilities.e.a(eyVar.M);
                Utilities.e.d(eyVar.M, 100L);
            }
            cyVar.invalidate();
        }
    }

    @Override
    public final List p(long j) {
        if (j >= 0) {
            return (List) this.a;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public final int q() {
        return 1;
    }

    @Override
    public final void r(k47 k47Var) {
        pp2 pp2Var = (pp2) this.a;
        pp2Var.t1.presentFragment(vv9.M(pp2Var.a, k47Var));
        pp2Var.dismiss();
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void t(boolean z) {
        fn0 fn0Var = ((au0) this.a).s;
        if (fn0Var != null) {
            fn0Var.a(z, true);
        }
    }

    @Override
    public final Task then(Object obj) {
        r9a r9aVar = (r9a) obj;
        nz2 nz2Var = ((lz2) this.a).e;
        if (r9aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        iz2 iz2Var = nz2.r;
        return Tasks.whenAll(nz2Var.h(), nz2Var.m.h((a13) nz2Var.e.b, null));
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void v() {
        y71 y71Var = (y71) this.a;
        c81 c81Var = y71Var.e0;
        if (c81Var != null && c81Var.j.size() > 0) {
            y71Var.e0.d();
            k71 k71Var = y71Var.N;
            if (k71Var != null) {
                k71Var.f(false);
                y71Var.N.e();
            }
        }
    }

    @Override
    public final View v0() {
        return (jlc) this.a;
    }

    @Override
    public final void w(boolean z) {
        vi1 vi1Var = (vi1) this.a;
        if (vi1.w0(vi1Var) instanceof ui1) {
            vi1 vi1Var2 = ((ui1) vi1.x0(vi1Var)).a;
            vi1Var2.K = !vi1Var2.K;
            vi1Var2.k1();
            vi1Var2.g1(false);
        }
        vi1Var.b1(a(), false);
        vi1Var.g1(false);
    }

    @Override
    public final boolean w0(y17 y17Var) {
        Window.Callback callback;
        bq bqVar = (bq) this.a;
        if (y17Var == y17Var.k() && bqVar.P && (callback = bqVar.f.getCallback()) != null && !bqVar.a0) {
            callback.onMenuOpened(108, y17Var);
            return true;
        }
        return true;
    }

    public final void y(oi2 oi2Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        long[] jArr = oi2Var.e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(oi2Var.e[0]), oi2Var);
        }
    }

    public final float z(wh4 wh4Var, wh4 wh4Var2) {
        int i = (int) wh4Var.b;
        int i2 = (int) wh4Var2.b;
        float J = J((int) wh4Var.a, i, (int) wh4Var2.a, i2);
        float J2 = J((int) wh4Var2.a, i2, (int) wh4Var.a, i);
        if (Float.isNaN(J)) {
            return J2 / 7.0f;
        }
        if (Float.isNaN(J2)) {
            return J / 7.0f;
        }
        return (J + J2) / 14.0f;
    }

    @Override
    public final void c() {
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void j(boolean z) {
    }

    @Override
    public final void i(k47 k47Var, View view, int i) {
    }

    public sz4(xk5 xk5Var) {
        ite.h(xk5Var);
        this.a = xk5Var;
    }

    public sz4(Object obj) {
        this.a = obj;
    }
}
