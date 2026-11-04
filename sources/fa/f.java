package fa;

import ai.h;
import android.content.Context;
import android.opengl.Matrix;
import android.util.Log;
import android.widget.LinearLayout;
import b8.mf;
import db.c0;
import db.e1;
import db.i1;
import db.q0;
import db.u0;
import gb.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import l1.g;
import lg.n;
import lg.v1;
import mi.b6;
import mi.m0;
import mi.n0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.f60;
import v7.s;
public final class f implements fb.b, p5.b {
    public final int f11538a;
    public Object f11539b;
    public Object f11540c;
    public Object d;
    public Object f11541e;
    public Object f11542f;
    public Object h;
    public Object f11543n;

    public f(cd.a aVar, cd.a aVar2, cd.a aVar3, cd.a aVar4, cd.a aVar5, cd.a aVar6, cd.a aVar7, int i3) {
        this.f11538a = i3;
        this.f11539b = aVar;
        this.f11540c = aVar2;
        this.d = aVar3;
        this.f11541e = aVar4;
        this.f11542f = aVar5;
        this.h = aVar6;
        this.f11543n = aVar7;
    }

    public static synchronized void e(File file) {
        synchronized (f.class) {
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
        File file = new File((File) this.f11540c, str);
        if (file.exists() && h(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.f11541e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void c() {
        j(null);
        f60 f60Var = (f60) this.d;
        if (f60Var != null) {
            f60Var.u();
            this.d = null;
        }
        this.f11541e = null;
        this.f11542f = null;
        this.h = null;
    }

    public void d(b6 b6Var, ArrayList arrayList) {
        e6 e6Var = (e6) this.f11540c;
        LinearLayout linearLayout = (LinearLayout) this.f11541e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                m0 m0Var = (m0) obj;
                v1 v1Var = new v1(b6Var.getContext(), m0Var, e6Var);
                v1Var.setPadding(g0.L(8.0f), 0, g0.L(12.0f), 0);
                v1Var.setBackground(k6.a0(k6.w0(k6.f27972i6, e6Var), 0, 0));
                v1Var.setOnClickListener(new h(this, b6Var, m0Var, 19));
                ((LinearLayout) this.f11541e).addView(v1Var, mf.o(-1, 48));
            }
        }
    }

    public void f(int i3, int i10, float f10, float f11, boolean z10, float[] fArr) {
        float f12;
        float[] fArr2 = (float[]) this.f11539b;
        float f13 = (i3 - i10) / 0.3902439f;
        if (f13 <= 0.0f || f13 > i3) {
            f13 = i3;
        }
        float f14 = 1.0f;
        Matrix.perspectiveM(fArr2, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i10 / Math.max(1.0f, f13 / 1.64f))) * 2.0d), i3 / Math.max(1, i10), 0.1f, 20.0f);
        Matrix.setLookAtM((float[]) this.f11540c, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = (float[]) this.d;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f10, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f11, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM((float[]) this.f11541e, 0, (float[]) this.f11540c, 0, (float[]) this.d, 0);
        Matrix.multiplyMM((float[]) this.f11542f, 0, (float[]) this.f11539b, 0, (float[]) this.f11541e, 0);
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
        g(f12, 0.618561f, f15, i3, i10, fArr, 0);
        g(f12, 0.618561f, f16, i3, i10, fArr, 2);
        g(f12, -0.593561f, f16, i3, i10, fArr, 4);
        g(f12, -0.593561f, f15, i3, i10, fArr, 6);
    }

    public float g(float f10, float f11, float f12, int i3, int i10, float[] fArr, int i11) {
        float[] fArr2 = (float[]) this.h;
        fArr2[0] = f10;
        fArr2[1] = f11;
        fArr2[2] = f12;
        fArr2[3] = 1.0f;
        Matrix.multiplyMV((float[]) this.f11543n, 0, (float[]) this.f11542f, 0, fArr2, 0);
        float[] fArr3 = (float[]) this.f11543n;
        float f13 = 1.0f / fArr3[3];
        fArr[i11] = com.google.android.recaptcha.internal.a.v(fArr3[0], f13, 0.5f, 0.5f) * i3;
        fArr[i11 + 1] = f1.A(fArr3[1], f13, 0.5f, 0.5f) * i10;
        return fArr3[2] * f13;
    }

    @Override
    public Object mo5get() {
        switch (this.f11538a) {
            case 2:
                return new e1((l) ((fb.c) this.f11539b).mo5get(), (u0) ((fb.c) this.f11540c).mo5get(), (q0) ((fb.c) this.d).mo5get(), (i1) ((fb.c) this.f11541e).mo5get(), (g) ((fb.c) this.f11542f).mo5get(), (c0) ((fb.c) this.h).mo5get(), (fd.h) ((fb.c) this.f11543n).mo5get());
            default:
                kb.a aVar = new kb.a(27);
                s sVar = new s(26);
                ?? obj = new Object();
                obj.f14372a = (Context) ((cd.a) this.f11539b).mo5get();
                obj.f14373b = (o5.d) ((cd.a) this.f11540c).mo5get();
                obj.f14374c = (u5.d) ((cd.a) this.d).mo5get();
                obj.d = (p7.d) ((p7.d) this.f11541e).mo5get();
                obj.f14375e = (Executor) ((cd.a) this.f11542f).mo5get();
                obj.f14376f = (v5.c) ((cd.a) this.h).mo5get();
                obj.f14377g = aVar;
                obj.h = sVar;
                obj.f14378i = (u5.c) ((cd.a) this.f11543n).mo5get();
                return obj;
        }
    }

    public void j(b6 b6Var) {
        b6 b6Var2 = (b6) this.f11543n;
        if (b6Var2 != b6Var) {
            if (b6Var2 != null) {
                b6Var2.setShowCommandBackground(false);
            }
            this.f11543n = b6Var;
            if (b6Var != null) {
                b6Var.setShowCommandBackground(true);
            }
        }
    }

    public void k(b6 b6Var, String str) {
        f60 f60Var;
        f60 f60Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a10 = m0.a(str);
        if (a10.isEmpty()) {
            c();
            return;
        }
        j(b6Var);
        if (((b6) this.h) == b6Var && a10.equals((ArrayList) this.f11542f) && (f60Var2 = (f60) this.d) != null && f60Var2.D()) {
            return;
        }
        if (((b6) this.h) == b6Var && (f60Var = (f60) this.d) != null && f60Var.D() && ((LinearLayout) this.f11541e) != null) {
            this.f11542f = a10;
            d(b6Var, a10);
            ((f60) this.d).O();
            return;
        }
        c();
        j(b6Var);
        this.h = b6Var;
        this.f11542f = a10;
        LinearLayout linearLayout = new LinearLayout(b6Var.getContext());
        this.f11541e = linearLayout;
        linearLayout.setOrientation(1);
        d(b6Var, a10);
        f60 h = ((n0) this.f11539b).h(b6Var.getEditText());
        h.Q = true;
        h.f33747s = 0;
        h.f33748t = false;
        h.r((LinearLayout) this.f11541e, mf.o(220, -2));
        h.X = g0.L(240.0f);
        h.f33729i = 3;
        h.a0(-g0.L(12.0f), 0.0f);
        h.f33742p = new n(this, 13);
        h.f33721d0 = true;
        if (h.D()) {
            h.C();
        }
        h.Z();
        this.d = h;
    }

    public f(int i3) {
        this.f11538a = i3;
        switch (i3) {
            case 4:
                this.f11539b = new float[16];
                this.f11540c = new float[16];
                this.d = new float[16];
                this.f11541e = new float[16];
                this.f11542f = new float[16];
                this.h = new float[4];
                this.f11543n = new float[4];
                return;
            default:
                return;
        }
    }

    public f(n0 n0Var, e6 e6Var) {
        this.f11538a = 3;
        this.f11539b = n0Var;
        this.f11540c = e6Var;
    }

    public f(Context context) {
        String str;
        String replaceAll;
        this.f11538a = 0;
        String str2 = ((ca.e1) w9.d.f57427a.b(context)).f4363a;
        this.f11539b = str2;
        File filesDir = context.getFilesDir();
        this.f11540c = filesDir;
        if (!str2.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
            sb2.append(File.separator);
            if (str2.length() > 40) {
                replaceAll = z9.g.i(str2);
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
        this.f11541e = file2;
        File file3 = new File(file, "reports");
        e(file3);
        this.f11542f = file3;
        File file4 = new File(file, "priority-reports");
        e(file4);
        this.h = file4;
        File file5 = new File(file, "native-reports");
        e(file5);
        this.f11543n = file5;
    }
}
