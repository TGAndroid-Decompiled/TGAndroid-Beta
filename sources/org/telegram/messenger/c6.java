package org.telegram.messenger;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
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
public abstract class c6 {
    public static double f23233a;
    public static long f23234b;
    public static final String[] f23235c = {"bluestacks", "memuhyperv", "virtualbox"};
    public static nv d;
    public static nv f23236e;
    public static nv f23237f;
    public static SharedPreferences f23238g;

    public static void a(int i7) {
        SharedPreferences sharedPreferences = f23238g;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : f23238g.getAll().keySet()) {
                if (str.startsWith("confirm_shown_" + i7 + "_")) {
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
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                String str = (String) obj;
                for (int i10 = 0; i10 < 3; i10++) {
                    if (str.toLowerCase().contains(f23235c[i10])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void c(String str, oc ocVar, nc ncVar) {
        d(str, ocVar, ncVar, false);
    }

    public static void d(String str, oc ocVar, nc ncVar, boolean z10) {
        if (z10) {
            try {
                Context context = t0.f26931b;
                synchronized (pb.g.f55567b) {
                    pb.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e10) {
                if (!z10) {
                    d(str, ocVar, ncVar, true);
                    return;
                }
                ncVar.q(e10);
                a8.g(e10, false);
                return;
            } catch (Exception e11) {
                ncVar.q(e11);
                a8.g(e11, true);
                return;
            } catch (Throwable th2) {
                ncVar.q(null);
                a8.g(th2, false);
                return;
            }
        }
        c8.ec.a().h(str).addOnSuccessListener(new j1(ocVar, 10)).addOnFailureListener(new j1(ncVar, 11));
    }

    public static synchronized long e() {
        synchronized (c6.class) {
            if (f23234b != 0 && SystemClock.elapsedRealtime() - f23234b <= 60000) {
                return (long) f23233a;
            }
            return b3.g.c(t0.f26931b).a();
        }
    }

    public static nv f(int i7) {
        if (i7 == 1) {
            return d;
        }
        if (i7 == 2) {
            return f23236e;
        }
        if (i7 == 4) {
            return f23237f;
        }
        return null;
    }

    public static boolean g() {
        try {
            Class cls = Integer.TYPE;
            if (((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke((AppOpsManager) t0.f26931b.getSystemService("appops"), 10020, Integer.valueOf(Process.myUid()), t0.f26931b.getPackageName())).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception e10) {
            a8.g(e10, true);
            return true;
        }
    }

    public static boolean h() {
        if (e() >= 3000000) {
            return true;
        }
        return false;
    }

    public static boolean i() {
        return !TextUtils.isEmpty(g0.k1("ro.miui.ui.version.name"));
    }

    public static boolean j(int i7, long j3) {
        return f23238g.getBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i7), Long.valueOf(j3)), false);
    }

    public static void k(SharedPreferences sharedPreferences) {
        int i7;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (sharedPreferences.getBoolean("save_gallery", false) && s2.f26731b) {
            i7 = 7;
        } else {
            i7 = sharedPreferences.getInt("save_gallery_flags", -1);
        }
        if (i7 != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            ?? mvVar = new mv();
            d = mvVar;
            if ((i7 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            mvVar.f25647b = z10;
            mvVar.f25646a = z10;
            mvVar.f25648c = 104857600L;
            nv.c(mvVar, "user", sharedPreferences);
            ?? mvVar2 = new mv();
            f23236e = mvVar2;
            nv nvVar = d;
            if ((i7 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            nvVar.f25647b = z11;
            mvVar2.f25646a = z11;
            mvVar2.f25648c = 104857600L;
            nv.c(mvVar2, "groups", sharedPreferences);
            ?? mvVar3 = new mv();
            f23237f = mvVar3;
            if ((i7 & 4) != 0) {
                z12 = true;
            }
            mvVar3.f25647b = z12;
            mvVar3.f25646a = z12;
            mvVar3.f25648c = 104857600L;
            nv.c(mvVar3, "channels", sharedPreferences);
        } else {
            d = nv.d("user", sharedPreferences);
            f23236e = nv.d("groups", sharedPreferences);
            f23237f = nv.d("channels", sharedPreferences);
        }
        d.d = 1;
        f23236e.d = 2;
        f23237f.d = 4;
    }

    public static LongSparseArray l(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i7 = sharedPreferences.getInt("count", 0);
        for (int i10 = 0; i10 < i7; i10++) {
            ?? mvVar = new mv();
            mvVar.d = sharedPreferences.getLong(i10 + "_dialog_id", 0L);
            mvVar.f25646a = sharedPreferences.getBoolean(i10 + "_photo", false);
            mvVar.f25647b = sharedPreferences.getBoolean(i10 + "_video", false);
            mvVar.f25648c = sharedPreferences.getLong(i10 + "_limitVideo", 104857600L);
            long j3 = mvVar.d;
            if (j3 != 0) {
                longSparseArray.put(j3, mvVar);
            }
        }
        return longSparseArray;
    }

    public static boolean m(int i7, e8 e8Var, gj gjVar, int i10) {
        nv nvVar;
        boolean z10;
        long j3;
        if (i7 == 1) {
            nvVar = d;
        } else if (i7 == 4) {
            nvVar = f23237f;
        } else {
            if (i7 == 2) {
                nvVar = f23236e;
            }
            return false;
        }
        nvVar.getClass();
        lv lvVar = (lv) k10.i(i10).m(nvVar.d).get(e8Var.f23687a);
        if (gjVar == null || (!gjVar.P3() && !gjVar.l4())) {
            if ((gjVar != null && gj.L4(gjVar.f24213k)) || e8Var.f23689c == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (gjVar != null) {
                j3 = gjVar.S1();
            } else {
                j3 = e8Var.d;
            }
            boolean z11 = nvVar.f25647b;
            boolean z12 = nvVar.f25646a;
            long j10 = nvVar.f25648c;
            if (lvVar != null) {
                z11 = lvVar.f25647b;
                z12 = lvVar.f25646a;
                j10 = lvVar.f25648c;
            }
            if (!z10 ? z12 : !(!z11 || (j10 != -1 && j3 >= j10))) {
                return true;
            }
        }
        return false;
    }

    public static void n(SharedPreferences sharedPreferences, LongSparseArray longSparseArray) {
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", longSparseArray.size());
        for (int i7 = 0; i7 < longSparseArray.size(); i7++) {
            lv lvVar = (lv) longSparseArray.valueAt(i7);
            edit.putLong(com.google.android.gms.internal.vision.e2.i(i7, "_dialog_id"), lvVar.d);
            edit.putBoolean(i7 + "_photo", lvVar.f25646a);
            edit.putBoolean(i7 + "_video", lvVar.f25647b);
            edit.putLong(i7 + "_limitVideo", lvVar.f25648c);
        }
        edit.apply();
    }

    public static void o(int i7) {
        SharedPreferences sharedPreferences = t0.f26931b.getSharedPreferences("mainconfig", 0);
        if (i7 == 1) {
            nv.c(d, "user", sharedPreferences);
        } else if (i7 == 2) {
            nv.c(f23236e, "groups", sharedPreferences);
        } else if (i7 == 4) {
            nv.c(f23237f, "channels", sharedPreferences);
        }
    }

    public static void p(int i7, long j3) {
        f23238g.edit().putBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i7), Long.valueOf(j3)), true).apply();
    }
}
