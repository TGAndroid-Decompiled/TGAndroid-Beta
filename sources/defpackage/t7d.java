package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
public final class t7d extends e1d {
    public final byte b = 0;
    public final Object c;

    public t7d(a32 a32Var) {
        super("com.google.android.gms.cast.framework.ICastStateListener", (byte) 4);
        this.c = a32Var;
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
                a32 a32Var = (a32) obj;
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
                    kid.b(parcel);
                    a32Var.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    return true;
                }
                eq7 eq7Var = new eq7(a32Var);
                parcel2.writeNoException();
                kid.d(parcel2, eq7Var);
                return true;
            case 1:
                f7a f7aVar = (f7a) obj;
                switch (i) {
                    case 1:
                        eq7 eq7Var2 = new eq7(f7aVar);
                        parcel2.writeNoException();
                        kid.d(parcel2, eq7Var2);
                        return true;
                    case 2:
                        kid.b(parcel);
                        ((me1) f7aVar).i((Bundle) kid.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        kid.b(parcel);
                        ((me1) f7aVar).i((Bundle) kid.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        int i3 = kid.a;
                        if (parcel.readInt() != 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        kid.b(parcel);
                        me1 me1Var = (me1) f7aVar;
                        had hadVar = me1Var.e;
                        if (hadVar != null) {
                            try {
                                w9d w9dVar = (w9d) hadVar;
                                Parcel R = w9dVar.R();
                                R.writeInt(i2);
                                R.writeInt(0);
                                w9dVar.V(R, 6);
                            } catch (RemoteException e) {
                                me1.m.a(e, "Unable to call %s on %s.", "disconnectFromDevice", had.class.getSimpleName());
                            }
                            me1Var.d(0);
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        me1 me1Var2 = (me1) f7aVar;
                        ite.e("Must be called from the main thread.");
                        k89 k89Var = me1Var2.j;
                        if (k89Var == null) {
                            g = 0;
                        } else {
                            g = k89Var.g() - me1Var2.j.a();
                        }
                        parcel2.writeNoException();
                        parcel2.writeLong(g);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 7:
                        kid.b(parcel);
                        ((me1) f7aVar).k = CastDevice.b((Bundle) kid.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        kid.b(parcel);
                        ((me1) f7aVar).k = CastDevice.b((Bundle) kid.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        kid.b(parcel);
                        me1 me1Var3 = (me1) f7aVar;
                        CastDevice b2 = CastDevice.b((Bundle) kid.a(parcel, Bundle.CREATOR));
                        if (b2 != null) {
                            String str2 = b2.d;
                            if (!b2.equals(me1Var3.k)) {
                                if (!TextUtils.isEmpty(str2) && ((castDevice2 = me1Var3.k) == null || !TextUtils.equals(castDevice2.d, str2))) {
                                    objArr = 1;
                                } else {
                                    objArr = null;
                                }
                                me1Var3.k = b2;
                                ce6 ce6Var = me1.m;
                                if (1 != objArr) {
                                    str = "unchanged";
                                } else {
                                    str = "changed";
                                }
                                ce6Var.b("update to device (%s) with name %s", b2, str);
                                if (objArr != null && (castDevice = me1Var3.k) != null) {
                                    lif lifVar = me1Var3.h;
                                    if (lifVar != null) {
                                        ce6 ce6Var2 = lif.v;
                                        Log.i(ce6Var2.a, ce6Var2.d("update Cast device to %s", castDevice));
                                        lifVar.o = castDevice;
                                        lifVar.b();
                                    }
                                    Iterator it = new HashSet(me1Var3.d).iterator();
                                    while (it.hasNext()) {
                                        ((vjf) it.next()).getClass();
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
                g9d g9dVar = (g9d) obj;
                le1 le1Var = g9dVar.d;
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
                        String str3 = g9dVar.b;
                        parcel2.writeNoException();
                        parcel2.writeString(str3);
                        return true;
                    }
                    boolean z = le1Var.e;
                    parcel2.writeNoException();
                    int i4 = kid.a;
                    parcel2.writeInt(z ? 1 : 0);
                    return true;
                }
                String readString = parcel.readString();
                kid.b(parcel);
                xk5 f = new me1(g9dVar.a, g9dVar.b, readString, g9dVar.d, g9dVar.e, new lif(g9dVar.a, le1Var, g9dVar.e)).f();
                parcel2.writeNoException();
                kid.d(parcel2, f);
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
                kid.b(parcel);
                b1e.a((b1e) obj, new Long[]{Long.valueOf(readLong), Long.valueOf(readLong2)});
                parcel2.writeNoException();
                return true;
            default:
                me1 me1Var4 = (me1) obj;
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
                            kid.b(parcel);
                            me1.g(me1Var4, readInt2);
                            parcel2.writeNoException();
                            return true;
                        }
                        String readString2 = parcel.readString();
                        kid.b(parcel);
                        bhd bhdVar = me1Var4.i;
                        if (bhdVar != null && bhdVar.G == 2) {
                            bib b3 = cib.b();
                            b3.a = new rhb(bhdVar, readString2, false, (byte) 14);
                            b3.d = (char) 8409;
                            bhdVar.e(1, b3.a());
                        }
                        parcel2.writeNoException();
                        return true;
                    }
                    String readString3 = parcel.readString();
                    b26 b26Var = (b26) kid.a(parcel, b26.CREATOR);
                    kid.b(parcel);
                    bhd bhdVar2 = me1Var4.i;
                    if (bhdVar2 != null && bhdVar2.G == 2) {
                        bib b4 = cib.b();
                        b4.a = new wm9(bhdVar2, readString3, b26Var, (byte) 21);
                        b4.d = (char) 8406;
                        bhdVar2.e(1, b4.a()).addOnCompleteListener(new und(this));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                kid.b(parcel);
                bhd bhdVar3 = me1Var4.i;
                if (bhdVar3 != null && bhdVar3.G == 2) {
                    bib b5 = cib.b();
                    b5.a = new hed(bhdVar3, readString4, readString5, (byte) 0);
                    b5.d = (char) 8407;
                    bhdVar3.e(1, b5.a()).addOnCompleteListener(new fkd(this, (byte) 8));
                }
                parcel2.writeNoException();
                return true;
        }
    }

    public t7d(me1 me1Var) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", (byte) 4);
        this.c = me1Var;
    }

    public t7d(f7a f7aVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", (byte) 4);
        this.c = f7aVar;
    }

    public t7d(g9d g9dVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", (byte) 4);
        this.c = g9dVar;
    }

    public t7d(b1e b1eVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", (byte) 4);
        this.c = b1eVar;
    }
}
