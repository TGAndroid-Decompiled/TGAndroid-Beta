package kc;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ij0;
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
                ij0 ij0Var = (ij0) super.get(obj);
                if (ij0Var == null) {
                    pg pgVar = (pg) obj;
                    int i11 = pgVar.f30074c;
                    ij0 ij0Var2 = new ij0(i11, AndroidUtilities.dp(i10), String.valueOf(i11), AndroidUtilities.dp(i10));
                    put(pgVar, ij0Var2);
                    return ij0Var2;
                }
                return ij0Var;
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
