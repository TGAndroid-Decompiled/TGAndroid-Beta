package n5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
public final class j extends a7.a {
    public final int f18496b = 2;
    public final Object f18497c;

    public j(com.google.android.gms.internal.cast.f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 3);
        this.f18497c = fVar;
    }

    @Override
    public final boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        int i10;
        long g10;
        boolean z10;
        String str;
        CastDevice castDevice;
        CastDevice castDevice2;
        int i11 = this.f18496b;
        Object obj = this.f18497c;
        switch (i11) {
            case 0:
                v0.l lVar = (v0.l) obj;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            return false;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    }
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    lVar.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    return true;
                }
                h6.b bVar = new h6.b(lVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.u.d(parcel2, bVar);
                return true;
            case 1:
                f fVar = (f) obj;
                switch (i9) {
                    case 1:
                        h6.b bVar2 = new h6.b(fVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.u.d(parcel2, bVar2);
                        return true;
                    case 2:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).i((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).i((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        int i12 = com.google.android.gms.internal.cast.u.f3239a;
                        if (parcel.readInt() != 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        com.google.android.gms.internal.cast.u.b(parcel);
                        c cVar = (c) fVar;
                        q qVar = cVar.f18477e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel M0 = oVar.M0();
                                M0.writeInt(i10);
                                M0.writeInt(0);
                                oVar.Q0(M0, 6);
                            } catch (RemoteException e10) {
                                c.f18475m.a(e10, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        c cVar2 = (c) fVar;
                        x5.l.e("Must be called from the main thread.");
                        o5.h hVar = cVar2.f18481j;
                        if (hVar == null) {
                            g10 = 0;
                        } else {
                            g10 = hVar.g() - cVar2.f18481j.a();
                        }
                        parcel2.writeNoException();
                        parcel2.writeLong(g10);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 7:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).f18482k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).f18482k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        c cVar3 = (c) fVar;
                        CastDevice b10 = CastDevice.b((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        if (b10 != null) {
                            String str2 = b10.d;
                            if (!b10.equals(cVar3.f18482k)) {
                                if (!TextUtils.isEmpty(str2) && ((castDevice2 = cVar3.f18482k) == null || !TextUtils.equals(castDevice2.d, str2))) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                cVar3.f18482k = b10;
                                q5.b bVar3 = c.f18475m;
                                if (true != z10) {
                                    str = "unchanged";
                                } else {
                                    str = "changed";
                                }
                                bVar3.b("update to device (%s) with name %s", b10, str);
                                if (z10 && (castDevice = cVar3.f18482k) != null) {
                                    p5.h hVar2 = cVar3.h;
                                    if (hVar2 != null) {
                                        q5.b bVar4 = p5.h.v;
                                        Log.i(bVar4.f46009a, bVar4.d("update Cast device to %s", castDevice));
                                        hVar2.f45494o = castDevice;
                                        hVar2.b();
                                    }
                                    Iterator it = new HashSet(cVar3.d).iterator();
                                    while (it.hasNext()) {
                                        ((f0) it.next()).getClass();
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
                com.google.android.gms.internal.cast.f fVar2 = (com.google.android.gms.internal.cast.f) obj;
                b bVar5 = fVar2.d;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                return false;
                            }
                            parcel2.writeNoException();
                            parcel2.writeInt(12451000);
                            return true;
                        }
                        String str3 = fVar2.f3100b;
                        parcel2.writeNoException();
                        parcel2.writeString(str3);
                        return true;
                    }
                    boolean z11 = bVar5.f18466e;
                    parcel2.writeNoException();
                    int i13 = com.google.android.gms.internal.cast.u.f3239a;
                    parcel2.writeInt(z11 ? 1 : 0);
                    return true;
                }
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                h6.a f10 = new c(fVar2.f3099a, fVar2.f3100b, readString, fVar2.d, fVar2.f3102e, new p5.h(fVar2.f3099a, bVar5, fVar2.f3102e)).f();
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.u.d(parcel2, f10);
                return true;
            case 3:
                c cVar4 = (c) obj;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                if (i9 != 5) {
                                    return false;
                                }
                                parcel2.writeNoException();
                                parcel2.writeInt(12451000);
                                return true;
                            }
                            int readInt2 = parcel.readInt();
                            com.google.android.gms.internal.cast.u.b(parcel);
                            c.g(cVar4, readInt2);
                            parcel2.writeNoException();
                            return true;
                        }
                        String readString2 = parcel.readString();
                        com.google.android.gms.internal.cast.u.b(parcel);
                        m5.f0 f0Var = cVar4.f18480i;
                        if (f0Var != null && f0Var.F == 2) {
                            com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                            b11.f2914c = new g5.b(19, f0Var, readString2);
                            b11.f2912a = 8409;
                            f0Var.e(1, b11.b());
                        }
                        parcel2.writeNoException();
                        return true;
                    }
                    String readString3 = parcel.readString();
                    m5.i iVar = (m5.i) com.google.android.gms.internal.cast.u.a(parcel, m5.i.CREATOR);
                    com.google.android.gms.internal.cast.u.b(parcel);
                    m5.f0 f0Var2 = cVar4.f18480i;
                    if (f0Var2 != null && f0Var2.F == 2) {
                        com.google.android.gms.common.api.internal.v b12 = com.google.android.gms.common.api.internal.w.b();
                        b12.f2914c = new j4.c(f0Var2, readString3, iVar, false, 12);
                        b12.f2912a = 8406;
                        f0Var2.e(1, b12.b()).addOnCompleteListener(new e0(this, 0));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                m5.f0 f0Var3 = cVar4.f18480i;
                if (f0Var3 != null && f0Var3.F == 2) {
                    com.google.android.gms.common.api.internal.v b13 = com.google.android.gms.common.api.internal.w.b();
                    b13.f2914c = new m5.b0(f0Var3, readString4, readString5, 0);
                    b13.f2912a = 8407;
                    f0Var3.e(1, b13.b()).addOnCompleteListener(new n2.p(this, 2));
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i9 != 1) {
                    if (i9 != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                com.google.android.gms.internal.cast.u.b(parcel);
                p5.b.a((p5.b) obj, new Long[]{Long.valueOf(readLong), Long.valueOf(readLong2)});
                parcel2.writeNoException();
                return true;
        }
    }

    public j(c cVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 3);
        this.f18497c = cVar;
    }

    public j(f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 3);
        this.f18497c = fVar;
    }

    public j(p5.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 3);
        this.f18497c = bVar;
    }

    public j(v0.l lVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 3);
        this.f18497c = lVar;
    }
}
