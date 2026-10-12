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
import org.telegram.ui.c80;
public final class j extends b8.b {
    public final int f8193b = 2;
    public final Object f8194c;

    public j(com.google.android.gms.internal.cast.f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 1);
        this.f8194c = fVar;
    }

    @Override
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        int i11;
        long g10;
        Object[] objArr;
        String str;
        CastDevice castDevice;
        CastDevice castDevice2;
        int i12 = this.f8193b;
        Object obj = this.f8194c;
        switch (i12) {
            case 0:
                c80 c80Var = (c80) obj;
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
                    c80Var.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    return true;
                }
                x6.b bVar = new x6.b(c80Var);
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
                        int i13 = com.google.android.gms.internal.cast.v.f7020a;
                        if (parcel.readInt() != 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        com.google.android.gms.internal.cast.v.b(parcel);
                        c cVar = (c) fVar;
                        q qVar = cVar.f8177e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel N0 = oVar.N0();
                                N0.writeInt(i11);
                                N0.writeInt(0);
                                oVar.R0(N0, 6);
                            } catch (RemoteException e7) {
                                c.f8175m.a(e7, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        c cVar2 = (c) fVar;
                        n6.m.e("Must be called from the main thread.");
                        e6.h hVar = cVar2.f8181j;
                        if (hVar == null) {
                            g10 = 0;
                        } else {
                            g10 = hVar.g() - cVar2.f8181j.a();
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
                        ((c) fVar).f8182k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.v.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        com.google.android.gms.internal.cast.v.b(parcel);
                        ((c) fVar).f8182k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.v.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        com.google.android.gms.internal.cast.v.b(parcel);
                        c cVar3 = (c) fVar;
                        CastDevice b10 = CastDevice.b((Bundle) com.google.android.gms.internal.cast.v.a(parcel, Bundle.CREATOR));
                        if (b10 != null) {
                            String str2 = b10.d;
                            if (!b10.equals(cVar3.f8182k)) {
                                if (!TextUtils.isEmpty(str2) && ((castDevice2 = cVar3.f8182k) == null || !TextUtils.equals(castDevice2.d, str2))) {
                                    objArr = 1;
                                } else {
                                    objArr = null;
                                }
                                cVar3.f8182k = b10;
                                g6.b bVar3 = c.f8175m;
                                if (1 != objArr) {
                                    str = "unchanged";
                                } else {
                                    str = "changed";
                                }
                                bVar3.b("update to device (%s) with name %s", b10, str);
                                if (objArr != null && (castDevice = cVar3.f8182k) != null) {
                                    f6.i iVar = cVar3.h;
                                    if (iVar != null) {
                                        g6.b bVar4 = f6.i.v;
                                        Log.i(bVar4.f10321a, bVar4.d("update Cast device to %s", castDevice));
                                        iVar.f9790o = castDevice;
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
                        String str3 = fVar2.f6873b;
                        parcel2.writeNoException();
                        parcel2.writeString(str3);
                        return true;
                    }
                    boolean z10 = bVar5.f8166e;
                    parcel2.writeNoException();
                    int i14 = com.google.android.gms.internal.cast.v.f7020a;
                    parcel2.writeInt(z10 ? 1 : 0);
                    return true;
                }
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.v.b(parcel);
                x6.a f7 = new c(fVar2.f6872a, fVar2.f6873b, readString, fVar2.d, fVar2.f6875e, new f6.i(fVar2.f6872a, bVar5, fVar2.f6875e)).f();
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
                        e0 e0Var = cVar4.f8180i;
                        if (e0Var != null && e0Var.F == 2) {
                            com.google.android.gms.common.api.internal.v e10 = com.google.android.gms.common.api.internal.w.e();
                            e10.f6694c = new pf.b(e0Var, readString2, false, 9);
                            e10.f6692a = 8409;
                            e0Var.e(1, e10.a());
                        }
                        parcel2.writeNoException();
                        return true;
                    }
                    String readString3 = parcel.readString();
                    c6.i iVar2 = (c6.i) com.google.android.gms.internal.cast.v.a(parcel, c6.i.CREATOR);
                    com.google.android.gms.internal.cast.v.b(parcel);
                    e0 e0Var2 = cVar4.f8180i;
                    if (e0Var2 != null && e0Var2.F == 2) {
                        com.google.android.gms.common.api.internal.v e11 = com.google.android.gms.common.api.internal.w.e();
                        e11.f6694c = new aa.a(7, e0Var2, iVar2, readString3);
                        e11.f6692a = 8406;
                        e0Var2.e(1, e11.a()).addOnCompleteListener(new a4.l(this, 12));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.cast.v.b(parcel);
                e0 e0Var3 = cVar4.f8180i;
                if (e0Var3 != null && e0Var3.F == 2) {
                    com.google.android.gms.common.api.internal.v e12 = com.google.android.gms.common.api.internal.w.e();
                    e12.f6694c = new c6.b0(e0Var3, readString4, readString5, 0);
                    e12.f6692a = 8407;
                    e0Var3.e(1, e12.a()).addOnCompleteListener(new a6.m(this, 14));
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
        this.f8194c = cVar;
    }

    public j(f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 1);
        this.f8194c = fVar;
    }

    public j(f6.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 1);
        this.f8194c = bVar;
    }

    public j(c80 c80Var) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 1);
        this.f8194c = c80Var;
    }
}
