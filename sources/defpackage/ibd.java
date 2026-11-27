package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
public final class ibd extends u3d {
    public static final he6 d = new he6("AppVisibilityProxy", null);
    public static final boolean e = true;
    public final Set b;
    public byte c;

    public ibd() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", (byte) 4);
        this.b = DesugarCollections.synchronizedSet(new HashSet());
        this.c = e ? (byte) 1 : (byte) 0;
    }

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            Set<hfd> set = this.b;
            he6 he6Var = d;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                Log.i(he6Var.a, he6Var.d("onAppEnteredBackground", new Object[0]));
                this.c = (byte) 2;
                for (hfd hfdVar : set) {
                    kfd kfdVar = hfdVar.a;
                    kfd.f.b("Stopping RouteDiscovery.", new Object[0]);
                    kfdVar.c.clear();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        k7b k7bVar = kfdVar.e;
                        lw6 lw6Var = (lw6) k7bVar.c;
                        if (lw6Var == null) {
                            lw6Var = lw6.d((Context) k7bVar.b);
                            k7bVar.c = lw6Var;
                        }
                        lw6Var.h(kfdVar);
                    } else {
                        new b99(Looper.getMainLooper(), (byte) 3).post(new oed(kfdVar, (byte) 0));
                    }
                }
                parcel2.writeNoException();
                return true;
            }
            Log.i(he6Var.a, he6Var.d("onAppEnteredForeground", new Object[0]));
            this.c = (byte) 1;
            for (hfd hfdVar2 : set) {
                hfdVar2.a.m();
            }
            parcel2.writeNoException();
            return true;
        }
        br7 br7Var = new br7(this);
        parcel2.writeNoException();
        ald.d(parcel2, br7Var);
        return true;
    }
}
