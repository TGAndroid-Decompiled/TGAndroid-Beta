package ic;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.xi0;
public final class f extends HashMap {
    public final int f8848a;
    public final Object f8849b;

    public f(Object obj, int i10) {
        this.f8848a = i10;
        this.f8849b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f8848a) {
            case 1:
                int i10 = ((tg) this.f8849b).v;
                xi0 xi0Var = (xi0) super.get(obj);
                if (xi0Var == null) {
                    sg sgVar = (sg) obj;
                    int i11 = sgVar.f32639c;
                    xi0 xi0Var2 = new xi0(i11, AndroidUtilities.dp(i10), String.valueOf(i11), AndroidUtilities.dp(i10));
                    put(sgVar, xi0Var2);
                    return xi0Var2;
                }
                return xi0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f8848a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((i) this.f8849b).f8861f;
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
