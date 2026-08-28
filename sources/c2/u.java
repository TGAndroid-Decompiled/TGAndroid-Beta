package c2;

import android.os.Bundle;
import java.util.ArrayList;
public final class u {
    public ArrayList f2235a;

    public u(int i9) {
        switch (i9) {
            case 2:
                this.f2235a = new ArrayList();
                return;
            default:
                this.f2235a = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
        }
    }

    public v a() {
        if (this.f2235a == null) {
            return v.f2236c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f2235a);
        return new v(bundle, this.f2235a);
    }

    public void b(StringBuilder sb2) {
        String str;
        if (((Boolean) e2.c.k(1, this.f2235a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void c(StringBuilder sb2) {
        while (!this.f2235a.isEmpty()) {
            b(sb2);
        }
    }
}
