package g6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
public final class j extends a8.q {
    public final int f13563b = 2;
    public final Object f13564c;

    public j(com.google.android.gms.internal.cast.e eVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 1);
        this.f13564c = eVar;
    }

    @Override
    public final boolean k1(int i7, Parcel parcel, Parcel parcel2) {
        int i10;
        long g10;
        Object[] objArr;
        String str;
        CastDevice castDevice;
        CastDevice castDevice2;
        int i11 = this.f13563b;
        Object obj = this.f13564c;
        switch (i11) {
            case 0:
                v0.j jVar = (v0.j) obj;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            return false;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    }
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    jVar.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    return true;
                }
                a7.b bVar = new a7.b(jVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.t.d(parcel2, bVar);
                return true;
            case 1:
                f fVar = (f) obj;
                switch (i7) {
                    case 1:
                        a7.b bVar2 = new a7.b(fVar);
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
                        int i12 = com.google.android.gms.internal.cast.t.f6989a;
                        if (parcel.readInt() != 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        com.google.android.gms.internal.cast.t.b(parcel);
                        c cVar = (c) fVar;
                        q qVar = cVar.f13545e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel p12 = oVar.p1();
                                p12.writeInt(i10);
                                p12.writeInt(0);
                                oVar.t1(p12, 6);
                            } catch (RemoteException e10) {
                                c.f13543m.a(e10, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        c cVar2 = (c) fVar;
                        q6.m.d("Must be called from the main thread.");
                        h6.h hVar = cVar2.f13549j;
                        if (hVar == null) {
                            g10 = 0;
                        } else {
                            g10 = hVar.g() - cVar2.f13549j.a();
                        }
                        parcel2.writeNoException();
                        parcel2.writeLong(g10);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 7:
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) fVar).f13550k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) fVar).f13550k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        com.google.android.gms.internal.cast.t.b(parcel);
                        c cVar3 = (c) fVar;
                        CastDevice b10 = CastDevice.b((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
                        if (b10 != null) {
                            String str2 = b10.d;
                            if (!b10.equals(cVar3.f13550k)) {
                                if (!TextUtils.isEmpty(str2) && ((castDevice2 = cVar3.f13550k) == null || !TextUtils.equals(castDevice2.d, str2))) {
                                    objArr = 1;
                                } else {
                                    objArr = null;
                                }
                                cVar3.f13550k = b10;
                                j6.b bVar3 = c.f13543m;
                                if (1 != objArr) {
                                    str = "unchanged";
                                } else {
                                    str = "changed";
                                }
                                bVar3.b("update to device (%s) with name %s", b10, str);
                                if (objArr != null && (castDevice = cVar3.f13550k) != null) {
                                    i6.h hVar2 = cVar3.h;
                                    if (hVar2 != null) {
                                        j6.b bVar4 = i6.h.v;
                                        Log.i(bVar4.f16508a, bVar4.d("update Cast device to %s", castDevice));
                                        hVar2.f15390o = castDevice;
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
                b bVar5 = eVar.d;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                return false;
                            }
                            parcel2.writeNoException();
                            parcel2.writeInt(12451000);
                            return true;
                        }
                        String str3 = eVar.f6839b;
                        parcel2.writeNoException();
                        parcel2.writeString(str3);
                        return true;
                    }
                    boolean z9 = bVar5.f13534e;
                    parcel2.writeNoException();
                    int i13 = com.google.android.gms.internal.cast.t.f6989a;
                    parcel2.writeInt(z9 ? 1 : 0);
                    return true;
                }
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                a7.a f10 = new c(eVar.f6838a, eVar.f6839b, readString, eVar.d, eVar.f6841e, new i6.h(eVar.f6838a, bVar5, eVar.f6841e)).f();
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.t.d(parcel2, f10);
                return true;
            case 3:
                c cVar4 = (c) obj;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
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
                        f6.e0 e0Var = cVar4.f13548i;
                        if (e0Var != null && e0Var.G == 2) {
                            com.google.android.gms.common.api.internal.s b11 = com.google.android.gms.common.api.internal.t.b();
                            b11.f6680c = new q4.q(e0Var, readString2, false, 22);
                            b11.f6678a = 8409;
                            e0Var.e(1, b11.a());
                        }
                        parcel2.writeNoException();
                        return true;
                    }
                    String readString3 = parcel.readString();
                    f6.i iVar = (f6.i) com.google.android.gms.internal.cast.t.a(parcel, f6.i.CREATOR);
                    com.google.android.gms.internal.cast.t.b(parcel);
                    f6.e0 e0Var2 = cVar4.f13548i;
                    if (e0Var2 != null && e0Var2.G == 2) {
                        com.google.android.gms.common.api.internal.s b12 = com.google.android.gms.common.api.internal.t.b();
                        b12.f6680c = new android.support.v4.media.session.a0(e0Var2, readString3, iVar, false, 23);
                        b12.f6678a = 8406;
                        e0Var2.e(1, b12.a()).addOnCompleteListener(new aa.n(this, 26));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                f6.e0 e0Var3 = cVar4.f13548i;
                if (e0Var3 != null && e0Var3.G == 2) {
                    com.google.android.gms.common.api.internal.s b13 = com.google.android.gms.common.api.internal.t.b();
                    b13.f6680c = new f6.b0(e0Var3, readString4, readString5, 0);
                    b13.f6678a = 8407;
                    e0Var3.e(1, b13.a()).addOnCompleteListener(new d0(this, 0));
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i7 != 1) {
                    if (i7 != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                com.google.android.gms.internal.cast.t.b(parcel);
                i6.b.a((i6.b) obj, new Long[]{Long.valueOf(readLong), Long.valueOf(readLong2)});
                parcel2.writeNoException();
                return true;
        }
    }

    public j(c cVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 1);
        this.f13564c = cVar;
    }

    public j(f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 1);
        this.f13564c = fVar;
    }

    public j(i6.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 1);
        this.f13564c = bVar;
    }

    public j(v0.j jVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 1);
        this.f13564c = jVar;
    }
}
