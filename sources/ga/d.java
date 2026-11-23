package ga;

import ah.h;
import android.content.Context;
import android.opengl.Matrix;
import android.util.Log;
import android.widget.LinearLayout;
import c8.na;
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
import kg.s0;
import kg.x1;
import m1.g;
import oi.j0;
import oi.k0;
import oi.z5;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Components.a70;
import org.telegram.ui.md0;
import p5.e;
public final class d implements ib.b, q5.b {
    public final int f13271a;
    public Object f13272b;
    public Object f13273c;
    public Object d;
    public Object f13274e;
    public Object f13275f;
    public Object h;
    public Object f13276n;

    public d(fd.a aVar, fd.a aVar2, fd.a aVar3, fd.a aVar4, fd.a aVar5, fd.a aVar6, fd.a aVar7, int i7) {
        this.f13271a = i7;
        this.f13272b = aVar;
        this.f13273c = aVar2;
        this.d = aVar3;
        this.f13274e = aVar4;
        this.f13275f = aVar5;
        this.h = aVar6;
        this.f13276n = aVar7;
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
        File file = new File((File) this.f13273c, str);
        if (file.exists() && h(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.f13274e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void c() {
        j(null);
        a70 a70Var = (a70) this.d;
        if (a70Var != null) {
            a70Var.v();
            this.d = null;
        }
        this.f13274e = null;
        this.f13275f = null;
        this.h = null;
    }

    public void d(z5 z5Var, ArrayList arrayList) {
        h6 h6Var = (h6) this.f13273c;
        LinearLayout linearLayout = (LinearLayout) this.f13274e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                j0 j0Var = (j0) obj;
                x1 x1Var = new x1(z5Var.getContext(), j0Var, h6Var);
                x1Var.setPadding(g0.L(8.0f), 0, g0.L(12.0f), 0);
                x1Var.setBackground(m6.a0(m6.w0(m6.f29439i6, h6Var), 0, 0));
                x1Var.setOnClickListener(new h(this, z5Var, j0Var, 19));
                ((LinearLayout) this.f13274e).addView(x1Var, na.o(-1, 48));
            }
        }
    }

    public void f(int i7, int i10, float f10, float f11, boolean z10, float[] fArr) {
        float f12;
        float[] fArr2 = (float[]) this.f13272b;
        float f13 = (i7 - i10) / 0.3902439f;
        if (f13 <= 0.0f || f13 > i7) {
            f13 = i7;
        }
        float f14 = 1.0f;
        Matrix.perspectiveM(fArr2, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i10 / Math.max(1.0f, f13 / 1.64f))) * 2.0d), i7 / Math.max(1, i10), 0.1f, 20.0f);
        Matrix.setLookAtM((float[]) this.f13273c, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = (float[]) this.d;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f10, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f11, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM((float[]) this.f13274e, 0, (float[]) this.f13273c, 0, (float[]) this.d, 0);
        Matrix.multiplyMM((float[]) this.f13275f, 0, (float[]) this.f13272b, 0, (float[]) this.f13274e, 0);
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
        Matrix.multiplyMV((float[]) this.f13276n, 0, (float[]) this.f13275f, 0, fArr2, 0);
        float[] fArr3 = (float[]) this.f13276n;
        float f13 = 1.0f / fArr3[3];
        fArr[i11] = e2.x(fArr3[0], f13, 0.5f, 0.5f) * i7;
        fArr[i11 + 1] = c0.z(fArr3[1], f13, 0.5f, 0.5f) * i10;
        return fArr3[2] * f13;
    }

    @Override
    public Object mo24get() {
        switch (this.f13271a) {
            case 2:
                return new d1((l) ((ib.c) this.f13272b).mo24get(), (u0) ((ib.c) this.f13273c).mo24get(), (q0) ((ib.c) this.d).mo24get(), (h1) ((ib.c) this.f13274e).mo24get(), (g) ((ib.c) this.f13275f).mo24get(), (d0) ((ib.c) this.h).mo24get(), (id.h) ((ib.c) this.f13276n).mo24get());
            default:
                qb.a aVar = new qb.a(28);
                pb.b bVar = new pb.b(28);
                ?? obj = new Object();
                obj.f16182a = (Context) ((fd.a) this.f13272b).mo24get();
                obj.f16183b = (e) ((fd.a) this.f13273c).mo24get();
                obj.f16184c = (v5.d) ((fd.a) this.d).mo24get();
                obj.d = (md0) ((md0) this.f13274e).mo24get();
                obj.f16185e = (Executor) ((fd.a) this.f13275f).mo24get();
                obj.f16186f = (w5.c) ((fd.a) this.h).mo24get();
                obj.f16187g = aVar;
                obj.h = bVar;
                obj.f16188i = (v5.c) ((fd.a) this.f13276n).mo24get();
                return obj;
        }
    }

    public void j(z5 z5Var) {
        z5 z5Var2 = (z5) this.f13276n;
        if (z5Var2 != z5Var) {
            if (z5Var2 != null) {
                z5Var2.setShowCommandBackground(false);
            }
            this.f13276n = z5Var;
            if (z5Var != null) {
                z5Var.setShowCommandBackground(true);
            }
        }
    }

    public void k(z5 z5Var, String str) {
        a70 a70Var;
        a70 a70Var2;
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
        if (((z5) this.h) == z5Var && a10.equals((ArrayList) this.f13275f) && (a70Var2 = (a70) this.d) != null && a70Var2.E()) {
            return;
        }
        if (((z5) this.h) == z5Var && (a70Var = (a70) this.d) != null && a70Var.E() && ((LinearLayout) this.f13274e) != null) {
            this.f13275f = a10;
            d(z5Var, a10);
            ((a70) this.d).P();
            return;
        }
        c();
        j(z5Var);
        this.h = z5Var;
        this.f13275f = a10;
        LinearLayout linearLayout = new LinearLayout(z5Var.getContext());
        this.f13274e = linearLayout;
        linearLayout.setOrientation(1);
        d(z5Var, a10);
        a70 m10 = ((k0) this.f13272b).m(z5Var.getEditText());
        m10.T = true;
        m10.f33363s = 0;
        m10.f33365t = false;
        m10.r((LinearLayout) this.f13274e, na.o(220, -2));
        m10.f33331a0 = g0.L(240.0f);
        m10.f33344i = 3;
        m10.b0(-g0.L(12.0f), 0.0f);
        m10.f33357p = new s0(this, 27);
        m10.f33342g0 = true;
        if (m10.E()) {
            m10.D();
        }
        m10.a0();
        this.d = m10;
    }

    public d(int i7) {
        this.f13271a = i7;
        switch (i7) {
            case 4:
                this.f13272b = new float[16];
                this.f13273c = new float[16];
                this.d = new float[16];
                this.f13274e = new float[16];
                this.f13275f = new float[16];
                this.h = new float[4];
                this.f13276n = new float[4];
                return;
            default:
                return;
        }
    }

    public d(k0 k0Var, h6 h6Var) {
        this.f13271a = 3;
        this.f13272b = k0Var;
        this.f13273c = h6Var;
    }

    public d(Context context) {
        String str;
        String replaceAll;
        this.f13271a = 0;
        String str2 = ((e1) x9.c.f60438a.b(context)).f8001a;
        this.f13272b = str2;
        File filesDir = context.getFilesDir();
        this.f13273c = filesDir;
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
        this.f13274e = file2;
        File file3 = new File(file, "reports");
        e(file3);
        this.f13275f = file3;
        File file4 = new File(file, "priority-reports");
        e(file4);
        this.h = file4;
        File file5 = new File(file, "native-reports");
        e(file5);
        this.f13276n = file5;
    }
}
