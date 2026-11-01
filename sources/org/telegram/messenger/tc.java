package org.telegram.messenger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class tc {
    public static int f18237a = 198684;
    public static int f18238b = 204383;
    public static int f18239c = 262143;
    public static int d = 10;
    public static int e = 10;
    public static int f18240f = 10;
    public static int f18241g = 0;
    public static boolean h = false;
    public static int f18242i = 0;
    public static boolean f18243j = false;
    public static volatile int f18244k = -1;
    public static volatile long f18245l;
    public static volatile boolean f18246m;
    public static HashSet f18247n;

    public static void a(r20 r20Var) {
        if (f18247n == null) {
            f18247n = new HashSet();
        }
        f18247n.add(r20Var);
    }

    public static int b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!f18246m && (f18245l == 0 || elapsedRealtime - f18245l > 60000)) {
            f18246m = true;
            f18245l = elapsedRealtime;
            Utilities.e.c(new ag.f3(19));
        }
        return f18244k;
    }

    public static int c() {
        if (!f18243j) {
            g();
        }
        return f18241g;
    }

    public static int d(boolean z10) {
        if (!f18243j) {
            g();
        }
        if (!z10) {
            if (f18241g > 0) {
                int b10 = b();
                int i10 = f18241g;
                if (i10 >= 100 || (b10 >= 0 && b10 <= i10)) {
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
        return f18242i;
    }

    public static boolean e(int i10) {
        int i11;
        int i12;
        int i13;
        if (i10 == 64 && i0.Q1()) {
            return true;
        }
        int d10 = d(false);
        if ((i10 & 16388) > 0) {
            int i14 = i10 & (-16389);
            if (e20.o()) {
                i13 = 4;
            } else {
                i13 = 16384;
            }
            i10 = i14 | i13;
        }
        if ((i10 & 8200) > 0) {
            int i15 = i10 & (-8201);
            if (e20.o()) {
                i12 = 8;
            } else {
                i12 = 8192;
            }
            i10 = i15 | i12;
        }
        if ((i10 & 4112) > 0) {
            int i16 = i10 & (-4113);
            if (e20.o()) {
                i11 = 16;
            } else {
                i11 = 4096;
            }
            i10 = i16 | i11;
        }
        if ((i10 & d10) > 0) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        d(false);
        return h;
    }

    public static void g() {
        int i10;
        int i11 = f18239c;
        int i12 = f18240f;
        if (uz.o() == 0) {
            i11 = f18237a;
            i12 = d;
        } else if (uz.o() == 1) {
            i11 = f18238b;
            i12 = e;
        }
        SharedPreferences d12 = wp.d1();
        if (!d12.contains("lite_mode6")) {
            if (d12.contains("lite_mode5")) {
                i11 = d12.getInt("lite_mode5", i11) & (-262145);
                d12.edit().putInt("lite_mode6", i11).apply();
            } else if (d12.contains("lite_mode4")) {
                i11 = d12.getInt("lite_mode4", i11);
                d12.edit().putInt("lite_mode5", i11).apply();
            } else if (d12.contains("lite_mode3")) {
                i11 = d12.getInt("lite_mode3", i11) | 131072;
                d12.edit().putInt("lite_mode5", i11).apply();
            } else if (d12.contains("lite_mode2")) {
                i11 = d12.getInt("lite_mode2", i11) | 65536;
                d12.edit().putInt("lite_mode3", i11).apply();
            } else if (d12.contains("lite_mode")) {
                i11 = d12.getInt("lite_mode", i11);
                if (i11 == 4095) {
                    i11 = f18239c;
                }
            } else {
                if (d12.contains("light_mode")) {
                    if (uz.o() == 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if ((d12.getInt("light_mode", i10) & 1) > 0) {
                        i11 = f18237a;
                    } else {
                        i11 = f18239c;
                    }
                }
                if (d12.contains("loopStickers")) {
                    if (d12.getBoolean("loopStickers", true)) {
                        i11 |= 2;
                    } else {
                        i11 &= -3;
                    }
                }
                if (d12.contains("autoplay_video")) {
                    if (!d12.getBoolean("autoplay_video", true) && !d12.getBoolean("autoplay_video_liteforce", false)) {
                        i11 &= -1025;
                    } else {
                        i11 |= 1024;
                    }
                }
                if (d12.contains("autoplay_gif")) {
                    if (d12.getBoolean("autoplay_gif", true)) {
                        i11 |= 2048;
                    } else {
                        i11 &= -2049;
                    }
                }
                if (d12.contains("chatBlur")) {
                    if (d12.getBoolean("chatBlur", true)) {
                        i11 |= 256;
                    } else {
                        i11 &= -257;
                    }
                }
            }
        }
        int i13 = f18242i;
        int i14 = d12.getInt("lite_mode6", i11);
        f18242i = i14;
        if (f18243j) {
            i(i13, i14);
        }
        f18241g = d12.getInt("lite_mode_battery_level", i12);
        f18243j = true;
    }

    public static void h(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 > 0) {
                int b10 = w7.u.b(Math.round((intExtra * 100.0f) / intExtra2), 0, 100);
                f18245l = SystemClock.elapsedRealtime();
                if (f18244k != b10) {
                    f18244k = b10;
                    i0.g3(new ag.f3(18));
                }
            }
        }
    }

    public static void i(int i10, int i11) {
        int i12 = (~i10) & i11;
        if ((i12 & 28700) > 0) {
            org.telegram.ui.Components.f5.t();
        }
        int i13 = i12 & 32;
        if (i13 > 0) {
            int[] iArr = d00.f15256u;
            d00.A = e(32);
        }
        if (i13 > 0) {
            org.telegram.ui.ActionBar.t6.u1(true);
        }
        if (!v7.u7.a(i12, 256) && !v7.u7.a(i12, 262144)) {
            return;
        }
        ei.r.f();
    }

    public static void j(boolean z10) {
        if (z10) {
            i(d(true), 0);
        } else {
            i(0, d(true));
        }
        if (f18247n != null) {
            i0.g3(new j9(2, z10));
        }
    }

    public static void k() {
        wp.d1().edit().putInt("lite_mode6", f18242i).putInt("lite_mode_battery_level", f18241g).apply();
    }

    public static void l(TLRPC.TL_jsonObject tL_jsonObject) {
        for (int i10 = 0; i10 < tL_jsonObject.value.size(); i10++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i10);
            if ("settings_mask".equals(tL_jsonObjectValue.key)) {
                TLRPC.JSONValue jSONValue = tL_jsonObjectValue.value;
                if (jSONValue instanceof TLRPC.TL_jsonArray) {
                    ArrayList<TLRPC.JSONValue> arrayList = ((TLRPC.TL_jsonArray) jSONValue).value;
                    try {
                        f18237a = (int) ((TLRPC.TL_jsonNumber) arrayList.get(0)).value;
                        f18238b = (int) ((TLRPC.TL_jsonNumber) arrayList.get(1)).value;
                        f18239c = (int) ((TLRPC.TL_jsonNumber) arrayList.get(2)).value;
                    } catch (Exception e7) {
                        f8.g(e7, true);
                    }
                }
            }
            if ("battery_low".equals(tL_jsonObjectValue.key)) {
                TLRPC.JSONValue jSONValue2 = tL_jsonObjectValue.value;
                if (jSONValue2 instanceof TLRPC.TL_jsonArray) {
                    ArrayList<TLRPC.JSONValue> arrayList2 = ((TLRPC.TL_jsonArray) jSONValue2).value;
                    try {
                        d = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(0)).value;
                        e = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(1)).value;
                        f18240f = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(2)).value;
                    } catch (Exception e10) {
                        f8.g(e10, true);
                    }
                }
            }
        }
        g();
    }
}
