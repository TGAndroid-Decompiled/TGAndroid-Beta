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
public abstract class go4 {
    public final ao4 A;
    public final ie7 B;
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
    public jo4 O;
    public final ez3 P;
    public boolean b;
    public ArrayList e;
    public vo7 g;
    public final ArrayList n;
    public final wk4 o;
    public final CopyOnWriteArrayList p;
    public final xn4 q;
    public final xn4 r;
    public final xn4 s;
    public final xn4 t;
    public final zn4 u;
    public int v;
    public dn4 w;
    public iie x;
    public bn4 y;
    public bn4 z;
    public final ArrayList a = new ArrayList();
    public final wtc c = new wtc((byte) 5);
    public ArrayList d = new ArrayList();
    public final vn4 f = new vn4(this);
    public id0 h = null;
    public boolean i = false;
    public final yn4 j = new yn4(this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = DesugarCollections.synchronizedMap(new HashMap());
    public final Map m = DesugarCollections.synchronizedMap(new HashMap());

    public go4() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.n = new ArrayList();
        this.o = new wk4(this);
        this.p = new CopyOnWriteArrayList();
        this.q = new vs2(this) {
            public final go4 b;

            {
                this.b = this;
            }

            @Override
            public final void accept(Object obj) {
                byte b = r2;
                go4 go4Var = this.b;
                switch (b) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (go4Var.M()) {
                            go4Var.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (go4Var.M() && num.intValue() == 80) {
                            go4Var.m(false);
                            return;
                        }
                        return;
                    case 2:
                        sg7 sg7Var = (sg7) obj;
                        if (go4Var.M()) {
                            boolean z = sg7Var.a;
                            go4Var.n(false);
                            return;
                        }
                        return;
                    default:
                        ca8 ca8Var = (ca8) obj;
                        if (go4Var.M()) {
                            boolean z2 = ca8Var.a;
                            go4Var.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.r = new vs2(this) {
            public final go4 b;

            {
                this.b = this;
            }

            @Override
            public final void accept(Object obj) {
                byte b = r2;
                go4 go4Var = this.b;
                switch (b) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (go4Var.M()) {
                            go4Var.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (go4Var.M() && num.intValue() == 80) {
                            go4Var.m(false);
                            return;
                        }
                        return;
                    case 2:
                        sg7 sg7Var = (sg7) obj;
                        if (go4Var.M()) {
                            boolean z = sg7Var.a;
                            go4Var.n(false);
                            return;
                        }
                        return;
                    default:
                        ca8 ca8Var = (ca8) obj;
                        if (go4Var.M()) {
                            boolean z2 = ca8Var.a;
                            go4Var.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.s = new vs2(this) {
            public final go4 b;

            {
                this.b = this;
            }

            @Override
            public final void accept(Object obj) {
                byte b = r2;
                go4 go4Var = this.b;
                switch (b) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (go4Var.M()) {
                            go4Var.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (go4Var.M() && num.intValue() == 80) {
                            go4Var.m(false);
                            return;
                        }
                        return;
                    case 2:
                        sg7 sg7Var = (sg7) obj;
                        if (go4Var.M()) {
                            boolean z = sg7Var.a;
                            go4Var.n(false);
                            return;
                        }
                        return;
                    default:
                        ca8 ca8Var = (ca8) obj;
                        if (go4Var.M()) {
                            boolean z2 = ca8Var.a;
                            go4Var.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.t = new vs2(this) {
            public final go4 b;

            {
                this.b = this;
            }

            @Override
            public final void accept(Object obj) {
                byte b = r2;
                go4 go4Var = this.b;
                switch (b) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (go4Var.M()) {
                            go4Var.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (go4Var.M() && num.intValue() == 80) {
                            go4Var.m(false);
                            return;
                        }
                        return;
                    case 2:
                        sg7 sg7Var = (sg7) obj;
                        if (go4Var.M()) {
                            boolean z = sg7Var.a;
                            go4Var.n(false);
                            return;
                        }
                        return;
                    default:
                        ca8 ca8Var = (ca8) obj;
                        if (go4Var.M()) {
                            boolean z2 = ca8Var.a;
                            go4Var.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.u = new zn4(this);
        this.v = -1;
        this.A = new ao4(this);
        this.B = new ie7((byte) 20);
        this.F = new ArrayDeque();
        this.P = new ez3(this, (byte) 8);
    }

    public static HashSet F(id0 id0Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < id0Var.a.size(); i++) {
            bn4 bn4Var = ((wo4) id0Var.a.get(i)).b;
            if (bn4Var != null && id0Var.g) {
                hashSet.add(bn4Var);
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

    public static boolean L(bn4 bn4Var) {
        ArrayList r = bn4Var.M.c.r();
        int size = r.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = r.get(i);
            i++;
            bn4 bn4Var2 = (bn4) obj;
            if (bn4Var2 != null) {
                z = L(bn4Var2);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(bn4 bn4Var) {
        if (bn4Var != null) {
            if (bn4Var.U) {
                if (bn4Var.K == null || N(bn4Var.N)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean O(bn4 bn4Var) {
        if (bn4Var != null) {
            go4 go4Var = bn4Var.K;
            if (bn4Var == go4Var.z && O(go4Var.y)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void e0(bn4 bn4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + bn4Var);
        }
        if (bn4Var.R) {
            bn4Var.R = false;
            bn4Var.a0 = !bn4Var.a0;
        }
    }

    public final boolean A(boolean z) {
        boolean z2;
        id0 id0Var;
        z(z);
        if (!this.i && (id0Var = this.h) != null) {
            id0Var.r = false;
            id0Var.d();
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
                bn4 bn4Var = ((wo4) obj).b;
                if (bn4Var != null) {
                    bn4Var.y = false;
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
                        z2 |= ((do4) this.a.get(i2)).a(arrayList2, arrayList3);
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
        wtc wtcVar = this.c;
        ArrayList arrayList3 = this.n;
        boolean z4 = ((id0) arrayList.get(i)).o;
        ArrayList arrayList4 = this.N;
        if (arrayList4 == null) {
            this.N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.N.addAll(wtcVar.s());
        bn4 bn4Var = this.z;
        int i6 = i;
        boolean z5 = false;
        while (i6 < i2) {
            id0 id0Var = (id0) arrayList.get(i6);
            boolean booleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
            ArrayList arrayList5 = this.N;
            if (!booleanValue) {
                ArrayList arrayList6 = id0Var.a;
                int i7 = 0;
                while (i7 < arrayList6.size()) {
                    wo4 wo4Var = (wo4) arrayList6.get(i7);
                    boolean z6 = z4;
                    int i8 = wo4Var.a;
                    int i9 = i6;
                    int i10 = 1;
                    if (i8 != 1) {
                        z3 = z5;
                        if (i8 != 2) {
                            if (i8 != 3 && i8 != 6) {
                                if (i8 != 7) {
                                    if (i8 == 8) {
                                        arrayList6.add(i7, new wo4(9, bn4Var, 0));
                                        wo4Var.c = true;
                                        i7++;
                                        bn4Var = wo4Var.b;
                                    }
                                } else {
                                    i10 = 1;
                                }
                            } else {
                                arrayList5.remove(wo4Var.b);
                                bn4 bn4Var2 = wo4Var.b;
                                if (bn4Var2 == bn4Var) {
                                    arrayList6.add(i7, new wo4(9, bn4Var2));
                                    i7++;
                                    bn4Var = null;
                                }
                            }
                            i10 = 1;
                        } else {
                            bn4 bn4Var3 = wo4Var.b;
                            int i11 = bn4Var3.P;
                            int size = arrayList5.size() - 1;
                            boolean z7 = false;
                            while (size >= 0) {
                                int i12 = size;
                                bn4 bn4Var4 = (bn4) arrayList5.get(size);
                                if (bn4Var4.P == i11) {
                                    if (bn4Var4 == bn4Var3) {
                                        i4 = i11;
                                        z7 = true;
                                    } else {
                                        if (bn4Var4 == bn4Var) {
                                            i4 = i11;
                                            arrayList6.add(i7, new wo4(9, bn4Var4, 0));
                                            i7++;
                                            i5 = 0;
                                            bn4Var = null;
                                        } else {
                                            i4 = i11;
                                            i5 = 0;
                                        }
                                        wo4 wo4Var2 = new wo4(3, bn4Var4, i5);
                                        wo4Var2.d = wo4Var.d;
                                        wo4Var2.f = wo4Var.f;
                                        wo4Var2.e = wo4Var.e;
                                        wo4Var2.g = wo4Var.g;
                                        arrayList6.add(i7, wo4Var2);
                                        arrayList5.remove(bn4Var4);
                                        i7++;
                                        bn4Var = bn4Var;
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
                                wo4Var.a = 1;
                                wo4Var.c = true;
                                arrayList5.add(bn4Var3);
                            }
                        }
                        i7 += i10;
                        z4 = z6;
                        i6 = i9;
                        z5 = z3;
                    } else {
                        z3 = z5;
                    }
                    arrayList5.add(wo4Var.b);
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
                ArrayList arrayList7 = id0Var.a;
                int size2 = arrayList7.size() - 1;
                while (size2 >= 0) {
                    wo4 wo4Var3 = (wo4) arrayList7.get(size2);
                    int i14 = wo4Var3.a;
                    if (i14 != i13) {
                        if (i14 != 3) {
                            switch (i14) {
                                case 8:
                                    bn4Var = null;
                                    break;
                                case 9:
                                    bn4Var = wo4Var3.b;
                                    break;
                                case 10:
                                    wo4Var3.i = wo4Var3.h;
                                    break;
                            }
                            size2--;
                            i13 = 1;
                        }
                        arrayList5.add(wo4Var3.b);
                        size2--;
                        i13 = 1;
                    }
                    arrayList5.remove(wo4Var3.b);
                    size2--;
                    i13 = 1;
                }
            }
            if (!z2 && !id0Var.g) {
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
                ArrayList arrayList8 = ((id0) arrayList.get(i15)).a;
                int size3 = arrayList8.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList8.get(i16);
                    i16++;
                    bn4 bn4Var5 = ((wo4) obj).b;
                    if (bn4Var5 != null && bn4Var5.K != null) {
                        wtcVar.u(g(bn4Var5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i17 = i;
        while (i17 < i2) {
            id0 id0Var2 = (id0) arrayList.get(i17);
            if (((Boolean) arrayList2.get(i17)).booleanValue()) {
                id0Var2.c(-1);
                go4 go4Var = id0Var2.q;
                ArrayList arrayList9 = id0Var2.a;
                boolean z10 = true;
                for (int size4 = arrayList9.size() - 1; size4 >= 0; size4--) {
                    wo4 wo4Var4 = (wo4) arrayList9.get(size4);
                    bn4 bn4Var6 = wo4Var4.b;
                    if (bn4Var6 != null) {
                        if (bn4Var6.Z != null) {
                            bn4Var6.j().a = z10;
                        }
                        int i18 = id0Var2.f;
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
                        if (bn4Var6.Z != null || c != 0) {
                            bn4Var6.j();
                            bn4Var6.Z.getClass();
                        }
                        bn4Var6.j();
                        bn4Var6.Z.getClass();
                    }
                    switch (wo4Var4.a) {
                        case 1:
                            bn4Var6.M(wo4Var4.d, wo4Var4.e, wo4Var4.f, wo4Var4.g);
                            z10 = true;
                            go4Var.a0(bn4Var6, true);
                            go4Var.V(bn4Var6);
                            break;
                        case 2:
                        default:
                            wn4.g(wo4Var4.a, str2);
                            return;
                        case 3:
                            bn4Var6.M(wo4Var4.d, wo4Var4.e, wo4Var4.f, wo4Var4.g);
                            go4Var.a(bn4Var6);
                            z10 = true;
                            break;
                        case 4:
                            bn4Var6.M(wo4Var4.d, wo4Var4.e, wo4Var4.f, wo4Var4.g);
                            go4Var.getClass();
                            e0(bn4Var6);
                            z10 = true;
                            break;
                        case 5:
                            bn4Var6.M(wo4Var4.d, wo4Var4.e, wo4Var4.f, wo4Var4.g);
                            go4Var.a0(bn4Var6, true);
                            go4Var.J(bn4Var6);
                            z10 = true;
                            break;
                        case 6:
                            bn4Var6.M(wo4Var4.d, wo4Var4.e, wo4Var4.f, wo4Var4.g);
                            go4Var.c(bn4Var6);
                            z10 = true;
                            break;
                        case 7:
                            bn4Var6.M(wo4Var4.d, wo4Var4.e, wo4Var4.f, wo4Var4.g);
                            go4Var.a0(bn4Var6, true);
                            go4Var.h(bn4Var6);
                            z10 = true;
                            break;
                        case 8:
                            go4Var.c0(null);
                            z10 = true;
                            break;
                        case 9:
                            go4Var.c0(bn4Var6);
                            z10 = true;
                            break;
                        case 10:
                            wo4Var4.i = bn4Var6.d0;
                            go4Var.b0(bn4Var6, wo4Var4.h);
                            z10 = true;
                            break;
                    }
                }
                continue;
            } else {
                id0Var2.c(1);
                go4 go4Var2 = id0Var2.q;
                ArrayList arrayList10 = id0Var2.a;
                int size5 = arrayList10.size();
                int i19 = 0;
                while (i19 < size5) {
                    wo4 wo4Var5 = (wo4) arrayList10.get(i19);
                    bn4 bn4Var7 = wo4Var5.b;
                    if (bn4Var7 != null) {
                        if (bn4Var7.Z != null) {
                            bn4Var7.j().a = false;
                        }
                        int i20 = id0Var2.f;
                        if (bn4Var7.Z != null || i20 != 0) {
                            bn4Var7.j();
                            bn4Var7.Z.getClass();
                        }
                        bn4Var7.j();
                        bn4Var7.Z.getClass();
                    }
                    switch (wo4Var5.a) {
                        case 1:
                            str = str2;
                            bn4Var7.M(wo4Var5.d, wo4Var5.e, wo4Var5.f, wo4Var5.g);
                            go4Var2.a0(bn4Var7, false);
                            go4Var2.a(bn4Var7);
                            break;
                        case 2:
                        default:
                            wn4.g(wo4Var5.a, str2);
                            return;
                        case 3:
                            str = str2;
                            bn4Var7.M(wo4Var5.d, wo4Var5.e, wo4Var5.f, wo4Var5.g);
                            go4Var2.V(bn4Var7);
                            break;
                        case 4:
                            str = str2;
                            bn4Var7.M(wo4Var5.d, wo4Var5.e, wo4Var5.f, wo4Var5.g);
                            go4Var2.J(bn4Var7);
                            break;
                        case 5:
                            str = str2;
                            bn4Var7.M(wo4Var5.d, wo4Var5.e, wo4Var5.f, wo4Var5.g);
                            go4Var2.a0(bn4Var7, false);
                            e0(bn4Var7);
                            break;
                        case 6:
                            str = str2;
                            bn4Var7.M(wo4Var5.d, wo4Var5.e, wo4Var5.f, wo4Var5.g);
                            go4Var2.h(bn4Var7);
                            break;
                        case 7:
                            str = str2;
                            bn4Var7.M(wo4Var5.d, wo4Var5.e, wo4Var5.f, wo4Var5.g);
                            go4Var2.a0(bn4Var7, false);
                            go4Var2.c(bn4Var7);
                            break;
                        case 8:
                            go4Var2.c0(bn4Var7);
                            str = str2;
                            break;
                        case 9:
                            go4Var2.c0(null);
                            str = str2;
                            break;
                        case 10:
                            wo4Var5.h = bn4Var7.d0;
                            go4Var2.b0(bn4Var7, wo4Var5.i);
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
                linkedHashSet.addAll(F((id0) obj2));
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
                            bn4 bn4Var8 = (bn4) it.next();
                            throw null;
                        }
                    } else {
                        fyb.g();
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
                            bn4 bn4Var9 = (bn4) it2.next();
                            throw null;
                        }
                    } else {
                        fyb.g();
                        return;
                    }
                }
            }
        }
        for (int i24 = i; i24 < i2; i24++) {
            id0 id0Var3 = (id0) arrayList.get(i24);
            if (booleanValue2) {
                for (int size9 = id0Var3.a.size() - 1; size9 >= 0; size9--) {
                    bn4 bn4Var10 = ((wo4) id0Var3.a.get(size9)).b;
                    if (bn4Var10 != null) {
                        g(bn4Var10).j();
                    }
                }
            } else {
                ArrayList arrayList11 = id0Var3.a;
                int size10 = arrayList11.size();
                int i25 = 0;
                while (i25 < size10) {
                    Object obj5 = arrayList11.get(i25);
                    i25++;
                    bn4 bn4Var11 = ((wo4) obj5).b;
                    if (bn4Var11 != null) {
                        g(bn4Var11).j();
                    }
                }
            }
        }
        Q(this.v, true);
        int i26 = i;
        Iterator it3 = f(i26, i2, arrayList).iterator();
        while (it3.hasNext()) {
            ac3 ac3Var = (ac3) it3.next();
            ac3Var.e = booleanValue2;
            synchronized (ac3Var.b) {
                ac3Var.e();
                ArrayList arrayList12 = ac3Var.b;
                ListIterator listIterator = arrayList12.listIterator(arrayList12.size());
                if (listIterator.hasPrevious()) {
                    vka vkaVar = (vka) listIterator.previous();
                    throw null;
                }
            }
            ac3Var.b();
        }
        while (i26 < i2) {
            id0 id0Var4 = (id0) arrayList.get(i26);
            if (((Boolean) arrayList2.get(i26)).booleanValue() && id0Var4.s >= 0) {
                id0Var4.s = -1;
            }
            if (id0Var4.p != null) {
                for (int i27 = 0; i27 < id0Var4.p.size(); i27++) {
                    ((Runnable) id0Var4.p.get(i27)).run();
                }
                id0Var4.p = null;
            }
            i26++;
        }
        if (z9 && arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            fyb.g();
        }
    }

    public final bn4 C(int i) {
        wtc wtcVar = this.c;
        ArrayList arrayList = (ArrayList) wtcVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            bn4 bn4Var = (bn4) arrayList.get(size);
            if (bn4Var != null && bn4Var.O == i) {
                return bn4Var;
            }
        }
        for (to4 to4Var : ((HashMap) wtcVar.b).values()) {
            if (to4Var != null) {
                bn4 bn4Var2 = to4Var.c;
                if (bn4Var2.O == i) {
                    return bn4Var2;
                }
            }
        }
        return null;
    }

    public final bn4 D(String str) {
        wtc wtcVar = this.c;
        ArrayList arrayList = (ArrayList) wtcVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            bn4 bn4Var = (bn4) arrayList.get(size);
            if (bn4Var != null && str.equals(bn4Var.Q)) {
                return bn4Var;
            }
        }
        for (to4 to4Var : ((HashMap) wtcVar.b).values()) {
            if (to4Var != null) {
                bn4 bn4Var2 = to4Var.c;
                if (str.equals(bn4Var2.Q)) {
                    return bn4Var2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((ac3) it.next()).getClass();
        }
    }

    public final ViewGroup G(bn4 bn4Var) {
        ViewGroup viewGroup = bn4Var.W;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (bn4Var.P > 0 && this.x.c()) {
            View b = this.x.b(bn4Var.P);
            if (b instanceof ViewGroup) {
                return (ViewGroup) b;
            }
            return null;
        }
        return null;
    }

    public final ao4 H() {
        bn4 bn4Var = this.y;
        if (bn4Var != null) {
            return bn4Var.K.H();
        }
        return this.A;
    }

    public final ie7 I() {
        bn4 bn4Var = this.y;
        if (bn4Var != null) {
            return bn4Var.K.I();
        }
        return this.B;
    }

    public final void J(bn4 bn4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + bn4Var);
        }
        if (!bn4Var.R) {
            bn4Var.R = true;
            bn4Var.a0 = !bn4Var.a0;
            d0(bn4Var);
        }
    }

    public final boolean M() {
        bn4 bn4Var = this.y;
        if (bn4Var == null) {
            return true;
        }
        if (bn4Var.t() && this.y.p().M()) {
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
        dn4 dn4Var;
        if (this.w == null && i != -1) {
            sc8.j("No activity");
        } else if (z || i != this.v) {
            this.v = i;
            wtc wtcVar = this.c;
            HashMap hashMap = (HashMap) wtcVar.b;
            ArrayList arrayList = (ArrayList) wtcVar.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                to4 to4Var = (to4) hashMap.get(((bn4) obj).e);
                if (to4Var != null) {
                    to4Var.j();
                }
            }
            for (to4 to4Var2 : hashMap.values()) {
                if (to4Var2 != null) {
                    to4Var2.j();
                    bn4 bn4Var = to4Var2.c;
                    if (bn4Var.x && !bn4Var.v()) {
                        wtcVar.v(to4Var2);
                    }
                }
            }
            f0();
            if (this.G && (dn4Var = this.w) != null && this.v == 7) {
                dn4Var.e.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void R() {
        if (this.w != null) {
            this.H = false;
            this.I = false;
            this.O.g = false;
            for (bn4 bn4Var : this.c.s()) {
                if (bn4Var != null) {
                    bn4Var.M.R();
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
        bn4 bn4Var = this.z;
        if (bn4Var != null && i < 0 && bn4Var.l().S()) {
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
                        id0 id0Var = (id0) this.d.get(size);
                        if (i < 0 || i != id0Var.s) {
                            size--;
                        } else if (z) {
                            i3 = size;
                            while (i3 > 0) {
                                id0 id0Var2 = (id0) this.d.get(i3 - 1);
                                if (i < 0 || i != id0Var2.s) {
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
            arrayList.add((id0) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(bn4 bn4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + bn4Var + " nesting=" + bn4Var.J);
        }
        boolean v = bn4Var.v();
        if (bn4Var.S && v) {
            return;
        }
        wtc wtcVar = this.c;
        synchronized (((ArrayList) wtcVar.a)) {
            ((ArrayList) wtcVar.a).remove(bn4Var);
        }
        bn4Var.w = false;
        if (L(bn4Var)) {
            this.G = true;
        }
        bn4Var.x = true;
        d0(bn4Var);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((id0) arrayList.get(i)).o) {
                        if (i2 != i) {
                            B(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((id0) arrayList.get(i2)).o) {
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
            sc8.j("Internal error with the back stack records");
        }
    }

    public final void X(Bundle bundle) {
        wk4 wk4Var;
        int i;
        boolean z;
        int i2;
        Bundle bundle2;
        to4 to4Var;
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
        wtc wtcVar = this.c;
        HashMap hashMap2 = (HashMap) wtcVar.c;
        HashMap hashMap3 = (HashMap) wtcVar.b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        io4 io4Var = (io4) bundle.getParcelable("state");
        if (io4Var == null) {
            return;
        }
        hashMap3.clear();
        ArrayList arrayList = io4Var.a;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            wk4Var = this.o;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            Bundle B = wtcVar.B((String) obj, null);
            if (B != null) {
                bn4 bn4Var = (bn4) this.O.b.get(((so4) B.getParcelable("state")).b);
                if (bn4Var != null) {
                    if (K(2)) {
                        i2 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + bn4Var);
                    } else {
                        i2 = 2;
                    }
                    to4Var = new to4(wk4Var, wtcVar, bn4Var, B);
                    bundle2 = B;
                } else {
                    i2 = 2;
                    bundle2 = B;
                    to4Var = new to4(this.o, this.c, this.w.b.getClassLoader(), H(), B);
                }
                bn4 bn4Var2 = to4Var.c;
                bn4Var2.b = bundle2;
                bn4Var2.K = this;
                if (K(i2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + bn4Var2.e + "): " + bn4Var2);
                }
                to4Var.l(this.w.b.getClassLoader());
                wtcVar.u(to4Var);
                to4Var.e = this.v;
            }
        }
        jo4 jo4Var = this.O;
        jo4Var.getClass();
        ArrayList arrayList2 = new ArrayList(jo4Var.b.values());
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            bn4 bn4Var3 = (bn4) obj2;
            if (hashMap3.get(bn4Var3.e) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + bn4Var3 + " that was not found in the set of active Fragments " + io4Var.a);
                }
                this.O.f(bn4Var3);
                bn4Var3.K = this;
                to4 to4Var2 = new to4(wk4Var, wtcVar, bn4Var3);
                to4Var2.e = 1;
                to4Var2.j();
                bn4Var3.x = true;
                to4Var2.j();
            }
        }
        ArrayList arrayList3 = io4Var.b;
        ((ArrayList) wtcVar.a).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                String str3 = (String) obj3;
                bn4 m = wtcVar.m(str3);
                if (m != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + m);
                    }
                    wtcVar.c(m);
                } else {
                    sc8.j(tb4.y("No instantiated fragment for (", str3, ")"));
                    return;
                }
            }
        }
        if (io4Var.c != null) {
            this.d = new ArrayList(io4Var.c.length);
            int i6 = 0;
            while (true) {
                jd0[] jd0VarArr = io4Var.c;
                if (i6 >= jd0VarArr.length) {
                    break;
                }
                jd0 jd0Var = jd0VarArr[i6];
                ArrayList arrayList4 = jd0Var.b;
                id0 id0Var = new id0(this);
                int[] iArr = jd0Var.a;
                int i7 = 0;
                int i8 = 0;
                while (i7 < iArr.length) {
                    ?? obj4 = new Object();
                    int i9 = i7 + 1;
                    obj4.a = iArr[i7];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + id0Var + " op #" + i8 + " base fragment #" + iArr[i9]);
                    }
                    obj4.h = v06.values()[jd0Var.c[i8]];
                    obj4.i = v06.values()[jd0Var.d[i8]];
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
                    id0Var.b = i11;
                    id0Var.c = i12;
                    id0Var.d = i14;
                    id0Var.e = i15;
                    id0Var.b(obj4);
                    i8++;
                    iArr = iArr2;
                }
                id0Var.f = jd0Var.e;
                id0Var.h = jd0Var.f;
                id0Var.g = true;
                id0Var.i = jd0Var.n;
                id0Var.j = jd0Var.r;
                id0Var.k = jd0Var.s;
                id0Var.l = jd0Var.w;
                id0Var.m = jd0Var.x;
                id0Var.n = jd0Var.y;
                id0Var.o = jd0Var.E;
                id0Var.s = jd0Var.h;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    String str4 = (String) arrayList4.get(i16);
                    if (str4 != null) {
                        ((wo4) id0Var.a.get(i16)).b = wtcVar.m(str4);
                    }
                }
                id0Var.c(1);
                if (K(2)) {
                    StringBuilder m2 = de9.m(i6, "restoreAllState: back stack #", " (index ");
                    m2.append(id0Var.s);
                    m2.append("): ");
                    m2.append(id0Var);
                    Log.v("FragmentManager", m2.toString());
                    PrintWriter printWriter = new PrintWriter(new bc6());
                    id0Var.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(id0Var);
                i6++;
            }
            i = 0;
        } else {
            i = 0;
            this.d = new ArrayList();
        }
        this.k.set(io4Var.d);
        String str5 = io4Var.e;
        if (str5 != null) {
            bn4 m3 = wtcVar.m(str5);
            this.z = m3;
            r(m3);
        }
        ArrayList arrayList5 = io4Var.f;
        if (arrayList5 != null) {
            for (int i17 = i; i17 < arrayList5.size(); i17++) {
                this.l.put((String) arrayList5.get(i17), (kd0) io4Var.h.get(i17));
            }
        }
        this.F = new ArrayDeque(io4Var.n);
    }

    public final Bundle Y() {
        int i;
        ArrayList arrayList;
        jd0[] jd0VarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        x();
        A(true);
        this.H = true;
        this.O.g = true;
        wtc wtcVar = this.c;
        wtcVar.getClass();
        HashMap hashMap = (HashMap) wtcVar.b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            to4 to4Var = (to4) it.next();
            if (to4Var != null) {
                bn4 bn4Var = to4Var.c;
                String str = bn4Var.e;
                Bundle bundle3 = new Bundle();
                bn4 bn4Var2 = to4Var.c;
                if (bn4Var2.a == -1 && (bundle = bn4Var2.b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new so4(bn4Var2));
                if (bn4Var2.a > 0) {
                    Bundle bundle4 = new Bundle();
                    bn4Var2.G(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    to4Var.a.N(bn4Var2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    bn4Var2.h0.g(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle Y = bn4Var2.M.Y();
                    if (!Y.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", Y);
                    }
                    SparseArray<? extends Parcelable> sparseArray = bn4Var2.c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = bn4Var2.d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = bn4Var2.f;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                wtcVar.B(str, bundle3);
                arrayList2.add(bn4Var.e);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + bn4Var + ": " + bn4Var.b);
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
            wtc wtcVar2 = this.c;
            synchronized (((ArrayList) wtcVar2.a)) {
                if (((ArrayList) wtcVar2.a).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) wtcVar2.a).size());
                    ArrayList arrayList3 = (ArrayList) wtcVar2.a;
                    int size = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList3.get(i2);
                        i2++;
                        bn4 bn4Var3 = (bn4) obj;
                        arrayList.add(bn4Var3.e);
                        if (K(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + bn4Var3.e + "): " + bn4Var3);
                        }
                    }
                }
            }
            int size2 = this.d.size();
            if (size2 > 0) {
                jd0VarArr = new jd0[size2];
                for (i = 0; i < size2; i++) {
                    jd0VarArr[i] = new jd0((id0) this.d.get(i));
                    if (K(2)) {
                        StringBuilder m = de9.m(i, "saveAllState: adding back stack #", ": ");
                        m.append(this.d.get(i));
                        Log.v("FragmentManager", m.toString());
                    }
                }
            } else {
                jd0VarArr = null;
            }
            ?? obj2 = new Object();
            obj2.e = null;
            ArrayList arrayList4 = new ArrayList();
            obj2.f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            obj2.h = arrayList5;
            obj2.a = arrayList2;
            obj2.b = arrayList;
            obj2.c = jd0VarArr;
            obj2.d = this.k.get();
            bn4 bn4Var4 = this.z;
            if (bn4Var4 != null) {
                obj2.e = bn4Var4.e;
            }
            arrayList4.addAll(this.l.keySet());
            arrayList5.addAll(this.l.values());
            obj2.n = new ArrayList(this.F);
            bundle2.putParcelable("state", obj2);
            for (String str2 : this.m.keySet()) {
                bundle2.putBundle(b00.h("result_", str2), (Bundle) this.m.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(b00.h("fragment_", str3), (Bundle) hashMap2.get(str3));
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

    public final to4 a(bn4 bn4Var) {
        String str = bn4Var.c0;
        if (str != null) {
            vo4.c(bn4Var, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + bn4Var);
        }
        to4 g = g(bn4Var);
        bn4Var.K = this;
        wtc wtcVar = this.c;
        wtcVar.u(g);
        if (!bn4Var.S) {
            wtcVar.c(bn4Var);
            bn4Var.x = false;
            bn4Var.a0 = false;
            if (L(bn4Var)) {
                this.G = true;
            }
        }
        return g;
    }

    public final void a0(bn4 bn4Var, boolean z) {
        ViewGroup G = G(bn4Var);
        if (G != null && (G instanceof fn4)) {
            ((fn4) G).setDrawDisappearingViewsLast(!z);
        }
    }

    public final void b(dn4 dn4Var, iie iieVar, bn4 bn4Var) {
        jo4 jo4Var;
        String str;
        dn4 dn4Var2;
        if (this.w == null) {
            this.w = dn4Var;
            this.x = iieVar;
            this.y = bn4Var;
            CopyOnWriteArrayList copyOnWriteArrayList = this.p;
            if (bn4Var != 0) {
                copyOnWriteArrayList.add(new bo4(bn4Var));
            } else if (dn4Var != null) {
                copyOnWriteArrayList.add(dn4Var);
            }
            if (this.y != null) {
                h0();
            }
            if (dn4Var != null) {
                vo7 p = dn4Var.e.p();
                this.g = p;
                if (bn4Var != 0) {
                    dn4Var2 = bn4Var;
                } else {
                    dn4Var2 = dn4Var;
                }
                p.getClass();
                yn4 yn4Var = this.j;
                yn4Var.getClass();
                g16 m = dn4Var2.m();
                if (m.b != v06.a) {
                    yn4Var.b.add(new to7(p, m, yn4Var));
                    p.c();
                    yn4Var.c = new qz2(0, p, vo7.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, (byte) 3);
                }
            }
            if (bn4Var != 0) {
                jo4 jo4Var2 = bn4Var.K.O;
                HashMap hashMap = jo4Var2.c;
                jo4Var = (jo4) hashMap.get(bn4Var.e);
                if (jo4Var == null) {
                    jo4Var = new jo4(jo4Var2.e);
                    hashMap.put(bn4Var.e, jo4Var);
                }
                this.O = jo4Var;
            } else if (dn4Var != null) {
                jo4Var = (jo4) new g29(dn4Var.e.f(), jo4.h).k(jo4.class);
                this.O = jo4Var;
            } else {
                jo4Var = new jo4(false);
                this.O = jo4Var;
            }
            jo4Var.g = P();
            this.c.d = this.O;
            dn4 dn4Var3 = this.w;
            if (dn4Var3 != null && bn4Var == 0) {
                oo g = dn4Var3.g();
                g.f("android:support:fragments", new op2(this, (byte) 2));
                Bundle c = g.c("android:support:fragments");
                if (c != null) {
                    X(c);
                }
            }
            dn4 dn4Var4 = this.w;
            if (dn4Var4 != null) {
                qp2 qp2Var = dn4Var4.e.x;
                if (bn4Var != 0) {
                    str = b00.j(new StringBuilder(), bn4Var.e, ":");
                } else {
                    str = "";
                }
                String concat = "FragmentManager:".concat(str);
                this.C = qp2Var.c(concat.concat("StartActivityForResult"), new s9((byte) 1), new z24(this, (byte) 4));
                this.D = qp2Var.c(concat.concat("StartIntentSenderForResult"), new s9((byte) 3), new s34(this, (byte) 4));
                this.E = qp2Var.c(concat.concat("RequestPermissions"), new s9((byte) 0), new gi3(this));
            }
            dn4 dn4Var5 = this.w;
            if (dn4Var5 != null) {
                dn4Var5.e.o(this.q);
            }
            dn4 dn4Var6 = this.w;
            if (dn4Var6 != null) {
                dn4Var6.e.E.add(this.r);
            }
            dn4 dn4Var7 = this.w;
            if (dn4Var7 != null) {
                dn4Var7.e.G.add(this.s);
            }
            dn4 dn4Var8 = this.w;
            if (dn4Var8 != null) {
                dn4Var8.e.H.add(this.t);
            }
            dn4 dn4Var9 = this.w;
            if (dn4Var9 != null && bn4Var == 0) {
                xl3 xl3Var = dn4Var9.e.c;
                ((CopyOnWriteArrayList) xl3Var.c).add(this.u);
                ((Runnable) xl3Var.b).run();
                return;
            }
            return;
        }
        sc8.j("Already attached");
    }

    public final void b0(bn4 bn4Var, v06 v06Var) {
        if (bn4Var == this.c.m(bn4Var.e) && (bn4Var.L == null || bn4Var.K == this)) {
            bn4Var.d0 = v06Var;
        } else {
            k32.h("Fragment ", bn4Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void c(bn4 bn4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + bn4Var);
        }
        if (bn4Var.S) {
            bn4Var.S = false;
            if (!bn4Var.w) {
                this.c.c(bn4Var);
                if (K(2)) {
                    Log.v("FragmentManager", "add from attach: " + bn4Var);
                }
                if (L(bn4Var)) {
                    this.G = true;
                }
            }
        }
    }

    public final void c0(bn4 bn4Var) {
        if (bn4Var != null) {
            if (bn4Var != this.c.m(bn4Var.e) || (bn4Var.L != null && bn4Var.K != this)) {
                k32.h("Fragment ", bn4Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        bn4 bn4Var2 = this.z;
        this.z = bn4Var;
        r(bn4Var2);
        r(this.z);
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(bn4 bn4Var) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup G = G(bn4Var);
        if (G != null) {
            an4 an4Var = bn4Var.Z;
            boolean z = false;
            if (an4Var == null) {
                i = 0;
            } else {
                i = an4Var.b;
            }
            if (an4Var == null) {
                i2 = 0;
            } else {
                i2 = an4Var.c;
            }
            int i5 = i2 + i;
            if (an4Var == null) {
                i3 = 0;
            } else {
                i3 = an4Var.d;
            }
            int i6 = i3 + i5;
            if (an4Var == null) {
                i4 = 0;
            } else {
                i4 = an4Var.e;
            }
            if (i4 + i6 > 0) {
                if (G.getTag(2131296735) == null) {
                    G.setTag(2131296735, bn4Var);
                }
                bn4 bn4Var2 = (bn4) G.getTag(2131296735);
                an4 an4Var2 = bn4Var.Z;
                if (an4Var2 != null) {
                    z = an4Var2.a;
                }
                if (bn4Var2.Z != null) {
                    bn4Var2.j().a = z;
                }
            }
        }
    }

    public final HashSet e() {
        ac3 ac3Var;
        HashSet hashSet = new HashSet();
        ArrayList q = this.c.q();
        int size = q.size();
        int i = 0;
        while (i < size) {
            Object obj = q.get(i);
            i++;
            ViewGroup viewGroup = ((to4) obj).c.W;
            if (viewGroup != null) {
                I().getClass();
                Object tag = viewGroup.getTag(2131296663);
                if (tag instanceof ac3) {
                    ac3Var = (ac3) tag;
                } else {
                    ac3Var = new ac3(viewGroup);
                    viewGroup.setTag(2131296663, ac3Var);
                }
                hashSet.add(ac3Var);
            }
        }
        return hashSet;
    }

    public final HashSet f(int i, int i2, ArrayList arrayList) {
        ViewGroup viewGroup;
        ac3 ac3Var;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((id0) arrayList.get(i)).a;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                bn4 bn4Var = ((wo4) obj).b;
                if (bn4Var != null && (viewGroup = bn4Var.W) != null) {
                    I().getClass();
                    Object tag = viewGroup.getTag(2131296663);
                    if (tag instanceof ac3) {
                        ac3Var = (ac3) tag;
                    } else {
                        ac3Var = new ac3(viewGroup);
                        viewGroup.setTag(2131296663, ac3Var);
                    }
                    hashSet.add(ac3Var);
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0() {
        ArrayList q = this.c.q();
        int size = q.size();
        int i = 0;
        while (i < size) {
            Object obj = q.get(i);
            i++;
            to4 to4Var = (to4) obj;
            bn4 bn4Var = to4Var.c;
            if (bn4Var.X) {
                if (this.b) {
                    this.K = true;
                } else {
                    bn4Var.X = false;
                    to4Var.j();
                }
            }
        }
    }

    public final to4 g(bn4 bn4Var) {
        String str = bn4Var.e;
        wtc wtcVar = this.c;
        to4 to4Var = (to4) ((HashMap) wtcVar.b).get(str);
        if (to4Var != null) {
            return to4Var;
        }
        to4 to4Var2 = new to4(this.o, wtcVar, bn4Var);
        to4Var2.l(this.w.b.getClassLoader());
        to4Var2.e = this.v;
        return to4Var2;
    }

    public final void g0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new bc6());
        dn4 dn4Var = this.w;
        if (dn4Var != null) {
            try {
                dn4Var.e.dump("  ", null, printWriter, new String[0]);
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

    public final void h(bn4 bn4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + bn4Var);
        }
        if (!bn4Var.S) {
            bn4Var.S = true;
            if (bn4Var.w) {
                if (K(2)) {
                    Log.v("FragmentManager", "remove from detach: " + bn4Var);
                }
                wtc wtcVar = this.c;
                synchronized (((ArrayList) wtcVar.a)) {
                    ((ArrayList) wtcVar.a).remove(bn4Var);
                }
                bn4Var.w = false;
                if (L(bn4Var)) {
                    this.G = true;
                }
                d0(bn4Var);
            }
        }
    }

    public final void h0() {
        int i;
        synchronized (this.a) {
            boolean z = true;
            if (!this.a.isEmpty()) {
                yn4 yn4Var = this.j;
                yn4Var.a = true;
                op4 op4Var = yn4Var.c;
                if (op4Var != null) {
                    op4Var.invoke();
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
            yn4 yn4Var2 = this.j;
            yn4Var2.a = z;
            op4 op4Var2 = yn4Var2.c;
            if (op4Var2 != null) {
                op4Var2.invoke();
            }
        }
    }

    public final void i(boolean z, Configuration configuration) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (bn4 bn4Var : this.c.s()) {
            if (bn4Var != null) {
                bn4Var.onConfigurationChanged(configuration);
                if (z) {
                    bn4Var.M.i(true, configuration);
                }
            }
        }
    }

    public final boolean j() {
        boolean z;
        if (this.v >= 1) {
            for (bn4 bn4Var : this.c.s()) {
                if (bn4Var != null) {
                    if (!bn4Var.R) {
                        z = bn4Var.M.j();
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
        for (bn4 bn4Var : this.c.s()) {
            if (bn4Var != null && N(bn4Var)) {
                if (!bn4Var.R) {
                    z = bn4Var.M.k();
                } else {
                    z = false;
                }
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bn4Var);
                    z2 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                bn4 bn4Var2 = (bn4) this.e.get(i);
                if (arrayList == null || !arrayList.contains(bn4Var2)) {
                    bn4Var2.getClass();
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
        dn4 dn4Var = this.w;
        wtc wtcVar = this.c;
        if (dn4Var != null) {
            z = ((jo4) wtcVar.d).f;
        } else {
            Context context = dn4Var.b;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z) {
            for (kd0 kd0Var : this.l.values()) {
                ArrayList arrayList = kd0Var.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((jo4) wtcVar.d).d((String) obj, false);
                }
            }
        }
        u(-1);
        dn4 dn4Var2 = this.w;
        if (dn4Var2 != null) {
            dn4Var2.e.E.remove(this.r);
        }
        dn4 dn4Var3 = this.w;
        if (dn4Var3 != null) {
            dn4Var3.e.y.remove(this.q);
        }
        dn4 dn4Var4 = this.w;
        if (dn4Var4 != null) {
            dn4Var4.e.G.remove(this.s);
        }
        dn4 dn4Var5 = this.w;
        if (dn4Var5 != null) {
            dn4Var5.e.H.remove(this.t);
        }
        dn4 dn4Var6 = this.w;
        if (dn4Var6 != null && this.y == null) {
            xl3 xl3Var = dn4Var6.e.c;
            zn4 zn4Var = this.u;
            ((CopyOnWriteArrayList) xl3Var.c).remove(zn4Var);
            if (((HashMap) xl3Var.d).remove(zn4Var) == null) {
                ((Runnable) xl3Var.b).run();
            } else {
                fyb.g();
            }
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            Iterator it = this.j.b.iterator();
            while (it.hasNext()) {
                ((ka1) it.next()).cancel();
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
        for (bn4 bn4Var : this.c.s()) {
            if (bn4Var != null) {
                bn4Var.V = true;
                if (z) {
                    bn4Var.M.m(true);
                }
            }
        }
    }

    public final void n(boolean z) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (bn4 bn4Var : this.c.s()) {
            if (bn4Var != null && z) {
                bn4Var.M.n(true);
            }
        }
    }

    public final void o() {
        ArrayList r = this.c.r();
        int size = r.size();
        int i = 0;
        while (i < size) {
            Object obj = r.get(i);
            i++;
            bn4 bn4Var = (bn4) obj;
            if (bn4Var != null) {
                bn4Var.u();
                bn4Var.M.o();
            }
        }
    }

    public final boolean p() {
        boolean z;
        if (this.v >= 1) {
            for (bn4 bn4Var : this.c.s()) {
                if (bn4Var != null) {
                    if (!bn4Var.R) {
                        z = bn4Var.M.p();
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
            for (bn4 bn4Var : this.c.s()) {
                if (bn4Var != null && !bn4Var.R) {
                    bn4Var.M.q();
                }
            }
        }
    }

    public final void r(bn4 bn4Var) {
        if (bn4Var != null) {
            if (bn4Var == this.c.m(bn4Var.e)) {
                bn4Var.K.getClass();
                boolean O = O(bn4Var);
                Boolean bool = bn4Var.s;
                if (bool == null || bool.booleanValue() != O) {
                    bn4Var.s = Boolean.valueOf(O);
                    ho4 ho4Var = bn4Var.M;
                    ho4Var.h0();
                    ho4Var.r(ho4Var.z);
                }
            }
        }
    }

    public final void s(boolean z) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (bn4 bn4Var : this.c.s()) {
            if (bn4Var != null && z) {
                bn4Var.M.s(true);
            }
        }
    }

    public final boolean t() {
        boolean z;
        if (this.v < 1) {
            return false;
        }
        boolean z2 = false;
        for (bn4 bn4Var : this.c.s()) {
            if (bn4Var != null && N(bn4Var)) {
                if (!bn4Var.R) {
                    z = bn4Var.M.t();
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
        bn4 bn4Var = this.y;
        if (bn4Var != null) {
            sb.append(bn4Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            dn4 dn4Var = this.w;
            if (dn4Var != null) {
                sb.append(dn4Var.getClass().getSimpleName());
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
            for (to4 to4Var : ((HashMap) this.c.b).values()) {
                if (to4Var != null) {
                    to4Var.e = i;
                }
            }
            Q(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((ac3) it.next()).c();
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
        String o = tb4.o(str, "    ");
        wtc wtcVar = this.c;
        ArrayList arrayList = (ArrayList) wtcVar.a;
        String o2 = tb4.o(str, "    ");
        HashMap hashMap = (HashMap) wtcVar.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (to4 to4Var : hashMap.values()) {
                printWriter.print(str);
                if (to4Var != null) {
                    bn4 bn4Var = to4Var.c;
                    printWriter.println(bn4Var);
                    bn4Var.i(o2, fileDescriptor, printWriter, strArr);
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
                printWriter.println(((bn4) arrayList.get(i)).toString());
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
                printWriter.println(((bn4) this.e.get(i2)).toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                id0 id0Var = (id0) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(id0Var.toString());
                id0Var.g(o, printWriter, true);
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
                    printWriter.println((do4) this.a.get(i4));
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
            ((ac3) it.next()).c();
        }
    }

    public final void y(do4 do4Var, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (this.J) {
                    sc8.j("FragmentManager has been destroyed");
                    return;
                } else {
                    sc8.j("FragmentManager has not been attached to a host.");
                    return;
                }
            } else if (P()) {
                sc8.j("Can not perform this action after onSaveInstanceState");
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
            this.a.add(do4Var);
            Z();
        }
    }

    public final void z(boolean z) {
        if (!this.b) {
            if (this.w == null) {
                if (this.J) {
                    sc8.j("FragmentManager has been destroyed");
                    return;
                } else {
                    sc8.j("FragmentManager has not been attached to a host.");
                    return;
                }
            } else if (Looper.myLooper() == this.w.c.getLooper()) {
                if (!z && P()) {
                    sc8.j("Can not perform this action after onSaveInstanceState");
                    return;
                } else if (this.L == null) {
                    this.L = new ArrayList();
                    this.M = new ArrayList();
                    return;
                } else {
                    return;
                }
            } else {
                sc8.j("Must be called from main thread of fragment host");
                return;
            }
        }
        sc8.j("FragmentManager is already executing transactions");
    }
}
