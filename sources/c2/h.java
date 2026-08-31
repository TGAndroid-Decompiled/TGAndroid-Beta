package c2;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
public final class h extends r {
    public final String f2111f;
    public final MediaRouter2.RoutingController f2112g;
    public final Messenger h;
    public final Messenger f2113i;
    public final Handler f2115k;
    public n f2119o;
    public final l f2120p;
    public final SparseArray f2114j = new SparseArray();
    public final AtomicInteger f2116l = new AtomicInteger(1);
    public final ag.e f2117m = new ag.e(this, 11);
    public int f2118n = -1;

    public h(l lVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f2120p = lVar;
        this.f2112g = routingController;
        this.f2111f = str;
        Messenger n10 = l.n(routingController);
        this.h = n10;
        if (n10 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new androidx.mediarouter.app.d(this));
        }
        this.f2113i = messenger;
        this.f2115k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f2112g.release();
    }

    @Override
    public final void f(int i10) {
        MediaRouter2.RoutingController routingController = this.f2112g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i10);
        this.f2118n = i10;
        Handler handler = this.f2115k;
        ag.e eVar = this.f2117m;
        handler.removeCallbacks(eVar);
        handler.postDelayed(eVar, 1000L);
    }

    @Override
    public final void i(int i10) {
        MediaRouter2.RoutingController routingController = this.f2112g;
        if (routingController == null) {
            return;
        }
        int i11 = this.f2118n;
        if (i11 < 0) {
            i11 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i11 + i10, this.f2112g.getVolumeMax()));
        this.f2118n = max;
        this.f2112g.setVolume(max);
        Handler handler = this.f2115k;
        ag.e eVar = this.f2117m;
        handler.removeCallbacks(eVar);
        handler.postDelayed(eVar, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o10 = this.f2120p.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f2112g.selectRoute(o10);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o10 = this.f2120p.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f2112g.deselectRoute(o10);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            l lVar = this.f2120p;
            MediaRoute2Info o10 = lVar.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            lVar.f2129r.transferTo(o10);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        n nVar = this.f2119o;
        if (nVar != null) {
            return nVar.d();
        }
        return this.f2112g.getId();
    }

    public final void q(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f2112g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f2116l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f2113i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e6) {
                Log.e("MR2Provider", "Could not send control request to service.", e6);
            }
        }
    }

    public final void r(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f2112g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f2116l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f2113i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e6) {
                Log.e("MR2Provider", "Could not send control request to service.", e6);
            }
        }
    }
}
