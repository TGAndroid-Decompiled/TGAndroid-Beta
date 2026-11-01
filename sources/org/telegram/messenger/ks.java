package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.LongSparseArray;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.HashMap;
public abstract class ks {
    public static volatile boolean f16782a = false;
    public static final StringBuilder f16783b = new StringBuilder();
    public static final byte[] f16784c = {-1, -40, -1, -32, 0, 16, 74, 70, 73, 70, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, -1, -37, 0, 67, 0, 40, 28, 30, 35, 30, 25, 40, 35, 33, 35, 45, 43, 40, 48, 60, 100, 65, 60, 55, 55, 60, 123, 88, 93, 73, 100, -111, Byte.MIN_VALUE, -103, -106, -113, Byte.MIN_VALUE, -116, -118, -96, -76, -26, -61, -96, -86, -38, -83, -118, -116, -56, -1, -53, -38, -18, -11, -1, -1, -1, -101, -63, -1, -1, -1, -6, -1, -26, -3, -1, -8, -1, -37, 0, 67, 1, 43, 45, 45, 60, 53, 60, 118, 65, 65, 118, -8, -91, -116, -91, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -1, -64, 0, 17, 8, 0, 30, 0, 40, 3, 1, 34, 0, 2, 17, 1, 3, 17, 1, -1, -60, 0, 31, 0, 0, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -60, 0, -75, 16, 0, 2, 1, 3, 3, 2, 4, 3, 5, 5, 4, 4, 0, 0, 1, 125, 1, 2, 3, 0, 4, 17, 5, 18, 33, 49, 65, 6, 19, 81, 97, 7, 34, 113, 20, 50, -127, -111, -95, 8, 35, 66, -79, -63, 21, 82, -47, -16, 36, 51, 98, 114, -126, 9, 10, 22, 23, 24, 25, 26, 37, 38, 39, 40, 41, 42, 52, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, -60, 0, 31, 1, 0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -60, 0, -75, 17, 0, 2, 1, 2, 4, 4, 3, 4, 7, 5, 4, 4, 0, 1, 2, 119, 0, 1, 2, 3, 17, 4, 5, 33, 49, 6, 18, 65, 81, 7, 97, 113, 19, 34, 50, -127, 8, 20, 66, -111, -95, -79, -63, 9, 35, 51, 82, -16, 21, 98, 114, -47, 10, 22, 36, 52, -31, 37, -15, 23, 24, 25, 26, 38, 39, 40, 41, 42, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -126, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -30, -29, -28, -27, -26, -25, -24, -23, -22, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, -38, 0, 12, 3, 1, 0, 2, 17, 3, 17, 0, 63, 0};
    public static final byte[] d = {-1, -39};
    public static HashMap e;
    public static ew f16785f;
    public static ew f16786g;
    public static ew h;
    public static SharedPreferences f16787i;

    public static void a(int i10) {
        SharedPreferences sharedPreferences = f16787i;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : f16787i.getAll().keySet()) {
                if (str.startsWith("confirm_shown_" + i10 + "_")) {
                    edit.remove(str);
                }
            }
            edit.apply();
        }
    }

    public static Bitmap b(int i10, int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        return createBitmap;
    }

    public static void c(String str, rc rcVar, qc qcVar) {
        d(str, rcVar, qcVar, false);
    }

    public static void d(String str, rc rcVar, qc qcVar, boolean z10) {
        if (z10) {
            try {
                Context context = w0.f18945b;
                synchronized (jb.g.f9783b) {
                    jb.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e7) {
                if (!z10) {
                    d(str, rcVar, qcVar, true);
                    return;
                }
                qcVar.p(e7);
                f8.g(e7, false);
                return;
            } catch (Exception e10) {
                qcVar.p(e10);
                f8.g(e10, true);
                return;
            } catch (Throwable th2) {
                qcVar.p(null);
                f8.g(th2, false);
                return;
            }
        }
        w7.m.a().g(str).addOnSuccessListener(new s1(rcVar, 8)).addOnFailureListener(new s1(qcVar, 9));
    }

    public static String e() {
        String str = "mips";
        String str2 = "armeabi";
        try {
            String str3 = Build.CPU_ABI;
            if (str3.equalsIgnoreCase("x86_64")) {
                str = "x86_64";
            } else if (str3.equalsIgnoreCase("arm64-v8a")) {
                str = "arm64-v8a";
            } else if (str3.equalsIgnoreCase("armeabi-v7a")) {
                str = "armeabi-v7a";
            } else {
                if (!str3.equalsIgnoreCase("armeabi")) {
                    if (str3.equalsIgnoreCase("x86")) {
                        str = "x86";
                    } else if (!str3.equalsIgnoreCase("mips")) {
                        if (v2.f18578a) {
                            f8.d("Unsupported arch: ".concat(str3));
                        }
                    }
                }
                str = "armeabi";
            }
            str2 = str;
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        String property = System.getProperty("os.arch");
        if (property != null && property.contains("686")) {
            return "x86";
        }
        return str2;
    }

    public static ew f(int i10) {
        if (i10 == 1) {
            return f16785f;
        }
        if (i10 == 2) {
            return f16786g;
        }
        if (i10 == 4) {
            return h;
        }
        return null;
    }

    public static synchronized void g(android.content.Context r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ks.g(android.content.Context):void");
    }

    public static boolean h(int i10, long j10) {
        return f16787i.getBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i10), Long.valueOf(j10)), false);
    }

    public static void i(SharedPreferences sharedPreferences) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (sharedPreferences.getBoolean("save_gallery", false) && v2.f18579b) {
            i10 = 7;
        } else {
            i10 = sharedPreferences.getInt("save_gallery_flags", -1);
        }
        if (i10 != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            ?? dwVar = new dw();
            f16785f = dwVar;
            if ((i10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            dwVar.f15448b = z10;
            dwVar.f15447a = z10;
            dwVar.f15449c = 104857600L;
            ew.c(dwVar, "user", sharedPreferences);
            ?? dwVar2 = new dw();
            f16786g = dwVar2;
            ew ewVar = f16785f;
            if ((i10 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            ewVar.f15448b = z11;
            dwVar2.f15447a = z11;
            dwVar2.f15449c = 104857600L;
            ew.c(dwVar2, "groups", sharedPreferences);
            ?? dwVar3 = new dw();
            h = dwVar3;
            if ((i10 & 4) != 0) {
                z12 = true;
            }
            dwVar3.f15448b = z12;
            dwVar3.f15447a = z12;
            dwVar3.f15449c = 104857600L;
            ew.c(dwVar3, "channels", sharedPreferences);
        } else {
            f16785f = ew.d("user", sharedPreferences);
            f16786g = ew.d("groups", sharedPreferences);
            h = ew.d("channels", sharedPreferences);
        }
        f16785f.d = 1;
        f16786g.d = 2;
        h.d = 4;
    }

    public static LongSparseArray j(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i10 = sharedPreferences.getInt("count", 0);
        for (int i11 = 0; i11 < i10; i11++) {
            ?? dwVar = new dw();
            dwVar.d = sharedPreferences.getLong(i11 + "_dialog_id", 0L);
            dwVar.f15447a = sharedPreferences.getBoolean(i11 + "_photo", false);
            dwVar.f15448b = sharedPreferences.getBoolean(i11 + "_video", false);
            dwVar.f15449c = sharedPreferences.getLong(i11 + "_limitVideo", 104857600L);
            long j10 = dwVar.d;
            if (j10 != 0) {
                longSparseArray.put(j10, dwVar);
            }
        }
        return longSparseArray;
    }

    public static boolean k(android.content.Context r6, java.io.File r7, java.io.File r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ks.k(android.content.Context, java.io.File, java.io.File, java.lang.String):boolean");
    }

    public static boolean l(int i10, j8 j8Var, kj kjVar, int i11) {
        ew ewVar;
        boolean z10;
        long j10;
        if (i10 == 1) {
            ewVar = f16785f;
        } else if (i10 == 4) {
            ewVar = h;
        } else {
            if (i10 == 2) {
                ewVar = f16786g;
            }
            return false;
        }
        ewVar.getClass();
        cw cwVar = (cw) e20.i(i11).m(ewVar.d).get(j8Var.f16422a);
        if (kjVar == null || (!kjVar.P3() && !kjVar.l4())) {
            if ((kjVar != null && kj.L4(kjVar.f16690k)) || j8Var.f16424c == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (kjVar != null) {
                j10 = kjVar.T1();
            } else {
                j10 = j8Var.d;
            }
            boolean z11 = ewVar.f15448b;
            boolean z12 = ewVar.f15447a;
            long j11 = ewVar.f15449c;
            if (cwVar != null) {
                z11 = cwVar.f15448b;
                z12 = cwVar.f15447a;
                j11 = cwVar.f15449c;
            }
            if (!z10 ? z12 : !(!z11 || (j11 != -1 && j10 >= j11))) {
                return true;
            }
        }
        return false;
    }

    public static void m(SharedPreferences sharedPreferences, LongSparseArray longSparseArray) {
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", longSparseArray.size());
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            cw cwVar = (cw) longSparseArray.valueAt(i10);
            edit.putLong(a1.g.k(i10, "_dialog_id"), cwVar.d);
            edit.putBoolean(i10 + "_photo", cwVar.f15447a);
            edit.putBoolean(i10 + "_video", cwVar.f15448b);
            edit.putLong(i10 + "_limitVideo", cwVar.f15449c);
        }
        edit.apply();
    }

    public static void n(int i10) {
        SharedPreferences sharedPreferences = w0.f18945b.getSharedPreferences("mainconfig", 0);
        if (i10 == 1) {
            ew.c(f16785f, "user", sharedPreferences);
        } else if (i10 == 2) {
            ew.c(f16786g, "groups", sharedPreferences);
        } else if (i10 == 4) {
            ew.c(h, "channels", sharedPreferences);
        }
    }

    public static void o(int i10, long j10) {
        f16787i.edit().putBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i10), Long.valueOf(j10)), true).apply();
    }
}
