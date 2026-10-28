package bd;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.zg;
public final class e extends HashMap {
    public final int f3869a;
    public final Object f3870b;

    public e(Object obj, int i10) {
        this.f3869a = i10;
        this.f3870b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f3869a) {
            case 1:
                int i10 = ((ah) this.f3870b).v;
                yj0 yj0Var = (yj0) super.get(obj);
                if (yj0Var == null) {
                    zg zgVar = (zg) obj;
                    yj0 yj0Var2 = new yj0(zgVar.f35336c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(zgVar, yj0Var2);
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
        switch (this.f3869a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((h) this.f3870b).f3880f;
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
