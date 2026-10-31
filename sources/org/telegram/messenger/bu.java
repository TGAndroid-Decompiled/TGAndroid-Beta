package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
public final class bu implements us {
    public static final bu f14826c;
    public static final List d;
    public boolean f14827a;
    public ms f14828b;

    static {
        ?? obj = new Object();
        obj.f14828b = new ms((Object) obj, 3);
        f14826c = obj;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.f14827a = false;
        if (tz.f18133a1) {
            ArrayList arrayList = new ArrayList(tz.f18202z1);
            Collections.sort(arrayList, new bk(15));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                sz szVar = (sz) obj;
                if (szVar != tz.B1 && !szVar.f17976c && szVar.d) {
                    SharedPreferences.Editor edit = vp.d1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    szVar.f17974a.h(edit);
                    edit.apply();
                    tz.B1 = szVar;
                    zs.e().k(zs.A4, new Object[0]);
                    zs.e().k(zs.C4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, tz.B1.f17974a);
                    return;
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ms msVar = this.f14828b;
        if (i10 == zs.B4) {
            int i12 = tz.f18131a;
            if (vp.d1().getBoolean("proxy_enabled", false) && tz.B1 != null && tz.f18133a1 && tz.f18202z1.size() > 1 && this.f14827a) {
                a();
            }
        } else if (i10 == zs.A4) {
            i0.r(msVar);
        } else if (i10 == zs.T1 && i11 == d20.f15147s0) {
            int i13 = tz.f18131a;
            if (((vp.d1().getBoolean("proxy_enabled", false) && tz.B1 != null) || tz.f18133a1) && tz.f18202z1.size() > 1) {
                if (ConnectionsManager.getInstance(i11).getConnectionState() == 4) {
                    if (!this.f14827a) {
                        i0.h3(msVar, ((Integer) d.get(tz.f18136b1)).intValue() * 1000);
                        return;
                    }
                    return;
                }
                i0.r(msVar);
            }
        }
    }
}
