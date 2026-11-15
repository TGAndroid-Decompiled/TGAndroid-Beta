package oi;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
public final class w3 {
    public final ArrayList f22093a;

    public w3(int i7) {
        switch (i7) {
            case 1:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f22093a = new ArrayList();
                return;
            default:
                this.f22093a = new ArrayList();
                return;
        }
    }

    public void a() {
        ArrayList arrayList = this.f22093a;
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

    public void b(StringBuilder sb2) {
        String str;
        if (((Boolean) r.b.g(1, this.f22093a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void c(StringBuilder sb2) {
        while (!this.f22093a.isEmpty()) {
            b(sb2);
        }
    }
}
