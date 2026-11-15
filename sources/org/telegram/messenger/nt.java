package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
public final class nt implements is {
    public static final nt f25636c;
    public static final List d;
    public boolean f25637a;
    public as f25638b;

    static {
        ?? obj = new Object();
        obj.f25638b = new as((Object) obj, 2);
        f25636c = obj;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.f25637a = false;
        if (gz.f23934a1) {
            ArrayList arrayList = new ArrayList(gz.f24003z1);
            Collections.sort(arrayList, new gl(12));
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                fz fzVar = (fz) obj;
                if (fzVar != gz.B1 && !fzVar.f23579c && fzVar.d) {
                    SharedPreferences.Editor edit = np.e1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    fzVar.f23577a.i(edit);
                    edit.apply();
                    gz.B1 = fzVar;
                    ns.e().k(ns.A4, new Object[0]);
                    ns.e().k(ns.C4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, gz.B1.f23577a);
                    return;
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        as asVar = this.f25638b;
        if (i7 == ns.B4) {
            int i11 = gz.f23932a;
            if (np.e1().getBoolean("proxy_enabled", false) && gz.B1 != null && gz.f23934a1 && gz.f24003z1.size() > 1 && this.f25637a) {
                a();
            }
        } else if (i7 == ns.A4) {
            g0.r(asVar);
        } else if (i7 == ns.T1 && i10 == m10.f24940t0) {
            int i12 = gz.f23932a;
            if (((np.e1().getBoolean("proxy_enabled", false) && gz.B1 != null) || gz.f23934a1) && gz.f24003z1.size() > 1) {
                if (ConnectionsManager.getInstance(i10).getConnectionState() == 4) {
                    if (!this.f25637a) {
                        g0.i3(asVar, ((Integer) d.get(gz.f23937b1)).intValue() * 1000);
                        return;
                    }
                    return;
                }
                g0.r(asVar);
            }
        }
    }
}
