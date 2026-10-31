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
    public final int f5780b = 2;
    public final Object f5781c;

    public j(com.google.android.gms.internal.cast.e eVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 1);
        this.f5781c = eVar;
    }

    @Override
    public final boolean K0(int i10, Parcel parcel, Parcel parcel2) {
        int i11;
        long g10;
        Object[] objArr;
        String str;
        CastDevice castDevice;
        CastDevice castDevice2;
        int i12 = this.f5780b;
        Object obj = this.f5781c;
        switch (i12) {
            case 0:
                d2.c cVar = (d2.c) obj;
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
                    com.google.android.gms.internal.cast.u.b(parcel);
                    cVar.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    return true;
                }
                x6.b bVar = new x6.b(cVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.u.d(parcel2, bVar);
                return true;
            case 1:
                f fVar = (f) obj;
                switch (i10) {
                    case 1:
                        x6.b bVar2 = new x6.b(fVar);
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
                        int i13 = com.google.android.gms.internal.cast.u.f4789a;
                        if (parcel.readInt() != 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        com.google.android.gms.internal.cast.u.b(parcel);
                        c cVar2 = (c) fVar;
                        q qVar = cVar2.e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel P0 = oVar.P0();
                                P0.writeInt(i11);
                                P0.writeInt(0);
                                oVar.T0(P0, 6);
                            } catch (RemoteException e) {
                                c.f5763m.a(e, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar2.d(0);
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        c cVar3 = (c) fVar;
                        n6.l.d("Must be called from the main thread.");
                        e6.h hVar = cVar3.f5768j;
                        if (hVar == null) {
                            g10 = 0;
                        } else {
                            g10 = hVar.g() - cVar3.f5768j.a();
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
                        ((c) fVar).f5769k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).f5769k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        c cVar4 = (c) fVar;
                        CastDevice b10 = CastDevice.b((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        if (b10 != null) {
                            String str2 = b10.d;
                            if (!b10.equals(cVar4.f5769k)) {
                                if (!TextUtils.isEmpty(str2) && ((castDevice2 = cVar4.f5769k) == null || !TextUtils.equals(castDevice2.d, str2))) {
                                    objArr = 1;
                                } else {
                                    objArr = null;
                                }
                                cVar4.f5769k = b10;
                                g6.b bVar3 = c.f5763m;
                                if (1 != objArr) {
                                    str = "unchanged";
                                } else {
                                    str = "changed";
                                }
                                bVar3.b("update to device (%s) with name %s", b10, str);
                                if (objArr != null && (castDevice = cVar4.f5769k) != null) {
                                    f6.i iVar = cVar4.h;
                                    if (iVar != null) {
                                        g6.b bVar4 = f6.i.v;
                                        Log.i(bVar4.f7367a, bVar4.d("update Cast device to %s", castDevice));
                                        iVar.f6953o = castDevice;
                                        iVar.b();
                                    }
                                    Iterator it = new HashSet(cVar4.d).iterator();
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
                com.google.android.gms.internal.cast.e eVar = (com.google.android.gms.internal.cast.e) obj;
                b bVar5 = eVar.d;
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
                        String str3 = eVar.f4645b;
                        parcel2.writeNoException();
                        parcel2.writeString(str3);
                        return true;
                    }
                    boolean z10 = bVar5.e;
                    parcel2.writeNoException();
                    int i14 = com.google.android.gms.internal.cast.u.f4789a;
                    parcel2.writeInt(z10 ? 1 : 0);
                    return true;
                }
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                x6.a f7 = new c(eVar.f4644a, eVar.f4645b, readString, eVar.d, eVar.e, new f6.i(eVar.f4644a, bVar5, eVar.e)).f();
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.u.d(parcel2, f7);
                return true;
            case 3:
                c cVar5 = (c) obj;
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
                            com.google.android.gms.internal.cast.u.b(parcel);
                            c.g(cVar5, readInt2);
                            parcel2.writeNoException();
                            return true;
                        }
                        String readString2 = parcel.readString();
                        com.google.android.gms.internal.cast.u.b(parcel);
                        e0 e0Var = cVar5.f5767i;
                        if (e0Var != null && e0Var.F == 2) {
                            com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                            b11.f4496c = new hf.b(11, e0Var, readString2);
                            b11.f4494a = 8409;
                            e0Var.e(1, b11.a());
                        }
                        parcel2.writeNoException();
                        return true;
                    }
                    String readString3 = parcel.readString();
                    c6.i iVar2 = (c6.i) com.google.android.gms.internal.cast.u.a(parcel, c6.i.CREATOR);
                    com.google.android.gms.internal.cast.u.b(parcel);
                    e0 e0Var2 = cVar5.f5767i;
                    if (e0Var2 != null && e0Var2.F == 2) {
                        com.google.android.gms.common.api.internal.v b12 = com.google.android.gms.common.api.internal.w.b();
                        b12.f4496c = new android.support.v4.media.session.a0(e0Var2, readString3, iVar2, 9);
                        b12.f4494a = 8406;
                        e0Var2.e(1, b12.a()).addOnCompleteListener(new a4.l(this, 12));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                e0 e0Var3 = cVar5.f5767i;
                if (e0Var3 != null && e0Var3.F == 2) {
                    com.google.android.gms.common.api.internal.v b13 = com.google.android.gms.common.api.internal.w.b();
                    b13.f4496c = new c6.b0(e0Var3, readString4, readString5, 0);
                    b13.f4494a = 8407;
                    e0Var3.e(1, b13.a()).addOnCompleteListener(new k6.h(this, 18));
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
                com.google.android.gms.internal.cast.u.b(parcel);
                f6.b.a((f6.b) obj, new Long[]{Long.valueOf(readLong), Long.valueOf(readLong2)});
                parcel2.writeNoException();
                return true;
        }
    }

    public j(d2.c cVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 1);
        this.f5781c = cVar;
    }

    public j(c cVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 1);
        this.f5781c = cVar;
    }

    public j(f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 1);
        this.f5781c = fVar;
    }

    public j(f6.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 1);
        this.f5781c = bVar;
    }
}
