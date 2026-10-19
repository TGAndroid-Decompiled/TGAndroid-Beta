package m4;

import ai.vb;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import b2.v1;
import e9.c2;
import e9.m2;
import e9.w1;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
public final class i1 extends Binder implements m {
    public final WeakReference f16563a;
    public final qi.e f16564b;
    public final Set f16565c;
    public w1 d;
    public c2 e;
    public int f16566f;
    public h1 f16567i;

    public i1(f0 f0Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.f16563a = new WeakReference(f0Var);
        this.f16564b = new qi.e(f0Var);
        this.f16565c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = w1.f8524r;
        this.e = c2.h;
    }

    public static j9.y I0(f0 f0Var, v vVar, int i10, g1 g1Var, e2.j jVar) {
        if (f0Var.j()) {
            return j9.w.f14361b;
        }
        j9.y yVar = (j9.y) g1Var.e(f0Var, vVar, i10);
        ?? obj = new Object();
        yVar.a(new ai.y0(f0Var, (Object) obj, jVar, yVar, 28), j9.r.f14356a);
        return obj;
    }

    public static void P0(f0 f0Var, v vVar, int i10, s1 s1Var) {
        try {
            u uVar = vVar.d;
            uVar.getClass();
            uVar.j(i10, s1Var);
            f0Var.f16520c.a(true, true);
        } catch (RemoteException e) {
            e2.a.m("MediaSessionStub", "Failed to send result to controller " + vVar, e);
        }
    }

    public static j5.b Q0(e2.j jVar) {
        return new j5.b(new j5.b(jVar, 16), 15);
    }

    public final void F0(l lVar, Bundle bundle) {
        WeakReference weakReference = this.f16563a;
        f0 f0Var = (f0) weakReference.get();
        if (lVar != null && bundle != null && f0Var != null) {
            try {
                Context context = f0Var.f16521f;
                i a2 = i.a(bundle);
                int callingUid = Binder.getCallingUid();
                int callingPid = Binder.getCallingPid();
                String str = a2.f16560c;
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                if (packagesForUid != null && packagesForUid.length != 0) {
                    for (String str2 : packagesForUid) {
                        if (!str2.equals(str)) {
                        }
                    }
                    e2.a.l("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                    w7.w.a(lVar);
                    return;
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = a2.d;
                }
                try {
                    n4.t tVar = new n4.t(str, callingPid, callingUid);
                    boolean b10 = n4.w.a(context).b(tVar);
                    int i10 = a2.f16558a;
                    int i11 = a2.f16559b;
                    v vVar = new v(tVar, i10, i11, b10, new d1(lVar, i11), a2.e);
                    f0 f0Var2 = (f0) weakReference.get();
                    if (f0Var2 != null && !f0Var2.j()) {
                        this.f16565c.add(vVar);
                        e2.m0.W(f0Var2.f16526l, new ai.y0(this, vVar, f0Var2, lVar, 27));
                        return;
                    }
                    w7.w.a(lVar);
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e);
                return;
            }
        }
        w7.w.a(lVar);
    }

    public final void G0(l lVar, int i10) {
        if (lVar == null) {
            return;
        }
        N0(lVar, i10, 26, Q0(new k2.f0(26)));
    }

    public final void H0(l lVar, int i10, o1 o1Var, int i11, g1 g1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            f0 f0Var = (f0) this.f16563a.get();
            if (f0Var != null && !f0Var.j()) {
                v q6 = this.f16564b.q(lVar.asBinder());
                if (q6 == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return;
                }
                e2.m0.W(f0Var.f16526l, new y0(this, q6, o1Var, f0Var, i10, i11, g1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void J0(l lVar, int i10) {
        if (lVar == null) {
            return;
        }
        N0(lVar, i10, 26, Q0(new k2.f0(18)));
    }

    public final int K0(v vVar, m1 m1Var, int i10) {
        if (m1Var.o0(17)) {
            qi.e eVar = this.f16564b;
            if (!eVar.x(vVar, 17) && eVar.x(vVar, 16)) {
                return m1Var.n0() + i10;
            }
        }
        return i10;
    }

    public final void L0(l lVar, int i10, Bundle bundle, Bundle bundle2, boolean z10) {
        o1 o1Var;
        Bundle o10 = e2.m0.o(bundle2);
        if (lVar != null && bundle != null && o10 != null) {
            try {
                int i11 = bundle.getInt(o1.f16654f, 0);
                if (i11 != 0) {
                    o1Var = new o1(i11);
                } else {
                    String string = bundle.getString(o1.f16655g);
                    string.getClass();
                    Bundle o11 = e2.m0.o(bundle.getBundle(o1.h));
                    if (o11 == null) {
                        o11 = Bundle.EMPTY;
                    }
                    o1Var = new o1(string, o11);
                }
                if (d.j(o1Var.f16657b)) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        f0 f0Var = (f0) this.f16563a.get();
                        if (f0Var != null && !f0Var.j()) {
                            v q6 = this.f16564b.q(lVar.asBinder());
                            if (q6 == null) {
                                Binder.restoreCallingIdentity(clearCallingIdentity);
                                return;
                            }
                            e2.m0.W(f0Var.f16526l, new vb(this, q6, o1Var, f0Var, i10, lVar, 2));
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            return;
                        }
                        return;
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                H0(lVar, i10, o1Var, 0, new z0(new k2.f0(z10, o1Var, o10), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
            }
        }
    }

    public final void M0(v vVar, int i10) {
        O0(vVar, i10, 1, Q0(new ah.h0(29, this, vVar)));
    }

    public final void N0(l lVar, int i10, int i11, j5.b bVar) {
        v q6 = this.f16564b.q(lVar.asBinder());
        if (q6 != null) {
            O0(q6, i10, i11, bVar);
        }
    }

    public final void O0(v vVar, int i10, int i11, g1 g1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            f0 f0Var = (f0) this.f16563a.get();
            if (f0Var != null && !f0Var.j()) {
                e2.m0.W(f0Var.f16526l, new ki.h0(this, vVar, i11, f0Var, i10, g1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void R0(l lVar, int i10, boolean z10) {
        if (lVar == null) {
            return;
        }
        N0(lVar, i10, 26, Q0(new i2.y(3, z10)));
    }

    public final void S0(l lVar, int i10, int i11) {
        if (lVar != null && i11 >= 0) {
            N0(lVar, i10, 25, Q0(new i2.w(i11, 6)));
        }
    }

    public final void T0(l lVar, int i10, Bundle bundle, boolean z10) {
        v q6;
        if (lVar != null && bundle != null && (q6 = this.f16564b.q(lVar.asBinder())) != null) {
            try {
                O0(q6, i10, 31, new z0(new w0(1, new ci.f(2, b2.o0.a(q6.f16760c, bundle), z10), new v0(8)), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void U0(l lVar, int i10, Bundle bundle, long j10) {
        v q6;
        if (lVar != null && bundle != null && (q6 = this.f16564b.q(lVar.asBinder())) != null) {
            try {
                O0(q6, i10, 31, new z0(new w0(1, new ci.d1(b2.o0.a(q6.f16760c, bundle), j10, 2), new v0(8)), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void V0(l lVar, int i10, IBinder iBinder, boolean z10) {
        v q6;
        if (lVar != null && iBinder != null && (q6 = this.f16564b.q(lVar.asBinder())) != null) {
            try {
                e9.n0 a2 = b2.h.a(iBinder);
                e9.k0 t10 = e9.n0.t();
                for (int i11 = 0; i11 < a2.size(); i11++) {
                    Bundle bundle = (Bundle) a2.get(i11);
                    bundle.getClass();
                    t10.c(b2.o0.a(q6.f16760c, bundle));
                }
                O0(q6, i10, 20, new z0(new w0(1, new ci.f(4, t10.f(), z10), new v0(8)), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void W0(l lVar, int i10, IBinder iBinder, int i11, long j10) {
        v q6;
        if (lVar != null && iBinder != null) {
            if ((i11 == -1 || i11 >= 0) && (q6 = this.f16564b.q(lVar.asBinder())) != null) {
                try {
                    e9.n0 a2 = b2.h.a(iBinder);
                    e9.k0 t10 = e9.n0.t();
                    for (int i12 = 0; i12 < a2.size(); i12++) {
                        Bundle bundle = (Bundle) a2.get(i12);
                        bundle.getClass();
                        t10.c(b2.o0.a(q6.f16760c, bundle));
                    }
                    O0(q6, i10, 20, new z0(new w0(1, new j2.d(t10.f(), i11, j10, 2), new v0(8)), 1));
                } catch (RuntimeException e) {
                    e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
                }
            }
        }
    }

    public final void X0(l lVar, int i10, float f7) {
        if (lVar != null && f7 >= 0.0f && f7 <= 1.0f) {
            N0(lVar, i10, 24, Q0(new i2.v(f7, 2)));
        }
    }

    public final k1 Y0(k1 k1Var) {
        w1 w1Var;
        e9.n0 n0Var = k1Var.F.f4087a;
        ?? aVar = new a5.a(4, 5);
        a5.a aVar2 = new a5.a(4, 5);
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            b2.p1 p1Var = ((b2.u1) n0Var.get(i10)).f4059b;
            String str = (String) this.d.get(p1Var);
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                int i11 = this.f16566f;
                this.f16566f = i11 + 1;
                String str2 = e2.m0.f8252a;
                sb2.append(Integer.toString(i11, 36));
                sb2.append("-");
                sb2.append(p1Var.f3901b);
                str = sb2.toString();
            }
            aVar.I(p1Var, str);
            aVar2.x(p1Var.f3901b, str);
        }
        if (aVar.f281b == 0) {
            w1Var = w1.f8524r;
        } else {
            w1Var = new w1(aVar.f281b, (Object[]) aVar.f282c);
        }
        this.d = w1Var;
        this.e = aVar2.e(false);
        e9.k0 t10 = e9.n0.t();
        for (int i12 = 0; i12 < n0Var.size(); i12++) {
            b2.u1 u1Var = (b2.u1) n0Var.get(i12);
            t10.c(new b2.u1(Z0(u1Var.f4059b), u1Var.f4060c, u1Var.d, u1Var.e));
        }
        k1 a2 = k1Var.a(new v1(t10.f()));
        b2.t1 t1Var = a2.G;
        if (t1Var.H.isEmpty()) {
            return a2;
        }
        b2.s1 c10 = t1Var.a().c();
        m2 it = t1Var.H.values().iterator();
        while (it.hasNext()) {
            b2.q1 q1Var = (b2.q1) it.next();
            c10.a(new b2.q1(Z0(q1Var.f3927a), q1Var.f3928b));
        }
        return a2.d(c10.b());
    }

    public final b2.p1 Z0(b2.p1 p1Var) {
        String str;
        String str2 = (String) this.d.get(p1Var);
        if (str2 == null) {
            str2 = p1Var.f3901b;
        }
        int i10 = 0;
        while (true) {
            int i11 = p1Var.f3900a;
            b2.w[] wVarArr = p1Var.d;
            if (i10 < i11) {
                if (wVarArr[i10].f4122m != null) {
                    b2.w[] wVarArr2 = new b2.w[i11];
                    for (int i12 = 0; i12 < p1Var.f3900a; i12++) {
                        b2.w wVar = wVarArr[i12];
                        String str3 = wVar.f4122m;
                        if (str3 != null) {
                            str = (String) this.e.get(str3);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            b2.v a2 = wVar.a();
                            a2.f4069l = str;
                            wVarArr2[i12] = new b2.w(a2);
                        } else {
                            wVarArr2[i12] = wVar;
                        }
                    }
                    return new b2.p1(str2, wVarArr2);
                }
                i10++;
            } else {
                return new b2.p1(str2, wVarArr);
            }
        }
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        h hVar;
        i1 i1Var;
        v q6;
        v q10;
        v q11;
        v q12;
        v q13;
        v q14;
        v q15;
        v q16;
        v q17;
        v q18;
        v q19;
        v q20;
        i1 i1Var2;
        v q21;
        v q22;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        q a2 = null;
        q a10 = null;
        q a11 = null;
        q a12 = null;
        q a13 = null;
        switch (i10) {
            case 3002:
                X0(p.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                S0(p.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                J0(p.F0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                G0(p.F0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                R0(p.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                T0(p.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.u.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                U0(p.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.u.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                T0(p.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.u.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                V0(p.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                V0(p.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                W0(p.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                l F0 = p.F0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                boolean z10 = parcel.readInt() != 0;
                if (F0 != null) {
                    N0(F0, readInt, 1, Q0(new i2.y(2, z10)));
                    return true;
                }
                break;
            case 3014:
                l F02 = p.F0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F02 != null && bundle != null) {
                    try {
                        s1 a14 = s1.a(bundle);
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            qi.e eVar = this.f16564b;
                            IBinder asBinder = F02.asBinder();
                            synchronized (eVar.f44752a) {
                                v q23 = eVar.q(asBinder);
                                hVar = q23 != null ? (h) ((a0.f) eVar.f44754c).get(q23) : null;
                            }
                            com.google.android.gms.common.api.internal.u uVar = hVar != null ? hVar.f16543b : null;
                            if (uVar != null) {
                                uVar.i(readInt2, a14);
                            }
                            break;
                        } finally {
                        }
                    } catch (RuntimeException e) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
                        break;
                    }
                }
                break;
            case 3015:
                l F03 = p.F0(parcel.readStrongBinder());
                parcel.readInt();
                F0(F03, (Bundle) w7.u.a(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                l F04 = p.F0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                L0(F04, readInt3, (Bundle) w7.u.a(parcel, creator), (Bundle) w7.u.a(parcel, creator), false);
                return true;
            case 3017:
                i1Var = this;
                l F05 = p.F0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                int readInt5 = parcel.readInt();
                if (F05 != null && (readInt5 == 2 || readInt5 == 0 || readInt5 == 1)) {
                    i1Var.N0(F05, readInt4, 15, Q0(new i2.w(readInt5, 5)));
                    return true;
                }
                break;
            case 3018:
                i1Var = this;
                l F06 = p.F0(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                boolean z11 = parcel.readInt() != 0;
                if (F06 != null) {
                    i1Var.N0(F06, readInt6, 14, Q0(new i2.y(4, z11)));
                    return true;
                }
                break;
            case 3019:
                i1Var = this;
                l F07 = p.F0(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                if (F07 != null && readInt8 >= 0) {
                    i1Var.N0(F07, readInt7, 20, new j5.b(new r0(i1Var, readInt8, 4), 15));
                    return true;
                }
                break;
            case 3020:
                i1Var = this;
                l F08 = p.F0(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                if (F08 != null && readInt10 >= 0 && readInt11 >= readInt10) {
                    i1Var.N0(F08, readInt9, 20, new j5.b(new q0(i1Var, readInt10, readInt11), 15));
                    return true;
                }
                break;
            case 3021:
                i1Var = this;
                l F09 = p.F0(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                if (F09 != null) {
                    i1Var.N0(F09, readInt12, 20, Q0(new v0(6)));
                    return true;
                }
                break;
            case 3022:
                i1Var = this;
                l F010 = p.F0(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                int readInt15 = parcel.readInt();
                if (F010 != null && readInt14 >= 0 && readInt15 >= 0) {
                    i1Var.N0(F010, readInt13, 20, Q0(new eh.c(readInt14, readInt15, 5)));
                    return true;
                }
                break;
            case 3023:
                i1Var = this;
                l F011 = p.F0(parcel.readStrongBinder());
                int readInt16 = parcel.readInt();
                final int readInt17 = parcel.readInt();
                final int readInt18 = parcel.readInt();
                final int readInt19 = parcel.readInt();
                if (F011 != null && readInt17 >= 0 && readInt18 >= readInt17 && readInt19 >= 0) {
                    i1Var.N0(F011, readInt16, 20, Q0(new e2.j() {
                        @Override
                        public final void accept(Object obj) {
                            ((m1) obj).t0(readInt17, readInt18, readInt19);
                        }
                    }));
                    return true;
                }
                break;
            case 3024:
                i1Var = this;
                l F012 = p.F0(parcel.readStrongBinder());
                int readInt20 = parcel.readInt();
                if (F012 != null && (q6 = i1Var.f16564b.q(F012.asBinder())) != null) {
                    i1Var.M0(q6, readInt20);
                    return true;
                }
                break;
            case 3025:
                i1Var = this;
                l F013 = p.F0(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (F013 != null && (q10 = i1Var.f16564b.q(F013.asBinder())) != null) {
                    i1Var.O0(q10, readInt21, 1, Q0(new k2.f0(15)));
                    return true;
                }
                break;
            case 3026:
                i1Var = this;
                l F014 = p.F0(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                if (F014 != null) {
                    i1Var.N0(F014, readInt22, 2, Q0(new v0(4)));
                    return true;
                }
                break;
            case 3027:
                i1Var = this;
                l F015 = p.F0(parcel.readStrongBinder());
                int readInt23 = parcel.readInt();
                Bundle bundle2 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F015 != null && bundle2 != null) {
                    try {
                        i1Var.N0(F015, readInt23, 13, Q0(new j5.b(new b2.z0(bundle2.getFloat(b2.z0.e, 1.0f), bundle2.getFloat(b2.z0.f4151f, 1.0f)), 14)));
                    } catch (RuntimeException e7) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e7);
                    }
                }
                break;
            case 3028:
                i1Var = this;
                l F016 = p.F0(parcel.readStrongBinder());
                int readInt24 = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (F016 != null && readFloat > 0.0f) {
                    i1Var.N0(F016, readInt24, 13, Q0(new i2.v(readFloat, 1)));
                    return true;
                }
                break;
            case 3029:
                i1Var = this;
                l F017 = p.F0(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                Bundle bundle3 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F017 != null && bundle3 != null && (q11 = i1Var.f16564b.q(F017.asBinder())) != null) {
                    try {
                        final b2.o0 a15 = b2.o0.a(q11.f16760c, bundle3);
                        i1Var.O0(q11, readInt25, 20, new z0(new w0(2, new g1() {
                            @Override
                            public final Object e(f0 f0Var, v vVar, int i12) {
                                switch (r2) {
                                    case 0:
                                        return f0Var.l(vVar, e9.n0.y(a15));
                                    case 1:
                                        return f0Var.l(vVar, e9.n0.y(a15));
                                    default:
                                        return f0Var.l(vVar, e9.n0.y(a15));
                                }
                            }
                        }, new k2.f0(28)), 1));
                    } catch (RuntimeException e10) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
                    }
                }
                break;
            case 3030:
                i1Var = this;
                l F018 = p.F0(parcel.readStrongBinder());
                int readInt26 = parcel.readInt();
                int readInt27 = parcel.readInt();
                Bundle bundle4 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F018 != null && bundle4 != null && readInt27 >= 0 && (q12 = i1Var.f16564b.q(F018.asBinder())) != null) {
                    try {
                        final b2.o0 a16 = b2.o0.a(q12.f16760c, bundle4);
                        i1Var.O0(q12, readInt26, 20, new z0(new w0(2, new g1() {
                            @Override
                            public final Object e(f0 f0Var, v vVar, int i12) {
                                switch (r2) {
                                    case 0:
                                        return f0Var.l(vVar, e9.n0.y(a16));
                                    case 1:
                                        return f0Var.l(vVar, e9.n0.y(a16));
                                    default:
                                        return f0Var.l(vVar, e9.n0.y(a16));
                                }
                            }
                        }, new r0(i1Var, readInt27, 1)), 1));
                    } catch (RuntimeException e11) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
                    }
                }
                break;
            case 3031:
                i1Var = this;
                l F019 = p.F0(parcel.readStrongBinder());
                int readInt28 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (F019 != null && readStrongBinder != null && (q13 = i1Var.f16564b.q(F019.asBinder())) != null) {
                    try {
                        e9.n0 a17 = b2.h.a(readStrongBinder);
                        e9.k0 t10 = e9.n0.t();
                        for (int i12 = 0; i12 < a17.size(); i12++) {
                            Bundle bundle5 = (Bundle) a17.get(i12);
                            bundle5.getClass();
                            t10.c(b2.o0.a(q13.f16760c, bundle5));
                        }
                        i1Var.O0(q13, readInt28, 20, new z0(new w0(2, new i2.z(3, t10.f()), new k2.f0(27)), 1));
                    } catch (RuntimeException e12) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e12);
                    }
                }
                break;
            case 3032:
                i1Var = this;
                l F020 = p.F0(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                int readInt30 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (F020 != null && readStrongBinder2 != null && readInt30 >= 0 && (q14 = i1Var.f16564b.q(F020.asBinder())) != null) {
                    try {
                        e9.n0 a18 = b2.h.a(readStrongBinder2);
                        e9.k0 t11 = e9.n0.t();
                        for (int i13 = 0; i13 < a18.size(); i13++) {
                            Bundle bundle6 = (Bundle) a18.get(i13);
                            bundle6.getClass();
                            t11.c(b2.o0.a(q14.f16760c, bundle6));
                        }
                        i1Var.O0(q14, readInt29, 20, new z0(new w0(2, new i2.z(2, t11.f()), new r0(i1Var, readInt30, 3)), 1));
                    } catch (RuntimeException e13) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e13);
                    }
                }
                break;
            case 3033:
                i1Var = this;
                l F021 = p.F0(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                Bundle bundle7 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F021 != null && bundle7 != null && (q15 = i1Var.f16564b.q(F021.asBinder())) != null) {
                    try {
                        i1Var.O0(q15, readInt31, 19, Q0(new i2.t(b2.r0.b(q15.f16760c, bundle7))));
                    } catch (RuntimeException e14) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e14);
                    }
                }
                break;
            case 3034:
                i1Var = this;
                l F022 = p.F0(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                if (F022 != null && (q16 = i1Var.f16564b.q(F022.asBinder())) != null) {
                    i1Var.O0(q16, readInt32, 3, Q0(new v0(0)));
                    return true;
                }
                break;
            case 3035:
                i1Var = this;
                l F023 = p.F0(parcel.readStrongBinder());
                parcel.readInt();
                if (F023 != null) {
                    long clearCallingIdentity2 = Binder.clearCallingIdentity();
                    try {
                        f0 f0Var = (f0) i1Var.f16563a.get();
                        if (f0Var != null && !f0Var.j()) {
                            e2.m0.W(f0Var.f16526l, new z(2, i1Var, F023));
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3036:
                i1Var = this;
                l F024 = p.F0(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                if (F024 != null) {
                    i1Var.N0(F024, readInt33, 4, Q0(new v0(2)));
                    return true;
                }
                break;
            case 3037:
                i1Var = this;
                l F025 = p.F0(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                int readInt35 = parcel.readInt();
                if (F025 != null && readInt35 >= 0) {
                    i1Var.N0(F025, readInt34, 10, new j5.b(new r0(i1Var, readInt35, 0), 15));
                    return true;
                }
                break;
            case 3038:
                i1Var = this;
                l F026 = p.F0(parcel.readStrongBinder());
                int readInt36 = parcel.readInt();
                long readLong = parcel.readLong();
                if (F026 != null) {
                    i1Var.N0(F026, readInt36, 5, Q0(new k2.e0(readLong)));
                    return true;
                }
                break;
            case 3039:
                l F027 = p.F0(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                int readInt38 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (F027 != null && readInt38 >= 0) {
                    N0(F027, readInt37, 10, new j5.b(new j2.d(this, readInt38, readLong2, 1), 15));
                    return true;
                }
                break;
            case 3040:
                l F028 = p.F0(parcel.readStrongBinder());
                int readInt39 = parcel.readInt();
                if (F028 != null && (q17 = this.f16564b.q(F028.asBinder())) != null) {
                    O0(q17, readInt39, 11, Q0(new k2.f0(19)));
                    return true;
                }
                break;
            case 3041:
                l F029 = p.F0(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                if (F029 != null && (q18 = this.f16564b.q(F029.asBinder())) != null) {
                    O0(q18, readInt40, 12, Q0(new k2.f0(23)));
                    return true;
                }
                break;
            case 3042:
                l F030 = p.F0(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (F030 != null) {
                    N0(F030, readInt41, 6, Q0(new k2.f0(21)));
                    return true;
                }
                break;
            case 3043:
                l F031 = p.F0(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (F031 != null) {
                    N0(F031, readInt42, 8, Q0(new k2.f0(16)));
                    return true;
                }
                break;
            case 3044:
                l F032 = p.F0(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                Surface surface = (Surface) w7.u.a(parcel, Surface.CREATOR);
                if (F032 != null) {
                    N0(F032, readInt43, 27, Q0(new w0(0, this, surface)));
                    return true;
                }
                break;
            case 3045:
                l F033 = p.F0(parcel.readStrongBinder());
                if (F033 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        f0 f0Var2 = (f0) this.f16563a.get();
                        if (f0Var2 != null && !f0Var2.j()) {
                            v q24 = this.f16564b.q(F033.asBinder());
                            if (q24 != null) {
                                e2.m0.W(f0Var2.f16526l, new z(3, this, q24));
                            }
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3046:
                l F034 = p.F0(parcel.readStrongBinder());
                int readInt44 = parcel.readInt();
                if (F034 != null && (q19 = this.f16564b.q(F034.asBinder())) != null) {
                    O0(q19, readInt44, 7, Q0(new k2.f0(20)));
                    return true;
                }
                break;
            case 3047:
                l F035 = p.F0(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                if (F035 != null && (q20 = this.f16564b.q(F035.asBinder())) != null) {
                    O0(q20, readInt45, 9, Q0(new k2.f0(24)));
                    return true;
                }
                break;
            case 3048:
                l F036 = p.F0(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                Bundle bundle8 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F036 != null && bundle8 != null) {
                    try {
                        N0(F036, readInt46, 29, Q0(new ah.h0(28, this, b2.t1.b(bundle8))));
                        break;
                    } catch (RuntimeException e15) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e15);
                        break;
                    }
                }
                break;
            case 3049:
                l F037 = p.F0(parcel.readStrongBinder());
                int readInt47 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle9 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F037 != null && readString != null && bundle9 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        e2.a.l("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            i1Var2 = this;
                            i1Var2.H0(F037, readInt47, null, 40010, new z0(new k2.f0(readString, b2.g1.a(bundle9)), 1));
                            break;
                        } catch (RuntimeException e16) {
                            e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e16);
                            break;
                        }
                    }
                }
                break;
            case 3050:
                l F038 = p.F0(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                Bundle bundle10 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F038 != null && bundle10 != null) {
                    try {
                        H0(F038, readInt48, null, 40010, new z0(new v0(b2.g1.a(bundle10), 9), 1));
                    } catch (RuntimeException e17) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e17);
                    }
                }
                break;
            case 3051:
                l F039 = p.F0(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                int readInt50 = parcel.readInt();
                int readInt51 = parcel.readInt();
                if (F039 != null && readInt50 >= 0) {
                    N0(F039, readInt49, 33, Q0(new eh.c(readInt50, readInt51, 4)));
                    return true;
                }
                break;
            case 3052:
                l F040 = p.F0(parcel.readStrongBinder());
                int readInt52 = parcel.readInt();
                int readInt53 = parcel.readInt();
                if (F040 != null) {
                    N0(F040, readInt52, 34, Q0(new i2.w(readInt53, 4)));
                    return true;
                }
                break;
            case 3053:
                l F041 = p.F0(parcel.readStrongBinder());
                int readInt54 = parcel.readInt();
                int readInt55 = parcel.readInt();
                if (F041 != null) {
                    N0(F041, readInt54, 34, Q0(new i2.w(readInt55, 3)));
                    return true;
                }
                break;
            case 3054:
                l F042 = p.F0(parcel.readStrongBinder());
                int readInt56 = parcel.readInt();
                final boolean z12 = parcel.readInt() != 0;
                final int readInt57 = parcel.readInt();
                if (F042 != null) {
                    N0(F042, readInt56, 34, Q0(new e2.j() {
                        @Override
                        public final void accept(Object obj) {
                            ((m1) obj).I(readInt57, z12);
                        }
                    }));
                    return true;
                }
                break;
            case 3055:
                l F043 = p.F0(parcel.readStrongBinder());
                int readInt58 = parcel.readInt();
                int readInt59 = parcel.readInt();
                Bundle bundle11 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                if (F043 != null && bundle11 != null && readInt59 >= 0 && (q21 = this.f16564b.q(F043.asBinder())) != null) {
                    try {
                        final b2.o0 a19 = b2.o0.a(q21.f16760c, bundle11);
                        O0(q21, readInt58, 20, new z0(new w0(2, new g1() {
                            @Override
                            public final Object e(f0 f0Var3, v vVar, int i122) {
                                switch (r2) {
                                    case 0:
                                        return f0Var3.l(vVar, e9.n0.y(a19));
                                    case 1:
                                        return f0Var3.l(vVar, e9.n0.y(a19));
                                    default:
                                        return f0Var3.l(vVar, e9.n0.y(a19));
                                }
                            }
                        }, new r0(this, readInt59, 2)), 1));
                        break;
                    } catch (RuntimeException e18) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e18);
                        break;
                    }
                }
                break;
            case 3056:
                l F044 = p.F0(parcel.readStrongBinder());
                int readInt60 = parcel.readInt();
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (F044 != null && readStrongBinder3 != null && readInt61 >= 0 && readInt62 >= readInt61 && (q22 = this.f16564b.q(F044.asBinder())) != null) {
                    try {
                        e9.n0 a20 = b2.h.a(readStrongBinder3);
                        e9.k0 t12 = e9.n0.t();
                        for (int i14 = 0; i14 < a20.size(); i14++) {
                            Bundle bundle12 = (Bundle) a20.get(i14);
                            bundle12.getClass();
                            t12.c(b2.o0.a(q22.f16760c, bundle12));
                        }
                        O0(q22, readInt60, 20, new z0(new w0(2, new j5.b(t12.f(), 13), new q0(this, readInt61, readInt62)), 1));
                        break;
                    } catch (RuntimeException e19) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e19);
                        break;
                    }
                }
                break;
            case 3057:
                l F045 = p.F0(parcel.readStrongBinder());
                int readInt63 = parcel.readInt();
                Bundle bundle13 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                boolean z13 = parcel.readInt() != 0;
                if (F045 != null && bundle13 != null) {
                    try {
                        N0(F045, readInt63, 35, Q0(new ci.f(3, b2.f.a(bundle13), z13)));
                        break;
                    } catch (RuntimeException e20) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e20);
                        break;
                    }
                }
                break;
            case 3058:
                l F046 = p.F0(parcel.readStrongBinder());
                int readInt64 = parcel.readInt();
                if (F046 != null) {
                    N0(F046, readInt64, 24, Q0(new k2.f0(14)));
                    return true;
                }
                break;
            case 3059:
                l F047 = p.F0(parcel.readStrongBinder());
                int readInt65 = parcel.readInt();
                if (F047 != null) {
                    N0(F047, readInt65, 24, Q0(new v0(1)));
                    return true;
                }
                break;
            case 3060:
                l F048 = p.F0(parcel.readStrongBinder());
                int readInt66 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                L0(F048, readInt66, (Bundle) w7.u.a(parcel, creator2), (Bundle) w7.u.a(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                l F049 = p.F0(parcel.readStrongBinder());
                int readInt67 = parcel.readInt();
                Surface surface2 = (Surface) w7.u.a(parcel, Surface.CREATOR);
                int readInt68 = parcel.readInt();
                int readInt69 = parcel.readInt();
                if (F049 != null) {
                    N0(F049, readInt67, 27, Q0(new s0(this, surface2, readInt68, readInt69)));
                    return true;
                }
                break;
            case 3062:
                l F050 = p.F0(parcel.readStrongBinder());
                int readInt70 = parcel.readInt();
                int readInt71 = parcel.readInt();
                int readInt72 = parcel.readInt();
                if (F050 != null) {
                    N0(F050, readInt70, 27, Q0(new q0(this, readInt71, readInt72)));
                    return true;
                }
                break;
            default:
                switch (i10) {
                    case 4001:
                        l F051 = p.F0(parcel.readStrongBinder());
                        int readInt73 = parcel.readInt();
                        Bundle bundle14 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                        if (F051 != null) {
                            if (bundle14 != null) {
                                try {
                                    a13 = q.a(bundle14);
                                } catch (RuntimeException e21) {
                                    e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e21);
                                    break;
                                }
                            }
                            i1Var2 = this;
                            i1Var2.H0(F051, readInt73, null, 50000, new z0(new v0(a13, 3), 0));
                            break;
                        }
                        break;
                    case 4002:
                        l F052 = p.F0(parcel.readStrongBinder());
                        int readInt74 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (F052 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                e2.a.l("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            H0(F052, readInt74, null, 50004, new z0(new k2.f0(readString2, 22), 0));
                            return true;
                        }
                        break;
                    case 4003:
                        l F053 = p.F0(parcel.readStrongBinder());
                        int readInt75 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt76 = parcel.readInt();
                        int readInt77 = parcel.readInt();
                        Bundle bundle15 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                        if (F053 != null) {
                            if (TextUtils.isEmpty(readString3)) {
                                e2.a.l("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (readInt76 < 0) {
                                e2.a.l("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (readInt77 < 1) {
                                e2.a.l("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle15 != null) {
                                    try {
                                        a12 = q.a(bundle15);
                                    } catch (RuntimeException e22) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e22);
                                    }
                                }
                                H0(F053, readInt75, null, 50003, new z0(new k2.f0(readString3, readInt76, readInt77, a12, 13), 0));
                            }
                        }
                        break;
                    case 4004:
                        l F054 = p.F0(parcel.readStrongBinder());
                        int readInt78 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle16 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                        if (F054 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                e2.a.l("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle16 != null) {
                                    try {
                                        a11 = q.a(bundle16);
                                    } catch (RuntimeException e23) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e23);
                                    }
                                }
                                H0(F054, readInt78, null, 50005, new z0(new v0(readString4, a11, 7), 0));
                            }
                        }
                        break;
                    case 4005:
                        l F055 = p.F0(parcel.readStrongBinder());
                        int readInt79 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt80 = parcel.readInt();
                        int readInt81 = parcel.readInt();
                        Bundle bundle17 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                        if (F055 != null) {
                            if (TextUtils.isEmpty(readString5)) {
                                e2.a.l("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (readInt80 < 0) {
                                e2.a.l("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (readInt81 < 1) {
                                e2.a.l("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle17 != null) {
                                    try {
                                        a10 = q.a(bundle17);
                                    } catch (RuntimeException e24) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e24);
                                    }
                                }
                                H0(F055, readInt79, null, 50006, new z0(new k2.f0(readString5, readInt80, readInt81, a10, 29), 0));
                            }
                        }
                        break;
                    case 4006:
                        l F056 = p.F0(parcel.readStrongBinder());
                        int readInt82 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle18 = (Bundle) w7.u.a(parcel, Bundle.CREATOR);
                        if (F056 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                e2.a.l("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle18 != null) {
                                    try {
                                        a2 = q.a(bundle18);
                                    } catch (RuntimeException e25) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e25);
                                    }
                                }
                                H0(F056, readInt82, null, 50001, new z0(new v0(readString6, a2, 5), 0));
                            }
                        }
                        break;
                    case 4007:
                        l F057 = p.F0(parcel.readStrongBinder());
                        int readInt83 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (F057 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                e2.a.l("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            H0(F057, readInt83, null, 50002, new z0(new k2.f0(readString7, 12), 0));
                            return true;
                        }
                        break;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
        }
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
