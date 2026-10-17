package ad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public final class c implements Iterable {
    public final HashMap f502a = new HashMap();
    public final ArrayList f503b = new ArrayList();

    public c(HashMap hashMap) {
        String str = (String) hashMap.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    this.f502a.put(split[0], split[1]);
                }
            }
        }
    }

    public final void h() {
        Iterator it = this.f503b.iterator();
        if (!it.hasNext()) {
            return;
        }
        throw a1.g.j(it);
    }

    @Override
    public final Iterator iterator() {
        return this.f502a.keySet().iterator();
    }
}
