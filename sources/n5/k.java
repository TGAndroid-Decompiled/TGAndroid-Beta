package n5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
import m5.f0;

public final class k extends b7.a {

    public final int f18322b = 2;

    public final Object f18323c;

    public k(com.google.android.gms.internal.cast.f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 2);
        this.f18323c = fVar;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        int i11 = this.f18322b;
        int i12 = 3;
        Object obj = this.f18323c;
        int i13 = 0;
        switch (i11) {
            case 0:
                u3.k kVar = (u3.k) obj;
                if (i10 == 1) {
                    i6.b bVar = new i6.b(kVar);
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.t.d(parcel2, bVar);
                    return true;
                }
                if (i10 != 2) {
                    if (i10 != 3) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                int i14 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                kVar.getClass();
                Log.d("CAST_STATE", "onCastStateChanged " + i14);
                parcel2.writeNoException();
                return true;
            case 1:
                g gVar = (g) obj;
                switch (i10) {
                    case 1:
                        i6.b bVar2 = new i6.b(gVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.t.d(parcel2, bVar2);
                        return true;
                    case 2:
                        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) gVar).i(bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        Bundle bundle2 = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) gVar).i(bundle2);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        int i15 = com.google.android.gms.internal.cast.t.f3660a;
                        int i16 = parcel.readInt() != 0 ? 1 : 0;
                        com.google.android.gms.internal.cast.t.b(parcel);
                        c cVar = (c) gVar;
                        r rVar = cVar.f18304e;
                        if (rVar != null) {
                            try {
                                p pVar = (p) rVar;
                                Parcel parcelM0 = pVar.M0();
                                parcelM0.writeInt(i16);
                                parcelM0.writeInt(0);
                                pVar.Q0(parcelM0, 6);
                            } catch (RemoteException e9) {
                                c.f18302m.a(e9, "Unable to call %s on %s.", "disconnectFromDevice", r.class.getSimpleName());
                            }
                            cVar.d(0);
                            break;
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        c cVar2 = (c) gVar;
                        y5.l.e("Must be called from the main thread.");
                        o5.h hVar = cVar2.f18308j;
                        long jG = hVar == null ? 0L : hVar.g() - cVar2.f18308j.a();
                        parcel2.writeNoException();
                        parcel2.writeLong(jG);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 7:
                        Bundle bundle3 = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) gVar).f18309k = CastDevice.b(bundle3);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        Bundle bundle4 = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) gVar).f18309k = CastDevice.b(bundle4);
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        Bundle bundle5 = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        c cVar3 = (c) gVar;
                        CastDevice castDeviceB = CastDevice.b(bundle5);
                        if (castDeviceB != null) {
                            String str = castDeviceB.d;
                            if (!castDeviceB.equals(cVar3.f18309k)) {
                                boolean z10 = !TextUtils.isEmpty(str) && ((castDevice2 = cVar3.f18309k) == null || !TextUtils.equals(castDevice2.d, str));
                                cVar3.f18309k = castDeviceB;
                                c.f18302m.b("update to device (%s) with name %s", castDeviceB, true != z10 ? "unchanged" : "changed");
                                if (z10 && (castDevice = cVar3.f18309k) != null) {
                                    p5.h hVar2 = cVar3.h;
                                    if (hVar2 != null) {
                                        r5.b bVar3 = p5.h.v;
                                        Log.i(bVar3.f46768a, bVar3.d("update Cast device to %s", castDevice));
                                        hVar2.f45500o = castDevice;
                                        hVar2.b();
                                    }
                                    Iterator it = new HashSet(cVar3.d).iterator();
                                    while (it.hasNext()) {
                                        ((e0) it.next()).getClass();
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    default:
                        return false;
                }
            case 2:
                com.google.android.gms.internal.cast.f fVar = (com.google.android.gms.internal.cast.f) obj;
                b bVar4 = fVar.d;
                if (i10 == 1) {
                    String string = parcel.readString();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    i6.a aVarF = new c(fVar.f3530a, fVar.f3531b, string, fVar.d, fVar.f3533e, new p5.h(fVar.f3530a, bVar4, fVar.f3533e)).f();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.t.d(parcel2, aVarF);
                    return true;
                }
                if (i10 == 2) {
                    boolean z11 = bVar4.f18293e;
                    parcel2.writeNoException();
                    int i17 = com.google.android.gms.internal.cast.t.f3660a;
                    parcel2.writeInt(z11 ? 1 : 0);
                    return true;
                }
                if (i10 == 3) {
                    String str2 = fVar.f3531b;
                    parcel2.writeNoException();
                    parcel2.writeString(str2);
                    return true;
                }
                if (i10 != 4) {
                    return false;
                }
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 3:
                c cVar4 = (c) obj;
                if (i10 == 1) {
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    f0 f0Var = cVar4.f18307i;
                    if (f0Var != null && f0Var.F == 2) {
                        com.google.android.gms.common.api.internal.v vVarB = com.google.android.gms.common.api.internal.w.b();
                        vVarB.f3359c = new m5.c0(f0Var, string2, string3, i13);
                        vVarB.f3357a = 8407;
                        f0Var.e(1, vVarB.b()).addOnCompleteListener(new n1.d(this, i12));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i10 == 2) {
                    String string4 = parcel.readString();
                    m5.i iVar = (m5.i) com.google.android.gms.internal.cast.t.a(parcel, m5.i.CREATOR);
                    com.google.android.gms.internal.cast.t.b(parcel);
                    f0 f0Var2 = cVar4.f18307i;
                    if (f0Var2 != null && f0Var2.F == 2) {
                        com.google.android.gms.common.api.internal.v vVarB2 = com.google.android.gms.common.api.internal.w.b();
                        vVarB2.f3359c = new j9.a(f0Var2, string4, iVar);
                        vVarB2.f3357a = 8406;
                        f0Var2.e(1, vVarB2.b()).addOnCompleteListener(new ga.c(this, 29));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return false;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    }
                    int i18 = parcel.readInt();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    c.g(cVar4, i18);
                    parcel2.writeNoException();
                    return true;
                }
                String string5 = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                f0 f0Var3 = cVar4.f18307i;
                if (f0Var3 != null && f0Var3.F == 2) {
                    com.google.android.gms.common.api.internal.v vVarB3 = com.google.android.gms.common.api.internal.w.b();
                    vVarB3.f3359c = new g5.b(20, f0Var3, string5);
                    vVarB3.f3357a = 8409;
                    f0Var3.e(1, vVarB3.b());
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                long j10 = parcel.readLong();
                long j11 = parcel.readLong();
                com.google.android.gms.internal.cast.t.b(parcel);
                ((p5.b) obj).publishProgress(Long.valueOf(j10), Long.valueOf(j11));
                parcel2.writeNoException();
                return true;
        }
    }

    public k(c cVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 2);
        this.f18323c = cVar;
    }

    public k(g gVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 2);
        this.f18323c = gVar;
    }

    public k(p5.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 2);
        this.f18323c = bVar;
    }

    public k(u3.k kVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 2);
        this.f18323c = kVar;
    }
}
