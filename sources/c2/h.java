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
    public final String f1943f;
    public final MediaRouter2.RoutingController f1944g;
    public final Messenger h;
    public final Messenger f1945i;
    public final Handler f1947k;
    public n f1951o;
    public final l f1952p;
    public final SparseArray f1946j = new SparseArray();
    public final AtomicInteger f1948l = new AtomicInteger(1);
    public final ag.d f1949m = new ag.d(this, 10);
    public int f1950n = -1;

    public h(l lVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f1952p = lVar;
        this.f1944g = routingController;
        this.f1943f = str;
        Messenger n10 = l.n(routingController);
        this.h = n10;
        if (n10 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new androidx.mediarouter.app.d(this));
        }
        this.f1945i = messenger;
        this.f1947k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f1944g.release();
    }

    @Override
    public final void f(int i10) {
        MediaRouter2.RoutingController routingController = this.f1944g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i10);
        this.f1950n = i10;
        Handler handler = this.f1947k;
        ag.d dVar = this.f1949m;
        handler.removeCallbacks(dVar);
        handler.postDelayed(dVar, 1000L);
    }

    @Override
    public final void i(int i10) {
        MediaRouter2.RoutingController routingController = this.f1944g;
        if (routingController == null) {
            return;
        }
        int i11 = this.f1950n;
        if (i11 < 0) {
            i11 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i11 + i10, this.f1944g.getVolumeMax()));
        this.f1950n = max;
        this.f1944g.setVolume(max);
        Handler handler = this.f1947k;
        ag.d dVar = this.f1949m;
        handler.removeCallbacks(dVar);
        handler.postDelayed(dVar, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o10 = this.f1952p.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f1944g.selectRoute(o10);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o10 = this.f1952p.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f1944g.deselectRoute(o10);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            l lVar = this.f1952p;
            MediaRoute2Info o10 = lVar.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            lVar.f1961r.transferTo(o10);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        n nVar = this.f1951o;
        if (nVar != null) {
            return nVar.d();
        }
        return this.f1944g.getId();
    }

    public final void q(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f1944g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f1948l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f1945i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e) {
                Log.e("MR2Provider", "Could not send control request to service.", e);
            }
        }
    }

    public final void r(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f1944g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f1948l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f1945i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e) {
                Log.e("MR2Provider", "Could not send control request to service.", e);
            }
        }
    }
}
