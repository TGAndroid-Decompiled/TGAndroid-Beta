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
import e9.c2;
import e9.m2;
import e9.w1;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
public final class j1 extends Binder implements n {
    public final WeakReference f12789a;
    public final xa.n f12790b;
    public final Set f12791c;
    public w1 d;
    public c2 e;
    public int f12792f;
    public i1 f12793i;

    public j1(f0 f0Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.f12789a = new WeakReference(f0Var);
        this.f12790b = new xa.n(f0Var);
        this.f12791c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = w1.f6440r;
        this.e = c2.h;
    }

    public static j9.y K0(f0 f0Var, w wVar, int i10, h1 h1Var, e2.j jVar) {
        if (f0Var.j()) {
            return j9.w.f9769b;
        }
        j9.y yVar = (j9.y) h1Var.f(f0Var, wVar, i10);
        ?? obj = new Object();
        yVar.a(new ag.q0(f0Var, (Object) obj, jVar, yVar, 12), j9.r.f9764a);
        return obj;
    }

    public static void R0(f0 f0Var, w wVar, int i10, t1 t1Var) {
        try {
            v vVar = wVar.d;
            vVar.getClass();
            vVar.j(i10, t1Var);
            f0Var.f12741c.a(true, true);
        } catch (RemoteException e) {
            e2.a.m("MediaSessionStub", "Failed to send result to controller " + wVar, e);
        }
    }

    public static ig.c0 S0(e2.j jVar) {
        return new ig.c0(new ig.c0(jVar, 24), 23);
    }

    public final void H0(m mVar, Bundle bundle) {
        WeakReference weakReference = this.f12789a;
        f0 f0Var = (f0) weakReference.get();
        if (mVar != null && bundle != null && f0Var != null) {
            try {
                Context context = f0Var.f12742f;
                j a2 = j.a(bundle);
                int callingUid = Binder.getCallingUid();
                int callingPid = Binder.getCallingPid();
                String str = a2.f12785c;
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                if (packagesForUid != null && packagesForUid.length != 0) {
                    for (String str2 : packagesForUid) {
                        if (!str2.equals(str)) {
                        }
                    }
                    e2.a.l("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                    w7.z.a(mVar);
                    return;
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = a2.d;
                }
                try {
                    n4.r rVar = new n4.r(str, callingPid, callingUid);
                    boolean b10 = n4.u.a(context).b(rVar);
                    int i10 = a2.f12783a;
                    int i11 = a2.f12784b;
                    w wVar = new w(rVar, i10, i11, b10, new e1(mVar, i11), a2.e);
                    f0 f0Var2 = (f0) weakReference.get();
                    if (f0Var2 != null && !f0Var2.j()) {
                        this.f12791c.add(wVar);
                        e2.l0.W(f0Var2.f12747l, new ag.q0(this, wVar, f0Var2, mVar, 11));
                        return;
                    }
                    w7.z.a(mVar);
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e);
                return;
            }
        }
        w7.z.a(mVar);
    }

    public final void I0(m mVar, int i10) {
        if (mVar == null) {
            return;
        }
        P0(mVar, i10, 26, S0(new k2.k0(29)));
    }

    public final void J0(m mVar, int i10, p1 p1Var, int i11, h1 h1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            f0 f0Var = (f0) this.f12789a.get();
            if (f0Var != null && !f0Var.j()) {
                w B = this.f12790b.B(mVar.asBinder());
                if (B == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return;
                }
                e2.l0.W(f0Var.f12747l, new y0(this, B, p1Var, f0Var, i10, i11, h1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void L0(m mVar, int i10) {
        if (mVar == null) {
            return;
        }
        P0(mVar, i10, 26, S0(new k2.k0(21)));
    }

    public final int M0(w wVar, n1 n1Var, int i10) {
        if (n1Var.n0(17)) {
            xa.n nVar = this.f12790b;
            if (!nVar.M(wVar, 17) && nVar.M(wVar, 16)) {
                return n1Var.m0() + i10;
            }
        }
        return i10;
    }

    public final void N0(m mVar, int i10, Bundle bundle, Bundle bundle2, boolean z10) {
        p1 p1Var;
        Bundle o10 = e2.l0.o(bundle2);
        if (mVar != null && bundle != null && o10 != null) {
            try {
                int i11 = bundle.getInt(p1.f12895f, 0);
                if (i11 != 0) {
                    p1Var = new p1(i11);
                } else {
                    String string = bundle.getString(p1.f12896g);
                    string.getClass();
                    Bundle o11 = e2.l0.o(bundle.getBundle(p1.h));
                    if (o11 == null) {
                        o11 = Bundle.EMPTY;
                    }
                    p1Var = new p1(string, o11);
                }
                if (e.j(p1Var.f12898b)) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        f0 f0Var = (f0) this.f12789a.get();
                        if (f0Var != null && !f0Var.j()) {
                            w B = this.f12790b.B(mVar.asBinder());
                            if (B == null) {
                                Binder.restoreCallingIdentity(clearCallingIdentity);
                                return;
                            }
                            e2.l0.W(f0Var.f12747l, new a1(this, B, p1Var, f0Var, i10, mVar, 0));
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            return;
                        }
                        return;
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                J0(mVar, i10, p1Var, 0, new z0(new k2.k0(z10, p1Var, o10), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
            }
        }
    }

    public final void O0(w wVar, int i10) {
        Q0(wVar, i10, 1, S0(new ag.m(21, this, wVar)));
    }

    public final void P0(m mVar, int i10, int i11, ig.c0 c0Var) {
        w B = this.f12790b.B(mVar.asBinder());
        if (B != null) {
            Q0(B, i10, i11, c0Var);
        }
    }

    public final void Q0(w wVar, int i10, int i11, h1 h1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            f0 f0Var = (f0) this.f12789a.get();
            if (f0Var != null && !f0Var.j()) {
                e2.l0.W(f0Var.f12747l, new bi.k0(this, wVar, i11, f0Var, i10, h1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void T0(m mVar, int i10, boolean z10) {
        if (mVar == null) {
            return;
        }
        P0(mVar, i10, 26, S0(new i2.y(3, z10)));
    }

    public final void U0(m mVar, int i10, int i11) {
        if (mVar != null && i11 >= 0) {
            P0(mVar, i10, 25, S0(new i2.w(i11, 6)));
        }
    }

    public final void V0(m mVar, int i10, Bundle bundle, boolean z10) {
        w B;
        if (mVar != null && bundle != null && (B = this.f12790b.B(mVar.asBinder())) != null) {
            try {
                Q0(B, i10, 31, new z0(new ag.m(23, new ag.w0(1, b2.p0.a(B.f12984c, bundle), z10), new v0(11)), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void W0(m mVar, int i10, Bundle bundle, long j10) {
        w B;
        if (mVar != null && bundle != null && (B = this.f12790b.B(mVar.asBinder())) != null) {
            try {
                Q0(B, i10, 31, new z0(new ag.m(23, new x0(b2.p0.a(B.f12984c, bundle), j10, 0), new v0(11)), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void X0(m mVar, int i10, IBinder iBinder, boolean z10) {
        w B;
        if (mVar != null && iBinder != null && (B = this.f12790b.B(mVar.asBinder())) != null) {
            try {
                e9.n0 a2 = b2.i.a(iBinder);
                e9.k0 t10 = e9.n0.t();
                for (int i11 = 0; i11 < a2.size(); i11++) {
                    Bundle bundle = (Bundle) a2.get(i11);
                    bundle.getClass();
                    t10.c(b2.p0.a(B.f12984c, bundle));
                }
                Q0(B, i10, 20, new z0(new ag.m(23, new ag.w0(3, t10.f(), z10), new v0(11)), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void Y0(m mVar, int i10, IBinder iBinder, int i11, long j10) {
        w B;
        if (mVar != null && iBinder != null) {
            if ((i11 == -1 || i11 >= 0) && (B = this.f12790b.B(mVar.asBinder())) != null) {
                try {
                    e9.n0 a2 = b2.i.a(iBinder);
                    e9.k0 t10 = e9.n0.t();
                    for (int i12 = 0; i12 < a2.size(); i12++) {
                        Bundle bundle = (Bundle) a2.get(i12);
                        bundle.getClass();
                        t10.c(b2.p0.a(B.f12984c, bundle));
                    }
                    Q0(B, i10, 20, new z0(new ag.m(23, new j2.d(t10.f(), i11, j10, 2), new v0(11)), 1));
                } catch (RuntimeException e) {
                    e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
                }
            }
        }
    }

    public final void Z0(m mVar, int i10, float f7) {
        if (mVar != null && f7 >= 0.0f && f7 <= 1.0f) {
            P0(mVar, i10, 24, S0(new i2.t(f7, 2)));
        }
    }

    public final l1 a1(l1 l1Var) {
        w1 w1Var;
        e9.n0 n0Var = l1Var.F.f2382a;
        ?? aVar = new a5.a(4, 6);
        a5.a aVar2 = new a5.a(4, 6);
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            b2.p1 p1Var = ((b2.v1) n0Var.get(i10)).f2354b;
            String str = (String) this.d.get(p1Var);
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                int i11 = this.f12792f;
                this.f12792f = i11 + 1;
                String str2 = e2.l0.f6165a;
                sb2.append(Integer.toString(i11, 36));
                sb2.append("-");
                sb2.append(p1Var.f2188b);
                str = sb2.toString();
            }
            aVar.H(p1Var, str);
            aVar2.w(p1Var.f2188b, str);
        }
        if (aVar.f281b == 0) {
            w1Var = w1.f6440r;
        } else {
            w1Var = new w1(aVar.f281b, (Object[]) aVar.f282c);
        }
        this.d = w1Var;
        this.e = aVar2.d(false);
        e9.k0 t10 = e9.n0.t();
        for (int i12 = 0; i12 < n0Var.size(); i12++) {
            b2.v1 v1Var = (b2.v1) n0Var.get(i12);
            t10.c(new b2.v1(b1(v1Var.f2354b), v1Var.f2355c, v1Var.d, v1Var.e));
        }
        l1 a2 = l1Var.a(new b2.w1(t10.f()));
        b2.u1 u1Var = a2.G;
        if (u1Var.H.isEmpty()) {
            return a2;
        }
        b2.t1 c10 = u1Var.a().c();
        m2 it = u1Var.H.values().iterator();
        while (it.hasNext()) {
            b2.q1 q1Var = (b2.q1) it.next();
            c10.a(new b2.q1(b1(q1Var.f2196a), q1Var.f2197b));
        }
        return a2.d(c10.b());
    }

    public final b2.p1 b1(b2.p1 p1Var) {
        String str;
        String str2 = (String) this.d.get(p1Var);
        if (str2 == null) {
            str2 = p1Var.f2188b;
        }
        int i10 = 0;
        while (true) {
            int i11 = p1Var.f2187a;
            b2.x[] xVarArr = p1Var.d;
            if (i10 < i11) {
                if (xVarArr[i10].f2417m != null) {
                    b2.x[] xVarArr2 = new b2.x[i11];
                    for (int i12 = 0; i12 < p1Var.f2187a; i12++) {
                        b2.x xVar = xVarArr[i12];
                        String str3 = xVar.f2417m;
                        if (str3 != null) {
                            str = (String) this.e.get(str3);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            b2.w a2 = xVar.a();
                            a2.f2364l = str;
                            xVarArr2[i12] = new b2.x(a2);
                        } else {
                            xVarArr2[i12] = xVar;
                        }
                    }
                    return new b2.p1(str2, xVarArr2);
                }
                i10++;
            } else {
                return new b2.p1(str2, xVarArr);
            }
        }
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        i iVar;
        w B;
        w B2;
        w B3;
        w B4;
        w B5;
        w B6;
        w B7;
        w B8;
        w B9;
        w B10;
        w B11;
        w B12;
        w B13;
        w B14;
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
                Z0(q.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                U0(q.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                L0(q.H0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                I0(q.H0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                T0(q.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                V0(q.H0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.x.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                W0(q.H0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.x.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                V0(q.H0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.x.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                X0(q.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                X0(q.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                Y0(q.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                m H0 = q.H0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                boolean z10 = parcel.readInt() != 0;
                if (H0 != null) {
                    P0(H0, readInt, 1, S0(new i2.y(2, z10)));
                    return true;
                }
                break;
            case 3014:
                m H02 = q.H0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                if (H02 != null && bundle != null) {
                    try {
                        t1 a14 = t1.a(bundle);
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            xa.n nVar = this.f12790b;
                            IBinder asBinder = H02.asBinder();
                            synchronized (nVar.f53572a) {
                                w B15 = nVar.B(asBinder);
                                iVar = B15 != null ? (i) ((a0.f) nVar.f53574c).get(B15) : null;
                            }
                            com.google.android.gms.common.api.internal.v vVar = iVar != null ? iVar.f12769b : null;
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
                m H03 = q.H0(parcel.readStrongBinder());
                parcel.readInt();
                H0(H03, (Bundle) w7.x.a(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                m H04 = q.H0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                N0(H04, readInt3, (Bundle) w7.x.a(parcel, creator), (Bundle) w7.x.a(parcel, creator), false);
                return true;
            case 3017:
                m H05 = q.H0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                int readInt5 = parcel.readInt();
                if (H05 != null && (readInt5 == 2 || readInt5 == 0 || readInt5 == 1)) {
                    P0(H05, readInt4, 15, S0(new i2.w(readInt5, 5)));
                    return true;
                }
                break;
            case 3018:
                m H06 = q.H0(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                boolean z11 = parcel.readInt() != 0;
                if (H06 != null) {
                    P0(H06, readInt6, 14, S0(new i2.y(4, z11)));
                    return true;
                }
                break;
            case 3019:
                m H07 = q.H0(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                if (H07 != null && readInt8 >= 0) {
                    P0(H07, readInt7, 20, new ig.c0(new r0(this, readInt8, 4), 23));
                    return true;
                }
                break;
            case 3020:
                m H08 = q.H0(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                if (H08 != null && readInt10 >= 0 && readInt11 >= readInt10) {
                    P0(H08, readInt9, 20, new ig.c0(new q0(this, readInt10, readInt11), 23));
                    return true;
                }
                break;
            case 3021:
                m H09 = q.H0(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                if (H09 != null) {
                    P0(H09, readInt12, 20, S0(new v0(9)));
                    return true;
                }
                break;
            case 3022:
                m H010 = q.H0(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                int readInt15 = parcel.readInt();
                if (H010 != null && readInt14 >= 0 && readInt15 >= 0) {
                    P0(H010, readInt13, 20, S0(new i2.v(readInt14, readInt15, 4)));
                    return true;
                }
                break;
            case 3023:
                m H011 = q.H0(parcel.readStrongBinder());
                int readInt16 = parcel.readInt();
                final int readInt17 = parcel.readInt();
                final int readInt18 = parcel.readInt();
                final int readInt19 = parcel.readInt();
                if (H011 != null && readInt17 >= 0 && readInt18 >= readInt17 && readInt19 >= 0) {
                    P0(H011, readInt16, 20, S0(new e2.j() {
                        @Override
                        public final void accept(Object obj) {
                            ((n1) obj).u0(readInt17, readInt18, readInt19);
                        }
                    }));
                    return true;
                }
                break;
            case 3024:
                m H012 = q.H0(parcel.readStrongBinder());
                int readInt20 = parcel.readInt();
                if (H012 != null && (B = this.f12790b.B(H012.asBinder())) != null) {
                    O0(B, readInt20);
                    return true;
                }
                break;
            case 3025:
                m H013 = q.H0(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (H013 != null && (B2 = this.f12790b.B(H013.asBinder())) != null) {
                    Q0(B2, readInt21, 1, S0(new k2.k0(18)));
                    return true;
                }
                break;
            case 3026:
                m H014 = q.H0(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                if (H014 != null) {
                    P0(H014, readInt22, 2, S0(new v0(7)));
                    return true;
                }
                break;
            case 3027:
                m H015 = q.H0(parcel.readStrongBinder());
                int readInt23 = parcel.readInt();
                Bundle bundle2 = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                if (H015 != null && bundle2 != null) {
                    try {
                        P0(H015, readInt23, 13, S0(new ig.c0(new b2.z0(bundle2.getFloat(b2.z0.e, 1.0f), bundle2.getFloat(b2.z0.f2442f, 1.0f)), 22)));
                        break;
                    } catch (RuntimeException e7) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e7);
                        break;
                    }
                }
                break;
            case 3028:
                m H016 = q.H0(parcel.readStrongBinder());
                int readInt24 = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (H016 != null && readFloat > 0.0f) {
                    P0(H016, readInt24, 13, S0(new i2.t(readFloat, 1)));
                    return true;
                }
                break;
            case 3029:
                m H017 = q.H0(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                Bundle bundle3 = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                if (H017 != null && bundle3 != null && (B3 = this.f12790b.B(H017.asBinder())) != null) {
                    try {
                        final b2.p0 a15 = b2.p0.a(B3.f12984c, bundle3);
                        Q0(B3, readInt25, 20, new z0(new ag.m(24, new h1() {
                            @Override
                            public final Object f(f0 f0Var, w wVar, int i12) {
                                switch (r1) {
                                    case 0:
                                        return f0Var.l(wVar, e9.n0.y(a15));
                                    case 1:
                                        return f0Var.l(wVar, e9.n0.y(a15));
                                    default:
                                        return f0Var.l(wVar, e9.n0.y(a15));
                                }
                            }
                        }, new v0(1)), 1));
                        break;
                    } catch (RuntimeException e10) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
                        break;
                    }
                }
                break;
            case 3030:
                m H018 = q.H0(parcel.readStrongBinder());
                int readInt26 = parcel.readInt();
                int readInt27 = parcel.readInt();
                Bundle bundle4 = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                if (H018 != null && bundle4 != null && readInt27 >= 0 && (B4 = this.f12790b.B(H018.asBinder())) != null) {
                    try {
                        final b2.p0 a16 = b2.p0.a(B4.f12984c, bundle4);
                        Q0(B4, readInt26, 20, new z0(new ag.m(24, new h1() {
                            @Override
                            public final Object f(f0 f0Var, w wVar, int i12) {
                                switch (r1) {
                                    case 0:
                                        return f0Var.l(wVar, e9.n0.y(a16));
                                    case 1:
                                        return f0Var.l(wVar, e9.n0.y(a16));
                                    default:
                                        return f0Var.l(wVar, e9.n0.y(a16));
                                }
                            }
                        }, new r0(this, readInt27, 1)), 1));
                        break;
                    } catch (RuntimeException e11) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
                        break;
                    }
                }
                break;
            case 3031:
                m H019 = q.H0(parcel.readStrongBinder());
                int readInt28 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (H019 != null && readStrongBinder != null && (B5 = this.f12790b.B(H019.asBinder())) != null) {
                    try {
                        e9.n0 a17 = b2.i.a(readStrongBinder);
                        e9.k0 t10 = e9.n0.t();
                        for (int i12 = 0; i12 < a17.size(); i12++) {
                            Bundle bundle5 = (Bundle) a17.get(i12);
                            bundle5.getClass();
                            t10.c(b2.p0.a(B5.f12984c, bundle5));
                        }
                        Q0(B5, readInt28, 20, new z0(new ag.m(24, new i2.z(3, t10.f()), new v0(0)), 1));
                        break;
                    } catch (RuntimeException e12) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e12);
                        break;
                    }
                }
                break;
            case 3032:
                m H020 = q.H0(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                int readInt30 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (H020 != null && readStrongBinder2 != null && readInt30 >= 0 && (B6 = this.f12790b.B(H020.asBinder())) != null) {
                    try {
                        e9.n0 a18 = b2.i.a(readStrongBinder2);
                        e9.k0 t11 = e9.n0.t();
                        for (int i13 = 0; i13 < a18.size(); i13++) {
                            Bundle bundle6 = (Bundle) a18.get(i13);
                            bundle6.getClass();
                            t11.c(b2.p0.a(B6.f12984c, bundle6));
                        }
                        Q0(B6, readInt29, 20, new z0(new ag.m(24, new i2.z(2, t11.f()), new r0(this, readInt30, 3)), 1));
                        break;
                    } catch (RuntimeException e13) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e13);
                        break;
                    }
                }
                break;
            case 3033:
                m H021 = q.H0(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                Bundle bundle7 = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                if (H021 != null && bundle7 != null && (B7 = this.f12790b.B(H021.asBinder())) != null) {
                    try {
                        Q0(B7, readInt31, 19, S0(new i2.r(b2.s0.b(B7.f12984c, bundle7))));
                        break;
                    } catch (RuntimeException e14) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e14);
                        break;
                    }
                }
                break;
            case 3034:
                m H022 = q.H0(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                if (H022 != null && (B8 = this.f12790b.B(H022.asBinder())) != null) {
                    Q0(B8, readInt32, 3, S0(new v0(3)));
                    return true;
                }
                break;
            case 3035:
                m H023 = q.H0(parcel.readStrongBinder());
                parcel.readInt();
                if (H023 != null) {
                    long clearCallingIdentity2 = Binder.clearCallingIdentity();
                    try {
                        f0 f0Var = (f0) this.f12789a.get();
                        if (f0Var != null && !f0Var.j()) {
                            e2.l0.W(f0Var.f12747l, new k2.u(20, this, H023));
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3036:
                m H024 = q.H0(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                if (H024 != null) {
                    P0(H024, readInt33, 4, S0(new v0(5)));
                    return true;
                }
                break;
            case 3037:
                m H025 = q.H0(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                int readInt35 = parcel.readInt();
                if (H025 != null && readInt35 >= 0) {
                    P0(H025, readInt34, 10, new ig.c0(new r0(this, readInt35, 0), 23));
                    return true;
                }
                break;
            case 3038:
                m H026 = q.H0(parcel.readStrongBinder());
                int readInt36 = parcel.readInt();
                long readLong = parcel.readLong();
                if (H026 != null) {
                    P0(H026, readInt36, 5, S0(new k2.g0(readLong)));
                    return true;
                }
                break;
            case 3039:
                m H027 = q.H0(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                int readInt38 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (H027 != null && readInt38 >= 0) {
                    P0(H027, readInt37, 10, new ig.c0(new j2.d(this, readInt38, readLong2, 1), 23));
                    return true;
                }
                break;
            case 3040:
                m H028 = q.H0(parcel.readStrongBinder());
                int readInt39 = parcel.readInt();
                if (H028 != null && (B9 = this.f12790b.B(H028.asBinder())) != null) {
                    Q0(B9, readInt39, 11, S0(new k2.k0(22)));
                    return true;
                }
                break;
            case 3041:
                m H029 = q.H0(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                if (H029 != null && (B10 = this.f12790b.B(H029.asBinder())) != null) {
                    Q0(B10, readInt40, 12, S0(new k2.k0(26)));
                    return true;
                }
                break;
            case 3042:
                m H030 = q.H0(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (H030 != null) {
                    P0(H030, readInt41, 6, S0(new k2.k0(24)));
                    return true;
                }
                break;
            case 3043:
                m H031 = q.H0(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (H031 != null) {
                    P0(H031, readInt42, 8, S0(new k2.k0(19)));
                    return true;
                }
                break;
            case 3044:
                m H032 = q.H0(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                Surface surface = (Surface) w7.x.a(parcel, Surface.CREATOR);
                if (H032 != null) {
                    P0(H032, readInt43, 27, S0(new ag.m(22, this, surface)));
                    return true;
                }
                break;
            case 3045:
                m H033 = q.H0(parcel.readStrongBinder());
                if (H033 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        f0 f0Var2 = (f0) this.f12789a.get();
                        if (f0Var2 != null && !f0Var2.j()) {
                            w B16 = this.f12790b.B(H033.asBinder());
                            if (B16 != null) {
                                e2.l0.W(f0Var2.f12747l, new k2.u(21, this, B16));
                            }
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3046:
                m H034 = q.H0(parcel.readStrongBinder());
                int readInt44 = parcel.readInt();
                if (H034 != null && (B11 = this.f12790b.B(H034.asBinder())) != null) {
                    Q0(B11, readInt44, 7, S0(new k2.k0(23)));
                    return true;
                }
                break;
            case 3047:
                m H035 = q.H0(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                if (H035 != null && (B12 = this.f12790b.B(H035.asBinder())) != null) {
                    Q0(B12, readInt45, 9, S0(new k2.k0(27)));
                    return true;
                }
                break;
            case 3048:
                m H036 = q.H0(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                Bundle bundle8 = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                if (H036 != null && bundle8 != null) {
                    try {
                        P0(H036, readInt46, 29, S0(new ag.m(20, this, b2.u1.b(bundle8))));
                        break;
                    } catch (RuntimeException e15) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e15);
                        break;
                    }
                }
                break;
            case 3049:
                m H037 = q.H0(parcel.readStrongBinder());
                int readInt47 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle9 = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                if (H037 != null && readString != null && bundle9 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        e2.a.l("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                        break;
                    } else {
                        try {
                            J0(H037, readInt47, null, 40010, new z0(new k2.k0(readString, b2.g1.a(bundle9)), 1));
                            break;
                        } catch (RuntimeException e16) {
                            e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e16);
                            break;
                        }
                    }
                }
                break;
            case 3050:
                m H038 = q.H0(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                Bundle bundle10 = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                if (H038 != null && bundle10 != null) {
                    try {
                        J0(H038, readInt48, null, 40010, new z0(new v0(b2.g1.a(bundle10), 12), 1));
                        break;
                    } catch (RuntimeException e17) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e17);
                        break;
                    }
                }
                break;
            case 3051:
                m H039 = q.H0(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                int readInt50 = parcel.readInt();
                int readInt51 = parcel.readInt();
                if (H039 != null && readInt50 >= 0) {
                    P0(H039, readInt49, 33, S0(new i2.v(readInt50, readInt51, 3)));
                    return true;
                }
                break;
            case 3052:
                m H040 = q.H0(parcel.readStrongBinder());
                int readInt52 = parcel.readInt();
                int readInt53 = parcel.readInt();
                if (H040 != null) {
                    P0(H040, readInt52, 34, S0(new i2.w(readInt53, 4)));
                    return true;
                }
                break;
            case 3053:
                m H041 = q.H0(parcel.readStrongBinder());
                int readInt54 = parcel.readInt();
                int readInt55 = parcel.readInt();
                if (H041 != null) {
                    P0(H041, readInt54, 34, S0(new i2.w(readInt55, 3)));
                    return true;
                }
                break;
            case 3054:
                m H042 = q.H0(parcel.readStrongBinder());
                int readInt56 = parcel.readInt();
                final boolean z12 = parcel.readInt() != 0;
                final int readInt57 = parcel.readInt();
                if (H042 != null) {
                    P0(H042, readInt56, 34, S0(new e2.j() {
                        @Override
                        public final void accept(Object obj) {
                            ((n1) obj).I(readInt57, z12);
                        }
                    }));
                    return true;
                }
                break;
            case 3055:
                m H043 = q.H0(parcel.readStrongBinder());
                int readInt58 = parcel.readInt();
                int readInt59 = parcel.readInt();
                Bundle bundle11 = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                if (H043 != null && bundle11 != null && readInt59 >= 0 && (B13 = this.f12790b.B(H043.asBinder())) != null) {
                    try {
                        final b2.p0 a19 = b2.p0.a(B13.f12984c, bundle11);
                        Q0(B13, readInt58, 20, new z0(new ag.m(24, new h1() {
                            @Override
                            public final Object f(f0 f0Var3, w wVar, int i122) {
                                switch (r1) {
                                    case 0:
                                        return f0Var3.l(wVar, e9.n0.y(a19));
                                    case 1:
                                        return f0Var3.l(wVar, e9.n0.y(a19));
                                    default:
                                        return f0Var3.l(wVar, e9.n0.y(a19));
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
                m H044 = q.H0(parcel.readStrongBinder());
                int readInt60 = parcel.readInt();
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (H044 != null && readStrongBinder3 != null && readInt61 >= 0 && readInt62 >= readInt61 && (B14 = this.f12790b.B(H044.asBinder())) != null) {
                    try {
                        e9.n0 a20 = b2.i.a(readStrongBinder3);
                        e9.k0 t12 = e9.n0.t();
                        for (int i14 = 0; i14 < a20.size(); i14++) {
                            Bundle bundle12 = (Bundle) a20.get(i14);
                            bundle12.getClass();
                            t12.c(b2.p0.a(B14.f12984c, bundle12));
                        }
                        Q0(B14, readInt60, 20, new z0(new ag.m(24, new ig.c0(t12.f(), 21), new q0(this, readInt61, readInt62)), 1));
                        break;
                    } catch (RuntimeException e19) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e19);
                        break;
                    }
                }
                break;
            case 3057:
                m H045 = q.H0(parcel.readStrongBinder());
                int readInt63 = parcel.readInt();
                Bundle bundle13 = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                boolean z13 = parcel.readInt() != 0;
                if (H045 != null && bundle13 != null) {
                    try {
                        P0(H045, readInt63, 35, S0(new ag.w0(2, b2.f.a(bundle13), z13)));
                        break;
                    } catch (RuntimeException e20) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e20);
                        break;
                    }
                }
                break;
            case 3058:
                m H046 = q.H0(parcel.readStrongBinder());
                int readInt64 = parcel.readInt();
                if (H046 != null) {
                    P0(H046, readInt64, 24, S0(new k2.k0(17)));
                    return true;
                }
                break;
            case 3059:
                m H047 = q.H0(parcel.readStrongBinder());
                int readInt65 = parcel.readInt();
                if (H047 != null) {
                    P0(H047, readInt65, 24, S0(new v0(4)));
                    return true;
                }
                break;
            case 3060:
                m H048 = q.H0(parcel.readStrongBinder());
                int readInt66 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                N0(H048, readInt66, (Bundle) w7.x.a(parcel, creator2), (Bundle) w7.x.a(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                m H049 = q.H0(parcel.readStrongBinder());
                int readInt67 = parcel.readInt();
                Surface surface2 = (Surface) w7.x.a(parcel, Surface.CREATOR);
                int readInt68 = parcel.readInt();
                int readInt69 = parcel.readInt();
                if (H049 != null) {
                    P0(H049, readInt67, 27, S0(new s0(this, surface2, readInt68, readInt69)));
                    return true;
                }
                break;
            case 3062:
                m H050 = q.H0(parcel.readStrongBinder());
                int readInt70 = parcel.readInt();
                int readInt71 = parcel.readInt();
                int readInt72 = parcel.readInt();
                if (H050 != null) {
                    P0(H050, readInt70, 27, S0(new q0(this, readInt71, readInt72)));
                    return true;
                }
                break;
            default:
                switch (i10) {
                    case 4001:
                        m H051 = q.H0(parcel.readStrongBinder());
                        int readInt73 = parcel.readInt();
                        Bundle bundle14 = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                        if (H051 != null) {
                            if (bundle14 != null) {
                                try {
                                    a13 = r.a(bundle14);
                                } catch (RuntimeException e21) {
                                    e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e21);
                                    break;
                                }
                            }
                            J0(H051, readInt73, null, 50000, new z0(new v0(a13, 6), 0));
                            break;
                        }
                        break;
                    case 4002:
                        m H052 = q.H0(parcel.readStrongBinder());
                        int readInt74 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (H052 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                e2.a.l("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            J0(H052, readInt74, null, 50004, new z0(new k2.k0(readString2, 25), 0));
                            return true;
                        }
                        break;
                    case 4003:
                        m H053 = q.H0(parcel.readStrongBinder());
                        int readInt75 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt76 = parcel.readInt();
                        int readInt77 = parcel.readInt();
                        Bundle bundle15 = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                        if (H053 != null) {
                            if (TextUtils.isEmpty(readString3)) {
                                e2.a.l("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                                break;
                            } else if (readInt76 < 0) {
                                e2.a.l("MediaSessionStub", "getChildren(): Ignoring negative page");
                                break;
                            } else if (readInt77 < 1) {
                                e2.a.l("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                                break;
                            } else {
                                if (bundle15 != null) {
                                    try {
                                        a12 = r.a(bundle15);
                                    } catch (RuntimeException e22) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e22);
                                        break;
                                    }
                                }
                                J0(H053, readInt75, null, 50003, new z0(new k2.k0(readString3, readInt76, readInt77, a12), 0));
                                break;
                            }
                        }
                        break;
                    case 4004:
                        m H054 = q.H0(parcel.readStrongBinder());
                        int readInt78 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle16 = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                        if (H054 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                e2.a.l("MediaSessionStub", "search(): Ignoring empty query");
                                break;
                            } else {
                                if (bundle16 != null) {
                                    try {
                                        a11 = r.a(bundle16);
                                    } catch (RuntimeException e23) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e23);
                                        break;
                                    }
                                }
                                J0(H054, readInt78, null, 50005, new z0(new v0(readString4, a11, 10), 0));
                                break;
                            }
                        }
                        break;
                    case 4005:
                        m H055 = q.H0(parcel.readStrongBinder());
                        int readInt79 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt80 = parcel.readInt();
                        int readInt81 = parcel.readInt();
                        Bundle bundle17 = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                        if (H055 != null) {
                            if (TextUtils.isEmpty(readString5)) {
                                e2.a.l("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                                break;
                            } else if (readInt80 < 0) {
                                e2.a.l("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                                break;
                            } else if (readInt81 < 1) {
                                e2.a.l("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                                break;
                            } else {
                                if (bundle17 != null) {
                                    try {
                                        a10 = r.a(bundle17);
                                    } catch (RuntimeException e24) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e24);
                                        break;
                                    }
                                }
                                J0(H055, readInt79, null, 50006, new z0(new v0(readString5, readInt80, readInt81, a10), 0));
                                break;
                            }
                        }
                        break;
                    case 4006:
                        m H056 = q.H0(parcel.readStrongBinder());
                        int readInt82 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle18 = (Bundle) w7.x.a(parcel, Bundle.CREATOR);
                        if (H056 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                e2.a.l("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                                break;
                            } else {
                                if (bundle18 != null) {
                                    try {
                                        a2 = r.a(bundle18);
                                    } catch (RuntimeException e25) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e25);
                                        break;
                                    }
                                }
                                J0(H056, readInt82, null, 50001, new z0(new v0(readString6, a2, 8), 0));
                                break;
                            }
                        }
                        break;
                    case 4007:
                        m H057 = q.H0(parcel.readStrongBinder());
                        int readInt83 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (H057 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                e2.a.l("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            J0(H057, readInt83, null, 50002, new z0(new k2.k0(readString7, 15), 0));
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
