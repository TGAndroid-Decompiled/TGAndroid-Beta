package ad;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.yg;
public final class g extends HashMap {
    public final int f518a;
    public final Object f519b;

    public g(Object obj, int i10) {
        this.f518a = i10;
        this.f519b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f518a) {
            case 1:
                int i10 = ((yg) this.f519b).v;
                xj0 xj0Var = (xj0) super.get(obj);
                if (xj0Var == null) {
                    xg xgVar = (xg) obj;
                    xj0 xj0Var2 = new xj0(xgVar.f32577c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(xgVar, xj0Var2);
                    return xj0Var2;
                }
                return xj0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f518a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((j) this.f519b).f529f;
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
