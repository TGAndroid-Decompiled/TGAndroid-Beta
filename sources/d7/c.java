package d7;

import hg.k0;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import yc.i;
public final class c {
    public final ArrayList f7557a;

    public c(int i10) {
        switch (i10) {
            case 1:
                this.f7557a = new ArrayList();
                return;
            case 2:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f7557a = new ArrayList();
                return;
            default:
                this.f7557a = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
        }
    }

    public void a() {
        ArrayList arrayList = this.f7557a;
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
                    i.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            } else {
                throw new ClassCastException();
            }
        }
        arrayList.clear();
    }

    public void b(StringBuilder sb2) {
        String str;
        if (((Boolean) k0.x(1, this.f7557a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void c(StringBuilder sb2) {
        while (!this.f7557a.isEmpty()) {
            b(sb2);
        }
    }
}
