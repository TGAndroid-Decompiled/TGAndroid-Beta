package defpackage;

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
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
public abstract class g8c {
    public static final String a;
    public static final byte[] b;
    public static final long[] c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static HashMap g;
    public static final String[] h;
    public static final String[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        a = str + ", " + str3 + ", " + str2 + ", " + Build.VERSION.SDK_INT;
        b = new byte[0];
        c = new long[0];
        d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int A(int i2) {
        if (i2 != 2 && i2 != 4) {
            if (i2 != 10) {
                if (i2 != 7) {
                    if (i2 != 8) {
                        switch (i2) {
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
                                switch (i2) {
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

    public static int B(String str) {
        String[] split;
        int length;
        boolean z;
        int i2 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z = true;
        } else {
            z = false;
        }
        try {
            str2.getClass();
            i2 = Integer.parseInt(str2);
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static int C(int i2, ByteOrder byteOrder) {
        if (i2 != 32) {
            if (i2 != 64) {
                return 0;
            }
            if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 1879048192;
            }
            return 1912602624;
        } else if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            return 4;
        } else {
            return 1895825408;
        }
    }

    public static long D(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        return Math.round(j2 * f2);
    }

    public static long E(long j2) {
        if (j2 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + j2;
    }

    public static int F(int i2, ByteOrder byteOrder) {
        if (i2 != 8) {
            if (i2 != 16) {
                if (i2 != 24) {
                    if (i2 != 32) {
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

    public static fm4 G(int i2, int i3, int i4) {
        em4 em4Var = new em4();
        em4Var.s = ud7.n("audio/raw");
        em4Var.M = i3;
        em4Var.O = i4;
        em4Var.P = i2;
        return new fm4(em4Var);
    }

    public static long H(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        return Math.round(j2 / f2);
    }

    public static String[] I() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            strArr = new String[]{configuration.locale.toLanguageTag()};
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = U(strArr[i2]);
        }
        return strArr;
    }

    public static String J(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            lad.d("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String K(int i2) {
        switch (i2) {
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
                if (i2 >= 10000) {
                    return tb4.n(i2, "custom (", ")");
                }
                return "?";
        }
    }

    public static boolean L(defpackage.oc8 r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8c.L(oc8):boolean");
    }

    public static int M(android.net.Uri r7, java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8c.M(android.net.Uri, java.lang.String):int");
    }

    public static boolean N(int i2) {
        if (i2 != 3 && i2 != 2 && i2 != 268435456 && i2 != 21 && i2 != 1342177280 && i2 != 22 && i2 != 1610612736 && i2 != 4 && i2 != 1895825408 && i2 != 1879048192 && i2 != 1912602624) {
            return false;
        }
        return true;
    }

    public static boolean O(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i2 == 30) {
                String str = Build.MODEL;
                if (smd.a(str, "moto g(20)") || smd.a(str, "rmx3231")) {
                    return true;
                }
            }
            if (i2 != 34 || !smd.a(Build.MODEL, "sm-x200")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean P(int i2) {
        if (i2 != 10 && i2 != 13) {
            return false;
        }
        return true;
    }

    public static boolean Q(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static boolean R(xu7 xu7Var, xu7 xu7Var2, Inflater inflater) {
        if (xu7Var.a() > 0 && xu7Var.j() == 120 && xu7Var.a() != 0) {
            if (xu7Var2.a.length < xu7Var.a()) {
                xu7Var2.c(xu7Var.a() << 1);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(xu7Var.a, xu7Var.b, xu7Var.a());
            int i2 = 0;
            while (true) {
                try {
                    byte[] bArr = xu7Var2.a;
                    i2 += inflater.inflate(bArr, i2, bArr.length - i2);
                    if (inflater.finished()) {
                        xu7Var2.M(i2);
                        inflater.reset();
                        return true;
                    } else if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    } else {
                        byte[] bArr2 = xu7Var2.a;
                        if (i2 == bArr2.length) {
                            xu7Var2.c(bArr2.length << 1);
                        }
                    }
                } catch (DataFormatException unused) {
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            }
            inflater.reset();
        }
        return false;
    }

    public static void S(int i2, int i3, int i4, ArrayList arrayList) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
            arrayDeque.addFirst(arrayList.remove(i2 + i5));
        }
        arrayList.addAll(Math.min(i4, arrayList.size()), arrayDeque);
    }

    public static long T(long j2) {
        if (j2 != -9223372036854775807L && j2 != Long.MIN_VALUE) {
            return j2 * 1000;
        }
        return j2;
    }

    public static String U(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String c2 = smd.c(str);
        int i2 = 0;
        String str2 = c2.split("-", 2)[0];
        HashMap hashMap = g;
        if (hashMap == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = h;
            HashMap hashMap2 = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap2.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                hashMap2.put(strArr[i3], strArr[i3 + 1]);
            }
            g = hashMap2;
            hashMap = hashMap2;
        }
        String str4 = (String) hashMap.get(str2);
        if (str4 != null) {
            c2 = str4.concat(c2.substring(str2.length()));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return c2;
        }
        while (true) {
            String[] strArr2 = i;
            if (i2 < strArr2.length) {
                if (c2.startsWith(strArr2[i2])) {
                    return strArr2[i2 + 1] + c2.substring(strArr2[i2].length());
                }
                i2 += 2;
            } else {
                return c2;
            }
        }
    }

    public static Object[] V(int i2, Object[] objArr) {
        boolean z;
        if (i2 <= objArr.length) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        return Arrays.copyOf(objArr, i2);
    }

    public static long W(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.matches()) {
            int i2 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                int parseInt = Integer.parseInt(matcher.group(12)) * 60;
                String group = matcher.group(13);
                if (group != null) {
                    i2 = Integer.parseInt(group) + parseInt;
                } else {
                    i2 = parseInt;
                }
                if ("-".equals(matcher.group(11))) {
                    i2 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i2 != 0) {
                return timeInMillis - (i2 * 60000);
            }
            return timeInMillis;
        }
        throw av7.a("Invalid date/time format: " + str, null);
    }

    public static void X(Handler handler, Runnable runnable) {
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

    public static void Y(int i2, int i3, ArrayList arrayList) {
        if (i2 >= 0 && i3 <= arrayList.size() && i2 <= i3) {
            if (i2 != i3) {
                arrayList.subList(i2, i3).clear();
                return;
            }
            return;
        }
        sc8.e();
    }

    public static long Z(int i2, long j2) {
        return b0(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    public static long a(long j2, long j3) {
        boolean z;
        long j4;
        long j5 = j2 + j3;
        boolean z2 = false;
        if ((j3 ^ j2) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j2 ^ j5) >= 0) {
            z2 = true;
        }
        if (z | z2) {
            j4 = j5;
        } else {
            j4 = ((j5 >>> 63) ^ 1) + Long.MAX_VALUE;
        }
        if ((j4 == Long.MIN_VALUE && j5 != Long.MIN_VALUE) || (j4 == Long.MAX_VALUE && j5 != Long.MAX_VALUE)) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    public static void a0(long[] jArr, long j2) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i2 = 0;
        if (j2 >= 1000000) {
            if (j2 % 1000000 == 0) {
                long b2 = yne.b(j2, 1000000L, RoundingMode.UNNECESSARY);
                while (i2 < jArr.length) {
                    jArr[i2] = yne.b(jArr[i2], b2, roundingMode);
                    i2++;
                }
                return;
            }
        } else if (1000000 % j2 == 0) {
            long b3 = yne.b(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = yne.d(jArr[i2], b3);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 != 0) {
                if (j2 >= j4) {
                    if (j2 % j4 == 0) {
                        jArr[i3] = yne.b(1000000L, yne.b(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                    }
                    j3 = j2;
                    jArr[i3] = c0(j4, 1000000L, j3, roundingMode);
                } else {
                    if (j4 % j2 == 0) {
                        jArr[i3] = yne.d(1000000L, yne.b(j4, j2, RoundingMode.UNNECESSARY));
                    }
                    j3 = j2;
                    jArr[i3] = c0(j4, 1000000L, j3, roundingMode);
                }
                i3++;
                j2 = j3;
            }
            j3 = j2;
            i3++;
            j2 = j3;
        }
    }

    public static int b(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i2 = binarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            binarySearch = i2;
        }
        if (z) {
            return binarySearch;
        }
        return i2;
    }

    public static long b0(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        if (j4 >= j3) {
            if (j4 % j3 == 0) {
                return yne.b(j2, yne.b(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
            }
        } else if (j3 % j4 == 0) {
            return yne.d(j2, yne.b(j3, j4, RoundingMode.UNNECESSARY));
        }
        if (j4 >= j2) {
            if (j4 % j2 == 0) {
                return yne.b(j3, yne.b(j4, j2, RoundingMode.UNNECESSARY), roundingMode);
            }
        } else if (j2 % j4 == 0) {
            return yne.d(j3, yne.b(j2, j4, RoundingMode.UNNECESSARY));
        }
        return c0(j2, j3, j4, roundingMode);
    }

    public static int c(dd ddVar, long j2) {
        int i2 = ddVar.b - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (ddVar.f0(i4) < j2) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        int i5 = i2 + 1;
        if (i5 < ddVar.b && ddVar.f0(i5) == j2) {
            return i5;
        }
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    public static long c0(long r9, long r11, long r13, java.math.RoundingMode r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8c.c0(long, long, long, java.math.RoundingMode):long");
    }

    public static int d(mm5 mm5Var, Long l2, boolean z) {
        int i2;
        int binarySearch = Collections.binarySearch(mm5Var, l2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || ((Comparable) mm5Var.get(i3)).compareTo(l2) != 0) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        if (z) {
            return Math.max(0, i2);
        }
        return i2;
    }

    public static boolean d0(oc8 oc8Var, boolean z) {
        if (oc8Var == null || !oc8Var.s() || oc8Var.h() == 1 || oc8Var.h() == 4 || (z && oc8Var.v0() != 0 && oc8Var.v0() != 4)) {
            return true;
        }
        return false;
    }

    public static int e(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                i3 = binarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                binarySearch = i3;
            }
            if (z) {
                i4 = binarySearch;
            } else {
                i4 = i3;
            }
        }
        if (z2) {
            return Math.max(0, i4);
        }
        return i4;
    }

    public static String[] e0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int f(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        if (z) {
            return Math.max(0, i2);
        }
        return i2;
    }

    public static String f0(int i2) {
        return new String(new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2}, StandardCharsets.US_ASCII);
    }

    public static int g(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static String g0(byte[] bArr) {
        boolean z;
        boolean z2;
        int length = bArr.length;
        tf0 tf0Var = vf0.d;
        tf0 tf0Var2 = tf0Var.c;
        if (tf0Var2 == null) {
            sf0 sf0Var = tf0Var.a;
            char[] cArr = sf0Var.b;
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                } else if (smd.b(cArr[i2])) {
                    int length3 = cArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length3) {
                            char c2 = cArr[i3];
                            if (c2 >= 'a' && c2 <= 'z') {
                                z = true;
                                break;
                            }
                            i3++;
                        } else {
                            z = false;
                            break;
                        }
                    }
                    gre.o("Cannot call lowerCase() on a mixed-case alphabet", !z);
                    char[] cArr2 = new char[cArr.length];
                    for (int i4 = 0; i4 < cArr.length; i4++) {
                        char c3 = cArr[i4];
                        if (smd.b(c3)) {
                            c3 = (char) (c3 ^ ' ');
                        }
                        cArr2[i4] = c3;
                    }
                    sf0 sf0Var2 = new sf0(b00.j(new StringBuilder(), sf0Var.a, ".lowerCase()"), cArr2);
                    if (sf0Var.h) {
                        byte[] bArr2 = sf0Var2.g;
                        if (!sf0Var2.h) {
                            byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
                            for (int i5 = 65; i5 <= 90; i5++) {
                                int i6 = i5 | 32;
                                byte b2 = bArr2[i5];
                                byte b3 = bArr2[i6];
                                if (b2 == -1) {
                                    copyOf[i5] = b3;
                                } else {
                                    if (b3 == -1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    char c4 = (char) i5;
                                    char c5 = (char) i6;
                                    if (z2) {
                                        copyOf[i6] = b2;
                                    } else {
                                        sc8.j(nue.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                        return null;
                                    }
                                }
                            }
                            sf0Var = new sf0(b00.j(new StringBuilder(), sf0Var2.a, ".ignoreCase()"), sf0Var2.b, copyOf, true);
                        }
                    }
                    sf0Var = sf0Var2;
                } else {
                    i2++;
                }
            }
            if (sf0Var == tf0Var.a) {
                tf0Var2 = tf0Var;
            } else {
                tf0Var2 = new tf0(sf0Var);
            }
            tf0Var.c = tf0Var2;
        }
        gre.n(0, length, bArr.length);
        sf0 sf0Var3 = tf0Var2.a;
        int i7 = sf0Var3.e;
        int i8 = sf0Var3.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(cle.b(length, i8) * i7);
        try {
            tf0Var2.b(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            fi7.g(e2);
            return null;
        }
    }

    public static float h(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static p7a h0(t56 t56Var, mx mxVar) {
        ?? obj = new Object();
        l3c l3cVar = new l3c(obj, t56Var, (byte) 7);
        vn3 vn3Var = vn3.a;
        obj.b(l3cVar, vn3Var);
        t56Var.b(new r1b(t56Var, obj, mxVar, (byte) 23), vn3Var);
        return obj;
    }

    public static int i(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long i0(long j2) {
        if (j2 != -9223372036854775807L && j2 != Long.MIN_VALUE) {
            return j2 / 1000;
        }
        return j2;
    }

    public static long j(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static boolean k(SparseArray sparseArray, int i2) {
        if (sparseArray.indexOfKey(i2) >= 0) {
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
            for (int i2 = 0; i2 < size; i2++) {
                if (!Objects.equals(sparseArray.valueAt(i2), sparseArray2.get(sparseArray.keyAt(i2)))) {
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
        int i2 = 17;
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            int keyAt = sparseArray.keyAt(i3);
            i2 = Objects.hashCode(sparseArray.valueAt(i3)) + ((keyAt + (i2 * 31)) * 31);
        }
        return i2;
    }

    public static Bundle o(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ClassLoader classLoader = g8c.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (RuntimeException e2) {
            lad.d("Util", "Ignoring invalid bundle", e2);
            return null;
        }
    }

    public static int p(int i2, int i3, int i4, byte[] bArr) {
        while (i2 < i3) {
            i4 = j[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static Handler q(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, callback);
    }

    public static String r(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int s(int i2) {
        switch (i2) {
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

    public static int t(int i2) {
        if (i2 != 10) {
            if (i2 != 16) {
                if (i2 != 24) {
                    switch (i2) {
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
                            switch (i2) {
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

    public static int u(int i2) {
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 21) {
                        if (i2 != 22) {
                            if (i2 != 268435456) {
                                if (i2 != 1342177280) {
                                    if (i2 != 1610612736) {
                                        if (i2 != 1879048192) {
                                            if (i2 != 1895825408) {
                                                if (i2 != 1912602624) {
                                                    sc8.e();
                                                    return 0;
                                                }
                                                return 8;
                                            }
                                        } else {
                                            return 8;
                                        }
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

    public static int v(int i2, String str) {
        int i3 = 0;
        for (String str2 : e0(str)) {
            if (i2 == ud7.h(ud7.d(str2))) {
                i3++;
            }
        }
        return i3;
    }

    public static String w(int i2, String str) {
        String[] e0 = e0(str);
        if (e0.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : e0) {
                if (i2 == ud7.h(ud7.d(str2))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str2);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        }
        return null;
    }

    public static defpackage.hl2 x(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8c.x(java.lang.String, java.lang.String, java.lang.String):hl2");
    }

    public static Point y(Context context) {
        Display display;
        String J;
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
        if (display.getDisplayId() == 0 && Q(context)) {
            if (Build.VERSION.SDK_INT < 28) {
                J = J("sys.display-size");
            } else {
                J = J("vendor.display-size");
            }
            if (!TextUtils.isEmpty(J)) {
                try {
                    String[] split = J.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                lad.c("Util", "Invalid display size: " + J);
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

    public static Looper z() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }
}
