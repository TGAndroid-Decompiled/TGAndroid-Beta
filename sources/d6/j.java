package d6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
public final class j extends b8.b {
    public final int f6321b = 2;
    public final Object f6322c;

    public j(com.google.android.gms.internal.cast.f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 1);
        this.f6322c = fVar;
    }

    @Override
    public final boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        int i11;
        long g10;
        boolean z10;
        String str;
        CastDevice castDevice;
        CastDevice castDevice2;
        int i12 = this.f6321b;
        Object obj = this.f6322c;
        switch (i12) {
            case 0:
                n2.l lVar = (n2.l) obj;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return false;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    }
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.cast.v.b(parcel);
                    lVar.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    return true;
                }
                x6.b bVar = new x6.b(lVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.v.d(parcel2, bVar);
                return true;
            case 1:
                f fVar = (f) obj;
                switch (i10) {
                    case 1:
                        x6.b bVar2 = new x6.b(fVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.v.d(parcel2, bVar2);
                        return true;
                    case 2:
                        com.google.android.gms.internal.cast.v.b(parcel);
                        ((c) fVar).i((Bundle) com.google.android.gms.internal.cast.v.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        com.google.android.gms.internal.cast.v.b(parcel);
                        ((c) fVar).i((Bundle) com.google.android.gms.internal.cast.v.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        int i13 = com.google.android.gms.internal.cast.v.f5290a;
                        if (parcel.readInt() != 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        com.google.android.gms.internal.cast.v.b(parcel);
                        c cVar = (c) fVar;
                        q qVar = cVar.e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel O0 = oVar.O0();
                                O0.writeInt(i11);
                                O0.writeInt(0);
                                oVar.S0(O0, 6);
                            } catch (RemoteException e) {
                                c.f6304m.a(e, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        c cVar2 = (c) fVar;
                        n6.l.e("Must be called from the main thread.");
                        e6.h hVar = cVar2.f6309j;
                        if (hVar == null) {
                            g10 = 0;
                        } else {
                            g10 = hVar.g() - cVar2.f6309j.a();
                        }
                        parcel2.writeNoException();
                        parcel2.writeLong(g10);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 7:
                        com.google.android.gms.internal.cast.v.b(parcel);
                        ((c) fVar).f6310k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.v.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        com.google.android.gms.internal.cast.v.b(parcel);
                        ((c) fVar).f6310k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.v.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        com.google.android.gms.internal.cast.v.b(parcel);
                        c cVar3 = (c) fVar;
                        CastDevice b10 = CastDevice.b((Bundle) com.google.android.gms.internal.cast.v.a(parcel, Bundle.CREATOR));
                        if (b10 != null) {
                            String str2 = b10.d;
                            if (!b10.equals(cVar3.f6310k)) {
                                if (!TextUtils.isEmpty(str2) && ((castDevice2 = cVar3.f6310k) == null || !TextUtils.equals(castDevice2.d, str2))) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                cVar3.f6310k = b10;
                                g6.b bVar3 = c.f6304m;
                                if (true != z10) {
                                    str = "unchanged";
                                } else {
                                    str = "changed";
                                }
                                bVar3.b("update to device (%s) with name %s", b10, str);
                                if (z10 && (castDevice = cVar3.f6310k) != null) {
                                    f6.i iVar = cVar3.h;
                                    if (iVar != null) {
                                        g6.b bVar4 = f6.i.v;
                                        Log.i(bVar4.f8558a, bVar4.d("update Cast device to %s", castDevice));
                                        iVar.f7886o = castDevice;
                                        iVar.b();
                                    }
                                    Iterator it = new HashSet(cVar3.d).iterator();
                                    while (it.hasNext()) {
                                        ((d0) it.next()).getClass();
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
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return false;
                            }
                            parcel2.writeNoException();
                            parcel2.writeInt(12451000);
                            return true;
                        }
                        String str3 = fVar2.f5112b;
                        parcel2.writeNoException();
                        parcel2.writeString(str3);
                        return true;
                    }
                    boolean z11 = bVar5.e;
                    parcel2.writeNoException();
                    int i14 = com.google.android.gms.internal.cast.v.f5290a;
                    parcel2.writeInt(z11 ? 1 : 0);
                    return true;
                }
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.v.b(parcel);
                x6.a f7 = new c(fVar2.f5111a, fVar2.f5112b, readString, fVar2.d, fVar2.e, new f6.i(fVar2.f5111a, bVar5, fVar2.e)).f();
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.v.d(parcel2, f7);
                return true;
            case 3:
                c cVar4 = (c) obj;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    return false;
                                }
                                parcel2.writeNoException();
                                parcel2.writeInt(12451000);
                                return true;
                            }
                            int readInt2 = parcel.readInt();
                            com.google.android.gms.internal.cast.v.b(parcel);
                            c.g(cVar4, readInt2);
                            parcel2.writeNoException();
                            return true;
                        }
                        String readString2 = parcel.readString();
                        com.google.android.gms.internal.cast.v.b(parcel);
                        e0 e0Var = cVar4.f6308i;
                        if (e0Var != null && e0Var.F == 2) {
                            com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                            e7.f4957c = new n4.y(9, e0Var, readString2);
                            e7.f4955a = 8409;
                            e0Var.e(1, e7.a());
                        }
                        parcel2.writeNoException();
                        return true;
                    }
                    String readString3 = parcel.readString();
                    c6.i iVar2 = (c6.i) com.google.android.gms.internal.cast.v.a(parcel, c6.i.CREATOR);
                    com.google.android.gms.internal.cast.v.b(parcel);
                    e0 e0Var2 = cVar4.f6308i;
                    if (e0Var2 != null && e0Var2.F == 2) {
                        com.google.android.gms.common.api.internal.v e10 = com.google.android.gms.common.api.internal.w.e();
                        e10.f4957c = new aa.a((Object) e0Var2, readString3, (Object) iVar2, 8);
                        e10.f4955a = 8406;
                        e0Var2.e(1, e10.a()).addOnCompleteListener(new pb.c(this, 13));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.cast.v.b(parcel);
                e0 e0Var3 = cVar4.f6308i;
                if (e0Var3 != null && e0Var3.F == 2) {
                    com.google.android.gms.common.api.internal.v e11 = com.google.android.gms.common.api.internal.w.e();
                    e11.f4957c = new c6.b0(e0Var3, readString4, readString5, 0);
                    e11.f4955a = 8407;
                    e0Var3.e(1, e11.a()).addOnCompleteListener(new xa.c(this, 14));
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
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                com.google.android.gms.internal.cast.v.b(parcel);
                f6.b.a((f6.b) obj, new Long[]{Long.valueOf(readLong), Long.valueOf(readLong2)});
                parcel2.writeNoException();
                return true;
        }
    }

    public j(c cVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 1);
        this.f6322c = cVar;
    }

    public j(f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 1);
        this.f6322c = fVar;
    }

    public j(f6.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 1);
        this.f6322c = bVar;
    }

    public j(n2.l lVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 1);
        this.f6322c = lVar;
    }
}
