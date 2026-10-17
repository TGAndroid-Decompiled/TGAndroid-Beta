package e2;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import b2.f1;
import b2.v0;
import b2.w0;
import ci.v7;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import v7.m7;
import v7.n7;
import v7.s6;
import v7.u6;
import v7.v6;
public abstract class m0 {
    public static final String f8254a;
    public static final byte[] f8255b;
    public static final long[] f8256c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f8257f;
    public static HashMap f8258g;
    public static final String[] h;
    public static final String[] f8259i;
    public static final int[] f8260j;
    public static final int[] f8261k;
    public static final int[] f8262l;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        f8254a = str + ", " + str3 + ", " + str2 + ", " + Build.VERSION.SDK_INT;
        f8255b = new byte[0];
        f8256c = new long[0];
        d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f8257f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f8259i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f8260j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f8261k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f8262l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int A(String str) {
        String[] split;
        int length;
        boolean z10;
        int i10 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            str2.getClass();
            i10 = Integer.parseInt(str2);
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static long B(long j10, float f7) {
        if (f7 == 1.0f) {
            return j10;
        }
        return Math.round(j10 * f7);
    }

    public static long C(long j10) {
        if (j10 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + j10;
    }

    public static int D(int i10, ByteOrder byteOrder) {
        if (i10 != 8) {
            if (i10 != 16) {
                if (i10 != 24) {
                    if (i10 != 32) {
                        return 0;
                    }
                    if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                        return 22;
                    }
                    return 1610612736;
                } else if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                    return 21;
                } else {
                    return 1342177280;
                }
            } else if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 2;
            } else {
                return 268435456;
            }
        }
        return 3;
    }

    public static b2.w E(int i10, int i11, int i12) {
        b2.v vVar = new b2.v();
        vVar.f4078r = v0.n("audio/raw");
        vVar.J = i11;
        vVar.K = i12;
        vVar.L = i10;
        return new b2.w(vVar);
    }

    public static long F(long j10, float f7) {
        if (f7 == 1.0f) {
            return j10;
        }
        return Math.round(j10 / f7);
    }

    public static String[] G() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            strArr = new String[]{configuration.locale.toLanguageTag()};
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr[i10] = T(strArr[i10]);
        }
        return strArr;
    }

    public static String H(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e7) {
            a.d("Util", "Failed to read system property ".concat(str), e7);
            return null;
        }
    }

    public static String I(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i10 >= 10000) {
                    return i0.a.k(i10, "custom (", ")");
                }
                return "?";
        }
    }

    public static boolean J(b2.f1 r4) {
        throw new UnsupportedOperationException("Method not decompiled: e2.m0.J(b2.f1):boolean");
    }

    public static int K(android.net.Uri r7, java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: e2.m0.K(android.net.Uri, java.lang.String):int");
    }

    public static boolean L(int i10) {
        if (i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736 && i10 != 4 && i10 != 1879048192) {
            return false;
        }
        return true;
    }

    public static boolean M(int i10) {
        if (i10 != 3 && i10 != 2 && i10 != 268435456 && i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736 && i10 != 4 && i10 != 1879048192) {
            return false;
        }
        return true;
    }

    public static boolean N(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i10 == 30) {
                String str = Build.MODEL;
                if (s6.a(str, "moto g(20)") || s6.a(str, "rmx3231")) {
                    return true;
                }
            }
            if (i10 != 34 || !s6.a(Build.MODEL, "sm-x200")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean O(int i10) {
        if (i10 != 10 && i10 != 13) {
            return false;
        }
        return true;
    }

    public static boolean P(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static boolean Q(x xVar, x xVar2, Inflater inflater) {
        if (xVar.a() > 0 && xVar.j() == 120 && xVar.a() != 0) {
            if (xVar2.f8293a.length < xVar.a()) {
                xVar2.c(xVar.a() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(xVar.f8293a, xVar.f8294b, xVar.a());
            int i10 = 0;
            while (true) {
                try {
                    byte[] bArr = xVar2.f8293a;
                    i10 += inflater.inflate(bArr, i10, bArr.length - i10);
                    if (inflater.finished()) {
                        xVar2.M(i10);
                        inflater.reset();
                        return true;
                    } else if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    } else {
                        byte[] bArr2 = xVar2.f8293a;
                        if (i10 == bArr2.length) {
                            xVar2.c(bArr2.length * 2);
                        }
                    }
                } catch (DataFormatException unused) {
                } catch (Throwable th2) {
                    inflater.reset();
                    throw th2;
                }
            }
            inflater.reset();
        }
        return false;
    }

    public static void R(int i10, int i11, int i12, ArrayList arrayList) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(arrayList.remove(i10 + i13));
        }
        arrayList.addAll(Math.min(i12, arrayList.size()), arrayDeque);
    }

    public static long S(long j10) {
        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            return j10 * 1000;
        }
        return j10;
    }

    public static String T(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String c10 = s6.c(str);
        int i10 = 0;
        String str2 = c10.split("-", 2)[0];
        if (f8258g == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = h;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                hashMap.put(strArr[i11], strArr[i11 + 1]);
            }
            f8258g = hashMap;
        }
        String str4 = (String) f8258g.get(str2);
        if (str4 != null) {
            StringBuilder u10 = a1.g.u(str4);
            u10.append(c10.substring(str2.length()));
            c10 = u10.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return c10;
        }
        while (true) {
            String[] strArr2 = f8259i;
            if (i10 < strArr2.length) {
                if (c10.startsWith(strArr2[i10])) {
                    return strArr2[i10 + 1] + c10.substring(strArr2[i10].length());
                }
                i10 += 2;
            } else {
                return c10;
            }
        }
    }

    public static Object[] U(int i10, Object[] objArr) {
        boolean z10;
        if (i10 <= objArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        return Arrays.copyOf(objArr, i10);
    }

    public static long V(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.matches()) {
            int i10 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                int parseInt = Integer.parseInt(matcher.group(12)) * 60;
                String group = matcher.group(13);
                if (group != null) {
                    i10 = Integer.parseInt(group) + parseInt;
                } else {
                    i10 = parseInt;
                }
                if ("-".equals(matcher.group(11))) {
                    i10 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i10 != 0) {
                return timeInMillis - (i10 * 60000);
            }
            return timeInMillis;
        }
        throw w0.a(null, "Invalid date/time format: " + str);
    }

    public static void W(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return;
        }
        if (looper == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void X(int i10, int i11, ArrayList arrayList) {
        if (i10 >= 0 && i11 <= arrayList.size() && i10 <= i11) {
            if (i10 != i11) {
                arrayList.subList(i10, i11).clear();
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static long Y(int i10, long j10) {
        return a0(j10, 1000000L, i10, RoundingMode.DOWN);
    }

    public static void Z(long[] jArr, long j10) {
        long j11;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i10 = (j10 > 1000000L ? 1 : (j10 == 1000000L ? 0 : -1));
        int i11 = 0;
        if (i10 >= 0 && j10 % 1000000 == 0) {
            long b10 = n7.b(j10, 1000000L, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = n7.b(jArr[i11], b10, roundingMode);
                i11++;
            }
        } else if (i10 < 0 && 1000000 % j10 == 0) {
            long b11 = n7.b(1000000L, j10, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = n7.d(jArr[i11], b11);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i12 < jArr.length) {
                long j12 = jArr[i12];
                if (j12 != 0) {
                    int i13 = (j10 > j12 ? 1 : (j10 == j12 ? 0 : -1));
                    if (i13 >= 0 && j10 % j12 == 0) {
                        jArr[i12] = n7.b(1000000L, n7.b(j10, j12, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (i13 < 0 && j12 % j10 == 0) {
                        jArr[i12] = n7.d(1000000L, n7.b(j12, j10, RoundingMode.UNNECESSARY));
                    } else {
                        j11 = j10;
                        jArr[i12] = b0(j12, 1000000L, j11, roundingMode);
                        i12++;
                        j10 = j11;
                    }
                }
                j11 = j10;
                i12++;
                j10 = j11;
            }
        }
    }

    public static long a(long j10, long j11) {
        boolean z10;
        long j12;
        long j13 = j10 + j11;
        boolean z11 = false;
        if ((j11 ^ j10) < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((j10 ^ j13) >= 0) {
            z11 = true;
        }
        if (z10 | z11) {
            j12 = j13;
        } else {
            j12 = ((j13 >>> 63) ^ 1) + Long.MAX_VALUE;
        }
        if ((j12 == Long.MIN_VALUE && j13 != Long.MIN_VALUE) || (j12 == Long.MAX_VALUE && j13 != Long.MAX_VALUE)) {
            return Long.MAX_VALUE;
        }
        return j12;
    }

    public static long a0(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 >= 0 && j12 % j11 == 0) {
            return n7.b(j10, n7.b(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i10 < 0 && j11 % j12 == 0) {
            return n7.d(j10, n7.b(j11, j12, RoundingMode.UNNECESSARY));
        }
        int i11 = (j12 > j10 ? 1 : (j12 == j10 ? 0 : -1));
        if (i11 >= 0 && j12 % j10 == 0) {
            return n7.b(j11, n7.b(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i11 < 0 && j10 % j12 == 0) {
            return n7.d(j11, n7.b(j10, j12, RoundingMode.UNNECESSARY));
        }
        return b0(j10, j11, j12, roundingMode);
    }

    public static int b(long[] jArr, long j10, boolean z10) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i10 = binarySearch + 1;
            if (i10 >= jArr.length || jArr[i10] != j10) {
                break;
            }
            binarySearch = i10;
        }
        if (z10) {
            return binarySearch;
        }
        return i10;
    }

    public static long b0(long r9, long r11, long r13, java.math.RoundingMode r15) {
        throw new UnsupportedOperationException("Method not decompiled: e2.m0.b0(long, long, long, java.math.RoundingMode):long");
    }

    public static int c(c5.b0 b0Var, long j10) {
        int i10 = b0Var.f4702b - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            if (b0Var.m(i12) < j10) {
                i11 = i12 + 1;
            } else {
                i10 = i12 - 1;
            }
        }
        int i13 = i10 + 1;
        if (i13 < b0Var.f4702b && b0Var.m(i13) == j10) {
            return i13;
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public static boolean c0(f1 f1Var, boolean z10) {
        if (f1Var == null || !f1Var.t() || f1Var.d() == 1 || f1Var.d() == 4 || (z10 && f1Var.w0() != 0 && f1Var.w0() != 4)) {
            return true;
        }
        return false;
    }

    public static int d(List list, Long l4, boolean z10) {
        int i10;
        int binarySearch = Collections.binarySearch(list, l4);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            while (true) {
                int i11 = binarySearch - 1;
                if (i11 < 0 || ((Comparable) list.get(i11)).compareTo(l4) != 0) {
                    break;
                }
                binarySearch = i11;
            }
            i10 = binarySearch;
        }
        if (z10) {
            return Math.max(0, i10);
        }
        return i10;
    }

    public static String[] d0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int e(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int binarySearch = Arrays.binarySearch(iArr, i10);
        if (binarySearch < 0) {
            i12 = -(binarySearch + 2);
        } else {
            while (true) {
                i11 = binarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                binarySearch = i11;
            }
            if (z10) {
                i12 = binarySearch;
            } else {
                i12 = i11;
            }
        }
        if (z11) {
            return Math.max(0, i12);
        }
        return i12;
    }

    public static String e0(int i10) {
        return new String(new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10}, StandardCharsets.US_ASCII);
    }

    public static int f(long[] jArr, long j10, boolean z10) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            while (true) {
                int i11 = binarySearch - 1;
                if (i11 < 0 || jArr[i11] != j10) {
                    break;
                }
                binarySearch = i11;
            }
            i10 = binarySearch;
        }
        if (z10) {
            return Math.max(0, i10);
        }
        return i10;
    }

    public static String f0(byte[] bArr) {
        boolean z10;
        boolean z11;
        f9.b bVar = f9.d.d;
        f9.b bVar2 = bVar.f10514c;
        if (bVar2 == null) {
            f9.a aVar = bVar.f10512a;
            char[] cArr = aVar.f10508b;
            int length = cArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (s6.b(cArr[i10])) {
                    int length2 = cArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            char c10 = cArr[i11];
                            if (c10 >= 'a' && c10 <= 'z') {
                                z10 = true;
                                break;
                            }
                            i11++;
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    u6.o("Cannot call lowerCase() on a mixed-case alphabet", !z10);
                    char[] cArr2 = new char[cArr.length];
                    for (int i12 = 0; i12 < cArr.length; i12++) {
                        char c11 = cArr[i12];
                        if (s6.b(c11)) {
                            c11 = (char) (c11 ^ ' ');
                        }
                        cArr2[i12] = c11;
                    }
                    f9.a aVar2 = new f9.a(a1.g.s(new StringBuilder(), aVar.f10507a, ".lowerCase()"), cArr2);
                    if (aVar.h) {
                        byte[] bArr2 = aVar2.f10511g;
                        if (!aVar2.h) {
                            byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
                            for (int i13 = 65; i13 <= 90; i13++) {
                                int i14 = i13 | 32;
                                byte b10 = bArr2[i13];
                                byte b11 = bArr2[i14];
                                if (b10 == -1) {
                                    copyOf[i13] = b11;
                                } else {
                                    if (b11 == -1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    char c12 = (char) i13;
                                    char c13 = (char) i14;
                                    if (z11) {
                                        copyOf[i14] = b10;
                                    } else {
                                        throw new IllegalStateException(v6.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                                    }
                                }
                            }
                            aVar = new f9.a(a1.g.s(new StringBuilder(), aVar2.f10507a, ".ignoreCase()"), aVar2.f10508b, copyOf, true);
                        }
                    }
                    aVar = aVar2;
                } else {
                    i10++;
                }
            }
            if (aVar == bVar.f10512a) {
                bVar2 = bVar;
            } else {
                bVar2 = new f9.b(aVar);
            }
            bVar.f10514c = bVar2;
        }
        int length3 = bArr.length;
        u6.n(0, length3, bArr.length);
        f9.a aVar3 = bVar2.f10512a;
        int i15 = aVar3.e;
        int i16 = aVar3.f10510f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(m7.b(length3, i16) * i15);
        try {
            bVar2.b(sb2, bArr, length3);
            return sb2.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public static int g(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static j9.e0 g0(j9.y yVar, j9.q qVar) {
        ?? obj = new Object();
        v7 v7Var = new v7(19, obj, yVar);
        j9.r rVar = j9.r.f14351a;
        obj.a(v7Var, rVar);
        yVar.a(new a3.l0(yVar, obj, qVar, 28), rVar);
        return obj;
    }

    public static float h(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f7, f11));
    }

    public static long h0(long j10) {
        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            return j10 / 1000;
        }
        return j10;
    }

    public static int i(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static long j(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static boolean k(SparseArray sparseArray, int i10) {
        if (sparseArray.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean l(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            if (sparseArray2 == null) {
                return true;
            }
            return false;
        } else if (sparseArray2 == null) {
            return false;
        } else {
            if (Build.VERSION.SDK_INT >= 31) {
                return sparseArray.contentEquals(sparseArray2);
            }
            int size = sparseArray.size();
            if (size != sparseArray2.size()) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (!Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int n(SparseArray sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int i10 = 17;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            int keyAt = sparseArray.keyAt(i11);
            i10 = Objects.hashCode(sparseArray.valueAt(i11)) + ((keyAt + (i10 * 31)) * 31);
        }
        return i10;
    }

    public static Bundle o(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ClassLoader classLoader = m0.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (RuntimeException e7) {
            a.d("Util", "Ignoring invalid bundle", e7);
            return null;
        }
    }

    public static int p(int i10, int i11, int i12, byte[] bArr) {
        while (i10 < i11) {
            i12 = f8260j[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static Handler q(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, callback);
    }

    public static String r(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int s(int i10) {
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return Integer.MAX_VALUE;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case 31:
                return 34;
        }
    }

    public static int t(int i10) {
        if (i10 != 10) {
            if (i10 != 16) {
                if (i10 != 24) {
                    switch (i10) {
                        case 1:
                            return 4;
                        case 2:
                            return 12;
                        case 3:
                            return 28;
                        case 4:
                            return 204;
                        case 5:
                            return 220;
                        case 6:
                            return 252;
                        case 7:
                            return 1276;
                        case 8:
                            return 6396;
                        default:
                            switch (i10) {
                                case 12:
                                    return 743676;
                                case 13:
                                    if (Build.VERSION.SDK_INT < 32) {
                                        return 0;
                                    }
                                    return 30136348;
                                case 14:
                                    if (Build.VERSION.SDK_INT < 32) {
                                        return 0;
                                    }
                                    return 202070268;
                                default:
                                    return 0;
                            }
                    }
                } else if (Build.VERSION.SDK_INT < 32) {
                    return 0;
                } else {
                    return 67108860;
                }
            } else if (Build.VERSION.SDK_INT < 32) {
                return 0;
            } else {
                return 205215996;
            }
        } else if (Build.VERSION.SDK_INT < 32) {
            return 6396;
        } else {
            return 737532;
        }
    }

    public static int u(int i10) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 21) {
                        if (i10 != 22) {
                            if (i10 != 268435456) {
                                if (i10 != 1342177280) {
                                    if (i10 != 1610612736) {
                                        if (i10 == 1879048192) {
                                            return 8;
                                        }
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    return 3;
                }
                return 4;
            }
            return 1;
        }
        return 2;
    }

    public static int v(int i10, String str) {
        int i11 = 0;
        for (String str2 : d0(str)) {
            if (i10 == v0.h(v0.d(str2))) {
                i11++;
            }
        }
        return i11;
    }

    public static String w(int i10, String str) {
        String[] d02 = d0(str);
        if (d02.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (String str2 : d02) {
                if (i10 == v0.h(v0.d(str2))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str2);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
            return null;
        }
        return null;
    }

    public static b2.n x(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        throw new UnsupportedOperationException("Method not decompiled: e2.m0.x(java.lang.String, java.lang.String, java.lang.String):b2.n");
    }

    public static Point y(Context context) {
        Display display;
        String H;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && P(context)) {
            if (Build.VERSION.SDK_INT < 28) {
                H = H("sys.display-size");
            } else {
                H = H("vendor.display-size");
            }
            if (!TextUtils.isEmpty(H)) {
                try {
                    String[] split = H.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                a.c("Util", "Invalid display size: " + H);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static int z(int i10) {
        if (i10 != 2 && i10 != 4) {
            if (i10 != 10) {
                if (i10 != 7) {
                    if (i10 != 8) {
                        switch (i10) {
                            case 15:
                                return 6003;
                            case 16:
                            case 18:
                                return 6005;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                return 6004;
                            default:
                                switch (i10) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }
}
