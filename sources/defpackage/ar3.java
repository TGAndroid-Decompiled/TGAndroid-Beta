package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ar3 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public File g;

    public ar3(int i) {
        this.a = i;
        if (!this.e && !this.f) {
            this.f = true;
            wq3 wq3Var = new wq3(this, (byte) 0);
            kf7 a0 = kf7.a0(i);
            a0.a.c(new ds6((Object) a0, true, (Object) wq3Var, (byte) 18));
        }
    }

    public final void a(zq3 zq3Var) {
        String str;
        StringBuilder sb;
        long j;
        int i = this.a;
        kf7 a0 = kf7.a0(i);
        StringBuilder sb2 = new StringBuilder("StoryDraft append ");
        sb2.append(zq3Var.a);
        sb2.append(" (edit=");
        sb2.append(zq3Var.G);
        if (zq3Var.G) {
            StringBuilder sb3 = new StringBuilder(", storyId=");
            sb3.append(zq3Var.H);
            sb3.append(", ");
            if (zq3Var.J != 0) {
                sb = new StringBuilder("documentId=");
                j = zq3Var.J;
            } else {
                sb = new StringBuilder("photoId=");
                j = zq3Var.K;
            }
            sb.append(j);
            sb3.append(sb.toString());
            sb3.append(", expireDate=");
            sb3.append(zq3Var.L);
            str = sb3.toString();
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(", now=");
        sb2.append(System.currentTimeMillis());
        sb2.append(")");
        cc4.b(sb2.toString());
        a0.a.c(new yq3(a0, zq3Var, (byte) 1));
        jn7.f(i).k(jn7.B5, new Object[0]);
    }

    public final void b(c8b c8bVar) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c8bVar);
        c(arrayList);
    }

    public final void c(ArrayList arrayList) {
        String str;
        StringBuilder sb;
        long j;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                c8b c8bVar = (c8b) arrayList.get(i);
                if (c8bVar != null) {
                    StringBuilder sb2 = new StringBuilder("StoryDraft delete ");
                    sb2.append(c8bVar.b);
                    sb2.append(" (edit=");
                    sb2.append(c8bVar.g);
                    if (c8bVar.g) {
                        StringBuilder sb3 = new StringBuilder(", storyId=");
                        sb3.append(c8bVar.f);
                        sb3.append(", ");
                        if (c8bVar.H != 0) {
                            sb = new StringBuilder("documentId=");
                            j = c8bVar.H;
                        } else {
                            sb = new StringBuilder("photoId=");
                            j = c8bVar.I;
                        }
                        sb.append(j);
                        sb3.append(sb.toString());
                        sb3.append(", expireDate=");
                        sb3.append(c8bVar.J);
                        str = sb3.toString();
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append(", now=");
                    sb2.append(System.currentTimeMillis());
                    sb2.append(")");
                    cc4.b(sb2.toString());
                    arrayList2.add(Long.valueOf(c8bVar.b));
                    c8bVar.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.b.removeAll(arrayList);
            int i2 = this.a;
            kf7 a0 = kf7.a0(i2);
            a0.a.c(new q41(a0, arrayList2, (byte) 1));
            jn7.f(i2).k(jn7.B5, new Object[0]);
        }
    }

    public final void d(c8b c8bVar) {
        if (c8bVar == null) {
            return;
        }
        e(c8bVar);
        ArrayList arrayList = this.b;
        arrayList.remove(c8bVar);
        if (!c8bVar.w) {
            arrayList.add(0, c8bVar);
        }
        zq3 zq3Var = new zq3(c8bVar);
        int i = this.a;
        kf7 a0 = kf7.a0(i);
        a0.a.c(new yq3(a0, zq3Var, (byte) 0));
        jn7.f(i).k(jn7.B5, new Object[0]);
    }

    public final void e(c8b c8bVar) {
        String str;
        if (c8bVar == null) {
            return;
        }
        if (c8bVar.b == 0) {
            c8bVar.b = Utilities.b.nextLong();
        }
        c8bVar.d = System.currentTimeMillis();
        c8bVar.c = true;
        boolean z = c8bVar.M;
        File file = c8bVar.L;
        if (z) {
            c8bVar.L = f(file);
        } else if (file != null) {
            if (c8bVar.K) {
                str = "mp4";
            } else {
                str = "jpg";
            }
            File w = c8b.w(this.a, str);
            try {
                hl.E(c8bVar.L, w);
                c8bVar.L = f(w);
                c8bVar.M = true;
            } catch (IOException e) {
                cc4.g(e, true);
            }
        }
        c8bVar.Z0 = f(c8bVar.Z0);
        c8bVar.P0 = f(c8bVar.P0);
        c8bVar.O0 = f(c8bVar.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.g == null) {
            File file2 = new File(xb4.z(4), "drafts");
            this.g = file2;
            if (!file2.exists()) {
                this.g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.g.getAbsolutePath())) {
            File file3 = new File(this.g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
