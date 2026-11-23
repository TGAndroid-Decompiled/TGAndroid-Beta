package org.telegram.messenger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class qc {
    public static int f26386a = 198684;
    public static int f26387b = 204383;
    public static int f26388c = 262143;
    public static int d = 10;
    public static int f26389e = 10;
    public static int f26390f = 10;
    public static int f26391g = 0;
    public static boolean h = false;
    public static int f26392i = 0;
    public static boolean f26393j = false;
    public static volatile int f26394k = -1;
    public static volatile long f26395l;
    public static volatile boolean f26396m;
    public static HashSet f26397n;

    public static void a(y10 y10Var) {
        if (f26397n == null) {
            f26397n = new HashSet();
        }
        f26397n.add(y10Var);
    }

    public static int b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!f26396m && (f26395l == 0 || elapsedRealtime - f26395l > 60000)) {
            f26396m = true;
            f26395l = elapsedRealtime;
            Utilities.f22774e.c(new j2(5));
        }
        return f26394k;
    }

    public static int c() {
        if (!f26393j) {
            g();
        }
        return f26391g;
    }

    public static int d(boolean z10) {
        if (!f26393j) {
            g();
        }
        if (!z10) {
            if (f26391g > 0) {
                int b10 = b();
                int i7 = f26391g;
                if (i7 >= 100 || (b10 >= 0 && b10 <= i7)) {
                    if (!h) {
                        h = true;
                        j(true);
                    }
                    return 0;
                }
            }
            if (h) {
                h = false;
                j(false);
            }
        }
        return f26392i;
    }

    public static boolean e(int i7) {
        int i10;
        int i11;
        int i12;
        if (i7 == 64 && g0.Q1()) {
            return true;
        }
        int d2 = d(false);
        if ((i7 & 16388) > 0) {
            int i13 = i7 & (-16389);
            if (k10.o()) {
                i12 = 4;
            } else {
                i12 = 16384;
            }
            i7 = i13 | i12;
        }
        if ((i7 & 8200) > 0) {
            int i14 = i7 & (-8201);
            if (k10.o()) {
                i11 = 8;
            } else {
                i11 = 8192;
            }
            i7 = i14 | i11;
        }
        if ((i7 & 4112) > 0) {
            int i15 = i7 & (-4113);
            if (k10.o()) {
                i10 = 16;
            } else {
                i10 = 4096;
            }
            i7 = i15 | i10;
        }
        if ((i7 & d2) > 0) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        d(false);
        return h;
    }

    public static void g() {
        int i7;
        int i10 = f26388c;
        int i11 = f26390f;
        if (cz.o() == 0) {
            i10 = f26386a;
            i11 = d;
        } else if (cz.o() == 1) {
            i10 = f26387b;
            i11 = f26389e;
        }
        SharedPreferences g12 = np.g1();
        if (!g12.contains("lite_mode6")) {
            if (g12.contains("lite_mode5")) {
                i10 = g12.getInt("lite_mode5", i10) & (-262145);
                g12.edit().putInt("lite_mode6", i10).apply();
            } else if (g12.contains("lite_mode4")) {
                i10 = g12.getInt("lite_mode4", i10);
                g12.edit().putInt("lite_mode5", i10).apply();
            } else if (g12.contains("lite_mode3")) {
                i10 = g12.getInt("lite_mode3", i10) | 131072;
                g12.edit().putInt("lite_mode5", i10).apply();
            } else if (g12.contains("lite_mode2")) {
                i10 = g12.getInt("lite_mode2", i10) | 65536;
                g12.edit().putInt("lite_mode3", i10).apply();
            } else if (g12.contains("lite_mode")) {
                i10 = g12.getInt("lite_mode", i10);
                if (i10 == 4095) {
                    i10 = f26388c;
                }
            } else {
                if (g12.contains("light_mode")) {
                    if (cz.o() == 0) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if ((g12.getInt("light_mode", i7) & 1) > 0) {
                        i10 = f26386a;
                    } else {
                        i10 = f26388c;
                    }
                }
                if (g12.contains("loopStickers")) {
                    if (g12.getBoolean("loopStickers", true)) {
                        i10 |= 2;
                    } else {
                        i10 &= -3;
                    }
                }
                if (g12.contains("autoplay_video")) {
                    if (!g12.getBoolean("autoplay_video", true) && !g12.getBoolean("autoplay_video_liteforce", false)) {
                        i10 &= -1025;
                    } else {
                        i10 |= 1024;
                    }
                }
                if (g12.contains("autoplay_gif")) {
                    if (g12.getBoolean("autoplay_gif", true)) {
                        i10 |= 2048;
                    } else {
                        i10 &= -2049;
                    }
                }
                if (g12.contains("chatBlur")) {
                    if (g12.getBoolean("chatBlur", true)) {
                        i10 |= 256;
                    } else {
                        i10 &= -257;
                    }
                }
            }
        }
        int i12 = f26392i;
        int i13 = g12.getInt("lite_mode6", i10);
        f26392i = i13;
        if (f26393j) {
            i(i12, i13);
        }
        f26391g = g12.getInt("lite_mode_battery_level", i11);
        f26393j = true;
    }

    public static void h(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 > 0) {
                int b10 = c8.m9.b(Math.round((intExtra * 100.0f) / intExtra2), 0, 100);
                f26395l = SystemClock.elapsedRealtime();
                if (f26394k != b10) {
                    f26394k = b10;
                    g0.g3(new j2(6));
                }
            }
        }
    }

    public static void i(int i7, int i10) {
        int i11 = (~i7) & i10;
        if ((i11 & 28700) > 0) {
            org.telegram.ui.Components.p5.t();
        }
        int i12 = i11 & 32;
        if (i12 > 0) {
            int[] iArr = mz.f25648u;
            mz.A = e(32);
        }
        if (i12 > 0) {
            org.telegram.ui.ActionBar.m6.u1(true);
        }
        if (!c8.ed.a(i11, 256) && !c8.ed.a(i11, 262144)) {
            return;
        }
        ri.q.f();
    }

    public static void j(boolean z10) {
        if (z10) {
            i(d(true), 0);
        } else {
            i(0, d(true));
        }
        if (f26397n != null) {
            g0.g3(new d9(2, z10));
        }
    }

    public static void k() {
        np.g1().edit().putInt("lite_mode6", f26392i).putInt("lite_mode_battery_level", f26391g).apply();
    }

    public static void l(TLRPC.TL_jsonObject tL_jsonObject) {
        for (int i7 = 0; i7 < tL_jsonObject.value.size(); i7++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i7);
            if ("settings_mask".equals(tL_jsonObjectValue.key)) {
                TLRPC.JSONValue jSONValue = tL_jsonObjectValue.value;
                if (jSONValue instanceof TLRPC.TL_jsonArray) {
                    ArrayList<TLRPC.JSONValue> arrayList = ((TLRPC.TL_jsonArray) jSONValue).value;
                    try {
                        f26386a = (int) ((TLRPC.TL_jsonNumber) arrayList.get(0)).value;
                        f26387b = (int) ((TLRPC.TL_jsonNumber) arrayList.get(1)).value;
                        f26388c = (int) ((TLRPC.TL_jsonNumber) arrayList.get(2)).value;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
            }
            if ("battery_low".equals(tL_jsonObjectValue.key)) {
                TLRPC.JSONValue jSONValue2 = tL_jsonObjectValue.value;
                if (jSONValue2 instanceof TLRPC.TL_jsonArray) {
                    ArrayList<TLRPC.JSONValue> arrayList2 = ((TLRPC.TL_jsonArray) jSONValue2).value;
                    try {
                        d = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(0)).value;
                        f26389e = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(1)).value;
                        f26390f = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(2)).value;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
            }
        }
        g();
    }
}
