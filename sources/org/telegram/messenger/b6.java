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
public abstract class b6 {
    public static double f22662a;
    public static long f22663b;
    public static final String[] f22664c = {"bluestacks", "memuhyperv", "virtualbox"};
    public static qv d;
    public static qv f22665e;
    public static qv f22666f;
    public static SharedPreferences f22667g;

    public static void a(int i7) {
        SharedPreferences sharedPreferences = f22667g;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : f22667g.getAll().keySet()) {
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
                    if (str.toLowerCase().contains(f22664c[i10])) {
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
                Context context = t0.f26600b;
                synchronized (pb.g.f54946b) {
                    pb.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e10) {
                if (!z10) {
                    d(str, ocVar, ncVar, true);
                    return;
                }
                ncVar.r(e10);
                a8.g(e10, false);
                return;
            } catch (Exception e11) {
                ncVar.r(e11);
                a8.g(e11, true);
                return;
            } catch (Throwable th2) {
                ncVar.r(null);
                a8.g(th2, false);
                return;
            }
        }
        c8.bc.a().g(str).addOnSuccessListener(new j1(ocVar, 9)).addOnFailureListener(new j1(ncVar, 10));
    }

    public static synchronized long e() {
        synchronized (b6.class) {
            if (f22663b != 0 && SystemClock.elapsedRealtime() - f22663b <= 60000) {
                return (long) f22662a;
            }
            return b3.g.c(t0.f26600b).a();
        }
    }

    public static qv f(int i7) {
        if (i7 == 1) {
            return d;
        }
        if (i7 == 2) {
            return f22665e;
        }
        if (i7 == 4) {
            return f22666f;
        }
        return null;
    }

    public static boolean g() {
        try {
            Class cls = Integer.TYPE;
            if (((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke((AppOpsManager) t0.f26600b.getSystemService("appops"), 10020, Integer.valueOf(Process.myUid()), t0.f26600b.getPackageName())).intValue() == 0) {
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
        return f22667g.getBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i7), Long.valueOf(j3)), false);
    }

    public static void k(SharedPreferences sharedPreferences) {
        int i7;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (sharedPreferences.getBoolean("save_gallery", false) && r2.f26199b) {
            i7 = 7;
        } else {
            i7 = sharedPreferences.getInt("save_gallery_flags", -1);
        }
        if (i7 != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            ?? pvVar = new pv();
            d = pvVar;
            if ((i7 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            pvVar.f25993b = z10;
            pvVar.f25992a = z10;
            pvVar.f25994c = 104857600L;
            qv.c(pvVar, "user", sharedPreferences);
            ?? pvVar2 = new pv();
            f22665e = pvVar2;
            qv qvVar = d;
            if ((i7 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            qvVar.f25993b = z11;
            pvVar2.f25992a = z11;
            pvVar2.f25994c = 104857600L;
            qv.c(pvVar2, "groups", sharedPreferences);
            ?? pvVar3 = new pv();
            f22666f = pvVar3;
            if ((i7 & 4) != 0) {
                z12 = true;
            }
            pvVar3.f25993b = z12;
            pvVar3.f25992a = z12;
            pvVar3.f25994c = 104857600L;
            qv.c(pvVar3, "channels", sharedPreferences);
        } else {
            d = qv.d("user", sharedPreferences);
            f22665e = qv.d("groups", sharedPreferences);
            f22666f = qv.d("channels", sharedPreferences);
        }
        d.d = 1;
        f22665e.d = 2;
        f22666f.d = 4;
    }

    public static LongSparseArray l(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i7 = sharedPreferences.getInt("count", 0);
        for (int i10 = 0; i10 < i7; i10++) {
            ?? pvVar = new pv();
            pvVar.d = sharedPreferences.getLong(i10 + "_dialog_id", 0L);
            pvVar.f25992a = sharedPreferences.getBoolean(i10 + "_photo", false);
            pvVar.f25993b = sharedPreferences.getBoolean(i10 + "_video", false);
            pvVar.f25994c = sharedPreferences.getLong(i10 + "_limitVideo", 104857600L);
            long j3 = pvVar.d;
            if (j3 != 0) {
                longSparseArray.put(j3, pvVar);
            }
        }
        return longSparseArray;
    }

    public static boolean m(int i7, e8 e8Var, gj gjVar, int i10) {
        qv qvVar;
        boolean z10;
        long j3;
        if (i7 == 1) {
            qvVar = d;
        } else if (i7 == 4) {
            qvVar = f22666f;
        } else {
            if (i7 == 2) {
                qvVar = f22665e;
            }
            return false;
        }
        qvVar.getClass();
        ov ovVar = (ov) m10.i(i10).m(qvVar.d).get(e8Var.f23272a);
        if (gjVar == null || (!gjVar.P3() && !gjVar.l4())) {
            if ((gjVar != null && gj.L4(gjVar.f23817k)) || e8Var.f23274c == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (gjVar != null) {
                j3 = gjVar.S1();
            } else {
                j3 = e8Var.d;
            }
            boolean z11 = qvVar.f25993b;
            boolean z12 = qvVar.f25992a;
            long j10 = qvVar.f25994c;
            if (ovVar != null) {
                z11 = ovVar.f25993b;
                z12 = ovVar.f25992a;
                j10 = ovVar.f25994c;
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
            ov ovVar = (ov) longSparseArray.valueAt(i7);
            edit.putLong(com.google.android.gms.internal.vision.e2.i(i7, "_dialog_id"), ovVar.d);
            edit.putBoolean(i7 + "_photo", ovVar.f25992a);
            edit.putBoolean(i7 + "_video", ovVar.f25993b);
            edit.putLong(i7 + "_limitVideo", ovVar.f25994c);
        }
        edit.apply();
    }

    public static void o(int i7) {
        SharedPreferences sharedPreferences = t0.f26600b.getSharedPreferences("mainconfig", 0);
        if (i7 == 1) {
            qv.c(d, "user", sharedPreferences);
        } else if (i7 == 2) {
            qv.c(f22665e, "groups", sharedPreferences);
        } else if (i7 == 4) {
            qv.c(f22666f, "channels", sharedPreferences);
        }
    }

    public static void p(int i7, long j3) {
        f22667g.edit().putBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i7), Long.valueOf(j3)), true).apply();
    }
}
