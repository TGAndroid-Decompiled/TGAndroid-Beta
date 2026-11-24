package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
public final class p9d extends zt6 {
    public static final dc6 b = new dc6("MediaRouterCallback", null);
    public final k8d a;

    public p9d(k8d k8dVar) {
        fre.h(k8dVar);
        this.a = k8dVar;
    }

    @Override
    public final void d(eu6 eu6Var) {
        try {
            k8d k8dVar = this.a;
            String str = eu6Var.c;
            Bundle bundle = eu6Var.s;
            Parcel R = k8dVar.R();
            R.writeString(str);
            jgd.c(R, bundle);
            k8dVar.V(R, 1);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "onRouteAdded", k8d.class.getSimpleName());
        }
    }

    @Override
    public final void e(eu6 eu6Var) {
        try {
            k8d k8dVar = this.a;
            String str = eu6Var.c;
            Bundle bundle = eu6Var.s;
            Parcel R = k8dVar.R();
            R.writeString(str);
            jgd.c(R, bundle);
            k8dVar.V(R, 2);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "onRouteChanged", k8d.class.getSimpleName());
        }
    }

    @Override
    public final void f(eu6 eu6Var) {
        try {
            k8d k8dVar = this.a;
            String str = eu6Var.c;
            Bundle bundle = eu6Var.s;
            Parcel R = k8dVar.R();
            R.writeString(str);
            jgd.c(R, bundle);
            k8dVar.V(R, 3);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "onRouteRemoved", k8d.class.getSimpleName());
        }
    }

    @Override
    public final void h(gu6 gu6Var, eu6 eu6Var, int i) {
        CastDevice b2;
        String str;
        CastDevice b3;
        k8d k8dVar = this.a;
        Integer valueOf = Integer.valueOf(i);
        String str2 = eu6Var.c;
        dc6 dc6Var = b;
        Log.i(dc6Var.a, dc6Var.d("onRouteSelected with reason = %d, routeId = %s", valueOf, str2));
        if (eu6Var.l != 1) {
            return;
        }
        if (str2 != null) {
            try {
                if (str2.endsWith("-groupRoute") && (b2 = CastDevice.b(eu6Var.s)) != null) {
                    String str3 = b2.a;
                    if (str3.startsWith("__cast_nearby__")) {
                        str3 = str3.substring(16);
                    }
                    gu6.b();
                    ArrayList arrayList = gu6.c().j;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        eu6 eu6Var2 = (eu6) obj;
                        str = eu6Var2.c;
                        if (str != null && !str.endsWith("-groupRoute") && (b3 = CastDevice.b(eu6Var2.s)) != null) {
                            String str4 = b3.a;
                            if (str4.startsWith("__cast_nearby__")) {
                                str4 = str4.substring(16);
                            }
                            if (TextUtils.equals(str4, str3)) {
                                dc6Var.b("routeId is changed from %s to %s", str2, str);
                                break;
                            }
                        }
                    }
                }
            } catch (RemoteException e) {
                dc6Var.a(e, "Unable to call %s on %s.", "onRouteSelected", k8d.class.getSimpleName());
                return;
            }
        }
        str = str2;
        Parcel T = k8dVar.T(k8dVar.R(), 7);
        int readInt = T.readInt();
        T.recycle();
        Bundle bundle = eu6Var.s;
        if (readInt >= 220400000) {
            Parcel R = k8dVar.R();
            R.writeString(str);
            R.writeString(str2);
            jgd.c(R, bundle);
            k8dVar.V(R, 8);
            return;
        }
        Parcel R2 = k8dVar.R();
        R2.writeString(str);
        jgd.c(R2, bundle);
        k8dVar.V(R2, 4);
    }

    @Override
    public final void j(gu6 gu6Var, eu6 eu6Var, int i) {
        Integer valueOf = Integer.valueOf(i);
        String str = eu6Var.c;
        dc6 dc6Var = b;
        Log.i(dc6Var.a, dc6Var.d("onRouteUnselected with reason = %d, routeId = %s", valueOf, str));
        if (eu6Var.l != 1) {
            dc6Var.b("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            k8d k8dVar = this.a;
            Bundle bundle = eu6Var.s;
            Parcel R = k8dVar.R();
            R.writeString(str);
            jgd.c(R, bundle);
            R.writeInt(i);
            k8dVar.V(R, 6);
        } catch (RemoteException e) {
            dc6Var.a(e, "Unable to call %s on %s.", "onRouteUnselected", k8d.class.getSimpleName());
        }
    }
}
