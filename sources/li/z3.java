package li;

import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
public final class z3 {
    public ArrayList f19052a;

    public z3(int i7) {
        switch (i7) {
            case 2:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f19052a = new ArrayList();
                return;
            default:
                this.f19052a = new ArrayList();
                return;
        }
    }

    public s4.r a() {
        if (this.f19052a == null) {
            return s4.r.f54894c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f19052a);
        return new s4.r(bundle, this.f19052a);
    }

    public void b() {
        ArrayList arrayList = this.f19052a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (obj == null) {
                try {
                    throw null;
                    break;
                } catch (Exception e10) {
                    yc.i.d.log(Level.WARNING, "could not delete file ", (Throwable) e10);
                }
            } else {
                throw new ClassCastException();
            }
        }
        arrayList.clear();
    }

    public void c(StringBuilder sb2) {
        String str;
        if (((Boolean) org.telegram.ui.Cells.f1.k(1, this.f19052a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void d(StringBuilder sb2) {
        while (!this.f19052a.isEmpty()) {
            c(sb2);
        }
    }
}
