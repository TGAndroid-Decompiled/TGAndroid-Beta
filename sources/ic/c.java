package ic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public final class c implements Iterable {
    public final HashMap f8834a = new HashMap();
    public final ArrayList f8835b = new ArrayList();

    public c(HashMap hashMap) {
        String str = (String) hashMap.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    this.f8834a.put(split[0], split[1]);
                }
            }
        }
    }

    public final void i() {
        Iterator it = this.f8835b.iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override
    public final Iterator iterator() {
        return this.f8834a.keySet().iterator();
    }
}
