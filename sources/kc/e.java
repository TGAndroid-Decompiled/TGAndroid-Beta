package kc;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.qg;
public final class e extends HashMap {
    public final int f10280a;
    public final Object f10281b;

    public e(Object obj, int i10) {
        this.f10280a = i10;
        this.f10281b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f10280a) {
            case 1:
                int i10 = ((qg) this.f10281b).v;
                gj0 gj0Var = (gj0) super.get(obj);
                if (gj0Var == null) {
                    pg pgVar = (pg) obj;
                    gj0 gj0Var2 = new gj0(pgVar.f27853c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
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
        switch (this.f10280a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((h) this.f10281b).f10291f;
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
