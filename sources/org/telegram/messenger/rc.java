package org.telegram.messenger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class rc {
    public static int f25261a = 198684;
    public static int f25262b = 204383;
    public static int f25263c = 262143;
    public static int d = 10;
    public static int f25264e = 10;
    public static int f25265f = 10;
    public static int f25266g = 0;
    public static boolean h = false;
    public static int f25267i = 0;
    public static boolean f25268j = false;
    public static volatile int f25269k = -1;
    public static volatile long f25270l;
    public static volatile boolean f25271m;
    public static HashSet f25272n;

    public static void a(c20 c20Var) {
        if (f25272n == null) {
            f25272n = new HashSet();
        }
        f25272n.add(c20Var);
    }

    public static int b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!f25271m && (f25270l == 0 || elapsedRealtime - f25270l > 60000)) {
            f25271m = true;
            f25270l = elapsedRealtime;
            Utilities.f21333e.c(new ai.m0(28));
        }
        return f25269k;
    }

    public static int c() {
        if (!f25268j) {
            g();
        }
        return f25266g;
    }

    public static int d(boolean z9) {
        if (!f25268j) {
            g();
        }
        if (!z9) {
            if (f25266g > 0) {
                int b10 = b();
                int i7 = f25266g;
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
        return f25267i;
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
            if (p10.o()) {
                i12 = 4;
            } else {
                i12 = 16384;
            }
            i7 = i13 | i12;
        }
        if ((i7 & 8200) > 0) {
            int i14 = i7 & (-8201);
            if (p10.o()) {
                i11 = 8;
            } else {
                i11 = 8192;
            }
            i7 = i14 | i11;
        }
        if ((i7 & 4112) > 0) {
            int i15 = i7 & (-4113);
            if (p10.o()) {
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
        int i10 = f25263c;
        int i11 = f25265f;
        if (iz.o() == 0) {
            i10 = f25261a;
            i11 = d;
        } else if (iz.o() == 1) {
            i10 = f25262b;
            i11 = f25264e;
        }
        SharedPreferences e12 = qp.e1();
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
                    i10 = f25263c;
                }
            } else {
                if (e12.contains("light_mode")) {
                    if (iz.o() == 0) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if ((e12.getInt("light_mode", i7) & 1) > 0) {
                        i10 = f25261a;
                    } else {
                        i10 = f25263c;
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
        int i12 = f25267i;
        int i13 = e12.getInt("lite_mode6", i10);
        f25267i = i13;
        if (f25268j) {
            i(i12, i13);
        }
        f25266g = e12.getInt("lite_mode_battery_level", i11);
        f25268j = true;
    }

    public static void h(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 > 0) {
                int b10 = c8.j9.b(Math.round((intExtra * 100.0f) / intExtra2), 0, 100);
                f25270l = SystemClock.elapsedRealtime();
                if (f25269k != b10) {
                    f25269k = b10;
                    g0.h3(new ai.m0(27));
                }
            }
        }
    }

    public static void i(int i7, int i10) {
        int i11 = (~i7) & i10;
        if ((i11 & 28700) > 0) {
            org.telegram.ui.Components.i5.t();
        }
        int i12 = i11 & 32;
        if (i12 > 0) {
            int[] iArr = rz.f25378u;
            rz.A = e(32);
        }
        if (i12 > 0) {
            org.telegram.ui.ActionBar.k6.u1(true);
        }
        if (!c8.zc.a(i11, 256) && !c8.zc.a(i11, 262144)) {
            return;
        }
        oi.q.f();
    }

    public static void j(boolean z9) {
        if (z9) {
            i(d(true), 0);
        } else {
            i(0, d(true));
        }
        if (f25272n != null) {
            g0.h3(new d9(2, z9));
        }
    }

    public static void k() {
        qp.e1().edit().putInt("lite_mode6", f25267i).putInt("lite_mode_battery_level", f25266g).apply();
    }

    public static void l(TLRPC.TL_jsonObject tL_jsonObject) {
        for (int i7 = 0; i7 < tL_jsonObject.value.size(); i7++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i7);
            if ("settings_mask".equals(tL_jsonObjectValue.key)) {
                TLRPC.JSONValue jSONValue = tL_jsonObjectValue.value;
                if (jSONValue instanceof TLRPC.TL_jsonArray) {
                    ArrayList<TLRPC.JSONValue> arrayList = ((TLRPC.TL_jsonArray) jSONValue).value;
                    try {
                        f25261a = (int) ((TLRPC.TL_jsonNumber) arrayList.get(0)).value;
                        f25262b = (int) ((TLRPC.TL_jsonNumber) arrayList.get(1)).value;
                        f25263c = (int) ((TLRPC.TL_jsonNumber) arrayList.get(2)).value;
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
                        f25264e = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(1)).value;
                        f25265f = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(2)).value;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
            }
        }
        g();
    }
}
