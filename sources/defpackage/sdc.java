package defpackage;

import java.util.LinkedHashMap;
public final class sdc {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        for (odc odcVar : linkedHashMap.values()) {
            odcVar.a();
        }
        linkedHashMap.clear();
    }
}
