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
public final class s59 extends wt6 implements ServiceConnection {
    public static final int H = 0;
    public m59 E;
    public boolean F;
    public k88 G;
    public final ComponentName r;
    public final o59 s;
    public final ArrayList w;
    public boolean x;
    public boolean y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public s59(Context context, ComponentName componentName) {
        super(context, new z24(componentName, (byte) 18));
        this.w = new ArrayList();
        this.r = componentName;
        this.s = new Handler();
    }

    @Override
    public final ut6 c(String str) {
        if (str != null) {
            am4 am4Var = (am4) this.n;
            if (am4Var != null) {
                List list = am4Var.b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((zs6) list.get(i)).d().equals(str)) {
                        q59 q59Var = new q59(this, str);
                        this.w.add(q59Var);
                        if (this.F) {
                            q59Var.b(this.E);
                        }
                        r();
                        return q59Var;
                    }
                }
            }
            return null;
        }
        w26.j("initialMemberRouteId cannot be null.");
        return null;
    }

    @Override
    public final vt6 d(String str) {
        if (str != null) {
            return o(str, null);
        }
        w26.j("routeId cannot be null");
        return null;
    }

    @Override
    public final vt6 e(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return o(str, str2);
            }
            w26.j("routeGroupId cannot be null");
            return null;
        }
        w26.j("routeId cannot be null");
        return null;
    }

    @Override
    public final void f(bt6 bt6Var) {
        Bundle bundle;
        if (this.F) {
            m59 m59Var = this.E;
            int i = m59Var.d;
            m59Var.d = i + 1;
            if (bt6Var != null) {
                bundle = bt6Var.a;
            } else {
                bundle = null;
            }
            m59Var.b(10, i, 0, bundle, null);
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

    public final r59 o(String str, String str2) {
        am4 am4Var = (am4) this.n;
        if (am4Var != null) {
            List list = am4Var.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((zs6) list.get(i)).d().equals(str)) {
                    r59 r59Var = new r59(this, str, str2);
                    this.w.add(r59Var);
                    if (this.F) {
                        r59Var.b(this.E);
                    }
                    r();
                    return r59Var;
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
                        m59 m59Var = new m59(this, messenger);
                        int i = m59Var.d;
                        m59Var.d = i + 1;
                        m59Var.h = i;
                        if (m59Var.b(1, i, 4, null, null)) {
                            try {
                                m59Var.a.getBinder().linkToDeath(m59Var, 0);
                                this.E = m59Var;
                                return;
                            } catch (RemoteException unused) {
                                m59Var.binderDied();
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
                ((n59) arrayList.get(i)).c();
            }
            m59 m59Var = this.E;
            m59Var.b(2, 0, 0, null, null);
            m59Var.b.b.clear();
            m59Var.a.getBinder().unlinkToDeath(m59Var, 0);
            m59Var.r.s.post(new l59(m59Var, (byte) 0));
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
        if (this.x && (((bt6) this.h) != null || !this.w.isEmpty())) {
            n();
        } else {
            q();
        }
    }

    public final String toString() {
        return "Service connection " + this.r.flattenToShortString();
    }
}
