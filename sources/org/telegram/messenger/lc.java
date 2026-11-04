package org.telegram.messenger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class lc {
    public static int f23962a = 198684;
    public static int f23963b = 204383;
    public static int f23964c = 262143;
    public static int d = 10;
    public static int f23965e = 10;
    public static int f23966f = 10;
    public static int f23967g = 0;
    public static boolean h = false;
    public static int f23968i = 0;
    public static boolean f23969j = false;
    public static volatile int f23970k = -1;
    public static volatile long f23971l;
    public static volatile boolean f23972m;
    public static HashSet f23973n;

    public static void a(u10 u10Var) {
        if (f23973n == null) {
            f23973n = new HashSet();
        }
        f23973n.add(u10Var);
    }

    public static int b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!f23972m && (f23971l == 0 || elapsedRealtime - f23971l > 60000)) {
            f23972m = true;
            f23971l = elapsedRealtime;
            Utilities.f21387e.c(new hc(2));
        }
        return f23970k;
    }

    public static int c() {
        if (!f23969j) {
            g();
        }
        return f23967g;
    }

    public static int d(boolean z10) {
        if (!f23969j) {
            g();
        }
        if (!z10) {
            if (f23967g > 0) {
                int b10 = b();
                int i3 = f23967g;
                if (i3 >= 100 || (b10 >= 0 && b10 <= i3)) {
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
        return f23968i;
    }

    public static boolean e(int i3) {
        int i10;
        int i11;
        int i12;
        if (i3 == 64 && g0.Q1()) {
            return true;
        }
        int d10 = d(false);
        if ((i3 & 16388) > 0) {
            int i13 = i3 & (-16389);
            if (h10.o()) {
                i12 = 4;
            } else {
                i12 = 16384;
            }
            i3 = i13 | i12;
        }
        if ((i3 & 8200) > 0) {
            int i14 = i3 & (-8201);
            if (h10.o()) {
                i11 = 8;
            } else {
                i11 = 8192;
            }
            i3 = i14 | i11;
        }
        if ((i3 & 4112) > 0) {
            int i15 = i3 & (-4113);
            if (h10.o()) {
                i10 = 16;
            } else {
                i10 = 4096;
            }
            i3 = i15 | i10;
        }
        if ((i3 & d10) > 0) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        d(false);
        return h;
    }

    public static void g() {
        int i3;
        int i10 = f23964c;
        int i11 = f23966f;
        if (az.o() == 0) {
            i10 = f23962a;
            i11 = d;
        } else if (az.o() == 1) {
            i10 = f23963b;
            i11 = f23965e;
        }
        SharedPreferences e12 = hp.e1();
        if (!e12.contains("lite_mode6")) {
            if (e12.contains("lite_mode5")) {
                i10 = e12.getInt("lite_mode5", i10) & (-262145);
                e12.edit().putInt("lite_mode6", i10).apply();
            } else if (e12.contains("lite_mode4")) {
                i10 = e12.getInt("lite_mode4", i10);
                e12.edit().putInt("lite_mode5", i10).apply();
            } else if (e12.contains("lite_mode3")) {
                i10 = e12.getInt("lite_mode3", i10) | 131072;
                e12.edit().putInt("lite_mode5", i10).apply();
            } else if (e12.contains("lite_mode2")) {
                i10 = e12.getInt("lite_mode2", i10) | 65536;
                e12.edit().putInt("lite_mode3", i10).apply();
            } else if (e12.contains("lite_mode")) {
                i10 = e12.getInt("lite_mode", i10);
                if (i10 == 4095) {
                    i10 = f23964c;
                }
            } else {
                if (e12.contains("light_mode")) {
                    if (az.o() == 0) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if ((e12.getInt("light_mode", i3) & 1) > 0) {
                        i10 = f23962a;
                    } else {
                        i10 = f23964c;
                    }
                }
                if (e12.contains("loopStickers")) {
                    if (e12.getBoolean("loopStickers", true)) {
                        i10 |= 2;
                    } else {
                        i10 &= -3;
                    }
                }
                if (e12.contains("autoplay_video")) {
                    if (!e12.getBoolean("autoplay_video", true) && !e12.getBoolean("autoplay_video_liteforce", false)) {
                        i10 &= -1025;
                    } else {
                        i10 |= 1024;
                    }
                }
                if (e12.contains("autoplay_gif")) {
                    if (e12.getBoolean("autoplay_gif", true)) {
                        i10 |= 2048;
                    } else {
                        i10 &= -2049;
                    }
                }
                if (e12.contains("chatBlur")) {
                    if (e12.getBoolean("chatBlur", true)) {
                        i10 |= 256;
                    } else {
                        i10 &= -257;
                    }
                }
            }
        }
        int i12 = f23968i;
        int i13 = e12.getInt("lite_mode6", i10);
        f23968i = i13;
        if (f23969j) {
            i(i12, i13);
        }
        f23967g = e12.getInt("lite_mode_battery_level", i11);
        f23969j = true;
    }

    public static void h(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 > 0) {
                int b10 = b8.be.b(Math.round((intExtra * 100.0f) / intExtra2), 0, 100);
                f23971l = SystemClock.elapsedRealtime();
                if (f23970k != b10) {
                    f23970k = b10;
                    g0.h3(new hc(1));
                }
            }
        }
    }

    public static void i(int i3, int i10) {
        int i11 = (~i3) & i10;
        if ((i11 & 28700) > 0) {
            org.telegram.ui.Components.g5.t();
        }
        int i12 = i11 & 32;
        if (i12 > 0) {
            int[] iArr = jz.f23755u;
            jz.A = e(32);
        }
        if (i12 > 0) {
            org.telegram.ui.ActionBar.k6.u1(true);
        }
        if (!x7.u.a(i11, 256) && !x7.u.a(i11, 262144)) {
            return;
        }
        pi.q.f();
    }

    public static void j(boolean z10) {
        if (z10) {
            i(d(true), 0);
        } else {
            i(0, d(true));
        }
        if (f23973n != null) {
            g0.h3(new c9(2, z10));
        }
    }

    public static void k() {
        hp.e1().edit().putInt("lite_mode6", f23968i).putInt("lite_mode_battery_level", f23967g).apply();
    }

    public static void l(TLRPC.TL_jsonObject tL_jsonObject) {
        for (int i3 = 0; i3 < tL_jsonObject.value.size(); i3++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i3);
            if ("settings_mask".equals(tL_jsonObjectValue.key)) {
                TLRPC.JSONValue jSONValue = tL_jsonObjectValue.value;
                if (jSONValue instanceof TLRPC.TL_jsonArray) {
                    ArrayList<TLRPC.JSONValue> arrayList = ((TLRPC.TL_jsonArray) jSONValue).value;
                    try {
                        f23962a = (int) ((TLRPC.TL_jsonNumber) arrayList.get(0)).value;
                        f23963b = (int) ((TLRPC.TL_jsonNumber) arrayList.get(1)).value;
                        f23964c = (int) ((TLRPC.TL_jsonNumber) arrayList.get(2)).value;
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
                        f23965e = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(1)).value;
                        f23966f = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(2)).value;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
            }
        }
        g();
    }
}
