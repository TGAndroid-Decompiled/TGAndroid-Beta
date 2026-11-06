package fi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
public final class z0 {
    public final int f13229a;
    public final ArrayList f13230b = new ArrayList();
    public boolean f13231c;
    public boolean d;
    public boolean f13232e;
    public boolean f13233f;
    public File f13234g;

    public z0(int i7) {
        this.f13229a = i7;
        if (!this.f13232e && !this.f13233f) {
            this.f13233f = true;
            v0 v0Var = new v0(this, 0);
            yr a02 = yr.a0(i7);
            a02.f26688a.c(new bi.u7((Object) a02, true, (Object) v0Var, 3));
        }
    }

    public final void a(y0 y0Var) {
        String str;
        StringBuilder sb2;
        long j3;
        int i7 = this.f13229a;
        yr a02 = yr.a0(i7);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(y0Var.f13110a);
        sb3.append(" (edit=");
        sb3.append(y0Var.G);
        if (y0Var.G) {
            StringBuilder sb4 = new StringBuilder(", storyId=");
            sb4.append(y0Var.H);
            sb4.append(", ");
            if (y0Var.J != 0) {
                sb2 = new StringBuilder("documentId=");
                j3 = y0Var.J;
            } else {
                sb2 = new StringBuilder("photoId=");
                j3 = y0Var.K;
            }
            sb2.append(j3);
            sb4.append(sb2.toString());
            sb4.append(", expireDate=");
            sb4.append(y0Var.L);
            str = sb4.toString();
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append(", now=");
        sb3.append(System.currentTimeMillis());
        sb3.append(")");
        org.telegram.messenger.a8.b(sb3.toString());
        a02.f26688a.c(new w0(a02, y0Var, 1));
        qs.f(i7).k(qs.f25099y5, new Object[0]);
    }

    public final void b(e7 e7Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(e7Var);
        c(arrayList);
    }

    public final void c(ArrayList arrayList) {
        String str;
        StringBuilder sb2;
        long j3;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                e7 e7Var = (e7) arrayList.get(i7);
                if (e7Var != null) {
                    StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                    sb3.append(e7Var.f11879b);
                    sb3.append(" (edit=");
                    sb3.append(e7Var.f11892g);
                    if (e7Var.f11892g) {
                        StringBuilder sb4 = new StringBuilder(", storyId=");
                        sb4.append(e7Var.f11890f);
                        sb4.append(", ");
                        if (e7Var.H != 0) {
                            sb2 = new StringBuilder("documentId=");
                            j3 = e7Var.H;
                        } else {
                            sb2 = new StringBuilder("photoId=");
                            j3 = e7Var.I;
                        }
                        sb2.append(j3);
                        sb4.append(sb2.toString());
                        sb4.append(", expireDate=");
                        sb4.append(e7Var.J);
                        str = sb4.toString();
                    } else {
                        str = "";
                    }
                    sb3.append(str);
                    sb3.append(", now=");
                    sb3.append(System.currentTimeMillis());
                    sb3.append(")");
                    org.telegram.messenger.a8.b(sb3.toString());
                    arrayList2.add(Long.valueOf(e7Var.f11879b));
                    e7Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f13230b.removeAll(arrayList);
            int i10 = this.f13229a;
            yr a02 = yr.a0(i10);
            a02.f26688a.c(new x0(a02, arrayList2, 0));
            qs.f(i10).k(qs.f25099y5, new Object[0]);
        }
    }

    public final void d(e7 e7Var) {
        if (e7Var == null) {
            return;
        }
        e(e7Var);
        ArrayList arrayList = this.f13230b;
        arrayList.remove(e7Var);
        if (!e7Var.f11921w) {
            arrayList.add(0, e7Var);
        }
        y0 y0Var = new y0(e7Var);
        int i7 = this.f13229a;
        yr a02 = yr.a0(i7);
        a02.f26688a.c(new w0(a02, y0Var, 0));
        qs.f(i7).k(qs.f25099y5, new Object[0]);
    }

    public final void e(e7 e7Var) {
        if (e7Var == null) {
            return;
        }
        if (e7Var.f11879b == 0) {
            e7Var.f11879b = Utilities.f21331b.nextLong();
        }
        e7Var.d = System.currentTimeMillis();
        e7Var.f11882c = true;
        if (e7Var.M) {
            e7Var.L = f(e7Var.L);
        } else if (e7Var.L != null) {
            File x10 = e7.x(this.f13229a, e7Var.K);
            try {
                org.telegram.messenger.g0.E(e7Var.L, x10);
                e7Var.L = f(x10);
                e7Var.M = true;
            } catch (IOException e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        e7Var.Z0 = f(e7Var.Z0);
        e7Var.P0 = f(e7Var.P0);
        e7Var.O0 = f(e7Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f13234g == null) {
            File file2 = new File(org.telegram.messenger.w7.z(4), "drafts");
            this.f13234g = file2;
            if (!file2.exists()) {
                this.f13234g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f13234g.getAbsolutePath())) {
            File file3 = new File(this.f13234g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
