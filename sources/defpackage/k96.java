package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.xmlpull.v1.XmlPullParser;
public final class k96 {
    public static boolean a0 = false;
    public static byte b0 = 1;
    public static boolean c0 = false;
    public static volatile k96 d0;
    public static final char[] e0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final char[][] f0 = {new char[]{1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641}, new char[]{1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785}, new char[]{2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415}, new char[]{2790, 2791, 2792, 2793, 2794, 2795, 2796, 2797, 2798, 2799}, new char[]{2662, 2663, 2664, 2665, 2666, 2667, 2668, 2669, 2670, 2671}, new char[]{2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543}, new char[]{3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311}, new char[]{2918, 2919, 2920, 2921, 2922, 2923, 2924, 2925, 2926, 2927}, new char[]{3430, 3431, 3432, 3433, 3434, 3435, 3436, 3437, 3438, 3439}, new char[]{3046, 3047, 3048, 3049, 3050, 3051, 3052, 3053, 3054, 3055}, new char[]{3174, 3175, 3176, 3177, 3178, 3179, 3180, 3181, 3182, 3183}, new char[]{4160, 4161, 4162, 4163, 4164, 4165, 4166, 4167, 4168, 4169}, new char[]{3872, 3873, 3874, 3875, 3876, 3877, 3878, 3879, 3880, 3881}, new char[]{6160, 6161, 6162, 6163, 6164, 6165, 6166, 6167, 6168, 6169}, new char[]{6112, 6113, 6114, 6115, 6116, 6117, 6118, 6119, 6120, 6121}, new char[]{3664, 3665, 3666, 3667, 3668, 3669, 3670, 3671, 3672, 3673}, new char[]{3792, 3793, 3794, 3795, 3796, 3797, 3798, 3799, 3800, 3801}, new char[]{43472, 43473, 43474, 43475, 43476, 43477, 43478, 43479, 43480, 43481}};
    public static Boolean g0;
    public j96 A;
    public i96 B;
    public String C;
    public boolean E;
    public String F;
    public HashMap G;
    public HashMap H;
    public boolean I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public final HashMap M;
    public final HashMap N;
    public final ArrayList O;
    public boolean P;
    public boolean Q;
    public do3 R;
    public final HashMap S;
    public final HashMap T;
    public r96 U;
    public volatile Locale V;
    public volatile r96 W;
    public volatile boolean X;
    public r96 Y;
    public int Z;
    public volatile FastDateFormat a;
    public volatile FastDateFormat b;
    public volatile FastDateFormat c;
    public volatile FastDateFormat d;
    public volatile FastDateFormat e;
    public volatile FastDateFormat f;
    public volatile FastDateFormat g;
    public volatile FastDateFormat h;
    public volatile FastDateFormat i;
    public volatile FastDateFormat j;
    public volatile FastDateFormat k;
    public volatile FastDateFormat l;
    public volatile FastDateFormat m;
    public volatile FastDateFormat n;
    public volatile FastDateFormat o;
    public volatile FastDateFormat p;
    public volatile FastDateFormat q;
    public volatile FastDateFormat r;
    public volatile FastDateFormat s;
    public volatile FastDateFormat t;
    public volatile FastDateFormat u;
    public volatile FastDateFormat v;
    public Locale y;
    public Locale z;
    public final FastDateFormat[] w = new FastDateFormat[18];
    public final HashMap x = new HashMap();
    public boolean D = false;

    public k96() {
        boolean z = false;
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new HashMap();
        HashMap hashMap = new HashMap();
        this.N = hashMap;
        this.O = new ArrayList();
        this.Q = false;
        this.S = new HashMap();
        this.T = new HashMap();
        r96 r96Var = r96.c;
        this.W = r96Var;
        this.Y = r96Var;
        b(new String[]{"bem", "brx", "da", "de", "el", "en", "eo", "es", "et", "fi", "fo", "gl", "he", "iw", "it", "nb", "nl", "nn", "no", "sv", "af", "bg", "bn", "ca", "eu", "fur", "fy", "gu", "ha", "is", "ku", "lb", "ml", "mr", "nah", "ne", "om", "or", "pa", "pap", "ps", "so", "sq", "sw", "ta", "te", "tk", "ur", "zu", "mn", "gsw", "chr", "rm", "pt", "an", "ast"}, new j96((byte) 11));
        b(new String[]{"cs", "sk"}, new j96((byte) 3));
        b(new String[]{"ff", "fr", "kab"}, new j96((byte) 4));
        b(new String[]{"ru", "uk", "be"}, new j96((byte) 1));
        b(new String[]{"sr", "hr", "bs", "sh"}, new j96((byte) 14));
        b(new String[]{"lv"}, new j96((byte) 6));
        b(new String[]{"lt"}, new j96((byte) 7));
        b(new String[]{"pl"}, new j96((byte) 12));
        b(new String[]{"ro", "mo"}, new j96((byte) 13));
        b(new String[]{"sl"}, new j96((byte) 15));
        b(new String[]{"ar"}, new j96((byte) 0));
        b(new String[]{"mk"}, new j96((byte) 8));
        b(new String[]{"cy"}, new j96((byte) 18));
        b(new String[]{"br"}, new j96((byte) 2));
        b(new String[]{"lag"}, new j96((byte) 5));
        b(new String[]{"shi"}, new j96((byte) 16));
        b(new String[]{"mt"}, new j96((byte) 9));
        b(new String[]{"ga", "se", "sma", "smi", "smj", "smn", "sms"}, new j96((byte) 17));
        b(new String[]{"ak", "am", "bh", "fil", "tl", "guw", "hi", "ln", "mg", "nso", "ti", "wa"}, new j96((byte) 19));
        b(new String[]{"az", "bm", "fa", "ig", "hu", "ja", "kde", "kea", "ko", "my", "ses", "sg", "to", "tr", "vi", "wo", "yo", "zh", "bo", "dz", "id", "jv", "jw", "ka", "km", "kn", "ms", "th", "in"}, new j96((byte) 10));
        ?? obj = new Object();
        obj.a = "English";
        obj.b = "English";
        obj.f = "en";
        obj.c = "en";
        i96 i96Var = null;
        obj.d = null;
        obj.j = true;
        arrayList.add(obj);
        hashMap.put(obj.c, obj);
        ?? obj2 = new Object();
        obj2.a = "Italiano";
        obj2.b = "Italian";
        obj2.f = "it";
        obj2.c = "it";
        obj2.d = null;
        obj2.j = true;
        arrayList.add(obj2);
        hashMap.put(obj2.c, obj2);
        ?? obj3 = new Object();
        obj3.a = "Español";
        obj3.b = "Spanish";
        obj3.f = "es";
        obj3.c = "es";
        obj3.j = true;
        arrayList.add(obj3);
        hashMap.put(obj3.c, obj3);
        ?? obj4 = new Object();
        obj4.a = "Deutsch";
        obj4.b = "German";
        obj4.f = "de";
        obj4.c = "de";
        obj4.d = null;
        obj4.j = true;
        arrayList.add(obj4);
        hashMap.put(obj4.c, obj4);
        ?? obj5 = new Object();
        obj5.a = "Nederlands";
        obj5.b = "Dutch";
        obj5.f = "nl";
        obj5.c = "nl";
        obj5.d = null;
        obj5.j = true;
        arrayList.add(obj5);
        hashMap.put(obj5.c, obj5);
        ?? obj6 = new Object();
        obj6.a = "العربية";
        obj6.b = "Arabic";
        obj6.f = "ar";
        obj6.c = "ar";
        obj6.d = null;
        obj6.j = true;
        obj6.g = true;
        arrayList.add(obj6);
        hashMap.put(obj6.c, obj6);
        ?? obj7 = new Object();
        obj7.a = "Português (Brasil)";
        obj7.b = "Portuguese (Brazil)";
        obj7.f = "pt_br";
        obj7.c = "pt_br";
        obj7.d = null;
        obj7.j = true;
        arrayList.add(obj7);
        hashMap.put(obj7.c, obj7);
        ?? obj8 = new Object();
        obj8.a = "한국어";
        obj8.b = "Korean";
        obj8.f = "ko";
        obj8.c = "ko";
        obj8.d = null;
        obj8.j = true;
        arrayList.add(obj8);
        hashMap.put(obj8.c, obj8);
        ?? obj9 = new Object();
        obj9.a = "Українська";
        obj9.b = "Ukrainian";
        obj9.f = "uk";
        obj9.c = "uk";
        obj9.d = null;
        obj9.j = true;
        arrayList.add(obj9);
        hashMap.put(obj9.c, obj9);
        ?? obj10 = new Object();
        obj10.a = "Русский";
        obj10.b = "Russian";
        obj10.f = "ru";
        obj10.c = "ru";
        obj10.d = null;
        obj10.j = true;
        arrayList.add(obj10);
        hashMap.put(obj10.c, obj10);
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("langconfig", 0);
        String string = sharedPreferences.getString("locales", null);
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split("&")) {
                i96 a = i96.a(str);
                if (a != null) {
                    this.O.add(a);
                }
            }
        }
        String string2 = sharedPreferences.getString("remote", null);
        if (!TextUtils.isEmpty(string2)) {
            for (String str2 : string2.split("&")) {
                i96 a2 = i96.a(str2);
                a2.c = a2.c.replace("-", "_");
                if (!this.M.containsKey(a2.b())) {
                    this.L.add(a2);
                    this.M.put(a2.b(), a2);
                }
            }
        }
        String string3 = sharedPreferences.getString("unofficial", null);
        if (!TextUtils.isEmpty(string3)) {
            for (String str3 : string3.split("&")) {
                i96 a3 = i96.a(str3);
                if (a3 != null) {
                    a3.c = a3.c.replace("-", "_");
                    this.K.add(a3);
                }
            }
        }
        if (this.L.isEmpty()) {
            gl.c3(new Runnable(this) {
                public final k96 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    k96 k96Var = this.b;
                    switch (b) {
                        case 0:
                            k96Var.V0(y6c.t0, true);
                            return;
                        default:
                            k96Var.F = k96.Q0();
                            return;
                    }
                }
            });
        }
        for (int i = 0; i < this.O.size(); i++) {
            i96 i96Var2 = (i96) this.O.get(i);
            this.J.add(i96Var2);
            this.N.put(i96Var2.b(), i96Var2);
        }
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            i96 i96Var3 = (i96) this.L.get(i2);
            i96 F0 = F0(i96Var3.b());
            if (F0 != null) {
                F0.d = i96Var3.d;
                F0.h = i96Var3.h;
                F0.i = i96Var3.i;
                F0.k = i96Var3.k;
                this.L.set(i2, F0);
            } else {
                this.J.add(i96Var3);
                this.N.put(i96Var3.b(), i96Var3);
            }
        }
        for (int i3 = 0; i3 < this.K.size(); i3++) {
            i96 i96Var4 = (i96) this.K.get(i3);
            i96 F02 = F0(i96Var4.b());
            if (F02 != null) {
                F02.d = i96Var4.d;
                F02.h = i96Var4.h;
                F02.i = i96Var4.i;
                F02.k = i96Var4.k;
                this.K.set(i3, F02);
            } else {
                this.N.put(i96Var4.b(), i96Var4);
            }
        }
        this.z = Locale.getDefault();
        c0 = DateFormat.is24HourFormat(a.b);
        try {
            String string4 = na7.c1().getString("language", null);
            if (string4 != null && (i96Var = F0(string4)) != null) {
                z = true;
            }
            if (i96Var == null && this.z.getLanguage() != null) {
                i96Var = F0(this.z.getLanguage());
            }
            if (i96Var == null && (i96Var = F0(H0(this.z))) == null) {
                i96Var = F0("en");
            }
            d(i96Var, z, true, y6c.t0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                a.b.registerReceiver(new zj(this, (byte) 7), intentFilter, 4);
            } else {
                a.b.registerReceiver(new zj(this, (byte) 7), intentFilter);
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        gl.c3(new Runnable(this) {
            public final k96 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                k96 k96Var = this.b;
                switch (b) {
                    case 0:
                        k96Var.V0(y6c.t0, true);
                        return;
                    default:
                        k96Var.F = k96.Q0();
                        return;
                }
            }
        });
    }

    public static java.lang.String A(org.telegram.tgnet.TLRPC.TL_messageEntityFormattedDate r11, long r12, java.util.Locale r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k96.A(org.telegram.tgnet.TLRPC$TL_messageEntityFormattedDate, long, java.util.Locale, boolean):java.lang.String");
    }

    public static String B(long j) {
        String a02;
        long j2 = j * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                a02 = a0(null, null, 2131742520, D0().p0().format(new Date(j2)), D0().o0().format(new Date(j2)));
            } else {
                a02 = a0(null, null, 2131742520, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2)));
            }
            return a0(null, null, 2131752323, a02);
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String C(int i) {
        int i2;
        int i3;
        int i4 = (i / 60) / 60;
        int i5 = i - (i4 * 3600);
        int i6 = i5 / 60;
        int i7 = i5 - (i6 * 60);
        if (i4 != 0) {
            if (i6 > 30) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            return String.format("%dh", Integer.valueOf(i4 + i3));
        } else if (i6 != 0) {
            if (i7 > 30) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            return String.format("%d", Integer.valueOf(i6 + i2));
        } else {
            return String.format("%d", Integer.valueOf(i7));
        }
    }

    public static String D(long j) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            if (i3 == i && i2 == i4) {
                int currentTime = ((int) (ConnectionsManager.getInstance(y6c.t0).getCurrentTime() - (j2 / 1000))) / 60;
                if (currentTime < 1) {
                    return M0(2131748553, null);
                }
                if (currentTime < 60) {
                    return G(currentTime, "UpdatedMinutes", new Object[0]);
                }
                return a0(null, null, 2131748554, a0("TodayAtFormatted", null, 2131743870, D0().o0().format(new Date(j2))));
            } else if (i3 + 1 == i && i2 == i4) {
                return a0(null, null, 2131748554, a0("YesterdayAtFormatted", null, 2131742580, D0().o0().format(new Date(j2))));
            } else {
                if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                    return a0(null, null, 2131748554, a0(null, null, 2131742520, D0().p0().format(new Date(j2)), D0().o0().format(new Date(j2))));
                }
                return a0(null, null, 2131748554, a0(null, null, 2131742520, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2))));
            }
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static k96 D0() {
        k96 k96Var;
        k96 k96Var2 = d0;
        if (k96Var2 == null) {
            synchronized (k96.class) {
                k96Var = d0;
                if (k96Var == null) {
                    k96Var = new k96();
                    d0 = k96Var;
                }
            }
            return k96Var;
        }
        return k96Var2;
    }

    public static String E(long j, char c) {
        if (j < 0) {
            return "-".concat(E(-j, c));
        }
        StringBuilder sb = new StringBuilder(String.format("%d", Long.valueOf(j)));
        for (int length = sb.length() - 3; length > 0; length -= 3) {
            sb.insert(length, c);
        }
        return sb.toString();
    }

    public static String E0(String str) {
        if (str.length() == 2 && !str.equals("YL")) {
            if (str.equals("FT")) {
                return "💎";
            }
            if (str.equals("XG")) {
                return "🛰";
            }
            if (str.equals("XV")) {
                return "🌍";
            }
            char[] charArray = str.toCharArray();
            return new String(new char[]{55356, (char) (((charArray[0] + 61861) & 1023) + 56320), 55356, (char) (((charArray[1] + 61861) & 1023) + 56320)});
        }
        return null;
    }

    public static CharSequence F(String str, int i, CharSequence... charSequenceArr) {
        if (str.length() != 0 && D0().A != null) {
            D0();
            String y = tb4.y(str, "_", f1(D0().A.a(i)));
            Object[] objArr = new Object[charSequenceArr.length + 1];
            objArr[0] = Integer.valueOf(i);
            System.arraycopy(charSequenceArr, 0, objArr, 1, charSequenceArr.length);
            return V(y, str.concat("_other"), 0, objArr);
        }
        return "LOC_ERR:".concat(str);
    }

    public static String G(int i, String str, Object... objArr) {
        if (str.length() != 0 && D0().A != null) {
            D0();
            String y = tb4.y(str, "_", f1(D0().A.a(i)));
            Object[] objArr2 = new Object[objArr.length + 1];
            objArr2[0] = Integer.valueOf(i);
            System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
            return a0(y, str.concat("_other"), 0, objArr2);
        }
        return "LOC_ERR:".concat(str);
    }

    public static String H(char c, String str, int i) {
        return K(str, i, c, new Object[0]);
    }

    public static String H0(Locale locale) {
        if (locale != null) {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            String variant = locale.getVariant();
            if (language.length() == 0 && country.length() == 0) {
                return "en";
            }
            StringBuilder sb = new StringBuilder(11);
            sb.append(language);
            if (country.length() > 0 || variant.length() > 0) {
                sb.append('_');
            }
            sb.append(country);
            if (variant.length() > 0) {
                sb.append('_');
            }
            sb.append(variant);
            return sb.toString();
        }
        return "en";
    }

    public static String I(int i, String str) {
        return H(',', str, i);
    }

    public static String I0() {
        i96 i96Var = D0().B;
        if (i96Var != null) {
            return i96Var.c();
        }
        Locale locale = D0().y;
        if (locale == null) {
            return "en";
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        if (language.length() == 0 && country.length() == 0) {
            return "en";
        }
        StringBuilder sb = new StringBuilder(11);
        sb.append(language);
        if (country.length() > 0 || variant.length() > 0) {
            sb.append('-');
        }
        sb.append(country);
        if (variant.length() > 0) {
            sb.append('_');
        }
        sb.append(variant);
        return sb.toString();
    }

    public static String J(int i, String str, Object... objArr) {
        return K(str, i, ',', objArr);
    }

    public static String J0(int i, String str) {
        if (str.length() != 0 && D0().A != null) {
            D0();
            return D0().O0(0, tb4.y(str, "_", f1(D0().A.a(i))), str.concat("_other"));
        }
        return "LOC_ERR:".concat(str);
    }

    public static String K(String str, int i, char c, Object... objArr) {
        StringBuilder sb;
        try {
            if (str.length() != 0 && D0().A != null) {
                D0();
                String str2 = str + "_" + f1(D0().A.a(i));
                StringBuilder sb2 = new StringBuilder(String.format("%d", Integer.valueOf(i)));
                for (int length = sb2.length() - 3; length > 0; length -= 3) {
                    sb2.insert(length, c);
                }
                boolean z = w01.a;
                String a = D0().Y.a(str2);
                if (a == null) {
                    a = D0().Y.a(str + "_other");
                }
                if (a == null) {
                    try {
                        k96 D0 = D0();
                        D0.i();
                        a = D0.W.a(str2);
                    } catch (Exception unused) {
                    }
                }
                if (a == null) {
                    k96 D02 = D0();
                    D02.i();
                    a = D02.W.a(str + "_other");
                }
                String replace = a.replace("%d", "%1$s").replace("%1$d", "%1$s");
                int length2 = objArr.length + 1;
                Object[] objArr2 = new Object[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    if (i2 == 0) {
                        sb = sb2;
                    } else {
                        sb = objArr[i2 - 1];
                    }
                    objArr2[i2] = sb;
                }
                if (D0().y != null) {
                    return String.format(D0().y, replace, objArr2);
                }
                return String.format(replace, objArr2);
            }
            return "LOC_ERR:".concat(str);
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR: ".concat(str);
        }
    }

    public static String K0(String str) {
        String a = D0().Y.a(str);
        if (a == null) {
            k96 D0 = D0();
            D0.i();
            return D0.W.a(str);
        }
        return a;
    }

    public static String L(long j) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            if (i3 == i && i2 == i4) {
                return a0(null, null, 2131747009, D0().o0().format(new Date(j2)));
            }
            if (i3 + 1 == i && i2 == i4) {
                return a0(null, null, 2131747008, D0().o0().format(new Date(j2)));
            }
            if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                return a0(null, null, 2131747010, D0().p0().format(new Date(j2)), D0().o0().format(new Date(j2)));
            }
            return a0(null, null, 2131747010, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2)));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String L0(int i) {
        return M0(i, null);
    }

    public static String M(int i, boolean z) {
        String G;
        int i2;
        if (i < 86400) {
            G = R(i);
        } else {
            G = G(i / 86400, "Days", new Object[0]);
        }
        if (z) {
            i2 = 2131746967;
        } else {
            i2 = 2131746979;
        }
        return a0(null, null, i2, G);
    }

    public static String M0(int i, String str) {
        return D0().O0(i, str, null);
    }

    public static String N(long j) {
        try {
            long j2 = j / 60;
            long j3 = j2 / 60;
            long j4 = j3 / 24;
            long j5 = j4 / 30;
            long j6 = j4 / 365;
            int i = (j6 > 1L ? 1 : (j6 == 1L ? 0 : -1));
            if (i >= 0) {
                if (i == 0) {
                    return M0(2131742593, null);
                }
                return H(',', "YearsAgo", (int) j6);
            }
            int i2 = (j5 > 1L ? 1 : (j5 == 1L ? 0 : -1));
            if (i2 >= 0) {
                if (i2 == 0) {
                    return M0(2131748153, null);
                }
                return H(',', "MonthsAgo", (int) j5);
            }
            int i3 = (j4 > 1L ? 1 : (j4 == 1L ? 0 : -1));
            if (i3 >= 0) {
                if (i3 == 0) {
                    return M0(2131751656, null);
                }
                return H(',', "DaysAgo", (int) j4);
            }
            int i4 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
            if (i4 >= 0) {
                if (i4 == 0) {
                    return M0(2131749097, null);
                }
                return H(',', "HoursAgo", (int) j3);
            }
            int i5 = (j2 > 1L ? 1 : (j2 == 1L ? 0 : -1));
            if (i5 >= 0) {
                if (i5 == 0) {
                    return M0(2131748234, null);
                }
                return H(',', "MinutesAgo", (int) j2);
            }
            return M0(2131748795, null);
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String N0(String str) {
        if (TextUtils.isEmpty(str)) {
            return b00.h("LOC_ERR:", str);
        }
        return M0(0, str);
    }

    public static String O(long j) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            if (i3 == i && i2 == i4) {
                return a0(null, null, 2131743869, D0().o0().format(new Date(j2)));
            }
            if (i3 + 1 == i && i2 == i4) {
                return a0(null, null, 2131742580, D0().o0().format(new Date(j2)));
            }
            if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                return a0(null, null, 2131742520, D0().p0().format(new Date(j2)), D0().o0().format(new Date(j2)));
            }
            return a0(null, null, 2131742520, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2)));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String P(long j) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            long j3 = timeInMillis - j2;
            if (j3 < 60000) {
                return M0(2131745165, null);
            }
            if (j3 < 3600000) {
                return G((int) (j3 / 60000), "ShortMinutesAgo", new Object[0]);
            }
            if (i3 == i && i2 == i4) {
                if (j3 < 43200000) {
                    return G((int) (j3 / 3600000), "ShortHoursAgo", new Object[0]);
                }
                return M0(2131745163, null);
            } else if (i3 + 1 == i && i2 == i4) {
                return M0(2131745162, null);
            } else {
                if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                    return D0().p0().format(new Date(j2));
                }
                return a0(null, null, 2131742520, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2)));
            }
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String Q(long j) {
        long j2 = j * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                return D0().v0().format(new Date(j2)) + ", " + D0().o0().format(new Date(j2));
            }
            return D0().x0().format(new Date(j2)) + ", " + D0().o0().format(new Date(j2));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String Q0() {
        Locale locale = D0().z;
        if (locale == null) {
            return "en";
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        if (language.length() == 0 && country.length() == 0) {
            return "en";
        }
        StringBuilder sb = new StringBuilder(11);
        sb.append(language);
        if (country.length() > 0 || variant.length() > 0) {
            sb.append('-');
        }
        sb.append(country);
        if (variant.length() > 0) {
            sb.append('_');
        }
        sb.append(variant);
        return sb.toString();
    }

    public static String R(int i) {
        String str;
        String str2;
        int i2 = i / 3600;
        int i3 = (i / 60) % 60;
        int i4 = i % 60;
        StringBuilder sb = new StringBuilder();
        String str3 = "0";
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append(":");
            }
            if (i2 < 10) {
                str2 = "0";
            } else {
                str2 = "";
            }
            sb.append(str2);
            sb.append(i2);
        }
        if (sb.length() > 0) {
            sb.append(":");
        }
        if (i3 < 10) {
            str = "0";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(i3);
        if (sb.length() > 0) {
            sb.append(":");
        }
        if (i4 >= 10) {
            str3 = "";
        }
        sb.append(str3);
        sb.append(i4);
        return sb.toString();
    }

    public static String S(int[] iArr, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = i / 1000;
            if (i3 <= 0) {
                break;
            }
            sb.append("K");
            i2 = (i % 1000) / 100;
            i = i3;
        }
        if (iArr != null) {
            double d = (i2 / 10.0d) + i;
            for (int i4 = 0; i4 < sb.length(); i4++) {
                d *= 1000.0d;
            }
            iArr[0] = (int) d;
        }
        if (i2 != 0 && sb.length() > 0) {
            if (sb.length() == 2) {
                Locale locale = Locale.US;
                return i + "." + i2 + "M";
            }
            Locale locale2 = Locale.US;
            return i + "." + i2 + sb.toString();
        } else if (sb.length() == 2) {
            Locale locale3 = Locale.US;
            return oo1.n(i, "M");
        } else {
            Locale locale4 = Locale.US;
            return oo1.n(i, sb.toString());
        }
    }

    public static String T(long j) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i = calendar.get(1);
            long j2 = j * 1000;
            calendar.setTimeInMillis(j2);
            if (i == calendar.get(1)) {
                return D0().p0().format(j2);
            }
            return D0().p0().format(j2) + ", " + calendar.get(1);
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static boolean T0(File file) {
        if (file != null && new File(new File(a.h(), "malformed_locales"), file.getName()).exists()) {
            return true;
        }
        return false;
    }

    public static CharSequence U(int i, Object... objArr) {
        return V(null, null, i, objArr);
    }

    public static boolean U0(int i) {
        if (i != 9 && i != 10 && i != 13) {
            if (i < 32 || i > 55295) {
                if (i < 57344 || i > 65533) {
                    if (i < 65536 || i > 1114111) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static CharSequence V(String str, String str2, int i, Object... objArr) {
        String str3;
        try {
            String P0 = D0().P0(i, str, str2);
            if (P0 == null) {
                return "LOC_ERR: " + str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(P0);
            int i2 = 0;
            while (i2 < objArr.length) {
                String str4 = "s";
                Object obj = objArr[i2];
                if (obj instanceof CharSequence) {
                    str3 = (CharSequence) obj;
                } else {
                    if (obj instanceof Integer) {
                        str3 = "" + ((Integer) objArr[i2]);
                    } else if (obj instanceof Long) {
                        str3 = "" + ((Long) objArr[i2]);
                    } else if (obj != null) {
                        str3 = "";
                    } else {
                        str3 = "null";
                    }
                    str4 = "d";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("%");
                i2++;
                sb.append(i2);
                sb.append("$");
                sb.append(str4);
                String sb2 = sb.toString();
                int indexOf = spannableStringBuilder.toString().indexOf(sb2);
                if (indexOf != -1) {
                    spannableStringBuilder.replace(indexOf, sb2.length() + indexOf, str3);
                } else {
                    String str5 = "%" + str4;
                    int indexOf2 = spannableStringBuilder.toString().indexOf(str5);
                    if (indexOf2 != -1) {
                        spannableStringBuilder.replace(indexOf2, str5.length() + indexOf2, str3);
                    }
                }
            }
            return spannableStringBuilder;
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR: " + str;
        }
    }

    public static String W(int i, long j, boolean z) {
        int i2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i3 = calendar.get(1);
        int i4 = calendar.get(6);
        calendar.setTimeInMillis(j * 1000);
        int i5 = calendar.get(1);
        int i6 = calendar.get(6);
        if (i3 == i5) {
            if (z && i6 == i4) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        } else {
            i2 = 2;
        }
        if (i == 1) {
            i2 += 3;
        } else if (i == 2) {
            i2 += 6;
        } else if (i == 3) {
            i2 += 9;
        } else if (i == 4) {
            i2 += 12;
        }
        return D0().w0(i2).format(calendar.getTimeInMillis());
    }

    public static String X(long j) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            long j3 = timeInMillis - j2;
            if (j3 < 60000) {
                return M0(2131745805, null);
            }
            if (j3 < 3600000) {
                int i5 = (int) (j3 / 60000);
                return G(i5, "MinutesAgo", Integer.valueOf(i5));
            } else if (i3 == i && i2 == i4) {
                return a0(null, null, 2131743869, D0().o0().format(new Date(j2)));
            } else {
                if (i3 + 1 == i && i2 == i4) {
                    return a0(null, null, 2131742580, D0().o0().format(new Date(j2)));
                }
                if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                    return a0(null, null, 2131742520, D0().p0().format(new Date(j2)), D0().o0().format(new Date(j2)));
                }
                return a0(null, null, 2131742520, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2)));
            }
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static void X0(String str) {
        if (w01.a) {
            fa4.b("set as patched " + str + " langpack");
        }
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putBoolean("lngpack_patched_" + str, true).apply();
    }

    public static String Y(int i, String str, Object... objArr) {
        return a0(str, null, i, objArr);
    }

    public static String Z(int i, Object... objArr) {
        return a0(null, null, i, objArr);
    }

    public static String a(String str) {
        return str.replace(' ', (char) 160);
    }

    public static String a0(String str, String str2, int i, Object... objArr) {
        try {
            String P0 = D0().P0(i, str, str2);
            if (P0 == null) {
                return "LOC_ERR: " + str;
            } else if (D0().y != null) {
                return String.format(D0().y, P0, objArr);
            } else {
                return String.format(P0, objArr);
            }
        } catch (Exception e) {
            fa4.g(e, true);
            if (i != 0) {
                try {
                    return String.format(a.b.getString(i), objArr);
                } catch (Exception unused) {
                    return b00.h("LOC_ERR: ", str);
                }
            }
            return b00.h("LOC_ERR: ", str);
        }
    }

    public static String b0(String str, Object... objArr) {
        try {
            if (D0().y != null) {
                return String.format(D0().y, str, objArr);
            }
            return String.format(str, objArr);
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR: " + str;
        }
    }

    public static String c0(int i) {
        if (i < 60) {
            return G(i, "Seconds", new Object[0]);
        }
        if (i < 3600) {
            return G(i / 60, "Minutes", new Object[0]);
        }
        if (i < 86400) {
            return G((i / 60) / 60, "Hours", new Object[0]);
        }
        if (i < 604800) {
            return G(((i / 60) / 60) / 24, "Days", new Object[0]);
        }
        if (i < 2678400) {
            int i2 = ((i / 60) / 60) / 24;
            if (i % 7 == 0) {
                return G(i2 / 7, "Weeks", new Object[0]);
            }
            return tb4.y(G(i2 / 7, "Weeks", new Object[0]), " ", G(i2 % 7, "Days", new Object[0]));
        } else if (i >= 31536000 && i % 31536000 == 0) {
            return G((((i / 60) / 60) / 24) / 365, "Years", new Object[0]);
        } else {
            return G((((i / 60) / 60) / 24) / 30, "Months", new Object[0]);
        }
    }

    public static String d0(int i, TLRPC.User user, boolean[] zArr, boolean[] zArr2) {
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.UserStatus userStatus3;
        int i2;
        int i3;
        int i4;
        if (user != null && (userStatus3 = user.status) != null && userStatus3.expires == 0) {
            if (userStatus3 instanceof TLRPC.TL_userStatusRecently) {
                if (userStatus3.by_me) {
                    i4 = -1000;
                } else {
                    i4 = -100;
                }
                userStatus3.expires = i4;
            } else if (userStatus3 instanceof TLRPC.TL_userStatusLastWeek) {
                if (userStatus3.by_me) {
                    i3 = -1001;
                } else {
                    i3 = -101;
                }
                userStatus3.expires = i3;
            } else if (userStatus3 instanceof TLRPC.TL_userStatusLastMonth) {
                if (userStatus3.by_me) {
                    i2 = -1002;
                } else {
                    i2 = -102;
                }
                userStatus3.expires = i2;
            }
        }
        if (user != null && (userStatus2 = user.status) != null && userStatus2.expires <= 0 && na7.q1(i).a0.containsKey(Long.valueOf(user.id))) {
            if (zArr != null) {
                zArr[0] = true;
            }
            return M0(2131747633, "Online");
        } else if (user != null && (userStatus = user.status) != null && userStatus.expires != 0 && !l7c.z(user) && !(user instanceof TLRPC.TL_userEmpty)) {
            int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            int i5 = user.status.expires;
            if (i5 > currentTime) {
                if (zArr != null) {
                    zArr[0] = true;
                }
                return M0(2131747633, "Online");
            } else if (i5 == -1) {
                return M0(2131748986, "Invisible");
            } else {
                if (i5 != -100 && i5 != -1000) {
                    if (i5 != -101 && i5 != -1001) {
                        if (i5 != -102 && i5 != -1002) {
                            return w(i5, zArr2);
                        }
                        return M0(2131742600, "WithinAMonth");
                    }
                    return M0(2131742599, "WithinAWeek");
                }
                return M0(2131748819, "Lately");
            }
        } else {
            return M0(2131754951, "ALongTimeAgo");
        }
    }

    public static String e0(long j, boolean z) {
        long j2 = 1000 * j;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i2 = calendar.get(1);
            int i3 = calendar.get(2);
            String[] strArr = {M0(2131748894, null), M0(2131750817, null), M0(2131748491, null), M0(2131754170, null), M0(2131748470, null), M0(2131748872, null), M0(2131748874, null), M0(2131753892, null), M0(2131745373, null), M0(2131747637, null), M0(2131747642, null), M0(2131751593, null)};
            if (i == i2 && !z) {
                return strArr[i3];
            }
            return strArr[i3] + " " + i2;
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String e1(long j) {
        long j2 = j * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j2) >= 31536000000L) {
                return D0().B0().format(new Date(j2));
            }
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            calendar.setTimeInMillis(j2);
            int i2 = calendar.get(6) - i;
            if (i2 != 0 && (i2 != -1 || System.currentTimeMillis() - j2 >= 28800000)) {
                if (i2 > -7 && i2 <= -1) {
                    return D0().z0().format(new Date(j2));
                }
                return D0().p0().format(new Date(j2));
            }
            return D0().o0().format(new Date(j2));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String f0(long j) {
        long j2 = 1000 * j;
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i = calendar.get(1);
            int i2 = calendar.get(2);
            int i3 = calendar.get(5);
            return new String[]{M0(2131748894, null), M0(2131750817, null), M0(2131748491, null), M0(2131754170, null), M0(2131748470, null), M0(2131748872, null), M0(2131748874, null), M0(2131753892, null), M0(2131745373, null), M0(2131747637, null), M0(2131747642, null), M0(2131751593, null)}[i2] + " " + i3 + ", " + i;
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String f1(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            return "other";
                        }
                        return "many";
                    }
                    return "few";
                }
                return "two";
            }
            return "one";
        }
        return "zero";
    }

    public static Spannable g(String str) {
        if (str instanceof Spannable) {
            Spannable spannable = (Spannable) str;
            spannable.setSpan(new z3c(gl.o()), 0, str.length(), 33);
            return spannable;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new z3c(gl.o()), 0, str.length(), 33);
        return spannableStringBuilder;
    }

    public static int h(java.util.HashMap r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k96.h(java.util.HashMap):int");
    }

    public static String i0(int i, String str) {
        if (str != null && str.equalsIgnoreCase("ft")) {
            return M0(i, null);
        }
        try {
            return new Locale("", str).getDisplayCountry(D0().y);
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static String j0() {
        i96 i96Var = D0().B;
        if (i96Var != null && !TextUtils.isEmpty(i96Var.a)) {
            return i96Var.a;
        }
        return M0(2131748857, "LanguageName");
    }

    public static FastDateFormat k(Locale locale, String str, String str2) {
        if (str.length() == 0) {
            str = str2;
        }
        try {
            return FastDateFormat.getInstance(str, locale);
        } catch (Exception unused) {
            return FastDateFormat.getInstance(str2, locale);
        }
    }

    public static int k0(i96 i96Var, TLRPC.TL_langPackDifference tL_langPackDifference) {
        String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
        if (lowerCase.equals(i96Var.c)) {
            return 0;
        }
        if (lowerCase.equals(i96Var.e)) {
            return 1;
        }
        return -1;
    }

    public static void l() {
        if (g0 == null) {
            int i = gba.o1;
            boolean z = false;
            if (i == 0) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
                    if (telephonyManager != null) {
                        String upperCase = telephonyManager.getSimCountryIso().toUpperCase();
                        if ("US".equals(upperCase) || "GB".equals(upperCase) || "MM".equals(upperCase) || "LR".equals(upperCase)) {
                            z = true;
                        }
                        g0 = Boolean.valueOf(z);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    g0 = Boolean.FALSE;
                    fa4.g(e, true);
                    return;
                }
            }
            if (i == 2) {
                z = true;
            }
            g0 = Boolean.valueOf(z);
        }
    }

    public static java.lang.String m(java.lang.String r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k96.m(java.lang.String, boolean):java.lang.String");
    }

    public static String n(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence);
        int length = sb.length();
        for (int i = 0; i < length; i++) {
            char charAt = sb.charAt(i);
            if ((charAt < '0' || charAt > '9') && charAt != '.' && charAt != ',') {
                int i2 = 0;
                while (i2 < 18) {
                    int i3 = 0;
                    while (true) {
                        char[] cArr = f0[i2];
                        if (i3 >= cArr.length) {
                            break;
                        } else if (charAt == cArr[i3]) {
                            sb.setCharAt(i, e0[i3]);
                            i2 = 18;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
            }
        }
        return sb.toString();
    }

    public static String o(int i) {
        if (i > 3600) {
            String G = G(i / 3600, "Hours", new Object[0]);
            int i2 = (i % 3600) / 60;
            if (i2 > 0) {
                StringBuilder k = b00.k(G, ", ");
                k.append(G(i2, "Minutes", new Object[0]));
                return k.toString();
            }
            return G;
        } else if (i > 60) {
            return G(i / 60, "Minutes", new Object[0]);
        } else {
            return G(i, "Seconds", new Object[0]);
        }
    }

    public static String r(long j, boolean z) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            if (i3 == i && i2 == i4) {
                if (z) {
                    return M0(2131745163, null);
                }
                return D0().o0().format(new Date(j2));
            } else if (i3 + 1 == i && i2 == i4) {
                return M0(2131742582, "Yesterday");
            } else {
                if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                    return D0().p0().format(new Date(j2));
                }
                return D0().B0().format(new Date(j2));
            }
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR: formatDate";
        }
    }

    public static String s(long j, boolean z) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            if (i3 == i && i2 == i4) {
                if (z) {
                    return a0(null, null, 2131743870, D0().o0().format(new Date(j2)));
                }
                return a0(null, null, 2131743869, D0().o0().format(new Date(j2)));
            } else if (i3 + 1 == i && i2 == i4) {
                return a0(null, null, 2131742580, D0().o0().format(new Date(j2)));
            } else {
                if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                    return a0(null, null, 2131742520, D0().p0().format(new Date(j2)), D0().o0().format(new Date(j2)));
                }
                return a0(null, null, 2131742520, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2)));
            }
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String t(long j) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            if (i3 == i && i2 == i4) {
                return D0().o0().format(new Date(j2));
            }
            if (i3 + 1 == i && i2 == i4) {
                return a0(null, null, 2131742580, D0().o0().format(new Date(j2)));
            }
            if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                k96 D0 = D0();
                if (D0.m == null) {
                    synchronized (D0) {
                        if (D0.m == null) {
                            Locale locale = D0.y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            D0.m = k(locale, D0.O0(2131742522, "chatDateShort", null), "d MMM");
                        }
                    }
                }
                return a0(null, null, 2131742520, D0.m.format(new Date(j2)), D0().o0().format(new Date(j2)));
            }
            return a0(null, null, 2131742520, D0().h0().format(new Date(j2)), D0().o0().format(new Date(j2)));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static java.lang.String u(long r5, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k96.u(long, boolean):java.lang.String");
    }

    public static String v(long j) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(1);
            calendar.setTimeInMillis(j2);
            if (i == calendar.get(1)) {
                return D0().m0().format(new Date(j2));
            }
            return D0().l0().format(new Date(j2));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String w(long j, boolean[] zArr) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            int i3 = calendar.get(11);
            calendar.setTimeInMillis(j2);
            int i4 = calendar.get(6);
            int i5 = calendar.get(1);
            int i6 = calendar.get(11);
            if (i4 == i && i2 == i5) {
                return a0(null, null, 2131748825, a0("TodayAtFormatted", null, 2131743870, D0().o0().format(new Date(j2))));
            }
            if (i4 + 1 == i && i2 == i5) {
                if (zArr != null) {
                    zArr[0] = true;
                    if (i3 <= 6 && i6 > 18 && c0) {
                        return a0(null, null, 2131748825, D0().o0().format(new Date(j2)));
                    }
                    return a0(null, null, 2131742580, D0().o0().format(new Date(j2)));
                }
                return a0(null, null, 2131748825, a0("YesterdayAtFormatted", null, 2131742580, D0().o0().format(new Date(j2))));
            } else if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                return a0("LastSeenDateFormatted", null, 2131748828, a0("formatDateAtTime", null, 2131742520, D0().p0().format(new Date(j2)), D0().o0().format(new Date(j2))));
            } else {
                return a0("LastSeenDateFormatted", null, 2131748828, a0("formatDateAtTime", null, 2131742520, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2))));
            }
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String x(long j, boolean z) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            if (i3 == i && i2 == i4 && z) {
                return a0(null, null, 2131743869, D0().o0().format(new Date(j2)));
            }
            if (i3 + 1 == i && i2 == i4 && z) {
                return a0(null, null, 2131742580, D0().o0().format(new Date(j2)));
            }
            if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                return a0(null, null, 2131742520, D0().g0().format(new Date(j2)), D0().o0().format(new Date(j2)));
            }
            return a0(null, null, 2131742520, D0().h0().format(new Date(j2)), D0().o0().format(new Date(j2)));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String y(float f, int i, Boolean bool) {
        String format;
        String format2;
        l();
        if (bool == null ? g0.booleanValue() : bool.booleanValue()) {
            float f2 = f * 3.28084f;
            if (f2 < 1000.0f) {
                if (i != 0) {
                    if (i != 1) {
                        return a0("FootsShort", null, 2131750584, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f2))));
                    }
                    return a0("FootsFromYou", null, 2131750585, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f2))));
                }
                return a0("FootsAway", null, 2131750586, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f2))));
            }
            int i2 = ((f2 % 5280.0f) > 0.0f ? 1 : ((f2 % 5280.0f) == 0.0f ? 0 : -1));
            float f3 = f2 / 5280.0f;
            if (i2 == 0) {
                format2 = String.format("%d", Integer.valueOf((int) f3));
            } else {
                format2 = String.format("%.2f", Float.valueOf(f3));
            }
            if (i != 0) {
                if (i != 1) {
                    return a0("MilesShort", null, 2131748235, format2);
                }
                return a0("MilesFromYou", null, 2131748236, format2);
            }
            return a0("MilesAway", null, 2131748237, format2);
        } else if (f < 1000.0f) {
            if (i != 0) {
                if (i != 1) {
                    return a0("MetersShort", null, 2131748250, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f))));
                }
                return a0("MetersFromYou2", null, 2131748251, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f))));
            }
            return a0("MetersAway2", null, 2131748252, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f))));
        } else {
            int i3 = ((f % 1000.0f) > 0.0f ? 1 : ((f % 1000.0f) == 0.0f ? 0 : -1));
            float f4 = f / 1000.0f;
            if (i3 == 0) {
                format = String.format("%d", Integer.valueOf((int) f4));
            } else {
                format = String.format("%.2f", Float.valueOf(f4));
            }
            if (i != 0) {
                if (i != 1) {
                    return a0("KMetersShort", null, 2131748869, format);
                }
                return a0("KMetersFromYou2", null, 2131748870, format);
            }
            return a0("KMetersAway2", null, 2131748871, format);
        }
    }

    public static String z(int i) {
        if (i <= 0) {
            return G(0, "Seconds", new Object[0]);
        }
        int i2 = i / 3600;
        int i3 = (i / 60) % 60;
        int i4 = i % 60;
        StringBuilder sb = new StringBuilder();
        if (i2 > 0) {
            sb.append(G(i2, "Hours", new Object[0]));
        }
        if (i3 > 0) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(G(i3, "Minutes", new Object[0]));
        }
        if (i4 > 0) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(G(i4, "Seconds", new Object[0]));
        }
        return sb.toString();
    }

    public final FastDateFormat A0() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.e = k(locale, O0(2131742497, "formatterWeekLong", null), "EEEE");
                }
            }
        }
        return this.e;
    }

    public final FastDateFormat B0() {
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.g = k(locale, O0(2131742496, "formatterYear", null), "dd.MM.yy");
                }
            }
        }
        return this.g;
    }

    public final FastDateFormat C0() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.h = k(locale, O0(2131742495, "formatterYearMax", null), "dd.MM.yyyy");
                }
            }
        }
        return this.h;
    }

    public final i96 F0(String str) {
        if (str == null) {
            return null;
        }
        return (i96) this.N.get(str.toLowerCase().replace("-", "_"));
    }

    public final HashMap G0(File file, boolean z, boolean z2, boolean z3) {
        FileInputStream fileInputStream;
        HashMap hashMap;
        FileInputStream fileInputStream2;
        XmlPullParser newPullParser;
        FileInputStream fileInputStream3 = null;
        try {
        } catch (Throwable th) {
            th = th;
            fileInputStream3 = fileInputStream;
        }
        try {
            try {
                if (!file.exists()) {
                    return new HashMap();
                }
                hashMap = new HashMap(10000);
                try {
                    newPullParser = Xml.newPullParser();
                    fileInputStream2 = new FileInputStream(file);
                } catch (Exception e) {
                    e = e;
                    fileInputStream2 = null;
                }
                try {
                    newPullParser.setInput(fileInputStream2, "UTF-8");
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                        if (eventType == 2) {
                            str2 = newPullParser.getName();
                            if (newPullParser.getAttributeCount() > 0) {
                                str = newPullParser.getAttributeValue(0);
                            }
                        } else if (eventType == 4) {
                            if (str != null && (str3 = newPullParser.getText()) != null) {
                                String trim = str3.trim();
                                if (z) {
                                    str3 = m(trim, false);
                                } else {
                                    String replace = trim.replace("\\n", "\n").replace("\\", "");
                                    str3 = replace.replace("&lt;", "<");
                                    if (z3 && !this.E && !str3.equals(replace)) {
                                        this.E = true;
                                        fa4.b("getLocaleFileStrings: value != old, reloadLastFile = true;");
                                    }
                                }
                            }
                        } else if (eventType == 3) {
                            str = null;
                            str2 = null;
                            str3 = null;
                        }
                        if (str2 != null && str2.equals("string") && str3 != null && str != null && str3.length() != 0 && str.length() != 0) {
                            hashMap.put(str, str3);
                            str = null;
                            str2 = null;
                            str3 = null;
                        }
                    }
                    try {
                        fileInputStream2.close();
                        return hashMap;
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        return hashMap;
                    }
                } catch (Exception e3) {
                    e = e3;
                    try {
                        File file2 = new File(a.h(), "malformed_locales/");
                        file2.mkdirs();
                        gl.E(file, new File(file2, file.getName()));
                    } catch (Exception unused) {
                    }
                    fa4.g(e, true);
                    if (z3) {
                        fa4.b("getLocaleFileStrings: error, reloadLastFile = true;");
                        this.E = true;
                    }
                    if (z2) {
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e4) {
                                fa4.g(e4, true);
                            }
                        }
                        return null;
                    }
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Exception e5) {
                            fa4.g(e5, true);
                        }
                    }
                    if (hashMap == null) {
                        return new HashMap();
                    }
                    return hashMap;
                }
            } catch (Exception e6) {
                e = e6;
                hashMap = null;
                fileInputStream2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream3 != null) {
                try {
                    fileInputStream3.close();
                } catch (Exception e7) {
                    fa4.g(e7, true);
                }
            }
            throw th;
        }
    }

    public final String O0(int i, String str, String str2) {
        String P0 = P0(i, str, str2);
        if (P0 == null) {
            return b00.h("LOC_ERR:", str);
        }
        return P0;
    }

    public final String P0(int i, String str, String str2) {
        Context context = a.b;
        boolean z = w01.a;
        String b = this.Y.b(i, context, str);
        if (b != null) {
            return b;
        }
        String a = this.Y.a(str2);
        if (a != null) {
            return a;
        }
        i();
        String b2 = this.W.b(i, context, str);
        if (b2 != null) {
            return b2;
        }
        return this.W.a(str2);
    }

    public final String R0(String str) {
        return S0(str, true, false);
    }

    public final String S0(String str, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        if (str == null) {
            return null;
        }
        if (this.H == null) {
            HashMap hashMap = new HashMap(33);
            this.H = hashMap;
            hashMap.put("а", "a");
            this.H.put("б", "b");
            this.H.put("в", "v");
            this.H.put("г", "g");
            this.H.put("д", "d");
            this.H.put("е", "e");
            obj7 = "g";
            this.H.put("ё", "yo");
            this.H.put("ж", "zh");
            this.H.put("з", "z");
            this.H.put("и", "i");
            this.H.put("й", "i");
            this.H.put("к", "k");
            this.H.put("л", "l");
            this.H.put("м", "m");
            this.H.put("н", "n");
            this.H.put("о", "o");
            this.H.put("п", "p");
            obj4 = "m";
            obj5 = "r";
            this.H.put("р", obj5);
            obj6 = "z";
            this.H.put("с", "s");
            obj = "v";
            this.H.put("т", "t");
            obj2 = "u";
            this.H.put("у", obj2);
            obj3 = "s";
            this.H.put("ф", "f");
            obj8 = "h";
            this.H.put("х", obj8);
            obj9 = "p";
            this.H.put("ц", "ts");
            this.H.put("ч", "ch");
            this.H.put("ш", "sh");
            this.H.put("щ", "sch");
            this.H.put("ы", "i");
            this.H.put("ь", "");
            this.H.put("ъ", "");
            this.H.put("э", "e");
            this.H.put("ю", "yu");
            this.H.put("я", "ya");
        } else {
            obj = "v";
            obj2 = "u";
            obj3 = "s";
            obj4 = "m";
            obj5 = "r";
            obj6 = "z";
            obj7 = "g";
            obj8 = "h";
            obj9 = "p";
        }
        if (this.G == null) {
            HashMap hashMap2 = new HashMap(488);
            this.G = hashMap2;
            hashMap2.put("ȼ", "c");
            this.G.put("ᶇ", "n");
            this.G.put("ɖ", "d");
            this.G.put("ỿ", "y");
            this.G.put("ᴓ", "o");
            this.G.put("ø", "o");
            this.G.put("ḁ", "a");
            this.G.put("ʯ", obj8);
            this.G.put("ŷ", "y");
            this.G.put("ʞ", "k");
            this.G.put("ừ", obj2);
            Object obj10 = obj2;
            this.G.put("ꜳ", "aa");
            this.G.put("ĳ", "ij");
            this.G.put("ḽ", "l");
            this.G.put("ɪ", "i");
            this.G.put("ḇ", "b");
            this.G.put("ʀ", obj5);
            this.G.put("ě", "e");
            this.G.put("ﬃ", "ffi");
            this.G.put("ơ", "o");
            this.G.put("ⱹ", obj5);
            this.G.put("ồ", "o");
            this.G.put("ǐ", "i");
            Object obj11 = obj9;
            this.G.put("ꝕ", obj11);
            this.G.put("ý", "y");
            this.G.put("ḝ", "e");
            this.G.put("ₒ", "o");
            this.G.put("ⱥ", "a");
            this.G.put("ʙ", "b");
            this.G.put("ḛ", "e");
            this.G.put("ƈ", "c");
            this.G.put("ɦ", obj8);
            this.G.put("ᵬ", "b");
            Object obj12 = obj8;
            Object obj13 = obj3;
            this.G.put("ṣ", obj13);
            this.G.put("đ", "d");
            this.G.put("ỗ", "o");
            this.G.put("ɟ", "j");
            this.G.put("ẚ", "a");
            this.G.put("ɏ", "y");
            this.G.put("ʌ", obj);
            this.G.put("ꝓ", obj11);
            this.G.put("ﬁ", "fi");
            this.G.put("ᶄ", "k");
            this.G.put("ḏ", "d");
            this.G.put("ᴌ", "l");
            this.G.put("ė", "e");
            this.G.put("ᴋ", "k");
            this.G.put("ċ", "c");
            this.G.put("ʁ", obj5);
            this.G.put("ƕ", "hv");
            this.G.put("ƀ", "b");
            this.G.put("ṍ", "o");
            this.G.put("ȣ", "ou");
            this.G.put("ǰ", "j");
            Object obj14 = obj7;
            this.G.put("ᶃ", obj14);
            this.G.put("ṋ", "n");
            this.G.put("ɉ", "j");
            this.G.put("ǧ", obj14);
            this.G.put("ǳ", "dz");
            Object obj15 = obj6;
            this.G.put("ź", obj15);
            this.G.put("ꜷ", "au");
            this.G.put("ǖ", obj10);
            this.G.put("ᵹ", obj14);
            this.G.put("ȯ", "o");
            this.G.put("ɐ", "a");
            this.G.put("ą", "a");
            this.G.put("õ", "o");
            this.G.put("ɻ", obj5);
            this.G.put("ꝍ", "o");
            this.G.put("ǟ", "a");
            this.G.put("ȴ", "l");
            this.G.put("ʂ", obj13);
            this.G.put("ﬂ", "fl");
            this.G.put("ȉ", "i");
            this.G.put("ⱻ", "e");
            this.G.put("ṉ", "n");
            this.G.put("ï", "i");
            this.G.put("ñ", "n");
            this.G.put("ᴉ", "i");
            this.G.put("ʇ", "t");
            this.G.put("ẓ", obj15);
            this.G.put("ỷ", "y");
            this.G.put("ȳ", "y");
            this.G.put("ṩ", obj13);
            this.G.put("ɽ", obj5);
            this.G.put("ĝ", obj14);
            this.G.put("ᴝ", obj10);
            this.G.put("ḳ", "k");
            this.G.put("ꝫ", "et");
            this.G.put("ī", "i");
            this.G.put("ť", "t");
            this.G.put("ꜿ", "c");
            this.G.put("ʟ", "l");
            this.G.put("ꜹ", "av");
            this.G.put("û", obj10);
            this.G.put("æ", "ae");
            this.G.put("ă", "a");
            this.G.put("ǘ", obj10);
            this.G.put("ꞅ", obj13);
            this.G.put("ᵣ", obj5);
            this.G.put("ᴀ", "a");
            this.G.put("ƃ", "b");
            this.G.put("ḩ", obj12);
            this.G.put("ṧ", obj13);
            this.G.put("ₑ", "e");
            this.G.put("ʜ", obj12);
            this.G.put("ẋ", "x");
            this.G.put("ꝅ", "k");
            this.G.put("ḋ", "d");
            this.G.put("ƣ", "oi");
            this.G.put("ꝑ", obj11);
            this.G.put("ħ", obj12);
            Object obj16 = obj;
            this.G.put("ⱴ", obj16);
            this.G.put("ẇ", "w");
            this.G.put("ǹ", "n");
            Object obj17 = obj4;
            this.G.put("ɯ", obj17);
            this.G.put("ɡ", obj14);
            this.G.put("ɴ", "n");
            this.G.put("ᴘ", obj11);
            this.G.put("ᵥ", obj16);
            this.G.put("ū", obj10);
            this.G.put("ḃ", "b");
            this.G.put("ṗ", obj11);
            this.G.put("å", "a");
            this.G.put("ɕ", "c");
            this.G.put("ọ", "o");
            this.G.put("ắ", "a");
            this.G.put("ƒ", "f");
            this.G.put("ǣ", "ae");
            this.G.put("ꝡ", "vy");
            this.G.put("ﬀ", "ff");
            this.G.put("ᶉ", obj5);
            this.G.put("ô", "o");
            this.G.put("ǿ", "o");
            this.G.put("ṳ", obj10);
            this.G.put("ȥ", obj15);
            this.G.put("ḟ", "f");
            this.G.put("ḓ", "d");
            this.G.put("ȇ", "e");
            this.G.put("ȕ", obj10);
            this.G.put("ȵ", "n");
            this.G.put("ʠ", "q");
            this.G.put("ấ", "a");
            this.G.put("ǩ", "k");
            this.G.put("ĩ", "i");
            this.G.put("ṵ", obj10);
            this.G.put("ŧ", "t");
            this.G.put("ɾ", obj5);
            this.G.put("ƙ", "k");
            this.G.put("ṫ", "t");
            this.G.put("ꝗ", "q");
            this.G.put("ậ", "a");
            this.G.put("ʄ", "j");
            this.G.put("ƚ", "l");
            this.G.put("ᶂ", "f");
            this.G.put("ᵴ", obj13);
            this.G.put("ꞃ", obj5);
            this.G.put("ᶌ", obj16);
            this.G.put("ɵ", "o");
            this.G.put("ḉ", "c");
            this.G.put("ᵤ", obj10);
            this.G.put("ẑ", obj15);
            this.G.put("ṹ", obj10);
            this.G.put("ň", "n");
            this.G.put("ʍ", "w");
            this.G.put("ầ", "a");
            this.G.put("ǉ", "lj");
            this.G.put("ɓ", "b");
            this.G.put("ɼ", obj5);
            this.G.put("ò", "o");
            this.G.put("ẘ", "w");
            this.G.put("ɗ", "d");
            this.G.put("ꜽ", "ay");
            this.G.put("ư", obj10);
            this.G.put("ᶀ", "b");
            this.G.put("ǜ", obj10);
            this.G.put("ẹ", "e");
            this.G.put("ǡ", "a");
            this.G.put("ɥ", obj12);
            this.G.put("ṏ", "o");
            this.G.put("ǔ", obj10);
            this.G.put("ʎ", "y");
            this.G.put("ȱ", "o");
            this.G.put("ệ", "e");
            this.G.put("ế", "e");
            this.G.put("ĭ", "i");
            this.G.put("ⱸ", "e");
            this.G.put("ṯ", "t");
            this.G.put("ᶑ", "d");
            this.G.put("ḧ", obj12);
            this.G.put("ṥ", obj13);
            this.G.put("ë", "e");
            this.G.put("ᴍ", obj17);
            this.G.put("ö", "o");
            this.G.put("é", "e");
            this.G.put("ı", "i");
            this.G.put("ď", "d");
            this.G.put("ᵯ", obj17);
            this.G.put("ỵ", "y");
            this.G.put("ŵ", "w");
            this.G.put("ề", "e");
            this.G.put("ứ", obj10);
            this.G.put("ƶ", obj15);
            this.G.put("ĵ", "j");
            this.G.put("ḍ", "d");
            this.G.put("ŭ", obj10);
            this.G.put("ʝ", "j");
            this.G.put("ê", "e");
            this.G.put("ǚ", obj10);
            this.G.put("ġ", obj14);
            this.G.put("ṙ", obj5);
            this.G.put("ƞ", "n");
            this.G.put("ḗ", "e");
            this.G.put("ẝ", obj13);
            this.G.put("ᶁ", "d");
            this.G.put("ķ", "k");
            this.G.put("ᴂ", "ae");
            this.G.put("ɘ", "e");
            this.G.put("ợ", "o");
            this.G.put("ḿ", obj17);
            this.G.put("ꜰ", "f");
            this.G.put("ẵ", "a");
            this.G.put("ꝏ", "oo");
            this.G.put("ᶆ", obj17);
            this.G.put("ᵽ", obj11);
            this.G.put("ữ", obj10);
            this.G.put("ⱪ", "k");
            this.G.put("ḥ", obj12);
            this.G.put("ţ", "t");
            this.G.put("ᵱ", obj11);
            this.G.put("ṁ", obj17);
            this.G.put("á", "a");
            this.G.put("ᴎ", "n");
            this.G.put("ꝟ", obj16);
            this.G.put("è", "e");
            this.G.put("ᶎ", obj15);
            this.G.put("ꝺ", "d");
            this.G.put("ᶈ", obj11);
            this.G.put("ɫ", "l");
            this.G.put("ᴢ", obj15);
            this.G.put("ɱ", obj17);
            this.G.put("ṝ", obj5);
            this.G.put("ṽ", obj16);
            this.G.put("ũ", obj10);
            this.G.put("ß", "ss");
            this.G.put("ĥ", obj12);
            this.G.put("ᵵ", "t");
            this.G.put("ʐ", obj15);
            this.G.put("ṟ", obj5);
            this.G.put("ɲ", "n");
            this.G.put("à", "a");
            this.G.put("ẙ", "y");
            this.G.put("ỳ", "y");
            this.G.put("ᴔ", "oe");
            this.G.put("ₓ", "x");
            this.G.put("ȗ", obj10);
            this.G.put("ⱼ", "j");
            this.G.put("ẫ", "a");
            this.G.put("ʑ", obj15);
            this.G.put("ẛ", obj13);
            this.G.put("ḭ", "i");
            Object obj18 = obj5;
            this.G.put("ꜵ", "ao");
            this.G.put("ɀ", obj15);
            this.G.put("ÿ", "y");
            this.G.put("ǝ", "e");
            this.G.put("ǭ", "o");
            this.G.put("ᴅ", "d");
            this.G.put("ᶅ", "l");
            this.G.put("ù", obj10);
            this.G.put("ạ", "a");
            this.G.put("ḅ", "b");
            this.G.put("ụ", obj10);
            this.G.put("ằ", "a");
            this.G.put("ᴛ", "t");
            this.G.put("ƴ", "y");
            this.G.put("ⱦ", "t");
            this.G.put("ⱡ", "l");
            this.G.put("ȷ", "j");
            this.G.put("ᵶ", obj15);
            this.G.put("ḫ", obj12);
            this.G.put("ⱳ", "w");
            this.G.put("ḵ", "k");
            this.G.put("ờ", "o");
            this.G.put("î", "i");
            this.G.put("ģ", obj14);
            this.G.put("ȅ", "e");
            this.G.put("ȧ", "a");
            this.G.put("ẳ", "a");
            this.G.put("ɋ", "q");
            this.G.put("ṭ", "t");
            this.G.put("ꝸ", "um");
            this.G.put("ᴄ", "c");
            this.G.put("ẍ", "x");
            this.G.put("ủ", obj10);
            this.G.put("ỉ", "i");
            this.G.put("ᴚ", obj18);
            this.G.put("ś", obj13);
            this.G.put("ꝋ", "o");
            this.G.put("ỹ", "y");
            this.G.put("ṡ", obj13);
            this.G.put("ǌ", "nj");
            this.G.put("ȁ", "a");
            this.G.put("ẗ", "t");
            this.G.put("ĺ", "l");
            this.G.put("ž", obj15);
            this.G.put("ᵺ", "th");
            this.G.put("ƌ", "d");
            this.G.put("ș", obj13);
            this.G.put("š", obj13);
            this.G.put("ᶙ", obj10);
            this.G.put("ẽ", "e");
            this.G.put("ẜ", obj13);
            this.G.put("ɇ", "e");
            this.G.put("ṷ", obj10);
            this.G.put("ố", "o");
            this.G.put("ȿ", obj13);
            this.G.put("ᴠ", obj16);
            this.G.put("ꝭ", "is");
            this.G.put("ᴏ", "o");
            this.G.put("ɛ", "e");
            this.G.put("ǻ", "a");
            this.G.put("ﬄ", "ffl");
            this.G.put("ⱺ", "o");
            this.G.put("ȋ", "i");
            this.G.put("ᵫ", "ue");
            this.G.put("ȡ", "d");
            this.G.put("ⱬ", obj15);
            this.G.put("ẁ", "w");
            this.G.put("ᶏ", "a");
            this.G.put("ꞇ", "t");
            this.G.put("ğ", obj14);
            this.G.put("ɳ", "n");
            this.G.put("ʛ", obj14);
            this.G.put("ᴜ", obj10);
            this.G.put("ẩ", "a");
            this.G.put("ṅ", "n");
            this.G.put("ɨ", "i");
            this.G.put("ᴙ", obj18);
            this.G.put("ǎ", "a");
            this.G.put("ſ", obj13);
            this.G.put("ȫ", "o");
            this.G.put("ɿ", obj18);
            this.G.put("ƭ", "t");
            this.G.put("ḯ", "i");
            this.G.put("ǽ", "ae");
            this.G.put("ⱱ", obj16);
            this.G.put("ɶ", "oe");
            this.G.put("ṃ", obj17);
            this.G.put("ż", obj15);
            this.G.put("ĕ", "e");
            this.G.put("ꜻ", "av");
            this.G.put("ở", "o");
            this.G.put("ễ", "e");
            this.G.put("ɬ", "l");
            this.G.put("ị", "i");
            this.G.put("ᵭ", "d");
            this.G.put("ﬆ", "st");
            this.G.put("ḷ", "l");
            this.G.put("ŕ", obj18);
            this.G.put("ᴕ", "ou");
            this.G.put("ʈ", "t");
            this.G.put("ā", "a");
            this.G.put("ḙ", "e");
            this.G.put("ᴑ", "o");
            this.G.put("ç", "c");
            this.G.put("ᶊ", obj13);
            this.G.put("ặ", "a");
            this.G.put("ų", obj10);
            this.G.put("ả", "a");
            this.G.put("ǥ", obj14);
            this.G.put("ꝁ", "k");
            this.G.put("ẕ", obj15);
            this.G.put("ŝ", obj13);
            this.G.put("ḕ", "e");
            this.G.put("ɠ", obj14);
            this.G.put("ꝉ", "l");
            this.G.put("ꝼ", "f");
            this.G.put("ᶍ", "x");
            this.G.put("ǒ", "o");
            this.G.put("ę", "e");
            this.G.put("ổ", "o");
            this.G.put("ƫ", "t");
            this.G.put("ǫ", "o");
            this.G.put("i̇", "i");
            this.G.put("ṇ", "n");
            this.G.put("ć", "c");
            this.G.put("ᵷ", obj14);
            this.G.put("ẅ", "w");
            this.G.put("ḑ", "d");
            this.G.put("ḹ", "l");
            this.G.put("œ", "oe");
            this.G.put("ᵳ", obj18);
            this.G.put("ļ", "l");
            this.G.put("ȑ", obj18);
            this.G.put("ȭ", "o");
            this.G.put("ᵰ", "n");
            this.G.put("ᴁ", "ae");
            this.G.put("ŀ", "l");
            this.G.put("ä", "a");
            this.G.put("ƥ", obj11);
            this.G.put("ỏ", "o");
            this.G.put("į", "i");
            this.G.put("ȓ", obj18);
            this.G.put("ǆ", "dz");
            this.G.put("ḡ", obj14);
            this.G.put("ṻ", obj10);
            this.G.put("ō", "o");
            this.G.put("ľ", "l");
            this.G.put("ẃ", "w");
            this.G.put("ț", "t");
            this.G.put("ń", "n");
            this.G.put("ɍ", obj18);
            this.G.put("ȃ", "a");
            this.G.put("ü", obj10);
            this.G.put("ꞁ", "l");
            this.G.put("ᴐ", "o");
            this.G.put("ớ", "o");
            this.G.put("ᴃ", "b");
            this.G.put("ɹ", obj18);
            this.G.put("ᵲ", obj18);
            this.G.put("ʏ", "y");
            this.G.put("ᵮ", "f");
            this.G.put("ⱨ", obj12);
            this.G.put("ŏ", "o");
            this.G.put("ú", obj10);
            this.G.put("ṛ", obj18);
            this.G.put("ʮ", obj12);
            this.G.put("ó", "o");
            this.G.put("ů", obj10);
            this.G.put("ỡ", "o");
            this.G.put("ṕ", obj11);
            this.G.put("ᶖ", "i");
            this.G.put("ự", obj10);
            this.G.put("ã", "a");
            this.G.put("ᵢ", "i");
            this.G.put("ṱ", "t");
            this.G.put("ể", "e");
            this.G.put("ử", obj10);
            this.G.put("í", "i");
            this.G.put("ɔ", "o");
            this.G.put("ɺ", obj18);
            this.G.put("ɢ", obj14);
            this.G.put("ř", obj18);
            this.G.put("ẖ", obj12);
            this.G.put("ű", obj10);
            this.G.put("ȍ", "o");
            this.G.put("ḻ", "l");
            this.G.put("ḣ", obj12);
            this.G.put("ȶ", "t");
            this.G.put("ņ", "n");
            this.G.put("ᶒ", "e");
            this.G.put("ì", "i");
            this.G.put("ẉ", "w");
            this.G.put("ē", "e");
            this.G.put("ᴇ", "e");
            this.G.put("ł", "l");
            this.G.put("ộ", "o");
            this.G.put("ɭ", "l");
            this.G.put("ẏ", "y");
            this.G.put("ᴊ", "j");
            this.G.put("ḱ", "k");
            this.G.put("ṿ", obj16);
            this.G.put("ȩ", "e");
            this.G.put("â", "a");
            this.G.put("ş", obj13);
            this.G.put("ŗ", obj18);
            this.G.put("ʋ", obj16);
            this.G.put("ₐ", "a");
            this.G.put("ↄ", "c");
            this.G.put("ᶓ", "e");
            this.G.put("ɰ", obj17);
            this.G.put("ᴡ", "w");
            this.G.put("ȏ", "o");
            this.G.put("č", "c");
            this.G.put("ǵ", obj14);
            this.G.put("ĉ", "c");
            this.G.put("ᶗ", "o");
            this.G.put("ꝃ", "k");
            this.G.put("ꝙ", "q");
            this.G.put("ṑ", "o");
            this.G.put("ꜱ", obj13);
            this.G.put("ṓ", "o");
            this.G.put("ȟ", obj12);
            this.G.put("ő", "o");
            this.G.put("ꜩ", "tz");
            this.G.put("ẻ", "e");
            this.G.put("і", "i");
            this.G.put("ї", "i");
        }
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int i = 0;
        boolean z3 = false;
        while (i < length) {
            int i2 = i + 1;
            String substring = str.substring(i, i2);
            if (z2) {
                String lowerCase = substring.toLowerCase();
                z3 = !substring.equals(lowerCase);
                substring = lowerCase;
            }
            String str2 = (String) this.G.get(substring);
            if (str2 == null && z) {
                str2 = (String) this.H.get(substring);
            }
            if (str2 != null) {
                if (z2 && z3) {
                    if (str2.length() > 1) {
                        str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                    } else {
                        str2 = str2.toUpperCase();
                    }
                }
                sb.append(str2);
            } else {
                if (z2) {
                    char charAt = substring.charAt(0);
                    if ((charAt < 'a' || charAt > 'z' || charAt < '0' || charAt > '9') && charAt != ' ' && charAt != '\'' && charAt != ',' && charAt != '.' && charAt != '&' && charAt != '-' && charAt != '/') {
                        return null;
                    }
                    if (z3) {
                        substring = substring.toUpperCase();
                    }
                }
                sb.append(substring);
            }
            i = i2;
        }
        return sb.toString();
    }

    public final void V0(int i, boolean z) {
        if (this.I) {
            return;
        }
        this.I = true;
        ConnectionsManager.getInstance(i).sendRequest(new TLRPC.TL_langpack_getLanguages(), new c45(this, z, i), 8);
    }

    public final void W0(Configuration configuration) {
        if (this.D) {
            return;
        }
        c0 = DateFormat.is24HourFormat(a.b);
        Locale locale = configuration.locale;
        this.z = locale;
        if (this.C != null) {
            i96 i96Var = this.B;
            this.B = null;
            d(i96Var, false, false, y6c.t0);
        } else if (locale != null) {
            String displayName = locale.getDisplayName();
            String displayName2 = this.y.getDisplayName();
            if (displayName != null && displayName2 != null && !displayName.equals(displayName2)) {
                Y0();
            }
            this.y = locale;
            i96 i96Var2 = this.B;
            if (i96Var2 != null && !TextUtils.isEmpty(i96Var2.f)) {
                this.A = (j96) this.x.get(this.B.f);
            }
            if (this.A == null) {
                j96 j96Var = (j96) this.x.get(this.y.getLanguage());
                this.A = j96Var;
                if (j96Var == null) {
                    this.A = (j96) this.x.get("en");
                }
            }
        }
        String Q0 = Q0();
        String str = this.F;
        if (str != null && !Q0.equals(str)) {
            this.F = Q0;
            ConnectionsManager.setSystemLangCode(Q0);
        }
        i();
    }

    public final void Y0() {
        i96 i96Var;
        boolean z;
        Locale locale = this.y;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        if (language == null) {
            language = "en";
        }
        String lowerCase = language.toLowerCase();
        int i = 0;
        byte b = 2;
        if ((lowerCase.length() != 2 || (!lowerCase.equals("ar") && !lowerCase.equals("fa") && !lowerCase.equals("he") && !lowerCase.equals("iw"))) && !lowerCase.startsWith("ar_") && !lowerCase.startsWith("fa_") && !lowerCase.startsWith("he_") && !lowerCase.startsWith("iw_") && ((i96Var = this.B) == null || !i96Var.g)) {
            z = false;
        } else {
            z = true;
        }
        a0 = z;
        if (!lowerCase.equals("ko")) {
            b = 1;
        }
        b0 = b;
        this.t = null;
        this.s = null;
        this.u = null;
        this.v = null;
        this.q = null;
        this.r = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.l = null;
        this.n = null;
        this.d = null;
        this.e = null;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.i = null;
        this.j = null;
        this.k = null;
        while (true) {
            FastDateFormat[] fastDateFormatArr = this.w;
            if (i < fastDateFormatArr.length) {
                fastDateFormatArr[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    public final void Z0(int i, String str, boolean z, b96 b96Var) {
        if (str != null) {
            str = str.replace("-", "_");
        }
        String str2 = str;
        if (str2 != null) {
            i96 i96Var = this.B;
            if (i96Var != null) {
                if (!str2.equals(i96Var.c) && !str2.equals(this.B.e)) {
                    return;
                }
            } else {
                return;
            }
        }
        f(this.B, str2, z, i, b96Var);
    }

    public final void a1() {
        SharedPreferences.Editor edit = a.b.getSharedPreferences("langconfig", 0).edit();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.O.size(); i++) {
            String f = ((i96) this.O.get(i)).f();
            if (sb.length() != 0) {
                sb.append("&");
            }
            sb.append(f);
        }
        edit.putString("locales", sb.toString());
        sb.setLength(0);
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            String f2 = ((i96) this.L.get(i2)).f();
            if (sb.length() != 0) {
                sb.append("&");
            }
            sb.append(f2);
        }
        edit.putString("remote", sb.toString());
        sb.setLength(0);
        for (int i3 = 0; i3 < this.K.size(); i3++) {
            String f3 = ((i96) this.K.get(i3)).f();
            if (sb.length() != 0) {
                sb.append("&");
            }
            sb.append(f3);
        }
        edit.putString("unofficial", sb.toString());
        edit.commit();
    }

    public final void b(String[] strArr, j96 j96Var) {
        for (String str : strArr) {
            this.x.put(str, j96Var);
        }
    }

    public final void b1(final i96 i96Var, final TLRPC.TL_langPackDifference tL_langPackDifference, final int i, final boolean z, final Runnable runnable) {
        boolean z2;
        int i2;
        int i3;
        String str;
        int i4;
        File d;
        final File e;
        boolean z3 = true;
        if (tL_langPackDifference != null && !tL_langPackDifference.strings.isEmpty() && i96Var != null && !i96Var.h()) {
            final int k0 = k0(i96Var, tL_langPackDifference);
            if (k0 == -1) {
                fa4.b("saveRemoteLocaleStrings: unknown language " + tL_langPackDifference.lang_code + " (locale short=" + i96Var.c + ", base=" + i96Var.e + ")");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (k0 == 0) {
                str = i96Var.c;
                i4 = i96Var.h;
                d = i96Var.e();
            } else {
                str = i96Var.e;
                i4 = i96Var.i;
                d = i96Var.d();
            }
            final String str2 = str;
            final File file = d;
            final int i5 = i4;
            if (file == null) {
                de9.s(tL_langPackDifference.lang_code, new StringBuilder("saveRemoteLocaleStrings: no file for "));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (!i96Var.g()) {
                e = null;
            } else if (k0 == 0) {
                e = i96Var.d();
            } else {
                e = i96Var.e();
            }
            do3 do3Var = this.R;
            if (do3Var == null) {
                do3Var = new do3("langpackQueue", true);
                this.R = do3Var;
            }
            do3Var.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.e96.run():void");
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder("saveRemoteLocaleStrings: empty difference=");
        if (tL_langPackDifference != null && !tL_langPackDifference.strings.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        sb.append(z2);
        sb.append("; locale is local or null=");
        if (i96Var != null && !i96Var.h()) {
            z3 = false;
        }
        sb.append(z3);
        fa4.b(sb.toString());
        if (tL_langPackDifference != null && i96Var != null && !i96Var.h() && tL_langPackDifference.from_version != 0) {
            int k02 = k0(i96Var, tL_langPackDifference);
            if (k02 == 0) {
                i2 = i96Var.h;
            } else {
                i2 = i96Var.i;
            }
            if (k02 != -1 && tL_langPackDifference.from_version <= i2 && i2 < (i3 = tL_langPackDifference.version)) {
                if (k02 == 0) {
                    i96Var.h = i3;
                } else {
                    i96Var.i = i3;
                }
                a1();
            }
        }
        Y0();
        kk7.e().k(kk7.z4, new Object[0]);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final int c(defpackage.i96 r23, boolean r24, boolean r25, boolean r26, boolean r27, int r28, defpackage.mn6 r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k96.c(i96, boolean, boolean, boolean, boolean, int, mn6):int");
    }

    public final boolean c1(String str) {
        int i;
        int f = na7.q1(y6c.t0).k4.t1.f();
        if (f > 0) {
            SharedPreferences c1 = na7.c1();
            if (!c1.getBoolean("lngpack_patched_" + str, false) && (i = this.Z) < f) {
                fa4.d("reinstalling " + str + " langpack because of patch (" + i + " keys, must be at least " + f + ")");
                X0(str);
                return true;
            }
        }
        return false;
    }

    public final void d(i96 i96Var, boolean z, boolean z2, int i) {
        c(i96Var, z, z2, false, false, i, null);
    }

    public final h96 d1(String str, boolean z, int i, sx5 sx5Var) {
        boolean z2;
        String str2;
        HashMap hashMap = this.T;
        h96 h96Var = (h96) hashMap.get(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (h96Var != null && elapsedRealtime - h96Var.b >= 300000) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (h96Var != null && !z2 && (h96Var.a || !z)) {
            StringBuilder p = ug8.p("applyRemoteLanguage ", str, " is already loading");
            if (h96Var.a) {
                str2 = " the whole langpack";
            } else {
                str2 = "";
            }
            p.append(str2);
            p.append(", wait for it");
            fa4.b(p.toString());
            h96Var.e.add(sx5Var);
            return null;
        }
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList();
        obj.e = arrayList;
        obj.a = z;
        obj.b = elapsedRealtime;
        obj.d = i;
        if (z2) {
            arrayList.addAll(h96Var.e);
            h96Var.e.clear();
        }
        hashMap.put(str, obj);
        return obj;
    }

    public final boolean e(File file, int i) {
        try {
            HashMap G0 = G0(file, false, false, true);
            String str = (String) G0.get("LanguageName");
            String str2 = (String) G0.get("LanguageNameInEnglish");
            String str3 = (String) G0.get("LanguageCode");
            if (str != null && str.length() > 0 && str2 != null && str2.length() > 0 && str3 != null && str3.length() > 0 && !str.contains("&") && !str.contains("|") && !str2.contains("&") && !str2.contains("|") && !str3.contains("&") && !str3.contains("|") && !str3.contains("/") && !str3.contains("\\")) {
                File file2 = new File(a.h(), str3.concat(".xml"));
                if (gl.E(file, file2)) {
                    i96 F0 = F0("local_" + str3.toLowerCase());
                    i96 i96Var = F0;
                    if (F0 == null) {
                        ?? obj = new Object();
                        obj.a = str;
                        obj.b = str2;
                        String lowerCase = str3.toLowerCase();
                        obj.c = lowerCase;
                        obj.f = lowerCase;
                        obj.d = file2.getAbsolutePath();
                        this.J.add(obj);
                        this.N.put(obj.b(), obj);
                        this.O.add(obj);
                        a1();
                        i96Var = obj;
                    }
                    ?? obj2 = new Object();
                    obj2.a(G0);
                    this.Y = new r96(obj2);
                    this.Z = h(G0);
                    c(i96Var, true, false, true, false, i, null);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            fa4.g(e, true);
            return false;
        }
    }

    public final int f(final defpackage.i96 r19, java.lang.String r20, boolean r21, final int r22, java.lang.Runnable r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k96.f(i96, java.lang.String, boolean, int, java.lang.Runnable):int");
    }

    public final FastDateFormat g0() {
        if (this.l == null) {
            synchronized (this) {
                if (this.l == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.l = k(locale, O0(2131742523, "chatDate", null), "d MMMM");
                }
            }
        }
        return this.l;
    }

    public final FastDateFormat h0() {
        if (this.n == null) {
            synchronized (this) {
                if (this.n == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.n = k(locale, O0(2131742521, "chatFullDate", null), "d MMMM yyyy");
                }
            }
        }
        return this.n;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k96.i():void");
    }

    public final void j(int i) {
        i96 i96Var = this.B;
        if (i96Var != null && !this.P && c1(i96Var.c)) {
            if (w01.a) {
                fa4.b("reload locale because locale file is not enough");
            }
            gl.c3(new a96(this, i, (byte) 2));
        }
    }

    public final FastDateFormat l0() {
        String O0;
        String str;
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    if (c0) {
                        O0 = O0(2131742516, "formatterBannedUntil24H", null);
                    } else {
                        O0 = O0(2131742517, "formatterBannedUntil12H", null);
                    }
                    if (c0) {
                        str = "MMM dd yyyy, HH:mm";
                    } else {
                        str = "MMM dd yyyy, h:mm a";
                    }
                    this.j = k(locale, O0, str);
                }
            }
        }
        return this.j;
    }

    public final FastDateFormat m0() {
        String O0;
        String str;
        if (this.k == null) {
            synchronized (this) {
                if (this.k == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    if (c0) {
                        O0 = O0(2131742514, "formatterBannedUntilThisYear24H", null);
                    } else {
                        O0 = O0(2131742515, "formatterBannedUntilThisYear12H", null);
                    }
                    if (c0) {
                        str = "MMM dd, HH:mm";
                    } else {
                        str = "MMM dd, h:mm a";
                    }
                    this.k = k(locale, O0, str);
                }
            }
        }
        return this.k;
    }

    public final FastDateFormat n0() {
        if (this.t == null) {
            synchronized (this) {
                if (this.t == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.t = k(locale, O0(2131742513, "formatterBoostExpired", null), "MMM dd, yyyy");
                }
            }
        }
        return this.t;
    }

    public final FastDateFormat o0() {
        String O0;
        String str;
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    String language = locale.getLanguage();
                    if (language == null) {
                        language = "en";
                    }
                    String lowerCase = language.toLowerCase();
                    if (!lowerCase.toLowerCase().equals("ar") && !lowerCase.toLowerCase().equals("ko")) {
                        locale = Locale.US;
                    }
                    if (c0) {
                        O0 = O0(2131742511, "formatterDay24H", null);
                    } else {
                        O0 = O0(2131742512, "formatterDay12H", null);
                    }
                    if (c0) {
                        str = "HH:mm";
                    } else {
                        str = "h:mm a";
                    }
                    this.a = k(locale, O0, str);
                }
            }
        }
        return this.a;
    }

    public final String p(long j, String str) {
        return q(j, true, true, false, str);
    }

    public final FastDateFormat p0() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.f = k(locale, O0(2131742505, "formatterMonth", null), "dd MMM");
                }
            }
        }
        return this.f;
    }

    public final String q(long j, boolean z, boolean z2, boolean z3, String str) {
        boolean z4;
        double d;
        int length;
        String upperCase = str.toUpperCase();
        if (j < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        long abs = Math.abs(j);
        Currency currency = Currency.getInstance(upperCase);
        upperCase.getClass();
        char c = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c = 29;
                    break;
                }
                break;
            case 87254:
                if (upperCase.equals("XTR")) {
                    c = 30;
                    break;
                }
                break;
        }
        String str2 = " %.2f";
        String str3 = " %.0f";
        switch (c) {
            case 0:
            case '\b':
            case 11:
            case 15:
            case 16:
            case 19:
            case 22:
                d = abs / 1000.0d;
                str2 = " %.3f";
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\n':
            case '\f':
            case '\r':
            case 14:
            case 17:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                d = abs;
                str2 = " %.0f";
                break;
            case 3:
                d = abs / 10000.0d;
                str2 = " %.4f";
                break;
            case '\t':
                double d2 = ((float) abs) / 100.0f;
                if (z && abs % 100 == 0) {
                    str2 = " %.0f";
                }
                d = d2;
                break;
            case 18:
                d = abs / 10.0d;
                str2 = " %.1f";
                break;
            default:
                d = abs / 100.0d;
                break;
        }
        if (z2) {
            str3 = str2;
        }
        String str4 = "";
        if (currency != null) {
            Locale locale = this.y;
            if (locale == null) {
                locale = this.z;
            }
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
            currencyInstance.setCurrency(currency);
            if (z3) {
                currencyInstance.setGroupingUsed(false);
            }
            if (!z2 || (z && upperCase.equals("IRR"))) {
                currencyInstance.setMaximumFractionDigits(0);
            }
            if (z4) {
                str4 = "-";
            }
            String str5 = str4 + currencyInstance.format(d);
            int indexOf = str5.indexOf(upperCase);
            if (indexOf >= 0 && (length = upperCase.length() + indexOf) < str5.length() && str5.charAt(length) != ' ') {
                return str5.substring(0, length) + " " + str5.substring(length);
            }
            return str5;
        }
        if (z4) {
            str4 = "-";
        }
        return str4.concat(String.format(Locale.US, upperCase.concat(str3), Double.valueOf(d)));
    }

    public final FastDateFormat q0() {
        String O0;
        String str;
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    String language = locale.getLanguage();
                    if (language == null) {
                        language = "en";
                    }
                    String lowerCase = language.toLowerCase();
                    if (!lowerCase.toLowerCase().equals("ar") && !lowerCase.toLowerCase().equals("ko")) {
                        locale = Locale.US;
                    }
                    if (c0) {
                        O0 = O0(2131742509, "formatterDayWithSeconds24H", null);
                    } else {
                        O0 = O0(2131742510, "formatterDayWithSeconds12H", null);
                    }
                    if (c0) {
                        str = "HH:mm:ss";
                    } else {
                        str = "h:mm:ss a";
                    }
                    this.b = k(locale, O0, str);
                }
            }
        }
        return this.b;
    }

    public final FastDateFormat r0() {
        if (this.s == null) {
            synchronized (this) {
                if (this.s == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.s = k(locale, O0(2131742508, "formatterGiveawayCard", null), "dd MMM yyyy");
                }
            }
        }
        return this.s;
    }

    public final FastDateFormat s0() {
        if (this.u == null) {
            synchronized (this) {
                if (this.u == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.u = k(locale, O0(2131742507, "formatterGiveawayMonthDay", null), "MMMM dd");
                }
            }
        }
        return this.u;
    }

    public final FastDateFormat t0() {
        if (this.v == null) {
            synchronized (this) {
                if (this.v == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.v = k(locale, O0(2131742506, "formatterGiveawayMonthDayYear", null), "MMMM dd, yyyy");
                }
            }
        }
        return this.v;
    }

    public final FastDateFormat u0() {
        if (this.q == null) {
            synchronized (this) {
                if (this.q == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.q = k(locale, O0(2131742502, "formatterMonthYear", null), "MMM yyyy");
                }
            }
        }
        return this.q;
    }

    public final FastDateFormat v0() {
        if (this.o == null) {
            synchronized (this) {
                if (this.o == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.o = k(locale, O0(2131742519, "formatDateSchedule", null), "MMM d");
                }
            }
        }
        return this.o;
    }

    public final FastDateFormat w0(int i) {
        if (i >= 0) {
            FastDateFormat[] fastDateFormatArr = this.w;
            if (i < fastDateFormatArr.length) {
                if (fastDateFormatArr[i] == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    switch (i) {
                        case 0:
                            fastDateFormatArr[i] = k(locale, O0(2131745395, "SendTodayAt", null), "'Send today at' HH:mm");
                            break;
                        case 1:
                            fastDateFormatArr[i] = k(locale, O0(2131745437, "SendDayAt", null), "'Send on' MMM d 'at' HH:mm");
                            break;
                        case 2:
                            fastDateFormatArr[i] = k(locale, O0(2131745436, "SendDayYearAt", null), "'Send on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 3:
                            fastDateFormatArr[i] = k(locale, O0(2131746130, "RemindTodayAt", null), "'Remind today at' HH:mm");
                            break;
                        case 4:
                            fastDateFormatArr[i] = k(locale, O0(2131746132, "RemindDayAt", null), "'Remind on' MMM d 'at' HH:mm");
                            break;
                        case 5:
                            fastDateFormatArr[i] = k(locale, O0(2131746131, "RemindDayYearAt", null), "'Remind on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 6:
                            fastDateFormatArr[i] = k(locale, O0(2131744668, "StartTodayAt", null), "'Start today at' HH:mm");
                            break;
                        case 7:
                            fastDateFormatArr[i] = k(locale, O0(2131744677, "StartDayAt", null), "'Start on' MMM d 'at' HH:mm");
                            break;
                        case 8:
                            fastDateFormatArr[i] = k(locale, O0(2131744676, "StartDayYearAt", null), "'Start on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 9:
                            fastDateFormatArr[i] = k(locale, O0(2131744671, "StartShortTodayAt", null), "'Today,' HH:mm");
                            break;
                        case 10:
                            fastDateFormatArr[i] = k(locale, O0(2131744673, "StartShortDayAt", null), "MMM d',' HH:mm");
                            break;
                        case 11:
                            fastDateFormatArr[i] = k(locale, O0(2131744672, "StartShortDayYearAt", null), "MMM d yyyy, HH:mm");
                            break;
                        case 12:
                            fastDateFormatArr[i] = k(locale, O0(2131744660, "StartsTodayAt", null), "'Starts today at' HH:mm");
                            break;
                        case 13:
                            fastDateFormatArr[i] = k(locale, O0(2131744662, "StartsDayAt", null), "'Starts on' MMM d 'at' HH:mm");
                            break;
                        case 14:
                            fastDateFormatArr[i] = k(locale, O0(2131744661, "StartsDayYearAt", null), "'Starts on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 15:
                            fastDateFormatArr[i] = k(locale, O0(2131746384, "PublishTodayAt", null), "'Publish today at' HH:mm");
                            break;
                        case 16:
                            fastDateFormatArr[i] = k(locale, O0(2131746386, "PublishDayAt", null), "'Publish on' MMM d 'at' HH:mm");
                            break;
                        case 17:
                            fastDateFormatArr[i] = k(locale, O0(2131746385, "PublishDayYearAt", null), "'Publish on' MMM d yyyy 'at' HH:mm");
                            break;
                    }
                }
                return fastDateFormatArr[i];
            }
        }
        return null;
    }

    public final FastDateFormat x0() {
        if (this.p == null) {
            synchronized (this) {
                if (this.p == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.p = k(locale, O0(2131742518, "formatDateScheduleYear", null), "MMM d yyyy");
                }
            }
        }
        return this.p;
    }

    public final FastDateFormat y0() {
        String O0;
        String str;
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    if (c0) {
                        O0 = O0(2131742499, "formatterStats24H", null);
                    } else {
                        O0 = O0(2131742500, "formatterStats12H", null);
                    }
                    if (c0) {
                        str = "MMM dd yyyy, HH:mm";
                    } else {
                        str = "MMM dd yyyy, h:mm a";
                    }
                    this.i = k(locale, O0, str);
                }
            }
        }
        return this.i;
    }

    public final FastDateFormat z0() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.d = k(locale, O0(2131742498, "formatterWeek", null), "EEE");
                }
            }
        }
        return this.d;
    }
}
