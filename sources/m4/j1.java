package m4;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import bi.ma;
import e9.c2;
import e9.m2;
import e9.w1;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import ji.m5;
import ji.v2;
public final class j1 extends Binder implements n {
    public final WeakReference f15474a;
    public final qi.e f15475b;
    public final Set f15476c;
    public w1 d;
    public c2 e;
    public int f15477f;
    public i1 f15478i;

    public j1(f0 f0Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.f15474a = new WeakReference(f0Var);
        this.f15475b = new qi.e(f0Var);
        this.f15476c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = w1.f8642r;
        this.e = c2.h;
    }

    public static j9.y I0(f0 f0Var, w wVar, int i10, h1 h1Var, e2.j jVar) {
        if (f0Var.j()) {
            return j9.w.f12945b;
        }
        j9.y yVar = (j9.y) h1Var.c(f0Var, wVar, i10);
        ?? obj = new Object();
        yVar.a(new androidx.car.app.utils.b(f0Var, obj, jVar, yVar, 23), j9.r.f12940a);
        return obj;
    }

    public static void P0(f0 f0Var, w wVar, int i10, t1 t1Var) {
        try {
            v vVar = wVar.d;
            vVar.getClass();
            vVar.j(i10, t1Var);
            f0Var.f15426c.a(true, true);
        } catch (RemoteException e) {
            e2.a.m("MediaSessionStub", "Failed to send result to controller " + wVar, e);
        }
    }

    public static m5 Q0(e2.j jVar) {
        return new m5(new m5(jVar, 7), 6);
    }

    public final void F0(m mVar, Bundle bundle) {
        WeakReference weakReference = this.f15474a;
        f0 f0Var = (f0) weakReference.get();
        if (mVar != null && bundle != null && f0Var != null) {
            try {
                Context context = f0Var.f15427f;
                j a2 = j.a(bundle);
                int callingUid = Binder.getCallingUid();
                int callingPid = Binder.getCallingPid();
                String str = a2.f15470c;
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                if (packagesForUid != null && packagesForUid.length != 0) {
                    for (String str2 : packagesForUid) {
                        if (!str2.equals(str)) {
                        }
                    }
                    e2.a.l("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                    w7.x.a(mVar);
                    return;
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = a2.d;
                }
                try {
                    n4.t tVar = new n4.t(str, callingPid, callingUid);
                    boolean b10 = n4.w.a(context).b(tVar);
                    int i10 = a2.f15468a;
                    int i11 = a2.f15469b;
                    w wVar = new w(tVar, i10, i11, b10, new e1(mVar, i11), a2.e);
                    f0 f0Var2 = (f0) weakReference.get();
                    if (f0Var2 != null && !f0Var2.j()) {
                        this.f15476c.add(wVar);
                        e2.m0.W(f0Var2.f15432l, new androidx.car.app.utils.b(this, wVar, f0Var2, mVar, 22));
                        return;
                    }
                    w7.x.a(mVar);
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e);
                return;
            }
        }
        w7.x.a(mVar);
    }

    public final void G0(m mVar, int i10) {
        if (mVar == null) {
            return;
        }
        N0(mVar, i10, 26, Q0(new k2.y0(26)));
    }

    public final void H0(m mVar, int i10, p1 p1Var, int i11, h1 h1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            f0 f0Var = (f0) this.f15474a.get();
            if (f0Var != null && !f0Var.j()) {
                w n10 = this.f15475b.n(mVar.asBinder());
                if (n10 == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return;
                }
                e2.m0.W(f0Var.f15432l, new y0(this, n10, p1Var, f0Var, i10, i11, h1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void J0(m mVar, int i10) {
        if (mVar == null) {
            return;
        }
        N0(mVar, i10, 26, Q0(new k2.y0(18)));
    }

    public final int K0(w wVar, n1 n1Var, int i10) {
        if (n1Var.o0(17)) {
            qi.e eVar = this.f15475b;
            if (!eVar.u(wVar, 17) && eVar.u(wVar, 16)) {
                return n1Var.n0() + i10;
            }
        }
        return i10;
    }

    public final void L0(m mVar, int i10, Bundle bundle, Bundle bundle2, boolean z10) {
        p1 p1Var;
        Bundle o10 = e2.m0.o(bundle2);
        if (mVar != null && bundle != null && o10 != null) {
            try {
                int i11 = bundle.getInt(p1.f15566f, 0);
                if (i11 != 0) {
                    p1Var = new p1(i11);
                } else {
                    String string = bundle.getString(p1.f15567g);
                    string.getClass();
                    Bundle o11 = e2.m0.o(bundle.getBundle(p1.h));
                    if (o11 == null) {
                        o11 = Bundle.EMPTY;
                    }
                    p1Var = new p1(string, o11);
                }
                if (e.j(p1Var.f15569b)) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        f0 f0Var = (f0) this.f15474a.get();
                        if (f0Var != null && !f0Var.j()) {
                            w n10 = this.f15475b.n(mVar.asBinder());
                            if (n10 == null) {
                                Binder.restoreCallingIdentity(clearCallingIdentity);
                                return;
                            }
                            e2.m0.W(f0Var.f15432l, new ma(this, n10, p1Var, f0Var, i10, mVar, 1));
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            return;
                        }
                        return;
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                H0(mVar, i10, p1Var, 0, new a1(new k2.y0(z10, p1Var, o10), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
            }
        }
    }

    public final void M0(w wVar, int i10) {
        O0(wVar, i10, 1, Q0(new ah.h0(28, this, wVar)));
    }

    public final void N0(m mVar, int i10, int i11, m5 m5Var) {
        w n10 = this.f15475b.n(mVar.asBinder());
        if (n10 != null) {
            O0(n10, i10, i11, m5Var);
        }
    }

    public final void O0(w wVar, int i10, int i11, h1 h1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            f0 f0Var = (f0) this.f15474a.get();
            if (f0Var != null && !f0Var.j()) {
                e2.m0.W(f0Var.f15432l, new ji.h0(this, wVar, i11, f0Var, i10, h1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void R0(m mVar, int i10, boolean z10) {
        if (mVar == null) {
            return;
        }
        N0(mVar, i10, 26, Q0(new i2.x(3, z10)));
    }

    public final void S0(m mVar, int i10, int i11) {
        if (mVar != null && i11 >= 0) {
            N0(mVar, i10, 25, Q0(new i2.v(i11, 6)));
        }
    }

    public final void T0(m mVar, int i10, Bundle bundle, boolean z10) {
        w n10;
        if (mVar != null && bundle != null && (n10 = this.f15475b.n(mVar.asBinder())) != null) {
            try {
                O0(n10, i10, 31, new a1(new z0(0, new bi.h(2, b2.p0.a(n10.f15672c, bundle), z10), new w0(8)), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void U0(m mVar, int i10, Bundle bundle, long j10) {
        w n10;
        if (mVar != null && bundle != null && (n10 = this.f15475b.n(mVar.asBinder())) != null) {
            try {
                O0(n10, i10, 31, new a1(new z0(0, new bi.p1(b2.p0.a(n10.f15672c, bundle), j10, 2), new w0(8)), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void V0(m mVar, int i10, IBinder iBinder, boolean z10) {
        w n10;
        if (mVar != null && iBinder != null && (n10 = this.f15475b.n(mVar.asBinder())) != null) {
            try {
                e9.n0 a2 = b2.i.a(iBinder);
                e9.k0 t10 = e9.n0.t();
                for (int i11 = 0; i11 < a2.size(); i11++) {
                    Bundle bundle = (Bundle) a2.get(i11);
                    bundle.getClass();
                    t10.c(b2.p0.a(n10.f15672c, bundle));
                }
                O0(n10, i10, 20, new a1(new z0(0, new bi.h(4, t10.f(), z10), new w0(8)), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void W0(m mVar, int i10, IBinder iBinder, int i11, long j10) {
        w n10;
        if (mVar != null && iBinder != null) {
            if ((i11 == -1 || i11 >= 0) && (n10 = this.f15475b.n(mVar.asBinder())) != null) {
                try {
                    e9.n0 a2 = b2.i.a(iBinder);
                    e9.k0 t10 = e9.n0.t();
                    for (int i12 = 0; i12 < a2.size(); i12++) {
                        Bundle bundle = (Bundle) a2.get(i12);
                        bundle.getClass();
                        t10.c(b2.p0.a(n10.f15672c, bundle));
                    }
                    O0(n10, i10, 20, new a1(new z0(0, new j2.d(t10.f(), i11, j10, 2), new w0(8)), 1));
                } catch (RuntimeException e) {
                    e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
                }
            }
        }
    }

    public final void X0(m mVar, int i10, float f7) {
        if (mVar != null && f7 >= 0.0f && f7 <= 1.0f) {
            N0(mVar, i10, 24, Q0(new i2.u(f7, 2)));
        }
    }

    public final l1 Y0(l1 l1Var) {
        w1 w1Var;
        e9.n0 n0Var = l1Var.F.f2478a;
        ?? aVar = new a5.a(4, 5);
        a5.a aVar2 = new a5.a(4, 5);
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            b2.q1 q1Var = ((b2.v1) n0Var.get(i10)).f2450b;
            String str = (String) this.d.get(q1Var);
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                int i11 = this.f15477f;
                this.f15477f = i11 + 1;
                String str2 = e2.m0.f8372a;
                sb2.append(Integer.toString(i11, 36));
                sb2.append("-");
                sb2.append(q1Var.f2292b);
                str = sb2.toString();
            }
            aVar.I(q1Var, str);
            aVar2.x(q1Var.f2292b, str);
        }
        if (aVar.f279b == 0) {
            w1Var = w1.f8642r;
        } else {
            w1Var = new w1(aVar.f279b, (Object[]) aVar.f280c);
        }
        this.d = w1Var;
        this.e = aVar2.e(false);
        e9.k0 t10 = e9.n0.t();
        for (int i12 = 0; i12 < n0Var.size(); i12++) {
            b2.v1 v1Var = (b2.v1) n0Var.get(i12);
            t10.c(new b2.v1(Z0(v1Var.f2450b), v1Var.f2451c, v1Var.d, v1Var.e));
        }
        l1 a2 = l1Var.a(new b2.w1(t10.f()));
        b2.u1 u1Var = a2.G;
        if (u1Var.H.isEmpty()) {
            return a2;
        }
        b2.t1 c10 = u1Var.a().c();
        m2 it = u1Var.H.values().iterator();
        while (it.hasNext()) {
            b2.r1 r1Var = (b2.r1) it.next();
            c10.a(new b2.r1(Z0(r1Var.f2318a), r1Var.f2319b));
        }
        return a2.d(c10.b());
    }

    public final b2.q1 Z0(b2.q1 q1Var) {
        String str;
        String str2 = (String) this.d.get(q1Var);
        if (str2 == null) {
            str2 = q1Var.f2292b;
        }
        int i10 = 0;
        while (true) {
            int i11 = q1Var.f2291a;
            b2.x[] xVarArr = q1Var.d;
            if (i10 < i11) {
                if (xVarArr[i10].f2513m != null) {
                    b2.x[] xVarArr2 = new b2.x[i11];
                    for (int i12 = 0; i12 < q1Var.f2291a; i12++) {
                        b2.x xVar = xVarArr[i12];
                        String str3 = xVar.f2513m;
                        if (str3 != null) {
                            str = (String) this.e.get(str3);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            b2.w a2 = xVar.a();
                            a2.f2460l = str;
                            xVarArr2[i12] = new b2.x(a2);
                        } else {
                            xVarArr2[i12] = xVar;
                        }
                    }
                    return new b2.q1(str2, xVarArr2);
                }
                i10++;
            } else {
                return new b2.q1(str2, xVarArr);
            }
        }
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        i iVar;
        j1 j1Var;
        w n10;
        w n11;
        w n12;
        w n13;
        w n14;
        w n15;
        w n16;
        w n17;
        w n18;
        w n19;
        w n20;
        w n21;
        j1 j1Var2;
        w n22;
        w n23;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        r a2 = null;
        r a10 = null;
        r a11 = null;
        r a12 = null;
        r a13 = null;
        switch (i10) {
            case 3002:
                X0(q.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                S0(q.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                J0(q.F0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                G0(q.F0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                R0(q.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                T0(q.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.v.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                U0(q.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.v.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                T0(q.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.v.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                V0(q.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                V0(q.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                W0(q.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                m F0 = q.F0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                boolean z10 = parcel.readInt() != 0;
                if (F0 != null) {
                    N0(F0, readInt, 1, Q0(new i2.x(2, z10)));
                    return true;
                }
                break;
            case 3014:
                m F02 = q.F0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
                if (F02 != null && bundle != null) {
                    try {
                        t1 a14 = t1.a(bundle);
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            qi.e eVar = this.f15475b;
                            IBinder asBinder = F02.asBinder();
                            synchronized (eVar.f43662a) {
                                w n24 = eVar.n(asBinder);
                                iVar = n24 != null ? (i) ((a0.f) eVar.f43664c).get(n24) : null;
                            }
                            com.google.android.gms.common.api.internal.v vVar = iVar != null ? iVar.f15454b : null;
                            if (vVar != null) {
                                vVar.i(readInt2, a14);
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
                m F03 = q.F0(parcel.readStrongBinder());
                parcel.readInt();
                F0(F03, (Bundle) w7.v.a(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                m F04 = q.F0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                L0(F04, readInt3, (Bundle) w7.v.a(parcel, creator), (Bundle) w7.v.a(parcel, creator), false);
                return true;
            case 3017:
                j1Var = this;
                m F05 = q.F0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                int readInt5 = parcel.readInt();
                if (F05 != null && (readInt5 == 2 || readInt5 == 0 || readInt5 == 1)) {
                    j1Var.N0(F05, readInt4, 15, Q0(new i2.v(readInt5, 5)));
                    return true;
                }
                break;
            case 3018:
                j1Var = this;
                m F06 = q.F0(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                boolean z11 = parcel.readInt() != 0;
                if (F06 != null) {
                    j1Var.N0(F06, readInt6, 14, Q0(new i2.x(4, z11)));
                    return true;
                }
                break;
            case 3019:
                j1Var = this;
                m F07 = q.F0(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                if (F07 != null && readInt8 >= 0) {
                    j1Var.N0(F07, readInt7, 20, new m5(new s0(j1Var, readInt8, 4), 6));
                    return true;
                }
                break;
            case 3020:
                j1Var = this;
                m F08 = q.F0(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                if (F08 != null && readInt10 >= 0 && readInt11 >= readInt10) {
                    j1Var.N0(F08, readInt9, 20, new m5(new r0(j1Var, readInt10, readInt11), 6));
                    return true;
                }
                break;
            case 3021:
                j1Var = this;
                m F09 = q.F0(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                if (F09 != null) {
                    j1Var.N0(F09, readInt12, 20, Q0(new w0(6)));
                    return true;
                }
                break;
            case 3022:
                j1Var = this;
                m F010 = q.F0(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                int readInt15 = parcel.readInt();
                if (F010 != null && readInt14 >= 0 && readInt15 >= 0) {
                    j1Var.N0(F010, readInt13, 20, Q0(new eh.c(readInt14, readInt15, 5)));
                    return true;
                }
                break;
            case 3023:
                j1Var = this;
                m F011 = q.F0(parcel.readStrongBinder());
                int readInt16 = parcel.readInt();
                final int readInt17 = parcel.readInt();
                final int readInt18 = parcel.readInt();
                final int readInt19 = parcel.readInt();
                if (F011 != null && readInt17 >= 0 && readInt18 >= readInt17 && readInt19 >= 0) {
                    j1Var.N0(F011, readInt16, 20, Q0(new e2.j() {
                        @Override
                        public final void accept(Object obj) {
                            ((n1) obj).t0(readInt17, readInt18, readInt19);
                        }
                    }));
                    return true;
                }
                break;
            case 3024:
                j1Var = this;
                m F012 = q.F0(parcel.readStrongBinder());
                int readInt20 = parcel.readInt();
                if (F012 != null && (n10 = j1Var.f15475b.n(F012.asBinder())) != null) {
                    j1Var.M0(n10, readInt20);
                    return true;
                }
                break;
            case 3025:
                j1Var = this;
                m F013 = q.F0(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (F013 != null && (n11 = j1Var.f15475b.n(F013.asBinder())) != null) {
                    j1Var.O0(n11, readInt21, 1, Q0(new k2.y0(15)));
                    return true;
                }
                break;
            case 3026:
                j1Var = this;
                m F014 = q.F0(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                if (F014 != null) {
                    j1Var.N0(F014, readInt22, 2, Q0(new w0(4)));
                    return true;
                }
                break;
            case 3027:
                j1Var = this;
                m F015 = q.F0(parcel.readStrongBinder());
                int readInt23 = parcel.readInt();
                Bundle bundle2 = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
                if (F015 != null && bundle2 != null) {
                    try {
                        j1Var.N0(F015, readInt23, 13, Q0(new m5(new b2.a1(bundle2.getFloat(b2.a1.e, 1.0f), bundle2.getFloat(b2.a1.f2072f, 1.0f)), 5)));
                    } catch (RuntimeException e7) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e7);
                    }
                }
                break;
            case 3028:
                j1Var = this;
                m F016 = q.F0(parcel.readStrongBinder());
                int readInt24 = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (F016 != null && readFloat > 0.0f) {
                    j1Var.N0(F016, readInt24, 13, Q0(new i2.u(readFloat, 1)));
                    return true;
                }
                break;
            case 3029:
                j1Var = this;
                m F017 = q.F0(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                Bundle bundle3 = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
                if (F017 != null && bundle3 != null && (n12 = j1Var.f15475b.n(F017.asBinder())) != null) {
                    try {
                        final b2.p0 a15 = b2.p0.a(n12.f15672c, bundle3);
                        j1Var.O0(n12, readInt25, 20, new a1(new z0(1, new h1() {
                            @Override
                            public final Object c(f0 f0Var, w wVar, int i12) {
                                switch (r2) {
                                    case 0:
                                        return f0Var.l(wVar, e9.n0.y(a15));
                                    case 1:
                                        return f0Var.l(wVar, e9.n0.y(a15));
                                    default:
                                        return f0Var.l(wVar, e9.n0.y(a15));
                                }
                            }
                        }, new k2.y0(28)), 1));
                    } catch (RuntimeException e10) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
                    }
                }
                break;
            case 3030:
                j1Var = this;
                m F018 = q.F0(parcel.readStrongBinder());
                int readInt26 = parcel.readInt();
                int readInt27 = parcel.readInt();
                Bundle bundle4 = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
                if (F018 != null && bundle4 != null && readInt27 >= 0 && (n13 = j1Var.f15475b.n(F018.asBinder())) != null) {
                    try {
                        final b2.p0 a16 = b2.p0.a(n13.f15672c, bundle4);
                        j1Var.O0(n13, readInt26, 20, new a1(new z0(1, new h1() {
                            @Override
                            public final Object c(f0 f0Var, w wVar, int i12) {
                                switch (r2) {
                                    case 0:
                                        return f0Var.l(wVar, e9.n0.y(a16));
                                    case 1:
                                        return f0Var.l(wVar, e9.n0.y(a16));
                                    default:
                                        return f0Var.l(wVar, e9.n0.y(a16));
                                }
                            }
                        }, new s0(j1Var, readInt27, 1)), 1));
                    } catch (RuntimeException e11) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
                    }
                }
                break;
            case 3031:
                j1Var = this;
                m F019 = q.F0(parcel.readStrongBinder());
                int readInt28 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (F019 != null && readStrongBinder != null && (n14 = j1Var.f15475b.n(F019.asBinder())) != null) {
                    try {
                        e9.n0 a17 = b2.i.a(readStrongBinder);
                        e9.k0 t10 = e9.n0.t();
                        for (int i12 = 0; i12 < a17.size(); i12++) {
                            Bundle bundle5 = (Bundle) a17.get(i12);
                            bundle5.getClass();
                            t10.c(b2.p0.a(n14.f15672c, bundle5));
                        }
                        j1Var.O0(n14, readInt28, 20, new a1(new z0(1, new i2.y(3, t10.f()), new k2.y0(27)), 1));
                    } catch (RuntimeException e12) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e12);
                    }
                }
                break;
            case 3032:
                j1Var = this;
                m F020 = q.F0(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                int readInt30 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (F020 != null && readStrongBinder2 != null && readInt30 >= 0 && (n15 = j1Var.f15475b.n(F020.asBinder())) != null) {
                    try {
                        e9.n0 a18 = b2.i.a(readStrongBinder2);
                        e9.k0 t11 = e9.n0.t();
                        for (int i13 = 0; i13 < a18.size(); i13++) {
                            Bundle bundle6 = (Bundle) a18.get(i13);
                            bundle6.getClass();
                            t11.c(b2.p0.a(n15.f15672c, bundle6));
                        }
                        j1Var.O0(n15, readInt29, 20, new a1(new z0(1, new i2.y(2, t11.f()), new s0(j1Var, readInt30, 3)), 1));
                    } catch (RuntimeException e13) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e13);
                    }
                }
                break;
            case 3033:
                j1Var = this;
                m F021 = q.F0(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                Bundle bundle7 = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
                if (F021 != null && bundle7 != null && (n16 = j1Var.f15475b.n(F021.asBinder())) != null) {
                    try {
                        j1Var.O0(n16, readInt31, 19, Q0(new i2.s(b2.s0.b(n16.f15672c, bundle7))));
                    } catch (RuntimeException e14) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e14);
                    }
                }
                break;
            case 3034:
                j1Var = this;
                m F022 = q.F0(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                if (F022 != null && (n17 = j1Var.f15475b.n(F022.asBinder())) != null) {
                    j1Var.O0(n17, readInt32, 3, Q0(new w0(0)));
                    return true;
                }
                break;
            case 3035:
                j1Var = this;
                m F023 = q.F0(parcel.readStrongBinder());
                parcel.readInt();
                if (F023 != null) {
                    long clearCallingIdentity2 = Binder.clearCallingIdentity();
                    try {
                        f0 f0Var = (f0) j1Var.f15474a.get();
                        if (f0Var != null && !f0Var.j()) {
                            e2.m0.W(f0Var.f15432l, new v2(18, j1Var, F023));
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3036:
                j1Var = this;
                m F024 = q.F0(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                if (F024 != null) {
                    j1Var.N0(F024, readInt33, 4, Q0(new w0(2)));
                    return true;
                }
                break;
            case 3037:
                j1Var = this;
                m F025 = q.F0(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                int readInt35 = parcel.readInt();
                if (F025 != null && readInt35 >= 0) {
                    j1Var.N0(F025, readInt34, 10, new m5(new s0(j1Var, readInt35, 0), 6));
                    return true;
                }
                break;
            case 3038:
                j1Var = this;
                m F026 = q.F0(parcel.readStrongBinder());
                int readInt36 = parcel.readInt();
                long readLong = parcel.readLong();
                if (F026 != null) {
                    j1Var.N0(F026, readInt36, 5, Q0(new k2.e0(readLong)));
                    return true;
                }
                break;
            case 3039:
                m F027 = q.F0(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                int readInt38 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (F027 != null && readInt38 >= 0) {
                    N0(F027, readInt37, 10, new m5(new j2.d(this, readInt38, readLong2, 1), 6));
                    return true;
                }
                break;
            case 3040:
                m F028 = q.F0(parcel.readStrongBinder());
                int readInt39 = parcel.readInt();
                if (F028 != null && (n18 = this.f15475b.n(F028.asBinder())) != null) {
                    O0(n18, readInt39, 11, Q0(new k2.y0(19)));
                    return true;
                }
                break;
            case 3041:
                m F029 = q.F0(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                if (F029 != null && (n19 = this.f15475b.n(F029.asBinder())) != null) {
                    O0(n19, readInt40, 12, Q0(new k2.y0(23)));
                    return true;
                }
                break;
            case 3042:
                m F030 = q.F0(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (F030 != null) {
                    N0(F030, readInt41, 6, Q0(new k2.y0(21)));
                    return true;
                }
                break;
            case 3043:
                m F031 = q.F0(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (F031 != null) {
                    N0(F031, readInt42, 8, Q0(new k2.y0(16)));
                    return true;
                }
                break;
            case 3044:
                m F032 = q.F0(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                Surface surface = (Surface) w7.v.a(parcel, Surface.CREATOR);
                if (F032 != null) {
                    N0(F032, readInt43, 27, Q0(new ah.h0(29, this, surface)));
                    return true;
                }
                break;
            case 3045:
                m F033 = q.F0(parcel.readStrongBinder());
                if (F033 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        f0 f0Var2 = (f0) this.f15474a.get();
                        if (f0Var2 != null && !f0Var2.j()) {
                            w n25 = this.f15475b.n(F033.asBinder());
                            if (n25 != null) {
                                e2.m0.W(f0Var2.f15432l, new v2(19, this, n25));
                            }
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3046:
                m F034 = q.F0(parcel.readStrongBinder());
                int readInt44 = parcel.readInt();
                if (F034 != null && (n20 = this.f15475b.n(F034.asBinder())) != null) {
                    O0(n20, readInt44, 7, Q0(new k2.y0(20)));
                    return true;
                }
                break;
            case 3047:
                m F035 = q.F0(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                if (F035 != null && (n21 = this.f15475b.n(F035.asBinder())) != null) {
                    O0(n21, readInt45, 9, Q0(new k2.y0(24)));
                    return true;
                }
                break;
            case 3048:
                m F036 = q.F0(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                Bundle bundle8 = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
                if (F036 != null && bundle8 != null) {
                    try {
                        N0(F036, readInt46, 29, Q0(new ah.h0(27, this, b2.u1.b(bundle8))));
                        break;
                    } catch (RuntimeException e15) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e15);
                        break;
                    }
                }
                break;
            case 3049:
                m F037 = q.F0(parcel.readStrongBinder());
                int readInt47 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle9 = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
                if (F037 != null && readString != null && bundle9 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        e2.a.l("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            j1Var2 = this;
                            j1Var2.H0(F037, readInt47, null, 40010, new a1(new k2.y0(readString, b2.h1.a(bundle9)), 1));
                            break;
                        } catch (RuntimeException e16) {
                            e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e16);
                            break;
                        }
                    }
                }
                break;
            case 3050:
                m F038 = q.F0(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                Bundle bundle10 = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
                if (F038 != null && bundle10 != null) {
                    try {
                        H0(F038, readInt48, null, 40010, new a1(new w0(b2.h1.a(bundle10), 9), 1));
                    } catch (RuntimeException e17) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e17);
                    }
                }
                break;
            case 3051:
                m F039 = q.F0(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                int readInt50 = parcel.readInt();
                int readInt51 = parcel.readInt();
                if (F039 != null && readInt50 >= 0) {
                    N0(F039, readInt49, 33, Q0(new eh.c(readInt50, readInt51, 4)));
                    return true;
                }
                break;
            case 3052:
                m F040 = q.F0(parcel.readStrongBinder());
                int readInt52 = parcel.readInt();
                int readInt53 = parcel.readInt();
                if (F040 != null) {
                    N0(F040, readInt52, 34, Q0(new i2.v(readInt53, 4)));
                    return true;
                }
                break;
            case 3053:
                m F041 = q.F0(parcel.readStrongBinder());
                int readInt54 = parcel.readInt();
                int readInt55 = parcel.readInt();
                if (F041 != null) {
                    N0(F041, readInt54, 34, Q0(new i2.v(readInt55, 3)));
                    return true;
                }
                break;
            case 3054:
                m F042 = q.F0(parcel.readStrongBinder());
                int readInt56 = parcel.readInt();
                final boolean z12 = parcel.readInt() != 0;
                final int readInt57 = parcel.readInt();
                if (F042 != null) {
                    N0(F042, readInt56, 34, Q0(new e2.j() {
                        @Override
                        public final void accept(Object obj) {
                            ((n1) obj).I(readInt57, z12);
                        }
                    }));
                    return true;
                }
                break;
            case 3055:
                m F043 = q.F0(parcel.readStrongBinder());
                int readInt58 = parcel.readInt();
                int readInt59 = parcel.readInt();
                Bundle bundle11 = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
                if (F043 != null && bundle11 != null && readInt59 >= 0 && (n22 = this.f15475b.n(F043.asBinder())) != null) {
                    try {
                        final b2.p0 a19 = b2.p0.a(n22.f15672c, bundle11);
                        O0(n22, readInt58, 20, new a1(new z0(1, new h1() {
                            @Override
                            public final Object c(f0 f0Var3, w wVar, int i122) {
                                switch (r2) {
                                    case 0:
                                        return f0Var3.l(wVar, e9.n0.y(a19));
                                    case 1:
                                        return f0Var3.l(wVar, e9.n0.y(a19));
                                    default:
                                        return f0Var3.l(wVar, e9.n0.y(a19));
                                }
                            }
                        }, new s0(this, readInt59, 2)), 1));
                        break;
                    } catch (RuntimeException e18) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e18);
                        break;
                    }
                }
                break;
            case 3056:
                m F044 = q.F0(parcel.readStrongBinder());
                int readInt60 = parcel.readInt();
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (F044 != null && readStrongBinder3 != null && readInt61 >= 0 && readInt62 >= readInt61 && (n23 = this.f15475b.n(F044.asBinder())) != null) {
                    try {
                        e9.n0 a20 = b2.i.a(readStrongBinder3);
                        e9.k0 t12 = e9.n0.t();
                        for (int i14 = 0; i14 < a20.size(); i14++) {
                            Bundle bundle12 = (Bundle) a20.get(i14);
                            bundle12.getClass();
                            t12.c(b2.p0.a(n23.f15672c, bundle12));
                        }
                        O0(n23, readInt60, 20, new a1(new z0(1, new m5(t12.f(), 4), new r0(this, readInt61, readInt62)), 1));
                        break;
                    } catch (RuntimeException e19) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e19);
                        break;
                    }
                }
                break;
            case 3057:
                m F045 = q.F0(parcel.readStrongBinder());
                int readInt63 = parcel.readInt();
                Bundle bundle13 = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
                boolean z13 = parcel.readInt() != 0;
                if (F045 != null && bundle13 != null) {
                    try {
                        N0(F045, readInt63, 35, Q0(new bi.h(3, b2.f.a(bundle13), z13)));
                        break;
                    } catch (RuntimeException e20) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e20);
                        break;
                    }
                }
                break;
            case 3058:
                m F046 = q.F0(parcel.readStrongBinder());
                int readInt64 = parcel.readInt();
                if (F046 != null) {
                    N0(F046, readInt64, 24, Q0(new k2.y0(14)));
                    return true;
                }
                break;
            case 3059:
                m F047 = q.F0(parcel.readStrongBinder());
                int readInt65 = parcel.readInt();
                if (F047 != null) {
                    N0(F047, readInt65, 24, Q0(new w0(1)));
                    return true;
                }
                break;
            case 3060:
                m F048 = q.F0(parcel.readStrongBinder());
                int readInt66 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                L0(F048, readInt66, (Bundle) w7.v.a(parcel, creator2), (Bundle) w7.v.a(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                m F049 = q.F0(parcel.readStrongBinder());
                int readInt67 = parcel.readInt();
                Surface surface2 = (Surface) w7.v.a(parcel, Surface.CREATOR);
                int readInt68 = parcel.readInt();
                int readInt69 = parcel.readInt();
                if (F049 != null) {
                    N0(F049, readInt67, 27, Q0(new t0(this, surface2, readInt68, readInt69)));
                    return true;
                }
                break;
            case 3062:
                m F050 = q.F0(parcel.readStrongBinder());
                int readInt70 = parcel.readInt();
                int readInt71 = parcel.readInt();
                int readInt72 = parcel.readInt();
                if (F050 != null) {
                    N0(F050, readInt70, 27, Q0(new r0(this, readInt71, readInt72)));
                    return true;
                }
                break;
            default:
                switch (i10) {
                    case 4001:
                        m F051 = q.F0(parcel.readStrongBinder());
                        int readInt73 = parcel.readInt();
                        Bundle bundle14 = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
                        if (F051 != null) {
                            if (bundle14 != null) {
                                try {
                                    a13 = r.a(bundle14);
                                } catch (RuntimeException e21) {
                                    e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e21);
                                    break;
                                }
                            }
                            j1Var2 = this;
                            j1Var2.H0(F051, readInt73, null, 50000, new a1(new w0(a13, 3), 0));
                            break;
                        }
                        break;
                    case 4002:
                        m F052 = q.F0(parcel.readStrongBinder());
                        int readInt74 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (F052 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                e2.a.l("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            H0(F052, readInt74, null, 50004, new a1(new k2.y0(readString2, 22), 0));
                            return true;
                        }
                        break;
                    case 4003:
                        m F053 = q.F0(parcel.readStrongBinder());
                        int readInt75 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt76 = parcel.readInt();
                        int readInt77 = parcel.readInt();
                        Bundle bundle15 = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
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
                                        a12 = r.a(bundle15);
                                    } catch (RuntimeException e22) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e22);
                                    }
                                }
                                H0(F053, readInt75, null, 50003, new a1(new k2.y0(readString3, readInt76, readInt77, a12, 13), 0));
                            }
                        }
                        break;
                    case 4004:
                        m F054 = q.F0(parcel.readStrongBinder());
                        int readInt78 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle16 = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
                        if (F054 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                e2.a.l("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle16 != null) {
                                    try {
                                        a11 = r.a(bundle16);
                                    } catch (RuntimeException e23) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e23);
                                    }
                                }
                                H0(F054, readInt78, null, 50005, new a1(new w0(readString4, a11, 7), 0));
                            }
                        }
                        break;
                    case 4005:
                        m F055 = q.F0(parcel.readStrongBinder());
                        int readInt79 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt80 = parcel.readInt();
                        int readInt81 = parcel.readInt();
                        Bundle bundle17 = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
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
                                        a10 = r.a(bundle17);
                                    } catch (RuntimeException e24) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e24);
                                    }
                                }
                                H0(F055, readInt79, null, 50006, new a1(new k2.y0(readString5, readInt80, readInt81, a10, 29), 0));
                            }
                        }
                        break;
                    case 4006:
                        m F056 = q.F0(parcel.readStrongBinder());
                        int readInt82 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle18 = (Bundle) w7.v.a(parcel, Bundle.CREATOR);
                        if (F056 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                e2.a.l("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle18 != null) {
                                    try {
                                        a2 = r.a(bundle18);
                                    } catch (RuntimeException e25) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e25);
                                    }
                                }
                                H0(F056, readInt82, null, 50001, new a1(new w0(readString6, a2, 5), 0));
                            }
                        }
                        break;
                    case 4007:
                        m F057 = q.F0(parcel.readStrongBinder());
                        int readInt83 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (F057 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                e2.a.l("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            H0(F057, readInt83, null, 50002, new a1(new k2.y0(readString7, 12), 0));
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
