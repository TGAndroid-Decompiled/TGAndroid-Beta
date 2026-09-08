package m4;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import b2.s1;
import bi.t2;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import ji.b5;
import ji.k5;
public final class f1 extends Binder implements j {
    public final WeakReference f15917a;
    public final fg.f f15918b;
    public final Set f15919c;
    public e9.z0 d;
    public int f15920e;

    public f1(a0 a0Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.f15917a = new WeakReference(a0Var);
        this.f15918b = new fg.f(a0Var);
        this.f15919c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = e9.z0.f9056r;
    }

    public static i9.w I0(a0 a0Var, r rVar, int i10, e1 e1Var, e2.h hVar) {
        if (a0Var.j()) {
            return i9.u.f11951b;
        }
        i9.w wVar = (i9.w) e1Var.h(a0Var, rVar, i10);
        ?? obj = new Object();
        wVar.a(new androidx.car.app.utils.b(a0Var, obj, hVar, wVar, 24), i9.q.f11946a);
        return obj;
    }

    public static void O0(a0 a0Var, r rVar, int i10, p1 p1Var) {
        try {
            q qVar = rVar.d;
            e2.d.h(qVar);
            qVar.i(i10, p1Var);
            a0Var.f15855c.a(true, true);
        } catch (RemoteException e7) {
            e2.a.o("MediaSessionStub", "Failed to send result to controller " + rVar, e7);
        }
    }

    public static k5 P0(e2.h hVar) {
        return new k5(new k5(hVar, 6), 5);
    }

    public final void G0(i iVar, int i10, l1 l1Var, int i11, e1 e1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            a0 a0Var = (a0) this.f15917a.get();
            if (a0Var != null && !a0Var.j()) {
                r u10 = this.f15918b.u(iVar.asBinder());
                if (u10 == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return;
                }
                e2.d0.U(a0Var.f15862l, new w0(this, u10, l1Var, a0Var, i10, i11, e1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final h1 H0(h1 h1Var) {
        e9.i0 i0Var = h1Var.D.f2409a;
        e9.f0 u10 = e9.i0.u();
        ?? aVar = new a5.a(4, 5);
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            b2.r1 r1Var = (b2.r1) i0Var.get(i10);
            b2.l1 l1Var = r1Var.f2354b;
            String str = (String) this.d.get(l1Var);
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                int i11 = this.f15920e;
                this.f15920e = i11 + 1;
                String str2 = e2.d0.f8765a;
                sb2.append(Integer.toString(i11, 36));
                sb2.append("-");
                sb2.append(l1Var.f2170b);
                str = sb2.toString();
            }
            aVar.F(l1Var, str);
            u10.b(new b2.r1(new b2.l1(str, r1Var.f2354b.d), r1Var.f2355c, r1Var.d, r1Var.f2356e));
        }
        this.d = aVar.c();
        h1 a2 = h1Var.a(new s1(u10.i()));
        b2.q1 q1Var = a2.E;
        if (q1Var.D.isEmpty()) {
            return a2;
        }
        b2.p1 c10 = q1Var.a().c();
        e9.o1 it = q1Var.D.values().iterator();
        while (it.hasNext()) {
            b2.m1 m1Var = (b2.m1) it.next();
            b2.l1 l1Var2 = m1Var.f2198a;
            String str3 = (String) this.d.get(l1Var2);
            if (str3 != null) {
                c10.a(new b2.m1(new b2.l1(str3, l1Var2.d), m1Var.f2199b));
            } else {
                c10.a(m1Var);
            }
        }
        return a2.d(c10.b());
    }

    public final void J0(i iVar, int i10) {
        if (iVar == null) {
            return;
        }
        M0(iVar, i10, 26, P0(new bi.f(7)));
    }

    public final int K0(r rVar, j1 j1Var, int i10) {
        if (j1Var.m0(17)) {
            fg.f fVar = this.f15918b;
            if (!fVar.C(rVar, 17) && fVar.C(rVar, 16)) {
                return j1Var.l0() + i10;
            }
        }
        return i10;
    }

    public final void L0(i iVar, int i10, Bundle bundle) {
        com.google.android.gms.common.api.internal.v vVar;
        e eVar;
        if (iVar != null && bundle != null) {
            try {
                p1 a2 = p1.a(bundle);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    fg.f fVar = this.f15918b;
                    IBinder asBinder = iVar.asBinder();
                    synchronized (fVar.f9520a) {
                        r u10 = fVar.u(asBinder);
                        vVar = null;
                        if (u10 != null) {
                            eVar = (e) ((a0.f) fVar.f9522c).get(u10);
                        } else {
                            eVar = null;
                        }
                    }
                    if (eVar != null) {
                        vVar = eVar.f15895b;
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

    public final void M0(i iVar, int i10, int i11, e1 e1Var) {
        r u10 = this.f15918b.u(iVar.asBinder());
        if (u10 != null) {
            N0(u10, i10, i11, e1Var);
        }
    }

    public final void N0(r rVar, int i10, int i11, e1 e1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            a0 a0Var = (a0) this.f15917a.get();
            if (a0Var != null && !a0Var.j()) {
                e2.d0.U(a0Var.f15862l, new ji.h0(this, rVar, i11, a0Var, i10, e1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void Q0(i iVar, int i10, int i11) {
        if (iVar != null && i11 >= 0) {
            M0(iVar, i10, 25, P0(new bi.j(i11, 4)));
        }
    }

    public final void R0(i iVar, int i10, Bundle bundle, boolean z10) {
        if (iVar != null && bundle != null) {
            try {
                M0(iVar, i10, 31, new x0(new ah.i0(26, new bi.h(2, b2.k0.a(bundle), z10), new t0(4)), 1));
            } catch (RuntimeException e7) {
                e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
            }
        }
    }

    public final void S0(i iVar, int i10, Bundle bundle, long j3) {
        if (iVar != null && bundle != null) {
            try {
                M0(iVar, i10, 31, new x0(new ah.i0(26, new bi.p1(b2.k0.a(bundle), j3, 2), new t0(4)), 1));
            } catch (RuntimeException e7) {
                e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
            }
        }
    }

    public final void T0(i iVar, int i10, IBinder iBinder, boolean z10) {
        if (iVar != null && iBinder != null) {
            try {
                e9.i0 a2 = b2.h.a(iBinder);
                e9.f0 u10 = e9.i0.u();
                for (int i11 = 0; i11 < a2.size(); i11++) {
                    Bundle bundle = (Bundle) a2.get(i11);
                    bundle.getClass();
                    u10.b(b2.k0.a(bundle));
                }
                M0(iVar, i10, 20, new x0(new ah.i0(26, new bi.h(3, u10.i(), z10), new t0(4)), 1));
            } catch (RuntimeException e7) {
                e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
            }
        }
    }

    public final void U0(i iVar, int i10, IBinder iBinder, int i11, long j3) {
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
                    M0(iVar, i10, 20, new x0(new ah.i0(26, new j2.d(u10.i(), i11, j3, 2), new t0(4)), 1));
                } catch (RuntimeException e7) {
                    e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e7);
                }
            }
        }
    }

    public final void V0(i iVar, int i10, float f7) {
        if (iVar != null && f7 >= 0.0f && f7 <= 1.0f) {
            M0(iVar, i10, 24, P0(new o0(f7, 1)));
        }
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z10;
        l1 l1Var;
        f1 f1Var;
        r u10;
        r u11;
        r u12;
        r u13;
        r u14;
        r u15;
        r u16;
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
                V0(m.G0(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                Q0(m.G0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                J0(m.G0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                i G0 = m.G0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                if (G0 != null) {
                    M0(G0, readInt, 26, P0(new bi.f(13)));
                    return true;
                }
                break;
            case 3006:
                i G02 = m.G0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                if (G02 != null) {
                    M0(G02, readInt2, 26, P0(new n0(1, z11)));
                    return true;
                }
                break;
            case 3007:
                R0(m.G0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.s.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                S0(m.G0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.s.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                i G03 = m.G0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                Bundle bundle = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z17 = true;
                }
                R0(G03, readInt3, bundle, z17);
                return true;
            case 3010:
                T0(m.G0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                i G04 = m.G0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (parcel.readInt() != 0) {
                    z16 = true;
                }
                T0(G04, readInt4, readStrongBinder, z16);
                return true;
            case 3012:
                U0(m.G0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                i G05 = m.G0(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z15 = true;
                }
                if (G05 != null) {
                    M0(G05, readInt5, 1, P0(new n0(0, z15)));
                    return true;
                }
                break;
            case 3014:
                L0(m.G0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) w7.s.a(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                i G06 = m.G0(parcel.readStrongBinder());
                parcel.readInt();
                Bundle bundle2 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                WeakReference weakReference = this.f15917a;
                if (G06 != null && bundle2 != null) {
                    try {
                        f a2 = f.a(bundle2);
                        int callingUid = Binder.getCallingUid();
                        int callingPid = Binder.getCallingPid();
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        if (callingPid == 0) {
                            callingPid = a2.d;
                        }
                        try {
                            n4.a0 a0Var = new n4.a0(a2.f15912c, callingPid, callingUid);
                            a0 a0Var2 = (a0) weakReference.get();
                            if (a0Var2 != null && n4.d0.a(a0Var2.f15857f).b(a0Var)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int i12 = a2.f15910a;
                            int i13 = a2.f15911b;
                            r rVar = new r(a0Var, i12, i13, z10, new b1(G06, i13), a2.f15913e);
                            a0 a0Var3 = (a0) weakReference.get();
                            if (a0Var3 != null && !a0Var3.j()) {
                                this.f15919c.add(rVar);
                                try {
                                    try {
                                        e2.d0.U(a0Var3.f15862l, new androidx.car.app.utils.b(this, rVar, a0Var3, G06, 23));
                                        break;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            w7.u.a(G06);
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
                i G07 = m.G0(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) w7.s.a(parcel, creator);
                Bundle bundle4 = (Bundle) w7.s.a(parcel, creator);
                if (G07 != null && bundle3 != null && bundle4 != null) {
                    try {
                        int i14 = bundle3.getInt(l1.f16023f, 0);
                        if (i14 != 0) {
                            l1Var = new l1(i14);
                        } else {
                            String string = bundle3.getString(l1.f16024g);
                            string.getClass();
                            Bundle bundle5 = bundle3.getBundle(l1.h);
                            if (bundle5 == null) {
                                bundle5 = Bundle.EMPTY;
                            }
                            l1Var = new l1(string, bundle5);
                        }
                        f1Var = this;
                        f1Var.G0(G07, readInt6, l1Var, 0, new x0(new j2.e(25, l1Var, bundle4), 1));
                        break;
                    } catch (RuntimeException e10) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e10);
                        break;
                    }
                }
                break;
            case 3017:
                i G08 = m.G0(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                if (G08 != null && (readInt8 == 2 || readInt8 == 0 || readInt8 == 1)) {
                    M0(G08, readInt7, 15, P0(new bi.j(readInt8, 3)));
                    return true;
                }
                break;
            case 3018:
                i G09 = m.G0(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                if (G09 != null) {
                    M0(G09, readInt9, 14, P0(new n0(2, z14)));
                    return true;
                }
                break;
            case 3019:
                i G010 = m.G0(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                if (G010 != null && readInt11 >= 0) {
                    M0(G010, readInt10, 20, new k5(new m0(this, readInt11, 4), 5));
                    return true;
                }
                break;
            case 3020:
                i G011 = m.G0(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                if (G011 != null && readInt13 >= 0 && readInt14 >= readInt13) {
                    M0(G011, readInt12, 20, new k5(new l0(this, readInt13, readInt14), 5));
                    return true;
                }
                break;
            case 3021:
                i G012 = m.G0(parcel.readStrongBinder());
                int readInt15 = parcel.readInt();
                if (G012 != null) {
                    M0(G012, readInt15, 20, P0(new bi.f(17)));
                    return true;
                }
                break;
            case 3022:
                i G013 = m.G0(parcel.readStrongBinder());
                int readInt16 = parcel.readInt();
                final int readInt17 = parcel.readInt();
                final int readInt18 = parcel.readInt();
                if (G013 != null && readInt17 >= 0 && readInt18 >= 0) {
                    M0(G013, readInt16, 20, P0(new e2.h() {
                        @Override
                        public final void accept(Object obj) {
                            switch (r3) {
                                case 0:
                                    ((j1) obj).M(readInt17, readInt18);
                                    return;
                                default:
                                    ((j1) obj).q0(readInt17, readInt18);
                                    return;
                            }
                        }
                    }));
                    return true;
                }
                break;
            case 3023:
                i G014 = m.G0(parcel.readStrongBinder());
                int readInt19 = parcel.readInt();
                final int readInt20 = parcel.readInt();
                final int readInt21 = parcel.readInt();
                final int readInt22 = parcel.readInt();
                if (G014 != null && readInt20 >= 0 && readInt21 >= readInt20 && readInt22 >= 0) {
                    M0(G014, readInt19, 20, P0(new e2.h() {
                        @Override
                        public final void accept(Object obj) {
                            ((j1) obj).r0(readInt20, readInt21, readInt22);
                        }
                    }));
                    return true;
                }
                break;
            case 3024:
                i G015 = m.G0(parcel.readStrongBinder());
                int readInt23 = parcel.readInt();
                if (G015 != null && (u10 = this.f15918b.u(G015.asBinder())) != null) {
                    N0(u10, readInt23, 1, P0(new t2(2, this, u10)));
                    return true;
                }
                break;
            case 3025:
                i G016 = m.G0(parcel.readStrongBinder());
                int readInt24 = parcel.readInt();
                if (G016 != null && (u11 = this.f15918b.u(G016.asBinder())) != null) {
                    N0(u11, readInt24, 1, P0(new bi.f(5)));
                    return true;
                }
                break;
            case 3026:
                i G017 = m.G0(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                if (G017 != null) {
                    M0(G017, readInt25, 2, P0(new bi.f(15)));
                    return true;
                }
                break;
            case 3027:
                i G018 = m.G0(parcel.readStrongBinder());
                int readInt26 = parcel.readInt();
                Bundle bundle6 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G018 != null && bundle6 != null) {
                    try {
                        M0(G018, readInt26, 13, P0(new ah.m(new b2.v0(bundle6.getFloat(b2.v0.f2425e, 1.0f), bundle6.getFloat(b2.v0.f2426f, 1.0f)), 7)));
                        break;
                    } catch (RuntimeException e11) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e11);
                        break;
                    }
                }
                break;
            case 3028:
                i G019 = m.G0(parcel.readStrongBinder());
                int readInt27 = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (G019 != null && readFloat > 0.0f) {
                    M0(G019, readInt27, 13, P0(new o0(readFloat, 0)));
                    return true;
                }
                break;
            case 3029:
                i G020 = m.G0(parcel.readStrongBinder());
                int readInt28 = parcel.readInt();
                Bundle bundle7 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G020 != null && bundle7 != null) {
                    try {
                        final b2.k0 a10 = b2.k0.a(bundle7);
                        M0(G020, readInt28, 20, new x0(new ah.i0(27, new e1() {
                            @Override
                            public final Object h(a0 a0Var4, r rVar2, int i15) {
                                switch (r2) {
                                    case 0:
                                        return a0Var4.l(rVar2, e9.i0.z(a10));
                                    case 1:
                                        return a0Var4.l(rVar2, e9.i0.z(a10));
                                    default:
                                        return a0Var4.l(rVar2, e9.i0.z(a10));
                                }
                            }
                        }, new j2.e(29)), 1));
                        break;
                    } catch (RuntimeException e12) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e12);
                        break;
                    }
                }
                break;
            case 3030:
                i G021 = m.G0(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                int readInt30 = parcel.readInt();
                Bundle bundle8 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G021 != null && bundle8 != null && readInt30 >= 0) {
                    try {
                        final b2.k0 a11 = b2.k0.a(bundle8);
                        M0(G021, readInt29, 20, new x0(new ah.i0(27, new e1() {
                            @Override
                            public final Object h(a0 a0Var4, r rVar2, int i15) {
                                switch (r2) {
                                    case 0:
                                        return a0Var4.l(rVar2, e9.i0.z(a11));
                                    case 1:
                                        return a0Var4.l(rVar2, e9.i0.z(a11));
                                    default:
                                        return a0Var4.l(rVar2, e9.i0.z(a11));
                                }
                            }
                        }, new m0(this, readInt30, 1)), 1));
                        break;
                    } catch (RuntimeException e13) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e13);
                        break;
                    }
                }
                break;
            case 3031:
                i G022 = m.G0(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (G022 != null && readStrongBinder2 != null) {
                    try {
                        e9.i0 a12 = b2.h.a(readStrongBinder2);
                        e9.f0 u17 = e9.i0.u();
                        for (int i15 = 0; i15 < a12.size(); i15++) {
                            Bundle bundle9 = (Bundle) a12.get(i15);
                            bundle9.getClass();
                            u17.b(b2.k0.a(bundle9));
                        }
                        M0(G022, readInt31, 20, new x0(new ah.i0(27, new i2.z(3, u17.i()), new j2.e(28)), 1));
                        break;
                    } catch (RuntimeException e14) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e14);
                        break;
                    }
                }
                break;
            case 3032:
                i G023 = m.G0(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                int readInt33 = parcel.readInt();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (G023 != null && readStrongBinder3 != null && readInt33 >= 0) {
                    try {
                        e9.i0 a13 = b2.h.a(readStrongBinder3);
                        e9.f0 u18 = e9.i0.u();
                        for (int i16 = 0; i16 < a13.size(); i16++) {
                            Bundle bundle10 = (Bundle) a13.get(i16);
                            bundle10.getClass();
                            u18.b(b2.k0.a(bundle10));
                        }
                        M0(G023, readInt32, 20, new x0(new ah.i0(27, new i2.z(2, u18.i()), new m0(this, readInt33, 3)), 1));
                        break;
                    } catch (RuntimeException e15) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e15);
                        break;
                    }
                }
                break;
            case 3033:
                i G024 = m.G0(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                Bundle bundle11 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G024 != null && bundle11 != null) {
                    try {
                        M0(G024, readInt34, 19, P0(new ah.m(b2.n0.b(bundle11), 9)));
                        break;
                    } catch (RuntimeException e16) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e16);
                        break;
                    }
                }
                break;
            case 3034:
                i G025 = m.G0(parcel.readStrongBinder());
                int readInt35 = parcel.readInt();
                if (G025 != null && (u12 = this.f15918b.u(G025.asBinder())) != null) {
                    N0(u12, readInt35, 3, P0(new bi.f(14)));
                    return true;
                }
                break;
            case 3035:
                i G026 = m.G0(parcel.readStrongBinder());
                parcel.readInt();
                if (G026 != null) {
                    long clearCallingIdentity2 = Binder.clearCallingIdentity();
                    try {
                        a0 a0Var4 = (a0) this.f15917a.get();
                        if (a0Var4 != null && !a0Var4.j()) {
                            e2.d0.U(a0Var4.f15862l, new b5(9, this, G026));
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3036:
                i G027 = m.G0(parcel.readStrongBinder());
                int readInt36 = parcel.readInt();
                if (G027 != null) {
                    M0(G027, readInt36, 4, P0(new bi.f(16)));
                    return true;
                }
                break;
            case 3037:
                i G028 = m.G0(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                int readInt38 = parcel.readInt();
                if (G028 != null && readInt38 >= 0) {
                    M0(G028, readInt37, 10, new k5(new m0(this, readInt38, 0), 5));
                    return true;
                }
                break;
            case 3038:
                i G029 = m.G0(parcel.readStrongBinder());
                int readInt39 = parcel.readInt();
                final long readLong = parcel.readLong();
                if (G029 != null) {
                    M0(G029, readInt39, 5, P0(new e2.h() {
                        @Override
                        public final void accept(Object obj) {
                            ((j1) obj).g(readLong);
                        }
                    }));
                    return true;
                }
                break;
            case 3039:
                i G030 = m.G0(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                int readInt41 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (G030 != null && readInt41 >= 0) {
                    M0(G030, readInt40, 10, new k5(new j2.d(this, readInt41, readLong2, 1), 5));
                    return true;
                }
                break;
            case 3040:
                i G031 = m.G0(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (G031 != null && (u13 = this.f15918b.u(G031.asBinder())) != null) {
                    N0(u13, readInt42, 11, P0(new bi.f(8)));
                    return true;
                }
                break;
            case 3041:
                i G032 = m.G0(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                if (G032 != null && (u14 = this.f15918b.u(G032.asBinder())) != null) {
                    N0(u14, readInt43, 12, P0(new bi.f(11)));
                    return true;
                }
                break;
            case 3042:
                i G033 = m.G0(parcel.readStrongBinder());
                int readInt44 = parcel.readInt();
                if (G033 != null) {
                    M0(G033, readInt44, 6, P0(new bi.f(10)));
                    return true;
                }
                break;
            case 3043:
                i G034 = m.G0(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                if (G034 != null) {
                    M0(G034, readInt45, 8, P0(new bi.f(6)));
                    return true;
                }
                break;
            case 3044:
                i G035 = m.G0(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                Surface surface = (Surface) w7.s.a(parcel, Surface.CREATOR);
                if (G035 != null) {
                    M0(G035, readInt46, 27, P0(new ah.m(surface, 8)));
                    return true;
                }
                break;
            case 3045:
                i G036 = m.G0(parcel.readStrongBinder());
                if (G036 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        a0 a0Var5 = (a0) this.f15917a.get();
                        if (a0Var5 != null && !a0Var5.j()) {
                            r u19 = this.f15918b.u(G036.asBinder());
                            if (u19 != null) {
                                e2.d0.U(a0Var5.f15862l, new b5(10, this, u19));
                            }
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3046:
                i G037 = m.G0(parcel.readStrongBinder());
                int readInt47 = parcel.readInt();
                if (G037 != null && (u15 = this.f15918b.u(G037.asBinder())) != null) {
                    N0(u15, readInt47, 7, P0(new bi.f(9)));
                    return true;
                }
                break;
            case 3047:
                i G038 = m.G0(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                if (G038 != null && (u16 = this.f15918b.u(G038.asBinder())) != null) {
                    N0(u16, readInt48, 9, P0(new bi.f(12)));
                    return true;
                }
                break;
            case 3048:
                i G039 = m.G0(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                Bundle bundle12 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G039 != null && bundle12 != null) {
                    try {
                        M0(G039, readInt49, 29, P0(new t2(1, this, b2.q1.b(bundle12))));
                        break;
                    } catch (RuntimeException e17) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e17);
                        break;
                    }
                }
                break;
            case 3049:
                i G040 = m.G0(parcel.readStrongBinder());
                int readInt50 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle13 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G040 != null && readString != null && bundle13 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        e2.a.n("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            f1Var = this;
                            f1Var.G0(G040, readInt50, null, 40010, new x0(new j2.e(27, readString, b2.c1.a(bundle13)), 1));
                            break;
                        } catch (RuntimeException e18) {
                            e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for Rating", e18);
                            break;
                        }
                    }
                }
                break;
            case 3050:
                i G041 = m.G0(parcel.readStrongBinder());
                int readInt51 = parcel.readInt();
                Bundle bundle14 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G041 != null && bundle14 != null) {
                    try {
                        G0(G041, readInt51, null, 40010, new x0(new t0(b2.c1.a(bundle14), 5), 1));
                    } catch (RuntimeException e19) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for Rating", e19);
                    }
                }
                break;
            case 3051:
                i G042 = m.G0(parcel.readStrongBinder());
                int readInt52 = parcel.readInt();
                final int readInt53 = parcel.readInt();
                final int readInt54 = parcel.readInt();
                if (G042 != null && readInt53 >= 0) {
                    M0(G042, readInt52, 33, P0(new e2.h() {
                        @Override
                        public final void accept(Object obj) {
                            switch (r3) {
                                case 0:
                                    ((j1) obj).M(readInt53, readInt54);
                                    return;
                                default:
                                    ((j1) obj).q0(readInt53, readInt54);
                                    return;
                            }
                        }
                    }));
                    return true;
                }
                break;
            case 3052:
                i G043 = m.G0(parcel.readStrongBinder());
                int readInt55 = parcel.readInt();
                int readInt56 = parcel.readInt();
                if (G043 != null) {
                    M0(G043, readInt55, 34, P0(new bi.j(readInt56, 2)));
                    return true;
                }
                break;
            case 3053:
                i G044 = m.G0(parcel.readStrongBinder());
                int readInt57 = parcel.readInt();
                int readInt58 = parcel.readInt();
                if (G044 != null) {
                    M0(G044, readInt57, 34, P0(new bi.j(readInt58, 1)));
                    return true;
                }
                break;
            case 3054:
                i G045 = m.G0(parcel.readStrongBinder());
                int readInt59 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z13 = true;
                }
                final int readInt60 = parcel.readInt();
                if (G045 != null) {
                    M0(G045, readInt59, 34, P0(new e2.h() {
                        @Override
                        public final void accept(Object obj) {
                            ((j1) obj).J(readInt60, z13);
                        }
                    }));
                    return true;
                }
                break;
            case 3055:
                i G046 = m.G0(parcel.readStrongBinder());
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                Bundle bundle15 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (G046 != null && bundle15 != null && readInt62 >= 0) {
                    try {
                        final b2.k0 a14 = b2.k0.a(bundle15);
                        M0(G046, readInt61, 20, new x0(new ah.i0(27, new e1() {
                            @Override
                            public final Object h(a0 a0Var42, r rVar2, int i152) {
                                switch (r2) {
                                    case 0:
                                        return a0Var42.l(rVar2, e9.i0.z(a14));
                                    case 1:
                                        return a0Var42.l(rVar2, e9.i0.z(a14));
                                    default:
                                        return a0Var42.l(rVar2, e9.i0.z(a14));
                                }
                            }
                        }, new m0(this, readInt62, 2)), 1));
                        break;
                    } catch (RuntimeException e20) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e20);
                        break;
                    }
                }
                break;
            case 3056:
                i G047 = m.G0(parcel.readStrongBinder());
                int readInt63 = parcel.readInt();
                int readInt64 = parcel.readInt();
                int readInt65 = parcel.readInt();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (G047 != null && readStrongBinder4 != null && readInt64 >= 0 && readInt65 >= readInt64) {
                    try {
                        e9.i0 a15 = b2.h.a(readStrongBinder4);
                        e9.f0 u20 = e9.i0.u();
                        for (int i17 = 0; i17 < a15.size(); i17++) {
                            Bundle bundle16 = (Bundle) a15.get(i17);
                            bundle16.getClass();
                            u20.b(b2.k0.a(bundle16));
                        }
                        M0(G047, readInt63, 20, new x0(new ah.i0(27, new k5(u20.i(), 4), new l0(this, readInt64, readInt65)), 1));
                        break;
                    } catch (RuntimeException e21) {
                        e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e21);
                        break;
                    }
                }
                break;
            case 3057:
                i G048 = m.G0(parcel.readStrongBinder());
                int readInt66 = parcel.readInt();
                Bundle bundle17 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z12 = true;
                }
                if (G048 != null && bundle17 != null) {
                    try {
                        M0(G048, readInt66, 35, P0(new s0(0, b2.e.a(bundle17), z12)));
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
                        i G049 = m.G0(parcel.readStrongBinder());
                        int readInt67 = parcel.readInt();
                        Bundle bundle18 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                        if (G049 != null) {
                            if (bundle18 != null) {
                                try {
                                    nVar = n.a(bundle18);
                                } catch (RuntimeException e23) {
                                    e2.a.o("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e23);
                                    break;
                                }
                            }
                            f1Var = this;
                            f1Var.G0(G049, readInt67, null, 50000, new x0(new t0(nVar, 1), 0));
                            break;
                        }
                        break;
                    case 4002:
                        i G050 = m.G0(parcel.readStrongBinder());
                        int readInt68 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (G050 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                e2.a.n("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            G0(G050, readInt68, null, 50004, new x0(new j2.e(readString2, 26), 0));
                            return true;
                        }
                        break;
                    case 4003:
                        i G051 = m.G0(parcel.readStrongBinder());
                        int readInt69 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt70 = parcel.readInt();
                        int readInt71 = parcel.readInt();
                        Bundle bundle19 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                        if (G051 != null) {
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
                                G0(G051, readInt69, null, 50003, new x0(new j2.e(readString3, readInt70, readInt71, nVar), 0));
                            }
                        }
                        break;
                    case 4004:
                        i G052 = m.G0(parcel.readStrongBinder());
                        int readInt72 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle20 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                        if (G052 != null) {
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
                                G0(G052, readInt72, null, 50005, new x0(new t0(readString4, nVar, 3), 0));
                            }
                        }
                        break;
                    case 4005:
                        i G053 = m.G0(parcel.readStrongBinder());
                        int readInt73 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt74 = parcel.readInt();
                        int readInt75 = parcel.readInt();
                        Bundle bundle21 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                        if (G053 != null) {
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
                                G0(G053, readInt73, null, 50006, new x0(new t0(readString5, readInt74, readInt75, nVar), 0));
                            }
                        }
                        break;
                    case 4006:
                        i G054 = m.G0(parcel.readStrongBinder());
                        int readInt76 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle22 = (Bundle) w7.s.a(parcel, Bundle.CREATOR);
                        if (G054 != null) {
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
                                G0(G054, readInt76, null, 50001, new x0(new t0(readString6, nVar, 2), 0));
                            }
                        }
                        break;
                    case 4007:
                        i G055 = m.G0(parcel.readStrongBinder());
                        int readInt77 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (G055 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                e2.a.n("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            G0(G055, readInt77, null, 50002, new x0(new j2.e(readString7, 23), 0));
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
