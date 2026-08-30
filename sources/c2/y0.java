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
    public final ComponentName f2038r;
    public final a7.e f2039s;
    public final ArrayList v;
    public boolean f2040w;
    public boolean f2041x;
    public s0 f2042y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public y0(Context context, ComponentName componentName) {
        super(context, new o5.i(componentName, 7));
        this.v = new ArrayList();
        this.f2038r = componentName;
        this.f2039s = new Handler();
    }

    @Override
    public final r c(String str) {
        if (str != null) {
            u uVar = (u) this.f2004n;
            if (uVar != null) {
                List list = (List) uVar.f2007c;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((n) list.get(i10)).d().equals(str)) {
                        w0 w0Var = new w0(this, str);
                        this.v.add(w0Var);
                        if (this.B) {
                            w0Var.a(this.f2042y);
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
            s0 s0Var = this.f2042y;
            int i10 = s0Var.d;
            s0Var.d = i10 + 1;
            if (oVar != null) {
                bundle = oVar.f1974a;
            } else {
                bundle = null;
            }
            s0Var.b(10, i10, 0, bundle, null);
        }
        r();
    }

    public final void n() {
        int i10;
        if (!this.f2041x) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f2038r);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i10 = 4097;
                } else {
                    i10 = 1;
                }
                this.f2041x = this.f2000a.bindService(intent, this, i10);
            } catch (SecurityException unused) {
            }
        }
    }

    public final x0 o(String str, String str2) {
        u uVar = (u) this.f2004n;
        if (uVar != null) {
            List list = (List) uVar.f2007c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) list.get(i10)).d().equals(str)) {
                    x0 x0Var = new x0(this, str, str2);
                    this.v.add(x0Var);
                    if (this.B) {
                        x0Var.a(this.f2042y);
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
        if (this.f2041x) {
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
                        s0Var.f1998g = i10;
                        if (s0Var.b(1, i10, 4, null, null)) {
                            try {
                                s0Var.f1994a.getBinder().linkToDeath(s0Var, 0);
                                this.f2042y = s0Var;
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
        if (this.f2042y != null) {
            g(null);
            this.B = false;
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((t0) arrayList.get(i10)).c();
            }
            s0 s0Var = this.f2042y;
            s0Var.b(2, 0, 0, null, null);
            s0Var.f1995b.f2009b.clear();
            s0Var.f1994a.getBinder().unlinkToDeath(s0Var, 0);
            s0Var.f1999i.f2039s.post(new r0(s0Var, 0));
            this.f2042y = null;
        }
    }

    public final void q() {
        if (this.f2041x) {
            this.f2041x = false;
            p();
            try {
                this.f2000a.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    public final void r() {
        if (this.f2040w && (((o) this.h) != null || !this.v.isEmpty())) {
            n();
        } else {
            q();
        }
    }

    public final String toString() {
        return "Service connection " + this.f2038r.flattenToShortString();
    }
}
