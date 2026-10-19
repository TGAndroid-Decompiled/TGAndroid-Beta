package ad;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.zg;
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
                int i10 = ((ah) this.f519b).v;
                uj0 uj0Var = (uj0) super.get(obj);
                if (uj0Var == null) {
                    zg zgVar = (zg) obj;
                    uj0 uj0Var2 = new uj0(zgVar.f32924c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(zgVar, uj0Var2);
                    return uj0Var2;
                }
                return uj0Var;
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
