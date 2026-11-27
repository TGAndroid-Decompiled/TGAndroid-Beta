package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
public final class ix8 implements fn7 {
    public static final ix8 c;
    public static final List d;
    public boolean a;
    public uk8 b;

    static {
        ?? obj = new Object();
        obj.b = new uk8(obj, (byte) 19);
        c = obj;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.a = false;
        if (xea.W0) {
            ArrayList arrayList = new ArrayList(xea.v1);
            Collections.sort(arrayList, new qq7((byte) 11));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                wea weaVar = (wea) obj;
                if (weaVar != xea.x1 && !weaVar.c && weaVar.d) {
                    SharedPreferences.Editor edit = uc7.e1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    weaVar.a.i(edit);
                    edit.apply();
                    xea.x1 = weaVar;
                    jn7.e().k(jn7.D4, new Object[0]);
                    jn7.e().k(jn7.F4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, xea.x1.a);
                    return;
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        uk8 uk8Var = this.b;
        if (i == jn7.E4) {
            boolean z = xea.a;
            if (uc7.e1().getBoolean("proxy_enabled", false) && xea.x1 != null && xea.W0 && xea.v1.size() > 1 && this.a) {
                a();
            }
        } else if (i == jn7.D4) {
            hl.r(uk8Var);
        } else if (i == jn7.T1 && i2 == yac.t0) {
            boolean z2 = xea.a;
            if (((uc7.e1().getBoolean("proxy_enabled", false) && xea.x1 != null) || xea.W0) && xea.v1.size() > 1) {
                if (ConnectionsManager.getInstance(i2).getConnectionState() == 4) {
                    if (!this.a) {
                        hl.d3(uk8Var, ((Integer) d.get(xea.X0)).intValue() * 1000);
                        return;
                    }
                    return;
                }
                hl.r(uk8Var);
            }
        }
    }
}
