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
    public static double f21590a;
    public static long f21591b;
    public static final String[] f21592c = {"bluestacks", "memuhyperv", "virtualbox"};
    public static sv d;
    public static sv f21593e;
    public static sv f21594f;
    public static SharedPreferences f21595g;

    public static void a(int i7) {
        SharedPreferences sharedPreferences = f21595g;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : f21595g.getAll().keySet()) {
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
                    if (str.toLowerCase().contains(f21592c[i10])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void c(String str, pc pcVar, oc ocVar) {
        d(str, pcVar, ocVar, false);
    }

    public static void d(String str, pc pcVar, oc ocVar, boolean z9) {
        if (z9) {
            try {
                Context context = t0.f25555b;
                synchronized (pb.g.f53412b) {
                    pb.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e10) {
                if (!z9) {
                    d(str, pcVar, ocVar, true);
                    return;
                }
                ocVar.r(e10);
                a8.g(e10, false);
                return;
            } catch (Exception e11) {
                ocVar.r(e11);
                a8.g(e11, true);
                return;
            } catch (Throwable th2) {
                ocVar.r(null);
                a8.g(th2, false);
                return;
            }
        }
        c8.zb.a().g(str).addOnSuccessListener(new p1(pcVar, 9)).addOnFailureListener(new p1(ocVar, 10));
    }

    public static synchronized long e() {
        synchronized (b6.class) {
            if (f21591b != 0 && SystemClock.elapsedRealtime() - f21591b <= 60000) {
                return (long) f21590a;
            }
            return b3.g.c(t0.f25555b).a();
        }
    }

    public static sv f(int i7) {
        if (i7 == 1) {
            return d;
        }
        if (i7 == 2) {
            return f21593e;
        }
        if (i7 == 4) {
            return f21594f;
        }
        return null;
    }

    public static boolean g() {
        if (e() >= 3000000) {
            return true;
        }
        return false;
    }

    public static boolean h(int i7, long j3) {
        return f21595g.getBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i7), Long.valueOf(j3)), false);
    }

    public static void i(SharedPreferences sharedPreferences) {
        int i7;
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (sharedPreferences.getBoolean("save_gallery", false) && r2.f25192b) {
            i7 = 7;
        } else {
            i7 = sharedPreferences.getInt("save_gallery_flags", -1);
        }
        if (i7 != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            ?? rvVar = new rv();
            d = rvVar;
            if ((i7 & 1) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            rvVar.f25343b = z9;
            rvVar.f25342a = z9;
            rvVar.f25344c = 104857600L;
            sv.c(rvVar, "user", sharedPreferences);
            ?? rvVar2 = new rv();
            f21593e = rvVar2;
            sv svVar = d;
            if ((i7 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            svVar.f25343b = z10;
            rvVar2.f25342a = z10;
            rvVar2.f25344c = 104857600L;
            sv.c(rvVar2, "groups", sharedPreferences);
            ?? rvVar3 = new rv();
            f21594f = rvVar3;
            if ((i7 & 4) != 0) {
                z11 = true;
            }
            rvVar3.f25343b = z11;
            rvVar3.f25342a = z11;
            rvVar3.f25344c = 104857600L;
            sv.c(rvVar3, "channels", sharedPreferences);
        } else {
            d = sv.d("user", sharedPreferences);
            f21593e = sv.d("groups", sharedPreferences);
            f21594f = sv.d("channels", sharedPreferences);
        }
        d.d = 1;
        f21593e.d = 2;
        f21594f.d = 4;
    }

    public static LongSparseArray j(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i7 = sharedPreferences.getInt("count", 0);
        for (int i10 = 0; i10 < i7; i10++) {
            ?? rvVar = new rv();
            rvVar.d = sharedPreferences.getLong(i10 + "_dialog_id", 0L);
            rvVar.f25342a = sharedPreferences.getBoolean(i10 + "_photo", false);
            rvVar.f25343b = sharedPreferences.getBoolean(i10 + "_video", false);
            rvVar.f25344c = sharedPreferences.getLong(i10 + "_limitVideo", 104857600L);
            long j3 = rvVar.d;
            if (j3 != 0) {
                longSparseArray.put(j3, rvVar);
            }
        }
        return longSparseArray;
    }

    public static boolean k(int i7, e8 e8Var, ij ijVar, int i10) {
        sv svVar;
        boolean z9;
        long j3;
        if (i7 == 1) {
            svVar = d;
        } else if (i7 == 4) {
            svVar = f21594f;
        } else {
            if (i7 == 2) {
                svVar = f21593e;
            }
            return false;
        }
        svVar.getClass();
        qv qvVar = (qv) p10.i(i10).m(svVar.d).get(e8Var.f22165a);
        if (ijVar == null || (!ijVar.Q3() && !ijVar.m4())) {
            if ((ijVar != null && ij.M4(ijVar.f23237k)) || e8Var.f22167c == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (ijVar != null) {
                j3 = ijVar.T1();
            } else {
                j3 = e8Var.d;
            }
            boolean z10 = svVar.f25343b;
            boolean z11 = svVar.f25342a;
            long j10 = svVar.f25344c;
            if (qvVar != null) {
                z10 = qvVar.f25343b;
                z11 = qvVar.f25342a;
                j10 = qvVar.f25344c;
            }
            if (!z9 ? z11 : !(!z10 || (j10 != -1 && j3 >= j10))) {
                return true;
            }
        }
        return false;
    }

    public static void l(SharedPreferences sharedPreferences, LongSparseArray longSparseArray) {
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", longSparseArray.size());
        for (int i7 = 0; i7 < longSparseArray.size(); i7++) {
            qv qvVar = (qv) longSparseArray.valueAt(i7);
            edit.putLong(com.google.android.recaptcha.internal.a.i(i7, "_dialog_id"), qvVar.d);
            edit.putBoolean(i7 + "_photo", qvVar.f25342a);
            edit.putBoolean(i7 + "_video", qvVar.f25343b);
            edit.putLong(i7 + "_limitVideo", qvVar.f25344c);
        }
        edit.apply();
    }

    public static void m(int i7) {
        SharedPreferences sharedPreferences = t0.f25555b.getSharedPreferences("mainconfig", 0);
        if (i7 == 1) {
            sv.c(d, "user", sharedPreferences);
        } else if (i7 == 2) {
            sv.c(f21593e, "groups", sharedPreferences);
        } else if (i7 == 4) {
            sv.c(f21594f, "channels", sharedPreferences);
        }
    }

    public static void n(int i7, long j3) {
        f21595g.edit().putBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i7), Long.valueOf(j3)), true).apply();
    }
}
