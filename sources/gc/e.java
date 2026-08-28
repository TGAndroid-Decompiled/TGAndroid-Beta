package gc;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.qg;
public final class e extends HashMap {
    public final int f7712a;
    public final Object f7713b;

    public e(Object obj, int i9) {
        this.f7712a = i9;
        this.f7713b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f7712a) {
            case 1:
                int i9 = ((qg) this.f7713b).v;
                mi0 mi0Var = (mi0) super.get(obj);
                if (mi0Var == null) {
                    pg pgVar = (pg) obj;
                    int i10 = pgVar.f31647c;
                    mi0 mi0Var2 = new mi0(i10, AndroidUtilities.dp(i9), String.valueOf(i10), AndroidUtilities.dp(i9));
                    put(pgVar, mi0Var2);
                    return mi0Var2;
                }
                return mi0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f7712a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((h) this.f7713b).f7725f;
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
