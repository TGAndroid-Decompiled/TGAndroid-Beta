package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class jq3 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public File g;

    public jq3(int i) {
        this.a = i;
        if (!this.e && !this.f) {
            this.f = true;
            fq3 fq3Var = new fq3(this, (byte) 0);
            ad7 Y = ad7.Y(i);
            Y.a.c(new mn6((Object) Y, true, (Object) fq3Var, (byte) 18));
        }
    }

    public final void a(iq3 iq3Var) {
        String str;
        StringBuilder sb;
        long j;
        int i = this.a;
        ad7 Y = ad7.Y(i);
        StringBuilder sb2 = new StringBuilder("StoryDraft append ");
        sb2.append(iq3Var.a);
        sb2.append(" (edit=");
        sb2.append(iq3Var.G);
        if (iq3Var.G) {
            StringBuilder sb3 = new StringBuilder(", storyId=");
            sb3.append(iq3Var.H);
            sb3.append(", ");
            if (iq3Var.J != 0) {
                sb = new StringBuilder("documentId=");
                j = iq3Var.J;
            } else {
                sb = new StringBuilder("photoId=");
                j = iq3Var.K;
            }
            sb.append(j);
            sb3.append(sb.toString());
            sb3.append(", expireDate=");
            sb3.append(iq3Var.L);
            str = sb3.toString();
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(", now=");
        sb2.append(System.currentTimeMillis());
        sb2.append(")");
        fa4.b(sb2.toString());
        Y.a.c(new gq3(Y, iq3Var, (byte) 1));
        kk7.f(i).k(kk7.A5, new Object[0]);
    }

    public final void b(f4b f4bVar) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(f4bVar);
        c(arrayList);
    }

    public final void c(ArrayList arrayList) {
        String str;
        StringBuilder sb;
        long j;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                f4b f4bVar = (f4b) arrayList.get(i);
                if (f4bVar != null) {
                    StringBuilder sb2 = new StringBuilder("StoryDraft delete ");
                    sb2.append(f4bVar.b);
                    sb2.append(" (edit=");
                    sb2.append(f4bVar.g);
                    if (f4bVar.g) {
                        StringBuilder sb3 = new StringBuilder(", storyId=");
                        sb3.append(f4bVar.f);
                        sb3.append(", ");
                        if (f4bVar.H != 0) {
                            sb = new StringBuilder("documentId=");
                            j = f4bVar.H;
                        } else {
                            sb = new StringBuilder("photoId=");
                            j = f4bVar.I;
                        }
                        sb.append(j);
                        sb3.append(sb.toString());
                        sb3.append(", expireDate=");
                        sb3.append(f4bVar.J);
                        str = sb3.toString();
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append(", now=");
                    sb2.append(System.currentTimeMillis());
                    sb2.append(")");
                    fa4.b(sb2.toString());
                    arrayList2.add(Long.valueOf(f4bVar.b));
                    f4bVar.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.b.removeAll(arrayList);
            int i2 = this.a;
            ad7 Y = ad7.Y(i2);
            Y.a.c(new i41(Y, arrayList2, (byte) 1));
            kk7.f(i2).k(kk7.A5, new Object[0]);
        }
    }

    public final void d(f4b f4bVar) {
        if (f4bVar == null) {
            return;
        }
        e(f4bVar);
        ArrayList arrayList = this.b;
        arrayList.remove(f4bVar);
        if (!f4bVar.w) {
            arrayList.add(0, f4bVar);
        }
        iq3 iq3Var = new iq3(f4bVar);
        int i = this.a;
        ad7 Y = ad7.Y(i);
        Y.a.c(new gq3(Y, iq3Var, (byte) 0));
        kk7.f(i).k(kk7.A5, new Object[0]);
    }

    public final void e(f4b f4bVar) {
        String str;
        if (f4bVar == null) {
            return;
        }
        if (f4bVar.b == 0) {
            f4bVar.b = Utilities.b.nextLong();
        }
        f4bVar.d = System.currentTimeMillis();
        f4bVar.c = true;
        boolean z = f4bVar.M;
        File file = f4bVar.L;
        if (z) {
            f4bVar.L = f(file);
        } else if (file != null) {
            if (f4bVar.K) {
                str = "mp4";
            } else {
                str = "jpg";
            }
            File w = f4b.w(this.a, str);
            try {
                gl.E(f4bVar.L, w);
                f4bVar.L = f(w);
                f4bVar.M = true;
            } catch (IOException e) {
                fa4.g(e, true);
            }
        }
        f4bVar.Z0 = f(f4bVar.Z0);
        f4bVar.P0 = f(f4bVar.P0);
        f4bVar.O0 = f(f4bVar.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.g == null) {
            File file2 = new File(ba4.z(4), "drafts");
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
