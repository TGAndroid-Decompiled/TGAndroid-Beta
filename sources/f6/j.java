package f6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
public final class j extends com.google.android.gms.internal.cast.o {
    public final int f11486b = 2;
    public final Object f11487c;

    public j(com.google.android.gms.internal.cast.e eVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 0);
        this.f11487c = eVar;
    }

    @Override
    public final boolean K0(int i3, Parcel parcel, Parcel parcel2) {
        int i10;
        long g7;
        Object[] objArr;
        String str;
        CastDevice castDevice;
        CastDevice castDevice2;
        int i11 = this.f11486b;
        Object obj = this.f11487c;
        switch (i11) {
            case 0:
                s0.b bVar = (s0.b) obj;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            return false;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    }
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    bVar.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    return true;
                }
                z6.b bVar2 = new z6.b(bVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.u.d(parcel2, bVar2);
                return true;
            case 1:
                f fVar = (f) obj;
                switch (i3) {
                    case 1:
                        z6.b bVar3 = new z6.b(fVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.u.d(parcel2, bVar3);
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
                        int i12 = com.google.android.gms.internal.cast.u.f7057a;
                        if (parcel.readInt() != 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        com.google.android.gms.internal.cast.u.b(parcel);
                        c cVar = (c) fVar;
                        q qVar = cVar.f11469e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel P0 = oVar.P0();
                                P0.writeInt(i10);
                                P0.writeInt(0);
                                oVar.T0(P0, 6);
                            } catch (RemoteException e10) {
                                c.f11467m.a(e10, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        c cVar2 = (c) fVar;
                        p6.m.d("Must be called from the main thread.");
                        g6.h hVar = cVar2.f11473j;
                        if (hVar == null) {
                            g7 = 0;
                        } else {
                            g7 = hVar.g() - cVar2.f11473j.a();
                        }
                        parcel2.writeNoException();
                        parcel2.writeLong(g7);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 7:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).f11474k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).f11474k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        c cVar3 = (c) fVar;
                        CastDevice b10 = CastDevice.b((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        if (b10 != null) {
                            String str2 = b10.d;
                            if (!b10.equals(cVar3.f11474k)) {
                                if (!TextUtils.isEmpty(str2) && ((castDevice2 = cVar3.f11474k) == null || !TextUtils.equals(castDevice2.d, str2))) {
                                    objArr = 1;
                                } else {
                                    objArr = null;
                                }
                                cVar3.f11474k = b10;
                                i6.b bVar4 = c.f11467m;
                                if (1 != objArr) {
                                    str = "unchanged";
                                } else {
                                    str = "changed";
                                }
                                bVar4.b("update to device (%s) with name %s", b10, str);
                                if (objArr != null && (castDevice = cVar3.f11474k) != null) {
                                    h6.h hVar2 = cVar3.h;
                                    if (hVar2 != null) {
                                        i6.b bVar5 = h6.h.v;
                                        Log.i(bVar5.f14620a, bVar5.d("update Cast device to %s", castDevice));
                                        hVar2.f14344o = castDevice;
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
                com.google.android.gms.internal.cast.e eVar = (com.google.android.gms.internal.cast.e) obj;
                b bVar6 = eVar.d;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                return false;
                            }
                            parcel2.writeNoException();
                            parcel2.writeInt(12451000);
                            return true;
                        }
                        String str3 = eVar.f6904b;
                        parcel2.writeNoException();
                        parcel2.writeString(str3);
                        return true;
                    }
                    boolean z10 = bVar6.f11458e;
                    parcel2.writeNoException();
                    int i13 = com.google.android.gms.internal.cast.u.f7057a;
                    parcel2.writeInt(z10 ? 1 : 0);
                    return true;
                }
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                z6.a f10 = new c(eVar.f6903a, eVar.f6904b, readString, eVar.d, eVar.f6906e, new h6.h(eVar.f6903a, bVar6, eVar.f6906e)).f();
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.u.d(parcel2, f10);
                return true;
            case 3:
                c cVar4 = (c) obj;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 != 5) {
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
                        e6.e0 e0Var = cVar4.f11472i;
                        if (e0Var != null && e0Var.G == 2) {
                            com.google.android.gms.common.api.internal.s b11 = com.google.android.gms.common.api.internal.t.b();
                            b11.f6737c = new tf.b(e0Var, readString2);
                            b11.f6735a = 8409;
                            e0Var.e(1, b11.a());
                        }
                        parcel2.writeNoException();
                        return true;
                    }
                    String readString3 = parcel.readString();
                    e6.i iVar = (e6.i) com.google.android.gms.internal.cast.u.a(parcel, e6.i.CREATOR);
                    com.google.android.gms.internal.cast.u.b(parcel);
                    e6.e0 e0Var2 = cVar4.f11472i;
                    if (e0Var2 != null && e0Var2.G == 2) {
                        com.google.android.gms.common.api.internal.s b12 = com.google.android.gms.common.api.internal.t.b();
                        b12.f6737c = new android.support.v4.media.session.a0(e0Var2, readString3, iVar, 16);
                        b12.f6735a = 8406;
                        e0Var2.e(1, b12.a()).addOnCompleteListener(new c6.i(this, 23));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                e6.e0 e0Var3 = cVar4.f11472i;
                if (e0Var3 != null && e0Var3.G == 2) {
                    com.google.android.gms.common.api.internal.s b13 = com.google.android.gms.common.api.internal.t.b();
                    b13.f6737c = new e6.b0(e0Var3, readString4, readString5, 0);
                    b13.f6735a = 8407;
                    e0Var3.e(1, b13.a()).addOnCompleteListener(new android.support.v4.media.c(this, 23));
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i3 != 1) {
                    if (i3 != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                com.google.android.gms.internal.cast.u.b(parcel);
                h6.b.a((h6.b) obj, new Long[]{Long.valueOf(readLong), Long.valueOf(readLong2)});
                parcel2.writeNoException();
                return true;
        }
    }

    public j(c cVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 0);
        this.f11487c = cVar;
    }

    public j(f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 0);
        this.f11487c = fVar;
    }

    public j(h6.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 0);
        this.f11487c = bVar;
    }

    public j(s0.b bVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 0);
        this.f11487c = bVar;
    }
}
