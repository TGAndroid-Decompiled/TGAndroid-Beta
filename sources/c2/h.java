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
    public final String f2842f;
    public final MediaRouter2.RoutingController f2843g;
    public final Messenger h;
    public final Messenger f2844i;
    public final Handler f2846k;
    public n f2850o;
    public final l f2851p;
    public final SparseArray f2845j = new SparseArray();
    public final AtomicInteger f2847l = new AtomicInteger(1);
    public final a4.g f2848m = new a4.g(this, 23);
    public int f2849n = -1;

    public h(l lVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f2851p = lVar;
        this.f2843g = routingController;
        this.f2842f = str;
        Messenger n10 = l.n(routingController);
        this.h = n10;
        if (n10 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new a4.d(this));
        }
        this.f2844i = messenger;
        this.f2846k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f2843g.release();
    }

    @Override
    public final void f(int i10) {
        MediaRouter2.RoutingController routingController = this.f2843g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i10);
        this.f2849n = i10;
        Handler handler = this.f2846k;
        a4.g gVar = this.f2848m;
        handler.removeCallbacks(gVar);
        handler.postDelayed(gVar, 1000L);
    }

    @Override
    public final void i(int i10) {
        MediaRouter2.RoutingController routingController = this.f2843g;
        if (routingController == null) {
            return;
        }
        int i11 = this.f2849n;
        if (i11 < 0) {
            i11 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i11 + i10, this.f2843g.getVolumeMax()));
        this.f2849n = max;
        this.f2843g.setVolume(max);
        Handler handler = this.f2846k;
        a4.g gVar = this.f2848m;
        handler.removeCallbacks(gVar);
        handler.postDelayed(gVar, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o10 = this.f2851p.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f2843g.selectRoute(o10);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o10 = this.f2851p.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f2843g.deselectRoute(o10);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            l lVar = this.f2851p;
            MediaRoute2Info o10 = lVar.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            lVar.f2859r.transferTo(o10);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        n nVar = this.f2850o;
        if (nVar != null) {
            return nVar.d();
        }
        return this.f2843g.getId();
    }

    public final void q(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f2843g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f2847l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f2844i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e10) {
                Log.e("MR2Provider", "Could not send control request to service.", e10);
            }
        }
    }

    public final void r(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f2843g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f2847l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f2844i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e10) {
                Log.e("MR2Provider", "Could not send control request to service.", e10);
            }
        }
    }
}
