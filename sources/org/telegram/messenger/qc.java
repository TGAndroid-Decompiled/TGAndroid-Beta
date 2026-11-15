package org.telegram.messenger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class qc {
    public static int f26066a = 198684;
    public static int f26067b = 204383;
    public static int f26068c = 262143;
    public static int d = 10;
    public static int f26069e = 10;
    public static int f26070f = 10;
    public static int f26071g = 0;
    public static boolean h = false;
    public static int f26072i = 0;
    public static boolean f26073j = false;
    public static volatile int f26074k = -1;
    public static volatile long f26075l;
    public static volatile boolean f26076m;
    public static HashSet f26077n;

    public static void a(z10 z10Var) {
        if (f26077n == null) {
            f26077n = new HashSet();
        }
        f26077n.add(z10Var);
    }

    public static int b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!f26076m && (f26075l == 0 || elapsedRealtime - f26075l > 60000)) {
            f26076m = true;
            f26075l = elapsedRealtime;
            Utilities.f22416e.c(new c6(3));
        }
        return f26074k;
    }

    public static int c() {
        if (!f26073j) {
            g();
        }
        return f26071g;
    }

    public static int d(boolean z10) {
        if (!f26073j) {
            g();
        }
        if (!z10) {
            if (f26071g > 0) {
                int b10 = b();
                int i7 = f26071g;
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
        return f26072i;
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
            if (m10.o()) {
                i12 = 4;
            } else {
                i12 = 16384;
            }
            i7 = i13 | i12;
        }
        if ((i7 & 8200) > 0) {
            int i14 = i7 & (-8201);
            if (m10.o()) {
                i11 = 8;
            } else {
                i11 = 8192;
            }
            i7 = i14 | i11;
        }
        if ((i7 & 4112) > 0) {
            int i15 = i7 & (-4113);
            if (m10.o()) {
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
        int i10 = f26068c;
        int i11 = f26070f;
        if (gz.o() == 0) {
            i10 = f26066a;
            i11 = d;
        } else if (gz.o() == 1) {
            i10 = f26067b;
            i11 = f26069e;
        }
        SharedPreferences e12 = np.e1();
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
                    i10 = f26068c;
                }
            } else {
                if (e12.contains("light_mode")) {
                    if (gz.o() == 0) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if ((e12.getInt("light_mode", i7) & 1) > 0) {
                        i10 = f26066a;
                    } else {
                        i10 = f26068c;
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
        int i12 = f26072i;
        int i13 = e12.getInt("lite_mode6", i10);
        f26072i = i13;
        if (f26073j) {
            i(i12, i13);
        }
        f26071g = e12.getInt("lite_mode_battery_level", i11);
        f26073j = true;
    }

    public static void h(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 > 0) {
                int b10 = c8.i9.b(Math.round((intExtra * 100.0f) / intExtra2), 0, 100);
                f26075l = SystemClock.elapsedRealtime();
                if (f26074k != b10) {
                    f26074k = b10;
                    g0.h3(new c6(4));
                }
            }
        }
    }

    public static void i(int i7, int i10) {
        int i11 = (~i7) & i10;
        if ((i11 & 28700) > 0) {
            org.telegram.ui.Components.g5.t();
        }
        int i12 = i11 & 32;
        if (i12 > 0) {
            int[] iArr = pz.f26021u;
            pz.A = e(32);
        }
        if (i12 > 0) {
            org.telegram.ui.ActionBar.j6.u1(true);
        }
        if (!c8.zc.a(i11, 256) && !c8.zc.a(i11, 262144)) {
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
        if (f26077n != null) {
            g0.h3(new c9(2, z10));
        }
    }

    public static void k() {
        np.e1().edit().putInt("lite_mode6", f26072i).putInt("lite_mode_battery_level", f26071g).apply();
    }

    public static void l(TLRPC.TL_jsonObject tL_jsonObject) {
        for (int i7 = 0; i7 < tL_jsonObject.value.size(); i7++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i7);
            if ("settings_mask".equals(tL_jsonObjectValue.key)) {
                TLRPC.JSONValue jSONValue = tL_jsonObjectValue.value;
                if (jSONValue instanceof TLRPC.TL_jsonArray) {
                    ArrayList<TLRPC.JSONValue> arrayList = ((TLRPC.TL_jsonArray) jSONValue).value;
                    try {
                        f26066a = (int) ((TLRPC.TL_jsonNumber) arrayList.get(0)).value;
                        f26067b = (int) ((TLRPC.TL_jsonNumber) arrayList.get(1)).value;
                        f26068c = (int) ((TLRPC.TL_jsonNumber) arrayList.get(2)).value;
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
                        f26069e = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(1)).value;
                        f26070f = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(2)).value;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
            }
        }
        g();
    }
}
