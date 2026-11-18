package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
public final class fz {
    public final ArrayList f24087a;

    public fz() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f24087a = new ArrayList();
    }

    public void a() {
        ArrayList arrayList = this.f24087a;
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

    public fz(ArrayList arrayList) {
        this.f24087a = arrayList;
    }
}
