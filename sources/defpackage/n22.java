package defpackage;

import java.io.File;
import java.util.Comparator;
public final class n22 implements Comparator {
    public final byte a;
    public final d32 b;

    public n22(d32 d32Var, byte b) {
        this.a = b;
        this.b = d32Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        d32 d32Var = this.b;
        w22 w22Var = (w22) obj;
        w22 w22Var2 = (w22) obj2;
        switch (b) {
            case 0:
                File file = w22Var.f;
                if (file != null) {
                    if (w22Var2.f == null) {
                        return 1;
                    }
                    boolean isDirectory = file.isDirectory();
                    if (isDirectory != w22Var2.f.isDirectory()) {
                        if (!isDirectory) {
                            return 1;
                        }
                    } else if (!isDirectory && !d32Var.d0) {
                        int i = (w22Var.f.lastModified() > w22Var2.f.lastModified() ? 1 : (w22Var.f.lastModified() == w22Var2.f.lastModified() ? 0 : -1));
                        if (i == 0) {
                            return 0;
                        }
                        if (i <= 0) {
                            return 1;
                        }
                    } else {
                        return w22Var.f.getName().compareToIgnoreCase(w22Var2.f.getName());
                    }
                }
                return -1;
            default:
                if (d32Var.d0) {
                    return w22Var.f.getName().compareToIgnoreCase(w22Var2.f.getName());
                }
                int i2 = (w22Var.f.lastModified() > w22Var2.f.lastModified() ? 1 : (w22Var.f.lastModified() == w22Var2.f.lastModified() ? 0 : -1));
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
