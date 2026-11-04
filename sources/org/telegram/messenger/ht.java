package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
public final class ht implements cs {
    public static final ht f23368c;
    public static final List d;
    public boolean f23369a;
    public vs f23370b;

    static {
        ?? obj = new Object();
        obj.f23370b = new vs((Object) obj, 2);
        f23368c = obj;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.f23369a = false;
        if (az.f21614a1) {
            ArrayList arrayList = new ArrayList(az.f21683z1);
            Collections.sort(arrayList, new tq(3));
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                zy zyVar = (zy) obj;
                if (zyVar != az.B1 && !zyVar.f26995c && zyVar.d) {
                    SharedPreferences.Editor edit = hp.e1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    zyVar.f26993a.i(edit);
                    edit.apply();
                    az.B1 = zyVar;
                    hs.e().k(hs.A4, new Object[0]);
                    hs.e().k(hs.C4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, az.B1.f26993a);
                    return;
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        vs vsVar = this.f23370b;
        if (i3 == hs.B4) {
            int i11 = az.f21612a;
            if (hp.e1().getBoolean("proxy_enabled", false) && az.B1 != null && az.f21614a1 && az.f21683z1.size() > 1 && this.f23369a) {
                a();
            }
        } else if (i3 == hs.A4) {
            g0.r(vsVar);
        } else if (i3 == hs.T1 && i10 == h10.f22829t0) {
            int i12 = az.f21612a;
            if (((hp.e1().getBoolean("proxy_enabled", false) && az.B1 != null) || az.f21614a1) && az.f21683z1.size() > 1) {
                if (ConnectionsManager.getInstance(i10).getConnectionState() == 4) {
                    if (!this.f23369a) {
                        g0.i3(vsVar, ((Integer) d.get(az.f21617b1)).intValue() * 1000);
                        return;
                    }
                    return;
                }
                g0.r(vsVar);
            }
        }
    }
}
