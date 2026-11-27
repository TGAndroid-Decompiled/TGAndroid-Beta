package defpackage;

import android.content.SharedPreferences;
import java.lang.reflect.Array;
import org.telegram.messenger.a;
public abstract class mp9 {
    public static final String[] a = {"round_video_switch_back_to_front_ms", "round_video_switch_front_to_back_ms"};
    public static final int[][] b = (int[][]) Array.newInstance(Integer.TYPE, 2, 8);
    public static final int[] c = new int[2];
    public static final int[] d = new int[2];
    public static boolean e;

    public static int a(int i) {
        int i2 = c[i];
        if (i2 == 0) {
            if (i == 0) {
                return 680;
            }
            return 630;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += b[i][i4];
        }
        return Math.round(i3 / i2);
    }

    public static void b() {
        int[] iArr = c;
        if (!e) {
            e = true;
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
            int i = 0;
            while (true) {
                String[] strArr = a;
                if (i < 2) {
                    String string = sharedPreferences.getString(strArr[i], null);
                    if (string != null && !string.isEmpty()) {
                        String[] split = string.split(",");
                        for (int max = Math.max(0, split.length - 8); max < split.length; max++) {
                            try {
                                int max2 = Math.max(200, Math.min(2000, Integer.parseInt(split[max])));
                                int[] iArr2 = b[i];
                                int i2 = iArr[i];
                                iArr[i] = i2 + 1;
                                iArr2[i2] = max2;
                            } catch (NumberFormatException unused) {
                            }
                        }
                        d[i] = iArr[i] % 8;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static void c(int i) {
        int i2;
        int i3 = c[i];
        if (i3 == 8) {
            i2 = d[i];
        } else {
            i2 = 0;
        }
        StringBuilder sb = new StringBuilder(i3 * 5);
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(',');
            }
            sb.append(b[i][(i2 + i4) % 8]);
        }
        a.b.getSharedPreferences("mainconfig", 0).edit().putString(a[i], sb.toString()).apply();
    }

    public static synchronized int d(cp9 cp9Var, cp9 cp9Var2, int i) {
        int i2;
        int a2;
        synchronized (mp9.class) {
            b();
            if (cp9Var != cp9Var2) {
                if (cp9Var == cp9.b) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                int max = Math.max(200, Math.min(2000, i));
                int[] iArr = b[i2];
                int[] iArr2 = d;
                iArr[iArr2[i2]] = max;
                iArr2[i2] = (iArr2[i2] + 1) % 8;
                int[] iArr3 = c;
                int i3 = iArr3[i2];
                if (i3 < 8) {
                    iArr3[i2] = i3 + 1;
                }
                c(i2);
                a2 = a(i2);
            } else {
                throw new IllegalArgumentException("Camera switch direction must change");
            }
        }
        return a2;
    }
}
