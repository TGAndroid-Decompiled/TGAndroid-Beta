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
public final class hhd extends u3d implements IInterface {
    public static final he6 i = new he6("MediaRouterProxy", null);
    public final lw6 b;
    public final ld1 c;
    public final HashMap d;
    public final pid e;
    public final boolean f;

    public hhd(Context context, lw6 lw6Var, ld1 ld1Var, qa4 qa4Var) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", (byte) 4);
        this.d = new HashMap();
        this.b = lw6Var;
        this.c = ld1Var;
        int i2 = Build.VERSION.SDK_INT;
        he6 he6Var = i;
        if (i2 <= 32) {
            Log.i(he6Var.a, he6Var.d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        he6Var.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.e = new pid(ld1Var);
        Intent intent = new Intent(context, n07.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.f = !isEmpty;
        if (!isEmpty) {
            z9f.a(b6f.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        qa4Var.m(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new zhc(this, ld1Var, false, (byte) 11));
    }

    public final void T(rx6 rx6Var) {
        pm3 pm3Var;
        this.b.getClass();
        lw6.b();
        a05 c = lw6.c();
        c.D = rx6Var;
        if (rx6Var != null) {
            pm3Var = new pm3(c, rx6Var, (byte) 5);
        } else {
            pm3Var = null;
        }
        pm3 pm3Var2 = c.C;
        if (pm3Var2 != null) {
            pm3Var2.o();
        }
        c.C = pm3Var;
        if (pm3Var != null) {
            c.l();
        }
    }

    public final void U(dw6 dw6Var, int i2) {
        Set<ew6> set = (Set) this.d.get(dw6Var);
        if (set != null) {
            for (ew6 ew6Var : set) {
                this.b.a(dw6Var, ew6Var, i2);
            }
        }
    }

    public final void V(dw6 dw6Var) {
        Set<ew6> set = (Set) this.d.get(dw6Var);
        if (set != null) {
            for (ew6 ew6Var : set) {
                this.b.h(ew6Var);
            }
        }
    }

    @Override
    public final boolean d(int i2, Parcel parcel, Parcel parcel2) {
        boolean z;
        ddd dddVar = null;
        Bundle bundle = null;
        HashMap hashMap = this.d;
        int i3 = 0;
        lw6 lw6Var = this.b;
        switch (i2) {
            case 1:
                Bundle bundle2 = (Bundle) ald.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    if (queryLocalInterface instanceof ddd) {
                        dddVar = (ddd) queryLocalInterface;
                    } else {
                        dddVar = new v3d(readStrongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", (byte) 3);
                    }
                }
                ald.b(parcel);
                dw6 b = dw6.b(bundle2);
                if (b != null) {
                    if (!hashMap.containsKey(b)) {
                        hashMap.put(b, new HashSet());
                    }
                    ((Set) hashMap.get(b)).add(new ied(dddVar));
                }
                parcel2.writeNoException();
                return true;
            case 2:
                int readInt = parcel.readInt();
                ald.b(parcel);
                dw6 b2 = dw6.b((Bundle) ald.a(parcel, Bundle.CREATOR));
                if (b2 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        U(b2, readInt);
                    } else {
                        new b99(Looper.getMainLooper(), (byte) 3).post(new kq(this, b2, readInt, (byte) 6));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 3:
                ald.b(parcel);
                dw6 b3 = dw6.b((Bundle) ald.a(parcel, Bundle.CREATOR));
                if (b3 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        V(b3);
                    } else {
                        new b99(Looper.getMainLooper(), (byte) 3).post(new xs4(this, b3, (byte) 19));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                ald.b(parcel);
                dw6 b4 = dw6.b((Bundle) ald.a(parcel, Bundle.CREATOR));
                if (b4 != null) {
                    lw6Var.getClass();
                    lw6.b();
                    a05 c = lw6.c();
                    ArrayList arrayList = c.j;
                    if (!b4.d()) {
                        if ((readInt2 & 2) != 0 || !c.p) {
                            nw6 nw6Var = c.u;
                            if (nw6Var != null && nw6Var.c && c.f()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int size = arrayList.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                jw6 jw6Var = (jw6) arrayList.get(i4);
                                if (((readInt2 & 1) != 0 && jw6Var.d()) || ((z && !jw6Var.d() && jw6Var.c() != c.r) || !jw6Var.h(b4))) {
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
                ald.b(parcel);
                he6 he6Var = i;
                he6Var.b("select route with routeId = %s", readString);
                lw6Var.getClass();
                lw6.b();
                ArrayList arrayList2 = lw6.c().j;
                int size2 = arrayList2.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size2) {
                        Object obj = arrayList2.get(i5);
                        i5++;
                        jw6 jw6Var2 = (jw6) obj;
                        if (jw6Var2.c.equals(readString)) {
                            he6Var.b("media route is found and selected", new Object[0]);
                            lw6.b();
                            lw6.c().i(jw6Var2, 3);
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                lw6Var.getClass();
                lw6.b();
                jw6 jw6Var3 = lw6.c().v;
                if (jw6Var3 != null) {
                    lw6.b();
                    lw6.c().i(jw6Var3, 3);
                    parcel2.writeNoException();
                    return true;
                }
                grb.i("There is no default route.  The media router has not yet been fully initialized.");
                return false;
            case 7:
                lw6Var.getClass();
                lw6.b();
                jw6 jw6Var4 = lw6.c().v;
                if (jw6Var4 != null) {
                    boolean equals = lw6.f().c.equals(jw6Var4.c);
                    parcel2.writeNoException();
                    int i6 = ald.a;
                    parcel2.writeInt(equals ? 1 : 0);
                    return true;
                }
                grb.i("There is no default route.  The media router has not yet been fully initialized.");
                return false;
            case 8:
                String readString2 = parcel.readString();
                ald.b(parcel);
                lw6Var.getClass();
                lw6.b();
                ArrayList arrayList3 = lw6.c().j;
                int size3 = arrayList3.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size3) {
                        Object obj2 = arrayList3.get(i7);
                        i7++;
                        jw6 jw6Var5 = (jw6) obj2;
                        if (jw6Var5.c.equals(readString2)) {
                            bundle = jw6Var5.s;
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
                lw6Var.getClass();
                String str = lw6.f().c;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 11:
                for (Set<ew6> set : hashMap.values()) {
                    for (ew6 ew6Var : set) {
                        lw6Var.h(ew6Var);
                    }
                }
                hashMap.clear();
                parcel2.writeNoException();
                return true;
            case 12:
                lw6Var.getClass();
                lw6.b();
                jw6 jw6Var6 = lw6.c().w;
                if (jw6Var6 != null && lw6.f().c.equals(jw6Var6.c)) {
                    i3 = 1;
                }
                parcel2.writeNoException();
                int i8 = ald.a;
                parcel2.writeInt(i3);
                return true;
            case 13:
                int readInt3 = parcel.readInt();
                ald.b(parcel);
                lw6Var.getClass();
                lw6.j(readInt3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
