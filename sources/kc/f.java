package kc;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.qg;
public final class f extends HashMap {
    public final int f10301a;
    public final Object f10302b;

    public f(Object obj, int i10) {
        this.f10301a = i10;
        this.f10302b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f10301a) {
            case 1:
                int i10 = ((qg) this.f10302b).v;
                gj0 gj0Var = (gj0) super.get(obj);
                if (gj0Var == null) {
                    pg pgVar = (pg) obj;
                    int i11 = pgVar.f27836c;
                    gj0 gj0Var2 = new gj0(i11, AndroidUtilities.dp(i10), String.valueOf(i11), AndroidUtilities.dp(i10));
                    put(pgVar, gj0Var2);
                    return gj0Var2;
                }
                return gj0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f10301a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((i) this.f10302b).f10312f;
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
