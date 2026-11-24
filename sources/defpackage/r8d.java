package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
public final class r8d extends e1d {
    public static final ce6 d = new ce6("AppVisibilityProxy", null);
    public static final boolean e = true;
    public final Set b;
    public byte c;

    public r8d() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", (byte) 4);
        this.b = DesugarCollections.synchronizedSet(new HashSet());
        this.c = e ? (byte) 1 : (byte) 0;
    }

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            Set<qcd> set = this.b;
            ce6 ce6Var = d;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                Log.i(ce6Var.a, ce6Var.d("onAppEnteredBackground", new Object[0]));
                this.c = (byte) 2;
                for (qcd qcdVar : set) {
                    tcd tcdVar = qcdVar.a;
                    tcd.f.b("Stopping RouteDiscovery.", new Object[0]);
                    tcdVar.c.clear();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        xab xabVar = tcdVar.e;
                        gw6 gw6Var = (gw6) xabVar.c;
                        if (gw6Var == null) {
                            gw6Var = gw6.d((Context) xabVar.b);
                            xabVar.c = gw6Var;
                        }
                        gw6Var.h(tcdVar);
                    } else {
                        new q79(Looper.getMainLooper(), (byte) 3).post(new xbd(tcdVar, (byte) 0));
                    }
                }
                parcel2.writeNoException();
                return true;
            }
            Log.i(ce6Var.a, ce6Var.d("onAppEnteredForeground", new Object[0]));
            this.c = (byte) 1;
            for (qcd qcdVar2 : set) {
                qcdVar2.a.m();
            }
            parcel2.writeNoException();
            return true;
        }
        eq7 eq7Var = new eq7(this);
        parcel2.writeNoException();
        kid.d(parcel2, eq7Var);
        return true;
    }
}
