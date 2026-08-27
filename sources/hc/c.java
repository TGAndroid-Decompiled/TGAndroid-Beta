package hc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class c implements Iterable {

    public final HashMap f8870a = new HashMap();

    public final ArrayList f8871b = new ArrayList();

    public c(HashMap map) {
        String str = (String) map.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] strArrSplit = str2.trim().split("=");
                if (strArrSplit.length == 2) {
                    this.f8870a.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
    }

    public final void i() {
        Iterator it = this.f8871b.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override
    public final Iterator iterator() {
        return this.f8870a.keySet().iterator();
    }
}
