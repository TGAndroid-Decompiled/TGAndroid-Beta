package ad;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.yj0;
public final class f extends HashMap {
    public final int f518a;
    public final Object f519b;

    public f(Object obj, int i10) {
        this.f518a = i10;
        this.f519b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f518a) {
            case 1:
                int i10 = ((bh) this.f519b).v;
                yj0 yj0Var = (yj0) super.get(obj);
                if (yj0Var == null) {
                    ah ahVar = (ah) obj;
                    yj0 yj0Var2 = new yj0(ahVar.f23244c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(ahVar, yj0Var2);
                    return yj0Var2;
                }
                return yj0Var;
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
                HashMap hashMap = ((i) this.f519b).f529f;
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
