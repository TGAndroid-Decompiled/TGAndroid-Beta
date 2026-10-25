package e6;

import a8.h0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import d6.e0;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.ji1;
public final class j extends c8.b {
    public final int f9820b = 2;
    public final Object f9821c;

    public j(com.google.android.gms.internal.cast.e eVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 1);
        this.f9821c = eVar;
    }

    @Override
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        int i11;
        long g7;
        Object[] objArr;
        String str;
        CastDevice castDevice;
        CastDevice castDevice2;
        int i12 = this.f9820b;
        Object obj = this.f9821c;
        switch (i12) {
            case 0:
                ji1 ji1Var = (ji1) obj;
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
                    com.google.android.gms.internal.cast.t.b(parcel);
                    ji1Var.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    return true;
                }
                y6.b bVar = new y6.b(ji1Var);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.t.d(parcel2, bVar);
                return true;
            case 1:
                f fVar = (f) obj;
                switch (i10) {
                    case 1:
                        y6.b bVar2 = new y6.b(fVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.t.d(parcel2, bVar2);
                        return true;
                    case 2:
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) fVar).i((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) fVar).i((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        int i13 = com.google.android.gms.internal.cast.t.f6896a;
                        if (parcel.readInt() != 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        com.google.android.gms.internal.cast.t.b(parcel);
                        c cVar = (c) fVar;
                        q qVar = cVar.e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel N0 = oVar.N0();
                                N0.writeInt(i11);
                                N0.writeInt(0);
                                oVar.R0(N0, 6);
                            } catch (RemoteException e) {
                                c.f9803m.a(e, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        c cVar2 = (c) fVar;
                        o6.l.e("Must be called from the main thread.");
                        f6.h hVar = cVar2.f9808j;
                        if (hVar == null) {
                            g7 = 0;
                        } else {
                            g7 = hVar.g() - cVar2.f9808j.a();
                        }
                        parcel2.writeNoException();
                        parcel2.writeLong(g7);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 7:
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) fVar).f9809k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) fVar).f9809k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        com.google.android.gms.internal.cast.t.b(parcel);
                        c cVar3 = (c) fVar;
                        CastDevice b10 = CastDevice.b((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
                        if (b10 != null) {
                            String str2 = b10.d;
                            if (!b10.equals(cVar3.f9809k)) {
                                if (!TextUtils.isEmpty(str2) && ((castDevice2 = cVar3.f9809k) == null || !TextUtils.equals(castDevice2.d, str2))) {
                                    objArr = 1;
                                } else {
                                    objArr = null;
                                }
                                cVar3.f9809k = b10;
                                h6.b bVar3 = c.f9803m;
                                if (1 != objArr) {
                                    str = "unchanged";
                                } else {
                                    str = "changed";
                                }
                                bVar3.b("update to device (%s) with name %s", b10, str);
                                if (objArr != null && (castDevice = cVar3.f9809k) != null) {
                                    g6.h hVar2 = cVar3.h;
                                    if (hVar2 != null) {
                                        h6.b bVar4 = g6.h.v;
                                        Log.i(bVar4.f12621a, bVar4.d("update Cast device to %s", castDevice));
                                        hVar2.f12388o = castDevice;
                                        hVar2.b();
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
                        String str3 = eVar.f6770b;
                        parcel2.writeNoException();
                        parcel2.writeString(str3);
                        return true;
                    }
                    boolean z10 = bVar5.e;
                    parcel2.writeNoException();
                    int i14 = com.google.android.gms.internal.cast.t.f6896a;
                    parcel2.writeInt(z10 ? 1 : 0);
                    return true;
                }
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                y6.a f7 = new c(eVar.f6769a, eVar.f6770b, readString, eVar.d, eVar.e, new g6.h(eVar.f6769a, bVar5, eVar.e)).f();
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.t.d(parcel2, f7);
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
                            com.google.android.gms.internal.cast.t.b(parcel);
                            c.g(cVar4, readInt2);
                            parcel2.writeNoException();
                            return true;
                        }
                        String readString2 = parcel.readString();
                        com.google.android.gms.internal.cast.t.b(parcel);
                        e0 e0Var = cVar4.f9807i;
                        if (e0Var != null && e0Var.F == 2) {
                            com.google.android.gms.common.api.internal.u b11 = com.google.android.gms.common.api.internal.v.b();
                            b11.f6622c = new rf.b(15, e0Var, readString2);
                            b11.f6620a = 8409;
                            e0Var.e(1, b11.a());
                        }
                        parcel2.writeNoException();
                        return true;
                    }
                    String readString3 = parcel.readString();
                    d6.i iVar = (d6.i) com.google.android.gms.internal.cast.t.a(parcel, d6.i.CREATOR);
                    com.google.android.gms.internal.cast.t.b(parcel);
                    e0 e0Var2 = cVar4.f9807i;
                    if (e0Var2 != null && e0Var2.F == 2) {
                        com.google.android.gms.common.api.internal.u b12 = com.google.android.gms.common.api.internal.v.b();
                        b12.f6622c = new h0(e0Var2, readString3, iVar, 13);
                        b12.f6620a = 8406;
                        e0Var2.e(1, b12.a()).addOnCompleteListener(new rb.c(this, 18));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                e0 e0Var3 = cVar4.f9807i;
                if (e0Var3 != null && e0Var3.F == 2) {
                    com.google.android.gms.common.api.internal.u b13 = com.google.android.gms.common.api.internal.v.b();
                    b13.f6622c = new d6.b0(e0Var3, readString4, readString5, 0);
                    b13.f6620a = 8407;
                    e0Var3.e(1, b13.a()).addOnCompleteListener(new za.c(this, 17));
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
                com.google.android.gms.internal.cast.t.b(parcel);
                g6.b.a((g6.b) obj, new Long[]{Long.valueOf(readLong), Long.valueOf(readLong2)});
                parcel2.writeNoException();
                return true;
        }
    }

    public j(c cVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 1);
        this.f9821c = cVar;
    }

    public j(f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 1);
        this.f9821c = fVar;
    }

    public j(g6.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 1);
        this.f9821c = bVar;
    }

    public j(ji1 ji1Var) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 1);
        this.f9821c = ji1Var;
    }
}
