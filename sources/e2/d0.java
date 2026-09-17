package e2;

import a3.k0;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import b2.b1;
import b2.r0;
import b2.s0;
import di.b7;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
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
import v7.p7;
import v7.r6;
public abstract class d0 {
    public static final String f8765a;
    public static final byte[] f8766b;
    public static final long[] f8767c;
    public static final Pattern d;
    public static final Pattern f8768e;
    public static final Pattern f8769f;
    public static HashMap f8770g;
    public static final String[] h;
    public static final String[] f8771i;
    public static final int[] f8772j;
    public static final int[] f8773k;
    public static final int[] f8774l;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        f8765a = str + ", " + str3 + ", " + str2 + ", " + Build.VERSION.SDK_INT;
        f8766b = new byte[0];
        f8767c = new long[0];
        d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f8768e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f8769f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f8771i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f8772j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f8773k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f8774l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static long A(long j3) {
        if (j3 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + j3;
    }

    public static int B(int i10, ByteOrder byteOrder) {
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

    public static b2.s C(int i10, int i11, int i12) {
        b2.r rVar = new b2.r();
        rVar.f2339q = r0.n("audio/raw");
        rVar.I = i11;
        rVar.J = i12;
        rVar.K = i10;
        return new b2.s(rVar);
    }

    public static long D(long j3, float f7) {
        if (f7 == 1.0f) {
            return j3;
        }
        return Math.round(j3 / f7);
    }

    public static String[] E() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            strArr = new String[]{configuration.locale.toLanguageTag()};
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr[i10] = R(strArr[i10]);
        }
        return strArr;
    }

    public static String F(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e7) {
            a.f("Util", "Failed to read system property ".concat(str), e7);
            return null;
        }
    }

    public static String G(int i10) {
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
                    return i2.g.j(i10, "custom (", ")");
                }
                return "?";
        }
    }

    public static boolean H(b2.b1 r4) {
        throw new UnsupportedOperationException("Method not decompiled: e2.d0.H(b2.b1):boolean");
    }

    public static int I(android.net.Uri r7, java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: e2.d0.I(android.net.Uri, java.lang.String):int");
    }

    public static void J(int i10) {
        Integer.toString(i10, 36);
    }

    public static boolean K(int i10) {
        if (i10 != 3 && i10 != 2 && i10 != 268435456 && i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736 && i10 != 4) {
            return false;
        }
        return true;
    }

    public static boolean L(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i10 == 30) {
                String str = Build.MODEL;
                if (r6.a(str, "moto g(20)") || r6.a(str, "rmx3231")) {
                    return true;
                }
            }
            if (i10 != 34 || !r6.a(Build.MODEL, "sm-x200")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean M(int i10) {
        if (i10 != 10 && i10 != 13) {
            return false;
        }
        return true;
    }

    public static boolean N(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static boolean O(v vVar, v vVar2, Inflater inflater) {
        if (vVar.a() > 0 && (vVar.f8817a[vVar.f8818b] & 255) == 120 && vVar.a() != 0) {
            if (vVar2.f8817a.length < vVar.a()) {
                vVar2.c(vVar.a() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(vVar.f8817a, vVar.f8818b, vVar.a());
            int i10 = 0;
            while (true) {
                try {
                    byte[] bArr = vVar2.f8817a;
                    i10 += inflater.inflate(bArr, i10, bArr.length - i10);
                    if (inflater.finished()) {
                        vVar2.I(i10);
                        inflater.reset();
                        return true;
                    } else if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    } else {
                        byte[] bArr2 = vVar2.f8817a;
                        if (i10 == bArr2.length) {
                            vVar2.c(bArr2.length * 2);
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

    public static void P(int i10, int i11, int i12, ArrayList arrayList) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(arrayList.remove(i10 + i13));
        }
        arrayList.addAll(Math.min(i12, arrayList.size()), arrayDeque);
    }

    public static long Q(long j3) {
        if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
            return j3 * 1000;
        }
        return j3;
    }

    public static String R(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String b10 = r6.b(str);
        int i10 = 0;
        String str2 = b10.split("-", 2)[0];
        if (f8770g == null) {
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
            f8770g = hashMap;
        }
        String str4 = (String) f8770g.get(str2);
        if (str4 != null) {
            StringBuilder u10 = a4.a.u(str4);
            u10.append(b10.substring(str2.length()));
            b10 = u10.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return b10;
        }
        while (true) {
            String[] strArr2 = f8771i;
            if (i10 < strArr2.length) {
                if (b10.startsWith(strArr2[i10])) {
                    return strArr2[i10 + 1] + b10.substring(strArr2[i10].length());
                }
                i10 += 2;
            } else {
                return b10;
            }
        }
    }

    public static Object[] S(int i10, Object[] objArr) {
        boolean z10;
        if (i10 <= objArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.b(z10);
        return Arrays.copyOf(objArr, i10);
    }

    public static long T(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.matches()) {
            int i10 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i10 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
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
        throw s0.a(null, "Invalid date/time format: " + str);
    }

    public static void U(Handler handler, Runnable runnable) {
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

    public static void V(int i10, int i11, ArrayList arrayList) {
        if (i10 >= 0 && i11 <= arrayList.size() && i10 <= i11) {
            if (i10 != i11) {
                arrayList.subList(i10, i11).clear();
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static long W(int i10, long j3) {
        return Y(j3, 1000000L, i10, RoundingMode.DOWN);
    }

    public static void X(long[] jArr, long j3) {
        long j10;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i10 = 0;
        int i11 = (j3 > 1000000L ? 1 : (j3 == 1000000L ? 0 : -1));
        if (i11 >= 0 && j3 % 1000000 == 0) {
            long b10 = p7.b(j3, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = p7.b(jArr[i10], b10, roundingMode);
                i10++;
            }
        } else if (i11 < 0 && 1000000 % j3 == 0) {
            long b11 = p7.b(1000000L, j3, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = p7.d(jArr[i10], b11);
                i10++;
            }
        } else {
            int i12 = 0;
            while (i12 < jArr.length) {
                long j11 = jArr[i12];
                if (j11 != 0) {
                    int i13 = (j3 > j11 ? 1 : (j3 == j11 ? 0 : -1));
                    if (i13 >= 0 && j3 % j11 == 0) {
                        jArr[i12] = p7.b(1000000L, p7.b(j3, j11, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (i13 < 0 && j11 % j3 == 0) {
                        jArr[i12] = p7.d(1000000L, p7.b(j11, j3, RoundingMode.UNNECESSARY));
                    } else {
                        j10 = j3;
                        jArr[i12] = Z(j11, 1000000L, j10, roundingMode);
                        i12++;
                        j3 = j10;
                    }
                }
                j10 = j3;
                i12++;
                j3 = j10;
            }
        }
    }

    public static long Y(long j3, long j10, long j11, RoundingMode roundingMode) {
        if (j3 == 0 || j10 == 0) {
            return 0L;
        }
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i10 >= 0 && j11 % j10 == 0) {
            return p7.b(j3, p7.b(j11, j10, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i10 < 0 && j10 % j11 == 0) {
            return p7.d(j3, p7.b(j10, j11, RoundingMode.UNNECESSARY));
        }
        int i11 = (j11 > j3 ? 1 : (j11 == j3 ? 0 : -1));
        if (i11 >= 0 && j11 % j3 == 0) {
            return p7.b(j10, p7.b(j11, j3, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i11 < 0 && j3 % j11 == 0) {
            return p7.d(j10, p7.b(j3, j11, RoundingMode.UNNECESSARY));
        }
        return Z(j3, j10, j11, roundingMode);
    }

    public static long Z(long r9, long r11, long r13, java.math.RoundingMode r15) {
        throw new UnsupportedOperationException("Method not decompiled: e2.d0.Z(long, long, long, java.math.RoundingMode):long");
    }

    public static int a(long[] jArr, long j3, boolean z10) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i10 = binarySearch + 1;
            if (i10 >= jArr.length || jArr[i10] != j3) {
                break;
            }
            binarySearch = i10;
        }
        if (z10) {
            return binarySearch;
        }
        return i10;
    }

    public static boolean a0(b1 b1Var, boolean z10) {
        if (b1Var == null || !b1Var.u() || b1Var.d() == 1 || b1Var.d() == 4 || (z10 && b1Var.u0() != 0 && b1Var.u0() != 4)) {
            return true;
        }
        return false;
    }

    public static int b(c5.b0 b0Var, long j3) {
        int i10 = b0Var.f4373b - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            if (b0Var.f(i12) < j3) {
                i11 = i12 + 1;
            } else {
                i10 = i12 - 1;
            }
        }
        int i13 = i10 + 1;
        if (i13 < b0Var.f4373b && b0Var.f(i13) == j3) {
            return i13;
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public static String[] b0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int c(List list, Long l4, boolean z10) {
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

    public static String c0(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return sb2.toString();
    }

    public static int d(int[] iArr, int i10, boolean z10, boolean z11) {
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

    public static i9.c0 d0(i9.w wVar, i9.p pVar) {
        ?? obj = new Object();
        b7 b7Var = new b7(20, obj, wVar);
        i9.q qVar = i9.q.f11946a;
        obj.a(b7Var, qVar);
        wVar.a(new k0(wVar, obj, pVar, 22), qVar);
        return obj;
    }

    public static int e(long[] jArr, long j3, boolean z10) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            while (true) {
                int i11 = binarySearch - 1;
                if (i11 < 0 || jArr[i11] != j3) {
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

    public static long e0(long j3) {
        if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
            return j3 / 1000;
        }
        return j3;
    }

    public static int f(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static float g(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f7, f11));
    }

    public static int h(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static long i(long j3, long j10, long j11) {
        return Math.max(j10, Math.min(j3, j11));
    }

    public static boolean j(SparseArray sparseArray, int i10) {
        if (sparseArray.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean k(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(SparseArray sparseArray, SparseArray sparseArray2) {
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

    public static int m(SparseArray sparseArray) {
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

    public static int n(int i10, int i11, int i12, byte[] bArr) {
        while (i10 < i11) {
            i12 = f8772j[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static Handler o(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        d.h(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String p(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int q(int i10) {
        if (i10 != 30) {
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
                    return 28;
                default:
                    switch (i10) {
                        case 14:
                            return 25;
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            return 28;
                        default:
                            switch (i10) {
                                case 20:
                                    return 30;
                                case 21:
                                case 22:
                                    return 31;
                                default:
                                    return Integer.MAX_VALUE;
                            }
                    }
            }
        }
        return 34;
    }

    public static AudioFormat r(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static int s(int i10) {
        if (i10 != 10) {
            if (i10 != 12) {
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
                            return 0;
                    }
                } else if (Build.VERSION.SDK_INT < 32) {
                    return 0;
                } else {
                    return 67108860;
                }
            }
            return 743676;
        } else if (Build.VERSION.SDK_INT < 32) {
            return 6396;
        } else {
            return 737532;
        }
    }

    public static int t(int i10) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 21) {
                        if (i10 != 22) {
                            if (i10 != 268435456) {
                                if (i10 != 1342177280) {
                                    if (i10 != 1610612736) {
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

    public static int u(int i10, String str) {
        int i11 = 0;
        for (String str2 : b0(str)) {
            if (i10 == r0.h(r0.d(str2))) {
                i11++;
            }
        }
        return i11;
    }

    public static String v(int i10, String str) {
        String[] b02 = b0(str);
        if (b02.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (String str2 : b02) {
                if (i10 == r0.h(r0.d(str2))) {
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

    public static Point w(Context context) {
        Display display;
        String F;
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
        if (display.getDisplayId() == 0 && N(context)) {
            if (Build.VERSION.SDK_INT < 28) {
                F = F("sys.display-size");
            } else {
                F = F("vendor.display-size");
            }
            if (!TextUtils.isEmpty(F)) {
                try {
                    String[] split = F.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                a.e("Util", "Invalid display size: " + F);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        }
        display.getRealSize(point);
        return point;
    }

    public static int x(int i10) {
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

    public static int y(String str) {
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

    public static long z(long j3, float f7) {
        if (f7 == 1.0f) {
            return j3;
        }
        return Math.round(j3 * f7);
    }
}
