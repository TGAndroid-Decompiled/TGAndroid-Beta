package m4;

import ai.i5;
import ai.z1;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import b2.p1;
import b2.q1;
import b2.r1;
import b2.s1;
import e9.o1;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
public final class b1 extends Binder implements j {
    public final WeakReference f16003a;
    public final oi.f f16004b;
    public final Set f16005c;
    public e9.z0 d;
    public int f16006e;

    public b1(b0 b0Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.f16003a = new WeakReference(b0Var);
        this.f16004b = new oi.f(b0Var);
        this.f16005c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = e9.z0.f8823r;
    }

    public static i9.w H0(b0 b0Var, r rVar, int i10, a1 a1Var, e2.h hVar) {
        if (b0Var.j()) {
            return i9.u.f12080b;
        }
        i9.w wVar = (i9.w) a1Var.h(b0Var, rVar, i10);
        ?? obj = new Object();
        wVar.a(new i5(b0Var, obj, hVar, wVar, 24), i9.q.f12075a);
        return obj;
    }

    public static void N0(b0 b0Var, r rVar, int i10, l1 l1Var) {
        try {
            q qVar = rVar.d;
            e2.d.h(qVar);
            qVar.i(i10, l1Var);
            b0Var.f15982c.a(true, true);
        } catch (RemoteException e7) {
            e2.a.o("MediaSessionStub", "Failed to send result to controller " + rVar, e7);
        }
    }

    public static w O0(e2.h hVar) {
        return new w(new w(hVar, 5), 4);
    }

    public final void F0(i iVar, int i10, h1 h1Var, int i11, a1 a1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            b0 b0Var = (b0) this.f16003a.get();
            if (b0Var != null && !b0Var.j()) {
                r t10 = this.f16004b.t(iVar.asBinder());
                if (t10 == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return;
                }
                e2.d0.T(b0Var.f15989l, new t0(this, t10, h1Var, b0Var, i10, i11, a1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final d1 G0(d1 d1Var) {
        e9.i0 i0Var = d1Var.D.f3655a;
        e9.f0 u10 = e9.i0.u();
        ?? aVar = new a5.a(4, 5);
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            r1 r1Var = (r1) i0Var.get(i10);
            b2.l1 l1Var = r1Var.f3600b;
            String str = (String) this.d.get(l1Var);
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                int i11 = this.f16006e;
                this.f16006e = i11 + 1;
                String str2 = e2.d0.f8532a;
                sb2.append(Integer.toString(i11, 36));
                sb2.append("-");
                sb2.append(l1Var.f3416b);
                str = sb2.toString();
            }
            aVar.H(l1Var, str);
            u10.b(new r1(new b2.l1(str, r1Var.f3600b.d), r1Var.f3601c, r1Var.d, r1Var.f3602e));
        }
        this.d = aVar.f();
        d1 a2 = d1Var.a(new s1(u10.i()));
        q1 q1Var = a2.E;
        if (q1Var.D.isEmpty()) {
            return a2;
        }
        p1 c10 = q1Var.a().c();
        o1 it = q1Var.D.values().iterator();
        while (it.hasNext()) {
            b2.m1 m1Var = (b2.m1) it.next();
            b2.l1 l1Var2 = m1Var.f3444a;
            String str3 = (String) this.d.get(l1Var2);
            if (str3 != null) {
                c10.a(new b2.m1(new b2.l1(str3, l1Var2.d), m1Var.f3445b));
            } else {
                c10.a(m1Var);
            }
        }
        return a2.d(c10.b());
    }

    public final void I0(i iVar, int i10) {
        if (iVar == null) {
            return;
        }
        L0(iVar, i10, 26, O0(new j2.e(24)));
    }

    public final int J0(r rVar, f1 f1Var, int i10) {
        if (f1Var.m0(17)) {
            oi.f fVar = this.f16004b;
            if (!fVar.B(rVar, 17) && fVar.B(rVar, 16)) {
                return f1Var.l0() + i10;
            }
        }
        return i10;
    }

    public final void K0(i iVar, int i10, Bundle bundle) {
        com.google.android.gms.common.api.internal.v vVar;
        e eVar;
        if (iVar != null && bundle != null) {
            try {
                l1 a2 = l1.a(bundle);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    oi.f fVar = this.f16004b;
                    IBinder asBinder = iVar.asBinder();
                    synchronized (fVar.f17175a) {
                        r t10 = fVar.t(asBinder);
                        vVar = null;
                        if (t10 != null) {
                            eVar = (e) ((a0.f) fVar.f17177c).get(t10);
                        } else {
                            eVar = null;
                        }
                    }
                    if (eVar != null) {
                        vVar = eVar.f16051b;
                    }
                    if (vVar == null) {
                        return;
                    }
                    vVar.i(i10, a2);
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } catch (RuntimeException e7) {
                e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e7);
            }
        }
    }

    public final void L0(i iVar, int i10, int i11, a1 a1Var) {
        r t10 = this.f16004b.t(iVar.asBinder());
        if (t10 != null) {
            M0(t10, i10, i11, a1Var);
        }
    }

    public final void M0(r rVar, int i10, int i11, a1 a1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            b0 b0Var = (b0) this.f16003a.get();
            if (b0Var != null && !b0Var.j()) {
                e2.d0.T(b0Var.f15989l, new ii.i0(this, rVar, i11, b0Var, i10, a1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void P0(i iVar, int i10, int i11) {
        if (iVar != null && i11 >= 0) {
            L0(iVar, i10, 25, O0(new i2.w(i11, 6)));
        }
    }

    public final void Q0(i iVar, int i10, Bundle bundle, boolean z10) {
        if (iVar != null && bundle != null) {
            try {
                L0(iVar, i10, 31, new u0(new ah.b(28, new ai.k(2, b2.k0.a(bundle), z10), new q0(14)), 1));
            } catch (RuntimeException e7) {
                e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
            }
        }
    }

    public final void R0(i iVar, int i10, Bundle bundle, long j3) {
        if (iVar != null && bundle != null) {
            try {
                L0(iVar, i10, 31, new u0(new ah.b(28, new z1(b2.k0.a(bundle), j3, 2), new q0(14)), 1));
            } catch (RuntimeException e7) {
                e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
            }
        }
    }

    public final void S0(i iVar, int i10, IBinder iBinder, boolean z10) {
        if (iVar != null && iBinder != null) {
            try {
                e9.i0 a2 = b2.h.a(iBinder);
                e9.f0 u10 = e9.i0.u();
                for (int i11 = 0; i11 < a2.size(); i11++) {
                    Bundle bundle = (Bundle) a2.get(i11);
                    bundle.getClass();
                    u10.b(b2.k0.a(bundle));
                }
                L0(iVar, i10, 20, new u0(new ah.b(28, new ai.k(4, u10.i(), z10), new q0(14)), 1));
            } catch (RuntimeException e7) {
                e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
            }
        }
    }

    public final void T0(i iVar, int i10, IBinder iBinder, int i11, long j3) {
        if (iVar != null && iBinder != null) {
            if (i11 == -1 || i11 >= 0) {
                try {
                    e9.i0 a2 = b2.h.a(iBinder);
                    e9.f0 u10 = e9.i0.u();
                    for (int i12 = 0; i12 < a2.size(); i12++) {
                        Bundle bundle = (Bundle) a2.get(i12);
                        bundle.getClass();
                        u10.b(b2.k0.a(bundle));
                    }
                    L0(iVar, i10, 20, new u0(new ah.b(28, new j2.d(u10.i(), i11, j3, 2), new q0(14)), 1));
                } catch (RuntimeException e7) {
                    e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
                }
            }
        }
    }

    public final void U0(i iVar, int i10, float f7) {
        if (iVar != null && f7 >= 0.0f && f7 <= 1.0f) {
            L0(iVar, i10, 24, O0(new i2.v(f7, 2)));
        }
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z10;
        h1 h1Var;
        b1 b1Var;
        r t10;
        r t11;
        r t12;
        r t13;
        r t14;
        r t15;
        r t16;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        boolean z11 = false;
        boolean z12 = false;
        final boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        switch (i10) {
            case 3002:
                U0(m.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                P0(m.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                I0(m.F0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                i F0 = m.F0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                if (F0 != null) {
                    L0(F0, readInt, 26, O0(new q0(4)));
                    return true;
                }
                break;
            case 3006:
                i F02 = m.F0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                if (F02 != null) {
                    L0(F02, readInt2, 26, O0(new i2.y(3, z11)));
                    return true;
                }
                break;
            case 3007:
                Q0(m.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.r.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                R0(m.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.r.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                i F03 = m.F0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                Bundle bundle = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z17 = true;
                }
                Q0(F03, readInt3, bundle, z17);
                return true;
            case 3010:
                S0(m.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                i F04 = m.F0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (parcel.readInt() != 0) {
                    z16 = true;
                }
                S0(F04, readInt4, readStrongBinder, z16);
                return true;
            case 3012:
                T0(m.F0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                i F05 = m.F0(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z15 = true;
                }
                if (F05 != null) {
                    L0(F05, readInt5, 1, O0(new i2.y(2, z15)));
                    return true;
                }
                break;
            case 3014:
                K0(m.F0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.r.a(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                i F06 = m.F0(parcel.readStrongBinder());
                parcel.readInt();
                Bundle bundle2 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                WeakReference weakReference = this.f16003a;
                if (F06 != null && bundle2 != null) {
                    try {
                        f a2 = f.a(bundle2);
                        int callingUid = Binder.getCallingUid();
                        int callingPid = Binder.getCallingPid();
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        if (callingPid == 0) {
                            callingPid = a2.d;
                        }
                        try {
                            n4.z zVar = new n4.z(a2.f16072c, callingPid, callingUid);
                            b0 b0Var = (b0) weakReference.get();
                            if (b0Var != null && n4.c0.a(b0Var.f15984f).b(zVar)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int i12 = a2.f16070a;
                            int i13 = a2.f16071b;
                            r rVar = new r(zVar, i12, i13, z10, new x0(F06, i13), a2.f16073e);
                            b0 b0Var2 = (b0) weakReference.get();
                            if (b0Var2 != null && !b0Var2.j()) {
                                this.f16005c.add(rVar);
                                try {
                                    try {
                                        e2.d0.T(b0Var2.f15989l, new i5(this, rVar, b0Var2, F06, 23));
                                        break;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            w7.t.a(F06);
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (RuntimeException e7) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e7);
                        break;
                    }
                }
                break;
            case 3016:
                i F07 = m.F0(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) w7.r.a(parcel, creator);
                Bundle bundle4 = (Bundle) w7.r.a(parcel, creator);
                if (F07 != null && bundle3 != null && bundle4 != null) {
                    try {
                        int i14 = bundle3.getInt(h1.f16111f, 0);
                        if (i14 != 0) {
                            h1Var = new h1(i14);
                        } else {
                            String string = bundle3.getString(h1.f16112g);
                            string.getClass();
                            Bundle bundle5 = bundle3.getBundle(h1.h);
                            if (bundle5 == null) {
                                bundle5 = Bundle.EMPTY;
                            }
                            h1Var = new h1(string, bundle5);
                        }
                        b1Var = this;
                        b1Var.F0(F07, readInt6, h1Var, 0, new u0(new j2.e(26, h1Var, bundle4), 1));
                        break;
                    } catch (RuntimeException e10) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e10);
                        break;
                    }
                }
                break;
            case 3017:
                i F08 = m.F0(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                if (F08 != null && (readInt8 == 2 || readInt8 == 0 || readInt8 == 1)) {
                    L0(F08, readInt7, 15, O0(new i2.w(readInt8, 5)));
                    return true;
                }
                break;
            case 3018:
                i F09 = m.F0(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                if (F09 != null) {
                    L0(F09, readInt9, 14, O0(new i2.y(4, z14)));
                    return true;
                }
                break;
            case 3019:
                i F010 = m.F0(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                if (F010 != null && readInt11 >= 0) {
                    L0(F010, readInt10, 20, new w(new n0(this, readInt11, 4), 4));
                    return true;
                }
                break;
            case 3020:
                i F011 = m.F0(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                if (F011 != null && readInt13 >= 0 && readInt14 >= readInt13) {
                    L0(F011, readInt12, 20, new w(new m0(this, readInt13, readInt14), 4));
                    return true;
                }
                break;
            case 3021:
                i F012 = m.F0(parcel.readStrongBinder());
                int readInt15 = parcel.readInt();
                if (F012 != null) {
                    L0(F012, readInt15, 20, O0(new q0(12)));
                    return true;
                }
                break;
            case 3022:
                i F013 = m.F0(parcel.readStrongBinder());
                int readInt16 = parcel.readInt();
                int readInt17 = parcel.readInt();
                int readInt18 = parcel.readInt();
                if (F013 != null && readInt17 >= 0 && readInt18 >= 0) {
                    L0(F013, readInt16, 20, O0(new dh.c(readInt17, readInt18, 4)));
                    return true;
                }
                break;
            case 3023:
                i F014 = m.F0(parcel.readStrongBinder());
                int readInt19 = parcel.readInt();
                final int readInt20 = parcel.readInt();
                final int readInt21 = parcel.readInt();
                final int readInt22 = parcel.readInt();
                if (F014 != null && readInt20 >= 0 && readInt21 >= readInt20 && readInt22 >= 0) {
                    L0(F014, readInt19, 20, O0(new e2.h() {
                        @Override
                        public final void accept(Object obj) {
                            ((f1) obj).r0(readInt20, readInt21, readInt22);
                        }
                    }));
                    return true;
                }
                break;
            case 3024:
                i F015 = m.F0(parcel.readStrongBinder());
                int readInt23 = parcel.readInt();
                if (F015 != null && (t10 = this.f16004b.t(F015.asBinder())) != null) {
                    M0(t10, readInt23, 1, O0(new ah.b(27, this, t10)));
                    return true;
                }
                break;
            case 3025:
                i F016 = m.F0(parcel.readStrongBinder());
                int readInt24 = parcel.readInt();
                if (F016 != null && (t11 = this.f16004b.t(F016.asBinder())) != null) {
                    M0(t11, readInt24, 1, O0(new j2.e(22)));
                    return true;
                }
                break;
            case 3026:
                i F017 = m.F0(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                if (F017 != null) {
                    L0(F017, readInt25, 2, O0(new q0(9)));
                    return true;
                }
                break;
            case 3027:
                i F018 = m.F0(parcel.readStrongBinder());
                int readInt26 = parcel.readInt();
                Bundle bundle6 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F018 != null && bundle6 != null) {
                    try {
                        L0(F018, readInt26, 13, O0(new w(new b2.v0(bundle6.getFloat(b2.v0.f3671e, 1.0f), bundle6.getFloat(b2.v0.f3672f, 1.0f)), 2)));
                        break;
                    } catch (RuntimeException e11) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e11);
                        break;
                    }
                }
                break;
            case 3028:
                i F019 = m.F0(parcel.readStrongBinder());
                int readInt27 = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (F019 != null && readFloat > 0.0f) {
                    L0(F019, readInt27, 13, O0(new i2.v(readFloat, 1)));
                    return true;
                }
                break;
            case 3029:
                i F020 = m.F0(parcel.readStrongBinder());
                int readInt28 = parcel.readInt();
                Bundle bundle7 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F020 != null && bundle7 != null) {
                    try {
                        final b2.k0 a10 = b2.k0.a(bundle7);
                        L0(F020, readInt28, 20, new u0(new ah.b(29, new a1() {
                            @Override
                            public final Object h(b0 b0Var3, r rVar2, int i15) {
                                switch (r2) {
                                    case 0:
                                        return b0Var3.l(rVar2, e9.i0.z(a10));
                                    case 1:
                                        return b0Var3.l(rVar2, e9.i0.z(a10));
                                    default:
                                        return b0Var3.l(rVar2, e9.i0.z(a10));
                                }
                            }
                        }, new q0(5)), 1));
                        break;
                    } catch (RuntimeException e12) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e12);
                        break;
                    }
                }
                break;
            case 3030:
                i F021 = m.F0(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                int readInt30 = parcel.readInt();
                Bundle bundle8 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F021 != null && bundle8 != null && readInt30 >= 0) {
                    try {
                        final b2.k0 a11 = b2.k0.a(bundle8);
                        L0(F021, readInt29, 20, new u0(new ah.b(29, new a1() {
                            @Override
                            public final Object h(b0 b0Var3, r rVar2, int i15) {
                                switch (r2) {
                                    case 0:
                                        return b0Var3.l(rVar2, e9.i0.z(a11));
                                    case 1:
                                        return b0Var3.l(rVar2, e9.i0.z(a11));
                                    default:
                                        return b0Var3.l(rVar2, e9.i0.z(a11));
                                }
                            }
                        }, new n0(this, readInt30, 1)), 1));
                        break;
                    } catch (RuntimeException e13) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e13);
                        break;
                    }
                }
                break;
            case 3031:
                i F022 = m.F0(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (F022 != null && readStrongBinder2 != null) {
                    try {
                        e9.i0 a12 = b2.h.a(readStrongBinder2);
                        e9.f0 u10 = e9.i0.u();
                        for (int i15 = 0; i15 < a12.size(); i15++) {
                            Bundle bundle9 = (Bundle) a12.get(i15);
                            bundle9.getClass();
                            u10.b(b2.k0.a(bundle9));
                        }
                        L0(F022, readInt31, 20, new u0(new ah.b(29, new i2.z(3, u10.i()), new q0(3)), 1));
                        break;
                    } catch (RuntimeException e14) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e14);
                        break;
                    }
                }
                break;
            case 3032:
                i F023 = m.F0(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                int readInt33 = parcel.readInt();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (F023 != null && readStrongBinder3 != null && readInt33 >= 0) {
                    try {
                        e9.i0 a13 = b2.h.a(readStrongBinder3);
                        e9.f0 u11 = e9.i0.u();
                        for (int i16 = 0; i16 < a13.size(); i16++) {
                            Bundle bundle10 = (Bundle) a13.get(i16);
                            bundle10.getClass();
                            u11.b(b2.k0.a(bundle10));
                        }
                        L0(F023, readInt32, 20, new u0(new ah.b(29, new i2.z(2, u11.i()), new n0(this, readInt33, 3)), 1));
                        break;
                    } catch (RuntimeException e15) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e15);
                        break;
                    }
                }
                break;
            case 3033:
                i F024 = m.F0(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                Bundle bundle11 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F024 != null && bundle11 != null) {
                    try {
                        L0(F024, readInt34, 19, O0(new i2.t(b2.n0.b(bundle11))));
                        break;
                    } catch (RuntimeException e16) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e16);
                        break;
                    }
                }
                break;
            case 3034:
                i F025 = m.F0(parcel.readStrongBinder());
                int readInt35 = parcel.readInt();
                if (F025 != null && (t12 = this.f16004b.t(F025.asBinder())) != null) {
                    M0(t12, readInt35, 3, O0(new q0(7)));
                    return true;
                }
                break;
            case 3035:
                i F026 = m.F0(parcel.readStrongBinder());
                parcel.readInt();
                if (F026 != null) {
                    long clearCallingIdentity2 = Binder.clearCallingIdentity();
                    try {
                        b0 b0Var3 = (b0) this.f16003a.get();
                        if (b0Var3 != null && !b0Var3.j()) {
                            e2.d0.T(b0Var3.f15989l, new ki.i0(6, this, F026));
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3036:
                i F027 = m.F0(parcel.readStrongBinder());
                int readInt36 = parcel.readInt();
                if (F027 != null) {
                    L0(F027, readInt36, 4, O0(new q0(10)));
                    return true;
                }
                break;
            case 3037:
                i F028 = m.F0(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                int readInt38 = parcel.readInt();
                if (F028 != null && readInt38 >= 0) {
                    L0(F028, readInt37, 10, new w(new n0(this, readInt38, 0), 4));
                    return true;
                }
                break;
            case 3038:
                i F029 = m.F0(parcel.readStrongBinder());
                int readInt39 = parcel.readInt();
                final long readLong = parcel.readLong();
                if (F029 != null) {
                    L0(F029, readInt39, 5, O0(new e2.h() {
                        @Override
                        public final void accept(Object obj) {
                            ((f1) obj).g(readLong);
                        }
                    }));
                    return true;
                }
                break;
            case 3039:
                i F030 = m.F0(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                int readInt41 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (F030 != null && readInt41 >= 0) {
                    L0(F030, readInt40, 10, new w(new j2.d(this, readInt41, readLong2, 1), 4));
                    return true;
                }
                break;
            case 3040:
                i F031 = m.F0(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (F031 != null && (t13 = this.f16004b.t(F031.asBinder())) != null) {
                    M0(t13, readInt42, 11, O0(new j2.e(25)));
                    return true;
                }
                break;
            case 3041:
                i F032 = m.F0(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                if (F032 != null && (t14 = this.f16004b.t(F032.asBinder())) != null) {
                    M0(t14, readInt43, 12, O0(new q0(0)));
                    return true;
                }
                break;
            case 3042:
                i F033 = m.F0(parcel.readStrongBinder());
                int readInt44 = parcel.readInt();
                if (F033 != null) {
                    L0(F033, readInt44, 6, O0(new j2.e(28)));
                    return true;
                }
                break;
            case 3043:
                i F034 = m.F0(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                if (F034 != null) {
                    L0(F034, readInt45, 8, O0(new j2.e(23)));
                    return true;
                }
                break;
            case 3044:
                i F035 = m.F0(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                Surface surface = (Surface) w7.r.a(parcel, Surface.CREATOR);
                if (F035 != null) {
                    L0(F035, readInt46, 27, O0(new w(surface, 3)));
                    return true;
                }
                break;
            case 3045:
                i F036 = m.F0(parcel.readStrongBinder());
                if (F036 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        b0 b0Var4 = (b0) this.f16003a.get();
                        if (b0Var4 != null && !b0Var4.j()) {
                            r t17 = this.f16004b.t(F036.asBinder());
                            if (t17 != null) {
                                e2.d0.T(b0Var4.f15989l, new ki.i0(7, this, t17));
                            }
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3046:
                i F037 = m.F0(parcel.readStrongBinder());
                int readInt47 = parcel.readInt();
                if (F037 != null && (t15 = this.f16004b.t(F037.asBinder())) != null) {
                    M0(t15, readInt47, 7, O0(new j2.e(27)));
                    return true;
                }
                break;
            case 3047:
                i F038 = m.F0(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                if (F038 != null && (t16 = this.f16004b.t(F038.asBinder())) != null) {
                    M0(t16, readInt48, 9, O0(new q0(1)));
                    return true;
                }
                break;
            case 3048:
                i F039 = m.F0(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                Bundle bundle12 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F039 != null && bundle12 != null) {
                    try {
                        L0(F039, readInt49, 29, O0(new ah.b(26, this, q1.b(bundle12))));
                        break;
                    } catch (RuntimeException e17) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e17);
                        break;
                    }
                }
                break;
            case 3049:
                i F040 = m.F0(parcel.readStrongBinder());
                int readInt50 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle13 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F040 != null && readString != null && bundle13 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        e2.a.n("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            b1Var = this;
                            b1Var.F0(F040, readInt50, null, 40010, new u0(new q0(readString, 2, b2.c1.a(bundle13)), 1));
                            break;
                        } catch (RuntimeException e18) {
                            e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for Rating", e18);
                            break;
                        }
                    }
                }
                break;
            case 3050:
                i F041 = m.F0(parcel.readStrongBinder());
                int readInt51 = parcel.readInt();
                Bundle bundle14 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F041 != null && bundle14 != null) {
                    try {
                        F0(F041, readInt51, null, 40010, new u0(new q0(b2.c1.a(bundle14), 15), 1));
                    } catch (RuntimeException e19) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for Rating", e19);
                    }
                }
                break;
            case 3051:
                i F042 = m.F0(parcel.readStrongBinder());
                int readInt52 = parcel.readInt();
                int readInt53 = parcel.readInt();
                int readInt54 = parcel.readInt();
                if (F042 != null && readInt53 >= 0) {
                    L0(F042, readInt52, 33, O0(new dh.c(readInt53, readInt54, 3)));
                    return true;
                }
                break;
            case 3052:
                i F043 = m.F0(parcel.readStrongBinder());
                int readInt55 = parcel.readInt();
                int readInt56 = parcel.readInt();
                if (F043 != null) {
                    L0(F043, readInt55, 34, O0(new i2.w(readInt56, 4)));
                    return true;
                }
                break;
            case 3053:
                i F044 = m.F0(parcel.readStrongBinder());
                int readInt57 = parcel.readInt();
                int readInt58 = parcel.readInt();
                if (F044 != null) {
                    L0(F044, readInt57, 34, O0(new i2.w(readInt58, 3)));
                    return true;
                }
                break;
            case 3054:
                i F045 = m.F0(parcel.readStrongBinder());
                int readInt59 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z13 = true;
                }
                final int readInt60 = parcel.readInt();
                if (F045 != null) {
                    L0(F045, readInt59, 34, O0(new e2.h() {
                        @Override
                        public final void accept(Object obj) {
                            ((f1) obj).J(readInt60, z13);
                        }
                    }));
                    return true;
                }
                break;
            case 3055:
                i F046 = m.F0(parcel.readStrongBinder());
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                Bundle bundle15 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (F046 != null && bundle15 != null && readInt62 >= 0) {
                    try {
                        final b2.k0 a14 = b2.k0.a(bundle15);
                        L0(F046, readInt61, 20, new u0(new ah.b(29, new a1() {
                            @Override
                            public final Object h(b0 b0Var32, r rVar2, int i152) {
                                switch (r2) {
                                    case 0:
                                        return b0Var32.l(rVar2, e9.i0.z(a14));
                                    case 1:
                                        return b0Var32.l(rVar2, e9.i0.z(a14));
                                    default:
                                        return b0Var32.l(rVar2, e9.i0.z(a14));
                                }
                            }
                        }, new n0(this, readInt62, 2)), 1));
                        break;
                    } catch (RuntimeException e20) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e20);
                        break;
                    }
                }
                break;
            case 3056:
                i F047 = m.F0(parcel.readStrongBinder());
                int readInt63 = parcel.readInt();
                int readInt64 = parcel.readInt();
                int readInt65 = parcel.readInt();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (F047 != null && readStrongBinder4 != null && readInt64 >= 0 && readInt65 >= readInt64) {
                    try {
                        e9.i0 a15 = b2.h.a(readStrongBinder4);
                        e9.f0 u12 = e9.i0.u();
                        for (int i17 = 0; i17 < a15.size(); i17++) {
                            Bundle bundle16 = (Bundle) a15.get(i17);
                            bundle16.getClass();
                            u12.b(b2.k0.a(bundle16));
                        }
                        L0(F047, readInt63, 20, new u0(new ah.b(29, new w(u12.i(), 1), new m0(this, readInt64, readInt65)), 1));
                        break;
                    } catch (RuntimeException e21) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e21);
                        break;
                    }
                }
                break;
            case 3057:
                i F048 = m.F0(parcel.readStrongBinder());
                int readInt66 = parcel.readInt();
                Bundle bundle17 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z12 = true;
                }
                if (F048 != null && bundle17 != null) {
                    try {
                        L0(F048, readInt66, 35, O0(new ai.k(3, b2.e.a(bundle17), z12)));
                        break;
                    } catch (RuntimeException e22) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e22);
                        break;
                    }
                }
                break;
            default:
                n nVar = null;
                switch (i10) {
                    case 4001:
                        i F049 = m.F0(parcel.readStrongBinder());
                        int readInt67 = parcel.readInt();
                        Bundle bundle18 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                        if (F049 != null) {
                            if (bundle18 != null) {
                                try {
                                    nVar = n.a(bundle18);
                                } catch (RuntimeException e23) {
                                    e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e23);
                                    break;
                                }
                            }
                            b1Var = this;
                            b1Var.F0(F049, readInt67, null, 50000, new u0(new q0(nVar, 8), 0));
                            break;
                        }
                        break;
                    case 4002:
                        i F050 = m.F0(parcel.readStrongBinder());
                        int readInt68 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (F050 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                e2.a.n("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            F0(F050, readInt68, null, 50004, new u0(new j2.e(readString2, 29), 0));
                            return true;
                        }
                        break;
                    case 4003:
                        i F051 = m.F0(parcel.readStrongBinder());
                        int readInt69 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt70 = parcel.readInt();
                        int readInt71 = parcel.readInt();
                        Bundle bundle19 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                        if (F051 != null) {
                            if (TextUtils.isEmpty(readString3)) {
                                e2.a.n("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (readInt70 < 0) {
                                e2.a.n("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (readInt71 < 1) {
                                e2.a.n("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle19 != null) {
                                    try {
                                        nVar = n.a(bundle19);
                                    } catch (RuntimeException e24) {
                                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e24);
                                    }
                                }
                                F0(F051, readInt69, null, 50003, new u0(new j2.e(readString3, readInt70, readInt71, nVar), 0));
                            }
                        }
                        break;
                    case 4004:
                        i F052 = m.F0(parcel.readStrongBinder());
                        int readInt72 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle20 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                        if (F052 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                e2.a.n("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle20 != null) {
                                    try {
                                        nVar = n.a(bundle20);
                                    } catch (RuntimeException e25) {
                                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e25);
                                    }
                                }
                                F0(F052, readInt72, null, 50005, new u0(new q0(readString4, 13, nVar), 0));
                            }
                        }
                        break;
                    case 4005:
                        i F053 = m.F0(parcel.readStrongBinder());
                        int readInt73 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt74 = parcel.readInt();
                        int readInt75 = parcel.readInt();
                        Bundle bundle21 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                        if (F053 != null) {
                            if (TextUtils.isEmpty(readString5)) {
                                e2.a.n("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (readInt74 < 0) {
                                e2.a.n("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (readInt75 < 1) {
                                e2.a.n("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle21 != null) {
                                    try {
                                        nVar = n.a(bundle21);
                                    } catch (RuntimeException e26) {
                                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e26);
                                    }
                                }
                                F0(F053, readInt73, null, 50006, new u0(new q0(readString5, readInt74, readInt75, nVar), 0));
                            }
                        }
                        break;
                    case 4006:
                        i F054 = m.F0(parcel.readStrongBinder());
                        int readInt76 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle22 = (Bundle) w7.r.a(parcel, Bundle.CREATOR);
                        if (F054 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                e2.a.n("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle22 != null) {
                                    try {
                                        nVar = n.a(bundle22);
                                    } catch (RuntimeException e27) {
                                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e27);
                                    }
                                }
                                F0(F054, readInt76, null, 50001, new u0(new q0(readString6, 11, nVar), 0));
                            }
                        }
                        break;
                    case 4007:
                        i F055 = m.F0(parcel.readStrongBinder());
                        int readInt77 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (F055 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                e2.a.n("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            F0(F055, readInt77, null, 50002, new u0(new j2.e(readString7, 20), 0));
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
