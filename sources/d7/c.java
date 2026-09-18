package d7;

import android.os.Bundle;
import hg.k0;
import java.util.ArrayList;
import p4.r;
public final class c {
    public ArrayList f7558a;

    public c(int i10) {
        switch (i10) {
            case 1:
                this.f7558a = new ArrayList();
                return;
            default:
                this.f7558a = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
        }
    }

    public r a() {
        if (this.f7558a == null) {
            return r.f40895c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f7558a);
        return new r(bundle, this.f7558a);
    }

    public void b(StringBuilder sb2) {
        String str;
        if (((Boolean) k0.v(1, this.f7558a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void c(StringBuilder sb2) {
        while (!this.f7558a.isEmpty()) {
            b(sb2);
        }
    }
}
