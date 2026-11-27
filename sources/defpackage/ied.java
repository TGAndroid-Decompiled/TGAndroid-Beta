package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
public final class ied extends ew6 {
    public static final he6 b = new he6("MediaRouterCallback", null);
    public final ddd a;

    public ied(ddd dddVar) {
        xve.h(dddVar);
        this.a = dddVar;
    }

    @Override
    public final void d(jw6 jw6Var) {
        try {
            ddd dddVar = this.a;
            String str = jw6Var.c;
            Bundle bundle = jw6Var.s;
            Parcel R = dddVar.R();
            R.writeString(str);
            ald.c(R, bundle);
            dddVar.V(R, 1);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "onRouteAdded", ddd.class.getSimpleName());
        }
    }

    @Override
    public final void e(jw6 jw6Var) {
        try {
            ddd dddVar = this.a;
            String str = jw6Var.c;
            Bundle bundle = jw6Var.s;
            Parcel R = dddVar.R();
            R.writeString(str);
            ald.c(R, bundle);
            dddVar.V(R, 2);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "onRouteChanged", ddd.class.getSimpleName());
        }
    }

    @Override
    public final void f(jw6 jw6Var) {
        try {
            ddd dddVar = this.a;
            String str = jw6Var.c;
            Bundle bundle = jw6Var.s;
            Parcel R = dddVar.R();
            R.writeString(str);
            ald.c(R, bundle);
            dddVar.V(R, 3);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "onRouteRemoved", ddd.class.getSimpleName());
        }
    }

    @Override
    public final void h(lw6 lw6Var, jw6 jw6Var, int i) {
        CastDevice b2;
        String str;
        CastDevice b3;
        ddd dddVar = this.a;
        Integer valueOf = Integer.valueOf(i);
        String str2 = jw6Var.c;
        he6 he6Var = b;
        Log.i(he6Var.a, he6Var.d("onRouteSelected with reason = %d, routeId = %s", valueOf, str2));
        if (jw6Var.l != 1) {
            return;
        }
        if (str2 != null) {
            try {
                if (str2.endsWith("-groupRoute") && (b2 = CastDevice.b(jw6Var.s)) != null) {
                    String str3 = b2.a;
                    if (str3.startsWith("__cast_nearby__")) {
                        str3 = str3.substring(16);
                    }
                    lw6.b();
                    ArrayList arrayList = lw6.c().j;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        jw6 jw6Var2 = (jw6) obj;
                        str = jw6Var2.c;
                        if (str != null && !str.endsWith("-groupRoute") && (b3 = CastDevice.b(jw6Var2.s)) != null) {
                            String str4 = b3.a;
                            if (str4.startsWith("__cast_nearby__")) {
                                str4 = str4.substring(16);
                            }
                            if (TextUtils.equals(str4, str3)) {
                                he6Var.b("routeId is changed from %s to %s", str2, str);
                                break;
                            }
                        }
                    }
                }
            } catch (RemoteException e) {
                he6Var.a(e, "Unable to call %s on %s.", "onRouteSelected", ddd.class.getSimpleName());
                return;
            }
        }
        str = str2;
        Parcel T = dddVar.T(dddVar.R(), 7);
        int readInt = T.readInt();
        T.recycle();
        Bundle bundle = jw6Var.s;
        if (readInt >= 220400000) {
            Parcel R = dddVar.R();
            R.writeString(str);
            R.writeString(str2);
            ald.c(R, bundle);
            dddVar.V(R, 8);
            return;
        }
        Parcel R2 = dddVar.R();
        R2.writeString(str);
        ald.c(R2, bundle);
        dddVar.V(R2, 4);
    }

    @Override
    public final void j(lw6 lw6Var, jw6 jw6Var, int i) {
        Integer valueOf = Integer.valueOf(i);
        String str = jw6Var.c;
        he6 he6Var = b;
        Log.i(he6Var.a, he6Var.d("onRouteUnselected with reason = %d, routeId = %s", valueOf, str));
        if (jw6Var.l != 1) {
            he6Var.b("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            ddd dddVar = this.a;
            Bundle bundle = jw6Var.s;
            Parcel R = dddVar.R();
            R.writeString(str);
            ald.c(R, bundle);
            R.writeInt(i);
            dddVar.V(R, 6);
        } catch (RemoteException e) {
            he6Var.a(e, "Unable to call %s on %s.", "onRouteUnselected", ddd.class.getSimpleName());
        }
    }
}
