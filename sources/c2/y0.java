package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class y0 extends s implements ServiceConnection {
    public static final int C = 0;
    public boolean A;
    public a1.c B;

    public final ComponentName f2385r;

    public final t0 f2386s;
    public final ArrayList v;

    public boolean f2387w;

    public boolean f2388x;

    public r0 f2389y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public y0(Context context, ComponentName componentName) {
        super(context, new k5.i(componentName, 5));
        this.v = new ArrayList();
        this.f2385r = componentName;
        this.f2386s = new t0();
    }

    @Override
    public final q c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        t tVar = (t) this.f2344n;
        if (tVar == null) {
            return null;
        }
        List list = (List) tVar.f2347c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n) list.get(i10)).d().equals(str)) {
                w0 w0Var = new w0(this, str);
                this.v.add(w0Var);
                if (this.A) {
                    w0Var.a(this.f2389y);
                }
                r();
                return w0Var;
            }
        }
        return null;
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
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return o(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override
    public final void f(o oVar) {
        if (this.A) {
            r0 r0Var = this.f2389y;
            int i10 = r0Var.d;
            r0Var.d = i10 + 1;
            r0Var.b(10, i10, 0, oVar != null ? oVar.f2315a : null, null);
        }
        r();
    }

    public final void n() {
        if (this.f2388x) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.f2385r);
        try {
            this.f2388x = this.f2339a.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    public final x0 o(String str, String str2) {
        t tVar = (t) this.f2344n;
        if (tVar == null) {
            return null;
        }
        List list = (List) tVar.f2347c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n) list.get(i10)).d().equals(str)) {
                x0 x0Var = new x0(this, str, str2);
                this.v.add(x0Var);
                if (this.A) {
                    x0Var.a(this.f2389y);
                }
                r();
                return x0Var;
            }
        }
        return null;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f2388x) {
            p();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        r0 r0Var = new r0(this, messenger);
                        int i10 = r0Var.d;
                        r0Var.d = i10 + 1;
                        r0Var.f2337g = i10;
                        if (r0Var.b(1, i10, 4, null, null)) {
                            try {
                                r0Var.f2332a.getBinder().linkToDeath(r0Var, 0);
                                this.f2389y = r0Var;
                                return;
                            } catch (RemoteException unused) {
                                r0Var.binderDied();
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
        if (this.f2389y != null) {
            g(null);
            this.A = false;
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((s0) arrayList.get(i10)).c();
            }
            r0 r0Var = this.f2389y;
            r0Var.b(2, 0, 0, null, null);
            r0Var.f2333b.f2352b.clear();
            r0Var.f2332a.getBinder().unlinkToDeath(r0Var, 0);
            r0Var.f2338i.f2386s.post(new q0(r0Var, 0));
            this.f2389y = null;
        }
    }

    public final void q() {
        if (this.f2388x) {
            this.f2388x = false;
            p();
            try {
                this.f2339a.unbindService(this);
            } catch (IllegalArgumentException e9) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e9);
            }
        }
    }

    public final void r() {
        if (!this.f2387w || (((o) this.h) == null && this.v.isEmpty())) {
            q();
        } else {
            n();
        }
    }

    public final String toString() {
        return "Service connection " + this.f2385r.flattenToShortString();
    }
}
