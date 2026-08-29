package ic;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
public final class d {
    public final ArrayList f8836a;

    public d(int i10) {
        switch (i10) {
            case 1:
                this.f8836a = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
            default:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f8836a = new ArrayList();
                return;
        }
    }

    public void a() {
        ArrayList arrayList = this.f8836a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj == null) {
                try {
                    throw null;
                    break;
                } catch (Exception e10) {
                    l.d.log(Level.WARNING, "could not delete file ", (Throwable) e10);
                }
            } else {
                throw new ClassCastException();
            }
        }
        arrayList.clear();
    }
}
