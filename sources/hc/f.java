package hc;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.oi0;

public final class f extends HashMap {

    public final int f8884a;

    public final Object f8885b;

    public f(Object obj, int i10) {
        this.f8884a = i10;
        this.f8885b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f8884a) {
            case 1:
                int i10 = ((mg) this.f8885b).v;
                oi0 oi0Var = (oi0) super.get(obj);
                if (oi0Var != null) {
                    return oi0Var;
                }
                lg lgVar = (lg) obj;
                int i11 = lgVar.f30374c;
                oi0 oi0Var2 = new oi0(i11, AndroidUtilities.dp(i10), String.valueOf(i11), AndroidUtilities.dp(i10));
                put(lgVar, oi0Var2);
                return oi0Var2;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        switch (this.f8884a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                ((i) this.f8885b).f8897f.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put(str, str2);
            default:
                return super.put(obj, obj2);
        }
    }
}
