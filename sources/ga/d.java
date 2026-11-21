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
import kg.i0;
import kg.w1;
import m1.g;
import oi.a6;
import oi.k0;
import oi.l0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Components.a70;
import org.telegram.ui.md0;
import p5.e;
public final class d implements ib.b, q5.b {
    public final int f13305a;
    public Object f13306b;
    public Object f13307c;
    public Object d;
    public Object f13308e;
    public Object f13309f;
    public Object h;
    public Object f13310n;

    public d(fd.a aVar, fd.a aVar2, fd.a aVar3, fd.a aVar4, fd.a aVar5, fd.a aVar6, fd.a aVar7, int i7) {
        this.f13305a = i7;
        this.f13306b = aVar;
        this.f13307c = aVar2;
        this.d = aVar3;
        this.f13308e = aVar4;
        this.f13309f = aVar5;
        this.h = aVar6;
        this.f13310n = aVar7;
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
        File file = new File((File) this.f13307c, str);
        if (file.exists() && h(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.f13308e, str);
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
        this.f13308e = null;
        this.f13309f = null;
        this.h = null;
    }

    public void d(a6 a6Var, ArrayList arrayList) {
        h6 h6Var = (h6) this.f13307c;
        LinearLayout linearLayout = (LinearLayout) this.f13308e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                k0 k0Var = (k0) obj;
                w1 w1Var = new w1(a6Var.getContext(), k0Var, h6Var);
                w1Var.setPadding(g0.L(8.0f), 0, g0.L(12.0f), 0);
                w1Var.setBackground(m6.a0(m6.w0(m6.f29470i6, h6Var), 0, 0));
                w1Var.setOnClickListener(new h(this, a6Var, k0Var, 19));
                ((LinearLayout) this.f13308e).addView(w1Var, ma.o(-1, 48));
            }
        }
    }

    public void f(int i7, int i10, float f10, float f11, boolean z10, float[] fArr) {
        float f12;
        float[] fArr2 = (float[]) this.f13306b;
        float f13 = (i7 - i10) / 0.3902439f;
        if (f13 <= 0.0f || f13 > i7) {
            f13 = i7;
        }
        float f14 = 1.0f;
        Matrix.perspectiveM(fArr2, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i10 / Math.max(1.0f, f13 / 1.64f))) * 2.0d), i7 / Math.max(1, i10), 0.1f, 20.0f);
        Matrix.setLookAtM((float[]) this.f13307c, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = (float[]) this.d;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f10, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f11, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM((float[]) this.f13308e, 0, (float[]) this.f13307c, 0, (float[]) this.d, 0);
        Matrix.multiplyMM((float[]) this.f13309f, 0, (float[]) this.f13306b, 0, (float[]) this.f13308e, 0);
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
        Matrix.multiplyMV((float[]) this.f13310n, 0, (float[]) this.f13309f, 0, fArr2, 0);
        float[] fArr3 = (float[]) this.f13310n;
        float f13 = 1.0f / fArr3[3];
        fArr[i11] = e2.x(fArr3[0], f13, 0.5f, 0.5f) * i7;
        fArr[i11 + 1] = c0.z(fArr3[1], f13, 0.5f, 0.5f) * i10;
        return fArr3[2] * f13;
    }

    @Override
    public Object mo24get() {
        switch (this.f13305a) {
            case 2:
                return new d1((l) ((ib.c) this.f13306b).mo24get(), (u0) ((ib.c) this.f13307c).mo24get(), (q0) ((ib.c) this.d).mo24get(), (h1) ((ib.c) this.f13308e).mo24get(), (g) ((ib.c) this.f13309f).mo24get(), (d0) ((ib.c) this.h).mo24get(), (id.h) ((ib.c) this.f13310n).mo24get());
            default:
                qb.a aVar = new qb.a(28);
                pb.b bVar = new pb.b(28);
                ?? obj = new Object();
                obj.f16213a = (Context) ((fd.a) this.f13306b).mo24get();
                obj.f16214b = (e) ((fd.a) this.f13307c).mo24get();
                obj.f16215c = (v5.d) ((fd.a) this.d).mo24get();
                obj.d = (md0) ((md0) this.f13308e).mo24get();
                obj.f16216e = (Executor) ((fd.a) this.f13309f).mo24get();
                obj.f16217f = (w5.c) ((fd.a) this.h).mo24get();
                obj.f16218g = aVar;
                obj.h = bVar;
                obj.f16219i = (v5.c) ((fd.a) this.f13310n).mo24get();
                return obj;
        }
    }

    public void j(a6 a6Var) {
        a6 a6Var2 = (a6) this.f13310n;
        if (a6Var2 != a6Var) {
            if (a6Var2 != null) {
                a6Var2.setShowCommandBackground(false);
            }
            this.f13310n = a6Var;
            if (a6Var != null) {
                a6Var.setShowCommandBackground(true);
            }
        }
    }

    public void k(a6 a6Var, String str) {
        a70 a70Var;
        a70 a70Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a10 = k0.a(str);
        if (a10.isEmpty()) {
            c();
            return;
        }
        j(a6Var);
        if (((a6) this.h) == a6Var && a10.equals((ArrayList) this.f13309f) && (a70Var2 = (a70) this.d) != null && a70Var2.E()) {
            return;
        }
        if (((a6) this.h) == a6Var && (a70Var = (a70) this.d) != null && a70Var.E() && ((LinearLayout) this.f13308e) != null) {
            this.f13309f = a10;
            d(a6Var, a10);
            ((a70) this.d).P();
            return;
        }
        c();
        j(a6Var);
        this.h = a6Var;
        this.f13309f = a10;
        LinearLayout linearLayout = new LinearLayout(a6Var.getContext());
        this.f13308e = linearLayout;
        linearLayout.setOrientation(1);
        d(a6Var, a10);
        a70 j3 = ((l0) this.f13306b).j(a6Var.getEditText());
        j3.T = true;
        j3.f33384s = 0;
        j3.f33386t = false;
        j3.r((LinearLayout) this.f13308e, ma.o(220, -2));
        j3.f33352a0 = g0.L(240.0f);
        j3.f33365i = 3;
        j3.b0(-g0.L(12.0f), 0.0f);
        j3.f33378p = new i0(this, 28);
        j3.f33363g0 = true;
        if (j3.E()) {
            j3.D();
        }
        j3.a0();
        this.d = j3;
    }

    public d(int i7) {
        this.f13305a = i7;
        switch (i7) {
            case 4:
                this.f13306b = new float[16];
                this.f13307c = new float[16];
                this.d = new float[16];
                this.f13308e = new float[16];
                this.f13309f = new float[16];
                this.h = new float[4];
                this.f13310n = new float[4];
                return;
            default:
                return;
        }
    }

    public d(l0 l0Var, h6 h6Var) {
        this.f13305a = 3;
        this.f13306b = l0Var;
        this.f13307c = h6Var;
    }

    public d(Context context) {
        String str;
        String replaceAll;
        this.f13305a = 0;
        String str2 = ((e1) x9.c.f60469a.b(context)).f8035a;
        this.f13306b = str2;
        File filesDir = context.getFilesDir();
        this.f13307c = filesDir;
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
        this.f13308e = file2;
        File file3 = new File(file, "reports");
        e(file3);
        this.f13309f = file3;
        File file4 = new File(file, "priority-reports");
        e(file4);
        this.h = file4;
        File file5 = new File(file, "native-reports");
        e(file5);
        this.f13310n = file5;
    }
}
