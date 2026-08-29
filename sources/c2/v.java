package c2;

import android.os.Bundle;
import java.util.ArrayList;
public final class v {
    public ArrayList f2913a = new ArrayList();

    public w a() {
        if (this.f2913a == null) {
            return w.f2914c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f2913a);
        return new w(bundle, this.f2913a);
    }

    public void b(StringBuilder sb2) {
        String str;
        if (((Boolean) com.google.android.recaptcha.internal.a.j(1, this.f2913a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void c(StringBuilder sb2) {
        while (!this.f2913a.isEmpty()) {
            b(sb2);
        }
    }
}
