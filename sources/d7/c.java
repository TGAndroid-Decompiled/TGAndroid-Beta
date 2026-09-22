package d7;

import java.util.ArrayList;
public final class c {
    public final ArrayList f7556a;

    public c(int i10) {
        switch (i10) {
            case 1:
                this.f7556a = new ArrayList();
                return;
            default:
                this.f7556a = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
        }
    }

    public void a(StringBuilder sb2) {
        String str;
        if (((Boolean) hg.c.z(1, this.f7556a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void b(StringBuilder sb2) {
        while (!this.f7556a.isEmpty()) {
            a(sb2);
        }
    }
}
