package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
public final class r5d extends dzc {
    public final byte b = 1;
    public final Object c;

    public r5d(k32 k32Var) {
        super("com.google.android.gms.cast.framework.ICastStateListener", (byte) 4);
        this.c = k32Var;
    }

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        int i2;
        long g;
        Object[] objArr;
        String str;
        CastDevice castDevice;
        CastDevice castDevice2;
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                k32 k32Var = (k32) obj;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return false;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    }
                    int readInt = parcel.readInt();
                    jgd.b(parcel);
                    k32Var.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    return true;
                }
                bo7 bo7Var = new bo7(k32Var);
                parcel2.writeNoException();
                jgd.d(parcel2, bo7Var);
                return true;
            case 1:
                d5a d5aVar = (d5a) obj;
                switch (i) {
                    case 1:
                        bo7 bo7Var2 = new bo7(d5aVar);
                        parcel2.writeNoException();
                        jgd.d(parcel2, bo7Var2);
                        return true;
                    case 2:
                        jgd.b(parcel);
                        ((ed1) d5aVar).i((Bundle) jgd.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        jgd.b(parcel);
                        ((ed1) d5aVar).i((Bundle) jgd.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        int i3 = jgd.a;
                        if (parcel.readInt() != 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        jgd.b(parcel);
                        ed1 ed1Var = (ed1) d5aVar;
                        f8d f8dVar = ed1Var.e;
                        if (f8dVar != null) {
                            try {
                                u7d u7dVar = (u7d) f8dVar;
                                Parcel R = u7dVar.R();
                                R.writeInt(i2);
                                R.writeInt(0);
                                u7dVar.V(R, 6);
                            } catch (RemoteException e) {
                                ed1.m.a(e, "Unable to call %s on %s.", "disconnectFromDevice", f8d.class.getSimpleName());
                            }
                            ed1Var.d(0);
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        ed1 ed1Var2 = (ed1) d5aVar;
                        fre.e("Must be called from the main thread.");
                        i69 i69Var = ed1Var2.j;
                        if (i69Var == null) {
                            g = 0;
                        } else {
                            g = i69Var.g() - ed1Var2.j.a();
                        }
                        parcel2.writeNoException();
                        parcel2.writeLong(g);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 7:
                        jgd.b(parcel);
                        ((ed1) d5aVar).k = CastDevice.b((Bundle) jgd.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        jgd.b(parcel);
                        ((ed1) d5aVar).k = CastDevice.b((Bundle) jgd.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        jgd.b(parcel);
                        ed1 ed1Var3 = (ed1) d5aVar;
                        CastDevice b2 = CastDevice.b((Bundle) jgd.a(parcel, Bundle.CREATOR));
                        if (b2 != null) {
                            String str2 = b2.d;
                            if (!b2.equals(ed1Var3.k)) {
                                if (!TextUtils.isEmpty(str2) && ((castDevice2 = ed1Var3.k) == null || !TextUtils.equals(castDevice2.d, str2))) {
                                    objArr = 1;
                                } else {
                                    objArr = null;
                                }
                                ed1Var3.k = b2;
                                dc6 dc6Var = ed1.m;
                                if (1 != objArr) {
                                    str = "unchanged";
                                } else {
                                    str = "changed";
                                }
                                dc6Var.b("update to device (%s) with name %s", b2, str);
                                if (objArr != null && (castDevice = ed1Var3.k) != null) {
                                    kgf kgfVar = ed1Var3.h;
                                    if (kgfVar != null) {
                                        dc6 dc6Var2 = kgf.v;
                                        Log.i(dc6Var2.a, dc6Var2.d("update Cast device to %s", castDevice));
                                        kgfVar.o = castDevice;
                                        kgfVar.b();
                                    }
                                    Iterator it = new HashSet(ed1Var3.d).iterator();
                                    while (it.hasNext()) {
                                        ((uhf) it.next()).getClass();
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
                e7d e7dVar = (e7d) obj;
                dd1 dd1Var = e7dVar.d;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return false;
                            }
                            parcel2.writeNoException();
                            parcel2.writeInt(12451000);
                            return true;
                        }
                        String str3 = e7dVar.b;
                        parcel2.writeNoException();
                        parcel2.writeString(str3);
                        return true;
                    }
                    boolean z = dd1Var.e;
                    parcel2.writeNoException();
                    int i4 = jgd.a;
                    parcel2.writeInt(z ? 1 : 0);
                    return true;
                }
                String readString = parcel.readString();
                jgd.b(parcel);
                yi5 f = new ed1(e7dVar.a, e7dVar.b, readString, e7dVar.d, e7dVar.e, new kgf(e7dVar.a, dd1Var, e7dVar.e)).f();
                parcel2.writeNoException();
                jgd.d(parcel2, f);
                return true;
            case 3:
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                jgd.b(parcel);
                yyd.a((yyd) obj, new Long[]{Long.valueOf(readLong), Long.valueOf(readLong2)});
                parcel2.writeNoException();
                return true;
            default:
                ed1 ed1Var4 = (ed1) obj;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    return false;
                                }
                                parcel2.writeNoException();
                                parcel2.writeInt(12451000);
                                return true;
                            }
                            int readInt2 = parcel.readInt();
                            jgd.b(parcel);
                            ed1.g(ed1Var4, readInt2);
                            parcel2.writeNoException();
                            return true;
                        }
                        String readString2 = parcel.readString();
                        jgd.b(parcel);
                        afd afdVar = ed1Var4.i;
                        if (afdVar != null && afdVar.G == 2) {
                            agb b3 = bgb.b();
                            b3.a = new aec(afdVar, readString2, false, (byte) 12);
                            b3.d = (char) 8409;
                            afdVar.e(1, b3.a());
                        }
                        parcel2.writeNoException();
                        return true;
                    }
                    String readString3 = parcel.readString();
                    b06 b06Var = (b06) jgd.a(parcel, b06.CREATOR);
                    jgd.b(parcel);
                    afd afdVar2 = ed1Var4.i;
                    if (afdVar2 != null && afdVar2.G == 2) {
                        agb b4 = bgb.b();
                        b4.a = new vk9(afdVar2, readString3, b06Var, (byte) 21);
                        b4.d = (char) 8406;
                        afdVar2.e(1, b4.a()).addOnCompleteListener(new sld(this));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                jgd.b(parcel);
                afd afdVar3 = ed1Var4.i;
                if (afdVar3 != null && afdVar3.G == 2) {
                    agb b5 = bgb.b();
                    b5.a = new fcd(afdVar3, readString4, readString5, (byte) 0);
                    b5.d = (char) 8407;
                    afdVar3.e(1, b5.a()).addOnCompleteListener(new e6e(this, (byte) 5));
                }
                parcel2.writeNoException();
                return true;
        }
    }

    public r5d(ed1 ed1Var) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", (byte) 4);
        this.c = ed1Var;
    }

    public r5d(d5a d5aVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", (byte) 4);
        this.c = d5aVar;
    }

    public r5d(e7d e7dVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", (byte) 4);
        this.c = e7dVar;
    }

    public r5d(yyd yydVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", (byte) 4);
        this.c = yydVar;
    }
}
