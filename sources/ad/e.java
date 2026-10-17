package ad;

import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import p4.r;
public final class e {
    public ArrayList f507a;

    public e(int i10) {
        switch (i10) {
            case 1:
                this.f507a = new ArrayList();
                return;
            default:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f507a = new ArrayList();
                return;
        }
    }

    public r a() {
        if (this.f507a == null) {
            return r.f44205c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f507a);
        return new r(bundle, this.f507a);
    }

    public void b() {
        ArrayList arrayList = this.f507a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj == null) {
                try {
                    throw null;
                    break;
                } catch (Exception e) {
                    m.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            } else {
                throw new ClassCastException();
            }
        }
        arrayList.clear();
    }

    public void c(StringBuilder sb2) {
        String str;
        if (((Boolean) i0.a.z(1, this.f507a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void d(StringBuilder sb2) {
        while (!this.f507a.isEmpty()) {
            c(sb2);
        }
    }
}
