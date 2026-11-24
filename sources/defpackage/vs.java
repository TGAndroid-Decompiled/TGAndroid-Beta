package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.telegram.messenger.a;
public final class vs extends ConnectivityManager.NetworkCallback {
    @Override
    public final void onAvailable(Network network) {
        a.r = -1;
    }

    @Override
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        a.r = -1;
    }
}
