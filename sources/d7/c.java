package d7;

import android.os.Bundle;
import java.util.ArrayList;
import p4.r;
public final class c {
    public ArrayList f7553a;

    public c(int i10) {
        switch (i10) {
            case 1:
                this.f7553a = new ArrayList();
                return;
            default:
                this.f7553a = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
        }
    }

    public r a() {
        if (this.f7553a == null) {
            return r.f41008c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f7553a);
        return new r(bundle, this.f7553a);
    }

    public void b(StringBuilder sb2) {
        String str;
        if (((Boolean) hg.c.x(1, this.f7553a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void c(StringBuilder sb2) {
        while (!this.f7553a.isEmpty()) {
            b(sb2);
        }
    }
}
