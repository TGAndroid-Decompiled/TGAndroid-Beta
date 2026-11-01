package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
public final class cu implements vs {
    public static final cu f15209c;
    public static final List d;
    public boolean f15210a;
    public ns f15211b;

    static {
        ?? obj = new Object();
        obj.f15211b = new ns((Object) obj, 3);
        f15209c = obj;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.f15210a = false;
        if (uz.f18502a1) {
            ArrayList arrayList = new ArrayList(uz.f18571z1);
            Collections.sort(arrayList, new ck(15));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tz tzVar = (tz) obj;
                if (tzVar != uz.B1 && !tzVar.f18327c && tzVar.d) {
                    SharedPreferences.Editor edit = wp.d1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    tzVar.f18325a.h(edit);
                    edit.apply();
                    uz.B1 = tzVar;
                    at.e().k(at.A4, new Object[0]);
                    at.e().k(at.C4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, uz.B1.f18325a);
                    return;
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ns nsVar = this.f15211b;
        if (i10 == at.B4) {
            int i12 = uz.f18500a;
            if (wp.d1().getBoolean("proxy_enabled", false) && uz.B1 != null && uz.f18502a1 && uz.f18571z1.size() > 1 && this.f15210a) {
                a();
            }
        } else if (i10 == at.A4) {
            i0.r(nsVar);
        } else if (i10 == at.T1 && i11 == e20.f15506s0) {
            int i13 = uz.f18500a;
            if (((wp.d1().getBoolean("proxy_enabled", false) && uz.B1 != null) || uz.f18502a1) && uz.f18571z1.size() > 1) {
                if (ConnectionsManager.getInstance(i11).getConnectionState() == 4) {
                    if (!this.f15210a) {
                        i0.h3(nsVar, ((Integer) d.get(uz.f18505b1)).intValue() * 1000);
                        return;
                    }
                    return;
                }
                i0.r(nsVar);
            }
        }
    }
}
