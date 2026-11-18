package hi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.tr;
public final class b1 {
    public final int f14254a;
    public final ArrayList f14255b = new ArrayList();
    public boolean f14256c;
    public boolean d;
    public boolean f14257e;
    public boolean f14258f;
    public File f14259g;

    public b1(int i7) {
        this.f14254a = i7;
        if (!this.f14257e && !this.f14258f) {
            this.f14258f = true;
            x0 x0Var = new x0(this, 0);
            tr a02 = tr.a0(i7);
            a02.f27052a.c(new di.p6((Object) a02, true, (Object) x0Var, 3));
        }
    }

    public final void a(a1 a1Var) {
        String str;
        StringBuilder sb2;
        long j3;
        int i7 = this.f14254a;
        tr a02 = tr.a0(i7);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(a1Var.f14173a);
        sb3.append(" (edit=");
        sb3.append(a1Var.G);
        if (a1Var.G) {
            StringBuilder sb4 = new StringBuilder(", storyId=");
            sb4.append(a1Var.H);
            sb4.append(", ");
            if (a1Var.J != 0) {
                sb2 = new StringBuilder("documentId=");
                j3 = a1Var.J;
            } else {
                sb2 = new StringBuilder("photoId=");
                j3 = a1Var.K;
            }
            sb2.append(j3);
            sb4.append(sb2.toString());
            sb4.append(", expireDate=");
            sb4.append(a1Var.L);
            str = sb4.toString();
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append(", now=");
        sb3.append(System.currentTimeMillis());
        sb3.append(")");
        org.telegram.messenger.a8.b(sb3.toString());
        a02.f27052a.c(new y0(a02, a1Var, 1));
        ks.f(i7).k(ks.B5, new Object[0]);
    }

    public final void b(d7 d7Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(d7Var);
        c(arrayList);
    }

    public final void c(ArrayList arrayList) {
        String str;
        StringBuilder sb2;
        long j3;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                d7 d7Var = (d7) arrayList.get(i7);
                if (d7Var != null) {
                    StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                    sb3.append(d7Var.f14388b);
                    sb3.append(" (edit=");
                    sb3.append(d7Var.f14401g);
                    if (d7Var.f14401g) {
                        StringBuilder sb4 = new StringBuilder(", storyId=");
                        sb4.append(d7Var.f14399f);
                        sb4.append(", ");
                        if (d7Var.H != 0) {
                            sb2 = new StringBuilder("documentId=");
                            j3 = d7Var.H;
                        } else {
                            sb2 = new StringBuilder("photoId=");
                            j3 = d7Var.I;
                        }
                        sb2.append(j3);
                        sb4.append(sb2.toString());
                        sb4.append(", expireDate=");
                        sb4.append(d7Var.J);
                        str = sb4.toString();
                    } else {
                        str = "";
                    }
                    sb3.append(str);
                    sb3.append(", now=");
                    sb3.append(System.currentTimeMillis());
                    sb3.append(")");
                    org.telegram.messenger.a8.b(sb3.toString());
                    arrayList2.add(Long.valueOf(d7Var.f14388b));
                    d7Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f14255b.removeAll(arrayList);
            int i10 = this.f14254a;
            tr a02 = tr.a0(i10);
            a02.f27052a.c(new z0(a02, arrayList2, 0));
            ks.f(i10).k(ks.B5, new Object[0]);
        }
    }

    public final void d(d7 d7Var) {
        if (d7Var == null) {
            return;
        }
        e(d7Var);
        ArrayList arrayList = this.f14255b;
        arrayList.remove(d7Var);
        if (!d7Var.f14430w) {
            arrayList.add(0, d7Var);
        }
        a1 a1Var = new a1(d7Var);
        int i7 = this.f14254a;
        tr a02 = tr.a0(i7);
        a02.f27052a.c(new y0(a02, a1Var, 0));
        ks.f(i7).k(ks.B5, new Object[0]);
    }

    public final void e(d7 d7Var) {
        if (d7Var == null) {
            return;
        }
        if (d7Var.f14388b == 0) {
            d7Var.f14388b = Utilities.f22777b.nextLong();
        }
        d7Var.d = System.currentTimeMillis();
        d7Var.f14391c = true;
        if (d7Var.M) {
            d7Var.L = f(d7Var.L);
        } else if (d7Var.L != null) {
            File x10 = d7.x(this.f14254a, d7Var.K);
            try {
                org.telegram.messenger.g0.E(d7Var.L, x10);
                d7Var.L = f(x10);
                d7Var.M = true;
            } catch (IOException e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        d7Var.Z0 = f(d7Var.Z0);
        d7Var.P0 = f(d7Var.P0);
        d7Var.O0 = f(d7Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f14259g == null) {
            File file2 = new File(org.telegram.messenger.w7.z(4), "drafts");
            this.f14259g = file2;
            if (!file2.exists()) {
                this.f14259g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f14259g.getAbsolutePath())) {
            File file3 = new File(this.f14259g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
