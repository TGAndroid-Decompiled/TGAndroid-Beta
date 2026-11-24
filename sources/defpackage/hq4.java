package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public abstract class hq4 {
    public final bq4 A;
    public final kg7 B;
    public u9 C;
    public u9 D;
    public u9 E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public kq4 O;
    public final o04 P;
    public boolean b;
    public ArrayList e;
    public yq7 g;
    public final ArrayList n;
    public final wm4 o;
    public final CopyOnWriteArrayList p;
    public final yp4 q;
    public final yp4 r;
    public final yp4 s;
    public final yp4 t;
    public final aq4 u;
    public int v;
    public fp4 w;
    public jke x;
    public dp4 y;
    public dp4 z;
    public final ArrayList a = new ArrayList();
    public final e7a c = new e7a((byte) 6);
    public ArrayList d = new ArrayList();
    public final xp4 f = new xp4(this);
    public ie0 h = null;
    public boolean i = false;
    public final zp4 j = new zp4(this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = DesugarCollections.synchronizedMap(new HashMap());
    public final Map m = DesugarCollections.synchronizedMap(new HashMap());

    public hq4() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.n = new ArrayList();
        this.o = new wm4(this);
        this.p = new CopyOnWriteArrayList();
        this.q = new gu2(this) {
            public final hq4 b;

            {
                this.b = this;
            }

            @Override
            public final void accept(Object obj) {
                byte b = r2;
                hq4 hq4Var = this.b;
                switch (b) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (hq4Var.M()) {
                            hq4Var.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (hq4Var.M() && num.intValue() == 80) {
                            hq4Var.m(false);
                            return;
                        }
                        return;
                    case 2:
                        vi7 vi7Var = (vi7) obj;
                        if (hq4Var.M()) {
                            boolean z = vi7Var.a;
                            hq4Var.n(false);
                            return;
                        }
                        return;
                    default:
                        dc8 dc8Var = (dc8) obj;
                        if (hq4Var.M()) {
                            boolean z2 = dc8Var.a;
                            hq4Var.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.r = new gu2(this) {
            public final hq4 b;

            {
                this.b = this;
            }

            @Override
            public final void accept(Object obj) {
                byte b = r2;
                hq4 hq4Var = this.b;
                switch (b) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (hq4Var.M()) {
                            hq4Var.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (hq4Var.M() && num.intValue() == 80) {
                            hq4Var.m(false);
                            return;
                        }
                        return;
                    case 2:
                        vi7 vi7Var = (vi7) obj;
                        if (hq4Var.M()) {
                            boolean z = vi7Var.a;
                            hq4Var.n(false);
                            return;
                        }
                        return;
                    default:
                        dc8 dc8Var = (dc8) obj;
                        if (hq4Var.M()) {
                            boolean z2 = dc8Var.a;
                            hq4Var.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.s = new gu2(this) {
            public final hq4 b;

            {
                this.b = this;
            }

            @Override
            public final void accept(Object obj) {
                byte b = r2;
                hq4 hq4Var = this.b;
                switch (b) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (hq4Var.M()) {
                            hq4Var.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (hq4Var.M() && num.intValue() == 80) {
                            hq4Var.m(false);
                            return;
                        }
                        return;
                    case 2:
                        vi7 vi7Var = (vi7) obj;
                        if (hq4Var.M()) {
                            boolean z = vi7Var.a;
                            hq4Var.n(false);
                            return;
                        }
                        return;
                    default:
                        dc8 dc8Var = (dc8) obj;
                        if (hq4Var.M()) {
                            boolean z2 = dc8Var.a;
                            hq4Var.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.t = new gu2(this) {
            public final hq4 b;

            {
                this.b = this;
            }

            @Override
            public final void accept(Object obj) {
                byte b = r2;
                hq4 hq4Var = this.b;
                switch (b) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (hq4Var.M()) {
                            hq4Var.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (hq4Var.M() && num.intValue() == 80) {
                            hq4Var.m(false);
                            return;
                        }
                        return;
                    case 2:
                        vi7 vi7Var = (vi7) obj;
                        if (hq4Var.M()) {
                            boolean z = vi7Var.a;
                            hq4Var.n(false);
                            return;
                        }
                        return;
                    default:
                        dc8 dc8Var = (dc8) obj;
                        if (hq4Var.M()) {
                            boolean z2 = dc8Var.a;
                            hq4Var.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.u = new aq4(this);
        this.v = -1;
        this.A = new bq4(this);
        this.B = new kg7((byte) 20);
        this.F = new ArrayDeque();
        this.P = new o04(this, (byte) 8);
    }

    public static HashSet F(ie0 ie0Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < ie0Var.a.size(); i++) {
            dp4 dp4Var = ((xq4) ie0Var.a.get(i)).b;
            if (dp4Var != null && ie0Var.g) {
                hashSet.add(dp4Var);
            }
        }
        return hashSet;
    }

    public static boolean K(int i) {
        if (Log.isLoggable("FragmentManager", i)) {
            return true;
        }
        return false;
    }

    public static boolean L(dp4 dp4Var) {
        ArrayList t = dp4Var.M.c.t();
        int size = t.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = t.get(i);
            i++;
            dp4 dp4Var2 = (dp4) obj;
            if (dp4Var2 != null) {
                z = L(dp4Var2);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(dp4 dp4Var) {
        if (dp4Var != null) {
            if (dp4Var.U) {
                if (dp4Var.K == null || N(dp4Var.N)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean O(dp4 dp4Var) {
        if (dp4Var != null) {
            hq4 hq4Var = dp4Var.K;
            if (dp4Var == hq4Var.z && O(hq4Var.y)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void e0(dp4 dp4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + dp4Var);
        }
        if (dp4Var.R) {
            dp4Var.R = false;
            dp4Var.a0 = !dp4Var.a0;
        }
    }

    public final boolean A(boolean z) {
        boolean z2;
        ie0 ie0Var;
        z(z);
        if (!this.i && (ie0Var = this.h) != null) {
            ie0Var.r = false;
            ie0Var.d();
            if (K(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.a);
            }
            this.h.e(false, false);
            this.a.add(0, this.h);
            ArrayList arrayList = this.h.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                dp4 dp4Var = ((xq4) obj).b;
                if (dp4Var != null) {
                    dp4Var.y = false;
                }
            }
            this.h = null;
        }
        boolean z3 = false;
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    int size2 = this.a.size();
                    z2 = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        z2 |= ((eq4) this.a.get(i2)).a(arrayList2, arrayList3);
                    }
                    this.a.clear();
                    this.w.c.removeCallbacks(this.P);
                }
            }
            if (z2) {
                z3 = true;
                this.b = true;
                try {
                    W(this.L, this.M);
                } finally {
                    d();
                }
            } else {
                h0();
                v();
                ((HashMap) this.c.b).values().removeAll(Collections.singleton(null));
                return z3;
            }
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        String str;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        e7a e7aVar = this.c;
        ArrayList arrayList3 = this.n;
        boolean z4 = ((ie0) arrayList.get(i)).o;
        ArrayList arrayList4 = this.N;
        if (arrayList4 == null) {
            this.N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.N.addAll(e7aVar.u());
        dp4 dp4Var = this.z;
        int i6 = i;
        boolean z5 = false;
        while (i6 < i2) {
            ie0 ie0Var = (ie0) arrayList.get(i6);
            boolean booleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
            ArrayList arrayList5 = this.N;
            if (!booleanValue) {
                ArrayList arrayList6 = ie0Var.a;
                int i7 = 0;
                while (i7 < arrayList6.size()) {
                    xq4 xq4Var = (xq4) arrayList6.get(i7);
                    boolean z6 = z4;
                    int i8 = xq4Var.a;
                    int i9 = i6;
                    int i10 = 1;
                    if (i8 != 1) {
                        z3 = z5;
                        if (i8 != 2) {
                            if (i8 != 3 && i8 != 6) {
                                if (i8 != 7) {
                                    if (i8 == 8) {
                                        arrayList6.add(i7, new xq4(9, dp4Var, 0));
                                        xq4Var.c = true;
                                        i7++;
                                        dp4Var = xq4Var.b;
                                    }
                                } else {
                                    i10 = 1;
                                }
                            } else {
                                arrayList5.remove(xq4Var.b);
                                dp4 dp4Var2 = xq4Var.b;
                                if (dp4Var2 == dp4Var) {
                                    arrayList6.add(i7, new xq4(9, dp4Var2));
                                    i7++;
                                    dp4Var = null;
                                }
                            }
                            i10 = 1;
                        } else {
                            dp4 dp4Var3 = xq4Var.b;
                            int i11 = dp4Var3.P;
                            int size = arrayList5.size() - 1;
                            boolean z7 = false;
                            while (size >= 0) {
                                int i12 = size;
                                dp4 dp4Var4 = (dp4) arrayList5.get(size);
                                if (dp4Var4.P == i11) {
                                    if (dp4Var4 == dp4Var3) {
                                        i4 = i11;
                                        z7 = true;
                                    } else {
                                        if (dp4Var4 == dp4Var) {
                                            i4 = i11;
                                            arrayList6.add(i7, new xq4(9, dp4Var4, 0));
                                            i7++;
                                            i5 = 0;
                                            dp4Var = null;
                                        } else {
                                            i4 = i11;
                                            i5 = 0;
                                        }
                                        xq4 xq4Var2 = new xq4(3, dp4Var4, i5);
                                        xq4Var2.d = xq4Var.d;
                                        xq4Var2.f = xq4Var.f;
                                        xq4Var2.e = xq4Var.e;
                                        xq4Var2.g = xq4Var.g;
                                        arrayList6.add(i7, xq4Var2);
                                        arrayList5.remove(dp4Var4);
                                        i7++;
                                        dp4Var = dp4Var;
                                    }
                                } else {
                                    i4 = i11;
                                }
                                size = i12 - 1;
                                i11 = i4;
                            }
                            i10 = 1;
                            if (z7) {
                                arrayList6.remove(i7);
                                i7--;
                            } else {
                                xq4Var.a = 1;
                                xq4Var.c = true;
                                arrayList5.add(dp4Var3);
                            }
                        }
                        i7 += i10;
                        z4 = z6;
                        i6 = i9;
                        z5 = z3;
                    } else {
                        z3 = z5;
                    }
                    arrayList5.add(xq4Var.b);
                    i7 += i10;
                    z4 = z6;
                    i6 = i9;
                    z5 = z3;
                }
                z = z4;
                i3 = i6;
                z2 = z5;
            } else {
                z = z4;
                i3 = i6;
                z2 = z5;
                int i13 = 1;
                ArrayList arrayList7 = ie0Var.a;
                int size2 = arrayList7.size() - 1;
                while (size2 >= 0) {
                    xq4 xq4Var3 = (xq4) arrayList7.get(size2);
                    int i14 = xq4Var3.a;
                    if (i14 != i13) {
                        if (i14 != 3) {
                            switch (i14) {
                                case 8:
                                    dp4Var = null;
                                    break;
                                case 9:
                                    dp4Var = xq4Var3.b;
                                    break;
                                case 10:
                                    xq4Var3.i = xq4Var3.h;
                                    break;
                            }
                            size2--;
                            i13 = 1;
                        }
                        arrayList5.add(xq4Var3.b);
                        size2--;
                        i13 = 1;
                    }
                    arrayList5.remove(xq4Var3.b);
                    size2--;
                    i13 = 1;
                }
            }
            if (!z2 && !ie0Var.g) {
                z5 = false;
            } else {
                z5 = true;
            }
            i6 = i3 + 1;
            z4 = z;
        }
        boolean z8 = z4;
        boolean z9 = z5;
        this.N.clear();
        if (!z8 && this.v >= 1) {
            for (int i15 = i; i15 < i2; i15++) {
                ArrayList arrayList8 = ((ie0) arrayList.get(i15)).a;
                int size3 = arrayList8.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList8.get(i16);
                    i16++;
                    dp4 dp4Var5 = ((xq4) obj).b;
                    if (dp4Var5 != null && dp4Var5.K != null) {
                        e7aVar.y(g(dp4Var5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i17 = i;
        while (i17 < i2) {
            ie0 ie0Var2 = (ie0) arrayList.get(i17);
            if (((Boolean) arrayList2.get(i17)).booleanValue()) {
                ie0Var2.c(-1);
                hq4 hq4Var = ie0Var2.q;
                ArrayList arrayList9 = ie0Var2.a;
                boolean z10 = true;
                for (int size4 = arrayList9.size() - 1; size4 >= 0; size4--) {
                    xq4 xq4Var4 = (xq4) arrayList9.get(size4);
                    dp4 dp4Var6 = xq4Var4.b;
                    if (dp4Var6 != null) {
                        if (dp4Var6.Z != null) {
                            dp4Var6.j().a = z10;
                        }
                        int i18 = ie0Var2.f;
                        char c = 8194;
                        char c2 = 4097;
                        if (i18 != 4097) {
                            if (i18 != 8194) {
                                c = 4100;
                                if (i18 != 8197) {
                                    c2 = 4099;
                                    if (i18 != 4099) {
                                        if (i18 != 4100) {
                                            c = 0;
                                        } else {
                                            c = 8197;
                                        }
                                    }
                                }
                            }
                            c = c2;
                        }
                        if (dp4Var6.Z != null || c != 0) {
                            dp4Var6.j();
                            dp4Var6.Z.getClass();
                        }
                        dp4Var6.j();
                        dp4Var6.Z.getClass();
                    }
                    switch (xq4Var4.a) {
                        case 1:
                            dp4Var6.M(xq4Var4.d, xq4Var4.e, xq4Var4.f, xq4Var4.g);
                            z10 = true;
                            hq4Var.a0(dp4Var6, true);
                            hq4Var.V(dp4Var6);
                            break;
                        case 2:
                        default:
                            zo4.g(xq4Var4.a, str2);
                            return;
                        case 3:
                            dp4Var6.M(xq4Var4.d, xq4Var4.e, xq4Var4.f, xq4Var4.g);
                            hq4Var.a(dp4Var6);
                            z10 = true;
                            break;
                        case 4:
                            dp4Var6.M(xq4Var4.d, xq4Var4.e, xq4Var4.f, xq4Var4.g);
                            hq4Var.getClass();
                            e0(dp4Var6);
                            z10 = true;
                            break;
                        case 5:
                            dp4Var6.M(xq4Var4.d, xq4Var4.e, xq4Var4.f, xq4Var4.g);
                            hq4Var.a0(dp4Var6, true);
                            hq4Var.J(dp4Var6);
                            z10 = true;
                            break;
                        case 6:
                            dp4Var6.M(xq4Var4.d, xq4Var4.e, xq4Var4.f, xq4Var4.g);
                            hq4Var.c(dp4Var6);
                            z10 = true;
                            break;
                        case 7:
                            dp4Var6.M(xq4Var4.d, xq4Var4.e, xq4Var4.f, xq4Var4.g);
                            hq4Var.a0(dp4Var6, true);
                            hq4Var.h(dp4Var6);
                            z10 = true;
                            break;
                        case 8:
                            hq4Var.c0(null);
                            z10 = true;
                            break;
                        case 9:
                            hq4Var.c0(dp4Var6);
                            z10 = true;
                            break;
                        case 10:
                            xq4Var4.i = dp4Var6.d0;
                            hq4Var.b0(dp4Var6, xq4Var4.h);
                            z10 = true;
                            break;
                    }
                }
                continue;
            } else {
                ie0Var2.c(1);
                hq4 hq4Var2 = ie0Var2.q;
                ArrayList arrayList10 = ie0Var2.a;
                int size5 = arrayList10.size();
                int i19 = 0;
                while (i19 < size5) {
                    xq4 xq4Var5 = (xq4) arrayList10.get(i19);
                    dp4 dp4Var7 = xq4Var5.b;
                    if (dp4Var7 != null) {
                        if (dp4Var7.Z != null) {
                            dp4Var7.j().a = false;
                        }
                        int i20 = ie0Var2.f;
                        if (dp4Var7.Z != null || i20 != 0) {
                            dp4Var7.j();
                            dp4Var7.Z.getClass();
                        }
                        dp4Var7.j();
                        dp4Var7.Z.getClass();
                    }
                    switch (xq4Var5.a) {
                        case 1:
                            str = str2;
                            dp4Var7.M(xq4Var5.d, xq4Var5.e, xq4Var5.f, xq4Var5.g);
                            hq4Var2.a0(dp4Var7, false);
                            hq4Var2.a(dp4Var7);
                            break;
                        case 2:
                        default:
                            zo4.g(xq4Var5.a, str2);
                            return;
                        case 3:
                            str = str2;
                            dp4Var7.M(xq4Var5.d, xq4Var5.e, xq4Var5.f, xq4Var5.g);
                            hq4Var2.V(dp4Var7);
                            break;
                        case 4:
                            str = str2;
                            dp4Var7.M(xq4Var5.d, xq4Var5.e, xq4Var5.f, xq4Var5.g);
                            hq4Var2.J(dp4Var7);
                            break;
                        case 5:
                            str = str2;
                            dp4Var7.M(xq4Var5.d, xq4Var5.e, xq4Var5.f, xq4Var5.g);
                            hq4Var2.a0(dp4Var7, false);
                            e0(dp4Var7);
                            break;
                        case 6:
                            str = str2;
                            dp4Var7.M(xq4Var5.d, xq4Var5.e, xq4Var5.f, xq4Var5.g);
                            hq4Var2.h(dp4Var7);
                            break;
                        case 7:
                            str = str2;
                            dp4Var7.M(xq4Var5.d, xq4Var5.e, xq4Var5.f, xq4Var5.g);
                            hq4Var2.a0(dp4Var7, false);
                            hq4Var2.c(dp4Var7);
                            break;
                        case 8:
                            hq4Var2.c0(dp4Var7);
                            str = str2;
                            break;
                        case 9:
                            hq4Var2.c0(null);
                            str = str2;
                            break;
                        case 10:
                            xq4Var5.h = dp4Var7.d0;
                            hq4Var2.b0(dp4Var7, xq4Var5.i);
                            str = str2;
                            break;
                    }
                    i19++;
                    str2 = str;
                }
                continue;
            }
            i17++;
            str2 = str2;
        }
        boolean booleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z9 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i21 = 0;
            while (i21 < size6) {
                Object obj2 = arrayList.get(i21);
                i21++;
                linkedHashSet.addAll(F((ie0) obj2));
            }
            if (this.h == null) {
                int size7 = arrayList3.size();
                int i22 = 0;
                while (i22 < size7) {
                    Object obj3 = arrayList3.get(i22);
                    i22++;
                    if (obj3 == null) {
                        Iterator it = linkedHashSet.iterator();
                        if (it.hasNext()) {
                            dp4 dp4Var8 = (dp4) it.next();
                            throw null;
                        }
                    } else {
                        rjb.p();
                        return;
                    }
                }
                int size8 = arrayList3.size();
                int i23 = 0;
                while (i23 < size8) {
                    Object obj4 = arrayList3.get(i23);
                    i23++;
                    if (obj4 == null) {
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            dp4 dp4Var9 = (dp4) it2.next();
                            throw null;
                        }
                    } else {
                        rjb.p();
                        return;
                    }
                }
            }
        }
        for (int i24 = i; i24 < i2; i24++) {
            ie0 ie0Var3 = (ie0) arrayList.get(i24);
            if (booleanValue2) {
                for (int size9 = ie0Var3.a.size() - 1; size9 >= 0; size9--) {
                    dp4 dp4Var10 = ((xq4) ie0Var3.a.get(size9)).b;
                    if (dp4Var10 != null) {
                        g(dp4Var10).j();
                    }
                }
            } else {
                ArrayList arrayList11 = ie0Var3.a;
                int size10 = arrayList11.size();
                int i25 = 0;
                while (i25 < size10) {
                    Object obj5 = arrayList11.get(i25);
                    i25++;
                    dp4 dp4Var11 = ((xq4) obj5).b;
                    if (dp4Var11 != null) {
                        g(dp4Var11).j();
                    }
                }
            }
        }
        Q(this.v, true);
        int i26 = i;
        Iterator it3 = f(i26, i2, arrayList).iterator();
        while (it3.hasNext()) {
            md3 md3Var = (md3) it3.next();
            md3Var.e = booleanValue2;
            synchronized (md3Var.b) {
                md3Var.e();
                ArrayList arrayList12 = md3Var.b;
                ListIterator listIterator = arrayList12.listIterator(arrayList12.size());
                if (listIterator.hasPrevious()) {
                    wma wmaVar = (wma) listIterator.previous();
                    throw null;
                }
            }
            md3Var.b();
        }
        while (i26 < i2) {
            ie0 ie0Var4 = (ie0) arrayList.get(i26);
            if (((Boolean) arrayList2.get(i26)).booleanValue() && ie0Var4.s >= 0) {
                ie0Var4.s = -1;
            }
            if (ie0Var4.p != null) {
                for (int i27 = 0; i27 < ie0Var4.p.size(); i27++) {
                    ((Runnable) ie0Var4.p.get(i27)).run();
                }
                ie0Var4.p = null;
            }
            i26++;
        }
        if (z9 && arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            rjb.p();
        }
    }

    public final dp4 C(int i) {
        e7a e7aVar = this.c;
        ArrayList arrayList = (ArrayList) e7aVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            dp4 dp4Var = (dp4) arrayList.get(size);
            if (dp4Var != null && dp4Var.O == i) {
                return dp4Var;
            }
        }
        for (uq4 uq4Var : ((HashMap) e7aVar.b).values()) {
            if (uq4Var != null) {
                dp4 dp4Var2 = uq4Var.c;
                if (dp4Var2.O == i) {
                    return dp4Var2;
                }
            }
        }
        return null;
    }

    public final dp4 D(String str) {
        e7a e7aVar = this.c;
        ArrayList arrayList = (ArrayList) e7aVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            dp4 dp4Var = (dp4) arrayList.get(size);
            if (dp4Var != null && str.equals(dp4Var.Q)) {
                return dp4Var;
            }
        }
        for (uq4 uq4Var : ((HashMap) e7aVar.b).values()) {
            if (uq4Var != null) {
                dp4 dp4Var2 = uq4Var.c;
                if (str.equals(dp4Var2.Q)) {
                    return dp4Var2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((md3) it.next()).getClass();
        }
    }

    public final ViewGroup G(dp4 dp4Var) {
        ViewGroup viewGroup = dp4Var.W;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (dp4Var.P > 0 && this.x.c()) {
            View b = this.x.b(dp4Var.P);
            if (b instanceof ViewGroup) {
                return (ViewGroup) b;
            }
            return null;
        }
        return null;
    }

    public final bq4 H() {
        dp4 dp4Var = this.y;
        if (dp4Var != null) {
            return dp4Var.K.H();
        }
        return this.A;
    }

    public final kg7 I() {
        dp4 dp4Var = this.y;
        if (dp4Var != null) {
            return dp4Var.K.I();
        }
        return this.B;
    }

    public final void J(dp4 dp4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + dp4Var);
        }
        if (!dp4Var.R) {
            dp4Var.R = true;
            dp4Var.a0 = !dp4Var.a0;
            d0(dp4Var);
        }
    }

    public final boolean M() {
        dp4 dp4Var = this.y;
        if (dp4Var == null) {
            return true;
        }
        if (dp4Var.t() && this.y.p().M()) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if (!this.H && !this.I) {
            return false;
        }
        return true;
    }

    public final void Q(int i, boolean z) {
        fp4 fp4Var;
        if (this.w == null && i != -1) {
            dq9.m("No activity");
        } else if (z || i != this.v) {
            this.v = i;
            e7a e7aVar = this.c;
            HashMap hashMap = (HashMap) e7aVar.b;
            ArrayList arrayList = (ArrayList) e7aVar.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                uq4 uq4Var = (uq4) hashMap.get(((dp4) obj).e);
                if (uq4Var != null) {
                    uq4Var.j();
                }
            }
            for (uq4 uq4Var2 : hashMap.values()) {
                if (uq4Var2 != null) {
                    uq4Var2.j();
                    dp4 dp4Var = uq4Var2.c;
                    if (dp4Var.x && !dp4Var.v()) {
                        e7aVar.z(uq4Var2);
                    }
                }
            }
            f0();
            if (this.G && (fp4Var = this.w) != null && this.v == 7) {
                fp4Var.e.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void R() {
        if (this.w != null) {
            this.H = false;
            this.I = false;
            this.O.g = false;
            for (dp4 dp4Var : this.c.u()) {
                if (dp4Var != null) {
                    dp4Var.M.R();
                }
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i, int i2) {
        A(false);
        z(true);
        dp4 dp4Var = this.z;
        if (dp4Var != null && i < 0 && dp4Var.l().S()) {
            return true;
        }
        boolean U = U(this.L, this.M, i, i2);
        if (U) {
            this.b = true;
            try {
                W(this.L, this.M);
            } finally {
                d();
            }
        }
        h0();
        v();
        ((HashMap) this.c.b).values().removeAll(Collections.singleton(null));
        return U;
    }

    public final boolean U(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = -1;
        if (!this.d.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (true) {
                    if (size >= 0) {
                        ie0 ie0Var = (ie0) this.d.get(size);
                        if (i < 0 || i != ie0Var.s) {
                            size--;
                        } else if (z) {
                            i3 = size;
                            while (i3 > 0) {
                                ie0 ie0Var2 = (ie0) this.d.get(i3 - 1);
                                if (i < 0 || i != ie0Var2.s) {
                                    break;
                                }
                                i3--;
                            }
                        } else if (size != this.d.size() - 1) {
                            i3 = size + 1;
                        }
                    } else {
                        i3 = size;
                        break;
                    }
                }
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((ie0) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(dp4 dp4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + dp4Var + " nesting=" + dp4Var.J);
        }
        boolean v = dp4Var.v();
        if (dp4Var.S && v) {
            return;
        }
        e7a e7aVar = this.c;
        synchronized (((ArrayList) e7aVar.a)) {
            ((ArrayList) e7aVar.a).remove(dp4Var);
        }
        dp4Var.w = false;
        if (L(dp4Var)) {
            this.G = true;
        }
        dp4Var.x = true;
        d0(dp4Var);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((ie0) arrayList.get(i)).o) {
                        if (i2 != i) {
                            B(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((ie0) arrayList.get(i2)).o) {
                                i2++;
                            }
                        }
                        B(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    B(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            dq9.m("Internal error with the back stack records");
        }
    }

    public final void X(Bundle bundle) {
        wm4 wm4Var;
        int i;
        boolean z;
        int i2;
        Bundle bundle2;
        uq4 uq4Var;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.w.b.getClassLoader());
                this.m.put(str.substring(7), bundle4);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.w.b.getClassLoader());
                hashMap.put(str2.substring(9), bundle3);
            }
        }
        e7a e7aVar = this.c;
        HashMap hashMap2 = (HashMap) e7aVar.c;
        HashMap hashMap3 = (HashMap) e7aVar.b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        jq4 jq4Var = (jq4) bundle.getParcelable("state");
        if (jq4Var == null) {
            return;
        }
        hashMap3.clear();
        ArrayList arrayList = jq4Var.a;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            wm4Var = this.o;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            Bundle I = e7aVar.I((String) obj, null);
            if (I != null) {
                dp4 dp4Var = (dp4) this.O.b.get(((tq4) I.getParcelable("state")).b);
                if (dp4Var != null) {
                    if (K(2)) {
                        i2 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + dp4Var);
                    } else {
                        i2 = 2;
                    }
                    uq4Var = new uq4(wm4Var, e7aVar, dp4Var, I);
                    bundle2 = I;
                } else {
                    i2 = 2;
                    bundle2 = I;
                    uq4Var = new uq4(this.o, this.c, this.w.b.getClassLoader(), H(), I);
                }
                dp4 dp4Var2 = uq4Var.c;
                dp4Var2.b = bundle2;
                dp4Var2.K = this;
                if (K(i2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + dp4Var2.e + "): " + dp4Var2);
                }
                uq4Var.l(this.w.b.getClassLoader());
                e7aVar.y(uq4Var);
                uq4Var.e = this.v;
            }
        }
        kq4 kq4Var = this.O;
        kq4Var.getClass();
        ArrayList arrayList2 = new ArrayList(kq4Var.b.values());
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            dp4 dp4Var3 = (dp4) obj2;
            if (hashMap3.get(dp4Var3.e) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + dp4Var3 + " that was not found in the set of active Fragments " + jq4Var.a);
                }
                this.O.f(dp4Var3);
                dp4Var3.K = this;
                uq4 uq4Var2 = new uq4(wm4Var, e7aVar, dp4Var3);
                uq4Var2.e = 1;
                uq4Var2.j();
                dp4Var3.x = true;
                uq4Var2.j();
            }
        }
        ArrayList arrayList3 = jq4Var.b;
        ((ArrayList) e7aVar.a).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                String str3 = (String) obj3;
                dp4 n = e7aVar.n(str3);
                if (n != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + n);
                    }
                    e7aVar.c(n);
                } else {
                    dq9.m(kt6.o("No instantiated fragment for (", str3, ")"));
                    return;
                }
            }
        }
        if (jq4Var.c != null) {
            this.d = new ArrayList(jq4Var.c.length);
            int i6 = 0;
            while (true) {
                je0[] je0VarArr = jq4Var.c;
                if (i6 >= je0VarArr.length) {
                    break;
                }
                je0 je0Var = je0VarArr[i6];
                ArrayList arrayList4 = je0Var.b;
                ie0 ie0Var = new ie0(this);
                int[] iArr = je0Var.a;
                int i7 = 0;
                int i8 = 0;
                while (i7 < iArr.length) {
                    ?? obj4 = new Object();
                    int i9 = i7 + 1;
                    obj4.a = iArr[i7];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + ie0Var + " op #" + i8 + " base fragment #" + iArr[i9]);
                    }
                    obj4.h = v26.values()[je0Var.c[i8]];
                    obj4.i = v26.values()[je0Var.d[i8]];
                    int i10 = i7 + 2;
                    if (iArr[i9] != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    obj4.c = z;
                    int i11 = iArr[i10];
                    obj4.d = i11;
                    int i12 = iArr[i7 + 3];
                    obj4.e = i12;
                    int i13 = i7 + 5;
                    int i14 = iArr[i7 + 4];
                    obj4.f = i14;
                    i7 += 6;
                    int[] iArr2 = iArr;
                    int i15 = iArr2[i13];
                    obj4.g = i15;
                    ie0Var.b = i11;
                    ie0Var.c = i12;
                    ie0Var.d = i14;
                    ie0Var.e = i15;
                    ie0Var.b(obj4);
                    i8++;
                    iArr = iArr2;
                }
                ie0Var.f = je0Var.e;
                ie0Var.h = je0Var.f;
                ie0Var.g = true;
                ie0Var.i = je0Var.n;
                ie0Var.j = je0Var.r;
                ie0Var.k = je0Var.s;
                ie0Var.l = je0Var.w;
                ie0Var.m = je0Var.x;
                ie0Var.n = je0Var.y;
                ie0Var.o = je0Var.E;
                ie0Var.s = je0Var.h;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    String str4 = (String) arrayList4.get(i16);
                    if (str4 != null) {
                        ((xq4) ie0Var.a.get(i16)).b = e7aVar.n(str4);
                    }
                }
                ie0Var.c(1);
                if (K(2)) {
                    StringBuilder l = hg9.l(i6, "restoreAllState: back stack #", " (index ");
                    l.append(ie0Var.s);
                    l.append("): ");
                    l.append(ie0Var);
                    Log.v("FragmentManager", l.toString());
                    PrintWriter printWriter = new PrintWriter(new ae6());
                    ie0Var.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(ie0Var);
                i6++;
            }
            i = 0;
        } else {
            i = 0;
            this.d = new ArrayList();
        }
        this.k.set(jq4Var.d);
        String str5 = jq4Var.e;
        if (str5 != null) {
            dp4 n2 = e7aVar.n(str5);
            this.z = n2;
            r(n2);
        }
        ArrayList arrayList5 = jq4Var.f;
        if (arrayList5 != null) {
            for (int i17 = i; i17 < arrayList5.size(); i17++) {
                this.l.put((String) arrayList5.get(i17), (ke0) jq4Var.h.get(i17));
            }
        }
        this.F = new ArrayDeque(jq4Var.n);
    }

    public final Bundle Y() {
        int i;
        ArrayList arrayList;
        je0[] je0VarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        x();
        A(true);
        this.H = true;
        this.O.g = true;
        e7a e7aVar = this.c;
        e7aVar.getClass();
        HashMap hashMap = (HashMap) e7aVar.b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            uq4 uq4Var = (uq4) it.next();
            if (uq4Var != null) {
                dp4 dp4Var = uq4Var.c;
                String str = dp4Var.e;
                Bundle bundle3 = new Bundle();
                dp4 dp4Var2 = uq4Var.c;
                if (dp4Var2.a == -1 && (bundle = dp4Var2.b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new tq4(dp4Var2));
                if (dp4Var2.a > 0) {
                    Bundle bundle4 = new Bundle();
                    dp4Var2.G(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    uq4Var.a.L(dp4Var2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    dp4Var2.h0.g(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle Y = dp4Var2.M.Y();
                    if (!Y.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", Y);
                    }
                    SparseArray<? extends Parcelable> sparseArray = dp4Var2.c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = dp4Var2.d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = dp4Var2.f;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                e7aVar.I(str, bundle3);
                arrayList2.add(dp4Var.e);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + dp4Var + ": " + dp4Var.b);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.c.c;
        if (hashMap2.isEmpty()) {
            if (K(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return bundle2;
            }
        } else {
            e7a e7aVar2 = this.c;
            synchronized (((ArrayList) e7aVar2.a)) {
                if (((ArrayList) e7aVar2.a).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) e7aVar2.a).size());
                    ArrayList arrayList3 = (ArrayList) e7aVar2.a;
                    int size = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList3.get(i2);
                        i2++;
                        dp4 dp4Var3 = (dp4) obj;
                        arrayList.add(dp4Var3.e);
                        if (K(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + dp4Var3.e + "): " + dp4Var3);
                        }
                    }
                }
            }
            int size2 = this.d.size();
            if (size2 > 0) {
                je0VarArr = new je0[size2];
                for (i = 0; i < size2; i++) {
                    je0VarArr[i] = new je0((ie0) this.d.get(i));
                    if (K(2)) {
                        StringBuilder l = hg9.l(i, "saveAllState: adding back stack #", ": ");
                        l.append(this.d.get(i));
                        Log.v("FragmentManager", l.toString());
                    }
                }
            } else {
                je0VarArr = null;
            }
            ?? obj2 = new Object();
            obj2.e = null;
            ArrayList arrayList4 = new ArrayList();
            obj2.f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            obj2.h = arrayList5;
            obj2.a = arrayList2;
            obj2.b = arrayList;
            obj2.c = je0VarArr;
            obj2.d = this.k.get();
            dp4 dp4Var4 = this.z;
            if (dp4Var4 != null) {
                obj2.e = dp4Var4.e;
            }
            arrayList4.addAll(this.l.keySet());
            arrayList5.addAll(this.l.values());
            obj2.n = new ArrayList(this.F);
            bundle2.putParcelable("state", obj2);
            for (String str2 : this.m.keySet()) {
                bundle2.putBundle(b10.h("result_", str2), (Bundle) this.m.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(b10.h("fragment_", str3), (Bundle) hashMap2.get(str3));
            }
        }
        return bundle2;
    }

    public final void Z() {
        synchronized (this.a) {
            if (this.a.size() == 1) {
                this.w.c.removeCallbacks(this.P);
                this.w.c.post(this.P);
                h0();
            }
        }
    }

    public final uq4 a(dp4 dp4Var) {
        String str = dp4Var.c0;
        if (str != null) {
            wq4.c(dp4Var, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + dp4Var);
        }
        uq4 g = g(dp4Var);
        dp4Var.K = this;
        e7a e7aVar = this.c;
        e7aVar.y(g);
        if (!dp4Var.S) {
            e7aVar.c(dp4Var);
            dp4Var.x = false;
            dp4Var.a0 = false;
            if (L(dp4Var)) {
                this.G = true;
            }
        }
        return g;
    }

    public final void a0(dp4 dp4Var, boolean z) {
        ViewGroup G = G(dp4Var);
        if (G != null && (G instanceof hp4)) {
            ((hp4) G).setDrawDisappearingViewsLast(!z);
        }
    }

    public final void b(fp4 fp4Var, jke jkeVar, dp4 dp4Var) {
        kq4 kq4Var;
        String str;
        fp4 fp4Var2;
        if (this.w == null) {
            this.w = fp4Var;
            this.x = jkeVar;
            this.y = dp4Var;
            CopyOnWriteArrayList copyOnWriteArrayList = this.p;
            if (dp4Var != 0) {
                copyOnWriteArrayList.add(new cq4(dp4Var));
            } else if (fp4Var != null) {
                copyOnWriteArrayList.add(fp4Var);
            }
            if (this.y != null) {
                h0();
            }
            if (fp4Var != null) {
                yq7 p = fp4Var.e.p();
                this.g = p;
                if (dp4Var != 0) {
                    fp4Var2 = dp4Var;
                } else {
                    fp4Var2 = fp4Var;
                }
                p.getClass();
                zp4 zp4Var = this.j;
                zp4Var.getClass();
                g36 m = fp4Var2.m();
                if (m.b != v26.a) {
                    zp4Var.b.add(new wq7(p, m, zp4Var));
                    p.c();
                    zp4Var.c = new b13(0, p, yq7.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, (byte) 3);
                }
            }
            if (dp4Var != 0) {
                kq4 kq4Var2 = dp4Var.K.O;
                HashMap hashMap = kq4Var2.c;
                kq4Var = (kq4) hashMap.get(dp4Var.e);
                if (kq4Var == null) {
                    kq4Var = new kq4(kq4Var2.e);
                    hashMap.put(dp4Var.e, kq4Var);
                }
                this.O = kq4Var;
            } else if (fp4Var != null) {
                kq4Var = (kq4) new et8(fp4Var.e.f(), kq4.h).l(kq4.class);
                this.O = kq4Var;
            } else {
                kq4Var = new kq4(false);
                this.O = kq4Var;
            }
            kq4Var.g = P();
            this.c.d = this.O;
            fp4 fp4Var3 = this.w;
            if (fp4Var3 != null && dp4Var == 0) {
                op g = fp4Var3.g();
                g.f("android:support:fragments", new zq2(this, (byte) 2));
                Bundle c = g.c("android:support:fragments");
                if (c != null) {
                    X(c);
                }
            }
            fp4 fp4Var4 = this.w;
            if (fp4Var4 != null) {
                br2 br2Var = fp4Var4.e.x;
                if (dp4Var != 0) {
                    str = b10.j(new StringBuilder(), dp4Var.e, ":");
                } else {
                    str = "";
                }
                String concat = "FragmentManager:".concat(str);
                this.C = br2Var.c(concat.concat("StartActivityForResult"), new s9((byte) 1), new ai4(this, (byte) 2));
                this.D = br2Var.c(concat.concat("StartIntentSenderForResult"), new s9((byte) 3), new fk3(this));
                this.E = br2Var.c(concat.concat("RequestPermissions"), new s9((byte) 0), new lj4(this));
            }
            fp4 fp4Var5 = this.w;
            if (fp4Var5 != null) {
                fp4Var5.e.o(this.q);
            }
            fp4 fp4Var6 = this.w;
            if (fp4Var6 != null) {
                fp4Var6.e.E.add(this.r);
            }
            fp4 fp4Var7 = this.w;
            if (fp4Var7 != null) {
                fp4Var7.e.G.add(this.s);
            }
            fp4 fp4Var8 = this.w;
            if (fp4Var8 != null) {
                fp4Var8.e.H.add(this.t);
            }
            fp4 fp4Var9 = this.w;
            if (fp4Var9 != null && dp4Var == 0) {
                in3 in3Var = fp4Var9.e.c;
                ((CopyOnWriteArrayList) in3Var.c).add(this.u);
                ((Runnable) in3Var.b).run();
                return;
            }
            return;
        }
        dq9.m("Already attached");
    }

    public final void b0(dp4 dp4Var, v26 v26Var) {
        if (dp4Var == this.c.n(dp4Var.e) && (dp4Var.L == null || dp4Var.K == this)) {
            dp4Var.d0 = v26Var;
        } else {
            a32.f("Fragment ", dp4Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void c(dp4 dp4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + dp4Var);
        }
        if (dp4Var.S) {
            dp4Var.S = false;
            if (!dp4Var.w) {
                this.c.c(dp4Var);
                if (K(2)) {
                    Log.v("FragmentManager", "add from attach: " + dp4Var);
                }
                if (L(dp4Var)) {
                    this.G = true;
                }
            }
        }
    }

    public final void c0(dp4 dp4Var) {
        if (dp4Var != null) {
            if (dp4Var != this.c.n(dp4Var.e) || (dp4Var.L != null && dp4Var.K != this)) {
                a32.f("Fragment ", dp4Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        dp4 dp4Var2 = this.z;
        this.z = dp4Var;
        r(dp4Var2);
        r(this.z);
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(dp4 dp4Var) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup G = G(dp4Var);
        if (G != null) {
            cp4 cp4Var = dp4Var.Z;
            boolean z = false;
            if (cp4Var == null) {
                i = 0;
            } else {
                i = cp4Var.b;
            }
            if (cp4Var == null) {
                i2 = 0;
            } else {
                i2 = cp4Var.c;
            }
            int i5 = i2 + i;
            if (cp4Var == null) {
                i3 = 0;
            } else {
                i3 = cp4Var.d;
            }
            int i6 = i3 + i5;
            if (cp4Var == null) {
                i4 = 0;
            } else {
                i4 = cp4Var.e;
            }
            if (i4 + i6 > 0) {
                if (G.getTag(2131296735) == null) {
                    G.setTag(2131296735, dp4Var);
                }
                dp4 dp4Var2 = (dp4) G.getTag(2131296735);
                cp4 cp4Var2 = dp4Var.Z;
                if (cp4Var2 != null) {
                    z = cp4Var2.a;
                }
                if (dp4Var2.Z != null) {
                    dp4Var2.j().a = z;
                }
            }
        }
    }

    public final HashSet e() {
        md3 md3Var;
        HashSet hashSet = new HashSet();
        ArrayList s = this.c.s();
        int size = s.size();
        int i = 0;
        while (i < size) {
            Object obj = s.get(i);
            i++;
            ViewGroup viewGroup = ((uq4) obj).c.W;
            if (viewGroup != null) {
                I().getClass();
                Object tag = viewGroup.getTag(2131296663);
                if (tag instanceof md3) {
                    md3Var = (md3) tag;
                } else {
                    md3Var = new md3(viewGroup);
                    viewGroup.setTag(2131296663, md3Var);
                }
                hashSet.add(md3Var);
            }
        }
        return hashSet;
    }

    public final HashSet f(int i, int i2, ArrayList arrayList) {
        ViewGroup viewGroup;
        md3 md3Var;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((ie0) arrayList.get(i)).a;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                dp4 dp4Var = ((xq4) obj).b;
                if (dp4Var != null && (viewGroup = dp4Var.W) != null) {
                    I().getClass();
                    Object tag = viewGroup.getTag(2131296663);
                    if (tag instanceof md3) {
                        md3Var = (md3) tag;
                    } else {
                        md3Var = new md3(viewGroup);
                        viewGroup.setTag(2131296663, md3Var);
                    }
                    hashSet.add(md3Var);
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0() {
        ArrayList s = this.c.s();
        int size = s.size();
        int i = 0;
        while (i < size) {
            Object obj = s.get(i);
            i++;
            uq4 uq4Var = (uq4) obj;
            dp4 dp4Var = uq4Var.c;
            if (dp4Var.X) {
                if (this.b) {
                    this.K = true;
                } else {
                    dp4Var.X = false;
                    uq4Var.j();
                }
            }
        }
    }

    public final uq4 g(dp4 dp4Var) {
        String str = dp4Var.e;
        e7a e7aVar = this.c;
        uq4 uq4Var = (uq4) ((HashMap) e7aVar.b).get(str);
        if (uq4Var != null) {
            return uq4Var;
        }
        uq4 uq4Var2 = new uq4(this.o, e7aVar, dp4Var);
        uq4Var2.l(this.w.b.getClassLoader());
        uq4Var2.e = this.v;
        return uq4Var2;
    }

    public final void g0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new ae6());
        fp4 fp4Var = this.w;
        if (fp4Var != null) {
            try {
                fp4Var.e.dump("  ", null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                w("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw illegalStateException;
    }

    public final void h(dp4 dp4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + dp4Var);
        }
        if (!dp4Var.S) {
            dp4Var.S = true;
            if (dp4Var.w) {
                if (K(2)) {
                    Log.v("FragmentManager", "remove from detach: " + dp4Var);
                }
                e7a e7aVar = this.c;
                synchronized (((ArrayList) e7aVar.a)) {
                    ((ArrayList) e7aVar.a).remove(dp4Var);
                }
                dp4Var.w = false;
                if (L(dp4Var)) {
                    this.G = true;
                }
                d0(dp4Var);
            }
        }
    }

    public final void h0() {
        int i;
        synchronized (this.a) {
            boolean z = true;
            if (!this.a.isEmpty()) {
                zp4 zp4Var = this.j;
                zp4Var.a = true;
                pr4 pr4Var = zp4Var.c;
                if (pr4Var != null) {
                    pr4Var.invoke();
                }
                if (K(3)) {
                    Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                }
                return;
            }
            int size = this.d.size();
            if (this.h != null) {
                i = 1;
            } else {
                i = 0;
            }
            if (size + i <= 0 || !O(this.y)) {
                z = false;
            }
            if (K(3)) {
                Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
            }
            zp4 zp4Var2 = this.j;
            zp4Var2.a = z;
            pr4 pr4Var2 = zp4Var2.c;
            if (pr4Var2 != null) {
                pr4Var2.invoke();
            }
        }
    }

    public final void i(boolean z, Configuration configuration) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (dp4 dp4Var : this.c.u()) {
            if (dp4Var != null) {
                dp4Var.onConfigurationChanged(configuration);
                if (z) {
                    dp4Var.M.i(true, configuration);
                }
            }
        }
    }

    public final boolean j() {
        boolean z;
        if (this.v >= 1) {
            for (dp4 dp4Var : this.c.u()) {
                if (dp4Var != null) {
                    if (!dp4Var.R) {
                        z = dp4Var.M.j();
                    } else {
                        z = false;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        boolean z;
        if (this.v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (dp4 dp4Var : this.c.u()) {
            if (dp4Var != null && N(dp4Var)) {
                if (!dp4Var.R) {
                    z = dp4Var.M.k();
                } else {
                    z = false;
                }
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(dp4Var);
                    z2 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                dp4 dp4Var2 = (dp4) this.e.get(i);
                if (arrayList == null || !arrayList.contains(dp4Var2)) {
                    dp4Var2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    public final void l() {
        boolean z = true;
        this.J = true;
        A(true);
        x();
        fp4 fp4Var = this.w;
        e7a e7aVar = this.c;
        if (fp4Var != null) {
            z = ((kq4) e7aVar.d).f;
        } else {
            Context context = fp4Var.b;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z) {
            for (ke0 ke0Var : this.l.values()) {
                ArrayList arrayList = ke0Var.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((kq4) e7aVar.d).d((String) obj, false);
                }
            }
        }
        u(-1);
        fp4 fp4Var2 = this.w;
        if (fp4Var2 != null) {
            fp4Var2.e.E.remove(this.r);
        }
        fp4 fp4Var3 = this.w;
        if (fp4Var3 != null) {
            fp4Var3.e.y.remove(this.q);
        }
        fp4 fp4Var4 = this.w;
        if (fp4Var4 != null) {
            fp4Var4.e.G.remove(this.s);
        }
        fp4 fp4Var5 = this.w;
        if (fp4Var5 != null) {
            fp4Var5.e.H.remove(this.t);
        }
        fp4 fp4Var6 = this.w;
        if (fp4Var6 != null && this.y == null) {
            in3 in3Var = fp4Var6.e.c;
            aq4 aq4Var = this.u;
            ((CopyOnWriteArrayList) in3Var.c).remove(aq4Var);
            if (((HashMap) in3Var.d).remove(aq4Var) == null) {
                ((Runnable) in3Var.b).run();
            } else {
                rjb.p();
            }
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            Iterator it = this.j.b.iterator();
            while (it.hasNext()) {
                ((sb1) it.next()).cancel();
            }
            this.g = null;
        }
        u9 u9Var = this.C;
        if (u9Var != null) {
            u9Var.d.e(u9Var.b);
            u9 u9Var2 = this.D;
            u9Var2.d.e(u9Var2.b);
            u9 u9Var3 = this.E;
            u9Var3.d.e(u9Var3.b);
        }
    }

    public final void m(boolean z) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (dp4 dp4Var : this.c.u()) {
            if (dp4Var != null) {
                dp4Var.V = true;
                if (z) {
                    dp4Var.M.m(true);
                }
            }
        }
    }

    public final void n(boolean z) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (dp4 dp4Var : this.c.u()) {
            if (dp4Var != null && z) {
                dp4Var.M.n(true);
            }
        }
    }

    public final void o() {
        ArrayList t = this.c.t();
        int size = t.size();
        int i = 0;
        while (i < size) {
            Object obj = t.get(i);
            i++;
            dp4 dp4Var = (dp4) obj;
            if (dp4Var != null) {
                dp4Var.u();
                dp4Var.M.o();
            }
        }
    }

    public final boolean p() {
        boolean z;
        if (this.v >= 1) {
            for (dp4 dp4Var : this.c.u()) {
                if (dp4Var != null) {
                    if (!dp4Var.R) {
                        z = dp4Var.M.p();
                    } else {
                        z = false;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.v >= 1) {
            for (dp4 dp4Var : this.c.u()) {
                if (dp4Var != null && !dp4Var.R) {
                    dp4Var.M.q();
                }
            }
        }
    }

    public final void r(dp4 dp4Var) {
        if (dp4Var != null) {
            if (dp4Var == this.c.n(dp4Var.e)) {
                dp4Var.K.getClass();
                boolean O = O(dp4Var);
                Boolean bool = dp4Var.s;
                if (bool == null || bool.booleanValue() != O) {
                    dp4Var.s = Boolean.valueOf(O);
                    iq4 iq4Var = dp4Var.M;
                    iq4Var.h0();
                    iq4Var.r(iq4Var.z);
                }
            }
        }
    }

    public final void s(boolean z) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (dp4 dp4Var : this.c.u()) {
            if (dp4Var != null && z) {
                dp4Var.M.s(true);
            }
        }
    }

    public final boolean t() {
        boolean z;
        if (this.v < 1) {
            return false;
        }
        boolean z2 = false;
        for (dp4 dp4Var : this.c.u()) {
            if (dp4Var != null && N(dp4Var)) {
                if (!dp4Var.R) {
                    z = dp4Var.M.t();
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        dp4 dp4Var = this.y;
        if (dp4Var != null) {
            sb.append(dp4Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            fp4 fp4Var = this.w;
            if (fp4Var != null) {
                sb.append(fp4Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (uq4 uq4Var : ((HashMap) this.c.b).values()) {
                if (uq4Var != null) {
                    uq4Var.e = i;
                }
            }
            Q(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((md3) it.next()).c();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.K) {
            this.K = false;
            f0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String p = td4.p(str, "    ");
        e7a e7aVar = this.c;
        ArrayList arrayList = (ArrayList) e7aVar.a;
        String p2 = td4.p(str, "    ");
        HashMap hashMap = (HashMap) e7aVar.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (uq4 uq4Var : hashMap.values()) {
                printWriter.print(str);
                if (uq4Var != null) {
                    dp4 dp4Var = uq4Var.c;
                    printWriter.println(dp4Var);
                    dp4Var.i(p2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((dp4) arrayList.get(i)).toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((dp4) this.e.get(i2)).toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                ie0 ie0Var = (ie0) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(ie0Var.toString());
                ie0Var.g(p, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println((eq4) this.a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((md3) it.next()).c();
        }
    }

    public final void y(eq4 eq4Var, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (this.J) {
                    dq9.m("FragmentManager has been destroyed");
                    return;
                } else {
                    dq9.m("FragmentManager has not been attached to a host.");
                    return;
                }
            } else if (P()) {
                dq9.m("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            if (this.w == null) {
                if (z) {
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            }
            this.a.add(eq4Var);
            Z();
        }
    }

    public final void z(boolean z) {
        if (!this.b) {
            if (this.w == null) {
                if (this.J) {
                    dq9.m("FragmentManager has been destroyed");
                    return;
                } else {
                    dq9.m("FragmentManager has not been attached to a host.");
                    return;
                }
            } else if (Looper.myLooper() == this.w.c.getLooper()) {
                if (!z && P()) {
                    dq9.m("Can not perform this action after onSaveInstanceState");
                    return;
                } else if (this.L == null) {
                    this.L = new ArrayList();
                    this.M = new ArrayList();
                    return;
                } else {
                    return;
                }
            } else {
                dq9.m("Must be called from main thread of fragment host");
                return;
            }
        }
        dq9.m("FragmentManager is already executing transactions");
    }
}
