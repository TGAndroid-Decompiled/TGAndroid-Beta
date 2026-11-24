package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
public final class p6d extends dzc {
    public static final dc6 d = new dc6("AppVisibilityProxy", null);
    public static final boolean e = true;
    public final Set b;
    public byte c;

    public p6d() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", (byte) 4);
        this.b = DesugarCollections.synchronizedSet(new HashSet());
        this.c = e ? (byte) 1 : (byte) 0;
    }

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            Set<oad> set = this.b;
            dc6 dc6Var = d;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                Log.i(dc6Var.a, dc6Var.d("onAppEnteredBackground", new Object[0]));
                this.c = (byte) 2;
                for (oad oadVar : set) {
                    rad radVar = oadVar.a;
                    rad.f.b("Stopping RouteDiscovery.", new Object[0]);
                    radVar.c.clear();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        v8b v8bVar = radVar.e;
                        gu6 gu6Var = (gu6) v8bVar.c;
                        if (gu6Var == null) {
                            gu6Var = gu6.d((Context) v8bVar.b);
                            v8bVar.c = gu6Var;
                        }
                        gu6Var.h(radVar);
                    } else {
                        new o59(Looper.getMainLooper(), (byte) 3).post(new v9d(radVar, (byte) 0));
                    }
                }
                parcel2.writeNoException();
                return true;
            }
            Log.i(dc6Var.a, dc6Var.d("onAppEnteredForeground", new Object[0]));
            this.c = (byte) 1;
            for (oad oadVar2 : set) {
                oadVar2.a.m();
            }
            parcel2.writeNoException();
            return true;
        }
        bo7 bo7Var = new bo7(this);
        parcel2.writeNoException();
        jgd.d(parcel2, bo7Var);
        return true;
    }
}
