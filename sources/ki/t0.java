package ki;

import android.content.SharedPreferences;
import java.lang.reflect.Array;
import org.telegram.messenger.ApplicationLoader;
public abstract class t0 {
    public static final String[] f13882a = {"round_video_switch_back_to_front_ms", "round_video_switch_front_to_back_ms"};
    public static final int[][] f13883b = (int[][]) Array.newInstance(Integer.TYPE, 2, 8);
    public static final int[] f13884c = new int[2];
    public static final int[] d = new int[2];
    public static boolean e;

    public static int a(int i10) {
        int i11 = f13884c[i10];
        if (i11 == 0) {
            if (i10 == 0) {
                return 680;
            }
            return 630;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += f13883b[i10][i13];
        }
        return Math.round(i12 / i11);
    }

    public static void b() {
        int[] iArr = f13884c;
        if (!e) {
            e = true;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            int i10 = 0;
            while (true) {
                String[] strArr = f13882a;
                if (i10 < 2) {
                    String string = sharedPreferences.getString(strArr[i10], null);
                    if (string != null && !string.isEmpty()) {
                        String[] split = string.split(",");
                        for (int max = Math.max(0, split.length - 8); max < split.length; max++) {
                            try {
                                int max2 = Math.max(200, Math.min(2000, Integer.parseInt(split[max])));
                                int[] iArr2 = f13883b[i10];
                                int i11 = iArr[i10];
                                iArr[i10] = i11 + 1;
                                iArr2[i11] = max2;
                            } catch (NumberFormatException unused) {
                            }
                        }
                        d[i10] = iArr[i10] % 8;
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void c(int i10) {
        int i11;
        int i12 = f13884c[i10];
        if (i12 == 8) {
            i11 = d[i10];
        } else {
            i11 = 0;
        }
        StringBuilder sb2 = new StringBuilder(i12 * 5);
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 > 0) {
                sb2.append(',');
            }
            sb2.append(f13883b[i10][(i11 + i13) % 8]);
        }
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putString(f13882a[i10], sb2.toString()).apply();
    }

    public static synchronized int d(l0 l0Var, l0 l0Var2, int i10) {
        int i11;
        int a2;
        synchronized (t0.class) {
            try {
                b();
                if (l0Var != l0Var2) {
                    if (l0Var == l0.f13785b) {
                        i11 = 0;
                    } else {
                        i11 = 1;
                    }
                    int max = Math.max(200, Math.min(2000, i10));
                    int[] iArr = f13883b[i11];
                    int[] iArr2 = d;
                    iArr[iArr2[i11]] = max;
                    iArr2[i11] = (iArr2[i11] + 1) % 8;
                    int[] iArr3 = f13884c;
                    int i12 = iArr3[i11];
                    if (i12 < 8) {
                        iArr3[i11] = i12 + 1;
                    }
                    c(i11);
                    a2 = a(i11);
                } else {
                    throw new IllegalArgumentException("Camera switch direction must change");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a2;
    }
}
