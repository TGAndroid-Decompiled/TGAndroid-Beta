package kc;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.qg;
public final class f extends HashMap {
    public final int f11068a;
    public final Object f11069b;

    public f(Object obj, int i10) {
        this.f11068a = i10;
        this.f11069b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f11068a) {
            case 1:
                int i10 = ((qg) this.f11069b).v;
                hj0 hj0Var = (hj0) super.get(obj);
                if (hj0Var == null) {
                    pg pgVar = (pg) obj;
                    hj0 hj0Var2 = new hj0(pgVar.f30087c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(pgVar, hj0Var2);
                    return hj0Var2;
                }
                return hj0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f11068a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((i) this.f11069b).f11081f;
                if (str == null) {
                    lowerCase = str;
                } else {
                    lowerCase = str.toLowerCase();
                }
                hashMap.put(lowerCase, str2);
                return (String) super.put(str, str2);
            default:
                return super.put(obj, obj2);
        }
    }
}
