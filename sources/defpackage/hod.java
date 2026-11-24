package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
public final class hod extends ConnectivityManager.NetworkCallback {
    public final ood a;

    public hod(ood oodVar) {
        this.a = oodVar;
    }

    @Override
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a.a(network, linkProperties);
    }

    @Override
    public final void onLost(Network network) {
        ood oodVar = this.a;
        synchronized (oodVar.h) {
            if (oodVar.d != null && oodVar.e != null) {
                ood.j.b("the network is lost", new Object[0]);
                if (oodVar.e.remove(network)) {
                    oodVar.d.remove(network);
                }
                oodVar.b();
            }
        }
    }

    @Override
    public final void onUnavailable() {
        ood oodVar = this.a;
        synchronized (oodVar.h) {
            if (oodVar.d != null && oodVar.e != null) {
                ood.j.b("all networks are unavailable.", new Object[0]);
                oodVar.d.clear();
                oodVar.e.clear();
                oodVar.b();
            }
        }
    }

    @Override
    public final void onAvailable(Network network) {
    }
}
