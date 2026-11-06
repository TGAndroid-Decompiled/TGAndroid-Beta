package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
public final class qt implements ls {
    public static final qt f25130c;
    public static final List d;
    public boolean f25131a;
    public ds f25132b;

    static {
        ?? obj = new Object();
        obj.f25132b = new ds((Object) obj, 2);
        f25130c = obj;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.f25131a = false;
        if (iz.f23366a1) {
            ArrayList arrayList = new ArrayList(iz.f23435z1);
            Collections.sort(arrayList, new vj(13));
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                hz hzVar = (hz) obj;
                if (hzVar != iz.B1 && !hzVar.f23005c && hzVar.d) {
                    SharedPreferences.Editor edit = qp.e1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    hzVar.f23003a.i(edit);
                    edit.apply();
                    iz.B1 = hzVar;
                    qs.e().k(qs.A4, new Object[0]);
                    qs.e().k(qs.C4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, iz.B1.f23003a);
                    return;
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ds dsVar = this.f25132b;
        if (i7 == qs.B4) {
            int i11 = iz.f23364a;
            if (qp.e1().getBoolean("proxy_enabled", false) && iz.B1 != null && iz.f23366a1 && iz.f23435z1.size() > 1 && this.f25131a) {
                a();
            }
        } else if (i7 == qs.A4) {
            g0.r(dsVar);
        } else if (i7 == qs.T1 && i10 == p10.f24467s0) {
            int i12 = iz.f23364a;
            if (((qp.e1().getBoolean("proxy_enabled", false) && iz.B1 != null) || iz.f23366a1) && iz.f23435z1.size() > 1) {
                if (ConnectionsManager.getInstance(i10).getConnectionState() == 4) {
                    if (!this.f25131a) {
                        g0.i3(dsVar, ((Integer) d.get(iz.f23369b1)).intValue() * 1000);
                        return;
                    }
                    return;
                }
                g0.r(dsVar);
            }
        }
    }
}
