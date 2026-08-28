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
public final class h extends q {
    public final String f2169f;
    public final MediaRouter2.RoutingController f2170g;
    public final Messenger h;
    public final Messenger f2171i;
    public final Handler f2173k;
    public n f2177o;
    public final l f2178p;
    public final SparseArray f2172j = new SparseArray();
    public final AtomicInteger f2174l = new AtomicInteger(1);
    public final af.e f2175m = new af.e(this, 17);
    public int f2176n = -1;

    public h(l lVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f2178p = lVar;
        this.f2170g = routingController;
        this.f2169f = str;
        Messenger n10 = l.n(routingController);
        this.h = n10;
        if (n10 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new androidx.mediarouter.app.d(this));
        }
        this.f2171i = messenger;
        this.f2173k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f2170g.release();
    }

    @Override
    public final void f(int i9) {
        MediaRouter2.RoutingController routingController = this.f2170g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i9);
        this.f2176n = i9;
        Handler handler = this.f2173k;
        af.e eVar = this.f2175m;
        handler.removeCallbacks(eVar);
        handler.postDelayed(eVar, 1000L);
    }

    @Override
    public final void i(int i9) {
        MediaRouter2.RoutingController routingController = this.f2170g;
        if (routingController == null) {
            return;
        }
        int i10 = this.f2176n;
        if (i10 < 0) {
            i10 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i10 + i9, this.f2170g.getVolumeMax()));
        this.f2176n = max;
        this.f2170g.setVolume(max);
        Handler handler = this.f2173k;
        af.e eVar = this.f2175m;
        handler.removeCallbacks(eVar);
        handler.postDelayed(eVar, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o6 = this.f2178p.o(str);
            if (o6 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f2170g.selectRoute(o6);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o6 = this.f2178p.o(str);
            if (o6 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f2170g.deselectRoute(o6);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            l lVar = this.f2178p;
            MediaRoute2Info o6 = lVar.o(str);
            if (o6 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            lVar.f2187r.transferTo(o6);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        n nVar = this.f2177o;
        if (nVar != null) {
            return nVar.d();
        }
        return this.f2170g.getId();
    }

    public final void q(int i9, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f2170g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f2174l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i9);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f2171i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e10) {
                Log.e("MR2Provider", "Could not send control request to service.", e10);
            }
        }
    }

    public final void r(int i9, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f2170g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f2174l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i9);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f2171i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e10) {
                Log.e("MR2Provider", "Could not send control request to service.", e10);
            }
        }
    }
}
