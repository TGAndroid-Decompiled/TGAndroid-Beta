package ji;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
public final class b4 {
    public final ArrayList f13791a;

    public b4(int i10) {
        switch (i10) {
            case 1:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f13791a = new ArrayList();
                return;
            default:
                this.f13791a = new ArrayList();
                return;
        }
    }

    public void a() {
        ArrayList arrayList = this.f13791a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj == null) {
                try {
                    throw null;
                    break;
                } catch (Exception e7) {
                    yc.i.d.log(Level.WARNING, "could not delete file ", (Throwable) e7);
                }
            } else {
                throw new ClassCastException();
            }
        }
        arrayList.clear();
    }

    public void b(StringBuilder sb2) {
        String str;
        if (((Boolean) i2.g.z(1, this.f13791a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void c(StringBuilder sb2) {
        while (!this.f13791a.isEmpty()) {
            b(sb2);
        }
    }
}
