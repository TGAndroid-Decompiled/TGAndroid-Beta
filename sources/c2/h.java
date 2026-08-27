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

    public final String f2282f;

    public final MediaRouter2.RoutingController f2283g;
    public final Messenger h;

    public final Messenger f2284i;

    public final Handler f2286k;

    public n f2290o;

    public final l f2291p;

    public final SparseArray f2285j = new SparseArray();

    public final AtomicInteger f2287l = new AtomicInteger(1);

    public final af.e f2288m = new af.e(this, 17);

    public int f2289n = -1;

    public h(l lVar, MediaRouter2.RoutingController routingController, String str) {
        this.f2291p = lVar;
        this.f2283g = routingController;
        this.f2282f = str;
        Messenger messengerN = l.n(routingController);
        this.h = messengerN;
        this.f2284i = messengerN == null ? null : new Messenger(new androidx.mediarouter.app.c(this));
        this.f2286k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f2283g.release();
    }

    @Override
    public final void f(int i10) {
        MediaRouter2.RoutingController routingController = this.f2283g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i10);
        this.f2289n = i10;
        Handler handler = this.f2286k;
        af.e eVar = this.f2288m;
        handler.removeCallbacks(eVar);
        handler.postDelayed(eVar, 1000L);
    }

    @Override
    public final void i(int i10) {
        MediaRouter2.RoutingController routingController = this.f2283g;
        if (routingController == null) {
            return;
        }
        int volume = this.f2289n;
        if (volume < 0) {
            volume = routingController.getVolume();
        }
        int iMax = Math.max(0, Math.min(volume + i10, this.f2283g.getVolumeMax()));
        this.f2289n = iMax;
        this.f2283g.setVolume(iMax);
        Handler handler = this.f2286k;
        af.e eVar = this.f2288m;
        handler.removeCallbacks(eVar);
        handler.postDelayed(eVar, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info mediaRoute2InfoO = this.f2291p.o(str);
        if (mediaRoute2InfoO == null) {
            Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.f2283g.selectRoute(mediaRoute2InfoO);
        }
    }

    @Override
    public final void n(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info mediaRoute2InfoO = this.f2291p.o(str);
        if (mediaRoute2InfoO == null) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.f2283g.deselectRoute(mediaRoute2InfoO);
        }
    }

    @Override
    public final void o(List list) {
        if (list == null || list.isEmpty()) {
            Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
            return;
        }
        String str = (String) list.get(0);
        l lVar = this.f2291p;
        MediaRoute2Info mediaRoute2InfoO = lVar.o(str);
        if (mediaRoute2InfoO != null) {
            lVar.f2300r.transferTo(mediaRoute2InfoO);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
    }

    public final String p() {
        n nVar = this.f2290o;
        return nVar != null ? nVar.d() : this.f2283g.getId();
    }

    public final void q(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f2283g;
        if (routingController == null || routingController.isReleased() || (messenger = this.h) == null) {
            return;
        }
        int andIncrement = this.f2287l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i10);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.f2284i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e9) {
            Log.e("MR2Provider", "Could not send control request to service.", e9);
        }
    }

    public final void r(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f2283g;
        if (routingController == null || routingController.isReleased() || (messenger = this.h) == null) {
            return;
        }
        int andIncrement = this.f2287l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 8;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i10);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.f2284i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e9) {
            Log.e("MR2Provider", "Could not send control request to service.", e9);
        }
    }
}
