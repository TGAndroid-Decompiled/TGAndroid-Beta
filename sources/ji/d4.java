package ji;

import android.os.Bundle;
import java.util.ArrayList;
public final class d4 {
    public ArrayList f13236a = new ArrayList();

    public p4.r a() {
        if (this.f13236a == null) {
            return p4.r.f42795c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f13236a);
        return new p4.r(bundle, this.f13236a);
    }

    public void b(StringBuilder sb2) {
        String str;
        if (((Boolean) i2.d.A(1, this.f13236a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void c(StringBuilder sb2) {
        while (!this.f13236a.isEmpty()) {
            b(sb2);
        }
    }
}
