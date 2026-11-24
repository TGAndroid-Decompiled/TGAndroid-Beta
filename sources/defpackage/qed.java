package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public final class qed extends e1d implements IInterface {
    public static final ce6 i = new ce6("MediaRouterProxy", null);
    public final gw6 b;
    public final le1 c;
    public final HashMap d;
    public final zfd e;
    public final boolean f;

    public qed(Context context, gw6 gw6Var, le1 le1Var, ua4 ua4Var) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", (byte) 4);
        this.d = new HashMap();
        this.b = gw6Var;
        this.c = le1Var;
        int i2 = Build.VERSION.SDK_INT;
        ce6 ce6Var = i;
        if (i2 <= 32) {
            Log.i(ce6Var.a, ce6Var.d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        ce6Var.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.e = new zfd(le1Var);
        Intent intent = new Intent(context, g07.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.f = !isEmpty;
        if (!isEmpty) {
            k7f.a(m3f.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        ua4Var.m(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new rhb(this, le1Var, false, (byte) 13));
    }

    public final void T(mx6 mx6Var) {
        in3 in3Var;
        this.b.getClass();
        gw6.b();
        wz4 c = gw6.c();
        c.D = mx6Var;
        if (mx6Var != null) {
            in3Var = new in3(c, mx6Var, (byte) 5);
        } else {
            in3Var = null;
        }
        in3 in3Var2 = c.C;
        if (in3Var2 != null) {
            in3Var2.o();
        }
        c.C = in3Var;
        if (in3Var != null) {
            c.l();
        }
    }

    public final void U(yv6 yv6Var, int i2) {
        Set<zv6> set = (Set) this.d.get(yv6Var);
        if (set != null) {
            for (zv6 zv6Var : set) {
                this.b.a(yv6Var, zv6Var, i2);
            }
        }
    }

    public final void V(yv6 yv6Var) {
        Set<zv6> set = (Set) this.d.get(yv6Var);
        if (set != null) {
            for (zv6 zv6Var : set) {
                this.b.h(zv6Var);
            }
        }
    }

    @Override
    public final boolean d(int i2, Parcel parcel, Parcel parcel2) {
        boolean z;
        mad madVar = null;
        Bundle bundle = null;
        HashMap hashMap = this.d;
        int i3 = 0;
        gw6 gw6Var = this.b;
        switch (i2) {
            case 1:
                Bundle bundle2 = (Bundle) kid.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    if (queryLocalInterface instanceof mad) {
                        madVar = (mad) queryLocalInterface;
                    } else {
                        madVar = new f1d(readStrongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", (byte) 3);
                    }
                }
                kid.b(parcel);
                yv6 b = yv6.b(bundle2);
                if (b != null) {
                    if (!hashMap.containsKey(b)) {
                        hashMap.put(b, new HashSet());
                    }
                    ((Set) hashMap.get(b)).add(new rbd(madVar));
                }
                parcel2.writeNoException();
                return true;
            case 2:
                int readInt = parcel.readInt();
                kid.b(parcel);
                yv6 b2 = yv6.b((Bundle) kid.a(parcel, Bundle.CREATOR));
                if (b2 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        U(b2, readInt);
                    } else {
                        new q79(Looper.getMainLooper(), (byte) 3).post(new jr(this, b2, readInt, (byte) 6));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 3:
                kid.b(parcel);
                yv6 b3 = yv6.b((Bundle) kid.a(parcel, Bundle.CREATOR));
                if (b3 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        V(b3);
                    } else {
                        new q79(Looper.getMainLooper(), (byte) 3).post(new us4(this, b3, (byte) 19));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                kid.b(parcel);
                yv6 b4 = yv6.b((Bundle) kid.a(parcel, Bundle.CREATOR));
                if (b4 != null) {
                    gw6Var.getClass();
                    gw6.b();
                    wz4 c = gw6.c();
                    ArrayList arrayList = c.j;
                    if (!b4.d()) {
                        if ((readInt2 & 2) != 0 || !c.p) {
                            iw6 iw6Var = c.u;
                            if (iw6Var != null && iw6Var.c && c.f()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int size = arrayList.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ew6 ew6Var = (ew6) arrayList.get(i4);
                                if (((readInt2 & 1) != 0 && ew6Var.d()) || ((z && !ew6Var.d() && ew6Var.c() != c.r) || !ew6Var.h(b4))) {
                                }
                            }
                        }
                        i3 = 1;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 5:
                String readString = parcel.readString();
                kid.b(parcel);
                ce6 ce6Var = i;
                ce6Var.b("select route with routeId = %s", readString);
                gw6Var.getClass();
                gw6.b();
                ArrayList arrayList2 = gw6.c().j;
                int size2 = arrayList2.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size2) {
                        Object obj = arrayList2.get(i5);
                        i5++;
                        ew6 ew6Var2 = (ew6) obj;
                        if (ew6Var2.c.equals(readString)) {
                            ce6Var.b("media route is found and selected", new Object[0]);
                            gw6.b();
                            gw6.c().i(ew6Var2, 3);
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                gw6Var.getClass();
                gw6.b();
                ew6 ew6Var3 = gw6.c().v;
                if (ew6Var3 != null) {
                    gw6.b();
                    gw6.c().i(ew6Var3, 3);
                    parcel2.writeNoException();
                    return true;
                }
                dq9.m("There is no default route.  The media router has not yet been fully initialized.");
                return false;
            case 7:
                gw6Var.getClass();
                gw6.b();
                ew6 ew6Var4 = gw6.c().v;
                if (ew6Var4 != null) {
                    boolean equals = gw6.f().c.equals(ew6Var4.c);
                    parcel2.writeNoException();
                    int i6 = kid.a;
                    parcel2.writeInt(equals ? 1 : 0);
                    return true;
                }
                dq9.m("There is no default route.  The media router has not yet been fully initialized.");
                return false;
            case 8:
                String readString2 = parcel.readString();
                kid.b(parcel);
                gw6Var.getClass();
                gw6.b();
                ArrayList arrayList3 = gw6.c().j;
                int size3 = arrayList3.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size3) {
                        Object obj2 = arrayList3.get(i7);
                        i7++;
                        ew6 ew6Var5 = (ew6) obj2;
                        if (ew6Var5.c.equals(readString2)) {
                            bundle = ew6Var5.s;
                        }
                    }
                }
                parcel2.writeNoException();
                if (bundle == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, 1);
                return true;
            case 9:
                gw6Var.getClass();
                String str = gw6.f().c;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 11:
                for (Set<zv6> set : hashMap.values()) {
                    for (zv6 zv6Var : set) {
                        gw6Var.h(zv6Var);
                    }
                }
                hashMap.clear();
                parcel2.writeNoException();
                return true;
            case 12:
                gw6Var.getClass();
                gw6.b();
                ew6 ew6Var6 = gw6.c().w;
                if (ew6Var6 != null && gw6.f().c.equals(ew6Var6.c)) {
                    i3 = 1;
                }
                parcel2.writeNoException();
                int i8 = kid.a;
                parcel2.writeInt(i3);
                return true;
            case 13:
                int readInt3 = parcel.readInt();
                kid.b(parcel);
                gw6Var.getClass();
                gw6.j(readInt3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
