package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
public final class zt8 implements gk7 {
    public static final zt8 c;
    public static final List d;
    public boolean a;
    public sr8 b;

    static {
        ?? obj = new Object();
        obj.b = new sr8(obj, (byte) 3);
        c = obj;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.a = false;
        if (gba.W0) {
            ArrayList arrayList = new ArrayList(gba.v1);
            Collections.sort(arrayList, new fx7((byte) 8));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                fba fbaVar = (fba) obj;
                if (fbaVar != gba.x1 && !fbaVar.c && fbaVar.d) {
                    SharedPreferences.Editor edit = na7.c1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    fbaVar.a.i(edit);
                    edit.apply();
                    gba.x1 = fbaVar;
                    kk7.e().k(kk7.C4, new Object[0]);
                    kk7.e().k(kk7.E4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, gba.x1.a);
                    return;
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        sr8 sr8Var = this.b;
        if (i == kk7.D4) {
            boolean z = gba.a;
            if (na7.c1().getBoolean("proxy_enabled", false) && gba.x1 != null && gba.W0 && gba.v1.size() > 1 && this.a) {
                a();
            }
        } else if (i == kk7.C4) {
            gl.r(sr8Var);
        } else if (i == kk7.S1 && i2 == y6c.t0) {
            boolean z2 = gba.a;
            if (((na7.c1().getBoolean("proxy_enabled", false) && gba.x1 != null) || gba.W0) && gba.v1.size() > 1) {
                if (ConnectionsManager.getInstance(i2).getConnectionState() == 4) {
                    if (!this.a) {
                        gl.d3(sr8Var, ((Integer) d.get(gba.X0)).intValue() * 1000);
                        return;
                    }
                    return;
                }
                gl.r(sr8Var);
            }
        }
    }
}
