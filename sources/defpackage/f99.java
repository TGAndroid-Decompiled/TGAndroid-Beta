package defpackage;

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
public final class f99 extends bw6 implements ServiceConnection {
    public static final int H = 0;
    public z89 E;
    public boolean F;
    public jz7 G;
    public final ComponentName r;
    public final b99 s;
    public final ArrayList w;
    public boolean x;
    public boolean y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public f99(Context context, ComponentName componentName) {
        super(context, new xh4(componentName, (byte) 15));
        this.w = new ArrayList();
        this.r = componentName;
        this.s = new Handler();
    }

    @Override
    public final zv6 c(String str) {
        if (str != null) {
            fo4 fo4Var = (fo4) this.n;
            if (fo4Var != null) {
                List list = fo4Var.b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((ev6) list.get(i)).d().equals(str)) {
                        d99 d99Var = new d99(this, str);
                        this.w.add(d99Var);
                        if (this.F) {
                            d99Var.b(this.E);
                        }
                        r();
                        return d99Var;
                    }
                }
            }
            return null;
        }
        lq5.j("initialMemberRouteId cannot be null.");
        return null;
    }

    @Override
    public final aw6 d(String str) {
        if (str != null) {
            return o(str, null);
        }
        lq5.j("routeId cannot be null");
        return null;
    }

    @Override
    public final aw6 e(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return o(str, str2);
            }
            lq5.j("routeGroupId cannot be null");
            return null;
        }
        lq5.j("routeId cannot be null");
        return null;
    }

    @Override
    public final void f(gv6 gv6Var) {
        Bundle bundle;
        if (this.F) {
            z89 z89Var = this.E;
            int i = z89Var.d;
            z89Var.d = i + 1;
            if (gv6Var != null) {
                bundle = gv6Var.a;
            } else {
                bundle = null;
            }
            z89Var.b(10, i, 0, bundle, null);
        }
        r();
    }

    public final void n() {
        int i;
        if (!this.y) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.r);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i = 4097;
                } else {
                    i = 1;
                }
                this.y = this.a.bindService(intent, this, i);
            } catch (SecurityException unused) {
            }
        }
    }

    public final e99 o(String str, String str2) {
        fo4 fo4Var = (fo4) this.n;
        if (fo4Var != null) {
            List list = fo4Var.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((ev6) list.get(i)).d().equals(str)) {
                    e99 e99Var = new e99(this, str, str2);
                    this.w.add(e99Var);
                    if (this.F) {
                        e99Var.b(this.E);
                    }
                    r();
                    return e99Var;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger;
        if (this.y) {
            p();
            if (iBinder != null) {
                messenger = new Messenger(iBinder);
            } else {
                messenger = null;
            }
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        z89 z89Var = new z89(this, messenger);
                        int i = z89Var.d;
                        z89Var.d = i + 1;
                        z89Var.h = i;
                        if (z89Var.b(1, i, 4, null, null)) {
                            try {
                                z89Var.a.getBinder().linkToDeath(z89Var, 0);
                                this.E = z89Var;
                                return;
                            } catch (RemoteException unused) {
                                z89Var.binderDied();
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
        if (this.E != null) {
            g(null);
            this.F = false;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((a99) arrayList.get(i)).c();
            }
            z89 z89Var = this.E;
            z89Var.b(2, 0, 0, null, null);
            z89Var.b.b.clear();
            z89Var.a.getBinder().unlinkToDeath(z89Var, 0);
            z89Var.r.s.post(new y89(z89Var, (byte) 0));
            this.E = null;
        }
    }

    public final void q() {
        if (this.y) {
            this.y = false;
            p();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    public final void r() {
        if (this.x && (((gv6) this.h) != null || !this.w.isEmpty())) {
            n();
        } else {
            q();
        }
    }

    public final String toString() {
        return "Service connection " + this.r.flattenToShortString();
    }
}
