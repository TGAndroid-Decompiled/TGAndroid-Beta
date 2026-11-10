package ga;

import ah.g;
import android.content.Context;
import android.opengl.Matrix;
import android.util.Log;
import android.widget.LinearLayout;
import c8.ha;
import da.e1;
import gb.d0;
import gb.j1;
import gb.r0;
import gb.v0;
import id.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import jb.l;
import kg.u1;
import l2.a0;
import li.a6;
import li.l0;
import li.m0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.k60;
import org.telegram.ui.ly0;
import w7.s;
public final class d implements ib.b, q5.b {
    public final int f13617a;
    public Object f13618b;
    public Object f13619c;
    public Object d;
    public Object f13620e;
    public Object f13621f;
    public Object h;
    public Object f13622n;

    public d(fd.a aVar, fd.a aVar2, fd.a aVar3, fd.a aVar4, fd.a aVar5, fd.a aVar6, fd.a aVar7, int i7) {
        this.f13617a = i7;
        this.f13618b = aVar;
        this.f13619c = aVar2;
        this.d = aVar3;
        this.f13620e = aVar4;
        this.f13621f = aVar5;
        this.h = aVar6;
        this.f13622n = aVar7;
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
        File file = new File((File) this.f13619c, str);
        if (file.exists() && h(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.f13620e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void c() {
        j(null);
        k60 k60Var = (k60) this.d;
        if (k60Var != null) {
            k60Var.u();
            this.d = null;
        }
        this.f13620e = null;
        this.f13621f = null;
        this.h = null;
    }

    public void d(a6 a6Var, ArrayList arrayList) {
        h6 h6Var = (h6) this.f13619c;
        LinearLayout linearLayout = (LinearLayout) this.f13620e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                l0 l0Var = (l0) obj;
                u1 u1Var = new u1(a6Var.getContext(), l0Var, h6Var);
                u1Var.setPadding(g0.L(8.0f), 0, g0.L(12.0f), 0);
                u1Var.setBackground(m6.a0(m6.w0(m6.f27982i6, h6Var), 0, 0));
                u1Var.setOnClickListener(new g(this, a6Var, l0Var, 14));
                ((LinearLayout) this.f13620e).addView(u1Var, ha.o(-1, 48));
            }
        }
    }

    public void f(int i7, int i10, float f10, float f11, boolean z9, float[] fArr) {
        float f12;
        float[] fArr2 = (float[]) this.f13618b;
        float f13 = (i7 - i10) / 0.3902439f;
        if (f13 <= 0.0f || f13 > i7) {
            f13 = i7;
        }
        float f14 = 1.0f;
        Matrix.perspectiveM(fArr2, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i10 / Math.max(1.0f, f13 / 1.64f))) * 2.0d), i7 / Math.max(1, i10), 0.1f, 20.0f);
        Matrix.setLookAtM((float[]) this.f13619c, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = (float[]) this.d;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f10, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f11, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM((float[]) this.f13620e, 0, (float[]) this.f13619c, 0, (float[]) this.d, 0);
        Matrix.multiplyMM((float[]) this.f13621f, 0, (float[]) this.f13618b, 0, (float[]) this.f13620e, 0);
        if (z9) {
            f12 = 0.0125f;
        } else {
            f12 = -0.0125f;
        }
        if (!z9) {
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
        Matrix.multiplyMV((float[]) this.f13622n, 0, (float[]) this.f13621f, 0, fArr2, 0);
        float[] fArr3 = (float[]) this.f13622n;
        float f13 = 1.0f / fArr3[3];
        fArr[i11] = com.google.android.recaptcha.internal.a.x(fArr3[0], f13, 0.5f, 0.5f) * i7;
        fArr[i11 + 1] = f1.x(fArr3[1], f13, 0.5f, 0.5f) * i10;
        return fArr3[2] * f13;
    }

    @Override
    public Object mo24get() {
        switch (this.f13617a) {
            case 2:
                return new gb.f1((l) ((ib.c) this.f13618b).mo24get(), (v0) ((ib.c) this.f13619c).mo24get(), (r0) ((ib.c) this.d).mo24get(), (j1) ((ib.c) this.f13620e).mo24get(), (m1.g) ((ib.c) this.f13621f).mo24get(), (d0) ((ib.c) this.h).mo24get(), (h) ((ib.c) this.f13622n).mo24get());
            default:
                nb.a aVar = new nb.a(28);
                s sVar = new s(27, false);
                ?? obj = new Object();
                obj.f15420a = (Context) ((fd.a) this.f13618b).mo24get();
                obj.f15421b = (p5.d) ((fd.a) this.f13619c).mo24get();
                obj.f15422c = (v5.d) ((fd.a) this.d).mo24get();
                obj.d = (ly0) ((ly0) this.f13620e).mo24get();
                obj.f15423e = (Executor) ((fd.a) this.f13621f).mo24get();
                obj.f15424f = (w5.c) ((fd.a) this.h).mo24get();
                obj.f15425g = aVar;
                obj.h = sVar;
                obj.f15426i = (v5.c) ((fd.a) this.f13622n).mo24get();
                return obj;
        }
    }

    public void j(a6 a6Var) {
        a6 a6Var2 = (a6) this.f13622n;
        if (a6Var2 != a6Var) {
            if (a6Var2 != null) {
                a6Var2.setShowCommandBackground(false);
            }
            this.f13622n = a6Var;
            if (a6Var != null) {
                a6Var.setShowCommandBackground(true);
            }
        }
    }

    public void k(a6 a6Var, String str) {
        k60 k60Var;
        k60 k60Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a10 = l0.a(str);
        if (a10.isEmpty()) {
            c();
            return;
        }
        j(a6Var);
        if (((a6) this.h) == a6Var && a10.equals((ArrayList) this.f13621f) && (k60Var2 = (k60) this.d) != null && k60Var2.D()) {
            return;
        }
        if (((a6) this.h) == a6Var && (k60Var = (k60) this.d) != null && k60Var.D() && ((LinearLayout) this.f13620e) != null) {
            this.f13621f = a10;
            d(a6Var, a10);
            ((k60) this.d).O();
            return;
        }
        c();
        j(a6Var);
        this.h = a6Var;
        this.f13621f = a10;
        LinearLayout linearLayout = new LinearLayout(a6Var.getContext());
        this.f13620e = linearLayout;
        linearLayout.setOrientation(1);
        d(a6Var, a10);
        k60 a11 = ((m0) this.f13618b).a(a6Var.getEditText());
        a11.Q = true;
        a11.f35219s = 0;
        a11.f35220t = false;
        a11.r((LinearLayout) this.f13620e, ha.o(220, -2));
        a11.X = g0.L(240.0f);
        a11.f35201i = 3;
        a11.a0(-g0.L(12.0f), 0.0f);
        a11.f35214p = new a0(this, 5);
        a11.f35193d0 = true;
        if (a11.D()) {
            a11.C();
        }
        a11.Z();
        this.d = a11;
    }

    public d(int i7) {
        this.f13617a = i7;
        switch (i7) {
            case 4:
                this.f13618b = new float[16];
                this.f13619c = new float[16];
                this.d = new float[16];
                this.f13620e = new float[16];
                this.f13621f = new float[16];
                this.h = new float[4];
                this.f13622n = new float[4];
                return;
            default:
                return;
        }
    }

    public d(m0 m0Var, h6 h6Var) {
        this.f13617a = 3;
        this.f13618b = m0Var;
        this.f13619c = h6Var;
    }

    public d(Context context) {
        String str;
        String replaceAll;
        this.f13617a = 0;
        String str2 = ((e1) x9.c.f58674a.b(context)).f8340a;
        this.f13618b = str2;
        File filesDir = context.getFilesDir();
        this.f13619c = filesDir;
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
        this.f13620e = file2;
        File file3 = new File(file, "reports");
        e(file3);
        this.f13621f = file3;
        File file4 = new File(file, "priority-reports");
        e(file4);
        this.h = file4;
        File file5 = new File(file, "native-reports");
        e(file5);
        this.f13622n = file5;
    }
}
