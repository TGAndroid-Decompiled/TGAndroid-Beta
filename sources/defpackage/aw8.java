package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
public final class aw8 implements jm7 {
    public static final aw8 c;
    public static final List d;
    public boolean a;
    public pp8 b;

    static {
        ?? obj = new Object();
        obj.b = new pp8(obj, (byte) 11);
        c = obj;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.a = false;
        if (gda.W0) {
            ArrayList arrayList = new ArrayList(gda.v1);
            Collections.sort(arrayList, new qx7((byte) 9));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                fda fdaVar = (fda) obj;
                if (fdaVar != gda.x1 && !fdaVar.c && fdaVar.d) {
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    fdaVar.a.i(edit);
                    edit.apply();
                    gda.x1 = fdaVar;
                    nm7.e().k(nm7.E4, new Object[0]);
                    nm7.e().k(nm7.G4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, gda.x1.a);
                    return;
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        pp8 pp8Var = this.b;
        if (i == nm7.F4) {
            boolean z = gda.a;
            if (oc7.d1().getBoolean("proxy_enabled", false) && gda.x1 != null && gda.W0 && gda.v1.size() > 1 && this.a) {
                a();
            }
        } else if (i == nm7.E4) {
            gm.r(pp8Var);
        } else if (i == nm7.T1 && i2 == z8c.t0) {
            boolean z2 = gda.a;
            if (((oc7.d1().getBoolean("proxy_enabled", false) && gda.x1 != null) || gda.W0) && gda.v1.size() > 1) {
                if (ConnectionsManager.getInstance(i2).getConnectionState() == 4) {
                    if (!this.a) {
                        gm.d3(pp8Var, ((Integer) d.get(gda.X0)).intValue() * 1000);
                        return;
                    }
                    return;
                }
                gm.r(pp8Var);
            }
        }
    }
}
