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
public final class u79 extends wv6 implements ServiceConnection {
    public static final int H = 0;
    public o79 E;
    public boolean F;
    public h68 G;
    public final ComponentName r;
    public final q79 s;
    public final ArrayList w;
    public boolean x;
    public boolean y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public u79(Context context, ComponentName componentName) {
        super(context, new ai4(componentName, (byte) 15));
        this.w = new ArrayList();
        this.r = componentName;
        this.s = new Handler();
    }

    @Override
    public final uv6 c(String str) {
        if (str != null) {
            bo4 bo4Var = (bo4) this.n;
            if (bo4Var != null) {
                List list = bo4Var.b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((zu6) list.get(i)).d().equals(str)) {
                        s79 s79Var = new s79(this, str);
                        this.w.add(s79Var);
                        if (this.F) {
                            s79Var.b(this.E);
                        }
                        r();
                        return s79Var;
                    }
                }
            }
            return null;
        }
        u36.j("initialMemberRouteId cannot be null.");
        return null;
    }

    @Override
    public final vv6 d(String str) {
        if (str != null) {
            return o(str, null);
        }
        u36.j("routeId cannot be null");
        return null;
    }

    @Override
    public final vv6 e(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return o(str, str2);
            }
            u36.j("routeGroupId cannot be null");
            return null;
        }
        u36.j("routeId cannot be null");
        return null;
    }

    @Override
    public final void f(bv6 bv6Var) {
        Bundle bundle;
        if (this.F) {
            o79 o79Var = this.E;
            int i = o79Var.d;
            o79Var.d = i + 1;
            if (bv6Var != null) {
                bundle = bv6Var.a;
            } else {
                bundle = null;
            }
            o79Var.b(10, i, 0, bundle, null);
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

    public final t79 o(String str, String str2) {
        bo4 bo4Var = (bo4) this.n;
        if (bo4Var != null) {
            List list = bo4Var.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((zu6) list.get(i)).d().equals(str)) {
                    t79 t79Var = new t79(this, str, str2);
                    this.w.add(t79Var);
                    if (this.F) {
                        t79Var.b(this.E);
                    }
                    r();
                    return t79Var;
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
                        o79 o79Var = new o79(this, messenger);
                        int i = o79Var.d;
                        o79Var.d = i + 1;
                        o79Var.h = i;
                        if (o79Var.b(1, i, 4, null, null)) {
                            try {
                                o79Var.a.getBinder().linkToDeath(o79Var, 0);
                                this.E = o79Var;
                                return;
                            } catch (RemoteException unused) {
                                o79Var.binderDied();
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
                ((p79) arrayList.get(i)).c();
            }
            o79 o79Var = this.E;
            o79Var.b(2, 0, 0, null, null);
            o79Var.b.b.clear();
            o79Var.a.getBinder().unlinkToDeath(o79Var, 0);
            o79Var.r.s.post(new n79(o79Var, (byte) 0));
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
        if (this.x && (((bv6) this.h) != null || !this.w.isEmpty())) {
            n();
        } else {
            q();
        }
    }

    public final String toString() {
        return "Service connection " + this.r.flattenToShortString();
    }
}
