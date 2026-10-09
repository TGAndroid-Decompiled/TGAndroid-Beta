package ii;

import android.os.Bundle;
import java.util.ArrayList;
public final class d4 {
    public ArrayList f12348a = new ArrayList();

    public p4.r a() {
        if (this.f12348a == null) {
            return p4.r.f45420c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f12348a);
        return new p4.r(bundle, this.f12348a);
    }

    public void b(StringBuilder sb2) {
        String str;
        if (((Boolean) hg.c.x(1, this.f12348a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void c(StringBuilder sb2) {
        while (!this.f12348a.isEmpty()) {
            b(sb2);
        }
    }
}
