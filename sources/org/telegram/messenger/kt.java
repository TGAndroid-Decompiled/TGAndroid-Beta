package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
public final class kt implements fs {
    public static final kt f25281c;
    public static final List d;
    public boolean f25282a;
    public xr f25283b;

    static {
        ?? obj = new Object();
        obj.f25283b = new xr((Object) obj, 2);
        f25281c = obj;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.f25282a = false;
        if (bz.f23175a1) {
            ArrayList arrayList = new ArrayList(bz.f23244z1);
            Collections.sort(arrayList, new dl(12));
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                az azVar = (az) obj;
                if (azVar != bz.B1 && !azVar.f23015c && azVar.d) {
                    SharedPreferences.Editor edit = mp.g1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    azVar.f23013a.i(edit);
                    edit.apply();
                    bz.B1 = azVar;
                    ks.e().k(ks.D4, new Object[0]);
                    ks.e().k(ks.F4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, bz.B1.f23013a);
                    return;
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        xr xrVar = this.f25283b;
        if (i7 == ks.E4) {
            int i11 = bz.f23173a;
            if (mp.g1().getBoolean("proxy_enabled", false) && bz.B1 != null && bz.f23175a1 && bz.f23244z1.size() > 1 && this.f25282a) {
                a();
            }
        } else if (i7 == ks.D4) {
            g0.r(xrVar);
        } else if (i7 == ks.T1 && i10 == j10.f24798t0) {
            int i12 = bz.f23173a;
            if (((mp.g1().getBoolean("proxy_enabled", false) && bz.B1 != null) || bz.f23175a1) && bz.f23244z1.size() > 1) {
                if (ConnectionsManager.getInstance(i10).getConnectionState() == 4) {
                    if (!this.f25282a) {
                        g0.h3(xrVar, ((Integer) d.get(bz.f23178b1)).intValue() * 1000);
                        return;
                    }
                    return;
                }
                g0.r(xrVar);
            }
        }
    }
}
