package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
public final class xsd extends ConnectivityManager.NetworkCallback {
    public final etd a;

    public xsd(etd etdVar) {
        this.a = etdVar;
    }

    @Override
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a.a(network, linkProperties);
    }

    @Override
    public final void onLost(Network network) {
        etd etdVar = this.a;
        synchronized (etdVar.h) {
            if (etdVar.d != null && etdVar.e != null) {
                etd.j.b("the network is lost", new Object[0]);
                if (etdVar.e.remove(network)) {
                    etdVar.d.remove(network);
                }
                etdVar.b();
            }
        }
    }

    @Override
    public final void onUnavailable() {
        etd etdVar = this.a;
        synchronized (etdVar.h) {
            if (etdVar.d != null && etdVar.e != null) {
                etd.j.b("all networks are unavailable.", new Object[0]);
                etdVar.d.clear();
                etdVar.e.clear();
                etdVar.b();
            }
        }
    }

    @Override
    public final void onAvailable(Network network) {
    }
}
