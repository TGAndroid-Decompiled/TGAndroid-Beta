package ad;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.yj0;
public final class f extends HashMap {
    public final int f514a;
    public final Object f515b;

    public f(Object obj, int i10) {
        this.f514a = i10;
        this.f515b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f514a) {
            case 1:
                int i10 = ((bh) this.f515b).v;
                yj0 yj0Var = (yj0) super.get(obj);
                if (yj0Var == null) {
                    ah ahVar = (ah) obj;
                    yj0 yj0Var2 = new yj0(ahVar.f23555c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
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
        switch (this.f514a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((i) this.f515b).f525f;
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
