package ii;

import android.os.Bundle;
import java.util.ArrayList;
public final class d4 {
    public ArrayList f12347a = new ArrayList();

    public p4.r a() {
        if (this.f12347a == null) {
            return p4.r.f45490c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f12347a);
        return new p4.r(bundle, this.f12347a);
    }

    public void b(StringBuilder sb2) {
        String str;
        if (((Boolean) hg.c.x(1, this.f12347a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void c(StringBuilder sb2) {
        while (!this.f12347a.isEmpty()) {
            b(sb2);
        }
    }
}
