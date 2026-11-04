package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.google.android.gms.tasks.TaskExecutors;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public abstract class b6 {
    public static double f21742a;
    public static long f21743b;
    public static final String[] f21744c = {"bluestacks", "memuhyperv", "virtualbox"};
    public static kv d;
    public static kv f21745e;
    public static kv f21746f;
    public static SharedPreferences f21747g;

    public static void a(int i3) {
        SharedPreferences sharedPreferences = f21747g;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : f21747g.getAll().keySet()) {
                if (str.startsWith("confirm_shown_" + i3 + "_")) {
                    edit.remove(str);
                }
            }
            edit.apply();
        }
    }

    public static boolean b() {
        File file = new File("/proc/bus/input/devices");
        ArrayList arrayList = null;
        if (file.canRead()) {
            try {
                ArrayList arrayList2 = new ArrayList();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (readLine.startsWith("N: Name=\"")) {
                        String substring = readLine.substring(9, readLine.length() - 1);
                        if (!TextUtils.isEmpty(substring)) {
                            arrayList2.add(substring);
                        }
                    }
                }
                bufferedReader.close();
                arrayList = arrayList2;
            } catch (IOException e10) {
                a8.g(e10, true);
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                String str = (String) obj;
                for (int i10 = 0; i10 < 3; i10++) {
                    if (str.toLowerCase().contains(f21744c[i10])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void c(String str, jc jcVar, ic icVar) {
        d(str, jcVar, icVar, false);
    }

    public static void d(String str, jc jcVar, ic icVar, boolean z10) {
        if (z10) {
            try {
                Context context = t0.f25457b;
                synchronized (mb.g.f19230b) {
                    mb.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e10) {
                if (!z10) {
                    d(str, jcVar, icVar, true);
                    return;
                }
                icVar.s(e10);
                a8.g(e10, false);
                return;
            } catch (Exception e11) {
                icVar.s(e11);
                a8.g(e11, true);
                return;
            } catch (Throwable th2) {
                icVar.s(null);
                a8.g(th2, false);
                return;
            }
        }
        b8.gf.a().g(str).addOnSuccessListener(new p1(jcVar, 8)).addOnFailureListener(new p1(icVar, 9));
    }

    public static synchronized long e() {
        synchronized (b6.class) {
            if (f21743b != 0 && SystemClock.elapsedRealtime() - f21743b <= 60000) {
                return (long) f21742a;
            }
            return a3.g.c(t0.f25457b).a();
        }
    }

    public static kv f(int i3) {
        if (i3 == 1) {
            return d;
        }
        if (i3 == 2) {
            return f21745e;
        }
        if (i3 == 4) {
            return f21746f;
        }
        return null;
    }

    public static boolean g() {
        if (e() >= 3000000) {
            return true;
        }
        return false;
    }

    public static boolean h(int i3, long j10) {
        return f21747g.getBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i3), Long.valueOf(j10)), false);
    }

    public static void i(SharedPreferences sharedPreferences) {
        int i3;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (sharedPreferences.getBoolean("save_gallery", false) && r2.f25041b) {
            i3 = 7;
        } else {
            i3 = sharedPreferences.getInt("save_gallery_flags", -1);
        }
        if (i3 != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            ?? jvVar = new jv();
            d = jvVar;
            if ((i3 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            jvVar.f23728b = z10;
            jvVar.f23727a = z10;
            jvVar.f23729c = 104857600L;
            kv.c(jvVar, "user", sharedPreferences);
            ?? jvVar2 = new jv();
            f21745e = jvVar2;
            kv kvVar = d;
            if ((i3 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            kvVar.f23728b = z11;
            jvVar2.f23727a = z11;
            jvVar2.f23729c = 104857600L;
            kv.c(jvVar2, "groups", sharedPreferences);
            ?? jvVar3 = new jv();
            f21746f = jvVar3;
            if ((i3 & 4) != 0) {
                z12 = true;
            }
            jvVar3.f23728b = z12;
            jvVar3.f23727a = z12;
            jvVar3.f23729c = 104857600L;
            kv.c(jvVar3, "channels", sharedPreferences);
        } else {
            d = kv.d("user", sharedPreferences);
            f21745e = kv.d("groups", sharedPreferences);
            f21746f = kv.d("channels", sharedPreferences);
        }
        d.d = 1;
        f21745e.d = 2;
        f21746f.d = 4;
    }

    public static LongSparseArray j(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i3 = sharedPreferences.getInt("count", 0);
        for (int i10 = 0; i10 < i3; i10++) {
            ?? jvVar = new jv();
            jvVar.d = sharedPreferences.getLong(i10 + "_dialog_id", 0L);
            jvVar.f23727a = sharedPreferences.getBoolean(i10 + "_photo", false);
            jvVar.f23728b = sharedPreferences.getBoolean(i10 + "_video", false);
            jvVar.f23729c = sharedPreferences.getLong(i10 + "_limitVideo", 104857600L);
            long j10 = jvVar.d;
            if (j10 != 0) {
                longSparseArray.put(j10, jvVar);
            }
        }
        return longSparseArray;
    }

    public static boolean k(int i3, e8 e8Var, zi ziVar, int i10) {
        kv kvVar;
        boolean z10;
        long j10;
        if (i3 == 1) {
            kvVar = d;
        } else if (i3 == 4) {
            kvVar = f21746f;
        } else {
            if (i3 == 2) {
                kvVar = f21745e;
            }
            return false;
        }
        kvVar.getClass();
        iv ivVar = (iv) h10.i(i10).m(kvVar.d).get(e8Var.f22324a);
        if (ziVar == null || (!ziVar.Q3() && !ziVar.m4())) {
            if ((ziVar != null && zi.M4(ziVar.f26868k)) || e8Var.f22326c == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (ziVar != null) {
                j10 = ziVar.T1();
            } else {
                j10 = e8Var.d;
            }
            boolean z11 = kvVar.f23728b;
            boolean z12 = kvVar.f23727a;
            long j11 = kvVar.f23729c;
            if (ivVar != null) {
                z11 = ivVar.f23728b;
                z12 = ivVar.f23727a;
                j11 = ivVar.f23729c;
            }
            if (!z10 ? z12 : !(!z11 || (j11 != -1 && j10 >= j11))) {
                return true;
            }
        }
        return false;
    }

    public static void l(SharedPreferences sharedPreferences, LongSparseArray longSparseArray) {
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", longSparseArray.size());
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            iv ivVar = (iv) longSparseArray.valueAt(i3);
            edit.putLong(com.google.android.recaptcha.internal.a.h(i3, "_dialog_id"), ivVar.d);
            edit.putBoolean(i3 + "_photo", ivVar.f23727a);
            edit.putBoolean(i3 + "_video", ivVar.f23728b);
            edit.putLong(i3 + "_limitVideo", ivVar.f23729c);
        }
        edit.apply();
    }

    public static void m(int i3) {
        SharedPreferences sharedPreferences = t0.f25457b.getSharedPreferences("mainconfig", 0);
        if (i3 == 1) {
            kv.c(d, "user", sharedPreferences);
        } else if (i3 == 2) {
            kv.c(f21745e, "groups", sharedPreferences);
        } else if (i3 == 4) {
            kv.c(f21746f, "channels", sharedPreferences);
        }
    }

    public static void n(int i3, long j10) {
        f21747g.edit().putBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i3), Long.valueOf(j10)), true).apply();
    }
}
