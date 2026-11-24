package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class rqd {
    public static final ce6 j = new ce6("ConnectivityMonitor", null);
    public final oef a;
    public final ConnectivityManager c;
    public boolean f;
    public final Context g;
    public final Object h = new Object();
    public final Set i = DesugarCollections.synchronizedSet(new HashSet());
    public final Map d = DesugarCollections.synchronizedMap(new HashMap());
    public final List e = DesugarCollections.synchronizedList(new ArrayList());
    public final kqd b = new kqd(this);

    public rqd(Context context, oef oefVar) {
        this.a = oefVar;
        this.g = context;
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(Network network, LinkProperties linkProperties) {
        synchronized (this.h) {
            if (this.d != null && this.e != null) {
                j.b("a new network is available", new Object[0]);
                if (this.d.containsKey(network)) {
                    this.e.remove(network);
                }
                this.d.put(network, linkProperties);
                this.e.add(network);
                b();
            }
        }
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        synchronized (this.i) {
            for (Object obj : this.i) {
                if (obj == null) {
                    if (!this.a.a.isShutdown()) {
                        this.a.execute(new eqd(this, (byte) 0));
                    }
                } else {
                    throw new ClassCastException();
                }
            }
        }
    }
}
