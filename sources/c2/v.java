package c2;

import android.os.Bundle;
import java.util.ArrayList;
public final class v {
    public ArrayList f2038a = new ArrayList();

    public w a() {
        if (this.f2038a == null) {
            return w.f2041c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f2038a);
        return new w(bundle, this.f2038a);
    }

    public void b(StringBuilder sb) {
        String str;
        if (((Boolean) e2.c.g(1, this.f2038a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb.append(str);
    }

    public void c(StringBuilder sb) {
        while (!this.f2038a.isEmpty()) {
            b(sb);
        }
    }
}
