package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
public final class lt implements gs {
    public static final lt f25411c;
    public static final List d;
    public boolean f25412a;
    public yr f25413b;

    static {
        ?? obj = new Object();
        obj.f25413b = new yr((Object) obj, 2);
        f25411c = obj;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.f25412a = false;
        if (cz.f23356a1) {
            ArrayList arrayList = new ArrayList(cz.f23425z1);
            Collections.sort(arrayList, new el(12));
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                bz bzVar = (bz) obj;
                if (bzVar != cz.B1 && !bzVar.f23163c && bzVar.d) {
                    SharedPreferences.Editor edit = np.g1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    bzVar.f23161a.i(edit);
                    edit.apply();
                    cz.B1 = bzVar;
                    ls.e().k(ls.D4, new Object[0]);
                    ls.e().k(ls.F4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, cz.B1.f23161a);
                    return;
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        yr yrVar = this.f25413b;
        if (i7 == ls.E4) {
            int i11 = cz.f23354a;
            if (np.g1().getBoolean("proxy_enabled", false) && cz.B1 != null && cz.f23356a1 && cz.f23425z1.size() > 1 && this.f25412a) {
                a();
            }
        } else if (i7 == ls.D4) {
            g0.r(yrVar);
        } else if (i7 == ls.T1 && i10 == k10.f24932t0) {
            int i12 = cz.f23354a;
            if (((np.g1().getBoolean("proxy_enabled", false) && cz.B1 != null) || cz.f23356a1) && cz.f23425z1.size() > 1) {
                if (ConnectionsManager.getInstance(i10).getConnectionState() == 4) {
                    if (!this.f25412a) {
                        g0.h3(yrVar, ((Integer) d.get(cz.f23359b1)).intValue() * 1000);
                        return;
                    }
                    return;
                }
                g0.r(yrVar);
            }
        }
    }
}
