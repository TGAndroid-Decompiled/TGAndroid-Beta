package c5;

import android.os.Bundle;
import java.util.ArrayList;
public final class m {
    public ArrayList f4326a = new ArrayList();

    public p4.r a() {
        if (this.f4326a == null) {
            return p4.r.f39767c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f4326a);
        return new p4.r(bundle, this.f4326a);
    }

    public void b(StringBuilder sb2) {
        String str;
        if (((Boolean) hc.b.z(1, this.f4326a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void c(StringBuilder sb2) {
        while (!this.f4326a.isEmpty()) {
            b(sb2);
        }
    }
}
