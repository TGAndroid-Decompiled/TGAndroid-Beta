package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class sz6 extends Binder implements IInterface {
    public final WeakReference a;
    public final rx6 b;
    public final CopyOnWriteArraySet c;
    public i99 d;
    public o99 e;
    public int f;
    public fo5 i;
    public fo5 j;
    public int k;
    public asb l;
    public rz6 m;
    public qz6 n;

    public sz6(yx6 yx6Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.a = new WeakReference(yx6Var);
        this.b = new rx6(yx6Var);
        this.c = new CopyOnWriteArraySet();
        i99 i99Var = i99.r;
        this.d = i99Var;
        this.e = o99.h;
        this.i = i99Var;
        this.j = i99Var;
        this.k = 0;
    }

    public static void W(yx6 yx6Var, xw6 xw6Var, int i, gaa gaaVar) {
        try {
            ww6 ww6Var = xw6Var.e;
            ww6Var.getClass();
            ww6Var.g(i, gaaVar);
            yx6Var.c.a(true, true);
        } catch (RemoteException e) {
            efd.g("MediaSessionStub", "Failed to send result to controller " + xw6Var, e);
        }
    }

    public static bm6 X(ot2 ot2Var) {
        return new bm6(new bm6(ot2Var, (byte) 7), (byte) 6);
    }

    public static x76 e(yx6 yx6Var, xw6 xw6Var, int i, pz6 pz6Var, ot2 ot2Var) {
        if (yx6Var.i()) {
            return do5.b;
        }
        x76 x76Var = (x76) pz6Var.j(yx6Var, xw6Var, i);
        ?? obj = new Object();
        x76Var.b(new oy6(yx6Var, obj, ot2Var, x76Var, (byte) 3), mo3.a);
        return obj;
    }

    public final void P(gk5 gk5Var, int i, Bundle bundle, Bundle bundle2, boolean z) {
        h9a h9aVar;
        Bundle o = gcc.o(bundle2);
        if (gk5Var != null && bundle != null && o != null) {
            try {
                int i2 = bundle.getInt(h9a.h, 0);
                if (i2 != 0) {
                    h9aVar = new h9a(i2);
                } else {
                    String string = bundle.getString(h9a.i);
                    string.getClass();
                    Bundle o2 = gcc.o(bundle.getBundle(h9a.j));
                    if (o2 == null) {
                        o2 = Bundle.EMPTY;
                    }
                    h9aVar = new h9a(string, o2);
                }
                if (bn2.i(h9aVar.b)) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        yx6 yx6Var = (yx6) this.a.get();
                        if (yx6Var != null && !yx6Var.i()) {
                            R(new te(this, gk5Var.asBinder(), h9aVar, yx6Var, i, gk5Var, (byte) 6));
                        }
                        return;
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                d(gk5Var, i, h9aVar, 0, new gz6(new tq6(z, h9aVar, o), (byte) 1));
            } catch (RuntimeException e) {
                efd.g("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
            }
        }
    }

    public final void Q(xw6 xw6Var, int i) {
        S(xw6Var, i, 1, X(new rm6(this, xw6Var, (byte) 6)));
    }

    public final void R(Runnable runnable) {
        yx6 yx6Var = (yx6) this.a.get();
        if (yx6Var != null) {
            gcc.X(yx6Var.l, runnable);
        }
    }

    public final void S(final xw6 xw6Var, final int i, int i2, final pz6 pz6Var) {
        boolean z;
        WeakReference weakReference = this.a;
        yx6 yx6Var = (yx6) weakReference.get();
        if (yx6Var != null) {
            if (Looper.myLooper() == yx6Var.l.getLooper()) {
                z = true;
            } else {
                z = false;
            }
            yve.p(z);
        }
        final yx6 yx6Var2 = (yx6) weakReference.get();
        if (yx6Var2 != null && !yx6Var2.i()) {
            rx6 rx6Var = this.b;
            if (rx6Var.Y(xw6Var)) {
                if (!rx6Var.a0(xw6Var, i2)) {
                    W(yx6Var2, xw6Var, i, new gaa(-4));
                    return;
                }
                sjf sjfVar = yx6Var2.e;
                yx6Var2.q(xw6Var);
                sjfVar.getClass();
                if (i2 == 27) {
                    pz6Var.j(yx6Var2, xw6Var, i);
                    rx6Var.i(xw6Var, i2, new Object());
                    return;
                }
                rx6Var.i(xw6Var, i2, new ts2() {
                    @Override
                    public final x76 run() {
                        return (x76) pz6.this.j(yx6Var2, xw6Var, i);
                    }
                });
            }
        }
    }

    public final void T() {
        this.a.clear();
        rx6 rx6Var = this.b;
        ((WeakReference) rx6Var.d).clear();
        po5 L = rx6Var.L();
        int size = L.size();
        int i = 0;
        while (i < size) {
            Object obj = L.get(i);
            i++;
            xw6 xw6Var = (xw6) obj;
            rx6Var.k0(xw6Var);
            ww6 ww6Var = xw6Var.e;
            if (ww6Var != null) {
                ww6Var.e();
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.c;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ww6 ww6Var2 = ((xw6) it.next()).e;
            if (ww6Var2 != null) {
                ww6Var2.e();
            }
        }
        copyOnWriteArraySet.clear();
    }

    public final void U(cg8 cg8Var, HashMap hashMap) {
        String str;
        Object obj = cg8Var.d;
        if (obj != null && !hashMap.containsKey(obj) && (str = (String) this.j.get(obj)) != null) {
            hashMap.put(obj, str);
        }
    }

    public final void V(cg8 cg8Var, HashMap hashMap) {
        String str;
        Object obj = cg8Var.a;
        if (obj != null && !hashMap.containsKey(obj) && (str = (String) this.i.get(obj)) != null) {
            hashMap.put(obj, str);
        }
    }

    public final void Y(gk5 gk5Var, int i, Bundle bundle, boolean z) {
        if (gk5Var != null && bundle != null) {
            b(gk5Var, i, 31, new gz6(new rm6(new t41((byte) 9, bundle, z), new hz6((byte) 0), (byte) 4), (byte) 1));
        }
    }

    public final void Z(gk5 gk5Var, int i, IBinder iBinder, boolean z) {
        if (gk5Var != null && iBinder != null) {
            b(gk5Var, i, 20, new gz6(new rm6(new t41((byte) 11, iBinder, z), new hz6((byte) 0), (byte) 4), (byte) 1));
        }
    }

    public final cg8 a(cg8 cg8Var) {
        Object obj;
        Object obj2 = cg8Var.a;
        if (obj2 == null) {
            obj2 = null;
            obj = null;
        } else {
            String str = (String) this.i.get(obj2);
            if (str != null) {
                obj2 = str;
            }
            obj = null;
        }
        int i = cg8Var.b;
        Object obj3 = obj;
        ft6 ft6Var = cg8Var.c;
        Object obj4 = cg8Var.d;
        if (obj4 != null) {
            Object obj5 = (String) this.j.get(obj4);
            if (obj5 == null) {
                obj5 = obj4;
            }
            obj3 = obj5;
        }
        return new cg8(obj2, i, ft6Var, obj3, cg8Var.e, cg8Var.f, cg8Var.g, cg8Var.h, cg8Var.i);
    }

    public final kg8 a0(kg8 kg8Var) {
        rz6 rz6Var;
        c2c c2cVar;
        boolean z;
        asb asbVar = kg8Var.j;
        cg8 cg8Var = kg8Var.d;
        cg8 cg8Var2 = kg8Var.e;
        daa daaVar = kg8Var.c;
        if (asbVar.p()) {
            return kg8Var;
        }
        if (!Objects.equals(this.l, asbVar) || (rz6Var = this.m) == null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            zrb zrbVar = new zrb();
            for (int i = 0; i < asbVar.o(); i++) {
                asbVar.n(i, zrbVar);
                Object obj = zrbVar.a;
                if (obj != null && !hashMap.containsKey(obj)) {
                    String str = (String) this.i.get(zrbVar.a);
                    Object obj2 = zrbVar.a;
                    if (str == null) {
                        int i2 = this.k;
                        this.k = i2 + 1;
                        String str2 = gcc.a;
                        str = Integer.toString(i2, 36);
                    }
                    hashMap.put(obj2, str);
                }
            }
            xrb xrbVar = new xrb();
            for (int i3 = 0; i3 < asbVar.h(); i3++) {
                asbVar.f(i3, xrbVar, true);
                Object obj3 = xrbVar.b;
                if (obj3 != null && !hashMap2.containsKey(obj3)) {
                    String str3 = (String) this.j.get(xrbVar.b);
                    Object obj4 = xrbVar.b;
                    if (str3 == null) {
                        int i4 = this.k;
                        this.k = i4 + 1;
                        String str4 = gcc.a;
                        str3 = Integer.toString(i4, 36);
                    }
                    hashMap2.put(obj4, str3);
                }
                Object obj5 = xrbVar.a;
                if (obj5 != null && !hashMap2.containsKey(obj5)) {
                    String str5 = (String) this.j.get(xrbVar.a);
                    Object obj6 = xrbVar.a;
                    if (str5 == null) {
                        int i5 = this.k;
                        this.k = i5 + 1;
                        String str6 = gcc.a;
                        str5 = Integer.toString(i5, 36);
                    }
                    hashMap2.put(obj6, str5);
                }
            }
            V(daaVar.a, hashMap);
            V(cg8Var, hashMap);
            V(cg8Var2, hashMap);
            U(daaVar.a, hashMap2);
            U(cg8Var, hashMap2);
            U(cg8Var2, hashMap2);
            this.i = fo5.g(hashMap);
            this.j = fo5.g(hashMap2);
            this.l = asbVar;
            rz6Var = new rz6(asbVar, this.i, this.j);
            this.m = rz6Var;
        }
        daa daaVar2 = new daa(a(daaVar.a), daaVar.b, daaVar.c, daaVar.d, daaVar.e, daaVar.f, daaVar.g, daaVar.h, daaVar.i, daaVar.j);
        cg8 a = a(cg8Var);
        cg8 a2 = a(cg8Var2);
        e64 e64Var = kg8Var.a;
        int i6 = kg8Var.b;
        int i7 = kg8Var.f;
        of8 of8Var = kg8Var.g;
        int i8 = kg8Var.h;
        boolean z2 = kg8Var.i;
        int i9 = kg8Var.k;
        ggc ggcVar = kg8Var.l;
        nt6 nt6Var = kg8Var.m;
        float f = kg8Var.n;
        float f2 = kg8Var.o;
        int i10 = kg8Var.p;
        oz ozVar = kg8Var.q;
        n43 n43Var = kg8Var.r;
        xe3 xe3Var = kg8Var.s;
        int i11 = kg8Var.t;
        boolean z3 = kg8Var.u;
        boolean z4 = kg8Var.v;
        int i12 = kg8Var.w;
        boolean z5 = kg8Var.x;
        boolean z6 = kg8Var.y;
        int i13 = kg8Var.z;
        int i14 = kg8Var.A;
        nt6 nt6Var2 = kg8Var.B;
        long j = kg8Var.C;
        long j2 = kg8Var.D;
        long j3 = kg8Var.E;
        f2c f2cVar = kg8Var.F;
        c2c c2cVar2 = kg8Var.G;
        if (!rz6Var.p()) {
            c2cVar = c2cVar2;
            if (daaVar2.a.b >= rz6Var.e.o()) {
                z = false;
                yve.p(z);
                return new kg8(e64Var, i6, daaVar2, a, a2, i7, of8Var, i8, z2, ggcVar, rz6Var, i9, nt6Var, f, f2, ozVar, i10, n43Var, xe3Var, i11, z3, z4, i12, i13, i14, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
            }
        } else {
            c2cVar = c2cVar2;
        }
        z = true;
        yve.p(z);
        return new kg8(e64Var, i6, daaVar2, a, a2, i7, of8Var, i8, z2, ggcVar, rz6Var, i9, nt6Var, f, f2, ozVar, i10, n43Var, xe3Var, i11, z3, z4, i12, i13, i14, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
    }

    public final void b(gk5 gk5Var, int i, int i2, pz6 pz6Var) {
        c(gk5Var, i, new l64(this, i2, pz6Var));
    }

    public final kg8 b0(kg8 kg8Var) {
        po5 po5Var = kg8Var.F.a;
        ?? lpVar = new lp(4);
        lp lpVar2 = new lp(4);
        for (int i = 0; i < po5Var.size(); i++) {
            t1c t1cVar = ((e2c) po5Var.get(i)).b;
            String str = t1cVar.b;
            String str2 = (String) this.d.get(t1cVar);
            if (str2 == null) {
                StringBuilder sb = new StringBuilder();
                int i2 = this.f;
                this.f = i2 + 1;
                String str3 = gcc.a;
                sb.append(Integer.toString(i2, 36));
                sb.append("-");
                sb.append(str);
                str2 = sb.toString();
            }
            lpVar.F(t1cVar, str2);
            lpVar2.x(str, str2);
        }
        this.d = lpVar.D();
        this.e = lpVar2.d(false);
        mo5 p = po5.p();
        for (int i3 = 0; i3 < po5Var.size(); i3++) {
            e2c e2cVar = (e2c) po5Var.get(i3);
            p.c(new e2c(c0(e2cVar.b), e2cVar.c, e2cVar.d, e2cVar.e));
        }
        kg8 a = kg8Var.a(new f2c(p.f()));
        c2c c2cVar = a.G;
        if (c2cVar.H.isEmpty()) {
            return a;
        }
        b2c c = c2cVar.a().c();
        v9c n = c2cVar.H.values().n();
        while (n.hasNext()) {
            z1c z1cVar = (z1c) n.next();
            c.a(new z1c(c0(z1cVar.a), z1cVar.b));
        }
        return a.d(c.b());
    }

    public final void c(gk5 gk5Var, int i, oz6 oz6Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            yx6 yx6Var = (yx6) this.a.get();
            if (yx6Var != null && !yx6Var.i()) {
                R(new y36(this, gk5Var.asBinder(), oz6Var, i, (byte) 5));
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final t1c c0(t1c t1cVar) {
        String str;
        String str2 = (String) this.d.get(t1cVar);
        if (str2 == null) {
            str2 = t1cVar.b;
        }
        int i = 0;
        while (true) {
            int i2 = t1cVar.a;
            ko4[] ko4VarArr = t1cVar.d;
            if (i < i2) {
                if (ko4VarArr[i].n != null) {
                    ko4[] ko4VarArr2 = new ko4[i2];
                    for (int i3 = 0; i3 < t1cVar.a; i3++) {
                        ko4 ko4Var = ko4VarArr[i3];
                        String str3 = ko4Var.n;
                        if (str3 != null) {
                            str = (String) this.e.get(str3);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            jo4 a = ko4Var.a();
                            a.m = str;
                            ko4VarArr2[i3] = new ko4(a);
                        } else {
                            ko4VarArr2[i3] = ko4Var;
                        }
                    }
                    return new t1c(str2, ko4VarArr2);
                }
                i++;
            } else {
                return new t1c(str2, ko4VarArr);
            }
        }
    }

    public final void d(gk5 gk5Var, final int i, final h9a h9aVar, final int i2, final pz6 pz6Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final yx6 yx6Var = (yx6) this.a.get();
            if (yx6Var != null && !yx6Var.i()) {
                final IBinder asBinder = gk5Var.asBinder();
                R(new Runnable() {
                    @Override
                    public final void run() {
                        rx6 rx6Var = sz6.this.b;
                        xw6 M = rx6Var.M(asBinder);
                        if (M == null || !rx6Var.Y(M)) {
                            return;
                        }
                        h9a h9aVar2 = h9aVar;
                        yx6 yx6Var2 = yx6Var;
                        int i3 = i;
                        if (h9aVar2 != null) {
                            if (!rx6Var.c0(M, h9aVar2)) {
                                sz6.W(yx6Var2, M, i3, new gaa(-4));
                                return;
                            }
                        } else if (!rx6Var.b0(M, i2)) {
                            sz6.W(yx6Var2, M, i3, new gaa(-4));
                            return;
                        }
                        pz6Var.j(yx6Var2, M, i3);
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final int f(xw6 xw6Var, og8 og8Var, int i) {
        if (og8Var.m0(17)) {
            rx6 rx6Var = this.b;
            if (!rx6Var.a0(xw6Var, 17) && rx6Var.a0(xw6Var, 16)) {
                return og8Var.l0() + i;
            }
        }
        return i;
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        gk5 gk5Var;
        Bundle bundle;
        boolean z;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        switch (i) {
            case 3002:
                gk5 a = ep6.a(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (a != null && readFloat >= 0.0f && readFloat <= 1.0f) {
                    b(a, readInt, 24, X(new i64(readFloat, (byte) 2)));
                    break;
                }
                break;
            case 3003:
                gk5 a2 = ep6.a(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                if (a2 != null && readInt3 >= 0) {
                    b(a2, readInt2, 25, X(new yd(readInt3, (byte) 9)));
                    return true;
                }
                break;
            case 3004:
                gk5 a3 = ep6.a(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                if (a3 != null) {
                    b(a3, readInt4, 26, X(new tq6((byte) 12)));
                    return true;
                }
                break;
            case 3005:
                gk5 a4 = ep6.a(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                if (a4 != null) {
                    b(a4, readInt5, 26, X(new tq6((byte) 16)));
                    return true;
                }
                break;
            case 3006:
                gk5 a5 = ep6.a(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                boolean z2 = parcel.readInt() != 0;
                if (a5 != null) {
                    b(a5, readInt6, 26, X(new k64((byte) 4, z2)));
                    return true;
                }
                break;
            case 3007:
                Y(ep6.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) voe.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                gk5 a6 = ep6.a(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                Bundle bundle2 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                long readLong = parcel.readLong();
                if (a6 != null && bundle2 != null) {
                    b(a6, readInt7, 31, new gz6(new rm6(new i02(bundle2, readLong, (byte) 9), new hz6((byte) 0), (byte) 4), (byte) 1));
                    return true;
                }
                break;
            case 3009:
                Y(ep6.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) voe.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                Z(ep6.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                Z(ep6.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                gk5 a7 = ep6.a(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int readInt9 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (a7 != null && readStrongBinder != null && (readInt9 == -1 || readInt9 >= 0)) {
                    b(a7, readInt8, 20, new gz6(new rm6(new lf(readStrongBinder, readInt9, readLong2, (byte) 5), new hz6((byte) 0), (byte) 4), (byte) 1));
                    return true;
                }
                break;
            case 3013:
                gk5 a8 = ep6.a(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                boolean z3 = parcel.readInt() != 0;
                if (a8 != null) {
                    b(a8, readInt10, 1, X(new k64((byte) 3, z3)));
                    return true;
                }
                break;
            case 3014:
                gk5 a9 = ep6.a(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                Bundle bundle3 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                if (a9 != null && bundle3 != null) {
                    try {
                        gaa a10 = gaa.a(bundle3);
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            yx6 yx6Var = (yx6) this.a.get();
                            if (yx6Var != null && !yx6Var.i()) {
                                R(new y36(this, a9.asBinder(), readInt11, a10, (byte) 4));
                            }
                            break;
                        } finally {
                        }
                    } catch (RuntimeException e) {
                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
                        break;
                    }
                }
                break;
            case 3015:
                gk5 a11 = ep6.a(parcel.readStrongBinder());
                parcel.readInt();
                Bundle bundle4 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                WeakReference weakReference = this.a;
                yx6 yx6Var2 = (yx6) weakReference.get();
                if (a11 != null && bundle4 != null && yx6Var2 != null) {
                    try {
                        Context context = yx6Var2.f;
                        vs2 a12 = vs2.a(bundle4);
                        int callingUid = Binder.getCallingUid();
                        int callingPid = Binder.getCallingPid();
                        String str = a12.c;
                        String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                        if (packagesForUid != null && packagesForUid.length != 0) {
                            for (String str2 : packagesForUid) {
                                if (!str2.equals(str)) {
                                }
                            }
                            efd.f("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                            pye.a(a11);
                            break;
                        }
                        long clearCallingIdentity2 = Binder.clearCallingIdentity();
                        if (callingPid == 0) {
                            callingPid = a12.d;
                        }
                        try {
                            ry6 ry6Var = new ry6(str, callingPid, callingUid);
                            boolean K0 = zm9.J0(context).K0(ry6Var);
                            int i3 = a12.a;
                            int i4 = a12.b;
                            xw6 xw6Var = new xw6(ry6Var, i3, i4, K0, new lz6(a11, i4), a12.e);
                            yx6 yx6Var3 = (yx6) weakReference.get();
                            if (yx6Var3 != null && !yx6Var3.i()) {
                                this.c.add(xw6Var);
                                gcc.X(yx6Var3.l, new oy6(this, yx6Var3, xw6Var, a11, (byte) 2));
                            } else {
                                pye.a(a11);
                            }
                            break;
                        } finally {
                        }
                    } catch (RuntimeException e2) {
                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e2);
                        break;
                    }
                } else {
                    pye.a(a11);
                    break;
                }
                break;
            case 3016:
                gk5 a13 = ep6.a(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                P(a13, readInt12, (Bundle) voe.a(parcel, creator), (Bundle) voe.a(parcel, creator), false);
                return true;
            case 3017:
                gk5 a14 = ep6.a(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                if (a14 != null && (readInt14 == 2 || readInt14 == 0 || readInt14 == 1)) {
                    b(a14, readInt13, 15, X(new yd(readInt14, (byte) 8)));
                    return true;
                }
                break;
            case 3018:
                gk5 a15 = ep6.a(parcel.readStrongBinder());
                int readInt15 = parcel.readInt();
                boolean z4 = parcel.readInt() != 0;
                if (a15 != null) {
                    b(a15, readInt15, 14, X(new k64((byte) 5, z4)));
                    return true;
                }
                break;
            case 3019:
                gk5 a16 = ep6.a(parcel.readStrongBinder());
                int readInt16 = parcel.readInt();
                int readInt17 = parcel.readInt();
                if (a16 != null && readInt17 >= 0) {
                    b(a16, readInt16, 20, new bm6(new az6(this, readInt17, (byte) 4), (byte) 6));
                    return true;
                }
                break;
            case 3020:
                gk5 a17 = ep6.a(parcel.readStrongBinder());
                int readInt18 = parcel.readInt();
                int readInt19 = parcel.readInt();
                int readInt20 = parcel.readInt();
                if (a17 != null && readInt19 >= 0 && readInt20 >= readInt19) {
                    b(a17, readInt18, 20, new bm6(new xy6(this, readInt19, readInt20), (byte) 6));
                    return true;
                }
                break;
            case 3021:
                gk5 a18 = ep6.a(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (a18 != null) {
                    b(a18, readInt21, 20, X(new tq6((byte) 25)));
                    return true;
                }
                break;
            case 3022:
                gk5 a19 = ep6.a(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                int readInt23 = parcel.readInt();
                int readInt24 = parcel.readInt();
                if (a19 != null && readInt23 >= 0 && readInt24 >= 0) {
                    b(a19, readInt22, 20, X(new ml0(readInt23, readInt24, (byte) 5)));
                    return true;
                }
                break;
            case 3023:
                gk5 a20 = ep6.a(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                final int readInt26 = parcel.readInt();
                final int readInt27 = parcel.readInt();
                final int readInt28 = parcel.readInt();
                if (a20 != null && readInt26 >= 0 && readInt27 >= readInt26 && readInt28 >= 0) {
                    b(a20, readInt25, 20, X(new ot2() {
                        @Override
                        public final void accept(Object obj) {
                            ((og8) obj).t0(readInt26, readInt27, readInt28);
                        }
                    }));
                    return true;
                }
                break;
            case 3024:
                gk5 a21 = ep6.a(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                if (a21 != null) {
                    c(a21, readInt29, new oz6(this) {
                        public final sz6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(xw6 xw6Var2, int i5) {
                            byte b = r2;
                            sz6 sz6Var = this.b;
                            switch (b) {
                                case 0:
                                    sz6Var.S(xw6Var2, i5, 11, sz6.X(new tq6((byte) 28)));
                                    return;
                                case 1:
                                    sz6Var.Q(xw6Var2, i5);
                                    return;
                                case 2:
                                    sz6Var.S(xw6Var2, i5, 3, sz6.X(new hz6((byte) 3)));
                                    return;
                                case 3:
                                    sz6Var.S(xw6Var2, i5, 12, sz6.X(new hz6((byte) 1)));
                                    return;
                                case 4:
                                    sz6Var.S(xw6Var2, i5, 1, sz6.X(new tq6((byte) 27)));
                                    return;
                                case 5:
                                    sz6Var.S(xw6Var2, i5, 9, sz6.X(new hz6((byte) 2)));
                                    return;
                                default:
                                    sz6Var.S(xw6Var2, i5, 7, sz6.X(new tq6((byte) 29)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                break;
            case 3025:
                gk5 a22 = ep6.a(parcel.readStrongBinder());
                int readInt30 = parcel.readInt();
                if (a22 != null) {
                    c(a22, readInt30, new oz6(this) {
                        public final sz6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(xw6 xw6Var2, int i5) {
                            byte b = r2;
                            sz6 sz6Var = this.b;
                            switch (b) {
                                case 0:
                                    sz6Var.S(xw6Var2, i5, 11, sz6.X(new tq6((byte) 28)));
                                    return;
                                case 1:
                                    sz6Var.Q(xw6Var2, i5);
                                    return;
                                case 2:
                                    sz6Var.S(xw6Var2, i5, 3, sz6.X(new hz6((byte) 3)));
                                    return;
                                case 3:
                                    sz6Var.S(xw6Var2, i5, 12, sz6.X(new hz6((byte) 1)));
                                    return;
                                case 4:
                                    sz6Var.S(xw6Var2, i5, 1, sz6.X(new tq6((byte) 27)));
                                    return;
                                case 5:
                                    sz6Var.S(xw6Var2, i5, 9, sz6.X(new hz6((byte) 2)));
                                    return;
                                default:
                                    sz6Var.S(xw6Var2, i5, 7, sz6.X(new tq6((byte) 29)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                break;
            case 3026:
                gk5 a23 = ep6.a(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                if (a23 != null) {
                    b(a23, readInt31, 2, X(new tq6((byte) 23)));
                    return true;
                }
                break;
            case 3027:
                gk5 a24 = ep6.a(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                Bundle bundle5 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                if (a24 != null && bundle5 != null) {
                    try {
                        b(a24, readInt32, 13, X(new bm6(new of8(bundle5.getFloat(of8.e, 1.0f), bundle5.getFloat(of8.f, 1.0f)), (byte) 5)));
                        break;
                    } catch (RuntimeException e3) {
                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e3);
                        break;
                    }
                }
                break;
            case 3028:
                gk5 a25 = ep6.a(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                float readFloat2 = parcel.readFloat();
                if (a25 != null && readFloat2 > 0.0f) {
                    b(a25, readInt33, 13, X(new i64(readFloat2, (byte) 1)));
                    return true;
                }
                break;
            case 3029:
                gk5 a26 = ep6.a(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                final Bundle bundle6 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                if (a26 != null && bundle6 != null) {
                    b(a26, readInt34, 20, new gz6(new rm6(new pz6() {
                        @Override
                        public final Object j(yx6 yx6Var4, xw6 xw6Var2, int i5) {
                            byte b = r2;
                            Bundle bundle7 = bundle6;
                            switch (b) {
                                case 0:
                                    try {
                                        return yx6Var4.k(xw6Var2, po5.u(ft6.a(xw6Var2.c, bundle7)));
                                    } catch (RuntimeException e4) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return fne.b(e4);
                                    }
                                case 1:
                                    try {
                                        return yx6Var4.k(xw6Var2, po5.u(ft6.a(xw6Var2.c, bundle7)));
                                    } catch (RuntimeException e5) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return fne.b(e5);
                                    }
                                case 2:
                                    try {
                                        return yx6Var4.k(xw6Var2, po5.u(ft6.a(xw6Var2.c, bundle7)));
                                    } catch (RuntimeException e6) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return fne.b(e6);
                                    }
                                default:
                                    try {
                                        nt6 b2 = nt6.b(xw6Var2.c, bundle7);
                                        yx6Var4.t();
                                        yx6Var4.t.j0(b2);
                                        return fne.c(new gaa(0));
                                    } catch (RuntimeException e7) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return fne.b(e7);
                                    }
                            }
                        }
                    }, new tq6((byte) 18), (byte) 5), (byte) 1));
                    return true;
                }
                break;
            case 3030:
                gk5 a27 = ep6.a(parcel.readStrongBinder());
                int readInt35 = parcel.readInt();
                int readInt36 = parcel.readInt();
                final Bundle bundle7 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                if (a27 != null && bundle7 != null && readInt36 >= 0) {
                    b(a27, readInt35, 20, new gz6(new rm6(new pz6() {
                        @Override
                        public final Object j(yx6 yx6Var4, xw6 xw6Var2, int i5) {
                            byte b = r2;
                            Bundle bundle72 = bundle7;
                            switch (b) {
                                case 0:
                                    try {
                                        return yx6Var4.k(xw6Var2, po5.u(ft6.a(xw6Var2.c, bundle72)));
                                    } catch (RuntimeException e4) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return fne.b(e4);
                                    }
                                case 1:
                                    try {
                                        return yx6Var4.k(xw6Var2, po5.u(ft6.a(xw6Var2.c, bundle72)));
                                    } catch (RuntimeException e5) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return fne.b(e5);
                                    }
                                case 2:
                                    try {
                                        return yx6Var4.k(xw6Var2, po5.u(ft6.a(xw6Var2.c, bundle72)));
                                    } catch (RuntimeException e6) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return fne.b(e6);
                                    }
                                default:
                                    try {
                                        nt6 b2 = nt6.b(xw6Var2.c, bundle72);
                                        yx6Var4.t();
                                        yx6Var4.t.j0(b2);
                                        return fne.c(new gaa(0));
                                    } catch (RuntimeException e7) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return fne.b(e7);
                                    }
                            }
                        }
                    }, new az6(this, readInt36, (byte) 1), (byte) 5), (byte) 1));
                    return true;
                }
                break;
            case 3031:
                gk5 a28 = ep6.a(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                final IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (a28 != null && readStrongBinder2 != null) {
                    b(a28, readInt37, 20, new gz6(new rm6(new pz6() {
                        @Override
                        public final Object j(yx6 yx6Var4, xw6 xw6Var2, int i5) {
                            byte b = r2;
                            int i6 = 0;
                            IBinder iBinder = readStrongBinder2;
                            switch (b) {
                                case 0:
                                    try {
                                        po5 a29 = f31.a(iBinder);
                                        mo5 p = po5.p();
                                        while (i6 < a29.size()) {
                                            Bundle bundle8 = (Bundle) a29.get(i6);
                                            bundle8.getClass();
                                            p.c(ft6.a(xw6Var2.c, bundle8));
                                            i6++;
                                        }
                                        return yx6Var4.k(xw6Var2, p.f());
                                    } catch (RuntimeException e4) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return fne.b(e4);
                                    }
                                case 1:
                                    try {
                                        po5 a30 = f31.a(iBinder);
                                        mo5 p2 = po5.p();
                                        while (i6 < a30.size()) {
                                            Bundle bundle9 = (Bundle) a30.get(i6);
                                            bundle9.getClass();
                                            p2.c(ft6.a(xw6Var2.c, bundle9));
                                            i6++;
                                        }
                                        return yx6Var4.k(xw6Var2, p2.f());
                                    } catch (RuntimeException e5) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return fne.b(e5);
                                    }
                                default:
                                    try {
                                        po5 a31 = f31.a(iBinder);
                                        mo5 p3 = po5.p();
                                        while (i6 < a31.size()) {
                                            Bundle bundle10 = (Bundle) a31.get(i6);
                                            bundle10.getClass();
                                            p3.c(ft6.a(xw6Var2.c, bundle10));
                                            i6++;
                                        }
                                        return yx6Var4.k(xw6Var2, p3.f());
                                    } catch (RuntimeException e6) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return fne.b(e6);
                                    }
                            }
                        }
                    }, new tq6((byte) 17), (byte) 5), (byte) 1));
                    return true;
                }
                break;
            case 3032:
                gk5 a29 = ep6.a(parcel.readStrongBinder());
                int readInt38 = parcel.readInt();
                int readInt39 = parcel.readInt();
                final IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (a29 != null && readStrongBinder3 != null && readInt39 >= 0) {
                    b(a29, readInt38, 20, new gz6(new rm6(new pz6() {
                        @Override
                        public final Object j(yx6 yx6Var4, xw6 xw6Var2, int i5) {
                            byte b = r2;
                            int i6 = 0;
                            IBinder iBinder = readStrongBinder3;
                            switch (b) {
                                case 0:
                                    try {
                                        po5 a292 = f31.a(iBinder);
                                        mo5 p = po5.p();
                                        while (i6 < a292.size()) {
                                            Bundle bundle8 = (Bundle) a292.get(i6);
                                            bundle8.getClass();
                                            p.c(ft6.a(xw6Var2.c, bundle8));
                                            i6++;
                                        }
                                        return yx6Var4.k(xw6Var2, p.f());
                                    } catch (RuntimeException e4) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return fne.b(e4);
                                    }
                                case 1:
                                    try {
                                        po5 a30 = f31.a(iBinder);
                                        mo5 p2 = po5.p();
                                        while (i6 < a30.size()) {
                                            Bundle bundle9 = (Bundle) a30.get(i6);
                                            bundle9.getClass();
                                            p2.c(ft6.a(xw6Var2.c, bundle9));
                                            i6++;
                                        }
                                        return yx6Var4.k(xw6Var2, p2.f());
                                    } catch (RuntimeException e5) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return fne.b(e5);
                                    }
                                default:
                                    try {
                                        po5 a31 = f31.a(iBinder);
                                        mo5 p3 = po5.p();
                                        while (i6 < a31.size()) {
                                            Bundle bundle10 = (Bundle) a31.get(i6);
                                            bundle10.getClass();
                                            p3.c(ft6.a(xw6Var2.c, bundle10));
                                            i6++;
                                        }
                                        return yx6Var4.k(xw6Var2, p3.f());
                                    } catch (RuntimeException e6) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return fne.b(e6);
                                    }
                            }
                        }
                    }, new az6(this, readInt39, (byte) 3), (byte) 5), (byte) 1));
                    return true;
                }
                break;
            case 3033:
                gk5 a30 = ep6.a(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                final Bundle bundle8 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                if (a30 != null && bundle8 != null) {
                    b(a30, readInt40, 19, new gz6(new pz6() {
                        @Override
                        public final Object j(yx6 yx6Var4, xw6 xw6Var2, int i5) {
                            byte b = r2;
                            Bundle bundle72 = bundle8;
                            switch (b) {
                                case 0:
                                    try {
                                        return yx6Var4.k(xw6Var2, po5.u(ft6.a(xw6Var2.c, bundle72)));
                                    } catch (RuntimeException e4) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return fne.b(e4);
                                    }
                                case 1:
                                    try {
                                        return yx6Var4.k(xw6Var2, po5.u(ft6.a(xw6Var2.c, bundle72)));
                                    } catch (RuntimeException e5) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return fne.b(e5);
                                    }
                                case 2:
                                    try {
                                        return yx6Var4.k(xw6Var2, po5.u(ft6.a(xw6Var2.c, bundle72)));
                                    } catch (RuntimeException e6) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return fne.b(e6);
                                    }
                                default:
                                    try {
                                        nt6 b2 = nt6.b(xw6Var2.c, bundle72);
                                        yx6Var4.t();
                                        yx6Var4.t.j0(b2);
                                        return fne.c(new gaa(0));
                                    } catch (RuntimeException e7) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return fne.b(e7);
                                    }
                            }
                        }
                    }, (byte) 1));
                    return true;
                }
                break;
            case 3034:
                gk5 a31 = ep6.a(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (a31 != null) {
                    c(a31, readInt41, new oz6(this) {
                        public final sz6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(xw6 xw6Var2, int i5) {
                            byte b = r2;
                            sz6 sz6Var = this.b;
                            switch (b) {
                                case 0:
                                    sz6Var.S(xw6Var2, i5, 11, sz6.X(new tq6((byte) 28)));
                                    return;
                                case 1:
                                    sz6Var.Q(xw6Var2, i5);
                                    return;
                                case 2:
                                    sz6Var.S(xw6Var2, i5, 3, sz6.X(new hz6((byte) 3)));
                                    return;
                                case 3:
                                    sz6Var.S(xw6Var2, i5, 12, sz6.X(new hz6((byte) 1)));
                                    return;
                                case 4:
                                    sz6Var.S(xw6Var2, i5, 1, sz6.X(new tq6((byte) 27)));
                                    return;
                                case 5:
                                    sz6Var.S(xw6Var2, i5, 9, sz6.X(new hz6((byte) 2)));
                                    return;
                                default:
                                    sz6Var.S(xw6Var2, i5, 7, sz6.X(new tq6((byte) 29)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                break;
            case 3035:
                gk5 a32 = ep6.a(parcel.readStrongBinder());
                parcel.readInt();
                if (a32 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        yx6 yx6Var4 = (yx6) this.a.get();
                        if (yx6Var4 != null && !yx6Var4.i()) {
                            final IBinder asBinder = a32.asBinder();
                            R(new Runnable(this) {
                                public final sz6 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void run() {
                                    byte b = r3;
                                    IBinder iBinder = asBinder;
                                    sz6 sz6Var = this.b;
                                    switch (b) {
                                        case 0:
                                            rx6 rx6Var = sz6Var.b;
                                            rx6Var.D0();
                                            xw6 M = rx6Var.M(iBinder);
                                            if (M != null) {
                                                rx6Var.k0(M);
                                                return;
                                            }
                                            return;
                                        default:
                                            rx6 rx6Var2 = sz6Var.b;
                                            xw6 M2 = rx6Var2.M(iBinder);
                                            if (M2 != null) {
                                                rx6Var2.F(M2);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3036:
                gk5 a33 = ep6.a(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (a33 != null) {
                    b(a33, readInt42, 4, X(new tq6((byte) 22)));
                    return true;
                }
                break;
            case 3037:
                gk5 a34 = ep6.a(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                int readInt44 = parcel.readInt();
                if (a34 != null && readInt44 >= 0) {
                    b(a34, readInt43, 10, new bm6(new az6(this, readInt44, (byte) 0), (byte) 6));
                    return true;
                }
                break;
            case 3038:
                gk5 a35 = ep6.a(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                long readLong3 = parcel.readLong();
                if (a35 != null) {
                    b(a35, readInt45, 5, X(new h40((byte) 1, readLong3)));
                    return true;
                }
                break;
            case 3039:
                gk5 a36 = ep6.a(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                int readInt47 = parcel.readInt();
                long readLong4 = parcel.readLong();
                if (a36 != null && readInt47 >= 0) {
                    b(a36, readInt46, 10, new bm6(new lf(this, readInt47, readLong4, (byte) 4), (byte) 6));
                    return true;
                }
                break;
            case 3040:
                gk5 a37 = ep6.a(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                if (a37 != null) {
                    c(a37, readInt48, new oz6(this) {
                        public final sz6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(xw6 xw6Var2, int i5) {
                            byte b = r2;
                            sz6 sz6Var = this.b;
                            switch (b) {
                                case 0:
                                    sz6Var.S(xw6Var2, i5, 11, sz6.X(new tq6((byte) 28)));
                                    return;
                                case 1:
                                    sz6Var.Q(xw6Var2, i5);
                                    return;
                                case 2:
                                    sz6Var.S(xw6Var2, i5, 3, sz6.X(new hz6((byte) 3)));
                                    return;
                                case 3:
                                    sz6Var.S(xw6Var2, i5, 12, sz6.X(new hz6((byte) 1)));
                                    return;
                                case 4:
                                    sz6Var.S(xw6Var2, i5, 1, sz6.X(new tq6((byte) 27)));
                                    return;
                                case 5:
                                    sz6Var.S(xw6Var2, i5, 9, sz6.X(new hz6((byte) 2)));
                                    return;
                                default:
                                    sz6Var.S(xw6Var2, i5, 7, sz6.X(new tq6((byte) 29)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                break;
            case 3041:
                gk5 a38 = ep6.a(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                if (a38 != null) {
                    c(a38, readInt49, new oz6(this) {
                        public final sz6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(xw6 xw6Var2, int i5) {
                            byte b = r2;
                            sz6 sz6Var = this.b;
                            switch (b) {
                                case 0:
                                    sz6Var.S(xw6Var2, i5, 11, sz6.X(new tq6((byte) 28)));
                                    return;
                                case 1:
                                    sz6Var.Q(xw6Var2, i5);
                                    return;
                                case 2:
                                    sz6Var.S(xw6Var2, i5, 3, sz6.X(new hz6((byte) 3)));
                                    return;
                                case 3:
                                    sz6Var.S(xw6Var2, i5, 12, sz6.X(new hz6((byte) 1)));
                                    return;
                                case 4:
                                    sz6Var.S(xw6Var2, i5, 1, sz6.X(new tq6((byte) 27)));
                                    return;
                                case 5:
                                    sz6Var.S(xw6Var2, i5, 9, sz6.X(new hz6((byte) 2)));
                                    return;
                                default:
                                    sz6Var.S(xw6Var2, i5, 7, sz6.X(new tq6((byte) 29)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                break;
            case 3042:
                gk5 a39 = ep6.a(parcel.readStrongBinder());
                int readInt50 = parcel.readInt();
                if (a39 != null) {
                    b(a39, readInt50, 6, X(new tq6((byte) 13)));
                    return true;
                }
                break;
            case 3043:
                gk5 a40 = ep6.a(parcel.readStrongBinder());
                int readInt51 = parcel.readInt();
                if (a40 != null) {
                    b(a40, readInt51, 8, X(new tq6((byte) 10)));
                    return true;
                }
                break;
            case 3044:
                gk5 a41 = ep6.a(parcel.readStrongBinder());
                int readInt52 = parcel.readInt();
                Surface surface = (Surface) voe.a(parcel, Surface.CREATOR);
                if (a41 != null) {
                    b(a41, readInt52, 27, X(new rm6(this, surface, (byte) 3)));
                    return true;
                }
                break;
            case 3045:
                gk5 a42 = ep6.a(parcel.readStrongBinder());
                if (a42 != null) {
                    long clearCallingIdentity4 = Binder.clearCallingIdentity();
                    try {
                        yx6 yx6Var5 = (yx6) this.a.get();
                        if (yx6Var5 != null && !yx6Var5.i()) {
                            final IBinder asBinder2 = a42.asBinder();
                            R(new Runnable(this) {
                                public final sz6 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void run() {
                                    byte b = r3;
                                    IBinder iBinder = asBinder2;
                                    sz6 sz6Var = this.b;
                                    switch (b) {
                                        case 0:
                                            rx6 rx6Var = sz6Var.b;
                                            rx6Var.D0();
                                            xw6 M = rx6Var.M(iBinder);
                                            if (M != null) {
                                                rx6Var.k0(M);
                                                return;
                                            }
                                            return;
                                        default:
                                            rx6 rx6Var2 = sz6Var.b;
                                            xw6 M2 = rx6Var2.M(iBinder);
                                            if (M2 != null) {
                                                rx6Var2.F(M2);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3046:
                gk5 a43 = ep6.a(parcel.readStrongBinder());
                int readInt53 = parcel.readInt();
                if (a43 != null) {
                    c(a43, readInt53, new oz6(this) {
                        public final sz6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(xw6 xw6Var2, int i5) {
                            byte b = r2;
                            sz6 sz6Var = this.b;
                            switch (b) {
                                case 0:
                                    sz6Var.S(xw6Var2, i5, 11, sz6.X(new tq6((byte) 28)));
                                    return;
                                case 1:
                                    sz6Var.Q(xw6Var2, i5);
                                    return;
                                case 2:
                                    sz6Var.S(xw6Var2, i5, 3, sz6.X(new hz6((byte) 3)));
                                    return;
                                case 3:
                                    sz6Var.S(xw6Var2, i5, 12, sz6.X(new hz6((byte) 1)));
                                    return;
                                case 4:
                                    sz6Var.S(xw6Var2, i5, 1, sz6.X(new tq6((byte) 27)));
                                    return;
                                case 5:
                                    sz6Var.S(xw6Var2, i5, 9, sz6.X(new hz6((byte) 2)));
                                    return;
                                default:
                                    sz6Var.S(xw6Var2, i5, 7, sz6.X(new tq6((byte) 29)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                break;
            case 3047:
                gk5 a44 = ep6.a(parcel.readStrongBinder());
                int readInt54 = parcel.readInt();
                if (a44 != null) {
                    c(a44, readInt54, new oz6(this) {
                        public final sz6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(xw6 xw6Var2, int i5) {
                            byte b = r2;
                            sz6 sz6Var = this.b;
                            switch (b) {
                                case 0:
                                    sz6Var.S(xw6Var2, i5, 11, sz6.X(new tq6((byte) 28)));
                                    return;
                                case 1:
                                    sz6Var.Q(xw6Var2, i5);
                                    return;
                                case 2:
                                    sz6Var.S(xw6Var2, i5, 3, sz6.X(new hz6((byte) 3)));
                                    return;
                                case 3:
                                    sz6Var.S(xw6Var2, i5, 12, sz6.X(new hz6((byte) 1)));
                                    return;
                                case 4:
                                    sz6Var.S(xw6Var2, i5, 1, sz6.X(new tq6((byte) 27)));
                                    return;
                                case 5:
                                    sz6Var.S(xw6Var2, i5, 9, sz6.X(new hz6((byte) 2)));
                                    return;
                                default:
                                    sz6Var.S(xw6Var2, i5, 7, sz6.X(new tq6((byte) 29)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                break;
            case 3048:
                gk5 a45 = ep6.a(parcel.readStrongBinder());
                int readInt55 = parcel.readInt();
                Bundle bundle9 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                if (a45 != null && bundle9 != null) {
                    try {
                        b(a45, readInt55, 29, X(new rm6(this, c2c.b(bundle9), (byte) 2)));
                        break;
                    } catch (RuntimeException e4) {
                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e4);
                        break;
                    }
                }
                break;
            case 3049:
                gk5 a46 = ep6.a(parcel.readStrongBinder());
                int readInt56 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle10 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                if (a46 != null && readString != null && bundle10 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        efd.f("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                        break;
                    } else {
                        try {
                            d(a46, readInt56, null, 40010, new gz6(new tq6((byte) 15, s29.a(bundle10), readString), (byte) 1));
                            break;
                        } catch (RuntimeException e5) {
                            efd.g("MediaSessionStub", "Ignoring malformed Bundle for Rating", e5);
                            break;
                        }
                    }
                }
                break;
            case 3050:
                gk5 a47 = ep6.a(parcel.readStrongBinder());
                int readInt57 = parcel.readInt();
                Bundle bundle11 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                if (a47 != null && bundle11 != null) {
                    try {
                        d(a47, readInt57, null, 40010, new gz6(new hz6(s29.a(bundle11)), (byte) 1));
                        break;
                    } catch (RuntimeException e6) {
                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for Rating", e6);
                        break;
                    }
                }
                break;
            case 3051:
                gk5 a48 = ep6.a(parcel.readStrongBinder());
                int readInt58 = parcel.readInt();
                int readInt59 = parcel.readInt();
                int readInt60 = parcel.readInt();
                if (a48 != null && readInt59 >= 0) {
                    b(a48, readInt58, 33, X(new ml0(readInt59, readInt60, (byte) 4)));
                    return true;
                }
                break;
            case 3052:
                gk5 a49 = ep6.a(parcel.readStrongBinder());
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                if (a49 != null) {
                    b(a49, readInt61, 34, X(new yd(readInt62, (byte) 7)));
                    return true;
                }
                break;
            case 3053:
                gk5 a50 = ep6.a(parcel.readStrongBinder());
                int readInt63 = parcel.readInt();
                int readInt64 = parcel.readInt();
                if (a50 != null) {
                    b(a50, readInt63, 34, X(new yd(readInt64, (byte) 6)));
                    return true;
                }
                break;
            case 3054:
                gk5 a51 = ep6.a(parcel.readStrongBinder());
                int readInt65 = parcel.readInt();
                final boolean z5 = parcel.readInt() != 0;
                final int readInt66 = parcel.readInt();
                if (a51 != null) {
                    b(a51, readInt65, 34, X(new ot2() {
                        @Override
                        public final void accept(Object obj) {
                            ((og8) obj).G(readInt66, z5);
                        }
                    }));
                    return true;
                }
                break;
            case 3055:
                gk5 a52 = ep6.a(parcel.readStrongBinder());
                int readInt67 = parcel.readInt();
                int readInt68 = parcel.readInt();
                final Bundle bundle12 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                if (a52 != null && bundle12 != null && readInt68 >= 0) {
                    b(a52, readInt67, 20, new gz6(new rm6(new pz6() {
                        @Override
                        public final Object j(yx6 yx6Var42, xw6 xw6Var2, int i5) {
                            byte b = r2;
                            Bundle bundle72 = bundle12;
                            switch (b) {
                                case 0:
                                    try {
                                        return yx6Var42.k(xw6Var2, po5.u(ft6.a(xw6Var2.c, bundle72)));
                                    } catch (RuntimeException e42) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e42);
                                        return fne.b(e42);
                                    }
                                case 1:
                                    try {
                                        return yx6Var42.k(xw6Var2, po5.u(ft6.a(xw6Var2.c, bundle72)));
                                    } catch (RuntimeException e52) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e52);
                                        return fne.b(e52);
                                    }
                                case 2:
                                    try {
                                        return yx6Var42.k(xw6Var2, po5.u(ft6.a(xw6Var2.c, bundle72)));
                                    } catch (RuntimeException e62) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e62);
                                        return fne.b(e62);
                                    }
                                default:
                                    try {
                                        nt6 b2 = nt6.b(xw6Var2.c, bundle72);
                                        yx6Var42.t();
                                        yx6Var42.t.j0(b2);
                                        return fne.c(new gaa(0));
                                    } catch (RuntimeException e7) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return fne.b(e7);
                                    }
                            }
                        }
                    }, new az6(this, readInt68, (byte) 2), (byte) 5), (byte) 1));
                    return true;
                }
                break;
            case 3056:
                gk5 a53 = ep6.a(parcel.readStrongBinder());
                int readInt69 = parcel.readInt();
                int readInt70 = parcel.readInt();
                int readInt71 = parcel.readInt();
                final IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (a53 != null && readStrongBinder4 != null && readInt70 >= 0 && readInt71 >= readInt70) {
                    b(a53, readInt69, 20, new gz6(new rm6(new pz6() {
                        @Override
                        public final Object j(yx6 yx6Var42, xw6 xw6Var2, int i5) {
                            byte b = r2;
                            int i6 = 0;
                            IBinder iBinder = readStrongBinder4;
                            switch (b) {
                                case 0:
                                    try {
                                        po5 a292 = f31.a(iBinder);
                                        mo5 p = po5.p();
                                        while (i6 < a292.size()) {
                                            Bundle bundle82 = (Bundle) a292.get(i6);
                                            bundle82.getClass();
                                            p.c(ft6.a(xw6Var2.c, bundle82));
                                            i6++;
                                        }
                                        return yx6Var42.k(xw6Var2, p.f());
                                    } catch (RuntimeException e42) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e42);
                                        return fne.b(e42);
                                    }
                                case 1:
                                    try {
                                        po5 a302 = f31.a(iBinder);
                                        mo5 p2 = po5.p();
                                        while (i6 < a302.size()) {
                                            Bundle bundle92 = (Bundle) a302.get(i6);
                                            bundle92.getClass();
                                            p2.c(ft6.a(xw6Var2.c, bundle92));
                                            i6++;
                                        }
                                        return yx6Var42.k(xw6Var2, p2.f());
                                    } catch (RuntimeException e52) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e52);
                                        return fne.b(e52);
                                    }
                                default:
                                    try {
                                        po5 a312 = f31.a(iBinder);
                                        mo5 p3 = po5.p();
                                        while (i6 < a312.size()) {
                                            Bundle bundle102 = (Bundle) a312.get(i6);
                                            bundle102.getClass();
                                            p3.c(ft6.a(xw6Var2.c, bundle102));
                                            i6++;
                                        }
                                        return yx6Var42.k(xw6Var2, p3.f());
                                    } catch (RuntimeException e62) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e62);
                                        return fne.b(e62);
                                    }
                            }
                        }
                    }, new xy6(this, readInt70, readInt71), (byte) 5), (byte) 1));
                    return true;
                }
                break;
            case 3057:
                gk5 a54 = ep6.a(parcel.readStrongBinder());
                int readInt72 = parcel.readInt();
                Bundle bundle13 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                boolean z6 = parcel.readInt() != 0;
                if (a54 != null && bundle13 != null) {
                    try {
                        b(a54, readInt72, 35, X(new t41((byte) 10, oz.a(bundle13), z6)));
                        break;
                    } catch (RuntimeException e7) {
                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e7);
                        break;
                    }
                }
                break;
            case 3058:
                gk5 a55 = ep6.a(parcel.readStrongBinder());
                int readInt73 = parcel.readInt();
                if (a55 != null) {
                    b(a55, readInt73, 24, X(new tq6((byte) 9)));
                    return true;
                }
                break;
            case 3059:
                gk5 a56 = ep6.a(parcel.readStrongBinder());
                int readInt74 = parcel.readInt();
                if (a56 != null) {
                    b(a56, readInt74, 24, X(new tq6((byte) 20)));
                    return true;
                }
                break;
            case 3060:
                gk5 a57 = ep6.a(parcel.readStrongBinder());
                int readInt75 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle14 = (Bundle) voe.a(parcel, creator2);
                Bundle bundle15 = (Bundle) voe.a(parcel, creator2);
                if (parcel.readInt() != 0) {
                    gk5Var = a57;
                    bundle = bundle14;
                    z = true;
                } else {
                    gk5Var = a57;
                    bundle = bundle14;
                    z = false;
                }
                P(gk5Var, readInt75, bundle, bundle15, z);
                return true;
            case 3061:
                gk5 a58 = ep6.a(parcel.readStrongBinder());
                int readInt76 = parcel.readInt();
                Surface surface2 = (Surface) voe.a(parcel, Surface.CREATOR);
                int readInt77 = parcel.readInt();
                int readInt78 = parcel.readInt();
                if (a58 != null) {
                    b(a58, readInt76, 27, X(new ez0(this, surface2, readInt77, readInt78)));
                    return true;
                }
                break;
            case 3062:
                gk5 a59 = ep6.a(parcel.readStrongBinder());
                int readInt79 = parcel.readInt();
                int readInt80 = parcel.readInt();
                int readInt81 = parcel.readInt();
                if (a59 != null) {
                    b(a59, readInt79, 27, X(new xy6(this, readInt80, readInt81)));
                    return true;
                }
                break;
            default:
                ht6 ht6Var = null;
                switch (i) {
                    case 4001:
                        gk5 a60 = ep6.a(parcel.readStrongBinder());
                        int readInt82 = parcel.readInt();
                        Bundle bundle16 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                        if (a60 != null) {
                            if (bundle16 != null) {
                                try {
                                    ht6Var = ht6.a(bundle16);
                                } catch (RuntimeException e8) {
                                    efd.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e8);
                                    break;
                                }
                            }
                            d(a60, readInt82, null, 50000, new gz6(new tq6(ht6Var, (byte) 21), (byte) 0));
                            break;
                        }
                        break;
                    case 4002:
                        gk5 a61 = ep6.a(parcel.readStrongBinder());
                        int readInt83 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (a61 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                efd.f("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            d(a61, readInt83, null, 50004, new gz6(new tq6(readString2, (byte) 14), (byte) 0));
                            return true;
                        }
                        break;
                    case 4003:
                        gk5 a62 = ep6.a(parcel.readStrongBinder());
                        int readInt84 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt85 = parcel.readInt();
                        int readInt86 = parcel.readInt();
                        Bundle bundle17 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                        if (a62 != null) {
                            if (TextUtils.isEmpty(readString3)) {
                                efd.f("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                                break;
                            } else if (readInt85 < 0) {
                                efd.f("MediaSessionStub", "getChildren(): Ignoring negative page");
                                break;
                            } else if (readInt86 < 1) {
                                efd.f("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                                break;
                            } else {
                                if (bundle17 != null) {
                                    try {
                                        ht6Var = ht6.a(bundle17);
                                    } catch (RuntimeException e9) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e9);
                                        break;
                                    }
                                }
                                d(a62, readInt84, null, 50003, new gz6(new tq6(readString3, readInt85, readInt86, ht6Var, (byte) 8), (byte) 0));
                                break;
                            }
                        }
                        break;
                    case 4004:
                        gk5 a63 = ep6.a(parcel.readStrongBinder());
                        int readInt87 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle18 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                        if (a63 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                efd.f("MediaSessionStub", "search(): Ignoring empty query");
                                break;
                            } else {
                                if (bundle18 != null) {
                                    try {
                                        ht6Var = ht6.a(bundle18);
                                    } catch (RuntimeException e10) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e10);
                                        break;
                                    }
                                }
                                d(a63, readInt87, null, 50005, new gz6(new tq6((byte) 26, ht6Var, readString4), (byte) 0));
                                break;
                            }
                        }
                        break;
                    case 4005:
                        gk5 a64 = ep6.a(parcel.readStrongBinder());
                        int readInt88 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt89 = parcel.readInt();
                        int readInt90 = parcel.readInt();
                        Bundle bundle19 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                        if (a64 != null) {
                            if (TextUtils.isEmpty(readString5)) {
                                efd.f("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                                break;
                            } else if (readInt89 < 0) {
                                efd.f("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                                break;
                            } else if (readInt90 < 1) {
                                efd.f("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                                break;
                            } else {
                                if (bundle19 != null) {
                                    try {
                                        ht6Var = ht6.a(bundle19);
                                    } catch (RuntimeException e11) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e11);
                                        break;
                                    }
                                }
                                d(a64, readInt88, null, 50006, new gz6(new tq6(readString5, readInt89, readInt90, ht6Var, (byte) 19), (byte) 0));
                                break;
                            }
                        }
                        break;
                    case 4006:
                        gk5 a65 = ep6.a(parcel.readStrongBinder());
                        int readInt91 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle20 = (Bundle) voe.a(parcel, Bundle.CREATOR);
                        if (a65 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                efd.f("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                                break;
                            } else {
                                if (bundle20 != null) {
                                    try {
                                        ht6Var = ht6.a(bundle20);
                                    } catch (RuntimeException e12) {
                                        efd.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e12);
                                        break;
                                    }
                                }
                                d(a65, readInt91, null, 50001, new gz6(new tq6((byte) 24, ht6Var, readString6), (byte) 0));
                                break;
                            }
                        }
                        break;
                    case 4007:
                        gk5 a66 = ep6.a(parcel.readStrongBinder());
                        int readInt92 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (a66 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                efd.f("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            d(a66, readInt92, null, 50002, new gz6(new tq6(readString7, (byte) 7), (byte) 0));
                            return true;
                        }
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
        }
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
