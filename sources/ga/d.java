package ga;

import ah.h;
import android.content.Context;
import android.opengl.Matrix;
import android.util.Log;
import android.widget.LinearLayout;
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import da.e1;
import gb.d0;
import gb.d1;
import gb.h1;
import gb.q0;
import gb.u0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import jb.l;
import kg.x1;
import m1.g;
import oi.j0;
import oi.k0;
import oi.z5;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.nd0;
import p5.e;
public final class d implements ib.b, q5.b {
    public final int f13276a;
    public Object f13277b;
    public Object f13278c;
    public Object d;
    public Object f13279e;
    public Object f13280f;
    public Object h;
    public Object f13281n;

    public d(fd.a aVar, fd.a aVar2, fd.a aVar3, fd.a aVar4, fd.a aVar5, fd.a aVar6, fd.a aVar7, int i7) {
        this.f13276a = i7;
        this.f13277b = aVar;
        this.f13278c = aVar2;
        this.d = aVar3;
        this.f13279e = aVar4;
        this.f13280f = aVar5;
        this.h = aVar6;
        this.f13281n = aVar7;
    }

    public static synchronized void e(File file) {
        synchronized (d.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean h(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                h(file2);
            }
        }
        return file.delete();
    }

    public static List i(Object[] objArr) {
        if (objArr == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(objArr);
    }

    public void a(String str) {
        File file = new File((File) this.f13278c, str);
        if (file.exists() && h(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.f13279e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void c() {
        j(null);
        y60 y60Var = (y60) this.d;
        if (y60Var != null) {
            y60Var.v();
            this.d = null;
        }
        this.f13279e = null;
        this.f13280f = null;
        this.h = null;
    }

    public void d(z5 z5Var, ArrayList arrayList) {
        i6 i6Var = (i6) this.f13278c;
        LinearLayout linearLayout = (LinearLayout) this.f13279e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                j0 j0Var = (j0) obj;
                x1 x1Var = new x1(z5Var.getContext(), j0Var, i6Var);
                x1Var.setPadding(g0.L(8.0f), 0, g0.L(12.0f), 0);
                x1Var.setBackground(n6.a0(n6.w0(n6.f29486i6, i6Var), 0, 0));
                x1Var.setOnClickListener(new h(this, z5Var, j0Var, 19));
                ((LinearLayout) this.f13279e).addView(x1Var, ma.o(-1, 48));
            }
        }
    }

    public void f(int i7, int i10, float f10, float f11, boolean z10, float[] fArr) {
        float f12;
        float[] fArr2 = (float[]) this.f13277b;
        float f13 = (i7 - i10) / 0.3902439f;
        if (f13 <= 0.0f || f13 > i7) {
            f13 = i7;
        }
        float f14 = 1.0f;
        Matrix.perspectiveM(fArr2, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i10 / Math.max(1.0f, f13 / 1.64f))) * 2.0d), i7 / Math.max(1, i10), 0.1f, 20.0f);
        Matrix.setLookAtM((float[]) this.f13278c, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = (float[]) this.d;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f10, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f11, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM((float[]) this.f13279e, 0, (float[]) this.f13278c, 0, (float[]) this.d, 0);
        Matrix.multiplyMM((float[]) this.f13280f, 0, (float[]) this.f13277b, 0, (float[]) this.f13279e, 0);
        if (z10) {
            f12 = 0.0125f;
        } else {
            f12 = -0.0125f;
        }
        if (!z10) {
            f14 = -1.0f;
        }
        float f15 = f14;
        float f16 = -f15;
        g(f12, 0.618561f, f15, i7, i10, fArr, 0);
        g(f12, 0.618561f, f16, i7, i10, fArr, 2);
        g(f12, -0.593561f, f16, i7, i10, fArr, 4);
        g(f12, -0.593561f, f15, i7, i10, fArr, 6);
    }

    public float g(float f10, float f11, float f12, int i7, int i10, float[] fArr, int i11) {
        float[] fArr2 = (float[]) this.h;
        fArr2[0] = f10;
        fArr2[1] = f11;
        fArr2[2] = f12;
        fArr2[3] = 1.0f;
        Matrix.multiplyMV((float[]) this.f13281n, 0, (float[]) this.f13280f, 0, fArr2, 0);
        float[] fArr3 = (float[]) this.f13281n;
        float f13 = 1.0f / fArr3[3];
        fArr[i11] = e2.x(fArr3[0], f13, 0.5f, 0.5f) * i7;
        fArr[i11 + 1] = c0.z(fArr3[1], f13, 0.5f, 0.5f) * i10;
        return fArr3[2] * f13;
    }

    @Override
    public Object mo24get() {
        switch (this.f13276a) {
            case 2:
                return new d1((l) ((ib.c) this.f13277b).mo24get(), (u0) ((ib.c) this.f13278c).mo24get(), (q0) ((ib.c) this.d).mo24get(), (h1) ((ib.c) this.f13279e).mo24get(), (g) ((ib.c) this.f13280f).mo24get(), (d0) ((ib.c) this.h).mo24get(), (id.h) ((ib.c) this.f13281n).mo24get());
            default:
                qb.a aVar = new qb.a(28);
                pb.b bVar = new pb.b(28);
                ?? obj = new Object();
                obj.f16188a = (Context) ((fd.a) this.f13277b).mo24get();
                obj.f16189b = (e) ((fd.a) this.f13278c).mo24get();
                obj.f16190c = (v5.d) ((fd.a) this.d).mo24get();
                obj.d = (nd0) ((nd0) this.f13279e).mo24get();
                obj.f16191e = (Executor) ((fd.a) this.f13280f).mo24get();
                obj.f16192f = (w5.c) ((fd.a) this.h).mo24get();
                obj.f16193g = aVar;
                obj.h = bVar;
                obj.f16194i = (v5.c) ((fd.a) this.f13281n).mo24get();
                return obj;
        }
    }

    public void j(z5 z5Var) {
        z5 z5Var2 = (z5) this.f13281n;
        if (z5Var2 != z5Var) {
            if (z5Var2 != null) {
                z5Var2.setShowCommandBackground(false);
            }
            this.f13281n = z5Var;
            if (z5Var != null) {
                z5Var.setShowCommandBackground(true);
            }
        }
    }

    public void k(z5 z5Var, String str) {
        y60 y60Var;
        y60 y60Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a10 = j0.a(str);
        if (a10.isEmpty()) {
            c();
            return;
        }
        j(z5Var);
        if (((z5) this.h) == z5Var && a10.equals((ArrayList) this.f13280f) && (y60Var2 = (y60) this.d) != null && y60Var2.E()) {
            return;
        }
        if (((z5) this.h) == z5Var && (y60Var = (y60) this.d) != null && y60Var.E() && ((LinearLayout) this.f13279e) != null) {
            this.f13280f = a10;
            d(z5Var, a10);
            ((y60) this.d).P();
            return;
        }
        c();
        j(z5Var);
        this.h = z5Var;
        this.f13280f = a10;
        LinearLayout linearLayout = new LinearLayout(z5Var.getContext());
        this.f13279e = linearLayout;
        linearLayout.setOrientation(1);
        d(z5Var, a10);
        y60 j3 = ((k0) this.f13277b).j(z5Var.getEditText());
        j3.T = true;
        j3.f42375s = 0;
        j3.f42377t = false;
        j3.r((LinearLayout) this.f13279e, ma.o(220, -2));
        j3.f42343a0 = g0.L(240.0f);
        j3.f42356i = 3;
        j3.b0(-g0.L(12.0f), 0.0f);
        j3.f42369p = new kg.j0(this, 28);
        j3.f42354g0 = true;
        if (j3.E()) {
            j3.D();
        }
        j3.a0();
        this.d = j3;
    }

    public d(int i7) {
        this.f13276a = i7;
        switch (i7) {
            case 4:
                this.f13277b = new float[16];
                this.f13278c = new float[16];
                this.d = new float[16];
                this.f13279e = new float[16];
                this.f13280f = new float[16];
                this.h = new float[4];
                this.f13281n = new float[4];
                return;
            default:
                return;
        }
    }

    public d(k0 k0Var, i6 i6Var) {
        this.f13276a = 3;
        this.f13277b = k0Var;
        this.f13278c = i6Var;
    }

    public d(Context context) {
        String str;
        String replaceAll;
        this.f13276a = 0;
        String str2 = ((e1) x9.c.f60428a.b(context)).f8006a;
        this.f13277b = str2;
        File filesDir = context.getFilesDir();
        this.f13278c = filesDir;
        if (!str2.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
            sb2.append(File.separator);
            if (str2.length() > 40) {
                replaceAll = aa.g.i(str2);
            } else {
                replaceAll = str2.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb2.append(replaceAll);
            str = sb2.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        e(file);
        this.d = file;
        File file2 = new File(file, "open-sessions");
        e(file2);
        this.f13279e = file2;
        File file3 = new File(file, "reports");
        e(file3);
        this.f13280f = file3;
        File file4 = new File(file, "priority-reports");
        e(file4);
        this.h = file4;
        File file5 = new File(file, "native-reports");
        e(file5);
        this.f13281n = file5;
    }
}
