package m4;

import a8.he;
import a8.je;
import a8.ng;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import f9.g2;
import f9.x1;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
public final class j1 extends Binder implements n {
    public final WeakReference f18091a;
    public final com.google.firebase.messaging.q f18092b;
    public final Set f18093c;
    public f9.r1 d;
    public x1 e;
    public int f18094f;
    public i1 f18095i;

    public j1(f0 f0Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.f18091a = new WeakReference(f0Var);
        this.f18092b = new com.google.firebase.messaging.q(f0Var);
        this.f18093c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = f9.r1.f10332r;
        this.e = x1.h;
    }

    public static k9.y I0(f0 f0Var, w wVar, int i10, h1 h1Var, e2.j jVar) {
        if (f0Var.j()) {
            return k9.w.f16496b;
        }
        k9.y yVar = (k9.y) h1Var.c(f0Var, wVar, i10);
        ?? obj = new Object();
        yVar.a(new v0(f0Var, (Object) obj, (Object) jVar, (Object) yVar, 1), k9.r.f16491a);
        return obj;
    }

    public static void P0(f0 f0Var, w wVar, int i10, t1 t1Var) {
        try {
            v vVar = wVar.d;
            vVar.getClass();
            vVar.j(i10, t1Var);
            f0Var.f18043c.a(true, true);
        } catch (RemoteException e) {
            e2.a.m("MediaSessionStub", "Failed to send result to controller " + wVar, e);
        }
    }

    public static jg.e1 Q0(e2.j jVar) {
        return new jg.e1(new jg.e1(jVar, 20), 19);
    }

    public final void F0(m mVar, Bundle bundle) {
        WeakReference weakReference = this.f18091a;
        f0 f0Var = (f0) weakReference.get();
        if (mVar != null && bundle != null && f0Var != null) {
            try {
                Context context = f0Var.f18044f;
                j a2 = j.a(bundle);
                int callingUid = Binder.getCallingUid();
                int callingPid = Binder.getCallingPid();
                String str = a2.f18087c;
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                if (packagesForUid != null && packagesForUid.length != 0) {
                    for (String str2 : packagesForUid) {
                        if (!str2.equals(str)) {
                        }
                    }
                    e2.a.l("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                    je.a(mVar);
                    return;
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = a2.d;
                }
                try {
                    n4.t tVar = new n4.t(str, callingPid, callingUid);
                    boolean b10 = n4.w.a(context).b(tVar);
                    int i10 = a2.f18085a;
                    int i11 = a2.f18086b;
                    w wVar = new w(tVar, i10, i11, b10, new e1(mVar, i11), a2.e);
                    f0 f0Var2 = (f0) weakReference.get();
                    if (f0Var2 != null && !f0Var2.j()) {
                        this.f18093c.add(wVar);
                        e2.n0.W(f0Var2.f18049l, new v0(this, wVar, f0Var2, mVar, 0));
                        return;
                    }
                    je.a(mVar);
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e);
                return;
            }
        }
        je.a(mVar);
    }

    public final void G0(m mVar, int i10) {
        if (mVar == null) {
            return;
        }
        N0(mVar, i10, 26, Q0(new jh.l(27)));
    }

    public final void H0(m mVar, int i10, p1 p1Var, int i11, h1 h1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            f0 f0Var = (f0) this.f18091a.get();
            if (f0Var != null && !f0Var.j()) {
                w l4 = this.f18092b.l(mVar.asBinder());
                if (l4 == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return;
                }
                e2.n0.W(f0Var.f18049l, new z0(this, l4, p1Var, f0Var, i10, i11, h1Var));
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
        N0(mVar, i10, 26, Q0(new jh.l(19)));
    }

    public final int K0(w wVar, n1 n1Var, int i10) {
        if (n1Var.o0(17)) {
            com.google.firebase.messaging.q qVar = this.f18092b;
            if (!qVar.v(wVar, 17) && qVar.v(wVar, 16)) {
                return n1Var.n0() + i10;
            }
        }
        return i10;
    }

    public final void L0(m mVar, int i10, Bundle bundle, Bundle bundle2, boolean z10) {
        p1 p1Var;
        Bundle o10 = e2.n0.o(bundle2);
        if (mVar != null && bundle != null && o10 != null) {
            try {
                int i11 = bundle.getInt(p1.f18197f, 0);
                if (i11 != 0) {
                    p1Var = new p1(i11);
                } else {
                    String string = bundle.getString(p1.f18198g);
                    string.getClass();
                    Bundle o11 = e2.n0.o(bundle.getBundle(p1.h));
                    if (o11 == null) {
                        o11 = Bundle.EMPTY;
                    }
                    p1Var = new p1(string, o11);
                }
                if (e.j(p1Var.f18200b)) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        f0 f0Var = (f0) this.f18091a.get();
                        if (f0Var != null && !f0Var.j()) {
                            w l4 = this.f18092b.l(mVar.asBinder());
                            if (l4 == null) {
                                Binder.restoreCallingIdentity(clearCallingIdentity);
                                return;
                            }
                            e2.n0.W(f0Var.f18049l, new ag.q0(this, l4, p1Var, f0Var, i10, mVar, 3));
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            return;
                        }
                        return;
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                H0(mVar, i10, p1Var, 0, new a1(new jh.l(z10, p1Var, o10), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
            }
        }
    }

    public final void M0(w wVar, int i10) {
        O0(wVar, i10, 1, Q0(new s0(1, this, wVar)));
    }

    public final void N0(m mVar, int i10, int i11, jg.e1 e1Var) {
        w l4 = this.f18092b.l(mVar.asBinder());
        if (l4 != null) {
            O0(l4, i10, i11, e1Var);
        }
    }

    public final void O0(w wVar, int i10, int i11, h1 h1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            f0 f0Var = (f0) this.f18091a.get();
            if (f0Var != null && !f0Var.j()) {
                e2.n0.W(f0Var.f18049l, new li.g0(this, wVar, i11, f0Var, i10, h1Var));
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
        N0(mVar, i10, 26, Q0(new i2.y(3, z10)));
    }

    public final void S0(m mVar, int i10, int i11) {
        if (mVar != null && i11 >= 0) {
            N0(mVar, i10, 25, Q0(new i2.w(i11, 6)));
        }
    }

    public final void T0(m mVar, int i10, Bundle bundle, boolean z10) {
        w l4;
        if (mVar != null && bundle != null && (l4 = this.f18092b.l(mVar.asBinder())) != null) {
            try {
                O0(l4, i10, 31, new a1(new s0(3, new di.f(2, b2.p0.a(l4.f18288c, bundle), z10), new x0(9)), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void U0(m mVar, int i10, Bundle bundle, long j10) {
        w l4;
        if (mVar != null && bundle != null && (l4 = this.f18092b.l(mVar.asBinder())) != null) {
            try {
                O0(l4, i10, 31, new a1(new s0(3, new di.d1(b2.p0.a(l4.f18288c, bundle), j10, 2), new x0(9)), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void V0(m mVar, int i10, IBinder iBinder, boolean z10) {
        w l4;
        if (mVar != null && iBinder != null && (l4 = this.f18092b.l(mVar.asBinder())) != null) {
            try {
                f9.i0 a2 = b2.i.a(iBinder);
                f9.f0 t10 = f9.i0.t();
                for (int i11 = 0; i11 < a2.size(); i11++) {
                    Bundle bundle = (Bundle) a2.get(i11);
                    bundle.getClass();
                    t10.c(b2.p0.a(l4.f18288c, bundle));
                }
                O0(l4, i10, 20, new a1(new s0(3, new di.f(4, t10.f(), z10), new x0(9)), 1));
            } catch (RuntimeException e) {
                e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    public final void W0(m mVar, int i10, IBinder iBinder, int i11, long j10) {
        w l4;
        if (mVar != null && iBinder != null) {
            if ((i11 == -1 || i11 >= 0) && (l4 = this.f18092b.l(mVar.asBinder())) != null) {
                try {
                    f9.i0 a2 = b2.i.a(iBinder);
                    f9.f0 t10 = f9.i0.t();
                    for (int i12 = 0; i12 < a2.size(); i12++) {
                        Bundle bundle = (Bundle) a2.get(i12);
                        bundle.getClass();
                        t10.c(b2.p0.a(l4.f18288c, bundle));
                    }
                    O0(l4, i10, 20, new a1(new s0(3, new j2.c(t10.f(), i11, j10, 2), new x0(9)), 1));
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
        f9.r1 r1Var;
        f9.i0 i0Var = l1Var.F.f3545a;
        ?? ngVar = new ng(4, 7);
        ng ngVar2 = new ng(4, 7);
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            b2.q1 q1Var = ((b2.v1) i0Var.get(i10)).f3517b;
            String str = (String) this.d.get(q1Var);
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                int i11 = this.f18094f;
                this.f18094f = i11 + 1;
                String str2 = e2.n0.f9692a;
                sb2.append(Integer.toString(i11, 36));
                sb2.append("-");
                sb2.append(q1Var.f3359b);
                str = sb2.toString();
            }
            ngVar.I(q1Var, str);
            ngVar2.w(q1Var.f3359b, str);
        }
        if (ngVar.f639b == 0) {
            r1Var = f9.r1.f10332r;
        } else {
            r1Var = new f9.r1(ngVar.f639b, (Object[]) ngVar.f640c);
        }
        this.d = r1Var;
        this.e = ngVar2.c(false);
        f9.f0 t10 = f9.i0.t();
        for (int i12 = 0; i12 < i0Var.size(); i12++) {
            b2.v1 v1Var = (b2.v1) i0Var.get(i12);
            t10.c(new b2.v1(Z0(v1Var.f3517b), v1Var.f3518c, v1Var.d, v1Var.e));
        }
        l1 a2 = l1Var.a(new b2.w1(t10.f()));
        b2.u1 u1Var = a2.G;
        if (u1Var.H.isEmpty()) {
            return a2;
        }
        b2.t1 c10 = u1Var.a().c();
        g2 it = u1Var.H.values().iterator();
        while (it.hasNext()) {
            b2.r1 r1Var2 = (b2.r1) it.next();
            c10.a(new b2.r1(Z0(r1Var2.f3385a), r1Var2.f3386b));
        }
        return a2.d(c10.b());
    }

    public final b2.q1 Z0(b2.q1 q1Var) {
        String str;
        String str2 = (String) this.d.get(q1Var);
        if (str2 == null) {
            str2 = q1Var.f3359b;
        }
        int i10 = 0;
        while (true) {
            int i11 = q1Var.f3358a;
            b2.x[] xVarArr = q1Var.d;
            if (i10 < i11) {
                if (xVarArr[i10].f3580m != null) {
                    b2.x[] xVarArr2 = new b2.x[i11];
                    for (int i12 = 0; i12 < q1Var.f3358a; i12++) {
                        b2.x xVar = xVarArr[i12];
                        String str3 = xVar.f3580m;
                        if (str3 != null) {
                            str = (String) this.e.get(str3);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            b2.w a2 = xVar.a();
                            a2.f3527l = str;
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
        w l4;
        w l10;
        w l11;
        w l12;
        w l13;
        w l14;
        w l15;
        w l16;
        w l17;
        w l18;
        w l19;
        w l20;
        w l21;
        w l22;
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
                T0(q.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) he.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                U0(q.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) he.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                T0(q.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) he.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
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
                    N0(F0, readInt, 1, Q0(new i2.y(2, z10)));
                    return true;
                }
                break;
            case 3014:
                m F02 = q.F0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) he.a(parcel, Bundle.CREATOR);
                if (F02 != null && bundle != null) {
                    try {
                        t1 a14 = t1.a(bundle);
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            com.google.firebase.messaging.q qVar = this.f18092b;
                            IBinder asBinder = F02.asBinder();
                            synchronized (qVar.f7757a) {
                                w l23 = qVar.l(asBinder);
                                iVar = l23 != null ? (i) ((a0.f) qVar.f7759c).get(l23) : null;
                            }
                            com.google.android.gms.common.api.internal.u uVar = iVar != null ? iVar.f18071b : null;
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
                m F03 = q.F0(parcel.readStrongBinder());
                parcel.readInt();
                F0(F03, (Bundle) he.a(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                m F04 = q.F0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                L0(F04, readInt3, (Bundle) he.a(parcel, creator), (Bundle) he.a(parcel, creator), false);
                return true;
            case 3017:
                m F05 = q.F0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                int readInt5 = parcel.readInt();
                if (F05 != null && (readInt5 == 2 || readInt5 == 0 || readInt5 == 1)) {
                    N0(F05, readInt4, 15, Q0(new i2.w(readInt5, 5)));
                    return true;
                }
                break;
            case 3018:
                m F06 = q.F0(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                boolean z11 = parcel.readInt() != 0;
                if (F06 != null) {
                    N0(F06, readInt6, 14, Q0(new i2.y(4, z11)));
                    return true;
                }
                break;
            case 3019:
                m F07 = q.F0(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                if (F07 != null && readInt8 >= 0) {
                    N0(F07, readInt7, 20, new jg.e1(new r0(this, readInt8, 4), 19));
                    return true;
                }
                break;
            case 3020:
                m F08 = q.F0(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                if (F08 != null && readInt10 >= 0 && readInt11 >= readInt10) {
                    N0(F08, readInt9, 20, new jg.e1(new q0(this, readInt10, readInt11), 19));
                    return true;
                }
                break;
            case 3021:
                m F09 = q.F0(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                if (F09 != null) {
                    N0(F09, readInt12, 20, Q0(new x0(7)));
                    return true;
                }
                break;
            case 3022:
                m F010 = q.F0(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                int readInt15 = parcel.readInt();
                if (F010 != null && readInt14 >= 0 && readInt15 >= 0) {
                    N0(F010, readInt13, 20, Q0(new fh.c(readInt14, readInt15, 5)));
                    return true;
                }
                break;
            case 3023:
                m F011 = q.F0(parcel.readStrongBinder());
                int readInt16 = parcel.readInt();
                final int readInt17 = parcel.readInt();
                final int readInt18 = parcel.readInt();
                final int readInt19 = parcel.readInt();
                if (F011 != null && readInt17 >= 0 && readInt18 >= readInt17 && readInt19 >= 0) {
                    N0(F011, readInt16, 20, Q0(new e2.j() {
                        @Override
                        public final void accept(Object obj) {
                            ((n1) obj).t0(readInt17, readInt18, readInt19);
                        }
                    }));
                    return true;
                }
                break;
            case 3024:
                m F012 = q.F0(parcel.readStrongBinder());
                int readInt20 = parcel.readInt();
                if (F012 != null && (l4 = this.f18092b.l(F012.asBinder())) != null) {
                    M0(l4, readInt20);
                    return true;
                }
                break;
            case 3025:
                m F013 = q.F0(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (F013 != null && (l10 = this.f18092b.l(F013.asBinder())) != null) {
                    O0(l10, readInt21, 1, Q0(new jh.l(16)));
                    return true;
                }
                break;
            case 3026:
                m F014 = q.F0(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                if (F014 != null) {
                    N0(F014, readInt22, 2, Q0(new x0(5)));
                    return true;
                }
                break;
            case 3027:
                m F015 = q.F0(parcel.readStrongBinder());
                int readInt23 = parcel.readInt();
                Bundle bundle2 = (Bundle) he.a(parcel, Bundle.CREATOR);
                if (F015 != null && bundle2 != null) {
                    try {
                        N0(F015, readInt23, 13, Q0(new jg.e1(new b2.a1(bundle2.getFloat(b2.a1.e, 1.0f), bundle2.getFloat(b2.a1.f3139f, 1.0f)), 18)));
                        break;
                    } catch (RuntimeException e10) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e10);
                        break;
                    }
                }
                break;
            case 3028:
                m F016 = q.F0(parcel.readStrongBinder());
                int readInt24 = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (F016 != null && readFloat > 0.0f) {
                    N0(F016, readInt24, 13, Q0(new i2.u(readFloat, 1)));
                    return true;
                }
                break;
            case 3029:
                m F017 = q.F0(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                Bundle bundle3 = (Bundle) he.a(parcel, Bundle.CREATOR);
                if (F017 != null && bundle3 != null && (l11 = this.f18092b.l(F017.asBinder())) != null) {
                    try {
                        final b2.p0 a15 = b2.p0.a(l11.f18288c, bundle3);
                        O0(l11, readInt25, 20, new a1(new s0(4, new h1() {
                            @Override
                            public final Object c(f0 f0Var, w wVar, int i12) {
                                switch (r2) {
                                    case 0:
                                        return f0Var.l(wVar, f9.i0.y(a15));
                                    case 1:
                                        return f0Var.l(wVar, f9.i0.y(a15));
                                    default:
                                        return f0Var.l(wVar, f9.i0.y(a15));
                                }
                            }
                        }, new jh.l(29)), 1));
                        break;
                    } catch (RuntimeException e11) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
                        break;
                    }
                }
                break;
            case 3030:
                m F018 = q.F0(parcel.readStrongBinder());
                int readInt26 = parcel.readInt();
                int readInt27 = parcel.readInt();
                Bundle bundle4 = (Bundle) he.a(parcel, Bundle.CREATOR);
                if (F018 != null && bundle4 != null && readInt27 >= 0 && (l12 = this.f18092b.l(F018.asBinder())) != null) {
                    try {
                        final b2.p0 a16 = b2.p0.a(l12.f18288c, bundle4);
                        O0(l12, readInt26, 20, new a1(new s0(4, new h1() {
                            @Override
                            public final Object c(f0 f0Var, w wVar, int i12) {
                                switch (r2) {
                                    case 0:
                                        return f0Var.l(wVar, f9.i0.y(a16));
                                    case 1:
                                        return f0Var.l(wVar, f9.i0.y(a16));
                                    default:
                                        return f0Var.l(wVar, f9.i0.y(a16));
                                }
                            }
                        }, new r0(this, readInt27, 1)), 1));
                        break;
                    } catch (RuntimeException e12) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e12);
                        break;
                    }
                }
                break;
            case 3031:
                m F019 = q.F0(parcel.readStrongBinder());
                int readInt28 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (F019 != null && readStrongBinder != null && (l13 = this.f18092b.l(F019.asBinder())) != null) {
                    try {
                        f9.i0 a17 = b2.i.a(readStrongBinder);
                        f9.f0 t10 = f9.i0.t();
                        for (int i12 = 0; i12 < a17.size(); i12++) {
                            Bundle bundle5 = (Bundle) a17.get(i12);
                            bundle5.getClass();
                            t10.c(b2.p0.a(l13.f18288c, bundle5));
                        }
                        O0(l13, readInt28, 20, new a1(new s0(4, new i2.a0(3, t10.f()), new jh.l(28)), 1));
                        break;
                    } catch (RuntimeException e13) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e13);
                        break;
                    }
                }
                break;
            case 3032:
                m F020 = q.F0(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                int readInt30 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (F020 != null && readStrongBinder2 != null && readInt30 >= 0 && (l14 = this.f18092b.l(F020.asBinder())) != null) {
                    try {
                        f9.i0 a18 = b2.i.a(readStrongBinder2);
                        f9.f0 t11 = f9.i0.t();
                        for (int i13 = 0; i13 < a18.size(); i13++) {
                            Bundle bundle6 = (Bundle) a18.get(i13);
                            bundle6.getClass();
                            t11.c(b2.p0.a(l14.f18288c, bundle6));
                        }
                        O0(l14, readInt29, 20, new a1(new s0(4, new i2.a0(2, t11.f()), new r0(this, readInt30, 3)), 1));
                        break;
                    } catch (RuntimeException e14) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e14);
                        break;
                    }
                }
                break;
            case 3033:
                m F021 = q.F0(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                Bundle bundle7 = (Bundle) he.a(parcel, Bundle.CREATOR);
                if (F021 != null && bundle7 != null && (l15 = this.f18092b.l(F021.asBinder())) != null) {
                    try {
                        O0(l15, readInt31, 19, Q0(new i2.s(b2.s0.b(l15.f18288c, bundle7))));
                        break;
                    } catch (RuntimeException e15) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e15);
                        break;
                    }
                }
                break;
            case 3034:
                m F022 = q.F0(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                if (F022 != null && (l16 = this.f18092b.l(F022.asBinder())) != null) {
                    O0(l16, readInt32, 3, Q0(new x0(1)));
                    return true;
                }
                break;
            case 3035:
                m F023 = q.F0(parcel.readStrongBinder());
                parcel.readInt();
                if (F023 != null) {
                    long clearCallingIdentity2 = Binder.clearCallingIdentity();
                    try {
                        f0 f0Var = (f0) this.f18091a.get();
                        if (f0Var != null && !f0Var.j()) {
                            e2.n0.W(f0Var.f18049l, new k2.e0(14, this, F023));
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3036:
                m F024 = q.F0(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                if (F024 != null) {
                    N0(F024, readInt33, 4, Q0(new x0(3)));
                    return true;
                }
                break;
            case 3037:
                m F025 = q.F0(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                int readInt35 = parcel.readInt();
                if (F025 != null && readInt35 >= 0) {
                    N0(F025, readInt34, 10, new jg.e1(new r0(this, readInt35, 0), 19));
                    return true;
                }
                break;
            case 3038:
                m F026 = q.F0(parcel.readStrongBinder());
                int readInt36 = parcel.readInt();
                long readLong = parcel.readLong();
                if (F026 != null) {
                    N0(F026, readInt36, 5, Q0(new k2.g0(readLong)));
                    return true;
                }
                break;
            case 3039:
                m F027 = q.F0(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                int readInt38 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (F027 != null && readInt38 >= 0) {
                    N0(F027, readInt37, 10, new jg.e1(new j2.c(this, readInt38, readLong2, 1), 19));
                    return true;
                }
                break;
            case 3040:
                m F028 = q.F0(parcel.readStrongBinder());
                int readInt39 = parcel.readInt();
                if (F028 != null && (l17 = this.f18092b.l(F028.asBinder())) != null) {
                    O0(l17, readInt39, 11, Q0(new jh.l(20)));
                    return true;
                }
                break;
            case 3041:
                m F029 = q.F0(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                if (F029 != null && (l18 = this.f18092b.l(F029.asBinder())) != null) {
                    O0(l18, readInt40, 12, Q0(new jh.l(24)));
                    return true;
                }
                break;
            case 3042:
                m F030 = q.F0(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (F030 != null) {
                    N0(F030, readInt41, 6, Q0(new jh.l(22)));
                    return true;
                }
                break;
            case 3043:
                m F031 = q.F0(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (F031 != null) {
                    N0(F031, readInt42, 8, Q0(new jh.l(17)));
                    return true;
                }
                break;
            case 3044:
                m F032 = q.F0(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                Surface surface = (Surface) he.a(parcel, Surface.CREATOR);
                if (F032 != null) {
                    N0(F032, readInt43, 27, Q0(new s0(2, this, surface)));
                    return true;
                }
                break;
            case 3045:
                m F033 = q.F0(parcel.readStrongBinder());
                if (F033 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        f0 f0Var2 = (f0) this.f18091a.get();
                        if (f0Var2 != null && !f0Var2.j()) {
                            w l24 = this.f18092b.l(F033.asBinder());
                            if (l24 != null) {
                                e2.n0.W(f0Var2.f18049l, new k2.e0(15, this, l24));
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
                if (F034 != null && (l19 = this.f18092b.l(F034.asBinder())) != null) {
                    O0(l19, readInt44, 7, Q0(new jh.l(21)));
                    return true;
                }
                break;
            case 3047:
                m F035 = q.F0(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                if (F035 != null && (l20 = this.f18092b.l(F035.asBinder())) != null) {
                    O0(l20, readInt45, 9, Q0(new jh.l(25)));
                    return true;
                }
                break;
            case 3048:
                m F036 = q.F0(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                Bundle bundle8 = (Bundle) he.a(parcel, Bundle.CREATOR);
                if (F036 != null && bundle8 != null) {
                    try {
                        N0(F036, readInt46, 29, Q0(new s0(0, this, b2.u1.b(bundle8))));
                        break;
                    } catch (RuntimeException e16) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e16);
                        break;
                    }
                }
                break;
            case 3049:
                m F037 = q.F0(parcel.readStrongBinder());
                int readInt47 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle9 = (Bundle) he.a(parcel, Bundle.CREATOR);
                if (F037 != null && readString != null && bundle9 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        e2.a.l("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                        break;
                    } else {
                        try {
                            H0(F037, readInt47, null, 40010, new a1(new jh.l(readString, b2.h1.a(bundle9)), 1));
                            break;
                        } catch (RuntimeException e17) {
                            e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e17);
                            break;
                        }
                    }
                }
                break;
            case 3050:
                m F038 = q.F0(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                Bundle bundle10 = (Bundle) he.a(parcel, Bundle.CREATOR);
                if (F038 != null && bundle10 != null) {
                    try {
                        H0(F038, readInt48, null, 40010, new a1(new x0(b2.h1.a(bundle10), 10), 1));
                        break;
                    } catch (RuntimeException e18) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e18);
                        break;
                    }
                }
                break;
            case 3051:
                m F039 = q.F0(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                int readInt50 = parcel.readInt();
                int readInt51 = parcel.readInt();
                if (F039 != null && readInt50 >= 0) {
                    N0(F039, readInt49, 33, Q0(new fh.c(readInt50, readInt51, 4)));
                    return true;
                }
                break;
            case 3052:
                m F040 = q.F0(parcel.readStrongBinder());
                int readInt52 = parcel.readInt();
                int readInt53 = parcel.readInt();
                if (F040 != null) {
                    N0(F040, readInt52, 34, Q0(new i2.w(readInt53, 4)));
                    return true;
                }
                break;
            case 3053:
                m F041 = q.F0(parcel.readStrongBinder());
                int readInt54 = parcel.readInt();
                int readInt55 = parcel.readInt();
                if (F041 != null) {
                    N0(F041, readInt54, 34, Q0(new i2.w(readInt55, 3)));
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
                Bundle bundle11 = (Bundle) he.a(parcel, Bundle.CREATOR);
                if (F043 != null && bundle11 != null && readInt59 >= 0 && (l21 = this.f18092b.l(F043.asBinder())) != null) {
                    try {
                        final b2.p0 a19 = b2.p0.a(l21.f18288c, bundle11);
                        O0(l21, readInt58, 20, new a1(new s0(4, new h1() {
                            @Override
                            public final Object c(f0 f0Var3, w wVar, int i122) {
                                switch (r2) {
                                    case 0:
                                        return f0Var3.l(wVar, f9.i0.y(a19));
                                    case 1:
                                        return f0Var3.l(wVar, f9.i0.y(a19));
                                    default:
                                        return f0Var3.l(wVar, f9.i0.y(a19));
                                }
                            }
                        }, new r0(this, readInt59, 2)), 1));
                        break;
                    } catch (RuntimeException e19) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e19);
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
                if (F044 != null && readStrongBinder3 != null && readInt61 >= 0 && readInt62 >= readInt61 && (l22 = this.f18092b.l(F044.asBinder())) != null) {
                    try {
                        f9.i0 a20 = b2.i.a(readStrongBinder3);
                        f9.f0 t12 = f9.i0.t();
                        for (int i14 = 0; i14 < a20.size(); i14++) {
                            Bundle bundle12 = (Bundle) a20.get(i14);
                            bundle12.getClass();
                            t12.c(b2.p0.a(l22.f18288c, bundle12));
                        }
                        O0(l22, readInt60, 20, new a1(new s0(4, new jg.e1(t12.f(), 17), new q0(this, readInt61, readInt62)), 1));
                        break;
                    } catch (RuntimeException e20) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e20);
                        break;
                    }
                }
                break;
            case 3057:
                m F045 = q.F0(parcel.readStrongBinder());
                int readInt63 = parcel.readInt();
                Bundle bundle13 = (Bundle) he.a(parcel, Bundle.CREATOR);
                boolean z13 = parcel.readInt() != 0;
                if (F045 != null && bundle13 != null) {
                    try {
                        N0(F045, readInt63, 35, Q0(new di.f(3, b2.f.a(bundle13), z13)));
                        break;
                    } catch (RuntimeException e21) {
                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e21);
                        break;
                    }
                }
                break;
            case 3058:
                m F046 = q.F0(parcel.readStrongBinder());
                int readInt64 = parcel.readInt();
                if (F046 != null) {
                    N0(F046, readInt64, 24, Q0(new jh.l(15)));
                    return true;
                }
                break;
            case 3059:
                m F047 = q.F0(parcel.readStrongBinder());
                int readInt65 = parcel.readInt();
                if (F047 != null) {
                    N0(F047, readInt65, 24, Q0(new x0(2)));
                    return true;
                }
                break;
            case 3060:
                m F048 = q.F0(parcel.readStrongBinder());
                int readInt66 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                L0(F048, readInt66, (Bundle) he.a(parcel, creator2), (Bundle) he.a(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                m F049 = q.F0(parcel.readStrongBinder());
                int readInt67 = parcel.readInt();
                Surface surface2 = (Surface) he.a(parcel, Surface.CREATOR);
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
                    N0(F050, readInt70, 27, Q0(new q0(this, readInt71, readInt72)));
                    return true;
                }
                break;
            default:
                switch (i10) {
                    case 4001:
                        m F051 = q.F0(parcel.readStrongBinder());
                        int readInt73 = parcel.readInt();
                        Bundle bundle14 = (Bundle) he.a(parcel, Bundle.CREATOR);
                        if (F051 != null) {
                            if (bundle14 != null) {
                                try {
                                    a13 = r.a(bundle14);
                                } catch (RuntimeException e22) {
                                    e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e22);
                                    break;
                                }
                            }
                            H0(F051, readInt73, null, 50000, new a1(new x0(a13, 4), 0));
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
                            H0(F052, readInt74, null, 50004, new a1(new jh.l(readString2, 23), 0));
                            return true;
                        }
                        break;
                    case 4003:
                        m F053 = q.F0(parcel.readStrongBinder());
                        int readInt75 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt76 = parcel.readInt();
                        int readInt77 = parcel.readInt();
                        Bundle bundle15 = (Bundle) he.a(parcel, Bundle.CREATOR);
                        if (F053 != null) {
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
                                    } catch (RuntimeException e23) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e23);
                                        break;
                                    }
                                }
                                H0(F053, readInt75, null, 50003, new a1(new jh.l(readString3, readInt76, readInt77, a12), 0));
                                break;
                            }
                        }
                        break;
                    case 4004:
                        m F054 = q.F0(parcel.readStrongBinder());
                        int readInt78 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle16 = (Bundle) he.a(parcel, Bundle.CREATOR);
                        if (F054 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                e2.a.l("MediaSessionStub", "search(): Ignoring empty query");
                                break;
                            } else {
                                if (bundle16 != null) {
                                    try {
                                        a11 = r.a(bundle16);
                                    } catch (RuntimeException e24) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e24);
                                        break;
                                    }
                                }
                                H0(F054, readInt78, null, 50005, new a1(new x0(readString4, a11, 8), 0));
                                break;
                            }
                        }
                        break;
                    case 4005:
                        m F055 = q.F0(parcel.readStrongBinder());
                        int readInt79 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt80 = parcel.readInt();
                        int readInt81 = parcel.readInt();
                        Bundle bundle17 = (Bundle) he.a(parcel, Bundle.CREATOR);
                        if (F055 != null) {
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
                                    } catch (RuntimeException e25) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e25);
                                        break;
                                    }
                                }
                                H0(F055, readInt79, null, 50006, new a1(new x0(readString5, readInt80, readInt81, a10), 0));
                                break;
                            }
                        }
                        break;
                    case 4006:
                        m F056 = q.F0(parcel.readStrongBinder());
                        int readInt82 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle18 = (Bundle) he.a(parcel, Bundle.CREATOR);
                        if (F056 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                e2.a.l("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                                break;
                            } else {
                                if (bundle18 != null) {
                                    try {
                                        a2 = r.a(bundle18);
                                    } catch (RuntimeException e26) {
                                        e2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e26);
                                        break;
                                    }
                                }
                                H0(F056, readInt82, null, 50001, new a1(new x0(readString6, a2, 6), 0));
                                break;
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
                            H0(F057, readInt83, null, 50002, new a1(new jh.l(readString7, 13), 0));
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
