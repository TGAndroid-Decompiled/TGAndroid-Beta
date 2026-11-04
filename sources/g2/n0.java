package g2;

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
import b8.ac;
import b8.wc;
import b8.xb;
import b8.xc;
import b8.zb;
import d2.e1;
import d2.u0;
import d2.v0;
import ei.h9;
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
import k2.p1;
public abstract class n0 {
    public static final String f11873a;
    public static final byte[] f11874b;
    public static final long[] f11875c;
    public static final Pattern d;
    public static final Pattern f11876e;
    public static final Pattern f11877f;
    public static HashMap f11878g;
    public static final String[] h;
    public static final String[] f11879i;
    public static final int[] f11880j;
    public static final int[] f11881k;
    public static final int[] f11882l;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        f11873a = str + ", " + str3 + ", " + str2 + ", " + Build.VERSION.SDK_INT;
        f11874b = new byte[0];
        f11875c = new long[0];
        d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        f11876e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f11877f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f11879i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f11880j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f11881k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f11882l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int A(String str) {
        String[] split;
        int length;
        boolean z10;
        int i3 = 0;
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
            i3 = Integer.parseInt(str2);
            if (z10) {
                return -i3;
            }
        } catch (NumberFormatException unused) {
        }
        return i3;
    }

    public static long B(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        return Math.round(j10 * f10);
    }

    public static long C(long j10) {
        if (j10 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + j10;
    }

    public static int D(int i3, ByteOrder byteOrder) {
        if (i3 != 8) {
            if (i3 != 16) {
                if (i3 != 24) {
                    if (i3 != 32) {
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

    public static d2.v E(int i3, int i10, int i11) {
        d2.u uVar = new d2.u();
        uVar.f8431r = u0.n("audio/raw");
        uVar.J = i10;
        uVar.K = i11;
        uVar.L = i3;
        return new d2.v(uVar);
    }

    public static long F(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        return Math.round(j10 / f10);
    }

    public static String[] G() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            strArr = new String[]{configuration.locale.toLanguageTag()};
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            strArr[i3] = T(strArr[i3]);
        }
        return strArr;
    }

    public static String H(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            a.d("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    public static String I(int i3) {
        switch (i3) {
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
                if (i3 >= 10000) {
                    return p1.j(i3, "custom (", ")");
                }
                return "?";
        }
    }

    public static boolean J(d2.e1 r4) {
        throw new UnsupportedOperationException("Method not decompiled: g2.n0.J(d2.e1):boolean");
    }

    public static int K(android.net.Uri r7, java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: g2.n0.K(android.net.Uri, java.lang.String):int");
    }

    public static boolean L(int i3) {
        if (i3 != 21 && i3 != 1342177280 && i3 != 22 && i3 != 1610612736 && i3 != 4 && i3 != 1879048192) {
            return false;
        }
        return true;
    }

    public static boolean M(int i3) {
        if (i3 != 3 && i3 != 2 && i3 != 268435456 && i3 != 21 && i3 != 1342177280 && i3 != 22 && i3 != 1610612736 && i3 != 4 && i3 != 1879048192) {
            return false;
        }
        return true;
    }

    public static boolean N(Context context) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i3 == 30) {
                String str = Build.MODEL;
                if (xb.a(str, "moto g(20)") || xb.a(str, "rmx3231")) {
                    return true;
                }
            }
            if (i3 != 34 || !xb.a(Build.MODEL, "sm-x200")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean O(int i3) {
        if (i3 != 10 && i3 != 13) {
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

    public static boolean Q(y yVar, y yVar2, Inflater inflater) {
        if (yVar.a() > 0 && yVar.j() == 120 && yVar.a() != 0) {
            if (yVar2.f11923a.length < yVar.a()) {
                yVar2.c(yVar.a() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(yVar.f11923a, yVar.f11924b, yVar.a());
            int i3 = 0;
            while (true) {
                try {
                    byte[] bArr = yVar2.f11923a;
                    i3 += inflater.inflate(bArr, i3, bArr.length - i3);
                    if (inflater.finished()) {
                        yVar2.M(i3);
                        inflater.reset();
                        return true;
                    } else if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    } else {
                        byte[] bArr2 = yVar2.f11923a;
                        if (i3 == bArr2.length) {
                            yVar2.c(bArr2.length * 2);
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

    public static void R(int i3, int i10, int i11, ArrayList arrayList) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i12 = (i10 - i3) - 1; i12 >= 0; i12--) {
            arrayDeque.addFirst(arrayList.remove(i3 + i12));
        }
        arrayList.addAll(Math.min(i11, arrayList.size()), arrayDeque);
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
        String c2 = xb.c(str);
        int i3 = 0;
        String str2 = c2.split("-", 2)[0];
        if (f11878g == null) {
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
            for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                hashMap.put(strArr[i10], strArr[i10 + 1]);
            }
            f11878g = hashMap;
        }
        String str4 = (String) f11878g.get(str2);
        if (str4 != null) {
            StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str4);
            l10.append(c2.substring(str2.length()));
            c2 = l10.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return c2;
        }
        while (true) {
            String[] strArr2 = f11879i;
            if (i3 < strArr2.length) {
                if (c2.startsWith(strArr2[i3])) {
                    return strArr2[i3 + 1] + c2.substring(strArr2[i3].length());
                }
                i3 += 2;
            } else {
                return c2;
            }
        }
    }

    public static Object[] U(int i3, Object[] objArr) {
        boolean z10;
        if (i3 <= objArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        return Arrays.copyOf(objArr, i3);
    }

    public static long V(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.matches()) {
            int i3 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                int parseInt = Integer.parseInt(matcher.group(12)) * 60;
                String group = matcher.group(13);
                if (group != null) {
                    i3 = Integer.parseInt(group) + parseInt;
                } else {
                    i3 = parseInt;
                }
                if ("-".equals(matcher.group(11))) {
                    i3 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i3 != 0) {
                return timeInMillis - (i3 * 60000);
            }
            return timeInMillis;
        }
        throw v0.a(null, "Invalid date/time format: " + str);
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

    public static void X(int i3, int i10, ArrayList arrayList) {
        if (i3 >= 0 && i10 <= arrayList.size() && i3 <= i10) {
            if (i3 != i10) {
                arrayList.subList(i3, i10).clear();
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static long Y(int i3, long j10) {
        return a0(j10, 1000000L, i3, RoundingMode.DOWN);
    }

    public static void Z(long[] jArr, long j10) {
        long j11;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i3 = (j10 > 1000000L ? 1 : (j10 == 1000000L ? 0 : -1));
        int i10 = 0;
        if (i3 >= 0 && j10 % 1000000 == 0) {
            long b10 = xc.b(j10, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = xc.b(jArr[i10], b10, roundingMode);
                i10++;
            }
        } else if (i3 < 0 && 1000000 % j10 == 0) {
            long b11 = xc.b(1000000L, j10, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = xc.d(jArr[i10], b11);
                i10++;
            }
        } else {
            int i11 = 0;
            while (i11 < jArr.length) {
                long j12 = jArr[i11];
                if (j12 != 0) {
                    int i12 = (j10 > j12 ? 1 : (j10 == j12 ? 0 : -1));
                    if (i12 >= 0 && j10 % j12 == 0) {
                        jArr[i11] = xc.b(1000000L, xc.b(j10, j12, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (i12 < 0 && j12 % j10 == 0) {
                        jArr[i11] = xc.d(1000000L, xc.b(j12, j10, RoundingMode.UNNECESSARY));
                    } else {
                        j11 = j10;
                        jArr[i11] = b0(j12, 1000000L, j11, roundingMode);
                        i11++;
                        j10 = j11;
                    }
                }
                j11 = j10;
                i11++;
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
        int i3 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i3 >= 0 && j12 % j11 == 0) {
            return xc.b(j10, xc.b(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i3 < 0 && j11 % j12 == 0) {
            return xc.d(j10, xc.b(j11, j12, RoundingMode.UNNECESSARY));
        }
        int i10 = (j12 > j10 ? 1 : (j12 == j10 ? 0 : -1));
        if (i10 >= 0 && j12 % j10 == 0) {
            return xc.b(j11, xc.b(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i10 < 0 && j10 % j12 == 0) {
            return xc.d(j11, xc.b(j10, j12, RoundingMode.UNNECESSARY));
        }
        return b0(j10, j11, j12, roundingMode);
    }

    public static int b(long[] jArr, long j10, boolean z10) {
        int i3;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i3 = binarySearch + 1;
            if (i3 >= jArr.length || jArr[i3] != j10) {
                break;
            }
            binarySearch = i3;
        }
        if (z10) {
            return binarySearch;
        }
        return i3;
    }

    public static long b0(long r9, long r11, long r13, java.math.RoundingMode r15) {
        throw new UnsupportedOperationException("Method not decompiled: g2.n0.b0(long, long, long, java.math.RoundingMode):long");
    }

    public static int c(e5.u uVar, long j10) {
        int i3 = uVar.f9633b - 1;
        int i10 = 0;
        while (i10 <= i3) {
            int i11 = (i10 + i3) >>> 1;
            if (uVar.j(i11) < j10) {
                i10 = i11 + 1;
            } else {
                i3 = i11 - 1;
            }
        }
        int i12 = i3 + 1;
        if (i12 < uVar.f9633b && uVar.j(i12) == j10) {
            return i12;
        }
        if (i3 == -1) {
            return 0;
        }
        return i3;
    }

    public static boolean c0(e1 e1Var, boolean z10) {
        if (e1Var == null || !e1Var.u() || e1Var.h() == 1 || e1Var.h() == 4 || (z10 && e1Var.t0() != 0 && e1Var.t0() != 4)) {
            return true;
        }
        return false;
    }

    public static int d(List list, Long l10, boolean z10) {
        int i3;
        int binarySearch = Collections.binarySearch(list, l10);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                int i10 = binarySearch - 1;
                if (i10 < 0 || ((Comparable) list.get(i10)).compareTo(l10) != 0) {
                    break;
                }
                binarySearch = i10;
            }
            i3 = binarySearch;
        }
        if (z10) {
            return Math.max(0, i3);
        }
        return i3;
    }

    public static String[] d0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int e(int[] iArr, int i3, boolean z10, boolean z11) {
        int i10;
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i3);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                i10 = binarySearch - 1;
                if (i10 < 0 || iArr[i10] != i3) {
                    break;
                }
                binarySearch = i10;
            }
            if (z10) {
                i11 = binarySearch;
            } else {
                i11 = i10;
            }
        }
        if (z11) {
            return Math.max(0, i11);
        }
        return i11;
    }

    public static String e0(int i3) {
        return new String(new byte[]{(byte) (i3 >> 24), (byte) (i3 >> 16), (byte) (i3 >> 8), (byte) i3}, StandardCharsets.US_ASCII);
    }

    public static int f(long[] jArr, long j10, boolean z10) {
        int i3;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                int i10 = binarySearch - 1;
                if (i10 < 0 || jArr[i10] != j10) {
                    break;
                }
                binarySearch = i10;
            }
            i3 = binarySearch;
        }
        if (z10) {
            return Math.max(0, i3);
        }
        return i3;
    }

    public static String f0(byte[] bArr) {
        boolean z10;
        boolean z11;
        h9.b bVar = h9.d.d;
        h9.b bVar2 = bVar.f14363c;
        if (bVar2 == null) {
            h9.a aVar = bVar.f14361a;
            char[] cArr = aVar.f14355b;
            int length = cArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (xb.b(cArr[i3])) {
                    int length2 = cArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length2) {
                            char c2 = cArr[i10];
                            if (c2 >= 'a' && c2 <= 'z') {
                                z10 = true;
                                break;
                            }
                            i10++;
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    zb.o("Cannot call lowerCase() on a mixed-case alphabet", !z10);
                    char[] cArr2 = new char[cArr.length];
                    for (int i11 = 0; i11 < cArr.length; i11++) {
                        char c10 = cArr[i11];
                        if (xb.b(c10)) {
                            c10 = (char) (c10 ^ ' ');
                        }
                        cArr2[i11] = c10;
                    }
                    h9.a aVar2 = new h9.a(a1.g.s(new StringBuilder(), aVar.f14354a, ".lowerCase()"), cArr2);
                    if (aVar.h) {
                        byte[] bArr2 = aVar2.f14359g;
                        if (!aVar2.h) {
                            byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
                            for (int i12 = 65; i12 <= 90; i12++) {
                                int i13 = i12 | 32;
                                byte b10 = bArr2[i12];
                                byte b11 = bArr2[i13];
                                if (b10 == -1) {
                                    copyOf[i12] = b11;
                                } else {
                                    if (b11 == -1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    char c11 = (char) i12;
                                    char c12 = (char) i13;
                                    if (z11) {
                                        copyOf[i13] = b10;
                                    } else {
                                        throw new IllegalStateException(ac.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                                    }
                                }
                            }
                            aVar = new h9.a(a1.g.s(new StringBuilder(), aVar2.f14354a, ".ignoreCase()"), aVar2.f14355b, copyOf, true);
                        }
                    }
                    aVar = aVar2;
                } else {
                    i3++;
                }
            }
            if (aVar == bVar.f14361a) {
                bVar2 = bVar;
            } else {
                bVar2 = new h9.b(aVar);
            }
            bVar.f14363c = bVar2;
        }
        int length3 = bArr.length;
        zb.n(0, length3, bArr.length);
        h9.a aVar3 = bVar2.f14361a;
        int i14 = aVar3.f14357e;
        int i15 = aVar3.f14358f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(wc.b(length3, i15) * i14);
        try {
            bVar2.b(sb2, bArr, length3);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public static int g(int i3, int i10) {
        return ((i3 + i10) - 1) / i10;
    }

    public static l9.e0 g0(l9.y yVar, l9.q qVar) {
        ?? obj = new Object();
        c cVar = new c(3, obj, yVar);
        l9.r rVar = l9.r.f18162a;
        obj.b(cVar, rVar);
        yVar.b(new h9(yVar, (Object) obj, qVar, 2), rVar);
        return obj;
    }

    public static float h(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static long h0(long j10) {
        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            return j10 / 1000;
        }
        return j10;
    }

    public static int i(int i3, int i10, int i11) {
        return Math.max(i10, Math.min(i3, i11));
    }

    public static long j(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static boolean k(SparseArray sparseArray, int i3) {
        if (sparseArray.indexOfKey(i3) >= 0) {
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
            for (int i3 = 0; i3 < size; i3++) {
                if (!Objects.equals(sparseArray.valueAt(i3), sparseArray2.get(sparseArray.keyAt(i3)))) {
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
        int i3 = 17;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            i3 = Objects.hashCode(sparseArray.valueAt(i10)) + ((keyAt + (i3 * 31)) * 31);
        }
        return i3;
    }

    public static Bundle o(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ClassLoader classLoader = n0.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (RuntimeException e10) {
            a.d("Util", "Ignoring invalid bundle", e10);
            return null;
        }
    }

    public static int p(int i3, int i10, int i11, byte[] bArr) {
        while (i3 < i10) {
            i11 = f11880j[((i11 >>> 24) ^ (bArr[i3] & 255)) & 255] ^ (i11 << 8);
            i3++;
        }
        return i11;
    }

    public static Handler q(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, callback);
    }

    public static String r(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int s(int i3) {
        switch (i3) {
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

    public static int t(int i3) {
        if (i3 != 10) {
            if (i3 != 16) {
                if (i3 != 24) {
                    switch (i3) {
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
                            switch (i3) {
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

    public static int u(int i3) {
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 21) {
                        if (i3 != 22) {
                            if (i3 != 268435456) {
                                if (i3 != 1342177280) {
                                    if (i3 != 1610612736) {
                                        if (i3 == 1879048192) {
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

    public static int v(int i3, String str) {
        int i10 = 0;
        for (String str2 : d0(str)) {
            if (i3 == u0.h(u0.d(str2))) {
                i10++;
            }
        }
        return i10;
    }

    public static String w(int i3, String str) {
        String[] d02 = d0(str);
        if (d02.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (String str2 : d02) {
                if (i3 == u0.h(u0.d(str2))) {
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

    public static d2.n x(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        throw new UnsupportedOperationException("Method not decompiled: g2.n0.x(java.lang.String, java.lang.String, java.lang.String):d2.n");
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

    public static int z(int i3) {
        if (i3 != 2 && i3 != 4) {
            if (i3 != 10) {
                if (i3 != 7) {
                    if (i3 != 8) {
                        switch (i3) {
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
                                switch (i3) {
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
