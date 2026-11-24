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
public final class ocd extends dzc implements IInterface {
    public static final dc6 i = new dc6("MediaRouterProxy", null);
    public final gu6 b;
    public final dd1 c;
    public final HashMap d;
    public final ydd e;
    public final boolean f;

    public ocd(Context context, gu6 gu6Var, dd1 dd1Var, u84 u84Var) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", (byte) 4);
        this.d = new HashMap();
        this.b = gu6Var;
        this.c = dd1Var;
        int i2 = Build.VERSION.SDK_INT;
        dc6 dc6Var = i;
        if (i2 <= 32) {
            Log.i(dc6Var.a, dc6Var.d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        dc6Var.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.e = new ydd(dd1Var);
        Intent intent = new Intent(context, gy6.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.f = !isEmpty;
        if (!isEmpty) {
            i5f.a(k1f.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        u84Var.m(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new aec(this, dd1Var, false, (byte) 11));
    }

    public final void T(mv6 mv6Var) {
        xl3 xl3Var;
        this.b.getClass();
        gu6.b();
        ux4 c = gu6.c();
        c.D = mv6Var;
        if (mv6Var != null) {
            xl3Var = new xl3(c, mv6Var, (byte) 5);
        } else {
            xl3Var = null;
        }
        xl3 xl3Var2 = c.C;
        if (xl3Var2 != null) {
            xl3Var2.o();
        }
        c.C = xl3Var;
        if (xl3Var != null) {
            c.l();
        }
    }

    public final void U(yt6 yt6Var, int i2) {
        Set<zt6> set = (Set) this.d.get(yt6Var);
        if (set != null) {
            for (zt6 zt6Var : set) {
                this.b.a(yt6Var, zt6Var, i2);
            }
        }
    }

    public final void V(yt6 yt6Var) {
        Set<zt6> set = (Set) this.d.get(yt6Var);
        if (set != null) {
            for (zt6 zt6Var : set) {
                this.b.h(zt6Var);
            }
        }
    }

    @Override
    public final boolean d(int i2, Parcel parcel, Parcel parcel2) {
        boolean z;
        k8d k8dVar = null;
        Bundle bundle = null;
        HashMap hashMap = this.d;
        int i3 = 0;
        gu6 gu6Var = this.b;
        switch (i2) {
            case 1:
                Bundle bundle2 = (Bundle) jgd.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    if (queryLocalInterface instanceof k8d) {
                        k8dVar = (k8d) queryLocalInterface;
                    } else {
                        k8dVar = new ezc(readStrongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", (byte) 3);
                    }
                }
                jgd.b(parcel);
                yt6 b = yt6.b(bundle2);
                if (b != null) {
                    if (!hashMap.containsKey(b)) {
                        hashMap.put(b, new HashSet());
                    }
                    ((Set) hashMap.get(b)).add(new p9d(k8dVar));
                }
                parcel2.writeNoException();
                return true;
            case 2:
                int readInt = parcel.readInt();
                jgd.b(parcel);
                yt6 b2 = yt6.b((Bundle) jgd.a(parcel, Bundle.CREATOR));
                if (b2 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        U(b2, readInt);
                    } else {
                        new o59(Looper.getMainLooper(), (byte) 3).post(new jq(this, b2, readInt, (byte) 6));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 3:
                jgd.b(parcel);
                yt6 b3 = yt6.b((Bundle) jgd.a(parcel, Bundle.CREATOR));
                if (b3 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        V(b3);
                    } else {
                        new o59(Looper.getMainLooper(), (byte) 3).post(new tq4(this, b3, (byte) 19));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                jgd.b(parcel);
                yt6 b4 = yt6.b((Bundle) jgd.a(parcel, Bundle.CREATOR));
                if (b4 != null) {
                    gu6Var.getClass();
                    gu6.b();
                    ux4 c = gu6.c();
                    ArrayList arrayList = c.j;
                    if (!b4.d()) {
                        if ((readInt2 & 2) != 0 || !c.p) {
                            iu6 iu6Var = c.u;
                            if (iu6Var != null && iu6Var.c && c.f()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int size = arrayList.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                eu6 eu6Var = (eu6) arrayList.get(i4);
                                if (((readInt2 & 1) != 0 && eu6Var.d()) || ((z && !eu6Var.d() && eu6Var.c() != c.r) || !eu6Var.h(b4))) {
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
                jgd.b(parcel);
                dc6 dc6Var = i;
                dc6Var.b("select route with routeId = %s", readString);
                gu6Var.getClass();
                gu6.b();
                ArrayList arrayList2 = gu6.c().j;
                int size2 = arrayList2.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size2) {
                        Object obj = arrayList2.get(i5);
                        i5++;
                        eu6 eu6Var2 = (eu6) obj;
                        if (eu6Var2.c.equals(readString)) {
                            dc6Var.b("media route is found and selected", new Object[0]);
                            gu6.b();
                            gu6.c().i(eu6Var2, 3);
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                gu6Var.getClass();
                gu6.b();
                eu6 eu6Var3 = gu6.c().v;
                if (eu6Var3 != null) {
                    gu6.b();
                    gu6.c().i(eu6Var3, 3);
                    parcel2.writeNoException();
                    return true;
                }
                sc8.j("There is no default route.  The media router has not yet been fully initialized.");
                return false;
            case 7:
                gu6Var.getClass();
                gu6.b();
                eu6 eu6Var4 = gu6.c().v;
                if (eu6Var4 != null) {
                    boolean equals = gu6.f().c.equals(eu6Var4.c);
                    parcel2.writeNoException();
                    int i6 = jgd.a;
                    parcel2.writeInt(equals ? 1 : 0);
                    return true;
                }
                sc8.j("There is no default route.  The media router has not yet been fully initialized.");
                return false;
            case 8:
                String readString2 = parcel.readString();
                jgd.b(parcel);
                gu6Var.getClass();
                gu6.b();
                ArrayList arrayList3 = gu6.c().j;
                int size3 = arrayList3.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size3) {
                        Object obj2 = arrayList3.get(i7);
                        i7++;
                        eu6 eu6Var5 = (eu6) obj2;
                        if (eu6Var5.c.equals(readString2)) {
                            bundle = eu6Var5.s;
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
                gu6Var.getClass();
                String str = gu6.f().c;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 11:
                for (Set<zt6> set : hashMap.values()) {
                    for (zt6 zt6Var : set) {
                        gu6Var.h(zt6Var);
                    }
                }
                hashMap.clear();
                parcel2.writeNoException();
                return true;
            case 12:
                gu6Var.getClass();
                gu6.b();
                eu6 eu6Var6 = gu6.c().w;
                if (eu6Var6 != null && gu6.f().c.equals(eu6Var6.c)) {
                    i3 = 1;
                }
                parcel2.writeNoException();
                int i8 = jgd.a;
                parcel2.writeInt(i3);
                return true;
            case 13:
                int readInt3 = parcel.readInt();
                jgd.b(parcel);
                gu6Var.getClass();
                gu6.j(readInt3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
