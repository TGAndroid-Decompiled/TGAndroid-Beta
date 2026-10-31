package org.telegram.messenger;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
public final class v0 extends ConnectivityManager.NetworkCallback {
    @Override
    public final void onAvailable(Network network) {
        w0.f19029r = -1;
    }

    @Override
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        w0.f19029r = -1;
    }
}
