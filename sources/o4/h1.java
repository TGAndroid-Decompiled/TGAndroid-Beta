package o4;

import ai.z3;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import b8.kg;
import b8.we;
import b8.ye;
import d2.u1;
import d2.v1;
import g9.g2;
import g9.x1;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import mi.d4;
public final class h1 extends Binder implements m {
    public final WeakReference f20660a;
    public final ui.f f20661b;
    public final Set f20662c;
    public g9.r1 d;
    public x1 f20663e;
    public int f20664f;
    public g1 f20665i;

    public h1(e0 e0Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.f20660a = new WeakReference(e0Var);
        this.f20661b = new ui.f(e0Var);
        this.f20662c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = g9.r1.f12134r;
        this.f20663e = x1.h;
    }

    public static l9.y K0(e0 e0Var, v vVar, int i3, f1 f1Var, g2.k kVar) {
        if (e0Var.j()) {
            return l9.w.f18167b;
        }
        l9.y yVar = (l9.y) f1Var.i(e0Var, vVar, i3);
        ?? obj = new Object();
        yVar.b(new z3(e0Var, obj, kVar, yVar, 29), l9.r.f18162a);
        return obj;
    }

    public static void R0(e0 e0Var, v vVar, int i3, r1 r1Var) {
        try {
            u uVar = vVar.d;
            uVar.getClass();
            uVar.e(i3, r1Var);
            e0Var.f20621c.a(true, true);
        } catch (RemoteException e10) {
            g2.a.m("MediaSessionStub", "Failed to send result to controller " + vVar, e10);
        }
    }

    public static l5.b S0(g2.k kVar) {
        return new l5.b(new l5.b(kVar, 20), 19);
    }

    public final void H0(l lVar, Bundle bundle) {
        WeakReference weakReference = this.f20660a;
        e0 e0Var = (e0) weakReference.get();
        if (lVar != null && bundle != null && e0Var != null) {
            try {
                Context context = e0Var.f20623f;
                i a10 = i.a(bundle);
                int callingUid = Binder.getCallingUid();
                int callingPid = Binder.getCallingPid();
                String str = a10.f20673c;
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                if (packagesForUid != null && packagesForUid.length != 0) {
                    for (String str2 : packagesForUid) {
                        if (!str2.equals(str)) {
                        }
                    }
                    g2.a.l("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                    ye.a(lVar);
                    return;
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = a10.d;
                }
                try {
                    p4.r rVar = new p4.r(str, callingPid, callingUid);
                    boolean b10 = p4.u.a(context).b(rVar);
                    int i3 = a10.f20671a;
                    int i10 = a10.f20672b;
                    v vVar = new v(rVar, i3, i10, b10, new c1(lVar, i10), a10.f20674e);
                    e0 e0Var2 = (e0) weakReference.get();
                    if (e0Var2 != null && !e0Var2.j()) {
                        this.f20662c.add(vVar);
                        g2.n0.W(e0Var2.f20628l, new z3(this, vVar, e0Var2, lVar, 28));
                        return;
                    }
                    ye.a(lVar);
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } catch (RuntimeException e10) {
                g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e10);
                return;
            }
        }
        ye.a(lVar);
    }

    public final void I0(l lVar, int i3) {
        if (lVar == null) {
            return;
        }
        P0(lVar, i3, 26, S0(new n9.j(19)));
    }

    public final void J0(l lVar, int i3, n1 n1Var, int i10, f1 f1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            e0 e0Var = (e0) this.f20660a.get();
            if (e0Var != null && !e0Var.j()) {
                v o10 = this.f20661b.o(lVar.asBinder());
                if (o10 == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return;
                }
                g2.n0.W(e0Var.f20628l, new w0(this, o10, n1Var, e0Var, i3, i10, f1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void L0(l lVar, int i3) {
        if (lVar == null) {
            return;
        }
        P0(lVar, i3, 26, S0(new n9.j(11)));
    }

    public final int M0(v vVar, l1 l1Var, int i3) {
        if (l1Var.m0(17)) {
            ui.f fVar = this.f20661b;
            if (!fVar.w(vVar, 17) && fVar.w(vVar, 16)) {
                return l1Var.l0() + i3;
            }
        }
        return i3;
    }

    public final void N0(l lVar, int i3, Bundle bundle, Bundle bundle2, boolean z10) {
        n1 n1Var;
        Bundle o10 = g2.n0.o(bundle2);
        if (lVar != null && bundle != null && o10 != null) {
            try {
                int i10 = bundle.getInt(n1.f20761f, 0);
                if (i10 != 0) {
                    n1Var = new n1(i10);
                } else {
                    String string = bundle.getString(n1.f20762g);
                    string.getClass();
                    Bundle o11 = g2.n0.o(bundle.getBundle(n1.h));
                    if (o11 == null) {
                        o11 = Bundle.EMPTY;
                    }
                    n1Var = new n1(string, o11);
                }
                if (d.j(n1Var.f20764b)) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        e0 e0Var = (e0) this.f20660a.get();
                        if (e0Var != null && !e0Var.j()) {
                            v o12 = this.f20661b.o(lVar.asBinder());
                            if (o12 == null) {
                                Binder.restoreCallingIdentity(clearCallingIdentity);
                                return;
                            }
                            g2.n0.W(e0Var.f20628l, new cg.k0(this, o12, n1Var, e0Var, i3, lVar, 3));
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            return;
                        }
                        return;
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                J0(lVar, i3, n1Var, 0, new x0(new n9.j(z10, n1Var, o10), 1));
            } catch (RuntimeException e10) {
                g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e10);
            }
        }
    }

    public final void O0(v vVar, int i3) {
        Q0(vVar, i3, 1, S0(new d4(5, this, vVar)));
    }

    public final void P0(l lVar, int i3, int i10, l5.b bVar) {
        v o10 = this.f20661b.o(lVar.asBinder());
        if (o10 != null) {
            Q0(o10, i3, i10, bVar);
        }
    }

    public final void Q0(v vVar, int i3, int i10, f1 f1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            e0 e0Var = (e0) this.f20660a.get();
            if (e0Var != null && !e0Var.j()) {
                g2.n0.W(e0Var.f20628l, new mi.g0(this, vVar, i10, e0Var, i3, f1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void T0(l lVar, int i3, boolean z10) {
        if (lVar == null) {
            return;
        }
        P0(lVar, i3, 26, S0(new k2.x(3, z10)));
    }

    public final void U0(l lVar, int i3, int i10) {
        if (lVar != null && i10 >= 0) {
            P0(lVar, i3, 25, S0(new k2.v(i10, 6)));
        }
    }

    public final void V0(l lVar, int i3, Bundle bundle, boolean z10) {
        v o10;
        if (lVar != null && bundle != null && (o10 = this.f20661b.o(lVar.asBinder())) != null) {
            try {
                Q0(o10, i3, 31, new x0(new d4(7, new ei.f(2, d2.n0.a(o10.f20881c, bundle), z10), new v0(1)), 1));
            } catch (RuntimeException e10) {
                g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
            }
        }
    }

    public final void W0(l lVar, int i3, Bundle bundle, long j10) {
        v o10;
        if (lVar != null && bundle != null && (o10 = this.f20661b.o(lVar.asBinder())) != null) {
            try {
                Q0(o10, i3, 31, new x0(new d4(7, new ei.c1(d2.n0.a(o10.f20881c, bundle), j10, 2), new v0(1)), 1));
            } catch (RuntimeException e10) {
                g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
            }
        }
    }

    public final void X0(l lVar, int i3, IBinder iBinder, boolean z10) {
        v o10;
        if (lVar != null && iBinder != null && (o10 = this.f20661b.o(lVar.asBinder())) != null) {
            try {
                g9.i0 a10 = d2.h.a(iBinder);
                g9.f0 p10 = g9.i0.p();
                for (int i10 = 0; i10 < a10.size(); i10++) {
                    Bundle bundle = (Bundle) a10.get(i10);
                    bundle.getClass();
                    p10.c(d2.n0.a(o10.f20881c, bundle));
                }
                Q0(o10, i3, 20, new x0(new d4(7, new ei.f(4, p10.f(), z10), new v0(1)), 1));
            } catch (RuntimeException e10) {
                g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
            }
        }
    }

    public final void Y0(l lVar, int i3, IBinder iBinder, int i10, long j10) {
        v o10;
        if (lVar != null && iBinder != null) {
            if ((i10 == -1 || i10 >= 0) && (o10 = this.f20661b.o(lVar.asBinder())) != null) {
                try {
                    g9.i0 a10 = d2.h.a(iBinder);
                    g9.f0 p10 = g9.i0.p();
                    for (int i11 = 0; i11 < a10.size(); i11++) {
                        Bundle bundle = (Bundle) a10.get(i11);
                        bundle.getClass();
                        p10.c(d2.n0.a(o10.f20881c, bundle));
                    }
                    Q0(o10, i3, 20, new x0(new d4(7, new b4.o(p10.f(), i10, j10, 3), new v0(1)), 1));
                } catch (RuntimeException e10) {
                    g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
                }
            }
        }
    }

    public final void Z0(l lVar, int i3, float f10) {
        if (lVar != null && f10 >= 0.0f && f10 <= 1.0f) {
            P0(lVar, i3, 24, S0(new k2.t(f10, 2)));
        }
    }

    public final j1 a1(j1 j1Var) {
        g9.r1 r1Var;
        g9.i0 i0Var = j1Var.F.f8500a;
        ?? kgVar = new kg(4, 8);
        kg kgVar2 = new kg(4, 8);
        for (int i3 = 0; i3 < i0Var.size(); i3++) {
            d2.o1 o1Var = ((u1) i0Var.get(i3)).f8445b;
            String str = (String) this.d.get(o1Var);
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                int i10 = this.f20664f;
                this.f20664f = i10 + 1;
                String str2 = g2.n0.f11873a;
                sb2.append(Integer.toString(i10, 36));
                sb2.append("-");
                sb2.append(o1Var.f8253b);
                str = sb2.toString();
            }
            kgVar.H(o1Var, str);
            kgVar2.w(o1Var.f8253b, str);
        }
        if (kgVar.f2722b == 0) {
            r1Var = g9.r1.f12134r;
        } else {
            r1Var = new g9.r1(kgVar.f2722b, (Object[]) kgVar.f2723c);
        }
        this.d = r1Var;
        this.f20663e = kgVar2.e(false);
        g9.f0 p10 = g9.i0.p();
        for (int i11 = 0; i11 < i0Var.size(); i11++) {
            u1 u1Var = (u1) i0Var.get(i11);
            p10.c(new u1(b1(u1Var.f8445b), u1Var.f8446c, u1Var.d, u1Var.f8447e));
        }
        j1 a10 = j1Var.a(new v1(p10.f()));
        d2.s1 s1Var = a10.G;
        if (s1Var.H.isEmpty()) {
            return a10;
        }
        d2.r1 c2 = s1Var.a().c();
        g2 it = s1Var.H.values().iterator();
        while (it.hasNext()) {
            d2.p1 p1Var = (d2.p1) it.next();
            c2.a(new d2.p1(b1(p1Var.f8284a), p1Var.f8285b));
        }
        return a10.d(c2.b());
    }

    public final d2.o1 b1(d2.o1 o1Var) {
        String str;
        String str2 = (String) this.d.get(o1Var);
        if (str2 == null) {
            str2 = o1Var.f8253b;
        }
        int i3 = 0;
        while (true) {
            int i10 = o1Var.f8252a;
            d2.v[] vVarArr = o1Var.d;
            if (i3 < i10) {
                if (vVarArr[i3].f8483m != null) {
                    d2.v[] vVarArr2 = new d2.v[i10];
                    for (int i11 = 0; i11 < o1Var.f8252a; i11++) {
                        d2.v vVar = vVarArr[i11];
                        String str3 = vVar.f8483m;
                        if (str3 != null) {
                            str = (String) this.f20663e.get(str3);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            d2.u a10 = vVar.a();
                            a10.f8425l = str;
                            vVarArr2[i11] = new d2.v(a10);
                        } else {
                            vVarArr2[i11] = vVar;
                        }
                    }
                    return new d2.o1(str2, vVarArr2);
                }
                i3++;
            } else {
                return new d2.o1(str2, vVarArr);
            }
        }
    }

    @Override
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        h hVar;
        h1 h1Var;
        v o10;
        v o11;
        v o12;
        v o13;
        v o14;
        v o15;
        v o16;
        v o17;
        v o18;
        v o19;
        v o20;
        v o21;
        h1 h1Var2;
        v o22;
        v o23;
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i3 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        q a10 = null;
        q a11 = null;
        q a12 = null;
        q a13 = null;
        q a14 = null;
        switch (i3) {
            case 3002:
                Z0(p.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                U0(p.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                L0(p.H0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                I0(p.H0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                T0(p.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                V0(p.H0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) we.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                W0(p.H0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) we.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                V0(p.H0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) we.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                X0(p.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                X0(p.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                Y0(p.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                l H0 = p.H0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                boolean z10 = parcel.readInt() != 0;
                if (H0 != null) {
                    P0(H0, readInt, 1, S0(new k2.x(2, z10)));
                    return true;
                }
                break;
            case 3014:
                l H02 = p.H0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) we.a(parcel, Bundle.CREATOR);
                if (H02 != null && bundle != null) {
                    try {
                        r1 a15 = r1.a(bundle);
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            ui.f fVar = this.f20661b;
                            IBinder asBinder = H02.asBinder();
                            synchronized (fVar.f56390b) {
                                v o24 = fVar.o(asBinder);
                                hVar = o24 != null ? (h) ((a0.f) fVar.d).get(o24) : null;
                            }
                            com.google.android.gms.common.api.internal.s sVar = hVar != null ? hVar.f20653b : null;
                            if (sVar != null) {
                                sVar.i(readInt2, a15);
                            }
                            break;
                        } finally {
                        }
                    } catch (RuntimeException e10) {
                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e10);
                        break;
                    }
                }
                break;
            case 3015:
                l H03 = p.H0(parcel.readStrongBinder());
                parcel.readInt();
                H0(H03, (Bundle) we.a(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                l H04 = p.H0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                N0(H04, readInt3, (Bundle) we.a(parcel, creator), (Bundle) we.a(parcel, creator), false);
                return true;
            case 3017:
                h1Var = this;
                l H05 = p.H0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                int readInt5 = parcel.readInt();
                if (H05 != null && (readInt5 == 2 || readInt5 == 0 || readInt5 == 1)) {
                    h1Var.P0(H05, readInt4, 15, S0(new k2.v(readInt5, 5)));
                    return true;
                }
                break;
            case 3018:
                h1Var = this;
                l H06 = p.H0(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                boolean z11 = parcel.readInt() != 0;
                if (H06 != null) {
                    h1Var.P0(H06, readInt6, 14, S0(new k2.x(4, z11)));
                    return true;
                }
                break;
            case 3019:
                h1Var = this;
                l H07 = p.H0(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                if (H07 != null && readInt8 >= 0) {
                    h1Var.P0(H07, readInt7, 20, new l5.b(new q0(h1Var, readInt8, 4), 19));
                    return true;
                }
                break;
            case 3020:
                h1Var = this;
                l H08 = p.H0(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                if (H08 != null && readInt10 >= 0 && readInt11 >= readInt10) {
                    h1Var.P0(H08, readInt9, 20, new l5.b(new p0(h1Var, readInt10, readInt11), 19));
                    return true;
                }
                break;
            case 3021:
                h1Var = this;
                l H09 = p.H0(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                if (H09 != null) {
                    h1Var.P0(H09, readInt12, 20, S0(new n9.j(29)));
                    return true;
                }
                break;
            case 3022:
                h1Var = this;
                l H010 = p.H0(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                int readInt15 = parcel.readInt();
                if (H010 != null && readInt14 >= 0 && readInt15 >= 0) {
                    h1Var.P0(H010, readInt13, 20, S0(new hh.c(readInt14, readInt15, 5)));
                    return true;
                }
                break;
            case 3023:
                h1Var = this;
                l H011 = p.H0(parcel.readStrongBinder());
                int readInt16 = parcel.readInt();
                final int readInt17 = parcel.readInt();
                final int readInt18 = parcel.readInt();
                final int readInt19 = parcel.readInt();
                if (H011 != null && readInt17 >= 0 && readInt18 >= readInt17 && readInt19 >= 0) {
                    h1Var.P0(H011, readInt16, 20, S0(new g2.k() {
                        @Override
                        public final void accept(Object obj) {
                            ((l1) obj).r0(readInt17, readInt18, readInt19);
                        }
                    }));
                    return true;
                }
                break;
            case 3024:
                h1Var = this;
                l H012 = p.H0(parcel.readStrongBinder());
                int readInt20 = parcel.readInt();
                if (H012 != null && (o10 = h1Var.f20661b.o(H012.asBinder())) != null) {
                    h1Var.O0(o10, readInt20);
                    return true;
                }
                break;
            case 3025:
                h1Var = this;
                l H013 = p.H0(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (H013 != null && (o11 = h1Var.f20661b.o(H013.asBinder())) != null) {
                    h1Var.Q0(o11, readInt21, 1, S0(new n9.j(8)));
                    return true;
                }
                break;
            case 3026:
                h1Var = this;
                l H014 = p.H0(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                if (H014 != null) {
                    h1Var.P0(H014, readInt22, 2, S0(new n9.j(27)));
                    return true;
                }
                break;
            case 3027:
                h1Var = this;
                l H015 = p.H0(parcel.readStrongBinder());
                int readInt23 = parcel.readInt();
                Bundle bundle2 = (Bundle) we.a(parcel, Bundle.CREATOR);
                if (H015 != null && bundle2 != null) {
                    try {
                        h1Var.P0(H015, readInt23, 13, S0(new l5.b(new d2.y0(bundle2.getFloat(d2.y0.f8515e, 1.0f), bundle2.getFloat(d2.y0.f8516f, 1.0f)), 18)));
                    } catch (RuntimeException e11) {
                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e11);
                    }
                }
                break;
            case 3028:
                h1Var = this;
                l H016 = p.H0(parcel.readStrongBinder());
                int readInt24 = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (H016 != null && readFloat > 0.0f) {
                    h1Var.P0(H016, readInt24, 13, S0(new k2.t(readFloat, 1)));
                    return true;
                }
                break;
            case 3029:
                h1Var = this;
                l H017 = p.H0(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                Bundle bundle3 = (Bundle) we.a(parcel, Bundle.CREATOR);
                if (H017 != null && bundle3 != null && (o12 = h1Var.f20661b.o(H017.asBinder())) != null) {
                    try {
                        final d2.n0 a16 = d2.n0.a(o12.f20881c, bundle3);
                        h1Var.Q0(o12, readInt25, 20, new x0(new d4(8, new f1() {
                            @Override
                            public final Object i(e0 e0Var, v vVar, int i11) {
                                switch (r1) {
                                    case 0:
                                        return e0Var.l(vVar, g9.i0.u(a16));
                                    case 1:
                                        return e0Var.l(vVar, g9.i0.u(a16));
                                    default:
                                        return e0Var.l(vVar, g9.i0.u(a16));
                                }
                            }
                        }, new n9.j(21)), 1));
                    } catch (RuntimeException e12) {
                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e12);
                    }
                }
                break;
            case 3030:
                h1Var = this;
                l H018 = p.H0(parcel.readStrongBinder());
                int readInt26 = parcel.readInt();
                int readInt27 = parcel.readInt();
                Bundle bundle4 = (Bundle) we.a(parcel, Bundle.CREATOR);
                if (H018 != null && bundle4 != null && readInt27 >= 0 && (o13 = h1Var.f20661b.o(H018.asBinder())) != null) {
                    try {
                        final d2.n0 a17 = d2.n0.a(o13.f20881c, bundle4);
                        h1Var.Q0(o13, readInt26, 20, new x0(new d4(8, new f1() {
                            @Override
                            public final Object i(e0 e0Var, v vVar, int i11) {
                                switch (r1) {
                                    case 0:
                                        return e0Var.l(vVar, g9.i0.u(a17));
                                    case 1:
                                        return e0Var.l(vVar, g9.i0.u(a17));
                                    default:
                                        return e0Var.l(vVar, g9.i0.u(a17));
                                }
                            }
                        }, new q0(h1Var, readInt27, 1)), 1));
                    } catch (RuntimeException e13) {
                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e13);
                    }
                }
                break;
            case 3031:
                h1Var = this;
                l H019 = p.H0(parcel.readStrongBinder());
                int readInt28 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (H019 != null && readStrongBinder != null && (o14 = h1Var.f20661b.o(H019.asBinder())) != null) {
                    try {
                        g9.i0 a18 = d2.h.a(readStrongBinder);
                        g9.f0 p10 = g9.i0.p();
                        for (int i11 = 0; i11 < a18.size(); i11++) {
                            Bundle bundle5 = (Bundle) a18.get(i11);
                            bundle5.getClass();
                            p10.c(d2.n0.a(o14.f20881c, bundle5));
                        }
                        h1Var.Q0(o14, readInt28, 20, new x0(new d4(8, new k2.z(3, p10.f()), new n9.j(20)), 1));
                    } catch (RuntimeException e14) {
                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e14);
                    }
                }
                break;
            case 3032:
                h1Var = this;
                l H020 = p.H0(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                int readInt30 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (H020 != null && readStrongBinder2 != null && readInt30 >= 0 && (o15 = h1Var.f20661b.o(H020.asBinder())) != null) {
                    try {
                        g9.i0 a19 = d2.h.a(readStrongBinder2);
                        g9.f0 p11 = g9.i0.p();
                        for (int i12 = 0; i12 < a19.size(); i12++) {
                            Bundle bundle6 = (Bundle) a19.get(i12);
                            bundle6.getClass();
                            p11.c(d2.n0.a(o15.f20881c, bundle6));
                        }
                        h1Var.Q0(o15, readInt29, 20, new x0(new d4(8, new k2.z(2, p11.f()), new q0(h1Var, readInt30, 3)), 1));
                    } catch (RuntimeException e15) {
                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e15);
                    }
                }
                break;
            case 3033:
                h1Var = this;
                l H021 = p.H0(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                Bundle bundle7 = (Bundle) we.a(parcel, Bundle.CREATOR);
                if (H021 != null && bundle7 != null && (o16 = h1Var.f20661b.o(H021.asBinder())) != null) {
                    try {
                        h1Var.Q0(o16, readInt31, 19, S0(new k2.r(d2.q0.b(o16.f20881c, bundle7))));
                    } catch (RuntimeException e16) {
                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e16);
                    }
                }
                break;
            case 3034:
                h1Var = this;
                l H022 = p.H0(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                if (H022 != null && (o17 = h1Var.f20661b.o(H022.asBinder())) != null) {
                    h1Var.Q0(o17, readInt32, 3, S0(new n9.j(23)));
                    return true;
                }
                break;
            case 3035:
                h1Var = this;
                l H023 = p.H0(parcel.readStrongBinder());
                parcel.readInt();
                if (H023 != null) {
                    long clearCallingIdentity2 = Binder.clearCallingIdentity();
                    try {
                        e0 e0Var = (e0) h1Var.f20660a.get();
                        if (e0Var != null && !e0Var.j()) {
                            g2.n0.W(e0Var.f20628l, new m2.s(16, h1Var, H023));
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3036:
                h1Var = this;
                l H024 = p.H0(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                if (H024 != null) {
                    h1Var.P0(H024, readInt33, 4, S0(new n9.j(25)));
                    return true;
                }
                break;
            case 3037:
                h1Var = this;
                l H025 = p.H0(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                int readInt35 = parcel.readInt();
                if (H025 != null && readInt35 >= 0) {
                    h1Var.P0(H025, readInt34, 10, new l5.b(new q0(h1Var, readInt35, 0), 19));
                    return true;
                }
                break;
            case 3038:
                h1Var = this;
                l H026 = p.H0(parcel.readStrongBinder());
                int readInt36 = parcel.readInt();
                long readLong = parcel.readLong();
                if (H026 != null) {
                    h1Var.P0(H026, readInt36, 5, S0(new m2.e0(readLong)));
                    return true;
                }
                break;
            case 3039:
                l H027 = p.H0(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                int readInt38 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (H027 != null && readInt38 >= 0) {
                    P0(H027, readInt37, 10, new l5.b(new b4.o(this, readInt38, readLong2, 2), 19));
                    return true;
                }
                break;
            case 3040:
                l H028 = p.H0(parcel.readStrongBinder());
                int readInt39 = parcel.readInt();
                if (H028 != null && (o18 = this.f20661b.o(H028.asBinder())) != null) {
                    Q0(o18, readInt39, 11, S0(new n9.j(12)));
                    return true;
                }
                break;
            case 3041:
                l H029 = p.H0(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                if (H029 != null && (o19 = this.f20661b.o(H029.asBinder())) != null) {
                    Q0(o19, readInt40, 12, S0(new n9.j(16)));
                    return true;
                }
                break;
            case 3042:
                l H030 = p.H0(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (H030 != null) {
                    P0(H030, readInt41, 6, S0(new n9.j(14)));
                    return true;
                }
                break;
            case 3043:
                l H031 = p.H0(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (H031 != null) {
                    P0(H031, readInt42, 8, S0(new n9.j(9)));
                    return true;
                }
                break;
            case 3044:
                l H032 = p.H0(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                Surface surface = (Surface) we.a(parcel, Surface.CREATOR);
                if (H032 != null) {
                    P0(H032, readInt43, 27, S0(new d4(6, this, surface)));
                    return true;
                }
                break;
            case 3045:
                l H033 = p.H0(parcel.readStrongBinder());
                if (H033 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        e0 e0Var2 = (e0) this.f20660a.get();
                        if (e0Var2 != null && !e0Var2.j()) {
                            v o25 = this.f20661b.o(H033.asBinder());
                            if (o25 != null) {
                                g2.n0.W(e0Var2.f20628l, new m2.s(17, this, o25));
                            }
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3046:
                l H034 = p.H0(parcel.readStrongBinder());
                int readInt44 = parcel.readInt();
                if (H034 != null && (o20 = this.f20661b.o(H034.asBinder())) != null) {
                    Q0(o20, readInt44, 7, S0(new n9.j(13)));
                    return true;
                }
                break;
            case 3047:
                l H035 = p.H0(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                if (H035 != null && (o21 = this.f20661b.o(H035.asBinder())) != null) {
                    Q0(o21, readInt45, 9, S0(new n9.j(17)));
                    return true;
                }
                break;
            case 3048:
                l H036 = p.H0(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                Bundle bundle8 = (Bundle) we.a(parcel, Bundle.CREATOR);
                if (H036 != null && bundle8 != null) {
                    try {
                        P0(H036, readInt46, 29, S0(new d4(4, this, d2.s1.b(bundle8))));
                        break;
                    } catch (RuntimeException e17) {
                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e17);
                        break;
                    }
                }
                break;
            case 3049:
                l H037 = p.H0(parcel.readStrongBinder());
                int readInt47 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle9 = (Bundle) we.a(parcel, Bundle.CREATOR);
                if (H037 != null && readString != null && bundle9 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        g2.a.l("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            h1Var2 = this;
                            h1Var2.J0(H037, readInt47, null, 40010, new x0(new n9.j(readString, 18, d2.f1.a(bundle9)), 1));
                            break;
                        } catch (RuntimeException e18) {
                            g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e18);
                            break;
                        }
                    }
                }
                break;
            case 3050:
                l H038 = p.H0(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                Bundle bundle10 = (Bundle) we.a(parcel, Bundle.CREATOR);
                if (H038 != null && bundle10 != null) {
                    try {
                        J0(H038, readInt48, null, 40010, new x0(new v0(d2.f1.a(bundle10)), 1));
                    } catch (RuntimeException e19) {
                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e19);
                    }
                }
                break;
            case 3051:
                l H039 = p.H0(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                int readInt50 = parcel.readInt();
                int readInt51 = parcel.readInt();
                if (H039 != null && readInt50 >= 0) {
                    P0(H039, readInt49, 33, S0(new hh.c(readInt50, readInt51, 4)));
                    return true;
                }
                break;
            case 3052:
                l H040 = p.H0(parcel.readStrongBinder());
                int readInt52 = parcel.readInt();
                int readInt53 = parcel.readInt();
                if (H040 != null) {
                    P0(H040, readInt52, 34, S0(new k2.v(readInt53, 4)));
                    return true;
                }
                break;
            case 3053:
                l H041 = p.H0(parcel.readStrongBinder());
                int readInt54 = parcel.readInt();
                int readInt55 = parcel.readInt();
                if (H041 != null) {
                    P0(H041, readInt54, 34, S0(new k2.v(readInt55, 3)));
                    return true;
                }
                break;
            case 3054:
                l H042 = p.H0(parcel.readStrongBinder());
                int readInt56 = parcel.readInt();
                final boolean z12 = parcel.readInt() != 0;
                final int readInt57 = parcel.readInt();
                if (H042 != null) {
                    P0(H042, readInt56, 34, S0(new g2.k() {
                        @Override
                        public final void accept(Object obj) {
                            ((l1) obj).H(readInt57, z12);
                        }
                    }));
                    return true;
                }
                break;
            case 3055:
                l H043 = p.H0(parcel.readStrongBinder());
                int readInt58 = parcel.readInt();
                int readInt59 = parcel.readInt();
                Bundle bundle11 = (Bundle) we.a(parcel, Bundle.CREATOR);
                if (H043 != null && bundle11 != null && readInt59 >= 0 && (o22 = this.f20661b.o(H043.asBinder())) != null) {
                    try {
                        final d2.n0 a20 = d2.n0.a(o22.f20881c, bundle11);
                        Q0(o22, readInt58, 20, new x0(new d4(8, new f1() {
                            @Override
                            public final Object i(e0 e0Var3, v vVar, int i112) {
                                switch (r1) {
                                    case 0:
                                        return e0Var3.l(vVar, g9.i0.u(a20));
                                    case 1:
                                        return e0Var3.l(vVar, g9.i0.u(a20));
                                    default:
                                        return e0Var3.l(vVar, g9.i0.u(a20));
                                }
                            }
                        }, new q0(this, readInt59, 2)), 1));
                        break;
                    } catch (RuntimeException e20) {
                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e20);
                        break;
                    }
                }
                break;
            case 3056:
                l H044 = p.H0(parcel.readStrongBinder());
                int readInt60 = parcel.readInt();
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (H044 != null && readStrongBinder3 != null && readInt61 >= 0 && readInt62 >= readInt61 && (o23 = this.f20661b.o(H044.asBinder())) != null) {
                    try {
                        g9.i0 a21 = d2.h.a(readStrongBinder3);
                        g9.f0 p12 = g9.i0.p();
                        for (int i13 = 0; i13 < a21.size(); i13++) {
                            Bundle bundle12 = (Bundle) a21.get(i13);
                            bundle12.getClass();
                            p12.c(d2.n0.a(o23.f20881c, bundle12));
                        }
                        Q0(o23, readInt60, 20, new x0(new d4(8, new l5.b(p12.f(), 17), new p0(this, readInt61, readInt62)), 1));
                        break;
                    } catch (RuntimeException e21) {
                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e21);
                        break;
                    }
                }
                break;
            case 3057:
                l H045 = p.H0(parcel.readStrongBinder());
                int readInt63 = parcel.readInt();
                Bundle bundle13 = (Bundle) we.a(parcel, Bundle.CREATOR);
                boolean z13 = parcel.readInt() != 0;
                if (H045 != null && bundle13 != null) {
                    try {
                        P0(H045, readInt63, 35, S0(new ei.f(3, d2.f.a(bundle13), z13)));
                        break;
                    } catch (RuntimeException e22) {
                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e22);
                        break;
                    }
                }
                break;
            case 3058:
                l H046 = p.H0(parcel.readStrongBinder());
                int readInt64 = parcel.readInt();
                if (H046 != null) {
                    P0(H046, readInt64, 24, S0(new n9.j(7)));
                    return true;
                }
                break;
            case 3059:
                l H047 = p.H0(parcel.readStrongBinder());
                int readInt65 = parcel.readInt();
                if (H047 != null) {
                    P0(H047, readInt65, 24, S0(new n9.j(24)));
                    return true;
                }
                break;
            case 3060:
                l H048 = p.H0(parcel.readStrongBinder());
                int readInt66 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                N0(H048, readInt66, (Bundle) we.a(parcel, creator2), (Bundle) we.a(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                l H049 = p.H0(parcel.readStrongBinder());
                int readInt67 = parcel.readInt();
                Surface surface2 = (Surface) we.a(parcel, Surface.CREATOR);
                int readInt68 = parcel.readInt();
                int readInt69 = parcel.readInt();
                if (H049 != null) {
                    P0(H049, readInt67, 27, S0(new r0(this, surface2, readInt68, readInt69)));
                    return true;
                }
                break;
            case 3062:
                l H050 = p.H0(parcel.readStrongBinder());
                int readInt70 = parcel.readInt();
                int readInt71 = parcel.readInt();
                int readInt72 = parcel.readInt();
                if (H050 != null) {
                    P0(H050, readInt70, 27, S0(new p0(this, readInt71, readInt72)));
                    return true;
                }
                break;
            default:
                switch (i3) {
                    case 4001:
                        l H051 = p.H0(parcel.readStrongBinder());
                        int readInt73 = parcel.readInt();
                        Bundle bundle14 = (Bundle) we.a(parcel, Bundle.CREATOR);
                        if (H051 != null) {
                            if (bundle14 != null) {
                                try {
                                    a14 = q.a(bundle14);
                                } catch (RuntimeException e23) {
                                    g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e23);
                                    break;
                                }
                            }
                            h1Var2 = this;
                            h1Var2.J0(H051, readInt73, null, 50000, new x0(new n9.j(a14, 26), 0));
                            break;
                        }
                        break;
                    case 4002:
                        l H052 = p.H0(parcel.readStrongBinder());
                        int readInt74 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (H052 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                g2.a.l("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            J0(H052, readInt74, null, 50004, new x0(new n9.j(readString2, 15), 0));
                            return true;
                        }
                        break;
                    case 4003:
                        l H053 = p.H0(parcel.readStrongBinder());
                        int readInt75 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt76 = parcel.readInt();
                        int readInt77 = parcel.readInt();
                        Bundle bundle15 = (Bundle) we.a(parcel, Bundle.CREATOR);
                        if (H053 != null) {
                            if (TextUtils.isEmpty(readString3)) {
                                g2.a.l("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (readInt76 < 0) {
                                g2.a.l("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (readInt77 < 1) {
                                g2.a.l("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle15 != null) {
                                    try {
                                        a13 = q.a(bundle15);
                                    } catch (RuntimeException e24) {
                                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e24);
                                    }
                                }
                                J0(H053, readInt75, null, 50003, new x0(new n9.j(readString3, readInt76, readInt77, a13, 6), 0));
                            }
                        }
                        break;
                    case 4004:
                        l H054 = p.H0(parcel.readStrongBinder());
                        int readInt78 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle16 = (Bundle) we.a(parcel, Bundle.CREATOR);
                        if (H054 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                g2.a.l("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle16 != null) {
                                    try {
                                        a12 = q.a(bundle16);
                                    } catch (RuntimeException e25) {
                                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e25);
                                    }
                                }
                                J0(H054, readInt78, null, 50005, new x0(new v0(readString4, a12), 0));
                            }
                        }
                        break;
                    case 4005:
                        l H055 = p.H0(parcel.readStrongBinder());
                        int readInt79 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt80 = parcel.readInt();
                        int readInt81 = parcel.readInt();
                        Bundle bundle17 = (Bundle) we.a(parcel, Bundle.CREATOR);
                        if (H055 != null) {
                            if (TextUtils.isEmpty(readString5)) {
                                g2.a.l("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (readInt80 < 0) {
                                g2.a.l("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (readInt81 < 1) {
                                g2.a.l("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle17 != null) {
                                    try {
                                        a11 = q.a(bundle17);
                                    } catch (RuntimeException e26) {
                                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e26);
                                    }
                                }
                                J0(H055, readInt79, null, 50006, new x0(new n9.j(readString5, readInt80, readInt81, a11, 22), 0));
                            }
                        }
                        break;
                    case 4006:
                        l H056 = p.H0(parcel.readStrongBinder());
                        int readInt82 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle18 = (Bundle) we.a(parcel, Bundle.CREATOR);
                        if (H056 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                g2.a.l("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle18 != null) {
                                    try {
                                        a10 = q.a(bundle18);
                                    } catch (RuntimeException e27) {
                                        g2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e27);
                                    }
                                }
                                J0(H056, readInt82, null, 50001, new x0(new n9.j(readString6, 28, a10), 0));
                            }
                        }
                        break;
                    case 4007:
                        l H057 = p.H0(parcel.readStrongBinder());
                        int readInt83 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (H057 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                g2.a.l("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            J0(H057, readInt83, null, 50002, new x0(new n9.j(readString7, 5), 0));
                            return true;
                        }
                        break;
                    default:
                        return super.onTransact(i3, parcel, parcel2, i10);
                }
        }
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
