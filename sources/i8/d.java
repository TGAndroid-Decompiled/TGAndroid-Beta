package i8;

import a8.h0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.FrameLayout;
import o6.l;
public abstract class d extends FrameLayout {
    private final j zza;

    public d(Context context) {
        super(context);
        this.zza = new j(this, context);
        setClickable(true);
    }

    public void getMapAsync(f fVar) {
        l.e("getMapAsync() must be called on the main thread");
        l.i(fVar, "callback must not be null.");
        j jVar = this.zza;
        h0 h0Var = jVar.f13892a;
        if (h0Var != null) {
            h0Var.p(fVar);
        } else {
            jVar.h.add(fVar);
        }
    }

    public void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            j jVar = this.zza;
            jVar.getClass();
            jVar.c(bundle, new y6.c(jVar, bundle));
            if (this.zza.f13892a == null) {
                j.a(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        j jVar = this.zza;
        h0 h0Var = jVar.f13892a;
        if (h0Var != null) {
            try {
                j8.g gVar = (j8.g) h0Var.f512c;
                gVar.R0(gVar.N0(), 5);
                return;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
        jVar.b(1);
    }

    public void onEnterAmbient(Bundle bundle) {
        l.e("onEnterAmbient() must be called on the main thread");
        h0 h0Var = this.zza.f13892a;
        if (h0Var != null) {
            h0Var.getClass();
            try {
                Bundle bundle2 = new Bundle();
                j8.d.c(bundle, bundle2);
                j8.g gVar = (j8.g) h0Var.f512c;
                Parcel N0 = gVar.N0();
                t7.b.b(N0, bundle2);
                gVar.R0(N0, 10);
                j8.d.c(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void onExitAmbient() {
        l.e("onExitAmbient() must be called on the main thread");
        h0 h0Var = this.zza.f13892a;
        if (h0Var != null) {
            h0Var.getClass();
            try {
                j8.g gVar = (j8.g) h0Var.f512c;
                gVar.R0(gVar.N0(), 11);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void onLowMemory() {
        h0 h0Var = this.zza.f13892a;
        if (h0Var != null) {
            try {
                j8.g gVar = (j8.g) h0Var.f512c;
                gVar.R0(gVar.N0(), 6);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void onPause() {
        j jVar = this.zza;
        h0 h0Var = jVar.f13892a;
        if (h0Var != null) {
            try {
                j8.g gVar = (j8.g) h0Var.f512c;
                gVar.R0(gVar.N0(), 4);
                return;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
        jVar.b(5);
    }

    public void onResume() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new y6.d(jVar, 1));
    }

    public void onSaveInstanceState(Bundle bundle) {
        j jVar = this.zza;
        h0 h0Var = jVar.f13892a;
        if (h0Var != null) {
            try {
                Bundle bundle2 = new Bundle();
                j8.d.c(bundle, bundle2);
                j8.g gVar = (j8.g) h0Var.f512c;
                Parcel N0 = gVar.N0();
                t7.b.b(N0, bundle2);
                Parcel M0 = gVar.M0(N0, 7);
                if (M0.readInt() != 0) {
                    bundle2.readFromParcel(M0);
                }
                M0.recycle();
                j8.d.c(bundle2, bundle);
                return;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
        Bundle bundle3 = jVar.f13893b;
        if (bundle3 != null) {
            bundle.putAll(bundle3);
        }
    }

    public void onStart() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new y6.d(jVar, 0));
    }

    public void onStop() {
        j jVar = this.zza;
        h0 h0Var = jVar.f13892a;
        if (h0Var != null) {
            try {
                j8.g gVar = (j8.g) h0Var.f512c;
                gVar.R0(gVar.N0(), 13);
                return;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
        jVar.b(4);
    }
}
