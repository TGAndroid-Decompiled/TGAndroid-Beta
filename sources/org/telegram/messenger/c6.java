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
    public static double f23266a;
    public static long f23267b;
    public static final String[] f23268c = {"bluestacks", "memuhyperv", "virtualbox"};
    public static mv d;
    public static mv f23269e;
    public static mv f23270f;
    public static SharedPreferences f23271g;

    public static void a(int i7) {
        SharedPreferences sharedPreferences = f23271g;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : f23271g.getAll().keySet()) {
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
                    if (str.toLowerCase().contains(f23268c[i10])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void c(String str, nc ncVar, mc mcVar) {
        d(str, ncVar, mcVar, false);
    }

    public static void d(String str, nc ncVar, mc mcVar, boolean z10) {
        if (z10) {
            try {
                Context context = t0.f26915b;
                synchronized (pb.g.f55522b) {
                    pb.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e10) {
                if (!z10) {
                    d(str, ncVar, mcVar, true);
                    return;
                }
                mcVar.q(e10);
                a8.g(e10, false);
                return;
            } catch (Exception e11) {
                mcVar.q(e11);
                a8.g(e11, true);
                return;
            } catch (Throwable th2) {
                mcVar.q(null);
                a8.g(th2, false);
                return;
            }
        }
        c8.ec.a().h(str).addOnSuccessListener(new j1(ncVar, 10)).addOnFailureListener(new j1(mcVar, 11));
    }

    public static synchronized long e() {
        synchronized (c6.class) {
            if (f23267b != 0 && SystemClock.elapsedRealtime() - f23267b <= 60000) {
                return (long) f23266a;
            }
            return b3.g.c(t0.f26915b).a();
        }
    }

    public static mv f(int i7) {
        if (i7 == 1) {
            return d;
        }
        if (i7 == 2) {
            return f23269e;
        }
        if (i7 == 4) {
            return f23270f;
        }
        return null;
    }

    public static boolean g() {
        try {
            Class cls = Integer.TYPE;
            if (((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke((AppOpsManager) t0.f26915b.getSystemService("appops"), 10020, Integer.valueOf(Process.myUid()), t0.f26915b.getPackageName())).intValue() == 0) {
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
        return f23271g.getBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i7), Long.valueOf(j3)), false);
    }

    public static void k(SharedPreferences sharedPreferences) {
        int i7;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (sharedPreferences.getBoolean("save_gallery", false) && s2.f26724b) {
            i7 = 7;
        } else {
            i7 = sharedPreferences.getInt("save_gallery_flags", -1);
        }
        if (i7 != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            ?? lvVar = new lv();
            d = lvVar;
            if ((i7 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            lvVar.f25443b = z10;
            lvVar.f25442a = z10;
            lvVar.f25444c = 104857600L;
            mv.c(lvVar, "user", sharedPreferences);
            ?? lvVar2 = new lv();
            f23269e = lvVar2;
            mv mvVar = d;
            if ((i7 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            mvVar.f25443b = z11;
            lvVar2.f25442a = z11;
            lvVar2.f25444c = 104857600L;
            mv.c(lvVar2, "groups", sharedPreferences);
            ?? lvVar3 = new lv();
            f23270f = lvVar3;
            if ((i7 & 4) != 0) {
                z12 = true;
            }
            lvVar3.f25443b = z12;
            lvVar3.f25442a = z12;
            lvVar3.f25444c = 104857600L;
            mv.c(lvVar3, "channels", sharedPreferences);
        } else {
            d = mv.d("user", sharedPreferences);
            f23269e = mv.d("groups", sharedPreferences);
            f23270f = mv.d("channels", sharedPreferences);
        }
        d.d = 1;
        f23269e.d = 2;
        f23270f.d = 4;
    }

    public static LongSparseArray l(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i7 = sharedPreferences.getInt("count", 0);
        for (int i10 = 0; i10 < i7; i10++) {
            ?? lvVar = new lv();
            lvVar.d = sharedPreferences.getLong(i10 + "_dialog_id", 0L);
            lvVar.f25442a = sharedPreferences.getBoolean(i10 + "_photo", false);
            lvVar.f25443b = sharedPreferences.getBoolean(i10 + "_video", false);
            lvVar.f25444c = sharedPreferences.getLong(i10 + "_limitVideo", 104857600L);
            long j3 = lvVar.d;
            if (j3 != 0) {
                longSparseArray.put(j3, lvVar);
            }
        }
        return longSparseArray;
    }

    public static boolean m(int i7, e8 e8Var, fj fjVar, int i10) {
        mv mvVar;
        boolean z10;
        long j3;
        if (i7 == 1) {
            mvVar = d;
        } else if (i7 == 4) {
            mvVar = f23270f;
        } else {
            if (i7 == 2) {
                mvVar = f23269e;
            }
            return false;
        }
        mvVar.getClass();
        kv kvVar = (kv) j10.i(i10).m(mvVar.d).get(e8Var.f23672a);
        if (fjVar == null || (!fjVar.P3() && !fjVar.l4())) {
            if ((fjVar != null && fj.L4(fjVar.f23968k)) || e8Var.f23674c == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (fjVar != null) {
                j3 = fjVar.S1();
            } else {
                j3 = e8Var.d;
            }
            boolean z11 = mvVar.f25443b;
            boolean z12 = mvVar.f25442a;
            long j10 = mvVar.f25444c;
            if (kvVar != null) {
                z11 = kvVar.f25443b;
                z12 = kvVar.f25442a;
                j10 = kvVar.f25444c;
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
            kv kvVar = (kv) longSparseArray.valueAt(i7);
            edit.putLong(com.google.android.gms.internal.vision.e2.i(i7, "_dialog_id"), kvVar.d);
            edit.putBoolean(i7 + "_photo", kvVar.f25442a);
            edit.putBoolean(i7 + "_video", kvVar.f25443b);
            edit.putLong(i7 + "_limitVideo", kvVar.f25444c);
        }
        edit.apply();
    }

    public static void o(int i7) {
        SharedPreferences sharedPreferences = t0.f26915b.getSharedPreferences("mainconfig", 0);
        if (i7 == 1) {
            mv.c(d, "user", sharedPreferences);
        } else if (i7 == 2) {
            mv.c(f23269e, "groups", sharedPreferences);
        } else if (i7 == 4) {
            mv.c(f23270f, "channels", sharedPreferences);
        }
    }

    public static void p(int i7, long j3) {
        f23271g.edit().putBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i7), Long.valueOf(j3)), true).apply();
    }
}
