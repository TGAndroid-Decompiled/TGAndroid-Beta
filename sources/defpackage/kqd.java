package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
public final class kqd extends ConnectivityManager.NetworkCallback {
    public final rqd a;

    public kqd(rqd rqdVar) {
        this.a = rqdVar;
    }

    @Override
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a.a(network, linkProperties);
    }

    @Override
    public final void onLost(Network network) {
        rqd rqdVar = this.a;
        synchronized (rqdVar.h) {
            if (rqdVar.d != null && rqdVar.e != null) {
                rqd.j.b("the network is lost", new Object[0]);
                if (rqdVar.e.remove(network)) {
                    rqdVar.d.remove(network);
                }
                rqdVar.b();
            }
        }
    }

    @Override
    public final void onUnavailable() {
        rqd rqdVar = this.a;
        synchronized (rqdVar.h) {
            if (rqdVar.d != null && rqdVar.e != null) {
                rqd.j.b("all networks are unavailable.", new Object[0]);
                rqdVar.d.clear();
                rqdVar.e.clear();
                rqdVar.b();
            }
        }
    }

    @Override
    public final void onAvailable(Network network) {
    }
}
