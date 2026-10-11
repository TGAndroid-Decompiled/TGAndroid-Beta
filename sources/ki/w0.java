package ki;

import android.content.SharedPreferences;
import java.lang.reflect.Array;
import org.telegram.messenger.ApplicationLoader;
public abstract class w0 {
    public static final String[] f15201a = {"round_video_switch_back_to_front_ms", "round_video_switch_front_to_back_ms"};
    public static final int[][] f15202b = (int[][]) Array.newInstance(Integer.TYPE, 2, 8);
    public static final int[] f15203c = new int[2];
    public static final int[] d = new int[2];
    public static boolean f15204e;

    public static int a(int i10) {
        int i11 = f15203c[i10];
        if (i11 == 0) {
            if (i10 == 0) {
                return 680;
            }
            return 630;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += f15202b[i10][i13];
        }
        return Math.round(i12 / i11);
    }

    public static void b() {
        int[] iArr = f15203c;
        if (!f15204e) {
            f15204e = true;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            int i10 = 0;
            while (true) {
                String[] strArr = f15201a;
                if (i10 < 2) {
                    String string = sharedPreferences.getString(strArr[i10], null);
                    if (string != null && !string.isEmpty()) {
                        String[] split = string.split(",");
                        for (int max = Math.max(0, split.length - 8); max < split.length; max++) {
                            try {
                                int max2 = Math.max(200, Math.min(2000, Integer.parseInt(split[max])));
                                int[] iArr2 = f15202b[i10];
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
        int i12 = f15203c[i10];
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
            sb2.append(f15202b[i10][(i11 + i13) % 8]);
        }
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putString(f15201a[i10], sb2.toString()).apply();
    }

    public static synchronized int d(o0 o0Var, o0 o0Var2, int i10) {
        int i11;
        int a2;
        synchronized (w0.class) {
            try {
                b();
                if (o0Var != o0Var2) {
                    if (o0Var == o0.f15077b) {
                        i11 = 0;
                    } else {
                        i11 = 1;
                    }
                    int max = Math.max(200, Math.min(2000, i10));
                    int[] iArr = f15202b[i11];
                    int[] iArr2 = d;
                    iArr[iArr2[i11]] = max;
                    iArr2[i11] = (iArr2[i11] + 1) % 8;
                    int[] iArr3 = f15203c;
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
