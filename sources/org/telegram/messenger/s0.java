package org.telegram.messenger;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
public final class s0 extends ConnectivityManager.NetworkCallback {
    @Override
    public final void onAvailable(Network network) {
        t0.f25568r = -1;
    }

    @Override
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        t0.f25568r = -1;
    }
}
