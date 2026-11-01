package org.telegram.messenger;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.Xml;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y41;
import org.xmlpull.v1.XmlPullParser;
public final class dd {
    public static boolean X = false;
    public static int Y = 1;
    public static boolean Z = false;
    public static volatile dd f15341a0;
    public static final char[] f15342b0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final char[][] f15343c0 = {new char[]{1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641}, new char[]{1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785}, new char[]{2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415}, new char[]{2790, 2791, 2792, 2793, 2794, 2795, 2796, 2797, 2798, 2799}, new char[]{2662, 2663, 2664, 2665, 2666, 2667, 2668, 2669, 2670, 2671}, new char[]{2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543}, new char[]{3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311}, new char[]{2918, 2919, 2920, 2921, 2922, 2923, 2924, 2925, 2926, 2927}, new char[]{3430, 3431, 3432, 3433, 3434, 3435, 3436, 3437, 3438, 3439}, new char[]{3046, 3047, 3048, 3049, 3050, 3051, 3052, 3053, 3054, 3055}, new char[]{3174, 3175, 3176, 3177, 3178, 3179, 3180, 3181, 3182, 3183}, new char[]{4160, 4161, 4162, 4163, 4164, 4165, 4166, 4167, 4168, 4169}, new char[]{3872, 3873, 3874, 3875, 3876, 3877, 3878, 3879, 3880, 3881}, new char[]{6160, 6161, 6162, 6163, 6164, 6165, 6166, 6167, 6168, 6169}, new char[]{6112, 6113, 6114, 6115, 6116, 6117, 6118, 6119, 6120, 6121}, new char[]{3664, 3665, 3666, 3667, 3668, 3669, 3670, 3671, 3672, 3673}, new char[]{3792, 3793, 3794, 3795, 3796, 3797, 3798, 3799, 3800, 3801}, new char[]{43472, 43473, 43474, 43475, 43476, 43477, 43478, 43479, 43480, 43481}};
    public static Boolean f15344d0;
    public bd A;
    public ad B;
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
    public ii.b R;
    public volatile Locale S;
    public volatile ii.b T;
    public volatile boolean U;
    public ii.b V;
    public int W;
    public volatile FastDateFormat f15345a;
    public volatile FastDateFormat f15346b;
    public volatile FastDateFormat f15347c;
    public volatile FastDateFormat d;
    public volatile FastDateFormat e;
    public volatile FastDateFormat f15348f;
    public volatile FastDateFormat f15349g;
    public volatile FastDateFormat h;
    public volatile FastDateFormat f15350i;
    public volatile FastDateFormat f15351j;
    public volatile FastDateFormat f15352k;
    public volatile FastDateFormat f15353l;
    public volatile FastDateFormat f15354m;
    public volatile FastDateFormat f15355n;
    public volatile FastDateFormat f15356o;
    public volatile FastDateFormat f15357p;
    public volatile FastDateFormat f15358q;
    public volatile FastDateFormat f15359r;
    public volatile FastDateFormat f15360s;
    public volatile FastDateFormat f15361t;
    public volatile FastDateFormat f15362u;
    public volatile FastDateFormat v;
    public Locale f15365y;
    public Locale f15366z;
    public final FastDateFormat[] f15363w = new FastDateFormat[18];
    public final HashMap f15364x = new HashMap();
    public boolean D = false;

    public dd() {
        boolean z10 = false;
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new HashMap();
        HashMap hashMap = new HashMap();
        this.N = hashMap;
        this.O = new ArrayList();
        this.Q = false;
        ii.b bVar = ii.b.f8586c;
        this.T = bVar;
        this.V = bVar;
        b(new String[]{"bem", "brx", "da", "de", "el", "en", "eo", "es", "et", "fi", "fo", "gl", "he", "iw", "it", "nb", "nl", "nn", "no", "sv", "af", "bg", "bn", "ca", "eu", "fur", "fy", "gu", "ha", "is", "ku", "lb", "ml", "mr", "nah", "ne", "om", "or", "pa", "pap", "ps", "so", "sq", "sw", "ta", "te", "tk", "ur", "zu", "mn", "gsw", "chr", "rm", "pt", "an", "ast"}, new bd(11));
        b(new String[]{"cs", "sk"}, new bd(3));
        b(new String[]{"ff", "fr", "kab"}, new bd(4));
        b(new String[]{"ru", "uk", "be"}, new bd(1));
        b(new String[]{"sr", "hr", "bs", "sh"}, new bd(14));
        b(new String[]{"lv"}, new bd(6));
        b(new String[]{"lt"}, new bd(7));
        b(new String[]{"pl"}, new bd(12));
        b(new String[]{"ro", "mo"}, new bd(13));
        b(new String[]{"sl"}, new bd(15));
        b(new String[]{"ar"}, new bd(0));
        b(new String[]{"mk"}, new bd(8));
        b(new String[]{"cy"}, new bd(18));
        b(new String[]{"br"}, new bd(2));
        b(new String[]{"lag"}, new bd(5));
        b(new String[]{"shi"}, new bd(16));
        b(new String[]{"mt"}, new bd(9));
        b(new String[]{"ga", "se", "sma", "smi", "smj", "smn", "sms"}, new bd(17));
        b(new String[]{"ak", "am", "bh", "fil", "tl", "guw", "hi", "ln", "mg", "nso", "ti", "wa"}, new bd(19));
        b(new String[]{"az", "bm", "fa", "ig", "hu", "ja", "kde", "kea", "ko", "my", "ses", "sg", "to", "tr", "vi", "wo", "yo", "zh", "bo", "dz", "id", "jv", "jw", "ka", "km", "kn", "ms", "th", "in"}, new bd(10));
        ?? obj = new Object();
        obj.f14591a = "English";
        obj.f14592b = "English";
        obj.f14594f = "en";
        obj.f14593c = "en";
        ad adVar = null;
        obj.d = null;
        obj.f14597j = true;
        arrayList.add(obj);
        hashMap.put(obj.f14593c, obj);
        ?? obj2 = new Object();
        obj2.f14591a = "Italiano";
        obj2.f14592b = "Italian";
        obj2.f14594f = "it";
        obj2.f14593c = "it";
        obj2.d = null;
        obj2.f14597j = true;
        arrayList.add(obj2);
        hashMap.put(obj2.f14593c, obj2);
        ?? obj3 = new Object();
        obj3.f14591a = "Español";
        obj3.f14592b = "Spanish";
        obj3.f14594f = "es";
        obj3.f14593c = "es";
        obj3.f14597j = true;
        arrayList.add(obj3);
        hashMap.put(obj3.f14593c, obj3);
        ?? obj4 = new Object();
        obj4.f14591a = "Deutsch";
        obj4.f14592b = "German";
        obj4.f14594f = "de";
        obj4.f14593c = "de";
        obj4.d = null;
        obj4.f14597j = true;
        arrayList.add(obj4);
        hashMap.put(obj4.f14593c, obj4);
        ?? obj5 = new Object();
        obj5.f14591a = "Nederlands";
        obj5.f14592b = "Dutch";
        obj5.f14594f = "nl";
        obj5.f14593c = "nl";
        obj5.d = null;
        obj5.f14597j = true;
        arrayList.add(obj5);
        hashMap.put(obj5.f14593c, obj5);
        ?? obj6 = new Object();
        obj6.f14591a = "العربية";
        obj6.f14592b = "Arabic";
        obj6.f14594f = "ar";
        obj6.f14593c = "ar";
        obj6.d = null;
        obj6.f14597j = true;
        obj6.f14595g = true;
        arrayList.add(obj6);
        hashMap.put(obj6.f14593c, obj6);
        ?? obj7 = new Object();
        obj7.f14591a = "Português (Brasil)";
        obj7.f14592b = "Portuguese (Brazil)";
        obj7.f14594f = "pt_br";
        obj7.f14593c = "pt_br";
        obj7.d = null;
        obj7.f14597j = true;
        arrayList.add(obj7);
        hashMap.put(obj7.f14593c, obj7);
        ?? obj8 = new Object();
        obj8.f14591a = "한국어";
        obj8.f14592b = "Korean";
        obj8.f14594f = "ko";
        obj8.f14593c = "ko";
        obj8.d = null;
        obj8.f14597j = true;
        arrayList.add(obj8);
        hashMap.put(obj8.f14593c, obj8);
        ?? obj9 = new Object();
        obj9.f14591a = "Українська";
        obj9.f14592b = "Ukrainian";
        obj9.f14594f = "uk";
        obj9.f14593c = "uk";
        obj9.d = null;
        obj9.f14597j = true;
        arrayList.add(obj9);
        hashMap.put(obj9.f14593c, obj9);
        ?? obj10 = new Object();
        obj10.f14591a = "Русский";
        obj10.f14592b = "Russian";
        obj10.f14594f = "ru";
        obj10.f14593c = "ru";
        obj10.d = null;
        obj10.f14597j = true;
        arrayList.add(obj10);
        hashMap.put(obj10.f14593c, obj10);
        SharedPreferences sharedPreferences = w0.f18945b.getSharedPreferences("langconfig", 0);
        String string = sharedPreferences.getString("locales", null);
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split("&")) {
                ad a2 = ad.a(str);
                if (a2 != null) {
                    this.O.add(a2);
                }
            }
        }
        String string2 = sharedPreferences.getString("remote", null);
        if (!TextUtils.isEmpty(string2)) {
            for (String str2 : string2.split("&")) {
                ad a10 = ad.a(str2);
                a10.f14593c = a10.f14593c.replace("-", "_");
                if (!this.M.containsKey(a10.b())) {
                    this.L.add(a10);
                    this.M.put(a10.b(), a10);
                }
            }
        }
        String string3 = sharedPreferences.getString("unofficial", null);
        if (!TextUtils.isEmpty(string3)) {
            for (String str3 : string3.split("&")) {
                ad a11 = ad.a(str3);
                if (a11 != null) {
                    a11.f14593c = a11.f14593c.replace("-", "_");
                    this.K.add(a11);
                }
            }
        }
        if (this.L.isEmpty()) {
            i0.g3(new Runnable(this) {
                public final dd f18411b;

                {
                    this.f18411b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f18411b.S0(e20.f15506s0, true);
                            return;
                        default:
                            dd ddVar = this.f18411b;
                            ddVar.getClass();
                            ddVar.F = dd.P0();
                            return;
                    }
                }
            });
        }
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            ad adVar2 = (ad) this.O.get(i10);
            this.J.add(adVar2);
            this.N.put(adVar2.b(), adVar2);
        }
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            ad adVar3 = (ad) this.L.get(i11);
            ad F0 = F0(adVar3.b());
            if (F0 != null) {
                F0.d = adVar3.d;
                F0.h = adVar3.h;
                F0.f14596i = adVar3.f14596i;
                F0.f14598k = adVar3.f14598k;
                this.L.set(i11, F0);
            } else {
                this.J.add(adVar3);
                this.N.put(adVar3.b(), adVar3);
            }
        }
        for (int i12 = 0; i12 < this.K.size(); i12++) {
            ad adVar4 = (ad) this.K.get(i12);
            ad F02 = F0(adVar4.b());
            if (F02 != null) {
                F02.d = adVar4.d;
                F02.h = adVar4.h;
                F02.f14596i = adVar4.f14596i;
                F02.f14598k = adVar4.f14598k;
                this.K.set(i12, F02);
            } else {
                this.N.put(adVar4.b(), adVar4);
            }
        }
        this.f15366z = Locale.getDefault();
        Z = DateFormat.is24HourFormat(w0.f18945b);
        try {
            String string4 = wp.d1().getString("language", null);
            if (string4 != null && (adVar = F0(string4)) != null) {
                z10 = true;
            }
            if (adVar == null && this.f15366z.getLanguage() != null) {
                adVar = F0(this.f15366z.getLanguage());
            }
            if (adVar == null && (adVar = F0(H0(this.f15366z))) == null) {
                adVar = F0("en");
            }
            d(adVar, z10, true, e20.f15506s0);
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                w0.f18945b.registerReceiver(new androidx.mediarouter.app.f(this, 10), intentFilter, 4);
            } else {
                w0.f18945b.registerReceiver(new androidx.mediarouter.app.f(this, 10), intentFilter);
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        i0.g3(new Runnable(this) {
            public final dd f18411b;

            {
                this.f18411b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f18411b.S0(e20.f15506s0, true);
                        return;
                    default:
                        dd ddVar = this.f18411b;
                        ddVar.getClass();
                        ddVar.F = dd.P0();
                        return;
                }
            }
        });
    }

    public static String A(TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate, long j10, Locale locale, boolean z10) {
        boolean z11;
        String str;
        String str2;
        String str3;
        String format;
        long j11 = tL_messageEntityFormattedDate.date * 1000;
        if (tL_messageEntityFormattedDate.relative && !z10) {
            long j12 = j11 - j10;
            if (Build.VERSION.SDK_INT >= 24) {
                return cd.a(j12, locale);
            }
            return DateUtils.getRelativeTimeSpanString(j11, j10, 1000L, 262144).toString();
        }
        if (tL_messageEntityFormattedDate.flags == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = z11 | z10;
        String str4 = "";
        if (!tL_messageEntityFormattedDate.day_of_week) {
            str = "";
        } else {
            str = D0().A0().format(j11);
        }
        if (z12) {
            str2 = D0().r0().format(j11);
        } else if (tL_messageEntityFormattedDate.long_date) {
            str2 = D0().h0().format(j11);
        } else if (!tL_messageEntityFormattedDate.short_date) {
            str2 = "";
        } else {
            str2 = D0().B0().format(j11);
        }
        if (z12) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            if (calendar.get(13) != 0) {
                format = D0().q0().format(j11);
            } else {
                format = D0().o0().format(j11);
            }
            str4 = format;
        } else if (tL_messageEntityFormattedDate.long_time) {
            str4 = D0().q0().format(j11);
        } else if (tL_messageEntityFormattedDate.short_time) {
            str4 = D0().o0().format(j11);
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        boolean isEmpty3 = TextUtils.isEmpty(str4);
        if (isEmpty2 && isEmpty3) {
            return str;
        }
        if (!isEmpty2 && !isEmpty3) {
            str3 = a0(null, null, 2131742808, str2, str4);
        } else {
            if (isEmpty2) {
                str2 = str4;
            }
            str3 = str2;
        }
        if (!isEmpty) {
            return a0(null, null, 2131746349, str, str3);
        }
        return str3;
    }

    public static String B(long j10) {
        String a02;
        long j11 = j10 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                a02 = a0(null, null, 2131742808, D0().p0().format(new Date(j11)), D0().o0().format(new Date(j11)));
            } else {
                a02 = a0(null, null, 2131742808, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11)));
            }
            return a0(null, null, 2131752335, a02);
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String C(int i10) {
        int i11;
        int i12;
        int i13 = (i10 / 60) / 60;
        int i14 = i10 - (i13 * 3600);
        int i15 = i14 / 60;
        int i16 = i14 - (i15 * 60);
        if (i13 != 0) {
            if (i15 > 30) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            return String.format("%dh", Integer.valueOf(i13 + i12));
        } else if (i15 != 0) {
            if (i16 > 30) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            return String.format("%d", Integer.valueOf(i15 + i11));
        } else {
            return String.format("%d", Integer.valueOf(i16));
        }
    }

    public static String D(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                int currentTime = ((int) (ConnectionsManager.getInstance(e20.f15506s0).getCurrentTime() - (j11 / 1000))) / 60;
                if (currentTime < 1) {
                    return L0(2131748756, null);
                }
                if (currentTime < 60) {
                    return G(currentTime, "UpdatedMinutes", new Object[0]);
                }
                return a0(null, null, 2131748757, a0("TodayAtFormatted", null, 2131744136, D0().o0().format(new Date(j11))));
            } else if (i12 + 1 == i10 && i11 == i13) {
                return a0(null, null, 2131748757, a0("YesterdayAtFormatted", null, 2131742868, D0().o0().format(new Date(j11))));
            } else {
                if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                    return a0(null, null, 2131748757, a0(null, null, 2131742808, D0().p0().format(new Date(j11)), D0().o0().format(new Date(j11))));
                }
                return a0(null, null, 2131748757, a0(null, null, 2131742808, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11))));
            }
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static dd D0() {
        dd ddVar;
        dd ddVar2 = f15341a0;
        if (ddVar2 == null) {
            synchronized (dd.class) {
                try {
                    ddVar = f15341a0;
                    if (ddVar == null) {
                        ddVar = new dd();
                        f15341a0 = ddVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ddVar;
        }
        return ddVar2;
    }

    public static String E(long j10, char c10) {
        if (j10 < 0) {
            return i0.a.k(-j10, c10, new StringBuilder("-"));
        }
        StringBuilder sb2 = new StringBuilder(String.format("%d", Long.valueOf(j10)));
        for (int length = sb2.length() - 3; length > 0; length -= 3) {
            sb2.insert(length, c10);
        }
        return sb2.toString();
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
            char c10 = (char) 55356;
            return new String(new char[]{c10, (char) (((charArray[0] + 61861) & 1023) + 56320), c10, (char) (((charArray[1] + 61861) & 1023) + 56320)});
        }
        return null;
    }

    public static CharSequence F(String str, int i10, CharSequence... charSequenceArr) {
        if (str.length() != 0 && D0().A != null) {
            D0();
            String C = a1.g.C(str, "_", b1(D0().A.a(i10)));
            Object[] objArr = new Object[charSequenceArr.length + 1];
            objArr[0] = Integer.valueOf(i10);
            System.arraycopy(charSequenceArr, 0, objArr, 1, charSequenceArr.length);
            return V(C, str.concat("_other"), 0, objArr);
        }
        return "LOC_ERR:".concat(str);
    }

    public static String G(int i10, String str, Object... objArr) {
        if (str.length() != 0 && D0().A != null) {
            D0();
            String C = a1.g.C(str, "_", b1(D0().A.a(i10)));
            Object[] objArr2 = new Object[objArr.length + 1];
            objArr2[0] = Integer.valueOf(i10);
            System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
            return a0(C, str.concat("_other"), 0, objArr2);
        }
        return "LOC_ERR:".concat(str);
    }

    public static String H(char c10, String str, int i10) {
        return K(str, i10, c10, new Object[0]);
    }

    public static String H0(Locale locale) {
        if (locale != null) {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            String variant = locale.getVariant();
            if (language.length() == 0 && country.length() == 0) {
                return "en";
            }
            StringBuilder sb2 = new StringBuilder(11);
            sb2.append(language);
            if (country.length() > 0 || variant.length() > 0) {
                sb2.append('_');
            }
            sb2.append(country);
            if (variant.length() > 0) {
                sb2.append('_');
            }
            sb2.append(variant);
            return sb2.toString();
        }
        return "en";
    }

    public static String I(int i10, String str) {
        return H(',', str, i10);
    }

    public static String I0() {
        ad adVar = D0().B;
        if (adVar != null) {
            return adVar.c();
        }
        Locale locale = D0().f15365y;
        if (locale == null) {
            return "en";
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        if (language.length() == 0 && country.length() == 0) {
            return "en";
        }
        StringBuilder sb2 = new StringBuilder(11);
        sb2.append(language);
        if (country.length() > 0 || variant.length() > 0) {
            sb2.append('-');
        }
        sb2.append(country);
        if (variant.length() > 0) {
            sb2.append('_');
        }
        sb2.append(variant);
        return sb2.toString();
    }

    public static String J(int i10, String str, Object... objArr) {
        return K(str, i10, ',', objArr);
    }

    public static String J0(int i10, String str) {
        if (str.length() != 0 && D0().A != null) {
            D0();
            return D0().N0(0, a1.g.C(str, "_", b1(D0().A.a(i10))), str.concat("_other"));
        }
        return "LOC_ERR:".concat(str);
    }

    public static String K(String str, int i10, char c10, Object... objArr) {
        StringBuilder sb2;
        try {
            if (str.length() != 0 && D0().A != null) {
                D0();
                String str2 = str + "_" + b1(D0().A.a(i10));
                StringBuilder sb3 = new StringBuilder(String.format("%d", Integer.valueOf(i10)));
                for (int length = sb3.length() - 3; length > 0; length -= 3) {
                    sb3.insert(length, c10);
                }
                boolean z10 = v2.f18578a;
                String b10 = D0().V.b(str2);
                if (b10 == null) {
                    b10 = D0().V.b(str + "_other");
                }
                if (b10 == null) {
                    try {
                        dd D0 = D0();
                        D0.i();
                        b10 = D0.T.b(str2);
                    } catch (Exception unused) {
                    }
                }
                if (b10 == null) {
                    dd D02 = D0();
                    D02.i();
                    b10 = D02.T.b(str + "_other");
                }
                String replace = b10.replace("%d", "%1$s").replace("%1$d", "%1$s");
                int length2 = objArr.length + 1;
                Object[] objArr2 = new Object[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    if (i11 == 0) {
                        sb2 = sb3;
                    } else {
                        sb2 = objArr[i11 - 1];
                    }
                    objArr2[i11] = sb2;
                }
                if (D0().f15365y != null) {
                    return String.format(D0().f15365y, replace, objArr2);
                }
                return String.format(replace, objArr2);
            }
            return "LOC_ERR:".concat(str);
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR: ".concat(str);
        }
    }

    public static String K0(int i10) {
        return L0(i10, null);
    }

    public static String L(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return a0(null, null, 2131747217, D0().o0().format(new Date(j11)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return a0(null, null, 2131747216, D0().o0().format(new Date(j11)));
            }
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                return a0(null, null, 2131747218, D0().p0().format(new Date(j11)), D0().o0().format(new Date(j11)));
            }
            return a0(null, null, 2131747218, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11)));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String L0(int i10, String str) {
        return D0().N0(i10, str, null);
    }

    public static String M(int i10, boolean z10) {
        String G;
        int i11;
        if (i10 < 86400) {
            G = R(i10);
        } else {
            G = G(i10 / 86400, "Days", new Object[0]);
        }
        if (z10) {
            i11 = 2131747175;
        } else {
            i11 = 2131747187;
        }
        return a0(null, null, i11, G);
    }

    public static String M0(String str) {
        if (TextUtils.isEmpty(str)) {
            return sc.e.h("LOC_ERR:", str);
        }
        return L0(0, str);
    }

    public static String N(long j10) {
        try {
            long j11 = j10 / 60;
            long j12 = j11 / 60;
            long j13 = j12 / 24;
            long j14 = j13 / 30;
            long j15 = j13 / 365;
            int i10 = (j15 > 1L ? 1 : (j15 == 1L ? 0 : -1));
            if (i10 >= 0) {
                if (i10 == 0) {
                    return L0(2131742881, null);
                }
                return H(',', "YearsAgo", (int) j15);
            }
            int i11 = (j14 > 1L ? 1 : (j14 == 1L ? 0 : -1));
            if (i11 >= 0) {
                if (i11 == 0) {
                    return L0(2131748360, null);
                }
                return H(',', "MonthsAgo", (int) j14);
            }
            int i12 = (j13 > 1L ? 1 : (j13 == 1L ? 0 : -1));
            if (i12 >= 0) {
                if (i12 == 0) {
                    return L0(2131751669, null);
                }
                return H(',', "DaysAgo", (int) j13);
            }
            int i13 = (j12 > 1L ? 1 : (j12 == 1L ? 0 : -1));
            if (i13 >= 0) {
                if (i13 == 0) {
                    return L0(2131749298, null);
                }
                return H(',', "HoursAgo", (int) j12);
            }
            int i14 = (j11 > 1L ? 1 : (j11 == 1L ? 0 : -1));
            if (i14 >= 0) {
                if (i14 == 0) {
                    return L0(2131748441, null);
                }
                return H(',', "MinutesAgo", (int) j11);
            }
            return L0(2131748997, null);
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String O(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return a0(null, null, 2131744135, D0().o0().format(new Date(j11)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return a0(null, null, 2131742868, D0().o0().format(new Date(j11)));
            }
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                return a0(null, null, 2131742808, D0().p0().format(new Date(j11)), D0().o0().format(new Date(j11)));
            }
            return a0(null, null, 2131742808, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11)));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String P(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            long j12 = timeInMillis - j11;
            if (j12 < 60000) {
                return L0(2131745375, null);
            }
            if (j12 < 3600000) {
                return G((int) (j12 / 60000), "ShortMinutesAgo", new Object[0]);
            }
            if (i12 == i10 && i11 == i13) {
                if (j12 < 43200000) {
                    return G((int) (j12 / 3600000), "ShortHoursAgo", new Object[0]);
                }
                return L0(2131745373, null);
            } else if (i12 + 1 == i10 && i11 == i13) {
                return L0(2131745372, null);
            } else {
                if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                    return D0().p0().format(new Date(j11));
                }
                return a0(null, null, 2131742808, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11)));
            }
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String P0() {
        Locale locale = D0().f15366z;
        if (locale == null) {
            return "en";
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        if (language.length() == 0 && country.length() == 0) {
            return "en";
        }
        StringBuilder sb2 = new StringBuilder(11);
        sb2.append(language);
        if (country.length() > 0 || variant.length() > 0) {
            sb2.append('-');
        }
        sb2.append(country);
        if (variant.length() > 0) {
            sb2.append('_');
        }
        sb2.append(variant);
        return sb2.toString();
    }

    public static String Q(long j10) {
        long j11 = j10 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                return D0().v0().format(new Date(j11)) + ", " + D0().o0().format(new Date(j11));
            }
            return D0().x0().format(new Date(j11)) + ", " + D0().o0().format(new Date(j11));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String R(int i10) {
        String str;
        String str2;
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        StringBuilder sb2 = new StringBuilder();
        String str3 = "0";
        if (i11 > 0) {
            if (sb2.length() > 0) {
                sb2.append(":");
            }
            if (i11 < 10) {
                str2 = "0";
            } else {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(i11);
        }
        if (sb2.length() > 0) {
            sb2.append(":");
        }
        if (i12 < 10) {
            str = "0";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(i12);
        if (sb2.length() > 0) {
            sb2.append(":");
        }
        if (i13 >= 10) {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(i13);
        return sb2.toString();
    }

    public static String S(int[] iArr, int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = i10 / 1000;
            if (i12 <= 0) {
                break;
            }
            sb2.append("K");
            i11 = (i10 % 1000) / 100;
            i10 = i12;
        }
        if (iArr != null) {
            double d = (i11 / 10.0d) + i10;
            for (int i13 = 0; i13 < sb2.length(); i13++) {
                d *= 1000.0d;
            }
            iArr[0] = (int) d;
        }
        if (i11 != 0 && sb2.length() > 0) {
            if (sb2.length() == 2) {
                Locale locale = Locale.US;
                return i10 + "." + i11 + "M";
            }
            Locale locale2 = Locale.US;
            return i10 + "." + i11 + sb2.toString();
        } else if (sb2.length() == 2) {
            Locale locale3 = Locale.US;
            return a1.g.k(i10, "M");
        } else {
            Locale locale4 = Locale.US;
            return a1.g.k(i10, sb2.toString());
        }
    }

    public static String T(long j10) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i10 = calendar.get(1);
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(j11);
            if (i10 == calendar.get(1)) {
                return D0().p0().format(j11);
            }
            return D0().p0().format(j11) + ", " + calendar.get(1);
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static CharSequence U(int i10, Object... objArr) {
        return V(null, null, i10, objArr);
    }

    public static void U0(String str) {
        if (v2.f18578a) {
            f8.b("set as patched " + str + " langpack");
        }
        SharedPreferences.Editor edit = wp.d1().edit();
        edit.putBoolean("lngpack_patched_" + str, true).apply();
    }

    public static CharSequence V(String str, String str2, int i10, Object... objArr) {
        String str3;
        try {
            String O0 = D0().O0(i10, str, str2);
            if (O0 == null) {
                return "LOC_ERR: " + str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(O0);
            int i11 = 0;
            while (i11 < objArr.length) {
                String str4 = "s";
                Object obj = objArr[i11];
                if (obj instanceof CharSequence) {
                    str3 = (CharSequence) obj;
                } else {
                    if (obj instanceof Integer) {
                        str3 = "" + ((Integer) objArr[i11]);
                    } else if (obj instanceof Long) {
                        str3 = "" + ((Long) objArr[i11]);
                    } else if (obj != null) {
                        str3 = "";
                    } else {
                        str3 = "null";
                    }
                    str4 = "d";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("%");
                i11++;
                sb2.append(i11);
                sb2.append("$");
                sb2.append(str4);
                String sb3 = sb2.toString();
                int indexOf = spannableStringBuilder.toString().indexOf(sb3);
                if (indexOf != -1) {
                    spannableStringBuilder.replace(indexOf, sb3.length() + indexOf, str3);
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
            f8.g(e, true);
            return "LOC_ERR: " + str;
        }
    }

    public static String W(int i10, long j10, boolean z10) {
        int i11;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i12 = calendar.get(1);
        int i13 = calendar.get(6);
        calendar.setTimeInMillis(j10 * 1000);
        int i14 = calendar.get(1);
        int i15 = calendar.get(6);
        if (i12 == i14) {
            if (z10 && i15 == i13) {
                i11 = 0;
            } else {
                i11 = 1;
            }
        } else {
            i11 = 2;
        }
        if (i10 == 1) {
            i11 += 3;
        } else if (i10 == 2) {
            i11 += 6;
        } else if (i10 == 3) {
            i11 += 9;
        } else if (i10 == 4) {
            i11 += 12;
        }
        return D0().w0(i11).format(calendar.getTimeInMillis());
    }

    public static String X(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            long j12 = timeInMillis - j11;
            if (j12 < 60000) {
                return L0(2131746015, null);
            }
            if (j12 < 3600000) {
                int i14 = (int) (j12 / 60000);
                return G(i14, "MinutesAgo", Integer.valueOf(i14));
            } else if (i12 == i10 && i11 == i13) {
                return a0(null, null, 2131744135, D0().o0().format(new Date(j11)));
            } else {
                if (i12 + 1 == i10 && i11 == i13) {
                    return a0(null, null, 2131742868, D0().o0().format(new Date(j11)));
                }
                if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                    return a0(null, null, 2131742808, D0().p0().format(new Date(j11)), D0().o0().format(new Date(j11)));
                }
                return a0(null, null, 2131742808, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11)));
            }
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String Y(int i10, String str, Object... objArr) {
        return a0(str, null, i10, objArr);
    }

    public static String Z(int i10, Object... objArr) {
        return a0(null, null, i10, objArr);
    }

    public static String a(String str) {
        return str.replace(' ', (char) 160);
    }

    public static String a0(String str, String str2, int i10, Object... objArr) {
        try {
            String O0 = D0().O0(i10, str, str2);
            if (O0 == null) {
                return "LOC_ERR: " + str;
            } else if (D0().f15365y != null) {
                return String.format(D0().f15365y, O0, objArr);
            } else {
                return String.format(O0, objArr);
            }
        } catch (Exception e) {
            f8.g(e, true);
            if (i10 != 0) {
                try {
                    return String.format(w0.f18945b.getString(i10), objArr);
                } catch (Exception unused) {
                    return sc.e.h("LOC_ERR: ", str);
                }
            }
            return sc.e.h("LOC_ERR: ", str);
        }
    }

    public static String a1(long j10) {
        long j11 = j10 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j11) >= 31536000000L) {
                return D0().B0().format(new Date(j11));
            }
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6) - i10;
            if (i11 != 0 && (i11 != -1 || System.currentTimeMillis() - j11 >= 28800000)) {
                if (i11 > -7 && i11 <= -1) {
                    return D0().z0().format(new Date(j11));
                }
                return D0().p0().format(new Date(j11));
            }
            return D0().o0().format(new Date(j11));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String b0(String str, Object... objArr) {
        try {
            if (D0().f15365y != null) {
                return String.format(D0().f15365y, str, objArr);
            }
            return String.format(str, objArr);
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR: " + str;
        }
    }

    public static String b1(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        if (i10 != 16) {
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

    public static String c0(int i10) {
        if (i10 < 60) {
            return G(i10, "Seconds", new Object[0]);
        }
        if (i10 < 3600) {
            return G(i10 / 60, "Minutes", new Object[0]);
        }
        if (i10 < 86400) {
            return G((i10 / 60) / 60, "Hours", new Object[0]);
        }
        if (i10 < 604800) {
            return G(((i10 / 60) / 60) / 24, "Days", new Object[0]);
        }
        if (i10 < 2678400) {
            int i11 = ((i10 / 60) / 60) / 24;
            if (i10 % 7 == 0) {
                return G(i11 / 7, "Weeks", new Object[0]);
            }
            return a1.g.C(G(i11 / 7, "Weeks", new Object[0]), " ", G(i11 % 7, "Days", new Object[0]));
        } else if (i10 >= 31536000 && i10 % 31536000 == 0) {
            return G((((i10 / 60) / 60) / 24) / 365, "Years", new Object[0]);
        } else {
            return G((((i10 / 60) / 60) / 24) / 30, "Months", new Object[0]);
        }
    }

    public static String d0(int i10, TLRPC.User user, boolean[] zArr, boolean[] zArr2) {
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.UserStatus userStatus3;
        int i11;
        int i12;
        int i13;
        if (user != null && (userStatus3 = user.status) != null && userStatus3.expires == 0) {
            if (userStatus3 instanceof TLRPC.TL_userStatusRecently) {
                if (userStatus3.by_me) {
                    i13 = -1000;
                } else {
                    i13 = -100;
                }
                userStatus3.expires = i13;
            } else if (userStatus3 instanceof TLRPC.TL_userStatusLastWeek) {
                if (userStatus3.by_me) {
                    i12 = -1001;
                } else {
                    i12 = -101;
                }
                userStatus3.expires = i12;
            } else if (userStatus3 instanceof TLRPC.TL_userStatusLastMonth) {
                if (userStatus3.by_me) {
                    i11 = -1002;
                } else {
                    i11 = -102;
                }
                userStatus3.expires = i11;
            }
        }
        if (user != null && (userStatus2 = user.status) != null && userStatus2.expires <= 0 && wp.r1(i10).Z.containsKey(Long.valueOf(user.f19943id))) {
            if (zArr != null) {
                zArr[0] = true;
            }
            return L0(2131747842, "Online");
        } else if (user != null && (userStatus = user.status) != null && userStatus.expires != 0 && !i20.x(user) && !(user instanceof TLRPC.TL_userEmpty)) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            int i14 = user.status.expires;
            if (i14 > currentTime) {
                if (zArr != null) {
                    zArr[0] = true;
                }
                return L0(2131747842, "Online");
            } else if (i14 == -1) {
                return L0(2131749188, "Invisible");
            } else {
                if (i14 != -100 && i14 != -1000) {
                    if (i14 != -101 && i14 != -1001) {
                        if (i14 != -102 && i14 != -1002) {
                            return w(i14, zArr2);
                        }
                        return L0(2131742888, "WithinAMonth");
                    }
                    return L0(2131742887, "WithinAWeek");
                }
                return L0(2131749021, "Lately");
            }
        } else {
            return L0(2131754951, "ALongTimeAgo");
        }
    }

    public static String e0(long j10, boolean z10) {
        long j11 = 1000 * j10;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(1);
            int i12 = calendar.get(2);
            String[] strArr = {L0(2131749096, null), L0(2131750830, null), L0(2131748698, null), L0(2131754173, null), L0(2131748677, null), L0(2131749074, null), L0(2131749076, null), L0(2131753895, null), L0(2131745582, null), L0(2131747846, null), L0(2131747851, null), L0(2131751606, null)};
            if (i10 == i11 && !z10) {
                return strArr[i12];
            }
            return strArr[i12] + " " + i11;
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String f0(long j10) {
        long j11 = 1000 * j10;
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            return new String[]{L0(2131749096, null), L0(2131750830, null), L0(2131748698, null), L0(2131754173, null), L0(2131748677, null), L0(2131749074, null), L0(2131749076, null), L0(2131753895, null), L0(2131745582, null), L0(2131747846, null), L0(2131747851, null), L0(2131751606, null)}[i11] + " " + i12 + ", " + i10;
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static Spannable g(String str) {
        if (str instanceof Spannable) {
            ((Spannable) str).setSpan(new y41(i0.o()), 0, str.length(), 33);
            return (Spannable) str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new y41(i0.o()), 0, str.length(), 33);
        return spannableStringBuilder;
    }

    public static int h(HashMap hashMap) {
        String m10;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (String str : hashMap.keySet()) {
            if (str != null) {
                if (str.endsWith("_other")) {
                    m10 = c3.i0.m(6, 0, str);
                } else if (!str.endsWith("_zero") && !str.endsWith("_many")) {
                    if (!str.endsWith("_one") && !str.endsWith("_two") && !str.endsWith("_few")) {
                        m10 = null;
                    } else {
                        m10 = c3.i0.m(4, 0, str);
                    }
                } else {
                    m10 = c3.i0.m(5, 0, str);
                }
                if (m10 != null) {
                    if (!hashSet.contains(m10)) {
                        hashSet.add(m10);
                    }
                }
                i10++;
            }
        }
        hashSet.clear();
        return i10;
    }

    public static String i0(int i10, String str) {
        if (str != null && str.equalsIgnoreCase("ft")) {
            return L0(i10, null);
        }
        try {
            return new Locale("", str).getDisplayCountry(D0().f15365y);
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static String j0() {
        ad adVar = D0().B;
        if (adVar != null && !TextUtils.isEmpty(adVar.f14591a)) {
            return adVar.f14591a;
        }
        return L0(2131749059, "LanguageName");
    }

    public static FastDateFormat k(Locale locale, String str, String str2) {
        if (str == null || str.length() == 0) {
            str = str2;
        }
        try {
            return FastDateFormat.getInstance(str, locale);
        } catch (Exception unused) {
            return FastDateFormat.getInstance(str2, locale);
        }
    }

    public static void l() {
        if (f15344d0 == null) {
            int i10 = uz.f18551s1;
            boolean z10 = false;
            if (i10 == 0) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) w0.f18945b.getSystemService("phone");
                    if (telephonyManager != null) {
                        String upperCase = telephonyManager.getSimCountryIso().toUpperCase();
                        if (!"US".equals(upperCase)) {
                            if (!"GB".equals(upperCase)) {
                                if (!"MM".equals(upperCase)) {
                                    if ("LR".equals(upperCase)) {
                                    }
                                    f15344d0 = Boolean.valueOf(z10);
                                    return;
                                }
                            }
                        }
                        z10 = true;
                        f15344d0 = Boolean.valueOf(z10);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    f15344d0 = Boolean.FALSE;
                    f8.g(e, true);
                    return;
                }
            }
            if (i10 == 2) {
                z10 = true;
            }
            f15344d0 = Boolean.valueOf(z10);
        }
    }

    public static String m(String str) {
        if (str.contains("[CDATA")) {
            return str;
        }
        return str.replace("<", "&lt;").replace(">", "&gt;").replace("& ", "&amp; ");
    }

    public static String n(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence);
        int length = sb2.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = sb2.charAt(i10);
            if ((charAt < '0' || charAt > '9') && charAt != '.' && charAt != ',') {
                int i11 = 0;
                while (i11 < 18) {
                    int i12 = 0;
                    while (true) {
                        char[] cArr = f15343c0[i11];
                        if (i12 >= cArr.length) {
                            break;
                        } else if (charAt == cArr[i12]) {
                            sb2.setCharAt(i10, f15342b0[i12]);
                            i11 = 18;
                            break;
                        } else {
                            i12++;
                        }
                    }
                    i11++;
                }
            }
        }
        return sb2.toString();
    }

    public static String o(int i10) {
        if (i10 > 3600) {
            String G = G(i10 / 3600, "Hours", new Object[0]);
            int i11 = (i10 % 3600) / 60;
            if (i11 > 0) {
                StringBuilder i12 = sc.e.i(G, ", ");
                i12.append(G(i11, "Minutes", new Object[0]));
                return i12.toString();
            }
            return G;
        } else if (i10 > 60) {
            return G(i10 / 60, "Minutes", new Object[0]);
        } else {
            return G(i10, "Seconds", new Object[0]);
        }
    }

    public static String r(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                if (z10) {
                    return L0(2131745373, null);
                }
                return D0().o0().format(new Date(j11));
            } else if (i12 + 1 == i10 && i11 == i13) {
                return L0(2131742870, "Yesterday");
            } else {
                if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                    return D0().p0().format(new Date(j11));
                }
                return D0().B0().format(new Date(j11));
            }
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR: formatDate";
        }
    }

    public static String s(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                if (z10) {
                    return a0(null, null, 2131744136, D0().o0().format(new Date(j11)));
                }
                return a0(null, null, 2131744135, D0().o0().format(new Date(j11)));
            } else if (i12 + 1 == i10 && i11 == i13) {
                return a0(null, null, 2131742868, D0().o0().format(new Date(j11)));
            } else {
                if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                    return a0(null, null, 2131742808, D0().p0().format(new Date(j11)), D0().o0().format(new Date(j11)));
                }
                return a0(null, null, 2131742808, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11)));
            }
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String t(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return D0().o0().format(new Date(j11));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return a0(null, null, 2131742868, D0().o0().format(new Date(j11)));
            }
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                dd D0 = D0();
                if (D0.f15354m == null) {
                    synchronized (D0) {
                        if (D0.f15354m == null) {
                            Locale locale = D0.f15365y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            D0.f15354m = k(locale, D0.N0(2131742810, "chatDateShort", null), "d MMM");
                        }
                    }
                }
                return a0(null, null, 2131742808, D0.f15354m.format(new Date(j11)), D0().o0().format(new Date(j11)));
            }
            return a0(null, null, 2131742808, D0().h0().format(new Date(j11)), D0().o0().format(new Date(j11)));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String u(long j10, boolean z10) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i10 = calendar.get(1);
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(j11);
            if (z10) {
                if (i10 != calendar.get(1)) {
                }
                return D0().g0().format(j11);
            }
            if (z10 || Math.abs(System.currentTimeMillis() - j11) >= 31536000000L) {
                return D0().h0().format(j11);
            }
            return D0().g0().format(j11);
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static String v(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            if (i10 == calendar.get(1)) {
                return D0().m0().format(new Date(j11));
            }
            return D0().l0().format(new Date(j11));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String w(long j10, boolean[] zArr) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            int i12 = calendar.get(11);
            calendar.setTimeInMillis(j11);
            int i13 = calendar.get(6);
            int i14 = calendar.get(1);
            int i15 = calendar.get(11);
            if (i13 == i10 && i11 == i14) {
                return a0(null, null, 2131749027, a0("TodayAtFormatted", null, 2131744136, D0().o0().format(new Date(j11))));
            }
            if (i13 + 1 == i10 && i11 == i14) {
                if (zArr != null) {
                    zArr[0] = true;
                    if (i12 <= 6 && i15 > 18 && Z) {
                        return a0(null, null, 2131749027, D0().o0().format(new Date(j11)));
                    }
                    return a0(null, null, 2131742868, D0().o0().format(new Date(j11)));
                }
                return a0(null, null, 2131749027, a0("YesterdayAtFormatted", null, 2131742868, D0().o0().format(new Date(j11))));
            } else if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                return a0("LastSeenDateFormatted", null, 2131749030, a0("formatDateAtTime", null, 2131742808, D0().p0().format(new Date(j11)), D0().o0().format(new Date(j11))));
            } else {
                return a0("LastSeenDateFormatted", null, 2131749030, a0("formatDateAtTime", null, 2131742808, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11))));
            }
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String x(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13 && z10) {
                return a0(null, null, 2131744135, D0().o0().format(new Date(j11)));
            }
            if (i12 + 1 == i10 && i11 == i13 && z10) {
                return a0(null, null, 2131742868, D0().o0().format(new Date(j11)));
            }
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                return a0(null, null, 2131742808, D0().g0().format(new Date(j11)), D0().o0().format(new Date(j11)));
            }
            return a0(null, null, 2131742808, D0().h0().format(new Date(j11)), D0().o0().format(new Date(j11)));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String y(float f7, int i10, Boolean bool) {
        String format;
        String format2;
        l();
        if ((bool != null && bool.booleanValue()) || (bool == null && f15344d0.booleanValue())) {
            float f10 = f7 * 3.28084f;
            if (f10 < 1000.0f) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        return a0("FootsShort", null, 2131750602, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
                    }
                    return a0("FootsFromYou", null, 2131750603, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
                }
                return a0("FootsAway", null, 2131750604, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
            }
            if (f10 % 5280.0f == 0.0f) {
                format2 = String.format("%d", Integer.valueOf((int) (f10 / 5280.0f)));
            } else {
                format2 = String.format("%.2f", Float.valueOf(f10 / 5280.0f));
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    return a0("MilesShort", null, 2131748442, format2);
                }
                return a0("MilesFromYou", null, 2131748443, format2);
            }
            return a0("MilesAway", null, 2131748444, format2);
        } else if (f7 < 1000.0f) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return a0("MetersShort", null, 2131748457, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f7))));
                }
                return a0("MetersFromYou2", null, 2131748458, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f7))));
            }
            return a0("MetersAway2", null, 2131748459, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f7))));
        } else {
            if (f7 % 1000.0f == 0.0f) {
                format = String.format("%d", Integer.valueOf((int) (f7 / 1000.0f)));
            } else {
                format = String.format("%.2f", Float.valueOf(f7 / 1000.0f));
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    return a0("KMetersShort", null, 2131749071, format);
                }
                return a0("KMetersFromYou2", null, 2131749072, format);
            }
            return a0("KMetersAway2", null, 2131749073, format);
        }
    }

    public static String z(int i10) {
        if (i10 <= 0) {
            return G(0, "Seconds", new Object[0]);
        }
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        StringBuilder sb2 = new StringBuilder();
        if (i11 > 0) {
            sb2.append(G(i11, "Hours", new Object[0]));
        }
        if (i12 > 0) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(G(i12, "Minutes", new Object[0]));
        }
        if (i13 > 0) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(G(i13, "Seconds", new Object[0]));
        }
        return sb2.toString();
    }

    public final FastDateFormat A0() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.e = k(locale, N0(2131742785, "formatterWeekLong", null), "EEEE");
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public final FastDateFormat B0() {
        if (this.f15349g == null) {
            synchronized (this) {
                try {
                    if (this.f15349g == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f15349g = k(locale, N0(2131742784, "formatterYear", null), "dd.MM.yy");
                    }
                } finally {
                }
            }
        }
        return this.f15349g;
    }

    public final FastDateFormat C0() {
        if (this.h == null) {
            synchronized (this) {
                try {
                    if (this.h == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.h = k(locale, N0(2131742783, "formatterYearMax", null), "dd.MM.yyyy");
                    }
                } finally {
                }
            }
        }
        return this.h;
    }

    public final ad F0(String str) {
        if (str == null) {
            return null;
        }
        return (ad) this.N.get(str.toLowerCase().replace("-", "_"));
    }

    public final HashMap G0(File file, boolean z10) {
        this.E = false;
        f8.b("getLocaleFileStrings: reloadLastFile = false");
        FileInputStream fileInputStream = null;
        try {
            try {
                if (!file.exists()) {
                    return new HashMap();
                }
                HashMap hashMap = new HashMap(10000);
                XmlPullParser newPullParser = Xml.newPullParser();
                FileInputStream fileInputStream2 = new FileInputStream(file);
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
                                if (z10) {
                                    str3 = trim.replace("<", "&lt;").replace(">", "&gt;").replace("'", "\\'").replace("& ", "&amp; ");
                                } else {
                                    String replace = trim.replace("\\n", "\n").replace("\\", "");
                                    str3 = replace.replace("&lt;", "<");
                                    if (!this.E && !str3.equals(replace)) {
                                        this.E = true;
                                        f8.b("getLocaleFileStrings: value != old, reloadLastFile = true;");
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
                    } catch (Exception e) {
                        f8.g(e, true);
                        return hashMap;
                    }
                } catch (Exception e7) {
                    e = e7;
                    fileInputStream = fileInputStream2;
                    try {
                        File file2 = new File(w0.h(), "malformed_locales/");
                        file2.mkdirs();
                        i0.E(file, new File(file2, file.getName()));
                    } catch (Exception unused) {
                    }
                    f8.g(e, true);
                    f8.b("getLocaleFileStrings: error, reloadLastFile = true;");
                    this.E = true;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e10) {
                            f8.g(e10, true);
                        }
                    }
                    return new HashMap();
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e11) {
                            f8.g(e11, true);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public final String N0(int i10, String str, String str2) {
        String O0 = O0(i10, str, str2);
        if (O0 == null) {
            return sc.e.h("LOC_ERR:", str);
        }
        return O0;
    }

    public final String O0(int i10, String str, String str2) {
        Context context = w0.f18945b;
        boolean z10 = v2.f18578a;
        String c10 = this.V.c(i10, context, str);
        if (c10 != null) {
            return c10;
        }
        String b10 = this.V.b(str2);
        if (b10 != null) {
            return b10;
        }
        i();
        String c11 = this.T.c(i10, context, str);
        if (c11 != null) {
            return c11;
        }
        return this.T.b(str2);
    }

    public final String Q0(String str) {
        return R0(str, true, false);
    }

    public final String R0(String str, boolean z10, boolean z11) {
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
        if (this.H != null) {
            obj = "v";
            obj2 = "u";
            obj3 = "s";
            obj4 = "m";
            obj5 = "r";
            obj6 = "z";
            obj7 = "g";
            obj8 = "h";
            obj9 = "p";
        } else {
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
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        int i10 = 0;
        boolean z12 = false;
        while (i10 < length) {
            int i11 = i10 + 1;
            String substring = str.substring(i10, i11);
            if (z11) {
                String lowerCase = substring.toLowerCase();
                z12 = !substring.equals(lowerCase);
                substring = lowerCase;
            }
            String str2 = (String) this.G.get(substring);
            if (str2 == null && z10) {
                str2 = (String) this.H.get(substring);
            }
            if (str2 != null) {
                if (z11 && z12) {
                    if (str2.length() > 1) {
                        str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                    } else {
                        str2 = str2.toUpperCase();
                    }
                }
                sb2.append(str2);
            } else {
                if (z11) {
                    char charAt = substring.charAt(0);
                    if ((charAt < 'a' || charAt > 'z' || charAt < '0' || charAt > '9') && charAt != ' ' && charAt != '\'' && charAt != ',' && charAt != '.' && charAt != '&' && charAt != '-' && charAt != '/') {
                        return null;
                    }
                    if (z12) {
                        substring = substring.toUpperCase();
                    }
                }
                sb2.append(substring);
            }
            i10 = i11;
        }
        return sb2.toString();
    }

    public final void S0(int i10, boolean z10) {
        if (this.I) {
            return;
        }
        this.I = true;
        ConnectionsManager.getInstance(i10).sendRequest(new TLRPC.TL_langpack_getLanguages(), new zc(this, z10, i10), 8);
    }

    public final void T0(Configuration configuration) {
        if (this.D) {
            return;
        }
        Z = DateFormat.is24HourFormat(w0.f18945b);
        Locale locale = configuration.locale;
        this.f15366z = locale;
        if (this.C != null) {
            ad adVar = this.B;
            this.B = null;
            d(adVar, false, false, e20.f15506s0);
        } else if (locale != null) {
            String displayName = locale.getDisplayName();
            String displayName2 = this.f15365y.getDisplayName();
            if (displayName != null && displayName2 != null && !displayName.equals(displayName2)) {
                V0();
            }
            this.f15365y = locale;
            ad adVar2 = this.B;
            if (adVar2 != null && !TextUtils.isEmpty(adVar2.f14594f)) {
                this.A = (bd) this.f15364x.get(this.B.f14594f);
            }
            if (this.A == null) {
                bd bdVar = (bd) this.f15364x.get(this.f15365y.getLanguage());
                this.A = bdVar;
                if (bdVar == null) {
                    this.A = (bd) this.f15364x.get("en");
                }
            }
        }
        String P0 = P0();
        String str = this.F;
        if (str != null && !P0.equals(str)) {
            this.F = P0;
            ConnectionsManager.setSystemLangCode(P0);
        }
        i();
    }

    public final void V0() {
        ad adVar;
        boolean z10;
        Locale locale = this.f15365y;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        if (language == null) {
            language = "en";
        }
        String lowerCase = language.toLowerCase();
        int i10 = 0;
        int i11 = 2;
        if ((lowerCase.length() != 2 || (!lowerCase.equals("ar") && !lowerCase.equals("fa") && !lowerCase.equals("he") && !lowerCase.equals("iw"))) && !lowerCase.startsWith("ar_") && !lowerCase.startsWith("fa_") && !lowerCase.startsWith("he_") && !lowerCase.startsWith("iw_") && ((adVar = this.B) == null || !adVar.f14595g)) {
            z10 = false;
        } else {
            z10 = true;
        }
        X = z10;
        if (!lowerCase.equals("ko")) {
            i11 = 1;
        }
        Y = i11;
        this.f15361t = null;
        this.f15360s = null;
        this.f15362u = null;
        this.v = null;
        this.f15358q = null;
        this.f15359r = null;
        this.f15348f = null;
        this.f15349g = null;
        this.h = null;
        this.f15353l = null;
        this.f15355n = null;
        this.d = null;
        this.e = null;
        this.f15356o = null;
        this.f15357p = null;
        this.f15345a = null;
        this.f15346b = null;
        this.f15347c = null;
        this.f15350i = null;
        this.f15351j = null;
        this.f15352k = null;
        while (true) {
            FastDateFormat[] fastDateFormatArr = this.f15363w;
            if (i10 < fastDateFormatArr.length) {
                fastDateFormatArr[i10] = null;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void W0(int i10, String str, boolean z10, xc xcVar) {
        if (str != null) {
            str = str.replace("-", "_");
        }
        String str2 = str;
        if (str2 != null) {
            ad adVar = this.B;
            if (adVar != null) {
                if (!str2.equals(adVar.f14593c) && !str2.equals(this.B.e)) {
                    return;
                }
            } else {
                return;
            }
        }
        f(this.B, str2, z10, i10, xcVar);
    }

    public final void X0() {
        SharedPreferences.Editor edit = w0.f18945b.getSharedPreferences("langconfig", 0).edit();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            String f7 = ((ad) this.O.get(i10)).f();
            if (f7 != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(f7);
            }
        }
        edit.putString("locales", sb2.toString());
        sb2.setLength(0);
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            String f10 = ((ad) this.L.get(i11)).f();
            if (f10 != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(f10);
            }
        }
        edit.putString("remote", sb2.toString());
        sb2.setLength(0);
        for (int i12 = 0; i12 < this.K.size(); i12++) {
            String f11 = ((ad) this.K.get(i12)).f();
            if (f11 != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(f11);
            }
        }
        edit.putString("unofficial", sb2.toString());
        edit.commit();
    }

    public final void Y0(ad adVar, TLRPC.TL_langPackDifference tL_langPackDifference, Runnable runnable) {
        boolean z10;
        int i10;
        File d;
        HashMap G0;
        File e;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z11 = true;
        if (tL_langPackDifference != null && !tL_langPackDifference.strings.isEmpty() && adVar != null && !adVar.h()) {
            String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
            if (lowerCase.equals(adVar.f14593c)) {
                i10 = 0;
            } else if (lowerCase.equals(adVar.e)) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            if (i10 == -1) {
                StringBuilder u10 = a1.g.u("saveRemoteLocaleStrings: unknown language ", lowerCase, " (locale short=");
                u10.append(adVar.f14593c);
                u10.append(", base=");
                u10.append(adVar.e);
                u10.append(")");
                f8.b(u10.toString());
                return;
            }
            if (i10 == 0) {
                d = adVar.e();
            } else {
                d = adVar.d();
            }
            try {
                if (tL_langPackDifference.from_version == 0) {
                    f8.b("saveRemoteLocaleStrings: difference is straight from the beginning");
                    G0 = new HashMap();
                } else {
                    f8.b("saveRemoteLocaleStrings: difference is from version " + tL_langPackDifference.from_version + " ours " + adVar.h + " (base version " + adVar.e + ")");
                    G0 = G0(d, true);
                }
                for (int i11 = 0; i11 < tL_langPackDifference.strings.size(); i11++) {
                    TLRPC.LangPackString langPackString = tL_langPackDifference.strings.get(i11);
                    if (langPackString instanceof TLRPC.TL_langPackString) {
                        G0.put(langPackString.key, m(langPackString.value));
                    } else if (langPackString instanceof TLRPC.TL_langPackStringPluralized) {
                        String str6 = langPackString.key + "_zero";
                        String str7 = langPackString.zero_value;
                        String str8 = "";
                        if (str7 == null) {
                            str = "";
                        } else {
                            str = m(str7);
                        }
                        G0.put(str6, str);
                        String str9 = langPackString.key + "_one";
                        String str10 = langPackString.one_value;
                        if (str10 == null) {
                            str2 = "";
                        } else {
                            str2 = m(str10);
                        }
                        G0.put(str9, str2);
                        String str11 = langPackString.key + "_two";
                        String str12 = langPackString.two_value;
                        if (str12 == null) {
                            str3 = "";
                        } else {
                            str3 = m(str12);
                        }
                        G0.put(str11, str3);
                        String str13 = langPackString.key + "_few";
                        String str14 = langPackString.few_value;
                        if (str14 == null) {
                            str4 = "";
                        } else {
                            str4 = m(str14);
                        }
                        G0.put(str13, str4);
                        String str15 = langPackString.key + "_many";
                        String str16 = langPackString.many_value;
                        if (str16 == null) {
                            str5 = "";
                        } else {
                            str5 = m(str16);
                        }
                        G0.put(str15, str5);
                        String str17 = langPackString.key + "_other";
                        String str18 = langPackString.other_value;
                        if (str18 != null) {
                            str8 = m(str18);
                        }
                        G0.put(str17, str8);
                    } else if (langPackString instanceof TLRPC.TL_langPackStringDeleted) {
                        G0.remove(langPackString.key);
                    }
                }
                f8.b("save locale file to " + d);
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(d));
                bufferedWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
                bufferedWriter.write("<resources>\n");
                for (Map.Entry entry : G0.entrySet()) {
                    bufferedWriter.write(String.format("<string name=\"%1$s\">%2$s</string>\n", entry.getKey(), entry.getValue()));
                }
                bufferedWriter.write("</resources>");
                bufferedWriter.close();
                boolean g10 = adVar.g();
                if (g10) {
                    e = adVar.d();
                } else {
                    e = adVar.e();
                }
                HashMap G02 = G0(e, false);
                if (g10) {
                    G02.putAll(G0(adVar.e(), false));
                }
                f8.b("saved locale file to " + d);
                i0.g3(new m4.a1(this, i10, adVar, tL_langPackDifference, G02, runnable, 2));
                return;
            } catch (Exception e7) {
                f8.g(e7, true);
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder("saveRemoteLocaleStrings: empty difference=");
        if (tL_langPackDifference != null && !tL_langPackDifference.strings.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        sb2.append(z10);
        sb2.append("; locale is local or null=");
        if (adVar != null && !adVar.h()) {
            z11 = false;
        }
        sb2.append(z11);
        f8.b(sb2.toString());
        V0();
        at.e().k(at.f14818x4, new Object[0]);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final boolean Z0(String str) {
        int i10;
        int i11 = wp.r1(e20.f15506s0).A7;
        if (i11 > 0) {
            SharedPreferences d12 = wp.d1();
            if (!d12.getBoolean("lngpack_patched_" + str, false) && (i10 = this.W) < i11) {
                f8.d("reinstalling " + str + " langpack because of patch (" + i10 + " keys, must be at least " + i11 + ")");
                U0(str);
                return true;
            }
        }
        return false;
    }

    public final void b(String[] strArr, bd bdVar) {
        for (String str : strArr) {
            this.f15364x.put(str, bdVar);
        }
    }

    public final int c(org.telegram.messenger.ad r22, boolean r23, boolean r24, boolean r25, boolean r26, int r27, ag.j0 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dd.c(org.telegram.messenger.ad, boolean, boolean, boolean, boolean, int, ag.j0):int");
    }

    public final void d(ad adVar, boolean z10, boolean z11, int i10) {
        c(adVar, z10, z11, false, false, i10, null);
    }

    public final boolean e(File file, int i10) {
        try {
            HashMap G0 = G0(file, false);
            String str = (String) G0.get("LanguageName");
            String str2 = (String) G0.get("LanguageNameInEnglish");
            String str3 = (String) G0.get("LanguageCode");
            if (str != null && str.length() > 0 && str2 != null && str2.length() > 0 && str3 != null && str3.length() > 0 && !str.contains("&") && !str.contains("|") && !str2.contains("&") && !str2.contains("|") && !str3.contains("&") && !str3.contains("|") && !str3.contains("/") && !str3.contains("\\")) {
                File file2 = new File(w0.h(), str3.concat(".xml"));
                if (i0.E(file, file2)) {
                    ad F0 = F0("local_" + str3.toLowerCase());
                    ad adVar = F0;
                    if (F0 == null) {
                        ?? obj = new Object();
                        obj.f14591a = str;
                        obj.f14592b = str2;
                        String lowerCase = str3.toLowerCase();
                        obj.f14593c = lowerCase;
                        obj.f14594f = lowerCase;
                        obj.d = file2.getAbsolutePath();
                        this.J.add(obj);
                        this.N.put(obj.b(), obj);
                        this.O.add(obj);
                        X0();
                        adVar = obj;
                    }
                    ad adVar2 = adVar;
                    ?? obj2 = new Object();
                    obj2.a(G0);
                    this.V = new ii.b(obj2);
                    this.W = h(G0);
                    c(adVar2, true, false, true, false, i10, null);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            f8.g(e, true);
            return false;
        }
    }

    public final int f(final ad adVar, String str, boolean z10, final int i10, Runnable runnable) {
        String replace;
        String replace2;
        if (adVar != null && (adVar.i() || adVar.j())) {
            StringBuilder sb2 = new StringBuilder("applyRemoteLanguage ");
            sb2.append(str);
            sb2.append(" force=");
            sb2.append(z10);
            sb2.append(" currentAccount=");
            i0.a.p(i10, sb2);
            int[] iArr = {0};
            final ng ngVar = new ng(new int[]{0}, iArr, runnable, 27);
            if (z10) {
                U0(adVar.f14593c);
            }
            if (adVar.g() && (str == null || str.equals(adVar.e))) {
                if (adVar.f14596i != 0 && !z10) {
                    if (adVar.g()) {
                        f8.b("applyRemoteLanguage getDifference of base");
                        TLRPC.TL_langpack_getDifference tL_langpack_getDifference = new TLRPC.TL_langpack_getDifference();
                        tL_langpack_getDifference.from_version = adVar.f14596i;
                        String str2 = adVar.e;
                        if (str2 == null) {
                            replace2 = "";
                        } else {
                            replace2 = str2.replace("_", "-");
                        }
                        tL_langpack_getDifference.lang_code = replace2;
                        tL_langpack_getDifference.lang_pack = "";
                        iArr[0] = iArr[0] + 1;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getDifference, new RequestDelegate(this) {
                            public final dd f18607b;

                            {
                                this.f18607b = this;
                            }

                            @Override
                            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r5) {
                                    case 0:
                                        if (tLObject != null) {
                                            final dd ddVar = this.f18607b;
                                            final ad adVar2 = adVar;
                                            final int i11 = i10;
                                            final ng ngVar2 = ngVar;
                                            i0.g3(new Runnable(ddVar, adVar2, tLObject, i11, ngVar2, 1) {
                                                public final int f19572a;
                                                public final dd f19573b;
                                                public final ad f19574c;
                                                public final TLObject d;
                                                public final ng e;

                                                {
                                                    this.f19572a = r6;
                                                    this.e = ngVar2;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (this.f19572a) {
                                                        case 0:
                                                            ng ngVar3 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar3);
                                                            return;
                                                        case 1:
                                                            ng ngVar4 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar4);
                                                            return;
                                                        case 2:
                                                            ng ngVar5 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar5);
                                                            return;
                                                        default:
                                                            ng ngVar6 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (tLObject != null) {
                                            final dd ddVar2 = this.f18607b;
                                            final ad adVar3 = adVar;
                                            final int i12 = i10;
                                            final ng ngVar3 = ngVar;
                                            i0.g3(new Runnable(ddVar2, adVar3, tLObject, i12, ngVar3, 3) {
                                                public final int f19572a;
                                                public final dd f19573b;
                                                public final ad f19574c;
                                                public final TLObject d;
                                                public final ng e;

                                                {
                                                    this.f19572a = r6;
                                                    this.e = ngVar3;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (this.f19572a) {
                                                        case 0:
                                                            ng ngVar32 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                            return;
                                                        case 1:
                                                            ng ngVar4 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar4);
                                                            return;
                                                        case 2:
                                                            ng ngVar5 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar5);
                                                            return;
                                                        default:
                                                            ng ngVar6 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    case 2:
                                        if (tLObject != null) {
                                            final dd ddVar3 = this.f18607b;
                                            final ad adVar4 = adVar;
                                            final int i13 = i10;
                                            final ng ngVar4 = ngVar;
                                            i0.g3(new Runnable(ddVar3, adVar4, tLObject, i13, ngVar4, 0) {
                                                public final int f19572a;
                                                public final dd f19573b;
                                                public final ad f19574c;
                                                public final TLObject d;
                                                public final ng e;

                                                {
                                                    this.f19572a = r6;
                                                    this.e = ngVar4;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (this.f19572a) {
                                                        case 0:
                                                            ng ngVar32 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                            return;
                                                        case 1:
                                                            ng ngVar42 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar42);
                                                            return;
                                                        case 2:
                                                            ng ngVar5 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar5);
                                                            return;
                                                        default:
                                                            ng ngVar6 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    default:
                                        if (tLObject != null) {
                                            final dd ddVar4 = this.f18607b;
                                            final ad adVar5 = adVar;
                                            final int i14 = i10;
                                            final ng ngVar5 = ngVar;
                                            i0.g3(new Runnable(ddVar4, adVar5, tLObject, i14, ngVar5, 2) {
                                                public final int f19572a;
                                                public final dd f19573b;
                                                public final ad f19574c;
                                                public final TLObject d;
                                                public final ng e;

                                                {
                                                    this.f19572a = r6;
                                                    this.e = ngVar5;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (this.f19572a) {
                                                        case 0:
                                                            ng ngVar32 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                            return;
                                                        case 1:
                                                            ng ngVar42 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar42);
                                                            return;
                                                        case 2:
                                                            ng ngVar52 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar52);
                                                            return;
                                                        default:
                                                            ng ngVar6 = this.e;
                                                            this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, 8);
                    }
                } else {
                    f8.b("applyRemoteLanguage getLangPack of base");
                    TLRPC.TL_langpack_getLangPack tL_langpack_getLangPack = new TLRPC.TL_langpack_getLangPack();
                    String str3 = adVar.e;
                    if (str3 == null) {
                        replace = "";
                    } else {
                        replace = str3.replace("_", "-");
                    }
                    tL_langpack_getLangPack.lang_code = replace;
                    iArr[0] = iArr[0] + 1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getLangPack, new RequestDelegate(this) {
                        public final dd f18607b;

                        {
                            this.f18607b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    if (tLObject != null) {
                                        final dd ddVar = this.f18607b;
                                        final ad adVar2 = adVar;
                                        final int i11 = i10;
                                        final ng ngVar2 = ngVar;
                                        i0.g3(new Runnable(ddVar, adVar2, tLObject, i11, ngVar2, 1) {
                                            public final int f19572a;
                                            public final dd f19573b;
                                            public final ad f19574c;
                                            public final TLObject d;
                                            public final ng e;

                                            {
                                                this.f19572a = r6;
                                                this.e = ngVar2;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (this.f19572a) {
                                                    case 0:
                                                        ng ngVar32 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                        return;
                                                    case 1:
                                                        ng ngVar42 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar42);
                                                        return;
                                                    case 2:
                                                        ng ngVar52 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar52);
                                                        return;
                                                    default:
                                                        ng ngVar6 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (tLObject != null) {
                                        final dd ddVar2 = this.f18607b;
                                        final ad adVar3 = adVar;
                                        final int i12 = i10;
                                        final ng ngVar3 = ngVar;
                                        i0.g3(new Runnable(ddVar2, adVar3, tLObject, i12, ngVar3, 3) {
                                            public final int f19572a;
                                            public final dd f19573b;
                                            public final ad f19574c;
                                            public final TLObject d;
                                            public final ng e;

                                            {
                                                this.f19572a = r6;
                                                this.e = ngVar3;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (this.f19572a) {
                                                    case 0:
                                                        ng ngVar32 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                        return;
                                                    case 1:
                                                        ng ngVar42 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar42);
                                                        return;
                                                    case 2:
                                                        ng ngVar52 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar52);
                                                        return;
                                                    default:
                                                        ng ngVar6 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                case 2:
                                    if (tLObject != null) {
                                        final dd ddVar3 = this.f18607b;
                                        final ad adVar4 = adVar;
                                        final int i13 = i10;
                                        final ng ngVar4 = ngVar;
                                        i0.g3(new Runnable(ddVar3, adVar4, tLObject, i13, ngVar4, 0) {
                                            public final int f19572a;
                                            public final dd f19573b;
                                            public final ad f19574c;
                                            public final TLObject d;
                                            public final ng e;

                                            {
                                                this.f19572a = r6;
                                                this.e = ngVar4;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (this.f19572a) {
                                                    case 0:
                                                        ng ngVar32 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                        return;
                                                    case 1:
                                                        ng ngVar42 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar42);
                                                        return;
                                                    case 2:
                                                        ng ngVar52 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar52);
                                                        return;
                                                    default:
                                                        ng ngVar6 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                default:
                                    if (tLObject != null) {
                                        final dd ddVar4 = this.f18607b;
                                        final ad adVar5 = adVar;
                                        final int i14 = i10;
                                        final ng ngVar5 = ngVar;
                                        i0.g3(new Runnable(ddVar4, adVar5, tLObject, i14, ngVar5, 2) {
                                            public final int f19572a;
                                            public final dd f19573b;
                                            public final ad f19574c;
                                            public final TLObject d;
                                            public final ng e;

                                            {
                                                this.f19572a = r6;
                                                this.e = ngVar5;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (this.f19572a) {
                                                    case 0:
                                                        ng ngVar32 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                        return;
                                                    case 1:
                                                        ng ngVar42 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar42);
                                                        return;
                                                    case 2:
                                                        ng ngVar52 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar52);
                                                        return;
                                                    default:
                                                        ng ngVar6 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, 8);
                }
            }
            if (str == null || str.equals(adVar.f14593c)) {
                if (adVar.h != 0 && !z10) {
                    f8.b("applyRemoteLanguage getDifference");
                    TLRPC.TL_langpack_getDifference tL_langpack_getDifference2 = new TLRPC.TL_langpack_getDifference();
                    tL_langpack_getDifference2.from_version = adVar.h;
                    tL_langpack_getDifference2.lang_code = adVar.c();
                    tL_langpack_getDifference2.lang_pack = "";
                    iArr[0] = iArr[0] + 1;
                    return ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getDifference2, new RequestDelegate(this) {
                        public final dd f18607b;

                        {
                            this.f18607b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    if (tLObject != null) {
                                        final dd ddVar = this.f18607b;
                                        final ad adVar2 = adVar;
                                        final int i11 = i10;
                                        final ng ngVar2 = ngVar;
                                        i0.g3(new Runnable(ddVar, adVar2, tLObject, i11, ngVar2, 1) {
                                            public final int f19572a;
                                            public final dd f19573b;
                                            public final ad f19574c;
                                            public final TLObject d;
                                            public final ng e;

                                            {
                                                this.f19572a = r6;
                                                this.e = ngVar2;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (this.f19572a) {
                                                    case 0:
                                                        ng ngVar32 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                        return;
                                                    case 1:
                                                        ng ngVar42 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar42);
                                                        return;
                                                    case 2:
                                                        ng ngVar52 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar52);
                                                        return;
                                                    default:
                                                        ng ngVar6 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (tLObject != null) {
                                        final dd ddVar2 = this.f18607b;
                                        final ad adVar3 = adVar;
                                        final int i12 = i10;
                                        final ng ngVar3 = ngVar;
                                        i0.g3(new Runnable(ddVar2, adVar3, tLObject, i12, ngVar3, 3) {
                                            public final int f19572a;
                                            public final dd f19573b;
                                            public final ad f19574c;
                                            public final TLObject d;
                                            public final ng e;

                                            {
                                                this.f19572a = r6;
                                                this.e = ngVar3;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (this.f19572a) {
                                                    case 0:
                                                        ng ngVar32 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                        return;
                                                    case 1:
                                                        ng ngVar42 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar42);
                                                        return;
                                                    case 2:
                                                        ng ngVar52 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar52);
                                                        return;
                                                    default:
                                                        ng ngVar6 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                case 2:
                                    if (tLObject != null) {
                                        final dd ddVar3 = this.f18607b;
                                        final ad adVar4 = adVar;
                                        final int i13 = i10;
                                        final ng ngVar4 = ngVar;
                                        i0.g3(new Runnable(ddVar3, adVar4, tLObject, i13, ngVar4, 0) {
                                            public final int f19572a;
                                            public final dd f19573b;
                                            public final ad f19574c;
                                            public final TLObject d;
                                            public final ng e;

                                            {
                                                this.f19572a = r6;
                                                this.e = ngVar4;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (this.f19572a) {
                                                    case 0:
                                                        ng ngVar32 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                        return;
                                                    case 1:
                                                        ng ngVar42 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar42);
                                                        return;
                                                    case 2:
                                                        ng ngVar52 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar52);
                                                        return;
                                                    default:
                                                        ng ngVar6 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                default:
                                    if (tLObject != null) {
                                        final dd ddVar4 = this.f18607b;
                                        final ad adVar5 = adVar;
                                        final int i14 = i10;
                                        final ng ngVar5 = ngVar;
                                        i0.g3(new Runnable(ddVar4, adVar5, tLObject, i14, ngVar5, 2) {
                                            public final int f19572a;
                                            public final dd f19573b;
                                            public final ad f19574c;
                                            public final TLObject d;
                                            public final ng e;

                                            {
                                                this.f19572a = r6;
                                                this.e = ngVar5;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (this.f19572a) {
                                                    case 0:
                                                        ng ngVar32 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                        return;
                                                    case 1:
                                                        ng ngVar42 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar42);
                                                        return;
                                                    case 2:
                                                        ng ngVar52 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar52);
                                                        return;
                                                    default:
                                                        ng ngVar6 = this.e;
                                                        this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, 8);
                }
                for (int i11 = 0; i11 < 4; i11++) {
                    ConnectionsManager.setLangCode(adVar.c());
                }
                f8.b("applyRemoteLanguage getLangPack");
                TLRPC.TL_langpack_getLangPack tL_langpack_getLangPack2 = new TLRPC.TL_langpack_getLangPack();
                tL_langpack_getLangPack2.lang_code = adVar.c();
                iArr[0] = iArr[0] + 1;
                return ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getLangPack2, new RequestDelegate(this) {
                    public final dd f18607b;

                    {
                        this.f18607b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                if (tLObject != null) {
                                    final dd ddVar = this.f18607b;
                                    final ad adVar2 = adVar;
                                    final int i112 = i10;
                                    final ng ngVar2 = ngVar;
                                    i0.g3(new Runnable(ddVar, adVar2, tLObject, i112, ngVar2, 1) {
                                        public final int f19572a;
                                        public final dd f19573b;
                                        public final ad f19574c;
                                        public final TLObject d;
                                        public final ng e;

                                        {
                                            this.f19572a = r6;
                                            this.e = ngVar2;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (this.f19572a) {
                                                case 0:
                                                    ng ngVar32 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                    return;
                                                case 1:
                                                    ng ngVar42 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar42);
                                                    return;
                                                case 2:
                                                    ng ngVar52 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar52);
                                                    return;
                                                default:
                                                    ng ngVar6 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject != null) {
                                    final dd ddVar2 = this.f18607b;
                                    final ad adVar3 = adVar;
                                    final int i12 = i10;
                                    final ng ngVar3 = ngVar;
                                    i0.g3(new Runnable(ddVar2, adVar3, tLObject, i12, ngVar3, 3) {
                                        public final int f19572a;
                                        public final dd f19573b;
                                        public final ad f19574c;
                                        public final TLObject d;
                                        public final ng e;

                                        {
                                            this.f19572a = r6;
                                            this.e = ngVar3;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (this.f19572a) {
                                                case 0:
                                                    ng ngVar32 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                    return;
                                                case 1:
                                                    ng ngVar42 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar42);
                                                    return;
                                                case 2:
                                                    ng ngVar52 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar52);
                                                    return;
                                                default:
                                                    ng ngVar6 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject != null) {
                                    final dd ddVar3 = this.f18607b;
                                    final ad adVar4 = adVar;
                                    final int i13 = i10;
                                    final ng ngVar4 = ngVar;
                                    i0.g3(new Runnable(ddVar3, adVar4, tLObject, i13, ngVar4, 0) {
                                        public final int f19572a;
                                        public final dd f19573b;
                                        public final ad f19574c;
                                        public final TLObject d;
                                        public final ng e;

                                        {
                                            this.f19572a = r6;
                                            this.e = ngVar4;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (this.f19572a) {
                                                case 0:
                                                    ng ngVar32 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                    return;
                                                case 1:
                                                    ng ngVar42 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar42);
                                                    return;
                                                case 2:
                                                    ng ngVar52 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar52);
                                                    return;
                                                default:
                                                    ng ngVar6 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                return;
                            default:
                                if (tLObject != null) {
                                    final dd ddVar4 = this.f18607b;
                                    final ad adVar5 = adVar;
                                    final int i14 = i10;
                                    final ng ngVar5 = ngVar;
                                    i0.g3(new Runnable(ddVar4, adVar5, tLObject, i14, ngVar5, 2) {
                                        public final int f19572a;
                                        public final dd f19573b;
                                        public final ad f19574c;
                                        public final TLObject d;
                                        public final ng e;

                                        {
                                            this.f19572a = r6;
                                            this.e = ngVar5;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (this.f19572a) {
                                                case 0:
                                                    ng ngVar32 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar32);
                                                    return;
                                                case 1:
                                                    ng ngVar42 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar42);
                                                    return;
                                                case 2:
                                                    ng ngVar52 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar52);
                                                    return;
                                                default:
                                                    ng ngVar6 = this.e;
                                                    this.f19573b.Y0(this.f19574c, (TLRPC.TL_langPackDifference) this.d, ngVar6);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                return;
                        }
                    }
                }, 8);
            }
        }
        return 0;
    }

    public final FastDateFormat g0() {
        if (this.f15353l == null) {
            synchronized (this) {
                try {
                    if (this.f15353l == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f15353l = k(locale, N0(2131742811, "chatDate", null), "d MMMM");
                    }
                } finally {
                }
            }
        }
        return this.f15353l;
    }

    public final FastDateFormat h0() {
        if (this.f15355n == null) {
            synchronized (this) {
                try {
                    if (this.f15355n == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f15355n = k(locale, N0(2131742809, "chatFullDate", null), "d MMMM yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f15355n;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dd.i():void");
    }

    public final void j(int i10) {
        ad adVar = this.B;
        if (adVar != null && !this.P && Z0(adVar.f14593c)) {
            if (v2.f18578a) {
                f8.b("reload locale because locale file is not enough");
            }
            i0.g3(new wc(this, i10, 2));
        }
    }

    public final Locale k0() {
        return this.f15365y;
    }

    public final FastDateFormat l0() {
        String N0;
        String str;
        if (this.f15351j == null) {
            synchronized (this) {
                try {
                    if (this.f15351j == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        if (Z) {
                            N0 = N0(2131742804, "formatterBannedUntil24H", null);
                        } else {
                            N0 = N0(2131742805, "formatterBannedUntil12H", null);
                        }
                        if (Z) {
                            str = "MMM dd yyyy, HH:mm";
                        } else {
                            str = "MMM dd yyyy, h:mm a";
                        }
                        this.f15351j = k(locale, N0, str);
                    }
                } finally {
                }
            }
        }
        return this.f15351j;
    }

    public final FastDateFormat m0() {
        String N0;
        String str;
        if (this.f15352k == null) {
            synchronized (this) {
                try {
                    if (this.f15352k == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        if (Z) {
                            N0 = N0(2131742802, "formatterBannedUntilThisYear24H", null);
                        } else {
                            N0 = N0(2131742803, "formatterBannedUntilThisYear12H", null);
                        }
                        if (Z) {
                            str = "MMM dd, HH:mm";
                        } else {
                            str = "MMM dd, h:mm a";
                        }
                        this.f15352k = k(locale, N0, str);
                    }
                } finally {
                }
            }
        }
        return this.f15352k;
    }

    public final FastDateFormat n0() {
        if (this.f15361t == null) {
            synchronized (this) {
                try {
                    if (this.f15361t == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f15361t = k(locale, N0(2131742801, "formatterBoostExpired", null), "MMM dd, yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f15361t;
    }

    public final FastDateFormat o0() {
        String N0;
        String str;
        if (this.f15345a == null) {
            synchronized (this) {
                try {
                    if (this.f15345a == null) {
                        Locale locale = this.f15365y;
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
                        if (Z) {
                            N0 = N0(2131742799, "formatterDay24H", null);
                        } else {
                            N0 = N0(2131742800, "formatterDay12H", null);
                        }
                        if (Z) {
                            str = "HH:mm";
                        } else {
                            str = "h:mm a";
                        }
                        this.f15345a = k(locale, N0, str);
                    }
                } finally {
                }
            }
        }
        return this.f15345a;
    }

    public final String p(long j10, String str) {
        return q(j10, true, true, false, str);
    }

    public final FastDateFormat p0() {
        if (this.f15348f == null) {
            synchronized (this) {
                try {
                    if (this.f15348f == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f15348f = k(locale, N0(2131742793, "formatterMonth", null), "dd MMM");
                    }
                } finally {
                }
            }
        }
        return this.f15348f;
    }

    public final String q(long j10, boolean z10, boolean z11, boolean z12, String str) {
        boolean z13;
        double d;
        int length;
        String upperCase = str.toUpperCase();
        if (j10 < 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        long abs = Math.abs(j10);
        Currency currency = Currency.getInstance(upperCase);
        upperCase.getClass();
        char c10 = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c10 = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c10 = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c10 = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c10 = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c10 = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c10 = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c10 = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c10 = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c10 = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c10 = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c10 = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c10 = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c10 = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c10 = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c10 = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c10 = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c10 = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c10 = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c10 = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c10 = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c10 = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c10 = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c10 = 29;
                    break;
                }
                break;
            case 87254:
                if (upperCase.equals("XTR")) {
                    c10 = 30;
                    break;
                }
                break;
        }
        String str2 = " %.2f";
        String str3 = " %.0f";
        switch (c10) {
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
                double d10 = ((float) abs) / 100.0f;
                if (z10 && abs % 100 == 0) {
                    str2 = " %.0f";
                }
                d = d10;
                break;
            case 18:
                d = abs / 10.0d;
                str2 = " %.1f";
                break;
            default:
                d = abs / 100.0d;
                break;
        }
        if (z11) {
            str3 = str2;
        }
        String str4 = "";
        if (currency != null) {
            Locale locale = this.f15365y;
            if (locale == null) {
                locale = this.f15366z;
            }
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
            currencyInstance.setCurrency(currency);
            if (z12) {
                currencyInstance.setGroupingUsed(false);
            }
            if (!z11 || (z10 && upperCase.equals("IRR"))) {
                currencyInstance.setMaximumFractionDigits(0);
            }
            StringBuilder sb2 = new StringBuilder();
            if (z13) {
                str4 = "-";
            }
            sb2.append(str4);
            sb2.append(currencyInstance.format(d));
            String sb3 = sb2.toString();
            int indexOf = sb3.indexOf(upperCase);
            if (indexOf >= 0 && (length = upperCase.length() + indexOf) < sb3.length() && sb3.charAt(length) != ' ') {
                return sb3.substring(0, length) + " " + sb3.substring(length);
            }
            return sb3;
        }
        if (z13) {
            str4 = "-";
        }
        return str4.concat(String.format(Locale.US, upperCase.concat(str3), Double.valueOf(d)));
    }

    public final FastDateFormat q0() {
        String N0;
        String str;
        if (this.f15346b == null) {
            synchronized (this) {
                try {
                    if (this.f15346b == null) {
                        Locale locale = this.f15365y;
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
                        if (Z) {
                            N0 = N0(2131742797, "formatterDayWithSeconds24H", null);
                        } else {
                            N0 = N0(2131742798, "formatterDayWithSeconds12H", null);
                        }
                        if (Z) {
                            str = "HH:mm:ss";
                        } else {
                            str = "h:mm:ss a";
                        }
                        this.f15346b = k(locale, N0, str);
                    }
                } finally {
                }
            }
        }
        return this.f15346b;
    }

    public final FastDateFormat r0() {
        if (this.f15360s == null) {
            synchronized (this) {
                try {
                    if (this.f15360s == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f15360s = k(locale, N0(2131742796, "formatterGiveawayCard", null), "dd MMM yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f15360s;
    }

    public final FastDateFormat s0() {
        if (this.f15362u == null) {
            synchronized (this) {
                try {
                    if (this.f15362u == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f15362u = k(locale, N0(2131742795, "formatterGiveawayMonthDay", null), "MMMM dd");
                    }
                } finally {
                }
            }
        }
        return this.f15362u;
    }

    public final FastDateFormat t0() {
        if (this.v == null) {
            synchronized (this) {
                try {
                    if (this.v == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.v = k(locale, N0(2131742794, "formatterGiveawayMonthDayYear", null), "MMMM dd, yyyy");
                    }
                } finally {
                }
            }
        }
        return this.v;
    }

    public final FastDateFormat u0() {
        if (this.f15358q == null) {
            synchronized (this) {
                try {
                    if (this.f15358q == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f15358q = k(locale, N0(2131742790, "formatterMonthYear", null), "MMM yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f15358q;
    }

    public final FastDateFormat v0() {
        if (this.f15356o == null) {
            synchronized (this) {
                try {
                    if (this.f15356o == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f15356o = k(locale, N0(2131742807, "formatDateSchedule", null), "MMM d");
                    }
                } finally {
                }
            }
        }
        return this.f15356o;
    }

    public final FastDateFormat w0(int i10) {
        if (i10 >= 0) {
            FastDateFormat[] fastDateFormatArr = this.f15363w;
            if (i10 < fastDateFormatArr.length) {
                if (fastDateFormatArr[i10] == null) {
                    Locale locale = this.f15365y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    switch (i10) {
                        case 0:
                            fastDateFormatArr[i10] = k(locale, N0(2131745604, "SendTodayAt", null), "'Send today at' HH:mm");
                            break;
                        case 1:
                            fastDateFormatArr[i10] = k(locale, N0(2131745646, "SendDayAt", null), "'Send on' MMM d 'at' HH:mm");
                            break;
                        case 2:
                            fastDateFormatArr[i10] = k(locale, N0(2131745645, "SendDayYearAt", null), "'Send on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 3:
                            fastDateFormatArr[i10] = k(locale, N0(2131746338, "RemindTodayAt", null), "'Remind today at' HH:mm");
                            break;
                        case 4:
                            fastDateFormatArr[i10] = k(locale, N0(2131746340, "RemindDayAt", null), "'Remind on' MMM d 'at' HH:mm");
                            break;
                        case 5:
                            fastDateFormatArr[i10] = k(locale, N0(2131746339, "RemindDayYearAt", null), "'Remind on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 6:
                            fastDateFormatArr[i10] = k(locale, N0(2131744923, "StartTodayAt", null), "'Start today at' HH:mm");
                            break;
                        case 7:
                            fastDateFormatArr[i10] = k(locale, N0(2131744932, "StartDayAt", null), "'Start on' MMM d 'at' HH:mm");
                            break;
                        case 8:
                            fastDateFormatArr[i10] = k(locale, N0(2131744931, "StartDayYearAt", null), "'Start on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 9:
                            fastDateFormatArr[i10] = k(locale, N0(2131744926, "StartShortTodayAt", null), "'Today,' HH:mm");
                            break;
                        case 10:
                            fastDateFormatArr[i10] = k(locale, N0(2131744928, "StartShortDayAt", null), "MMM d',' HH:mm");
                            break;
                        case 11:
                            fastDateFormatArr[i10] = k(locale, N0(2131744927, "StartShortDayYearAt", null), "MMM d yyyy, HH:mm");
                            break;
                        case 12:
                            fastDateFormatArr[i10] = k(locale, N0(2131744915, "StartsTodayAt", null), "'Starts today at' HH:mm");
                            break;
                        case 13:
                            fastDateFormatArr[i10] = k(locale, N0(2131744917, "StartsDayAt", null), "'Starts on' MMM d 'at' HH:mm");
                            break;
                        case 14:
                            fastDateFormatArr[i10] = k(locale, N0(2131744916, "StartsDayYearAt", null), "'Starts on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 15:
                            fastDateFormatArr[i10] = k(locale, N0(2131746592, "PublishTodayAt", null), "'Publish today at' HH:mm");
                            break;
                        case 16:
                            fastDateFormatArr[i10] = k(locale, N0(2131746594, "PublishDayAt", null), "'Publish on' MMM d 'at' HH:mm");
                            break;
                        case 17:
                            fastDateFormatArr[i10] = k(locale, N0(2131746593, "PublishDayYearAt", null), "'Publish on' MMM d yyyy 'at' HH:mm");
                            break;
                    }
                }
                return fastDateFormatArr[i10];
            }
        }
        return null;
    }

    public final FastDateFormat x0() {
        if (this.f15357p == null) {
            synchronized (this) {
                try {
                    if (this.f15357p == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f15357p = k(locale, N0(2131742806, "formatDateScheduleYear", null), "MMM d yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f15357p;
    }

    public final FastDateFormat y0() {
        String N0;
        String str;
        if (this.f15350i == null) {
            synchronized (this) {
                try {
                    if (this.f15350i == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        if (Z) {
                            N0 = N0(2131742787, "formatterStats24H", null);
                        } else {
                            N0 = N0(2131742788, "formatterStats12H", null);
                        }
                        if (Z) {
                            str = "MMM dd yyyy, HH:mm";
                        } else {
                            str = "MMM dd yyyy, h:mm a";
                        }
                        this.f15350i = k(locale, N0, str);
                    }
                } finally {
                }
            }
        }
        return this.f15350i;
    }

    public final FastDateFormat z0() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        Locale locale = this.f15365y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.d = k(locale, N0(2131742786, "formatterWeek", null), "EEE");
                    }
                } finally {
                }
            }
        }
        return this.d;
    }
}
