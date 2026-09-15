package d7;

import hg.k0;
import java.util.ArrayList;
public final class c {
    public final ArrayList f7554a;

    public c(int i10) {
        switch (i10) {
            case 1:
                this.f7554a = new ArrayList();
                return;
            default:
                this.f7554a = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
        }
    }

    public void a(StringBuilder sb2) {
        String str;
        if (((Boolean) k0.z(1, this.f7554a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void b(StringBuilder sb2) {
        while (!this.f7554a.isEmpty()) {
            a(sb2);
        }
    }
}
