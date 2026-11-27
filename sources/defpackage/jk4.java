package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
public final class jk4 {
    public final ArrayList a;

    public jk4(byte b) {
        switch (b) {
            case 1:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.a = new ArrayList();
                return;
            default:
                this.a = new ArrayList();
                return;
        }
    }

    public final void a() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (obj != null) {
                grb.o();
                return;
            }
            try {
                throw null;
                break;
            } catch (Exception e) {
                nk7.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        arrayList.clear();
    }
}
