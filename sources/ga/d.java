package ga;

import ah.g;
import android.content.Context;
import android.opengl.Matrix;
import android.util.Log;
import android.widget.LinearLayout;
import c8.ja;
import com.google.android.gms.internal.vision.e2;
import da.e1;
import gb.d0;
import gb.d1;
import gb.h1;
import gb.q0;
import gb.u0;
import id.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import jb.l;
import kg.j1;
import kg.w1;
import oi.j0;
import oi.k0;
import oi.y5;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.ld0;
public final class d implements ib.b, q5.b {
    public final int f12962a;
    public Object f12963b;
    public Object f12964c;
    public Object d;
    public Object f12965e;
    public Object f12966f;
    public Object h;
    public Object f12967n;

    public d(fd.a aVar, fd.a aVar2, fd.a aVar3, fd.a aVar4, fd.a aVar5, fd.a aVar6, fd.a aVar7, int i7) {
        this.f12962a = i7;
        this.f12963b = aVar;
        this.f12964c = aVar2;
        this.d = aVar3;
        this.f12965e = aVar4;
        this.f12966f = aVar5;
        this.h = aVar6;
        this.f12967n = aVar7;
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
        File file = new File((File) this.f12964c, str);
        if (file.exists() && h(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.f12965e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void c() {
        j(null);
        m60 m60Var = (m60) this.d;
        if (m60Var != null) {
            m60Var.u();
            this.d = null;
        }
        this.f12965e = null;
        this.f12966f = null;
        this.h = null;
    }

    public void d(y5 y5Var, ArrayList arrayList) {
        e6 e6Var = (e6) this.f12964c;
        LinearLayout linearLayout = (LinearLayout) this.f12965e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                j0 j0Var = (j0) obj;
                w1 w1Var = new w1(y5Var.getContext(), j0Var, e6Var);
                w1Var.setPadding(g0.L(8.0f), 0, g0.L(12.0f), 0);
                w1Var.setBackground(j6.a0(j6.w0(j6.f28941i6, e6Var), 0, 0));
                w1Var.setOnClickListener(new g(this, y5Var, j0Var, 19));
                ((LinearLayout) this.f12965e).addView(w1Var, ja.o(-1, 48));
            }
        }
    }

    public void f(int i7, int i10, float f10, float f11, boolean z10, float[] fArr) {
        float f12;
        float[] fArr2 = (float[]) this.f12963b;
        float f13 = (i7 - i10) / 0.3902439f;
        if (f13 <= 0.0f || f13 > i7) {
            f13 = i7;
        }
        float f14 = 1.0f;
        Matrix.perspectiveM(fArr2, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i10 / Math.max(1.0f, f13 / 1.64f))) * 2.0d), i7 / Math.max(1, i10), 0.1f, 20.0f);
        Matrix.setLookAtM((float[]) this.f12964c, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = (float[]) this.d;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f10, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f11, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM((float[]) this.f12965e, 0, (float[]) this.f12964c, 0, (float[]) this.d, 0);
        Matrix.multiplyMM((float[]) this.f12966f, 0, (float[]) this.f12963b, 0, (float[]) this.f12965e, 0);
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
        Matrix.multiplyMV((float[]) this.f12967n, 0, (float[]) this.f12966f, 0, fArr2, 0);
        float[] fArr3 = (float[]) this.f12967n;
        float f13 = 1.0f / fArr3[3];
        fArr[i11] = e2.x(fArr3[0], f13, 0.5f, 0.5f) * i7;
        fArr[i11 + 1] = y0.x(fArr3[1], f13, 0.5f, 0.5f) * i10;
        return fArr3[2] * f13;
    }

    @Override
    public Object mo24get() {
        switch (this.f12962a) {
            case 2:
                return new d1((l) ((ib.c) this.f12963b).mo24get(), (u0) ((ib.c) this.f12964c).mo24get(), (q0) ((ib.c) this.d).mo24get(), (h1) ((ib.c) this.f12965e).mo24get(), (m1.g) ((ib.c) this.f12966f).mo24get(), (d0) ((ib.c) this.h).mo24get(), (h) ((ib.c) this.f12967n).mo24get());
            default:
                qb.a aVar = new qb.a(28);
                pb.b bVar = new pb.b(28);
                ?? obj = new Object();
                obj.f15873a = (Context) ((fd.a) this.f12963b).mo24get();
                obj.f15874b = (p5.d) ((fd.a) this.f12964c).mo24get();
                obj.f15875c = (v5.d) ((fd.a) this.d).mo24get();
                obj.d = (ld0) ((ld0) this.f12965e).mo24get();
                obj.f15876e = (Executor) ((fd.a) this.f12966f).mo24get();
                obj.f15877f = (w5.c) ((fd.a) this.h).mo24get();
                obj.f15878g = aVar;
                obj.h = bVar;
                obj.f15879i = (v5.c) ((fd.a) this.f12967n).mo24get();
                return obj;
        }
    }

    public void j(y5 y5Var) {
        y5 y5Var2 = (y5) this.f12967n;
        if (y5Var2 != y5Var) {
            if (y5Var2 != null) {
                y5Var2.setShowCommandBackground(false);
            }
            this.f12967n = y5Var;
            if (y5Var != null) {
                y5Var.setShowCommandBackground(true);
            }
        }
    }

    public void k(y5 y5Var, String str) {
        m60 m60Var;
        m60 m60Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a10 = j0.a(str);
        if (a10.isEmpty()) {
            c();
            return;
        }
        j(y5Var);
        if (((y5) this.h) == y5Var && a10.equals((ArrayList) this.f12966f) && (m60Var2 = (m60) this.d) != null && m60Var2.D()) {
            return;
        }
        if (((y5) this.h) == y5Var && (m60Var = (m60) this.d) != null && m60Var.D() && ((LinearLayout) this.f12965e) != null) {
            this.f12966f = a10;
            d(y5Var, a10);
            ((m60) this.d).O();
            return;
        }
        c();
        j(y5Var);
        this.h = y5Var;
        this.f12966f = a10;
        LinearLayout linearLayout = new LinearLayout(y5Var.getContext());
        this.f12965e = linearLayout;
        linearLayout.setOrientation(1);
        d(y5Var, a10);
        m60 b10 = ((k0) this.f12963b).b(y5Var.getEditText());
        b10.Q = true;
        b10.f37111s = 0;
        b10.f37112t = false;
        b10.r((LinearLayout) this.f12965e, ja.o(220, -2));
        b10.X = g0.L(240.0f);
        b10.f37093i = 3;
        b10.a0(-g0.L(12.0f), 0.0f);
        b10.f37106p = new j1(this, 24);
        b10.f37085d0 = true;
        if (b10.D()) {
            b10.C();
        }
        b10.Z();
        this.d = b10;
    }

    public d(int i7) {
        this.f12962a = i7;
        switch (i7) {
            case 4:
                this.f12963b = new float[16];
                this.f12964c = new float[16];
                this.d = new float[16];
                this.f12965e = new float[16];
                this.f12966f = new float[16];
                this.h = new float[4];
                this.f12967n = new float[4];
                return;
            default:
                return;
        }
    }

    public d(k0 k0Var, e6 e6Var) {
        this.f12962a = 3;
        this.f12963b = k0Var;
        this.f12964c = e6Var;
    }

    public d(Context context) {
        String str;
        String replaceAll;
        this.f12962a = 0;
        String str2 = ((e1) x9.c.f59857a.b(context)).f7727a;
        this.f12963b = str2;
        File filesDir = context.getFilesDir();
        this.f12964c = filesDir;
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
        this.f12965e = file2;
        File file3 = new File(file, "reports");
        e(file3);
        this.f12966f = file3;
        File file4 = new File(file, "priority-reports");
        e(file4);
        this.h = file4;
        File file5 = new File(file, "native-reports");
        e(file5);
        this.f12967n = file5;
    }
}
