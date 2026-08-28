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
public final class z0 extends s implements ServiceConnection {
    public static final int C = 0;
    public boolean A;
    public a1.c B;
    public final ComponentName f2273r;
    public final u0 f2274s;
    public final ArrayList v;
    public boolean f2275w;
    public boolean f2276x;
    public s0 f2277y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public z0(Context context, ComponentName componentName) {
        super(context, new android.support.v4.media.c(componentName, 5));
        this.v = new ArrayList();
        this.f2273r = componentName;
        this.f2274s = new Handler();
    }

    @Override
    public final q c(String str) {
        if (str != null) {
            t tVar = (t) this.f2224n;
            if (tVar != null) {
                List list = (List) tVar.f2234c;
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    if (((n) list.get(i9)).d().equals(str)) {
                        x0 x0Var = new x0(this, str);
                        this.v.add(x0Var);
                        if (this.A) {
                            x0Var.a(this.f2277y);
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
    public final r d(String str) {
        if (str != null) {
            return o(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override
    public final r e(String str, String str2) {
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
        if (this.A) {
            s0 s0Var = this.f2277y;
            int i9 = s0Var.d;
            s0Var.d = i9 + 1;
            if (oVar != null) {
                bundle = oVar.f2200a;
            } else {
                bundle = null;
            }
            s0Var.b(10, i9, 0, bundle, null);
        }
        r();
    }

    public final void n() {
        int i9;
        if (!this.f2276x) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f2273r);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i9 = 4097;
                } else {
                    i9 = 1;
                }
                this.f2276x = this.f2219a.bindService(intent, this, i9);
            } catch (SecurityException unused) {
            }
        }
    }

    public final y0 o(String str, String str2) {
        t tVar = (t) this.f2224n;
        if (tVar != null) {
            List list = (List) tVar.f2234c;
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((n) list.get(i9)).d().equals(str)) {
                    y0 y0Var = new y0(this, str, str2);
                    this.v.add(y0Var);
                    if (this.A) {
                        y0Var.a(this.f2277y);
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
        if (this.f2276x) {
            p();
            if (iBinder != null) {
                messenger = new Messenger(iBinder);
            } else {
                messenger = null;
            }
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        s0 s0Var = new s0(this, messenger);
                        int i9 = s0Var.d;
                        s0Var.d = i9 + 1;
                        s0Var.f2230g = i9;
                        if (s0Var.b(1, i9, 4, null, null)) {
                            try {
                                s0Var.f2225a.getBinder().linkToDeath(s0Var, 0);
                                this.f2277y = s0Var;
                                return;
                            } catch (RemoteException unused) {
                                s0Var.binderDied();
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
        if (this.f2277y != null) {
            g(null);
            this.A = false;
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((t0) arrayList.get(i9)).c();
            }
            s0 s0Var = this.f2277y;
            s0Var.b(2, 0, 0, null, null);
            s0Var.f2226b.f2240b.clear();
            s0Var.f2225a.getBinder().unlinkToDeath(s0Var, 0);
            s0Var.f2231i.f2274s.post(new r0(s0Var, 0));
            this.f2277y = null;
        }
    }

    public final void q() {
        if (this.f2276x) {
            this.f2276x = false;
            p();
            try {
                this.f2219a.unbindService(this);
            } catch (IllegalArgumentException e10) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e10);
            }
        }
    }

    public final void r() {
        if (this.f2275w && (((o) this.h) != null || !this.v.isEmpty())) {
            n();
        } else {
            q();
        }
    }

    public final String toString() {
        return "Service connection " + this.f2273r.flattenToShortString();
    }
}
