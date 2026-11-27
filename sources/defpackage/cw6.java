package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
public final class cw6 {
    public ArrayList a;

    public cw6(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                if (str != null) {
                    ArrayList arrayList2 = this.a;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        this.a = arrayList2;
                    }
                    if (!arrayList2.contains(str)) {
                        this.a.add(str);
                    }
                } else {
                    lq5.j("category must not be null");
                    return;
                }
            }
        }
    }

    public final dw6 b() {
        if (this.a == null) {
            return dw6.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new dw6(bundle, this.a);
    }
}
