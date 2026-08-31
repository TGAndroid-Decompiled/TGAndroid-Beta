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
public final class y0 extends t implements ServiceConnection {
    public static final int D = 0;
    public boolean B;
    public a1.c C;
    public final ComponentName f2214r;
    public final a7.e f2215s;
    public final ArrayList v;
    public boolean f2216w;
    public boolean f2217x;
    public s0 f2218y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public y0(Context context, ComponentName componentName) {
        super(context, new y5.h(componentName, 7));
        this.v = new ArrayList();
        this.f2214r = componentName;
        this.f2215s = new Handler();
    }

    @Override
    public final r c(String str) {
        if (str != null) {
            u uVar = (u) this.f2177n;
            if (uVar != null) {
                List list = (List) uVar.f2180c;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((n) list.get(i10)).d().equals(str)) {
                        w0 w0Var = new w0(this, str);
                        this.v.add(w0Var);
                        if (this.B) {
                            w0Var.a(this.f2218y);
                        }
                        r();
                        return w0Var;
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
            s0 s0Var = this.f2218y;
            int i10 = s0Var.d;
            s0Var.d = i10 + 1;
            if (oVar != null) {
                bundle = oVar.f2142a;
            } else {
                bundle = null;
            }
            s0Var.b(10, i10, 0, bundle, null);
        }
        r();
    }

    public final void n() {
        int i10;
        if (!this.f2217x) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f2214r);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i10 = 4097;
                } else {
                    i10 = 1;
                }
                this.f2217x = this.f2172a.bindService(intent, this, i10);
            } catch (SecurityException unused) {
            }
        }
    }

    public final x0 o(String str, String str2) {
        u uVar = (u) this.f2177n;
        if (uVar != null) {
            List list = (List) uVar.f2180c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) list.get(i10)).d().equals(str)) {
                    x0 x0Var = new x0(this, str, str2);
                    this.v.add(x0Var);
                    if (this.B) {
                        x0Var.a(this.f2218y);
                    }
                    r();
                    return x0Var;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger;
        if (this.f2217x) {
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
                        int i10 = s0Var.d;
                        s0Var.d = i10 + 1;
                        s0Var.f2170g = i10;
                        if (s0Var.b(1, i10, 4, null, null)) {
                            try {
                                s0Var.f2165a.getBinder().linkToDeath(s0Var, 0);
                                this.f2218y = s0Var;
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
        if (this.f2218y != null) {
            g(null);
            this.B = false;
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((t0) arrayList.get(i10)).c();
            }
            s0 s0Var = this.f2218y;
            s0Var.b(2, 0, 0, null, null);
            s0Var.f2166b.f2182b.clear();
            s0Var.f2165a.getBinder().unlinkToDeath(s0Var, 0);
            s0Var.f2171i.f2215s.post(new r0(s0Var, 0));
            this.f2218y = null;
        }
    }

    public final void q() {
        if (this.f2217x) {
            this.f2217x = false;
            p();
            try {
                this.f2172a.unbindService(this);
            } catch (IllegalArgumentException e6) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e6);
            }
        }
    }

    public final void r() {
        if (this.f2216w && (((o) this.h) != null || !this.v.isEmpty())) {
            n();
        } else {
            q();
        }
    }

    public final String toString() {
        return "Service connection " + this.f2214r.flattenToShortString();
    }
}
