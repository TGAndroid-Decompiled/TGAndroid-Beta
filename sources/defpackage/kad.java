package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
public final class kad extends u3d {
    public final byte b = 0;
    public final Object c;

    public kad(c22 c22Var) {
        super("com.google.android.gms.cast.framework.ICastStateListener", (byte) 4);
        this.c = c22Var;
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
                c22 c22Var = (c22) obj;
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
                    ald.b(parcel);
                    c22Var.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    return true;
                }
                br7 br7Var = new br7(c22Var);
                parcel2.writeNoException();
                ald.d(parcel2, br7Var);
                return true;
            case 1:
                v8a v8aVar = (v8a) obj;
                switch (i) {
                    case 1:
                        br7 br7Var2 = new br7(v8aVar);
                        parcel2.writeNoException();
                        ald.d(parcel2, br7Var2);
                        return true;
                    case 2:
                        ald.b(parcel);
                        ((md1) v8aVar).i((Bundle) ald.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        ald.b(parcel);
                        ((md1) v8aVar).i((Bundle) ald.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        int i3 = ald.a;
                        if (parcel.readInt() != 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        ald.b(parcel);
                        md1 md1Var = (md1) v8aVar;
                        ycd ycdVar = md1Var.e;
                        if (ycdVar != null) {
                            try {
                                ncd ncdVar = (ncd) ycdVar;
                                Parcel R = ncdVar.R();
                                R.writeInt(i2);
                                R.writeInt(0);
                                ncdVar.V(R, 6);
                            } catch (RemoteException e) {
                                md1.m.a(e, "Unable to call %s on %s.", "disconnectFromDevice", ycd.class.getSimpleName());
                            }
                            md1Var.d(0);
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        md1 md1Var2 = (md1) v8aVar;
                        xve.e("Must be called from the main thread.");
                        v99 v99Var = md1Var2.j;
                        if (v99Var == null) {
                            g = 0;
                        } else {
                            g = v99Var.g() - md1Var2.j.a();
                        }
                        parcel2.writeNoException();
                        parcel2.writeLong(g);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 7:
                        ald.b(parcel);
                        ((md1) v8aVar).k = CastDevice.b((Bundle) ald.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        ald.b(parcel);
                        ((md1) v8aVar).k = CastDevice.b((Bundle) ald.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        ald.b(parcel);
                        md1 md1Var3 = (md1) v8aVar;
                        CastDevice b2 = CastDevice.b((Bundle) ald.a(parcel, Bundle.CREATOR));
                        if (b2 != null) {
                            String str2 = b2.d;
                            if (!b2.equals(md1Var3.k)) {
                                if (!TextUtils.isEmpty(str2) && ((castDevice2 = md1Var3.k) == null || !TextUtils.equals(castDevice2.d, str2))) {
                                    objArr = 1;
                                } else {
                                    objArr = null;
                                }
                                md1Var3.k = b2;
                                he6 he6Var = md1.m;
                                if (1 != objArr) {
                                    str = "unchanged";
                                } else {
                                    str = "changed";
                                }
                                he6Var.b("update to device (%s) with name %s", b2, str);
                                if (objArr != null && (castDevice = md1Var3.k) != null) {
                                    alf alfVar = md1Var3.h;
                                    if (alfVar != null) {
                                        he6 he6Var2 = alf.v;
                                        Log.i(he6Var2.a, he6Var2.d("update Cast device to %s", castDevice));
                                        alfVar.o = castDevice;
                                        alfVar.b();
                                    }
                                    Iterator it = new HashSet(md1Var3.d).iterator();
                                    while (it.hasNext()) {
                                        ((kmf) it.next()).getClass();
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
                xbd xbdVar = (xbd) obj;
                ld1 ld1Var = xbdVar.d;
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
                        String str3 = xbdVar.b;
                        parcel2.writeNoException();
                        parcel2.writeString(str3);
                        return true;
                    }
                    boolean z = ld1Var.e;
                    parcel2.writeNoException();
                    int i4 = ald.a;
                    parcel2.writeInt(z ? 1 : 0);
                    return true;
                }
                String readString = parcel.readString();
                ald.b(parcel);
                al5 f = new md1(xbdVar.a, xbdVar.b, readString, xbdVar.d, xbdVar.e, new alf(xbdVar.a, ld1Var, xbdVar.e)).f();
                parcel2.writeNoException();
                ald.d(parcel2, f);
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
                ald.b(parcel);
                o3e.a((o3e) obj, new Long[]{Long.valueOf(readLong), Long.valueOf(readLong2)});
                parcel2.writeNoException();
                return true;
            default:
                md1 md1Var4 = (md1) obj;
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
                            ald.b(parcel);
                            md1.g(md1Var4, readInt2);
                            parcel2.writeNoException();
                            return true;
                        }
                        String readString2 = parcel.readString();
                        ald.b(parcel);
                        rjd rjdVar = md1Var4.i;
                        if (rjdVar != null && rjdVar.G == 2) {
                            wjb b3 = xjb.b();
                            b3.a = new zhc(rjdVar, readString2, false, (byte) 12);
                            b3.d = (char) 8409;
                            rjdVar.e(1, b3.a());
                        }
                        parcel2.writeNoException();
                        return true;
                    }
                    String readString3 = parcel.readString();
                    f26 f26Var = (f26) ald.a(parcel, f26.CREATOR);
                    ald.b(parcel);
                    rjd rjdVar2 = md1Var4.i;
                    if (rjdVar2 != null && rjdVar2.G == 2) {
                        wjb b4 = xjb.b();
                        b4.a = new ko9(rjdVar2, readString3, f26Var, (byte) 21);
                        b4.d = (char) 8406;
                        rjdVar2.e(1, b4.a()).addOnCompleteListener(new xae(this));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                ald.b(parcel);
                rjd rjdVar3 = md1Var4.i;
                if (rjdVar3 != null && rjdVar3.G == 2) {
                    wjb b5 = xjb.b();
                    b5.a = new ygd(rjdVar3, readString4, readString5, (byte) 0);
                    b5.d = (char) 8407;
                    rjdVar3.e(1, b5.a()).addOnCompleteListener(new uae(this, (byte) 5));
                }
                parcel2.writeNoException();
                return true;
        }
    }

    public kad(md1 md1Var) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", (byte) 4);
        this.c = md1Var;
    }

    public kad(v8a v8aVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", (byte) 4);
        this.c = v8aVar;
    }

    public kad(xbd xbdVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", (byte) 4);
        this.c = xbdVar;
    }

    public kad(o3e o3eVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", (byte) 4);
        this.c = o3eVar;
    }
}
