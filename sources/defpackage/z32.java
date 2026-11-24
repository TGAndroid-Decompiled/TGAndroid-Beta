package defpackage;

import java.io.File;
import java.util.Comparator;
public final class z32 implements Comparator {
    public final byte a;
    public final p42 b;

    public z32(p42 p42Var, byte b) {
        this.a = b;
        this.b = p42Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        p42 p42Var = this.b;
        i42 i42Var = (i42) obj;
        i42 i42Var2 = (i42) obj2;
        switch (b) {
            case 0:
                File file = i42Var.f;
                if (file != null) {
                    if (i42Var2.f == null) {
                        return 1;
                    }
                    boolean isDirectory = file.isDirectory();
                    if (isDirectory != i42Var2.f.isDirectory()) {
                        if (!isDirectory) {
                            return 1;
                        }
                    } else if (!isDirectory && !p42Var.d0) {
                        int i = (i42Var.f.lastModified() > i42Var2.f.lastModified() ? 1 : (i42Var.f.lastModified() == i42Var2.f.lastModified() ? 0 : -1));
                        if (i == 0) {
                            return 0;
                        }
                        if (i <= 0) {
                            return 1;
                        }
                    } else {
                        return i42Var.f.getName().compareToIgnoreCase(i42Var2.f.getName());
                    }
                }
                return -1;
            default:
                if (p42Var.d0) {
                    return i42Var.f.getName().compareToIgnoreCase(i42Var2.f.getName());
                }
                int i2 = (i42Var.f.lastModified() > i42Var2.f.lastModified() ? 1 : (i42Var.f.lastModified() == i42Var2.f.lastModified() ? 0 : -1));
                if (i2 == 0) {
                    return 0;
                }
                if (i2 <= 0) {
                    return 1;
                }
                return -1;
        }
    }
}
