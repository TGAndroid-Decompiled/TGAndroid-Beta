package defpackage;

import java.io.File;
import java.util.Comparator;
public final class e32 implements Comparator {
    public final byte a;
    public final u32 b;

    public e32(u32 u32Var, byte b) {
        this.a = b;
        this.b = u32Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        u32 u32Var = this.b;
        n32 n32Var = (n32) obj;
        n32 n32Var2 = (n32) obj2;
        switch (b) {
            case 0:
                File file = n32Var.f;
                if (file != null) {
                    if (n32Var2.f == null) {
                        return 1;
                    }
                    boolean isDirectory = file.isDirectory();
                    if (isDirectory != n32Var2.f.isDirectory()) {
                        if (!isDirectory) {
                            return 1;
                        }
                    } else if (!isDirectory && !u32Var.d0) {
                        int i = (n32Var.f.lastModified() > n32Var2.f.lastModified() ? 1 : (n32Var.f.lastModified() == n32Var2.f.lastModified() ? 0 : -1));
                        if (i == 0) {
                            return 0;
                        }
                        if (i <= 0) {
                            return 1;
                        }
                    } else {
                        return n32Var.f.getName().compareToIgnoreCase(n32Var2.f.getName());
                    }
                }
                return -1;
            default:
                if (u32Var.d0) {
                    return n32Var.f.getName().compareToIgnoreCase(n32Var2.f.getName());
                }
                int i2 = (n32Var.f.lastModified() > n32Var2.f.lastModified() ? 1 : (n32Var.f.lastModified() == n32Var2.f.lastModified() ? 0 : -1));
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
