package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
public final class kt implements fs {
    public static final kt f25352c;
    public static final List d;
    public boolean f25353a;
    public xr f25354b;

    static {
        ?? obj = new Object();
        obj.f25354b = new xr((Object) obj, 2);
        f25352c = obj;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.f25353a = false;
        if (bz.f23272a1) {
            ArrayList arrayList = new ArrayList(bz.f23341z1);
            Collections.sort(arrayList, new dl(12));
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                az azVar = (az) obj;
                if (azVar != bz.B1 && !azVar.f23098c && azVar.d) {
                    SharedPreferences.Editor edit = mp.g1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    azVar.f23096a.i(edit);
                    edit.apply();
                    bz.B1 = azVar;
                    ks.e().k(ks.D4, new Object[0]);
                    ks.e().k(ks.F4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, bz.B1.f23096a);
                    return;
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        xr xrVar = this.f25354b;
        if (i7 == ks.E4) {
            int i11 = bz.f23270a;
            if (mp.g1().getBoolean("proxy_enabled", false) && bz.B1 != null && bz.f23272a1 && bz.f23341z1.size() > 1 && this.f25353a) {
                a();
            }
        } else if (i7 == ks.D4) {
            g0.r(xrVar);
        } else if (i7 == ks.T1 && i10 == i10.f24637t0) {
            int i12 = bz.f23270a;
            if (((mp.g1().getBoolean("proxy_enabled", false) && bz.B1 != null) || bz.f23272a1) && bz.f23341z1.size() > 1) {
                if (ConnectionsManager.getInstance(i10).getConnectionState() == 4) {
                    if (!this.f25353a) {
                        g0.h3(xrVar, ((Integer) d.get(bz.f23275b1)).intValue() * 1000);
                        return;
                    }
                    return;
                }
                g0.r(xrVar);
            }
        }
    }
}
