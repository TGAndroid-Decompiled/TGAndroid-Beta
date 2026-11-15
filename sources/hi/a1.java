package hi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
public final class a1 {
    public final int f13861a;
    public final ArrayList f13862b = new ArrayList();
    public boolean f13863c;
    public boolean d;
    public boolean f13864e;
    public boolean f13865f;
    public File f13866g;

    public a1(int i7) {
        this.f13861a = i7;
        if (!this.f13864e && !this.f13865f) {
            this.f13865f = true;
            w0 w0Var = new w0(this, 0);
            vr a02 = vr.a0(i7);
            a02.f27219a.c(new di.m6((Object) a02, true, (Object) w0Var, 3));
        }
    }

    public final void a(z0 z0Var) {
        String str;
        StringBuilder sb2;
        long j3;
        int i7 = this.f13861a;
        vr a02 = vr.a0(i7);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(z0Var.f15443a);
        sb3.append(" (edit=");
        sb3.append(z0Var.G);
        if (z0Var.G) {
            StringBuilder sb4 = new StringBuilder(", storyId=");
            sb4.append(z0Var.H);
            sb4.append(", ");
            if (z0Var.J != 0) {
                sb2 = new StringBuilder("documentId=");
                j3 = z0Var.J;
            } else {
                sb2 = new StringBuilder("photoId=");
                j3 = z0Var.K;
            }
            sb2.append(j3);
            sb4.append(sb2.toString());
            sb4.append(", expireDate=");
            sb4.append(z0Var.L);
            str = sb4.toString();
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append(", now=");
        sb3.append(System.currentTimeMillis());
        sb3.append(")");
        org.telegram.messenger.a8.b(sb3.toString());
        a02.f27219a.c(new x0(a02, z0Var, 1));
        ns.f(i7).k(ns.f25613y5, new Object[0]);
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
                    sb3.append(d7Var.f14126b);
                    sb3.append(" (edit=");
                    sb3.append(d7Var.f14139g);
                    if (d7Var.f14139g) {
                        StringBuilder sb4 = new StringBuilder(", storyId=");
                        sb4.append(d7Var.f14137f);
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
                    arrayList2.add(Long.valueOf(d7Var.f14126b));
                    d7Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f13862b.removeAll(arrayList);
            int i10 = this.f13861a;
            vr a02 = vr.a0(i10);
            a02.f27219a.c(new y0(a02, arrayList2, 0));
            ns.f(i10).k(ns.f25613y5, new Object[0]);
        }
    }

    public final void d(d7 d7Var) {
        if (d7Var == null) {
            return;
        }
        e(d7Var);
        ArrayList arrayList = this.f13862b;
        arrayList.remove(d7Var);
        if (!d7Var.f14168w) {
            arrayList.add(0, d7Var);
        }
        z0 z0Var = new z0(d7Var);
        int i7 = this.f13861a;
        vr a02 = vr.a0(i7);
        a02.f27219a.c(new x0(a02, z0Var, 0));
        ns.f(i7).k(ns.f25613y5, new Object[0]);
    }

    public final void e(d7 d7Var) {
        if (d7Var == null) {
            return;
        }
        if (d7Var.f14126b == 0) {
            d7Var.f14126b = Utilities.f22414b.nextLong();
        }
        d7Var.d = System.currentTimeMillis();
        d7Var.f14129c = true;
        if (d7Var.M) {
            d7Var.L = f(d7Var.L);
        } else if (d7Var.L != null) {
            File x10 = d7.x(this.f13861a, d7Var.K);
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
        if (this.f13866g == null) {
            File file2 = new File(org.telegram.messenger.w7.z(4), "drafts");
            this.f13866g = file2;
            if (!file2.exists()) {
                this.f13866g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f13866g.getAbsolutePath())) {
            File file3 = new File(this.f13866g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
