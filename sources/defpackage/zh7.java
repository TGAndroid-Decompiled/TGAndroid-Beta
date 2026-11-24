package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public final class zh7 implements Iterable {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();

    public zh7(HashMap hashMap) {
        String str = (String) hashMap.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    this.a.put(split[0], split[1]);
                }
            }
        }
    }

    public final void h() {
        Iterator it = this.b.iterator();
        if (!it.hasNext()) {
            return;
        }
        throw ls6.l(it);
    }

    @Override
    public final Iterator iterator() {
        return this.a.keySet().iterator();
    }
}
