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
public final class ox6 extends Binder implements IInterface {
    public final WeakReference a;
    public final mv6 b;
    public final CopyOnWriteArraySet c;
    public v59 d;
    public b69 e;
    public int f;
    public cm5 i;
    public cm5 j;
    public int k;
    public aob l;
    public nx6 m;
    public mx6 n;

    public ox6(tv6 tv6Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.a = new WeakReference(tv6Var);
        this.b = new mv6(tv6Var);
        this.c = new CopyOnWriteArraySet();
        v59 v59Var = v59.r;
        this.d = v59Var;
        this.e = b69.h;
        this.i = v59Var;
        this.j = v59Var;
        this.k = 0;
    }

    public static void W(tv6 tv6Var, su6 su6Var, int i, o6a o6aVar) {
        try {
            ru6 ru6Var = su6Var.e;
            ru6Var.getClass();
            ru6Var.g(i, o6aVar);
            tv6Var.c.a(true, true);
        } catch (RemoteException e) {
            lad.g("MediaSessionStub", "Failed to send result to controller " + su6Var, e);
        }
    }

    public static im6 X(us2 us2Var) {
        return new im6(new im6(us2Var, (byte) 5), (byte) 4);
    }

    public static t56 e(tv6 tv6Var, su6 su6Var, int i, lx6 lx6Var, us2 us2Var) {
        if (tv6Var.i()) {
            return am5.b;
        }
        t56 t56Var = (t56) lx6Var.p(tv6Var, su6Var, i);
        ?? obj = new Object();
        t56Var.b(new jw6(tv6Var, obj, us2Var, t56Var, (byte) 3), vn3.a);
        return obj;
    }

    public final void P(ei5 ei5Var, int i, Bundle bundle, Bundle bundle2, boolean z) {
        p5a p5aVar;
        Bundle o = g8c.o(bundle2);
        if (ei5Var != null && bundle != null && o != null) {
            try {
                int i2 = bundle.getInt(p5a.h, 0);
                if (i2 != 0) {
                    p5aVar = new p5a(i2);
                } else {
                    String string = bundle.getString(p5a.i);
                    string.getClass();
                    Bundle o2 = g8c.o(bundle.getBundle(p5a.j));
                    if (o2 == null) {
                        o2 = Bundle.EMPTY;
                    }
                    p5aVar = new p5a(string, o2);
                }
                if (hm2.i(p5aVar.b)) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        tv6 tv6Var = (tv6) this.a.get();
                        if (tv6Var != null && !tv6Var.i()) {
                            R(new kf(this, ei5Var.asBinder(), p5aVar, tv6Var, i, ei5Var, (byte) 6));
                        }
                        return;
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                d(ei5Var, i, p5aVar, 0, new cx6(new w26(z, p5aVar, o), (byte) 1));
            } catch (RuntimeException e) {
                lad.g("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
            }
        }
    }

    public final void Q(su6 su6Var, int i) {
        S(su6Var, i, 1, X(new dx6(this, su6Var, (byte) 1)));
    }

    public final void R(Runnable runnable) {
        tv6 tv6Var = (tv6) this.a.get();
        if (tv6Var != null) {
            g8c.X(tv6Var.l, runnable);
        }
    }

    public final void S(final su6 su6Var, final int i, int i2, final lx6 lx6Var) {
        boolean z;
        WeakReference weakReference = this.a;
        tv6 tv6Var = (tv6) weakReference.get();
        if (tv6Var != null) {
            if (Looper.myLooper() == tv6Var.l.getLooper()) {
                z = true;
            } else {
                z = false;
            }
            gre.p(z);
        }
        final tv6 tv6Var2 = (tv6) weakReference.get();
        if (tv6Var2 != null && !tv6Var2.i()) {
            mv6 mv6Var = this.b;
            if (mv6Var.V(su6Var)) {
                if (!mv6Var.X(su6Var, i2)) {
                    W(tv6Var2, su6Var, i, new o6a(-4));
                    return;
                }
                cff cffVar = tv6Var2.e;
                tv6Var2.q(su6Var);
                cffVar.getClass();
                if (i2 == 27) {
                    lx6Var.p(tv6Var2, su6Var, i);
                    mv6Var.h(su6Var, i2, new Object());
                    return;
                }
                mv6Var.h(su6Var, i2, new as2() {
                    @Override
                    public final t56 run() {
                        return (t56) lx6.this.p(tv6Var2, su6Var, i);
                    }
                });
            }
        }
    }

    public final void T() {
        this.a.clear();
        mv6 mv6Var = this.b;
        ((WeakReference) mv6Var.d).clear();
        mm5 K = mv6Var.K();
        int size = K.size();
        int i = 0;
        while (i < size) {
            Object obj = K.get(i);
            i++;
            su6 su6Var = (su6) obj;
            mv6Var.e0(su6Var);
            ru6 ru6Var = su6Var.e;
            if (ru6Var != null) {
                ru6Var.e();
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.c;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ru6 ru6Var2 = ((su6) it.next()).e;
            if (ru6Var2 != null) {
                ru6Var2.e();
            }
        }
        copyOnWriteArraySet.clear();
    }

    public final void U(nc8 nc8Var, HashMap hashMap) {
        String str;
        Object obj = nc8Var.d;
        if (obj != null && !hashMap.containsKey(obj) && (str = (String) this.j.get(obj)) != null) {
            hashMap.put(obj, str);
        }
    }

    public final void V(nc8 nc8Var, HashMap hashMap) {
        String str;
        Object obj = nc8Var.a;
        if (obj != null && !hashMap.containsKey(obj) && (str = (String) this.i.get(obj)) != null) {
            hashMap.put(obj, str);
        }
    }

    public final void Y(ei5 ei5Var, int i, Bundle bundle, boolean z) {
        if (ei5Var != null && bundle != null) {
            b(ei5Var, i, 31, new cx6(new h45(new l41((byte) 9, bundle, z), new yw6((byte) 18), (byte) 29), (byte) 1));
        }
    }

    public final void Z(ei5 ei5Var, int i, IBinder iBinder, boolean z) {
        if (ei5Var != null && iBinder != null) {
            b(ei5Var, i, 20, new cx6(new h45(new l41((byte) 11, iBinder, z), new yw6((byte) 18), (byte) 29), (byte) 1));
        }
    }

    public final nc8 a(nc8 nc8Var) {
        Object obj;
        Object obj2 = nc8Var.a;
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
        int i = nc8Var.b;
        Object obj3 = obj;
        br6 br6Var = nc8Var.c;
        Object obj4 = nc8Var.d;
        if (obj4 != null) {
            Object obj5 = (String) this.j.get(obj4);
            if (obj5 == null) {
                obj5 = obj4;
            }
            obj3 = obj5;
        }
        return new nc8(obj2, i, br6Var, obj3, nc8Var.e, nc8Var.f, nc8Var.g, nc8Var.h, nc8Var.i);
    }

    public final wc8 a0(wc8 wc8Var) {
        nx6 nx6Var;
        byb bybVar;
        boolean z;
        aob aobVar = wc8Var.j;
        nc8 nc8Var = wc8Var.d;
        nc8 nc8Var2 = wc8Var.e;
        l6a l6aVar = wc8Var.c;
        if (aobVar.p()) {
            return wc8Var;
        }
        if (!Objects.equals(this.l, aobVar) || (nx6Var = this.m) == null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            znb znbVar = new znb();
            for (int i = 0; i < aobVar.o(); i++) {
                aobVar.n(i, znbVar);
                Object obj = znbVar.a;
                if (obj != null && !hashMap.containsKey(obj)) {
                    String str = (String) this.i.get(znbVar.a);
                    Object obj2 = znbVar.a;
                    if (str == null) {
                        int i2 = this.k;
                        this.k = i2 + 1;
                        String str2 = g8c.a;
                        str = Integer.toString(i2, 36);
                    }
                    hashMap.put(obj2, str);
                }
            }
            xnb xnbVar = new xnb();
            for (int i3 = 0; i3 < aobVar.h(); i3++) {
                aobVar.f(i3, xnbVar, true);
                Object obj3 = xnbVar.b;
                if (obj3 != null && !hashMap2.containsKey(obj3)) {
                    String str3 = (String) this.j.get(xnbVar.b);
                    Object obj4 = xnbVar.b;
                    if (str3 == null) {
                        int i4 = this.k;
                        this.k = i4 + 1;
                        String str4 = g8c.a;
                        str3 = Integer.toString(i4, 36);
                    }
                    hashMap2.put(obj4, str3);
                }
                Object obj5 = xnbVar.a;
                if (obj5 != null && !hashMap2.containsKey(obj5)) {
                    String str5 = (String) this.j.get(xnbVar.a);
                    Object obj6 = xnbVar.a;
                    if (str5 == null) {
                        int i5 = this.k;
                        this.k = i5 + 1;
                        String str6 = g8c.a;
                        str5 = Integer.toString(i5, 36);
                    }
                    hashMap2.put(obj6, str5);
                }
            }
            V(l6aVar.a, hashMap);
            V(nc8Var, hashMap);
            V(nc8Var2, hashMap);
            U(l6aVar.a, hashMap2);
            U(nc8Var, hashMap2);
            U(nc8Var2, hashMap2);
            this.i = cm5.g(hashMap);
            this.j = cm5.g(hashMap2);
            this.l = aobVar;
            nx6Var = new nx6(aobVar, this.i, this.j);
            this.m = nx6Var;
        }
        l6a l6aVar2 = new l6a(a(l6aVar.a), l6aVar.b, l6aVar.c, l6aVar.d, l6aVar.e, l6aVar.f, l6aVar.g, l6aVar.h, l6aVar.i, l6aVar.j);
        nc8 a = a(nc8Var);
        nc8 a2 = a(nc8Var2);
        j54 j54Var = wc8Var.a;
        int i6 = wc8Var.b;
        int i7 = wc8Var.f;
        zb8 zb8Var = wc8Var.g;
        int i8 = wc8Var.h;
        boolean z2 = wc8Var.i;
        int i9 = wc8Var.k;
        icc iccVar = wc8Var.l;
        jr6 jr6Var = wc8Var.m;
        float f = wc8Var.n;
        float f2 = wc8Var.o;
        int i10 = wc8Var.p;
        nz nzVar = wc8Var.q;
        v33 v33Var = wc8Var.r;
        de3 de3Var = wc8Var.s;
        int i11 = wc8Var.t;
        boolean z3 = wc8Var.u;
        boolean z4 = wc8Var.v;
        int i12 = wc8Var.w;
        boolean z5 = wc8Var.x;
        boolean z6 = wc8Var.y;
        int i13 = wc8Var.z;
        int i14 = wc8Var.A;
        jr6 jr6Var2 = wc8Var.B;
        long j = wc8Var.C;
        long j2 = wc8Var.D;
        long j3 = wc8Var.E;
        eyb eybVar = wc8Var.F;
        byb bybVar2 = wc8Var.G;
        if (!nx6Var.p()) {
            bybVar = bybVar2;
            if (l6aVar2.a.b >= nx6Var.e.o()) {
                z = false;
                gre.p(z);
                return new wc8(j54Var, i6, l6aVar2, a, a2, i7, zb8Var, i8, z2, iccVar, nx6Var, i9, jr6Var, f, f2, nzVar, i10, v33Var, de3Var, i11, z3, z4, i12, i13, i14, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
            }
        } else {
            bybVar = bybVar2;
        }
        z = true;
        gre.p(z);
        return new wc8(j54Var, i6, l6aVar2, a, a2, i7, zb8Var, i8, z2, iccVar, nx6Var, i9, jr6Var, f, f2, nzVar, i10, v33Var, de3Var, i11, z3, z4, i12, i13, i14, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
    }

    public final void b(ei5 ei5Var, int i, int i2, lx6 lx6Var) {
        c(ei5Var, i, new q54(this, i2, lx6Var));
    }

    public final wc8 b0(wc8 wc8Var) {
        mm5 mm5Var = wc8Var.F.a;
        ?? kpVar = new kp(4);
        kp kpVar2 = new kp(4);
        for (int i = 0; i < mm5Var.size(); i++) {
            sxb sxbVar = ((dyb) mm5Var.get(i)).b;
            String str = sxbVar.b;
            String str2 = (String) this.d.get(sxbVar);
            if (str2 == null) {
                StringBuilder sb = new StringBuilder();
                int i2 = this.f;
                this.f = i2 + 1;
                String str3 = g8c.a;
                sb.append(Integer.toString(i2, 36));
                sb.append("-");
                sb.append(str);
                str2 = sb.toString();
            }
            kpVar.D(sxbVar, str2);
            kpVar2.w(str, str2);
        }
        this.d = kpVar.C();
        this.e = kpVar2.c(false);
        jm5 p = mm5.p();
        for (int i3 = 0; i3 < mm5Var.size(); i3++) {
            dyb dybVar = (dyb) mm5Var.get(i3);
            p.c(new dyb(c0(dybVar.b), dybVar.c, dybVar.d, dybVar.e));
        }
        wc8 a = wc8Var.a(new eyb(p.f()));
        byb bybVar = a.G;
        if (bybVar.H.isEmpty()) {
            return a;
        }
        ayb c = bybVar.a().c();
        v5c n = bybVar.H.values().n();
        while (n.hasNext()) {
            yxb yxbVar = (yxb) n.next();
            c.a(new yxb(c0(yxbVar.a), yxbVar.b));
        }
        return a.d(c.b());
    }

    public final void c(ei5 ei5Var, int i, kx6 kx6Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            tv6 tv6Var = (tv6) this.a.get();
            if (tv6Var != null && !tv6Var.i()) {
                R(new q76(this, ei5Var.asBinder(), kx6Var, i, (byte) 4));
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final sxb c0(sxb sxbVar) {
        String str;
        String str2 = (String) this.d.get(sxbVar);
        if (str2 == null) {
            str2 = sxbVar.b;
        }
        int i = 0;
        while (true) {
            int i2 = sxbVar.a;
            fm4[] fm4VarArr = sxbVar.d;
            if (i < i2) {
                if (fm4VarArr[i].n != null) {
                    fm4[] fm4VarArr2 = new fm4[i2];
                    for (int i3 = 0; i3 < sxbVar.a; i3++) {
                        fm4 fm4Var = fm4VarArr[i3];
                        String str3 = fm4Var.n;
                        if (str3 != null) {
                            str = (String) this.e.get(str3);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            em4 a = fm4Var.a();
                            a.m = str;
                            fm4VarArr2[i3] = new fm4(a);
                        } else {
                            fm4VarArr2[i3] = fm4Var;
                        }
                    }
                    return new sxb(str2, fm4VarArr2);
                }
                i++;
            } else {
                return new sxb(str2, fm4VarArr);
            }
        }
    }

    public final void d(ei5 ei5Var, final int i, final p5a p5aVar, final int i2, final lx6 lx6Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final tv6 tv6Var = (tv6) this.a.get();
            if (tv6Var != null && !tv6Var.i()) {
                final IBinder asBinder = ei5Var.asBinder();
                R(new Runnable() {
                    @Override
                    public final void run() {
                        mv6 mv6Var = ox6.this.b;
                        su6 L = mv6Var.L(asBinder);
                        if (L == null || !mv6Var.V(L)) {
                            return;
                        }
                        p5a p5aVar2 = p5aVar;
                        tv6 tv6Var2 = tv6Var;
                        int i3 = i;
                        if (p5aVar2 != null) {
                            if (!mv6Var.Z(L, p5aVar2)) {
                                ox6.W(tv6Var2, L, i3, new o6a(-4));
                                return;
                            }
                        } else if (!mv6Var.Y(L, i2)) {
                            ox6.W(tv6Var2, L, i3, new o6a(-4));
                            return;
                        }
                        lx6Var.p(tv6Var2, L, i3);
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final int f(su6 su6Var, ad8 ad8Var, int i) {
        if (ad8Var.m0(17)) {
            mv6 mv6Var = this.b;
            if (!mv6Var.X(su6Var, 17) && mv6Var.X(su6Var, 16)) {
                return ad8Var.l0() + i;
            }
        }
        return i;
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ei5 ei5Var;
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
                ei5 a = an6.a(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (a != null && readFloat >= 0.0f && readFloat <= 1.0f) {
                    b(a, readInt, 24, X(new n54(readFloat, (byte) 2)));
                    break;
                }
                break;
            case 3003:
                ei5 a2 = an6.a(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                if (a2 != null && readInt3 >= 0) {
                    b(a2, readInt2, 25, X(new qf(readInt3, (byte) 8)));
                    return true;
                }
                break;
            case 3004:
                ei5 a3 = an6.a(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                if (a3 != null) {
                    b(a3, readInt4, 26, X(new yw6((byte) 0)));
                    return true;
                }
                break;
            case 3005:
                ei5 a4 = an6.a(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                if (a4 != null) {
                    b(a4, readInt5, 26, X(new yw6((byte) 4)));
                    return true;
                }
                break;
            case 3006:
                ei5 a5 = an6.a(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                boolean z2 = parcel.readInt() != 0;
                if (a5 != null) {
                    b(a5, readInt6, 26, X(new p54((byte) 4, z2)));
                    return true;
                }
                break;
            case 3007:
                Y(an6.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) ake.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                ei5 a6 = an6.a(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                Bundle bundle2 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                long readLong = parcel.readLong();
                if (a6 != null && bundle2 != null) {
                    b(a6, readInt7, 31, new cx6(new h45(new rz1(bundle2, readLong, (byte) 9), new yw6((byte) 18), (byte) 29), (byte) 1));
                    return true;
                }
                break;
            case 3009:
                Y(an6.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) ake.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                Z(an6.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                Z(an6.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                ei5 a7 = an6.a(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int readInt9 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (a7 != null && readStrongBinder != null && (readInt9 == -1 || readInt9 >= 0)) {
                    b(a7, readInt8, 20, new cx6(new h45(new gf(readStrongBinder, readInt9, readLong2, (byte) 5), new yw6((byte) 18), (byte) 29), (byte) 1));
                    return true;
                }
                break;
            case 3013:
                ei5 a8 = an6.a(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                boolean z3 = parcel.readInt() != 0;
                if (a8 != null) {
                    b(a8, readInt10, 1, X(new p54((byte) 3, z3)));
                    return true;
                }
                break;
            case 3014:
                ei5 a9 = an6.a(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                Bundle bundle3 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                if (a9 != null && bundle3 != null) {
                    try {
                        o6a a10 = o6a.a(bundle3);
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            tv6 tv6Var = (tv6) this.a.get();
                            if (tv6Var != null && !tv6Var.i()) {
                                R(new q76(this, a9.asBinder(), readInt11, a10, (byte) 3));
                            }
                            break;
                        } finally {
                        }
                    } catch (RuntimeException e) {
                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
                        break;
                    }
                }
                break;
            case 3015:
                ei5 a11 = an6.a(parcel.readStrongBinder());
                parcel.readInt();
                Bundle bundle4 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                WeakReference weakReference = this.a;
                tv6 tv6Var2 = (tv6) weakReference.get();
                if (a11 != null && bundle4 != null && tv6Var2 != null) {
                    try {
                        Context context = tv6Var2.f;
                        cs2 a12 = cs2.a(bundle4);
                        int callingUid = Binder.getCallingUid();
                        int callingPid = Binder.getCallingPid();
                        String str = a12.c;
                        String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                        if (packagesForUid != null && packagesForUid.length != 0) {
                            for (String str2 : packagesForUid) {
                                if (!str2.equals(str)) {
                                }
                            }
                            lad.f("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                            wte.a(a11);
                            break;
                        }
                        long clearCallingIdentity2 = Binder.clearCallingIdentity();
                        if (callingPid == 0) {
                            callingPid = a12.d;
                        }
                        try {
                            mw6 mw6Var = new mw6(str, callingPid, callingUid);
                            boolean D = lj9.z(context).D(mw6Var);
                            int i3 = a12.a;
                            int i4 = a12.b;
                            su6 su6Var = new su6(mw6Var, i3, i4, D, new hx6(a11, i4), a12.e);
                            tv6 tv6Var3 = (tv6) weakReference.get();
                            if (tv6Var3 != null && !tv6Var3.i()) {
                                this.c.add(su6Var);
                                g8c.X(tv6Var3.l, new jw6(this, tv6Var3, su6Var, a11, (byte) 2));
                            } else {
                                wte.a(a11);
                            }
                            break;
                        } finally {
                        }
                    } catch (RuntimeException e2) {
                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e2);
                        break;
                    }
                } else {
                    wte.a(a11);
                    break;
                }
                break;
            case 3016:
                ei5 a13 = an6.a(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                P(a13, readInt12, (Bundle) ake.a(parcel, creator), (Bundle) ake.a(parcel, creator), false);
                return true;
            case 3017:
                ei5 a14 = an6.a(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                if (a14 != null && (readInt14 == 2 || readInt14 == 0 || readInt14 == 1)) {
                    b(a14, readInt13, 15, X(new qf(readInt14, (byte) 7)));
                    return true;
                }
                break;
            case 3018:
                ei5 a15 = an6.a(parcel.readStrongBinder());
                int readInt15 = parcel.readInt();
                boolean z4 = parcel.readInt() != 0;
                if (a15 != null) {
                    b(a15, readInt15, 14, X(new p54((byte) 5, z4)));
                    return true;
                }
                break;
            case 3019:
                ei5 a16 = an6.a(parcel.readStrongBinder());
                int readInt16 = parcel.readInt();
                int readInt17 = parcel.readInt();
                if (a16 != null && readInt17 >= 0) {
                    b(a16, readInt16, 20, new im6(new vw6(this, readInt17, (byte) 4), (byte) 4));
                    return true;
                }
                break;
            case 3020:
                ei5 a17 = an6.a(parcel.readStrongBinder());
                int readInt18 = parcel.readInt();
                int readInt19 = parcel.readInt();
                int readInt20 = parcel.readInt();
                if (a17 != null && readInt19 >= 0 && readInt20 >= readInt19) {
                    b(a17, readInt18, 20, new im6(new sw6(this, readInt19, readInt20), (byte) 4));
                    return true;
                }
                break;
            case 3021:
                ei5 a18 = an6.a(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (a18 != null) {
                    b(a18, readInt21, 20, X(new yw6((byte) 13)));
                    return true;
                }
                break;
            case 3022:
                ei5 a19 = an6.a(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                int readInt23 = parcel.readInt();
                int readInt24 = parcel.readInt();
                if (a19 != null && readInt23 >= 0 && readInt24 >= 0) {
                    b(a19, readInt22, 20, X(new ll0(readInt23, readInt24, (byte) 5)));
                    return true;
                }
                break;
            case 3023:
                ei5 a20 = an6.a(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                final int readInt26 = parcel.readInt();
                final int readInt27 = parcel.readInt();
                final int readInt28 = parcel.readInt();
                if (a20 != null && readInt26 >= 0 && readInt27 >= readInt26 && readInt28 >= 0) {
                    b(a20, readInt25, 20, X(new us2() {
                        @Override
                        public final void accept(Object obj) {
                            ((ad8) obj).t0(readInt26, readInt27, readInt28);
                        }
                    }));
                    return true;
                }
                break;
            case 3024:
                ei5 a21 = an6.a(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                if (a21 != null) {
                    c(a21, readInt29, new kx6(this) {
                        public final ox6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(su6 su6Var2, int i5) {
                            byte b = r2;
                            ox6 ox6Var = this.b;
                            switch (b) {
                                case 0:
                                    ox6Var.S(su6Var2, i5, 11, ox6.X(new yw6((byte) 16)));
                                    return;
                                case 1:
                                    ox6Var.Q(su6Var2, i5);
                                    return;
                                case 2:
                                    ox6Var.S(su6Var2, i5, 3, ox6.X(new yw6((byte) 21)));
                                    return;
                                case 3:
                                    ox6Var.S(su6Var2, i5, 12, ox6.X(new yw6((byte) 19)));
                                    return;
                                case 4:
                                    ox6Var.S(su6Var2, i5, 1, ox6.X(new yw6((byte) 15)));
                                    return;
                                case 5:
                                    ox6Var.S(su6Var2, i5, 9, ox6.X(new yw6((byte) 20)));
                                    return;
                                default:
                                    ox6Var.S(su6Var2, i5, 7, ox6.X(new yw6((byte) 17)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                break;
            case 3025:
                ei5 a22 = an6.a(parcel.readStrongBinder());
                int readInt30 = parcel.readInt();
                if (a22 != null) {
                    c(a22, readInt30, new kx6(this) {
                        public final ox6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(su6 su6Var2, int i5) {
                            byte b = r2;
                            ox6 ox6Var = this.b;
                            switch (b) {
                                case 0:
                                    ox6Var.S(su6Var2, i5, 11, ox6.X(new yw6((byte) 16)));
                                    return;
                                case 1:
                                    ox6Var.Q(su6Var2, i5);
                                    return;
                                case 2:
                                    ox6Var.S(su6Var2, i5, 3, ox6.X(new yw6((byte) 21)));
                                    return;
                                case 3:
                                    ox6Var.S(su6Var2, i5, 12, ox6.X(new yw6((byte) 19)));
                                    return;
                                case 4:
                                    ox6Var.S(su6Var2, i5, 1, ox6.X(new yw6((byte) 15)));
                                    return;
                                case 5:
                                    ox6Var.S(su6Var2, i5, 9, ox6.X(new yw6((byte) 20)));
                                    return;
                                default:
                                    ox6Var.S(su6Var2, i5, 7, ox6.X(new yw6((byte) 17)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                break;
            case 3026:
                ei5 a23 = an6.a(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                if (a23 != null) {
                    b(a23, readInt31, 2, X(new yw6((byte) 11)));
                    return true;
                }
                break;
            case 3027:
                ei5 a24 = an6.a(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                Bundle bundle5 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                if (a24 != null && bundle5 != null) {
                    try {
                        b(a24, readInt32, 13, X(new im6(new zb8(bundle5.getFloat(zb8.e, 1.0f), bundle5.getFloat(zb8.f, 1.0f)), (byte) 3)));
                        break;
                    } catch (RuntimeException e3) {
                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e3);
                        break;
                    }
                }
                break;
            case 3028:
                ei5 a25 = an6.a(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                float readFloat2 = parcel.readFloat();
                if (a25 != null && readFloat2 > 0.0f) {
                    b(a25, readInt33, 13, X(new n54(readFloat2, (byte) 1)));
                    return true;
                }
                break;
            case 3029:
                ei5 a26 = an6.a(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                final Bundle bundle6 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                if (a26 != null && bundle6 != null) {
                    b(a26, readInt34, 20, new cx6(new dx6(new lx6() {
                        @Override
                        public final Object p(tv6 tv6Var4, su6 su6Var2, int i5) {
                            byte b = r2;
                            Bundle bundle7 = bundle6;
                            switch (b) {
                                case 0:
                                    try {
                                        return tv6Var4.k(su6Var2, mm5.u(br6.a(su6Var2.c, bundle7)));
                                    } catch (RuntimeException e4) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return jie.b(e4);
                                    }
                                case 1:
                                    try {
                                        return tv6Var4.k(su6Var2, mm5.u(br6.a(su6Var2.c, bundle7)));
                                    } catch (RuntimeException e5) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return jie.b(e5);
                                    }
                                case 2:
                                    try {
                                        return tv6Var4.k(su6Var2, mm5.u(br6.a(su6Var2.c, bundle7)));
                                    } catch (RuntimeException e6) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return jie.b(e6);
                                    }
                                default:
                                    try {
                                        jr6 b2 = jr6.b(su6Var2.c, bundle7);
                                        tv6Var4.t();
                                        tv6Var4.t.j0(b2);
                                        return jie.c(new o6a(0));
                                    } catch (RuntimeException e7) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return jie.b(e7);
                                    }
                            }
                        }
                    }, new yw6((byte) 6), (byte) 0), (byte) 1));
                    return true;
                }
                break;
            case 3030:
                ei5 a27 = an6.a(parcel.readStrongBinder());
                int readInt35 = parcel.readInt();
                int readInt36 = parcel.readInt();
                final Bundle bundle7 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                if (a27 != null && bundle7 != null && readInt36 >= 0) {
                    b(a27, readInt35, 20, new cx6(new dx6(new lx6() {
                        @Override
                        public final Object p(tv6 tv6Var4, su6 su6Var2, int i5) {
                            byte b = r2;
                            Bundle bundle72 = bundle7;
                            switch (b) {
                                case 0:
                                    try {
                                        return tv6Var4.k(su6Var2, mm5.u(br6.a(su6Var2.c, bundle72)));
                                    } catch (RuntimeException e4) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return jie.b(e4);
                                    }
                                case 1:
                                    try {
                                        return tv6Var4.k(su6Var2, mm5.u(br6.a(su6Var2.c, bundle72)));
                                    } catch (RuntimeException e5) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return jie.b(e5);
                                    }
                                case 2:
                                    try {
                                        return tv6Var4.k(su6Var2, mm5.u(br6.a(su6Var2.c, bundle72)));
                                    } catch (RuntimeException e6) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return jie.b(e6);
                                    }
                                default:
                                    try {
                                        jr6 b2 = jr6.b(su6Var2.c, bundle72);
                                        tv6Var4.t();
                                        tv6Var4.t.j0(b2);
                                        return jie.c(new o6a(0));
                                    } catch (RuntimeException e7) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return jie.b(e7);
                                    }
                            }
                        }
                    }, new vw6(this, readInt36, (byte) 1), (byte) 0), (byte) 1));
                    return true;
                }
                break;
            case 3031:
                ei5 a28 = an6.a(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                final IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (a28 != null && readStrongBinder2 != null) {
                    b(a28, readInt37, 20, new cx6(new dx6(new lx6() {
                        @Override
                        public final Object p(tv6 tv6Var4, su6 su6Var2, int i5) {
                            byte b = r2;
                            int i6 = 0;
                            IBinder iBinder = readStrongBinder2;
                            switch (b) {
                                case 0:
                                    try {
                                        mm5 a29 = w21.a(iBinder);
                                        jm5 p = mm5.p();
                                        while (i6 < a29.size()) {
                                            Bundle bundle8 = (Bundle) a29.get(i6);
                                            bundle8.getClass();
                                            p.c(br6.a(su6Var2.c, bundle8));
                                            i6++;
                                        }
                                        return tv6Var4.k(su6Var2, p.f());
                                    } catch (RuntimeException e4) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return jie.b(e4);
                                    }
                                case 1:
                                    try {
                                        mm5 a30 = w21.a(iBinder);
                                        jm5 p2 = mm5.p();
                                        while (i6 < a30.size()) {
                                            Bundle bundle9 = (Bundle) a30.get(i6);
                                            bundle9.getClass();
                                            p2.c(br6.a(su6Var2.c, bundle9));
                                            i6++;
                                        }
                                        return tv6Var4.k(su6Var2, p2.f());
                                    } catch (RuntimeException e5) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return jie.b(e5);
                                    }
                                default:
                                    try {
                                        mm5 a31 = w21.a(iBinder);
                                        jm5 p3 = mm5.p();
                                        while (i6 < a31.size()) {
                                            Bundle bundle10 = (Bundle) a31.get(i6);
                                            bundle10.getClass();
                                            p3.c(br6.a(su6Var2.c, bundle10));
                                            i6++;
                                        }
                                        return tv6Var4.k(su6Var2, p3.f());
                                    } catch (RuntimeException e6) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return jie.b(e6);
                                    }
                            }
                        }
                    }, new yw6((byte) 5), (byte) 0), (byte) 1));
                    return true;
                }
                break;
            case 3032:
                ei5 a29 = an6.a(parcel.readStrongBinder());
                int readInt38 = parcel.readInt();
                int readInt39 = parcel.readInt();
                final IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (a29 != null && readStrongBinder3 != null && readInt39 >= 0) {
                    b(a29, readInt38, 20, new cx6(new dx6(new lx6() {
                        @Override
                        public final Object p(tv6 tv6Var4, su6 su6Var2, int i5) {
                            byte b = r2;
                            int i6 = 0;
                            IBinder iBinder = readStrongBinder3;
                            switch (b) {
                                case 0:
                                    try {
                                        mm5 a292 = w21.a(iBinder);
                                        jm5 p = mm5.p();
                                        while (i6 < a292.size()) {
                                            Bundle bundle8 = (Bundle) a292.get(i6);
                                            bundle8.getClass();
                                            p.c(br6.a(su6Var2.c, bundle8));
                                            i6++;
                                        }
                                        return tv6Var4.k(su6Var2, p.f());
                                    } catch (RuntimeException e4) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return jie.b(e4);
                                    }
                                case 1:
                                    try {
                                        mm5 a30 = w21.a(iBinder);
                                        jm5 p2 = mm5.p();
                                        while (i6 < a30.size()) {
                                            Bundle bundle9 = (Bundle) a30.get(i6);
                                            bundle9.getClass();
                                            p2.c(br6.a(su6Var2.c, bundle9));
                                            i6++;
                                        }
                                        return tv6Var4.k(su6Var2, p2.f());
                                    } catch (RuntimeException e5) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return jie.b(e5);
                                    }
                                default:
                                    try {
                                        mm5 a31 = w21.a(iBinder);
                                        jm5 p3 = mm5.p();
                                        while (i6 < a31.size()) {
                                            Bundle bundle10 = (Bundle) a31.get(i6);
                                            bundle10.getClass();
                                            p3.c(br6.a(su6Var2.c, bundle10));
                                            i6++;
                                        }
                                        return tv6Var4.k(su6Var2, p3.f());
                                    } catch (RuntimeException e6) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return jie.b(e6);
                                    }
                            }
                        }
                    }, new vw6(this, readInt39, (byte) 3), (byte) 0), (byte) 1));
                    return true;
                }
                break;
            case 3033:
                ei5 a30 = an6.a(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                final Bundle bundle8 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                if (a30 != null && bundle8 != null) {
                    b(a30, readInt40, 19, new cx6(new lx6() {
                        @Override
                        public final Object p(tv6 tv6Var4, su6 su6Var2, int i5) {
                            byte b = r2;
                            Bundle bundle72 = bundle8;
                            switch (b) {
                                case 0:
                                    try {
                                        return tv6Var4.k(su6Var2, mm5.u(br6.a(su6Var2.c, bundle72)));
                                    } catch (RuntimeException e4) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return jie.b(e4);
                                    }
                                case 1:
                                    try {
                                        return tv6Var4.k(su6Var2, mm5.u(br6.a(su6Var2.c, bundle72)));
                                    } catch (RuntimeException e5) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return jie.b(e5);
                                    }
                                case 2:
                                    try {
                                        return tv6Var4.k(su6Var2, mm5.u(br6.a(su6Var2.c, bundle72)));
                                    } catch (RuntimeException e6) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return jie.b(e6);
                                    }
                                default:
                                    try {
                                        jr6 b2 = jr6.b(su6Var2.c, bundle72);
                                        tv6Var4.t();
                                        tv6Var4.t.j0(b2);
                                        return jie.c(new o6a(0));
                                    } catch (RuntimeException e7) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return jie.b(e7);
                                    }
                            }
                        }
                    }, (byte) 1));
                    return true;
                }
                break;
            case 3034:
                ei5 a31 = an6.a(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (a31 != null) {
                    c(a31, readInt41, new kx6(this) {
                        public final ox6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(su6 su6Var2, int i5) {
                            byte b = r2;
                            ox6 ox6Var = this.b;
                            switch (b) {
                                case 0:
                                    ox6Var.S(su6Var2, i5, 11, ox6.X(new yw6((byte) 16)));
                                    return;
                                case 1:
                                    ox6Var.Q(su6Var2, i5);
                                    return;
                                case 2:
                                    ox6Var.S(su6Var2, i5, 3, ox6.X(new yw6((byte) 21)));
                                    return;
                                case 3:
                                    ox6Var.S(su6Var2, i5, 12, ox6.X(new yw6((byte) 19)));
                                    return;
                                case 4:
                                    ox6Var.S(su6Var2, i5, 1, ox6.X(new yw6((byte) 15)));
                                    return;
                                case 5:
                                    ox6Var.S(su6Var2, i5, 9, ox6.X(new yw6((byte) 20)));
                                    return;
                                default:
                                    ox6Var.S(su6Var2, i5, 7, ox6.X(new yw6((byte) 17)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                break;
            case 3035:
                ei5 a32 = an6.a(parcel.readStrongBinder());
                parcel.readInt();
                if (a32 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        tv6 tv6Var4 = (tv6) this.a.get();
                        if (tv6Var4 != null && !tv6Var4.i()) {
                            final IBinder asBinder = a32.asBinder();
                            R(new Runnable(this) {
                                public final ox6 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void run() {
                                    byte b = r3;
                                    IBinder iBinder = asBinder;
                                    ox6 ox6Var = this.b;
                                    switch (b) {
                                        case 0:
                                            mv6 mv6Var = ox6Var.b;
                                            mv6Var.x0();
                                            su6 L = mv6Var.L(iBinder);
                                            if (L != null) {
                                                mv6Var.e0(L);
                                                return;
                                            }
                                            return;
                                        default:
                                            mv6 mv6Var2 = ox6Var.b;
                                            su6 L2 = mv6Var2.L(iBinder);
                                            if (L2 != null) {
                                                mv6Var2.E(L2);
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
                ei5 a33 = an6.a(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (a33 != null) {
                    b(a33, readInt42, 4, X(new yw6((byte) 10)));
                    return true;
                }
                break;
            case 3037:
                ei5 a34 = an6.a(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                int readInt44 = parcel.readInt();
                if (a34 != null && readInt44 >= 0) {
                    b(a34, readInt43, 10, new im6(new vw6(this, readInt44, (byte) 0), (byte) 4));
                    return true;
                }
                break;
            case 3038:
                ei5 a35 = an6.a(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                long readLong3 = parcel.readLong();
                if (a35 != null) {
                    b(a35, readInt45, 5, X(new f40(readLong3)));
                    return true;
                }
                break;
            case 3039:
                ei5 a36 = an6.a(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                int readInt47 = parcel.readInt();
                long readLong4 = parcel.readLong();
                if (a36 != null && readInt47 >= 0) {
                    b(a36, readInt46, 10, new im6(new gf(this, readInt47, readLong4, (byte) 4), (byte) 4));
                    return true;
                }
                break;
            case 3040:
                ei5 a37 = an6.a(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                if (a37 != null) {
                    c(a37, readInt48, new kx6(this) {
                        public final ox6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(su6 su6Var2, int i5) {
                            byte b = r2;
                            ox6 ox6Var = this.b;
                            switch (b) {
                                case 0:
                                    ox6Var.S(su6Var2, i5, 11, ox6.X(new yw6((byte) 16)));
                                    return;
                                case 1:
                                    ox6Var.Q(su6Var2, i5);
                                    return;
                                case 2:
                                    ox6Var.S(su6Var2, i5, 3, ox6.X(new yw6((byte) 21)));
                                    return;
                                case 3:
                                    ox6Var.S(su6Var2, i5, 12, ox6.X(new yw6((byte) 19)));
                                    return;
                                case 4:
                                    ox6Var.S(su6Var2, i5, 1, ox6.X(new yw6((byte) 15)));
                                    return;
                                case 5:
                                    ox6Var.S(su6Var2, i5, 9, ox6.X(new yw6((byte) 20)));
                                    return;
                                default:
                                    ox6Var.S(su6Var2, i5, 7, ox6.X(new yw6((byte) 17)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                break;
            case 3041:
                ei5 a38 = an6.a(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                if (a38 != null) {
                    c(a38, readInt49, new kx6(this) {
                        public final ox6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(su6 su6Var2, int i5) {
                            byte b = r2;
                            ox6 ox6Var = this.b;
                            switch (b) {
                                case 0:
                                    ox6Var.S(su6Var2, i5, 11, ox6.X(new yw6((byte) 16)));
                                    return;
                                case 1:
                                    ox6Var.Q(su6Var2, i5);
                                    return;
                                case 2:
                                    ox6Var.S(su6Var2, i5, 3, ox6.X(new yw6((byte) 21)));
                                    return;
                                case 3:
                                    ox6Var.S(su6Var2, i5, 12, ox6.X(new yw6((byte) 19)));
                                    return;
                                case 4:
                                    ox6Var.S(su6Var2, i5, 1, ox6.X(new yw6((byte) 15)));
                                    return;
                                case 5:
                                    ox6Var.S(su6Var2, i5, 9, ox6.X(new yw6((byte) 20)));
                                    return;
                                default:
                                    ox6Var.S(su6Var2, i5, 7, ox6.X(new yw6((byte) 17)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                break;
            case 3042:
                ei5 a39 = an6.a(parcel.readStrongBinder());
                int readInt50 = parcel.readInt();
                if (a39 != null) {
                    b(a39, readInt50, 6, X(new yw6((byte) 1)));
                    return true;
                }
                break;
            case 3043:
                ei5 a40 = an6.a(parcel.readStrongBinder());
                int readInt51 = parcel.readInt();
                if (a40 != null) {
                    b(a40, readInt51, 8, X(new w26((byte) 28)));
                    return true;
                }
                break;
            case 3044:
                ei5 a41 = an6.a(parcel.readStrongBinder());
                int readInt52 = parcel.readInt();
                Surface surface = (Surface) ake.a(parcel, Surface.CREATOR);
                if (a41 != null) {
                    b(a41, readInt52, 27, X(new h45(this, surface, (byte) 28)));
                    return true;
                }
                break;
            case 3045:
                ei5 a42 = an6.a(parcel.readStrongBinder());
                if (a42 != null) {
                    long clearCallingIdentity4 = Binder.clearCallingIdentity();
                    try {
                        tv6 tv6Var5 = (tv6) this.a.get();
                        if (tv6Var5 != null && !tv6Var5.i()) {
                            final IBinder asBinder2 = a42.asBinder();
                            R(new Runnable(this) {
                                public final ox6 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void run() {
                                    byte b = r3;
                                    IBinder iBinder = asBinder2;
                                    ox6 ox6Var = this.b;
                                    switch (b) {
                                        case 0:
                                            mv6 mv6Var = ox6Var.b;
                                            mv6Var.x0();
                                            su6 L = mv6Var.L(iBinder);
                                            if (L != null) {
                                                mv6Var.e0(L);
                                                return;
                                            }
                                            return;
                                        default:
                                            mv6 mv6Var2 = ox6Var.b;
                                            su6 L2 = mv6Var2.L(iBinder);
                                            if (L2 != null) {
                                                mv6Var2.E(L2);
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
                ei5 a43 = an6.a(parcel.readStrongBinder());
                int readInt53 = parcel.readInt();
                if (a43 != null) {
                    c(a43, readInt53, new kx6(this) {
                        public final ox6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(su6 su6Var2, int i5) {
                            byte b = r2;
                            ox6 ox6Var = this.b;
                            switch (b) {
                                case 0:
                                    ox6Var.S(su6Var2, i5, 11, ox6.X(new yw6((byte) 16)));
                                    return;
                                case 1:
                                    ox6Var.Q(su6Var2, i5);
                                    return;
                                case 2:
                                    ox6Var.S(su6Var2, i5, 3, ox6.X(new yw6((byte) 21)));
                                    return;
                                case 3:
                                    ox6Var.S(su6Var2, i5, 12, ox6.X(new yw6((byte) 19)));
                                    return;
                                case 4:
                                    ox6Var.S(su6Var2, i5, 1, ox6.X(new yw6((byte) 15)));
                                    return;
                                case 5:
                                    ox6Var.S(su6Var2, i5, 9, ox6.X(new yw6((byte) 20)));
                                    return;
                                default:
                                    ox6Var.S(su6Var2, i5, 7, ox6.X(new yw6((byte) 17)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                break;
            case 3047:
                ei5 a44 = an6.a(parcel.readStrongBinder());
                int readInt54 = parcel.readInt();
                if (a44 != null) {
                    c(a44, readInt54, new kx6(this) {
                        public final ox6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(su6 su6Var2, int i5) {
                            byte b = r2;
                            ox6 ox6Var = this.b;
                            switch (b) {
                                case 0:
                                    ox6Var.S(su6Var2, i5, 11, ox6.X(new yw6((byte) 16)));
                                    return;
                                case 1:
                                    ox6Var.Q(su6Var2, i5);
                                    return;
                                case 2:
                                    ox6Var.S(su6Var2, i5, 3, ox6.X(new yw6((byte) 21)));
                                    return;
                                case 3:
                                    ox6Var.S(su6Var2, i5, 12, ox6.X(new yw6((byte) 19)));
                                    return;
                                case 4:
                                    ox6Var.S(su6Var2, i5, 1, ox6.X(new yw6((byte) 15)));
                                    return;
                                case 5:
                                    ox6Var.S(su6Var2, i5, 9, ox6.X(new yw6((byte) 20)));
                                    return;
                                default:
                                    ox6Var.S(su6Var2, i5, 7, ox6.X(new yw6((byte) 17)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                break;
            case 3048:
                ei5 a45 = an6.a(parcel.readStrongBinder());
                int readInt55 = parcel.readInt();
                Bundle bundle9 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                if (a45 != null && bundle9 != null) {
                    try {
                        b(a45, readInt55, 29, X(new h45(this, byb.b(bundle9), (byte) 27)));
                        break;
                    } catch (RuntimeException e4) {
                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e4);
                        break;
                    }
                }
                break;
            case 3049:
                ei5 a46 = an6.a(parcel.readStrongBinder());
                int readInt56 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle10 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                if (a46 != null && readString != null && bundle10 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        lad.f("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                        break;
                    } else {
                        try {
                            d(a46, readInt56, null, 40010, new cx6(new yw6((byte) 3, fz8.a(bundle10), readString), (byte) 1));
                            break;
                        } catch (RuntimeException e5) {
                            lad.g("MediaSessionStub", "Ignoring malformed Bundle for Rating", e5);
                            break;
                        }
                    }
                }
                break;
            case 3050:
                ei5 a47 = an6.a(parcel.readStrongBinder());
                int readInt57 = parcel.readInt();
                Bundle bundle11 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                if (a47 != null && bundle11 != null) {
                    try {
                        d(a47, readInt57, null, 40010, new cx6(new yw6(fz8.a(bundle11), (byte) 22), (byte) 1));
                        break;
                    } catch (RuntimeException e6) {
                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for Rating", e6);
                        break;
                    }
                }
                break;
            case 3051:
                ei5 a48 = an6.a(parcel.readStrongBinder());
                int readInt58 = parcel.readInt();
                int readInt59 = parcel.readInt();
                int readInt60 = parcel.readInt();
                if (a48 != null && readInt59 >= 0) {
                    b(a48, readInt58, 33, X(new ll0(readInt59, readInt60, (byte) 4)));
                    return true;
                }
                break;
            case 3052:
                ei5 a49 = an6.a(parcel.readStrongBinder());
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                if (a49 != null) {
                    b(a49, readInt61, 34, X(new qf(readInt62, (byte) 6)));
                    return true;
                }
                break;
            case 3053:
                ei5 a50 = an6.a(parcel.readStrongBinder());
                int readInt63 = parcel.readInt();
                int readInt64 = parcel.readInt();
                if (a50 != null) {
                    b(a50, readInt63, 34, X(new qf(readInt64, (byte) 5)));
                    return true;
                }
                break;
            case 3054:
                ei5 a51 = an6.a(parcel.readStrongBinder());
                int readInt65 = parcel.readInt();
                final boolean z5 = parcel.readInt() != 0;
                final int readInt66 = parcel.readInt();
                if (a51 != null) {
                    b(a51, readInt65, 34, X(new us2() {
                        @Override
                        public final void accept(Object obj) {
                            ((ad8) obj).G(readInt66, z5);
                        }
                    }));
                    return true;
                }
                break;
            case 3055:
                ei5 a52 = an6.a(parcel.readStrongBinder());
                int readInt67 = parcel.readInt();
                int readInt68 = parcel.readInt();
                final Bundle bundle12 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                if (a52 != null && bundle12 != null && readInt68 >= 0) {
                    b(a52, readInt67, 20, new cx6(new dx6(new lx6() {
                        @Override
                        public final Object p(tv6 tv6Var42, su6 su6Var2, int i5) {
                            byte b = r2;
                            Bundle bundle72 = bundle12;
                            switch (b) {
                                case 0:
                                    try {
                                        return tv6Var42.k(su6Var2, mm5.u(br6.a(su6Var2.c, bundle72)));
                                    } catch (RuntimeException e42) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e42);
                                        return jie.b(e42);
                                    }
                                case 1:
                                    try {
                                        return tv6Var42.k(su6Var2, mm5.u(br6.a(su6Var2.c, bundle72)));
                                    } catch (RuntimeException e52) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e52);
                                        return jie.b(e52);
                                    }
                                case 2:
                                    try {
                                        return tv6Var42.k(su6Var2, mm5.u(br6.a(su6Var2.c, bundle72)));
                                    } catch (RuntimeException e62) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e62);
                                        return jie.b(e62);
                                    }
                                default:
                                    try {
                                        jr6 b2 = jr6.b(su6Var2.c, bundle72);
                                        tv6Var42.t();
                                        tv6Var42.t.j0(b2);
                                        return jie.c(new o6a(0));
                                    } catch (RuntimeException e7) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return jie.b(e7);
                                    }
                            }
                        }
                    }, new vw6(this, readInt68, (byte) 2), (byte) 0), (byte) 1));
                    return true;
                }
                break;
            case 3056:
                ei5 a53 = an6.a(parcel.readStrongBinder());
                int readInt69 = parcel.readInt();
                int readInt70 = parcel.readInt();
                int readInt71 = parcel.readInt();
                final IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (a53 != null && readStrongBinder4 != null && readInt70 >= 0 && readInt71 >= readInt70) {
                    b(a53, readInt69, 20, new cx6(new dx6(new lx6() {
                        @Override
                        public final Object p(tv6 tv6Var42, su6 su6Var2, int i5) {
                            byte b = r2;
                            int i6 = 0;
                            IBinder iBinder = readStrongBinder4;
                            switch (b) {
                                case 0:
                                    try {
                                        mm5 a292 = w21.a(iBinder);
                                        jm5 p = mm5.p();
                                        while (i6 < a292.size()) {
                                            Bundle bundle82 = (Bundle) a292.get(i6);
                                            bundle82.getClass();
                                            p.c(br6.a(su6Var2.c, bundle82));
                                            i6++;
                                        }
                                        return tv6Var42.k(su6Var2, p.f());
                                    } catch (RuntimeException e42) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e42);
                                        return jie.b(e42);
                                    }
                                case 1:
                                    try {
                                        mm5 a302 = w21.a(iBinder);
                                        jm5 p2 = mm5.p();
                                        while (i6 < a302.size()) {
                                            Bundle bundle92 = (Bundle) a302.get(i6);
                                            bundle92.getClass();
                                            p2.c(br6.a(su6Var2.c, bundle92));
                                            i6++;
                                        }
                                        return tv6Var42.k(su6Var2, p2.f());
                                    } catch (RuntimeException e52) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e52);
                                        return jie.b(e52);
                                    }
                                default:
                                    try {
                                        mm5 a312 = w21.a(iBinder);
                                        jm5 p3 = mm5.p();
                                        while (i6 < a312.size()) {
                                            Bundle bundle102 = (Bundle) a312.get(i6);
                                            bundle102.getClass();
                                            p3.c(br6.a(su6Var2.c, bundle102));
                                            i6++;
                                        }
                                        return tv6Var42.k(su6Var2, p3.f());
                                    } catch (RuntimeException e62) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e62);
                                        return jie.b(e62);
                                    }
                            }
                        }
                    }, new sw6(this, readInt70, readInt71), (byte) 0), (byte) 1));
                    return true;
                }
                break;
            case 3057:
                ei5 a54 = an6.a(parcel.readStrongBinder());
                int readInt72 = parcel.readInt();
                Bundle bundle13 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                boolean z6 = parcel.readInt() != 0;
                if (a54 != null && bundle13 != null) {
                    try {
                        b(a54, readInt72, 35, X(new l41((byte) 10, nz.a(bundle13), z6)));
                        break;
                    } catch (RuntimeException e7) {
                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e7);
                        break;
                    }
                }
                break;
            case 3058:
                ei5 a55 = an6.a(parcel.readStrongBinder());
                int readInt73 = parcel.readInt();
                if (a55 != null) {
                    b(a55, readInt73, 24, X(new w26((byte) 27)));
                    return true;
                }
                break;
            case 3059:
                ei5 a56 = an6.a(parcel.readStrongBinder());
                int readInt74 = parcel.readInt();
                if (a56 != null) {
                    b(a56, readInt74, 24, X(new yw6((byte) 8)));
                    return true;
                }
                break;
            case 3060:
                ei5 a57 = an6.a(parcel.readStrongBinder());
                int readInt75 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle14 = (Bundle) ake.a(parcel, creator2);
                Bundle bundle15 = (Bundle) ake.a(parcel, creator2);
                if (parcel.readInt() != 0) {
                    ei5Var = a57;
                    bundle = bundle14;
                    z = true;
                } else {
                    ei5Var = a57;
                    bundle = bundle14;
                    z = false;
                }
                P(ei5Var, readInt75, bundle, bundle15, z);
                return true;
            case 3061:
                ei5 a58 = an6.a(parcel.readStrongBinder());
                int readInt76 = parcel.readInt();
                Surface surface2 = (Surface) ake.a(parcel, Surface.CREATOR);
                int readInt77 = parcel.readInt();
                int readInt78 = parcel.readInt();
                if (a58 != null) {
                    b(a58, readInt76, 27, X(new wy0(this, surface2, readInt77, readInt78)));
                    return true;
                }
                break;
            case 3062:
                ei5 a59 = an6.a(parcel.readStrongBinder());
                int readInt79 = parcel.readInt();
                int readInt80 = parcel.readInt();
                int readInt81 = parcel.readInt();
                if (a59 != null) {
                    b(a59, readInt79, 27, X(new sw6(this, readInt80, readInt81)));
                    return true;
                }
                break;
            default:
                dr6 dr6Var = null;
                switch (i) {
                    case 4001:
                        ei5 a60 = an6.a(parcel.readStrongBinder());
                        int readInt82 = parcel.readInt();
                        Bundle bundle16 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                        if (a60 != null) {
                            if (bundle16 != null) {
                                try {
                                    dr6Var = dr6.a(bundle16);
                                } catch (RuntimeException e8) {
                                    lad.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e8);
                                    break;
                                }
                            }
                            d(a60, readInt82, null, 50000, new cx6(new yw6(dr6Var, (byte) 9), (byte) 0));
                            break;
                        }
                        break;
                    case 4002:
                        ei5 a61 = an6.a(parcel.readStrongBinder());
                        int readInt83 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (a61 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                lad.f("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            d(a61, readInt83, null, 50004, new cx6(new yw6(readString2, (byte) 2), (byte) 0));
                            return true;
                        }
                        break;
                    case 4003:
                        ei5 a62 = an6.a(parcel.readStrongBinder());
                        int readInt84 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt85 = parcel.readInt();
                        int readInt86 = parcel.readInt();
                        Bundle bundle17 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                        if (a62 != null) {
                            if (TextUtils.isEmpty(readString3)) {
                                lad.f("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                                break;
                            } else if (readInt85 < 0) {
                                lad.f("MediaSessionStub", "getChildren(): Ignoring negative page");
                                break;
                            } else if (readInt86 < 1) {
                                lad.f("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                                break;
                            } else {
                                if (bundle17 != null) {
                                    try {
                                        dr6Var = dr6.a(bundle17);
                                    } catch (RuntimeException e9) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e9);
                                        break;
                                    }
                                }
                                d(a62, readInt84, null, 50003, new cx6(new w26(readString3, readInt85, readInt86, dr6Var), (byte) 0));
                                break;
                            }
                        }
                        break;
                    case 4004:
                        ei5 a63 = an6.a(parcel.readStrongBinder());
                        int readInt87 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle18 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                        if (a63 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                lad.f("MediaSessionStub", "search(): Ignoring empty query");
                                break;
                            } else {
                                if (bundle18 != null) {
                                    try {
                                        dr6Var = dr6.a(bundle18);
                                    } catch (RuntimeException e10) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e10);
                                        break;
                                    }
                                }
                                d(a63, readInt87, null, 50005, new cx6(new yw6((byte) 14, dr6Var, readString4), (byte) 0));
                                break;
                            }
                        }
                        break;
                    case 4005:
                        ei5 a64 = an6.a(parcel.readStrongBinder());
                        int readInt88 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt89 = parcel.readInt();
                        int readInt90 = parcel.readInt();
                        Bundle bundle19 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                        if (a64 != null) {
                            if (TextUtils.isEmpty(readString5)) {
                                lad.f("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                                break;
                            } else if (readInt89 < 0) {
                                lad.f("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                                break;
                            } else if (readInt90 < 1) {
                                lad.f("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                                break;
                            } else {
                                if (bundle19 != null) {
                                    try {
                                        dr6Var = dr6.a(bundle19);
                                    } catch (RuntimeException e11) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e11);
                                        break;
                                    }
                                }
                                d(a64, readInt88, null, 50006, new cx6(new yw6(readString5, readInt89, readInt90, dr6Var), (byte) 0));
                                break;
                            }
                        }
                        break;
                    case 4006:
                        ei5 a65 = an6.a(parcel.readStrongBinder());
                        int readInt91 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle20 = (Bundle) ake.a(parcel, Bundle.CREATOR);
                        if (a65 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                lad.f("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                                break;
                            } else {
                                if (bundle20 != null) {
                                    try {
                                        dr6Var = dr6.a(bundle20);
                                    } catch (RuntimeException e12) {
                                        lad.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e12);
                                        break;
                                    }
                                }
                                d(a65, readInt91, null, 50001, new cx6(new yw6((byte) 12, dr6Var, readString6), (byte) 0));
                                break;
                            }
                        }
                        break;
                    case 4007:
                        ei5 a66 = an6.a(parcel.readStrongBinder());
                        int readInt92 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (a66 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                lad.f("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            d(a66, readInt92, null, 50002, new cx6(new w26(readString7, (byte) 25), (byte) 0));
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
