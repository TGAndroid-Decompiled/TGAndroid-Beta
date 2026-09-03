package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class z0 extends t implements ServiceConnection {
    public static final int D = 0;
    public boolean B;
    public a1.c C;
    public final ComponentName f2069r;
    public final a7.e f2070s;
    public final ArrayList v;
    public boolean f2071w;
    public boolean f2072x;
    public t0 f2073y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public z0(Context context, ComponentName componentName) {
        super(context, new o5.i(componentName, 7));
        this.v = new ArrayList();
        this.f2069r = componentName;
        this.f2070s = new Handler();
    }

    @Override
    public final r c(String str) {
        if (str != null) {
            u uVar = (u) this.f2028n;
            if (uVar != null) {
                List list = (List) uVar.f2037c;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((n) list.get(i10)).d().equals(str)) {
                        x0 x0Var = new x0(this, str);
                        this.v.add(x0Var);
                        if (this.B) {
                            x0Var.a(this.f2073y);
                        }
                        r();
                        return x0Var;
                    }
                }
                return null;
            }
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Override
    public final s d(String str) {
        if (str != null) {
            return o(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override
    public final s e(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return o(str, str2);
            }
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override
    public final void f(o oVar) {
        Bundle bundle;
        if (this.B) {
            t0 t0Var = this.f2073y;
            int i10 = t0Var.d;
            t0Var.d = i10 + 1;
            if (oVar != null) {
                bundle = oVar.f2001a;
            } else {
                bundle = null;
            }
            t0Var.b(10, i10, 0, bundle, null);
        }
        r();
    }

    public final void n() {
        int i10;
        if (!this.f2072x) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f2069r);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i10 = 4097;
                } else {
                    i10 = 1;
                }
                this.f2072x = this.f2024a.bindService(intent, this, i10);
            } catch (SecurityException unused) {
            }
        }
    }

    public final y0 o(String str, String str2) {
        u uVar = (u) this.f2028n;
        if (uVar != null) {
            List list = (List) uVar.f2037c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) list.get(i10)).d().equals(str)) {
                    y0 y0Var = new y0(this, str, str2);
                    this.v.add(y0Var);
                    if (this.B) {
                        y0Var.a(this.f2073y);
                    }
                    r();
                    return y0Var;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger;
        if (this.f2072x) {
            p();
            if (iBinder != null) {
                messenger = new Messenger(iBinder);
            } else {
                messenger = null;
            }
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        t0 t0Var = new t0(this, messenger);
                        int i10 = t0Var.d;
                        t0Var.d = i10 + 1;
                        t0Var.f2033g = i10;
                        if (t0Var.b(1, i10, 4, null, null)) {
                            try {
                                t0Var.f2029a.getBinder().linkToDeath(t0Var, 0);
                                this.f2073y = t0Var;
                                return;
                            } catch (RemoteException unused) {
                                t0Var.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        p();
    }

    public final void p() {
        if (this.f2073y != null) {
            g(null);
            this.B = false;
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((u0) arrayList.get(i10)).c();
            }
            t0 t0Var = this.f2073y;
            t0Var.b(2, 0, 0, null, null);
            t0Var.f2030b.f2040b.clear();
            t0Var.f2029a.getBinder().unlinkToDeath(t0Var, 0);
            t0Var.f2034i.f2070s.post(new s0(t0Var, 0));
            this.f2073y = null;
        }
    }

    public final void q() {
        if (this.f2072x) {
            this.f2072x = false;
            p();
            try {
                this.f2024a.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    public final void r() {
        if (this.f2071w && (((o) this.h) != null || !this.v.isEmpty())) {
            n();
        } else {
            q();
        }
    }

    public final String toString() {
        return "Service connection " + this.f2069r.flattenToShortString();
    }
}
