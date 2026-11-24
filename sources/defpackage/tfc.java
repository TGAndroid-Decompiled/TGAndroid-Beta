package defpackage;

import java.util.LinkedHashMap;
public final class tfc {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        for (pfc pfcVar : linkedHashMap.values()) {
            pfcVar.a();
        }
        linkedHashMap.clear();
    }
}
