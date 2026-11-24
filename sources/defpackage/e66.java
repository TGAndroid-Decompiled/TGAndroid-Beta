package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
public abstract class e66 {
    public static int a = 198684;
    public static int b = 204383;
    public static int c = 262143;
    public static int d = 10;
    public static int e = 10;
    public static int f = 10;
    public static int g = 0;
    public static boolean h = false;
    public static int i = 0;
    public static boolean j = false;
    public static volatile int k = -1;
    public static volatile long l;
    public static volatile boolean m;
    public static HashSet n;

    public static void a(p8c p8cVar) {
        HashSet hashSet = n;
        if (hashSet == null) {
            hashSet = new HashSet();
            n = hashSet;
        }
        hashSet.add(p8cVar);
    }

    public static int b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m && (l == 0 || elapsedRealtime - l > 60000)) {
            m = true;
            l = elapsedRealtime;
            Utilities.e.c(new ql3((byte) 21));
        }
        return k;
    }

    public static int c() {
        if (!j) {
            g();
        }
        return g;
    }

    public static int d(boolean z) {
        if (!j) {
            g();
        }
        if (!z) {
            if (g > 0) {
                int b2 = b();
                int i2 = g;
                if (i2 >= 100 || (b2 >= 0 && b2 <= i2)) {
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
        return i;
    }

    public static boolean e(int i2) {
        int i3;
        int i4;
        int i5;
        if (i2 != 64 || !gl.O1()) {
            int d2 = d(false);
            if ((i2 & 16388) > 0) {
                int i6 = i2 & (-16389);
                if (y6c.n()) {
                    i5 = 4;
                } else {
                    i5 = 16384;
                }
                i2 = i6 | i5;
            }
            if ((i2 & 8200) > 0) {
                int i7 = i2 & (-8201);
                if (y6c.n()) {
                    i4 = 8;
                } else {
                    i4 = 8192;
                }
                i2 = i7 | i4;
            }
            if ((i2 & 4112) > 0) {
                int i8 = i2 & (-4113);
                if (y6c.n()) {
                    i3 = 16;
                } else {
                    i3 = 4096;
                }
                i2 = i8 | i3;
            }
            if ((d2 & i2) <= 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean f() {
        d(false);
        return h;
    }

    public static void g() {
        int i2;
        int i3 = c;
        int i4 = f;
        if (gba.o() == 0) {
            i3 = a;
            i4 = d;
        } else if (gba.o() == 1) {
            i3 = b;
            i4 = e;
        }
        SharedPreferences c1 = na7.c1();
        if (!c1.contains("lite_mode6")) {
            if (c1.contains("lite_mode5")) {
                i3 = c1.getInt("lite_mode5", i3) & (-262145);
                c1.edit().putInt("lite_mode6", i3).apply();
            } else if (c1.contains("lite_mode4")) {
                i3 = c1.getInt("lite_mode4", i3);
                c1.edit().putInt("lite_mode5", i3).apply();
            } else if (c1.contains("lite_mode3")) {
                i3 = c1.getInt("lite_mode3", i3) | 131072;
                c1.edit().putInt("lite_mode5", i3).apply();
            } else if (c1.contains("lite_mode2")) {
                i3 = c1.getInt("lite_mode2", i3) | 65536;
                c1.edit().putInt("lite_mode3", i3).apply();
            } else if (c1.contains("lite_mode")) {
                i3 = c1.getInt("lite_mode", i3);
                if (i3 == 4095) {
                    i3 = c;
                }
            } else {
                if (c1.contains("light_mode")) {
                    if (gba.o() == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if ((c1.getInt("light_mode", i2) & 1) > 0) {
                        i3 = a;
                    } else {
                        i3 = c;
                    }
                }
                if (c1.contains("loopStickers")) {
                    if (c1.getBoolean("loopStickers", true)) {
                        i3 |= 2;
                    } else {
                        i3 &= -3;
                    }
                }
                if (c1.contains("autoplay_video")) {
                    if (!c1.getBoolean("autoplay_video", true) && !c1.getBoolean("autoplay_video_liteforce", false)) {
                        i3 &= -1025;
                    } else {
                        i3 |= 1024;
                    }
                }
                if (c1.contains("autoplay_gif")) {
                    if (c1.getBoolean("autoplay_gif", true)) {
                        i3 |= 2048;
                    } else {
                        i3 &= -2049;
                    }
                }
                if (c1.contains("chatBlur")) {
                    if (c1.getBoolean("chatBlur", true)) {
                        i3 |= 256;
                    } else {
                        i3 &= -257;
                    }
                }
            }
        }
        int i5 = i;
        int i6 = c1.getInt("lite_mode6", i3);
        i = i6;
        if (j) {
            i(i5, i6);
        }
        g = c1.getInt("lite_mode_battery_level", i4);
        j = true;
    }

    public static void h(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 > 0) {
                int b2 = moe.b(Math.round((intExtra * 100.0f) / intExtra2), 0, 100);
                l = SystemClock.elapsedRealtime();
                if (k != b2) {
                    k = b2;
                    gl.c3(new ql3((byte) 22));
                }
            }
        }
    }

    public static void i(int i2, int i3) {
        int i4 = (~i2) & i3;
        if ((i4 & 28700) > 0) {
            vl.t();
        }
        if ((i4 & 32) > 0) {
            int[] iArr = kcb.u;
            kcb.A = e(32);
            bkb.s1(true);
        }
        if (!fod.a(i4, 256) && !fod.a(i4, 262144)) {
            return;
        }
        qw4.f();
    }

    public static void j(boolean z) {
        if (z) {
            i(d(true), 0);
        } else {
            i(0, d(true));
        }
        if (n != null) {
            gl.c3(new yf4((byte) 2, z));
        }
    }

    public static void k() {
        na7.c1().edit().putInt("lite_mode6", i).putInt("lite_mode_battery_level", g).apply();
    }
}
