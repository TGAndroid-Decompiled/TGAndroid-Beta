package org.telegram.messenger;

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
import android.text.format.DateUtils;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u31;
public final class hd {
    public static boolean f22878a0 = false;
    public static int f22879b0 = 1;
    public static boolean f22880c0 = false;
    public static volatile hd f22881d0;
    public static final char[] f22882e0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final char[][] f22883f0 = {new char[]{1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641}, new char[]{1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785}, new char[]{2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415}, new char[]{2790, 2791, 2792, 2793, 2794, 2795, 2796, 2797, 2798, 2799}, new char[]{2662, 2663, 2664, 2665, 2666, 2667, 2668, 2669, 2670, 2671}, new char[]{2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543}, new char[]{3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311}, new char[]{2918, 2919, 2920, 2921, 2922, 2923, 2924, 2925, 2926, 2927}, new char[]{3430, 3431, 3432, 3433, 3434, 3435, 3436, 3437, 3438, 3439}, new char[]{3046, 3047, 3048, 3049, 3050, 3051, 3052, 3053, 3054, 3055}, new char[]{3174, 3175, 3176, 3177, 3178, 3179, 3180, 3181, 3182, 3183}, new char[]{4160, 4161, 4162, 4163, 4164, 4165, 4166, 4167, 4168, 4169}, new char[]{3872, 3873, 3874, 3875, 3876, 3877, 3878, 3879, 3880, 3881}, new char[]{6160, 6161, 6162, 6163, 6164, 6165, 6166, 6167, 6168, 6169}, new char[]{6112, 6113, 6114, 6115, 6116, 6117, 6118, 6119, 6120, 6121}, new char[]{3664, 3665, 3666, 3667, 3668, 3669, 3670, 3671, 3672, 3673}, new char[]{3792, 3793, 3794, 3795, 3796, 3797, 3798, 3799, 3800, 3801}, new char[]{43472, 43473, 43474, 43475, 43476, 43477, 43478, 43479, 43480, 43481}};
    public static Boolean f22884g0;
    public fd A;
    public ed B;
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
    public q5 R;
    public final HashMap S;
    public final HashMap T;
    public si.b U;
    public volatile Locale V;
    public volatile si.b W;
    public volatile boolean X;
    public si.b Y;
    public int Z;
    public volatile FastDateFormat f22885a;
    public volatile FastDateFormat f22886b;
    public volatile FastDateFormat f22887c;
    public volatile FastDateFormat d;
    public volatile FastDateFormat f22888e;
    public volatile FastDateFormat f22889f;
    public volatile FastDateFormat f22890g;
    public volatile FastDateFormat h;
    public volatile FastDateFormat f22891i;
    public volatile FastDateFormat f22892j;
    public volatile FastDateFormat f22893k;
    public volatile FastDateFormat f22894l;
    public volatile FastDateFormat f22895m;
    public volatile FastDateFormat f22896n;
    public volatile FastDateFormat f22897o;
    public volatile FastDateFormat f22898p;
    public volatile FastDateFormat f22899q;
    public volatile FastDateFormat f22900r;
    public volatile FastDateFormat f22901s;
    public volatile FastDateFormat f22902t;
    public volatile FastDateFormat f22903u;
    public volatile FastDateFormat v;
    public Locale f22906y;
    public Locale f22907z;
    public final FastDateFormat[] f22904w = new FastDateFormat[18];
    public final HashMap f22905x = new HashMap();
    public boolean D = false;

    public hd() {
        boolean z9 = false;
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
        si.b bVar = si.b.f55247c;
        this.W = bVar;
        this.Y = bVar;
        b(new String[]{"bem", "brx", "da", "de", "el", "en", "eo", "es", "et", "fi", "fo", "gl", "he", "iw", "it", "nb", "nl", "nn", "no", "sv", "af", "bg", "bn", "ca", "eu", "fur", "fy", "gu", "ha", "is", "ku", "lb", "ml", "mr", "nah", "ne", "om", "or", "pa", "pap", "ps", "so", "sq", "sw", "ta", "te", "tk", "ur", "zu", "mn", "gsw", "chr", "rm", "pt", "an", "ast"}, new fd(11));
        b(new String[]{"cs", "sk"}, new fd(3));
        b(new String[]{"ff", "fr", "kab"}, new fd(4));
        b(new String[]{"ru", "uk", "be"}, new fd(1));
        b(new String[]{"sr", "hr", "bs", "sh"}, new fd(14));
        b(new String[]{"lv"}, new fd(6));
        b(new String[]{"lt"}, new fd(7));
        b(new String[]{"pl"}, new fd(12));
        b(new String[]{"ro", "mo"}, new fd(13));
        b(new String[]{"sl"}, new fd(15));
        b(new String[]{"ar"}, new fd(0));
        b(new String[]{"mk"}, new fd(8));
        b(new String[]{"cy"}, new fd(18));
        b(new String[]{"br"}, new fd(2));
        b(new String[]{"lag"}, new fd(5));
        b(new String[]{"shi"}, new fd(16));
        b(new String[]{"mt"}, new fd(9));
        b(new String[]{"ga", "se", "sma", "smi", "smj", "smn", "sms"}, new fd(17));
        b(new String[]{"ak", "am", "bh", "fil", "tl", "guw", "hi", "ln", "mg", "nso", "ti", "wa"}, new fd(19));
        b(new String[]{"az", "bm", "fa", "ig", "hu", "ja", "kde", "kea", "ko", "my", "ses", "sg", "to", "tr", "vi", "wo", "yo", "zh", "bo", "dz", "id", "jv", "jw", "ka", "km", "kn", "ms", "th", "in"}, new fd(10));
        ?? obj = new Object();
        obj.f22181a = "English";
        obj.f22182b = "English";
        obj.f22185f = "en";
        obj.f22183c = "en";
        ed edVar = null;
        obj.d = null;
        obj.f22188j = true;
        arrayList.add(obj);
        hashMap.put(obj.f22183c, obj);
        ?? obj2 = new Object();
        obj2.f22181a = "Italiano";
        obj2.f22182b = "Italian";
        obj2.f22185f = "it";
        obj2.f22183c = "it";
        obj2.d = null;
        obj2.f22188j = true;
        arrayList.add(obj2);
        hashMap.put(obj2.f22183c, obj2);
        ?? obj3 = new Object();
        obj3.f22181a = "Español";
        obj3.f22182b = "Spanish";
        obj3.f22185f = "es";
        obj3.f22183c = "es";
        obj3.f22188j = true;
        arrayList.add(obj3);
        hashMap.put(obj3.f22183c, obj3);
        ?? obj4 = new Object();
        obj4.f22181a = "Deutsch";
        obj4.f22182b = "German";
        obj4.f22185f = "de";
        obj4.f22183c = "de";
        obj4.d = null;
        obj4.f22188j = true;
        arrayList.add(obj4);
        hashMap.put(obj4.f22183c, obj4);
        ?? obj5 = new Object();
        obj5.f22181a = "Nederlands";
        obj5.f22182b = "Dutch";
        obj5.f22185f = "nl";
        obj5.f22183c = "nl";
        obj5.d = null;
        obj5.f22188j = true;
        arrayList.add(obj5);
        hashMap.put(obj5.f22183c, obj5);
        ?? obj6 = new Object();
        obj6.f22181a = "العربية";
        obj6.f22182b = "Arabic";
        obj6.f22185f = "ar";
        obj6.f22183c = "ar";
        obj6.d = null;
        obj6.f22188j = true;
        obj6.f22186g = true;
        arrayList.add(obj6);
        hashMap.put(obj6.f22183c, obj6);
        ?? obj7 = new Object();
        obj7.f22181a = "Português (Brasil)";
        obj7.f22182b = "Portuguese (Brazil)";
        obj7.f22185f = "pt_br";
        obj7.f22183c = "pt_br";
        obj7.d = null;
        obj7.f22188j = true;
        arrayList.add(obj7);
        hashMap.put(obj7.f22183c, obj7);
        ?? obj8 = new Object();
        obj8.f22181a = "한국어";
        obj8.f22182b = "Korean";
        obj8.f22185f = "ko";
        obj8.f22183c = "ko";
        obj8.d = null;
        obj8.f22188j = true;
        arrayList.add(obj8);
        hashMap.put(obj8.f22183c, obj8);
        ?? obj9 = new Object();
        obj9.f22181a = "Українська";
        obj9.f22182b = "Ukrainian";
        obj9.f22185f = "uk";
        obj9.f22183c = "uk";
        obj9.d = null;
        obj9.f22188j = true;
        arrayList.add(obj9);
        hashMap.put(obj9.f22183c, obj9);
        ?? obj10 = new Object();
        obj10.f22181a = "Русский";
        obj10.f22182b = "Russian";
        obj10.f22185f = "ru";
        obj10.f22183c = "ru";
        obj10.d = null;
        obj10.f22188j = true;
        arrayList.add(obj10);
        hashMap.put(obj10.f22183c, obj10);
        SharedPreferences sharedPreferences = t0.f25563b.getSharedPreferences("langconfig", 0);
        String string = sharedPreferences.getString("locales", null);
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split("&")) {
                ed a10 = ed.a(str);
                if (a10 != null) {
                    this.O.add(a10);
                }
            }
        }
        String string2 = sharedPreferences.getString("remote", null);
        if (!TextUtils.isEmpty(string2)) {
            for (String str2 : string2.split("&")) {
                ed a11 = ed.a(str2);
                a11.f22183c = a11.f22183c.replace("-", "_");
                if (!this.M.containsKey(a11.b())) {
                    this.L.add(a11);
                    this.M.put(a11.b(), a11);
                }
            }
        }
        String string3 = sharedPreferences.getString("unofficial", null);
        if (!TextUtils.isEmpty(string3)) {
            for (String str3 : string3.split("&")) {
                ed a12 = ed.a(str3);
                if (a12 != null) {
                    a12.f22183c = a12.f22183c.replace("-", "_");
                    this.K.add(a12);
                }
            }
        }
        if (this.L.isEmpty()) {
            g0.h3(new Runnable(this) {
                public final hd f25448b;

                {
                    this.f25448b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f25448b.V0(p10.f24467s0, true);
                            return;
                        default:
                            hd hdVar = this.f25448b;
                            hdVar.getClass();
                            hdVar.F = hd.Q0();
                            return;
                    }
                }
            });
        }
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            ed edVar2 = (ed) this.O.get(i7);
            this.J.add(edVar2);
            this.N.put(edVar2.b(), edVar2);
        }
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            ed edVar3 = (ed) this.L.get(i10);
            ed G0 = G0(edVar3.b());
            if (G0 != null) {
                G0.d = edVar3.d;
                G0.h = edVar3.h;
                G0.f22187i = edVar3.f22187i;
                G0.f22189k = edVar3.f22189k;
                this.L.set(i10, G0);
            } else {
                this.J.add(edVar3);
                this.N.put(edVar3.b(), edVar3);
            }
        }
        for (int i11 = 0; i11 < this.K.size(); i11++) {
            ed edVar4 = (ed) this.K.get(i11);
            ed G02 = G0(edVar4.b());
            if (G02 != null) {
                G02.d = edVar4.d;
                G02.h = edVar4.h;
                G02.f22187i = edVar4.f22187i;
                G02.f22189k = edVar4.f22189k;
                this.K.set(i11, G02);
            } else {
                this.N.put(edVar4.b(), edVar4);
            }
        }
        this.f22907z = Locale.getDefault();
        f22880c0 = DateFormat.is24HourFormat(t0.f25563b);
        try {
            String string4 = qp.e1().getString("language", null);
            if (string4 != null && (edVar = G0(string4)) != null) {
                z9 = true;
            }
            if (edVar == null && this.f22907z.getLanguage() != null) {
                edVar = G0(this.f22907z.getLanguage());
            }
            if (edVar == null && (edVar = G0(I0(this.f22907z))) == null) {
                edVar = G0("en");
            }
            d(edVar, z9, true, p10.f24467s0);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                t0.f25563b.registerReceiver(new androidx.mediarouter.app.f(this, 7), intentFilter, 4);
            } else {
                t0.f25563b.registerReceiver(new androidx.mediarouter.app.f(this, 7), intentFilter);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        g0.h3(new Runnable(this) {
            public final hd f25448b;

            {
                this.f25448b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f25448b.V0(p10.f24467s0, true);
                        return;
                    default:
                        hd hdVar = this.f25448b;
                        hdVar.getClass();
                        hdVar.F = hd.Q0();
                        return;
                }
            }
        });
    }

    public static String A(TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate, long j3, Locale locale, boolean z9) {
        boolean z10;
        String str;
        String str2;
        String str3;
        String format;
        long j10 = tL_messageEntityFormattedDate.date * 1000;
        if (tL_messageEntityFormattedDate.relative && !z9) {
            long j11 = j10 - j3;
            if (Build.VERSION.SDK_INT >= 24) {
                return gd.a(j11, locale);
            }
            return DateUtils.getRelativeTimeSpanString(j10, j3, 1000L, 262144).toString();
        }
        if (tL_messageEntityFormattedDate.flags == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10 | z9;
        String str4 = "";
        if (!tL_messageEntityFormattedDate.day_of_week) {
            str = "";
        } else {
            str = E0().B0().format(j10);
        }
        if (z11) {
            str2 = E0().s0().format(j10);
        } else if (tL_messageEntityFormattedDate.long_date) {
            str2 = E0().h0().format(j10);
        } else if (!tL_messageEntityFormattedDate.short_date) {
            str2 = "";
        } else {
            str2 = E0().C0().format(j10);
        }
        if (z11) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j10);
            if (calendar.get(13) != 0) {
                format = E0().r0().format(j10);
            } else {
                format = E0().p0().format(j10);
            }
            str4 = format;
        } else if (tL_messageEntityFormattedDate.long_time) {
            str4 = E0().r0().format(j10);
        } else if (tL_messageEntityFormattedDate.short_time) {
            str4 = E0().p0().format(j10);
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        boolean isEmpty3 = TextUtils.isEmpty(str4);
        if (isEmpty2 && isEmpty3) {
            return str;
        }
        if (!isEmpty2 && !isEmpty3) {
            str3 = a0(null, null, 2131742784, str2, str4);
        } else {
            if (isEmpty2) {
                str2 = str4;
            }
            str3 = str2;
        }
        if (!isEmpty) {
            return a0(null, null, 2131746333, str, str3);
        }
        return str3;
    }

    public static String B(long j3) {
        String a02;
        long j10 = j3 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                a02 = a0(null, null, 2131742784, E0().q0().format(new Date(j10)), E0().p0().format(new Date(j10)));
            } else {
                a02 = a0(null, null, 2131742784, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10)));
            }
            return a0(null, null, 2131752335, a02);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String C(int i7) {
        int i10;
        int i11;
        int i12 = (i7 / 60) / 60;
        int i13 = i7 - (i12 * 3600);
        int i14 = i13 / 60;
        int i15 = i13 - (i14 * 60);
        if (i12 != 0) {
            if (i14 > 30) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            return String.format("%dh", Integer.valueOf(i12 + i11));
        } else if (i14 != 0) {
            if (i15 > 30) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            return String.format("%d", Integer.valueOf(i14 + i10));
        } else {
            return String.format("%d", Integer.valueOf(i15));
        }
    }

    public static String D(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i7 && i10 == i12) {
                int currentTime = ((int) (ConnectionsManager.getInstance(p10.f24467s0).getCurrentTime() - (j10 / 1000))) / 60;
                if (currentTime < 1) {
                    return M0(2131748744, null);
                }
                if (currentTime < 60) {
                    return G(currentTime, "UpdatedMinutes", new Object[0]);
                }
                return a0(null, null, 2131748745, a0("TodayAtFormatted", null, 2131744112, E0().p0().format(new Date(j10))));
            } else if (i11 + 1 == i7 && i10 == i12) {
                return a0(null, null, 2131748745, a0("YesterdayAtFormatted", null, 2131742844, E0().p0().format(new Date(j10))));
            } else {
                if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                    return a0(null, null, 2131748745, a0(null, null, 2131742784, E0().q0().format(new Date(j10)), E0().p0().format(new Date(j10))));
                }
                return a0(null, null, 2131748745, a0(null, null, 2131742784, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10))));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String E(long j3, char c10) {
        if (j3 < 0) {
            return jg.g.m(-j3, c10, new StringBuilder("-"));
        }
        StringBuilder sb2 = new StringBuilder(String.format("%d", Long.valueOf(j3)));
        for (int length = sb2.length() - 3; length > 0; length -= 3) {
            sb2.insert(length, c10);
        }
        return sb2.toString();
    }

    public static hd E0() {
        hd hdVar;
        hd hdVar2 = f22881d0;
        if (hdVar2 == null) {
            synchronized (hd.class) {
                try {
                    hdVar = f22881d0;
                    if (hdVar == null) {
                        hdVar = new hd();
                        f22881d0 = hdVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hdVar;
        }
        return hdVar2;
    }

    public static CharSequence F(String str, int i7, CharSequence... charSequenceArr) {
        if (str.length() != 0 && E0().A != null) {
            E0();
            String D = a8.p0.D(str, "_", f1(E0().A.a(i7)));
            Object[] objArr = new Object[charSequenceArr.length + 1];
            objArr[0] = Integer.valueOf(i7);
            System.arraycopy(charSequenceArr, 0, objArr, 1, charSequenceArr.length);
            return V(D, str.concat("_other"), 0, objArr);
        }
        return "LOC_ERR:".concat(str);
    }

    public static String F0(String str) {
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

    public static String G(int i7, String str, Object... objArr) {
        if (str.length() != 0 && E0().A != null) {
            E0();
            String D = a8.p0.D(str, "_", f1(E0().A.a(i7)));
            Object[] objArr2 = new Object[objArr.length + 1];
            objArr2[0] = Integer.valueOf(i7);
            System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
            return a0(D, str.concat("_other"), 0, objArr2);
        }
        return "LOC_ERR:".concat(str);
    }

    public static String H(char c10, String str, int i7) {
        return K(str, i7, c10, new Object[0]);
    }

    public static String I(int i7, String str) {
        return H(',', str, i7);
    }

    public static String I0(Locale locale) {
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

    public static String J(int i7, String str, Object... objArr) {
        return K(str, i7, ',', objArr);
    }

    public static String J0() {
        ed edVar = E0().B;
        if (edVar != null) {
            return edVar.c();
        }
        Locale locale = E0().f22906y;
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

    public static String K(String str, int i7, char c10, Object... objArr) {
        StringBuilder sb2;
        try {
            if (str.length() != 0 && E0().A != null) {
                E0();
                String str2 = str + "_" + f1(E0().A.a(i7));
                StringBuilder sb3 = new StringBuilder(String.format("%d", Integer.valueOf(i7)));
                for (int length = sb3.length() - 3; length > 0; length -= 3) {
                    sb3.insert(length, c10);
                }
                boolean z9 = r2.f25199a;
                String b10 = E0().Y.b(str2);
                if (b10 == null) {
                    b10 = E0().Y.b(str + "_other");
                }
                if (b10 == null) {
                    try {
                        hd E0 = E0();
                        E0.i();
                        b10 = E0.W.b(str2);
                    } catch (Exception unused) {
                    }
                }
                if (b10 == null) {
                    hd E02 = E0();
                    E02.i();
                    b10 = E02.W.b(str + "_other");
                }
                String replace = b10.replace("%d", "%1$s").replace("%1$d", "%1$s");
                int length2 = objArr.length + 1;
                Object[] objArr2 = new Object[length2];
                for (int i10 = 0; i10 < length2; i10++) {
                    if (i10 == 0) {
                        sb2 = sb3;
                    } else {
                        sb2 = objArr[i10 - 1];
                    }
                    objArr2[i10] = sb2;
                }
                if (E0().f22906y != null) {
                    return String.format(E0().f22906y, replace, objArr2);
                }
                return String.format(replace, objArr2);
            }
            return "LOC_ERR:".concat(str);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: ".concat(str);
        }
    }

    public static String K0(int i7, String str) {
        if (str.length() != 0 && E0().A != null) {
            E0();
            return E0().O0(0, a8.p0.D(str, "_", f1(E0().A.a(i7))), str.concat("_other"));
        }
        return "LOC_ERR:".concat(str);
    }

    public static String L(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i7 && i10 == i12) {
                return a0(null, null, 2131747201, E0().p0().format(new Date(j10)));
            }
            if (i11 + 1 == i7 && i10 == i12) {
                return a0(null, null, 2131747200, E0().p0().format(new Date(j10)));
            }
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return a0(null, null, 2131747202, E0().q0().format(new Date(j10)), E0().p0().format(new Date(j10)));
            }
            return a0(null, null, 2131747202, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String L0(int i7) {
        return M0(i7, null);
    }

    public static String M(int i7, boolean z9) {
        String G;
        int i10;
        if (i7 < 86400) {
            G = R(i7);
        } else {
            G = G(i7 / 86400, "Days", new Object[0]);
        }
        if (z9) {
            i10 = 2131747159;
        } else {
            i10 = 2131747171;
        }
        return a0(null, null, i10, G);
    }

    public static String M0(int i7, String str) {
        return E0().O0(i7, str, null);
    }

    public static String N(long j3) {
        try {
            long j10 = j3 / 60;
            long j11 = j10 / 60;
            long j12 = j11 / 24;
            long j13 = j12 / 30;
            long j14 = j12 / 365;
            int i7 = (j14 > 1L ? 1 : (j14 == 1L ? 0 : -1));
            if (i7 >= 0) {
                if (i7 == 0) {
                    return M0(2131742857, null);
                }
                return H(',', "YearsAgo", (int) j14);
            }
            int i10 = (j13 > 1L ? 1 : (j13 == 1L ? 0 : -1));
            if (i10 >= 0) {
                if (i10 == 0) {
                    return M0(2131748344, null);
                }
                return H(',', "MonthsAgo", (int) j13);
            }
            int i11 = (j12 > 1L ? 1 : (j12 == 1L ? 0 : -1));
            if (i11 >= 0) {
                if (i11 == 0) {
                    return M0(2131751669, null);
                }
                return H(',', "DaysAgo", (int) j12);
            }
            int i12 = (j11 > 1L ? 1 : (j11 == 1L ? 0 : -1));
            if (i12 >= 0) {
                if (i12 == 0) {
                    return M0(2131749288, null);
                }
                return H(',', "HoursAgo", (int) j11);
            }
            int i13 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
            if (i13 >= 0) {
                if (i13 == 0) {
                    return M0(2131748425, null);
                }
                return H(',', "MinutesAgo", (int) j10);
            }
            return M0(2131748986, null);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String N0(String str) {
        if (TextUtils.isEmpty(str)) {
            return rf.b.i("LOC_ERR:", str);
        }
        return M0(0, str);
    }

    public static String O(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i7 && i10 == i12) {
                return a0(null, null, 2131744111, E0().p0().format(new Date(j10)));
            }
            if (i11 + 1 == i7 && i10 == i12) {
                return a0(null, null, 2131742844, E0().p0().format(new Date(j10)));
            }
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return a0(null, null, 2131742784, E0().q0().format(new Date(j10)), E0().p0().format(new Date(j10)));
            }
            return a0(null, null, 2131742784, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String P(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            long j11 = timeInMillis - j10;
            if (j11 < 60000) {
                return M0(2131745358, null);
            }
            if (j11 < 3600000) {
                return G((int) (j11 / 60000), "ShortMinutesAgo", new Object[0]);
            }
            if (i11 == i7 && i10 == i12) {
                if (j11 < 43200000) {
                    return G((int) (j11 / 3600000), "ShortHoursAgo", new Object[0]);
                }
                return M0(2131745356, null);
            } else if (i11 + 1 == i7 && i10 == i12) {
                return M0(2131745355, null);
            } else {
                if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                    return E0().q0().format(new Date(j10));
                }
                return a0(null, null, 2131742784, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10)));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String Q(long j3) {
        long j10 = j3 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return E0().w0().format(new Date(j10)) + ", " + E0().p0().format(new Date(j10));
            }
            return E0().y0().format(new Date(j10)) + ", " + E0().p0().format(new Date(j10));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String Q0() {
        Locale locale = E0().f22907z;
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

    public static String R(int i7) {
        String str;
        String str2;
        int i10 = i7 / 3600;
        int i11 = (i7 / 60) % 60;
        int i12 = i7 % 60;
        StringBuilder sb2 = new StringBuilder();
        String str3 = "0";
        if (i10 > 0) {
            if (sb2.length() > 0) {
                sb2.append(":");
            }
            if (i10 < 10) {
                str2 = "0";
            } else {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(i10);
        }
        if (sb2.length() > 0) {
            sb2.append(":");
        }
        if (i11 < 10) {
            str = "0";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(i11);
        if (sb2.length() > 0) {
            sb2.append(":");
        }
        if (i12 >= 10) {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(i12);
        return sb2.toString();
    }

    public static String S(int[] iArr, int i7) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            int i11 = i7 / 1000;
            if (i11 <= 0) {
                break;
            }
            sb2.append("K");
            i10 = (i7 % 1000) / 100;
            i7 = i11;
        }
        if (iArr != null) {
            double d = (i10 / 10.0d) + i7;
            for (int i12 = 0; i12 < sb2.length(); i12++) {
                d *= 1000.0d;
            }
            iArr[0] = (int) d;
        }
        if (i10 != 0 && sb2.length() > 0) {
            if (sb2.length() == 2) {
                Locale locale = Locale.US;
                return i7 + "." + i10 + "M";
            }
            Locale locale2 = Locale.US;
            return i7 + "." + i10 + sb2.toString();
        } else if (sb2.length() == 2) {
            Locale locale3 = Locale.US;
            return com.google.android.recaptcha.internal.a.i(i7, "M");
        } else {
            Locale locale4 = Locale.US;
            return com.google.android.recaptcha.internal.a.i(i7, sb2.toString());
        }
    }

    public static String T(long j3) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i7 = calendar.get(1);
            long j10 = j3 * 1000;
            calendar.setTimeInMillis(j10);
            if (i7 == calendar.get(1)) {
                return E0().q0().format(j10);
            }
            return E0().q0().format(j10) + ", " + calendar.get(1);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static boolean T0(File file) {
        if (file != null && new File(new File(t0.h(), "malformed_locales"), file.getName()).exists()) {
            return true;
        }
        return false;
    }

    public static CharSequence U(int i7, Object... objArr) {
        return V(null, null, i7, objArr);
    }

    public static boolean U0(int i7) {
        if (i7 != 9 && i7 != 10 && i7 != 13) {
            if (i7 < 32 || i7 > 55295) {
                if (i7 < 57344 || i7 > 65533) {
                    if (i7 < 65536 || i7 > 1114111) {
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

    public static CharSequence V(String str, String str2, int i7, Object... objArr) {
        String str3;
        try {
            String P0 = E0().P0(i7, str, str2);
            if (P0 == null) {
                return "LOC_ERR: " + str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(P0);
            int i10 = 0;
            while (i10 < objArr.length) {
                String str4 = "s";
                Object obj = objArr[i10];
                if (obj instanceof CharSequence) {
                    str3 = (CharSequence) obj;
                } else {
                    if (obj instanceof Integer) {
                        str3 = "" + ((Integer) objArr[i10]);
                    } else if (obj instanceof Long) {
                        str3 = "" + ((Long) objArr[i10]);
                    } else if (obj != null) {
                        str3 = "";
                    } else {
                        str3 = "null";
                    }
                    str4 = "d";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("%");
                i10++;
                sb2.append(i10);
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
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: " + str;
        }
    }

    public static String W(int i7, long j3, boolean z9) {
        int i10;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        int i12 = calendar.get(6);
        calendar.setTimeInMillis(j3 * 1000);
        int i13 = calendar.get(1);
        int i14 = calendar.get(6);
        if (i11 == i13) {
            if (z9 && i14 == i12) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        } else {
            i10 = 2;
        }
        if (i7 == 1) {
            i10 += 3;
        } else if (i7 == 2) {
            i10 += 6;
        } else if (i7 == 3) {
            i10 += 9;
        } else if (i7 == 4) {
            i10 += 12;
        }
        return E0().x0(i10).format(calendar.getTimeInMillis());
    }

    public static String X(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            long j11 = timeInMillis - j10;
            if (j11 < 60000) {
                return M0(2131745999, null);
            }
            if (j11 < 3600000) {
                int i13 = (int) (j11 / 60000);
                return G(i13, "MinutesAgo", Integer.valueOf(i13));
            } else if (i11 == i7 && i10 == i12) {
                return a0(null, null, 2131744111, E0().p0().format(new Date(j10)));
            } else {
                if (i11 + 1 == i7 && i10 == i12) {
                    return a0(null, null, 2131742844, E0().p0().format(new Date(j10)));
                }
                if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                    return a0(null, null, 2131742784, E0().q0().format(new Date(j10)), E0().p0().format(new Date(j10)));
                }
                return a0(null, null, 2131742784, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10)));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static void X0(String str) {
        if (r2.f25199a) {
            a8.b("set as patched " + str + " langpack");
        }
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("lngpack_patched_" + str, true).apply();
    }

    public static String Y(int i7, String str, Object... objArr) {
        return a0(str, null, i7, objArr);
    }

    public static String Z(int i7, Object... objArr) {
        return a0(null, null, i7, objArr);
    }

    public static String a(String str) {
        return str.replace(' ', (char) 160);
    }

    public static String a0(String str, String str2, int i7, Object... objArr) {
        try {
            String P0 = E0().P0(i7, str, str2);
            if (P0 == null) {
                return "LOC_ERR: " + str;
            } else if (E0().f22906y != null) {
                return String.format(E0().f22906y, P0, objArr);
            } else {
                return String.format(P0, objArr);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            if (i7 != 0) {
                try {
                    return String.format(t0.f25563b.getString(i7), objArr);
                } catch (Exception unused) {
                    return rf.b.i("LOC_ERR: ", str);
                }
            }
            return rf.b.i("LOC_ERR: ", str);
        }
    }

    public static String b0(String str, Object... objArr) {
        try {
            if (E0().f22906y != null) {
                return String.format(E0().f22906y, str, objArr);
            }
            return String.format(str, objArr);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: " + str;
        }
    }

    public static String c0(int i7) {
        if (i7 < 60) {
            return G(i7, "Seconds", new Object[0]);
        }
        if (i7 < 3600) {
            return G(i7 / 60, "Minutes", new Object[0]);
        }
        if (i7 < 86400) {
            return G((i7 / 60) / 60, "Hours", new Object[0]);
        }
        if (i7 < 604800) {
            return G(((i7 / 60) / 60) / 24, "Days", new Object[0]);
        }
        if (i7 < 2678400) {
            int i10 = ((i7 / 60) / 60) / 24;
            if (i7 % 7 == 0) {
                return G(i10 / 7, "Weeks", new Object[0]);
            }
            return a8.p0.D(G(i10 / 7, "Weeks", new Object[0]), " ", G(i10 % 7, "Days", new Object[0]));
        } else if (i7 >= 31536000 && i7 % 31536000 == 0) {
            return G((((i7 / 60) / 60) / 24) / 365, "Years", new Object[0]);
        } else {
            return G((((i7 / 60) / 60) / 24) / 30, "Months", new Object[0]);
        }
    }

    public static String d0(int i7, TLRPC.User user, boolean[] zArr, boolean[] zArr2) {
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.UserStatus userStatus3;
        int i10;
        int i11;
        int i12;
        if (user != null && (userStatus3 = user.status) != null && userStatus3.expires == 0) {
            if (userStatus3 instanceof TLRPC.TL_userStatusRecently) {
                if (userStatus3.by_me) {
                    i12 = -1000;
                } else {
                    i12 = -100;
                }
                userStatus3.expires = i12;
            } else if (userStatus3 instanceof TLRPC.TL_userStatusLastWeek) {
                if (userStatus3.by_me) {
                    i11 = -1001;
                } else {
                    i11 = -101;
                }
                userStatus3.expires = i11;
            } else if (userStatus3 instanceof TLRPC.TL_userStatusLastMonth) {
                if (userStatus3.by_me) {
                    i10 = -1002;
                } else {
                    i10 = -102;
                }
                userStatus3.expires = i10;
            }
        }
        if (user != null && (userStatus2 = user.status) != null && userStatus2.expires <= 0 && qp.s1(i7).Z.containsKey(Long.valueOf(user.f27102id))) {
            if (zArr != null) {
                zArr[0] = true;
            }
            return M0(2131747825, "Online");
        } else if (user != null && (userStatus = user.status) != null && userStatus.expires != 0 && !t10.x(user) && !(user instanceof TLRPC.TL_userEmpty)) {
            int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
            int i13 = user.status.expires;
            if (i13 > currentTime) {
                if (zArr != null) {
                    zArr[0] = true;
                }
                return M0(2131747825, "Online");
            } else if (i13 == -1) {
                return M0(2131749177, "Invisible");
            } else {
                if (i13 != -100 && i13 != -1000) {
                    if (i13 != -101 && i13 != -1001) {
                        if (i13 != -102 && i13 != -1002) {
                            return w(i13, zArr2);
                        }
                        return M0(2131742864, "WithinAMonth");
                    }
                    return M0(2131742863, "WithinAWeek");
                }
                return M0(2131749010, "Lately");
            }
        } else {
            return M0(2131754951, "ALongTimeAgo");
        }
    }

    public static String e0(long j3, boolean z9) {
        long j10 = 1000 * j3;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            String[] strArr = {M0(2131749085, null), M0(2131750830, null), M0(2131748682, null), M0(2131754173, null), M0(2131748661, null), M0(2131749063, null), M0(2131749065, null), M0(2131753895, null), M0(2131745566, null), M0(2131747829, null), M0(2131747834, null), M0(2131751606, null)};
            if (i7 == i10 && !z9) {
                return strArr[i11];
            }
            return strArr[i11] + " " + i10;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String e1(long j3) {
        long j10 = j3 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j10) >= 31536000000L) {
                return E0().C0().format(new Date(j10));
            }
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            calendar.setTimeInMillis(j10);
            int i10 = calendar.get(6) - i7;
            if (i10 != 0 && (i10 != -1 || System.currentTimeMillis() - j10 >= 28800000)) {
                if (i10 > -7 && i10 <= -1) {
                    return E0().A0().format(new Date(j10));
                }
                return E0().q0().format(new Date(j10));
            }
            return E0().p0().format(new Date(j10));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String f0(long j3) {
        long j10 = 1000 * j3;
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i7 = calendar.get(1);
            int i10 = calendar.get(2);
            int i11 = calendar.get(5);
            return new String[]{M0(2131749085, null), M0(2131750830, null), M0(2131748682, null), M0(2131754173, null), M0(2131748661, null), M0(2131749063, null), M0(2131749065, null), M0(2131753895, null), M0(2131745566, null), M0(2131747829, null), M0(2131747834, null), M0(2131751606, null)}[i10] + " " + i11 + ", " + i7;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String f1(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 != 8) {
                        if (i7 != 16) {
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
            ((Spannable) str).setSpan(new u31(g0.o()), 0, str.length(), 33);
            return (Spannable) str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new u31(g0.o()), 0, str.length(), 33);
        return spannableStringBuilder;
    }

    public static int h(HashMap hashMap) {
        String k10;
        HashSet hashSet = new HashSet();
        int i7 = 0;
        for (String str : hashMap.keySet()) {
            if (str != null) {
                if (str.endsWith("_other")) {
                    k10 = com.google.android.recaptcha.internal.a.k(str, 6, 0);
                } else if (!str.endsWith("_zero") && !str.endsWith("_many")) {
                    if (!str.endsWith("_one") && !str.endsWith("_two") && !str.endsWith("_few")) {
                        k10 = null;
                    } else {
                        k10 = com.google.android.recaptcha.internal.a.k(str, 4, 0);
                    }
                } else {
                    k10 = com.google.android.recaptcha.internal.a.k(str, 5, 0);
                }
                if (k10 != null) {
                    if (!hashSet.contains(k10)) {
                        hashSet.add(k10);
                    }
                }
                i7++;
            }
        }
        hashSet.clear();
        return i7;
    }

    public static String i0(int i7, String str) {
        if (str != null && str.equalsIgnoreCase("ft")) {
            return M0(i7, null);
        }
        try {
            return new Locale("", str).getDisplayCountry(E0().f22906y);
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static String j0() {
        ed edVar = E0().B;
        if (edVar != null && !TextUtils.isEmpty(edVar.f22181a)) {
            return edVar.f22181a;
        }
        return M0(2131749048, "LanguageName");
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
        if (f22884g0 == null) {
            int i7 = iz.f23415s1;
            boolean z9 = false;
            if (i7 == 0) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) t0.f25563b.getSystemService("phone");
                    if (telephonyManager != null) {
                        String upperCase = telephonyManager.getSimCountryIso().toUpperCase();
                        if (!"US".equals(upperCase)) {
                            if (!"GB".equals(upperCase)) {
                                if (!"MM".equals(upperCase)) {
                                    if ("LR".equals(upperCase)) {
                                    }
                                    f22884g0 = Boolean.valueOf(z9);
                                    return;
                                }
                            }
                        }
                        z9 = true;
                        f22884g0 = Boolean.valueOf(z9);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    f22884g0 = Boolean.FALSE;
                    a8.g(e10, true);
                    return;
                }
            }
            if (i7 == 2) {
                z9 = true;
            }
            f22884g0 = Boolean.valueOf(z9);
        }
    }

    public static int l0(ed edVar, TLRPC.TL_langPackDifference tL_langPackDifference) {
        String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
        if (lowerCase.equals(edVar.f22183c)) {
            return 0;
        }
        if (lowerCase.equals(edVar.f22184e)) {
            return 1;
        }
        return -1;
    }

    public static java.lang.String m(java.lang.String r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hd.m(java.lang.String, boolean):java.lang.String");
    }

    public static String n(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence);
        int length = sb2.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = sb2.charAt(i7);
            if ((charAt < '0' || charAt > '9') && charAt != '.' && charAt != ',') {
                int i10 = 0;
                while (i10 < 18) {
                    int i11 = 0;
                    while (true) {
                        char[] cArr = f22883f0[i10];
                        if (i11 >= cArr.length) {
                            break;
                        } else if (charAt == cArr[i11]) {
                            sb2.setCharAt(i7, f22882e0[i11]);
                            i10 = 18;
                            break;
                        } else {
                            i11++;
                        }
                    }
                    i10++;
                }
            }
        }
        return sb2.toString();
    }

    public static String o(int i7) {
        if (i7 > 3600) {
            String G = G(i7 / 3600, "Hours", new Object[0]);
            int i10 = (i7 % 3600) / 60;
            if (i10 > 0) {
                StringBuilder j3 = rf.b.j(G, ", ");
                j3.append(G(i10, "Minutes", new Object[0]));
                return j3.toString();
            }
            return G;
        } else if (i7 > 60) {
            return G(i7 / 60, "Minutes", new Object[0]);
        } else {
            return G(i7, "Seconds", new Object[0]);
        }
    }

    public static String r(long j3, boolean z9) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i7 && i10 == i12) {
                if (z9) {
                    return M0(2131745356, null);
                }
                return E0().p0().format(new Date(j10));
            } else if (i11 + 1 == i7 && i10 == i12) {
                return M0(2131742846, "Yesterday");
            } else {
                if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                    return E0().q0().format(new Date(j10));
                }
                return E0().C0().format(new Date(j10));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: formatDate";
        }
    }

    public static String s(long j3, boolean z9) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i7 && i10 == i12) {
                if (z9) {
                    return a0(null, null, 2131744112, E0().p0().format(new Date(j10)));
                }
                return a0(null, null, 2131744111, E0().p0().format(new Date(j10)));
            } else if (i11 + 1 == i7 && i10 == i12) {
                return a0(null, null, 2131742844, E0().p0().format(new Date(j10)));
            } else {
                if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                    return a0(null, null, 2131742784, E0().q0().format(new Date(j10)), E0().p0().format(new Date(j10)));
                }
                return a0(null, null, 2131742784, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10)));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String t(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i7 && i10 == i12) {
                return E0().p0().format(new Date(j10));
            }
            if (i11 + 1 == i7 && i10 == i12) {
                return a0(null, null, 2131742844, E0().p0().format(new Date(j10)));
            }
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                hd E0 = E0();
                if (E0.f22895m == null) {
                    synchronized (E0) {
                        if (E0.f22895m == null) {
                            Locale locale = E0.f22906y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            E0.f22895m = k(locale, E0.O0(2131742786, "chatDateShort", null), "d MMM");
                        }
                    }
                }
                return a0(null, null, 2131742784, E0.f22895m.format(new Date(j10)), E0().p0().format(new Date(j10)));
            }
            return a0(null, null, 2131742784, E0().h0().format(new Date(j10)), E0().p0().format(new Date(j10)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String u(long j3, boolean z9) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i7 = calendar.get(1);
            long j10 = j3 * 1000;
            calendar.setTimeInMillis(j10);
            if (z9) {
                if (i7 != calendar.get(1)) {
                }
                return E0().g0().format(j10);
            }
            if (z9 || Math.abs(System.currentTimeMillis() - j10) >= 31536000000L) {
                return E0().h0().format(j10);
            }
            return E0().g0().format(j10);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static String v(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            if (i7 == calendar.get(1)) {
                return E0().n0().format(new Date(j10));
            }
            return E0().m0().format(new Date(j10));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String w(long j3, boolean[] zArr) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            int i11 = calendar.get(11);
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            int i14 = calendar.get(11);
            if (i12 == i7 && i10 == i13) {
                return a0(null, null, 2131749016, a0("TodayAtFormatted", null, 2131744112, E0().p0().format(new Date(j10))));
            }
            if (i12 + 1 == i7 && i10 == i13) {
                if (zArr != null) {
                    zArr[0] = true;
                    if (i11 <= 6 && i14 > 18 && f22880c0) {
                        return a0(null, null, 2131749016, E0().p0().format(new Date(j10)));
                    }
                    return a0(null, null, 2131742844, E0().p0().format(new Date(j10)));
                }
                return a0(null, null, 2131749016, a0("YesterdayAtFormatted", null, 2131742844, E0().p0().format(new Date(j10))));
            } else if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return a0("LastSeenDateFormatted", null, 2131749019, a0("formatDateAtTime", null, 2131742784, E0().q0().format(new Date(j10)), E0().p0().format(new Date(j10))));
            } else {
                return a0("LastSeenDateFormatted", null, 2131749019, a0("formatDateAtTime", null, 2131742784, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10))));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String x(long j3, boolean z9) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i7 && i10 == i12 && z9) {
                return a0(null, null, 2131744111, E0().p0().format(new Date(j10)));
            }
            if (i11 + 1 == i7 && i10 == i12 && z9) {
                return a0(null, null, 2131742844, E0().p0().format(new Date(j10)));
            }
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return a0(null, null, 2131742784, E0().g0().format(new Date(j10)), E0().p0().format(new Date(j10)));
            }
            return a0(null, null, 2131742784, E0().h0().format(new Date(j10)), E0().p0().format(new Date(j10)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String y(float f10, int i7, Boolean bool) {
        String format;
        String format2;
        l();
        if ((bool != null && bool.booleanValue()) || (bool == null && f22884g0.booleanValue())) {
            float f11 = f10 * 3.28084f;
            if (f11 < 1000.0f) {
                if (i7 != 0) {
                    if (i7 != 1) {
                        return a0("FootsShort", null, 2131750602, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f11))));
                    }
                    return a0("FootsFromYou", null, 2131750603, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f11))));
                }
                return a0("FootsAway", null, 2131750604, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f11))));
            }
            if (f11 % 5280.0f == 0.0f) {
                format2 = String.format("%d", Integer.valueOf((int) (f11 / 5280.0f)));
            } else {
                format2 = String.format("%.2f", Float.valueOf(f11 / 5280.0f));
            }
            if (i7 != 0) {
                if (i7 != 1) {
                    return a0("MilesShort", null, 2131748426, format2);
                }
                return a0("MilesFromYou", null, 2131748427, format2);
            }
            return a0("MilesAway", null, 2131748428, format2);
        } else if (f10 < 1000.0f) {
            if (i7 != 0) {
                if (i7 != 1) {
                    return a0("MetersShort", null, 2131748441, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
                }
                return a0("MetersFromYou2", null, 2131748442, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
            }
            return a0("MetersAway2", null, 2131748443, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
        } else {
            if (f10 % 1000.0f == 0.0f) {
                format = String.format("%d", Integer.valueOf((int) (f10 / 1000.0f)));
            } else {
                format = String.format("%.2f", Float.valueOf(f10 / 1000.0f));
            }
            if (i7 != 0) {
                if (i7 != 1) {
                    return a0("KMetersShort", null, 2131749060, format);
                }
                return a0("KMetersFromYou2", null, 2131749061, format);
            }
            return a0("KMetersAway2", null, 2131749062, format);
        }
    }

    public static String z(int i7) {
        if (i7 <= 0) {
            return G(0, "Seconds", new Object[0]);
        }
        int i10 = i7 / 3600;
        int i11 = (i7 / 60) % 60;
        int i12 = i7 % 60;
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            sb2.append(G(i10, "Hours", new Object[0]));
        }
        if (i11 > 0) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(G(i11, "Minutes", new Object[0]));
        }
        if (i12 > 0) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(G(i12, "Seconds", new Object[0]));
        }
        return sb2.toString();
    }

    public final FastDateFormat A0() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.d = k(locale, O0(2131742762, "formatterWeek", null), "EEE");
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final FastDateFormat B0() {
        if (this.f22888e == null) {
            synchronized (this) {
                try {
                    if (this.f22888e == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f22888e = k(locale, O0(2131742761, "formatterWeekLong", null), "EEEE");
                    }
                } finally {
                }
            }
        }
        return this.f22888e;
    }

    public final FastDateFormat C0() {
        if (this.f22890g == null) {
            synchronized (this) {
                try {
                    if (this.f22890g == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f22890g = k(locale, O0(2131742760, "formatterYear", null), "dd.MM.yy");
                    }
                } finally {
                }
            }
        }
        return this.f22890g;
    }

    public final FastDateFormat D0() {
        if (this.h == null) {
            synchronized (this) {
                try {
                    if (this.h == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.h = k(locale, O0(2131742759, "formatterYearMax", null), "dd.MM.yyyy");
                    }
                } finally {
                }
            }
        }
        return this.h;
    }

    public final ed G0(String str) {
        if (str == null) {
            return null;
        }
        return (ed) this.N.get(str.toLowerCase().replace("-", "_"));
    }

    public final java.util.HashMap H0(java.io.File r12, boolean r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hd.H0(java.io.File, boolean, boolean, boolean):java.util.HashMap");
    }

    public final String O0(int i7, String str, String str2) {
        String P0 = P0(i7, str, str2);
        if (P0 == null) {
            return rf.b.i("LOC_ERR:", str);
        }
        return P0;
    }

    public final String P0(int i7, String str, String str2) {
        Context context = t0.f25563b;
        boolean z9 = r2.f25199a;
        String c10 = this.Y.c(i7, context, str);
        if (c10 != null) {
            return c10;
        }
        String b10 = this.Y.b(str2);
        if (b10 != null) {
            return b10;
        }
        i();
        String c11 = this.W.c(i7, context, str);
        if (c11 != null) {
            return c11;
        }
        return this.W.b(str2);
    }

    public final String R0(String str) {
        return S0(str, true, false);
    }

    public final String S0(String str, boolean z9, boolean z10) {
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
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        int i7 = 0;
        boolean z11 = false;
        while (i7 < length) {
            int i10 = i7 + 1;
            String substring = str.substring(i7, i10);
            if (z10) {
                String lowerCase = substring.toLowerCase();
                z11 = !substring.equals(lowerCase);
                substring = lowerCase;
            }
            String str2 = (String) this.G.get(substring);
            if (str2 == null && z9) {
                str2 = (String) this.H.get(substring);
            }
            if (str2 != null) {
                if (z10 && z11) {
                    if (str2.length() > 1) {
                        str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                    } else {
                        str2 = str2.toUpperCase();
                    }
                }
                sb2.append(str2);
            } else {
                if (z10) {
                    char charAt = substring.charAt(0);
                    if ((charAt < 'a' || charAt > 'z' || charAt < '0' || charAt > '9') && charAt != ' ' && charAt != '\'' && charAt != ',' && charAt != '.' && charAt != '&' && charAt != '-' && charAt != '/') {
                        return null;
                    }
                    if (z11) {
                        substring = substring.toUpperCase();
                    }
                }
                sb2.append(substring);
            }
            i7 = i10;
        }
        return sb2.toString();
    }

    public final void V0(int i7, boolean z9) {
        if (this.I) {
            return;
        }
        this.I = true;
        ConnectionsManager.getInstance(i7).sendRequest(new TLRPC.TL_langpack_getLanguages(), new bd(this, z9, i7), 8);
    }

    public final void W0(Configuration configuration) {
        if (this.D) {
            return;
        }
        f22880c0 = DateFormat.is24HourFormat(t0.f25563b);
        Locale locale = configuration.locale;
        this.f22907z = locale;
        if (this.C != null) {
            ed edVar = this.B;
            this.B = null;
            d(edVar, false, false, p10.f24467s0);
        } else if (locale != null) {
            String displayName = locale.getDisplayName();
            String displayName2 = this.f22906y.getDisplayName();
            if (displayName != null && displayName2 != null && !displayName.equals(displayName2)) {
                Y0();
            }
            this.f22906y = locale;
            ed edVar2 = this.B;
            if (edVar2 != null && !TextUtils.isEmpty(edVar2.f22185f)) {
                this.A = (fd) this.f22905x.get(this.B.f22185f);
            }
            if (this.A == null) {
                fd fdVar = (fd) this.f22905x.get(this.f22906y.getLanguage());
                this.A = fdVar;
                if (fdVar == null) {
                    this.A = (fd) this.f22905x.get("en");
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
        ed edVar;
        boolean z9;
        Locale locale = this.f22906y;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        if (language == null) {
            language = "en";
        }
        String lowerCase = language.toLowerCase();
        int i7 = 0;
        int i10 = 2;
        if ((lowerCase.length() != 2 || (!lowerCase.equals("ar") && !lowerCase.equals("fa") && !lowerCase.equals("he") && !lowerCase.equals("iw"))) && !lowerCase.startsWith("ar_") && !lowerCase.startsWith("fa_") && !lowerCase.startsWith("he_") && !lowerCase.startsWith("iw_") && ((edVar = this.B) == null || !edVar.f22186g)) {
            z9 = false;
        } else {
            z9 = true;
        }
        f22878a0 = z9;
        if (!lowerCase.equals("ko")) {
            i10 = 1;
        }
        f22879b0 = i10;
        this.f22902t = null;
        this.f22901s = null;
        this.f22903u = null;
        this.v = null;
        this.f22899q = null;
        this.f22900r = null;
        this.f22889f = null;
        this.f22890g = null;
        this.h = null;
        this.f22894l = null;
        this.f22896n = null;
        this.d = null;
        this.f22888e = null;
        this.f22897o = null;
        this.f22898p = null;
        this.f22885a = null;
        this.f22886b = null;
        this.f22887c = null;
        this.f22891i = null;
        this.f22892j = null;
        this.f22893k = null;
        while (true) {
            FastDateFormat[] fastDateFormatArr = this.f22904w;
            if (i7 < fastDateFormatArr.length) {
                fastDateFormatArr[i7] = null;
                i7++;
            } else {
                return;
            }
        }
    }

    public final void Z0(int i7, String str, boolean z9, wc wcVar) {
        if (str != null) {
            str = str.replace("-", "_");
        }
        String str2 = str;
        if (str2 != null) {
            ed edVar = this.B;
            if (edVar != null) {
                if (!str2.equals(edVar.f22183c) && !str2.equals(this.B.f22184e)) {
                    return;
                }
            } else {
                return;
            }
        }
        f(this.B, str2, z9, i7, wcVar);
    }

    public final void a1() {
        SharedPreferences.Editor edit = t0.f25563b.getSharedPreferences("langconfig", 0).edit();
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            String f10 = ((ed) this.O.get(i7)).f();
            if (f10 != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(f10);
            }
        }
        edit.putString("locales", sb2.toString());
        sb2.setLength(0);
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            String f11 = ((ed) this.L.get(i10)).f();
            if (f11 != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(f11);
            }
        }
        edit.putString("remote", sb2.toString());
        sb2.setLength(0);
        for (int i11 = 0; i11 < this.K.size(); i11++) {
            String f12 = ((ed) this.K.get(i11)).f();
            if (f12 != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(f12);
            }
        }
        edit.putString("unofficial", sb2.toString());
        edit.commit();
    }

    public final void b(String[] strArr, fd fdVar) {
        for (String str : strArr) {
            this.f22905x.put(str, fdVar);
        }
    }

    public final void b1(final ed edVar, final TLRPC.TL_langPackDifference tL_langPackDifference, final int i7, final boolean z9, final Runnable runnable) {
        boolean z10;
        int i10;
        int i11;
        String str;
        int i12;
        File d;
        final File e10;
        boolean z11 = true;
        if (tL_langPackDifference != null && !tL_langPackDifference.strings.isEmpty() && edVar != null && !edVar.h()) {
            final int l02 = l0(edVar, tL_langPackDifference);
            if (l02 == -1) {
                a8.b("saveRemoteLocaleStrings: unknown language " + tL_langPackDifference.lang_code + " (locale short=" + edVar.f22183c + ", base=" + edVar.f22184e + ")");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (l02 == 0) {
                str = edVar.f22183c;
            } else {
                str = edVar.f22184e;
            }
            final String str2 = str;
            if (l02 == 0) {
                i12 = edVar.h;
            } else {
                i12 = edVar.f22187i;
            }
            final int i13 = i12;
            if (l02 == 0) {
                d = edVar.e();
            } else {
                d = edVar.d();
            }
            if (d == null) {
                org.telegram.ui.Cells.f1.u(tL_langPackDifference.lang_code, new StringBuilder("saveRemoteLocaleStrings: no file for "));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (!edVar.g()) {
                e10 = null;
            } else if (l02 == 0) {
                e10 = edVar.d();
            } else {
                e10 = edVar.e();
            }
            if (this.R == null) {
                this.R = new q5("langpackQueue", true);
            }
            final File file = d;
            this.R.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zc.run():void");
                }
            });
            return;
        }
        StringBuilder sb2 = new StringBuilder("saveRemoteLocaleStrings: empty difference=");
        if (tL_langPackDifference != null && !tL_langPackDifference.strings.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        sb2.append(z10);
        sb2.append("; locale is local or null=");
        if (edVar != null && !edVar.h()) {
            z11 = false;
        }
        sb2.append(z11);
        a8.b(sb2.toString());
        if (tL_langPackDifference != null && edVar != null && !edVar.h() && tL_langPackDifference.from_version != 0) {
            int l03 = l0(edVar, tL_langPackDifference);
            if (l03 == 0) {
                i10 = edVar.h;
            } else {
                i10 = edVar.f22187i;
            }
            if (l03 != -1 && tL_langPackDifference.from_version <= i10 && i10 < (i11 = tL_langPackDifference.version)) {
                if (l03 == 0) {
                    edVar.h = i11;
                } else {
                    edVar.f22187i = i11;
                }
                a1();
            }
        }
        Y0();
        qs.e().k(qs.f25099x4, new Object[0]);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final int c(org.telegram.messenger.ed r23, boolean r24, boolean r25, boolean r26, boolean r27, int r28, org.telegram.ui.g60 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hd.c(org.telegram.messenger.ed, boolean, boolean, boolean, boolean, int, org.telegram.ui.g60):int");
    }

    public final boolean c1(String str) {
        int i7;
        int i10 = qp.s1(p10.f24467s0).f24954z7;
        if (i10 > 0) {
            SharedPreferences e12 = qp.e1();
            if (!e12.getBoolean("lngpack_patched_" + str, false) && (i7 = this.Z) < i10) {
                a8.d("reinstalling " + str + " langpack because of patch (" + i7 + " keys, must be at least " + i10 + ")");
                X0(str);
                return true;
            }
        }
        return false;
    }

    public final void d(ed edVar, boolean z9, boolean z10, int i7) {
        c(edVar, z9, z10, false, false, i7, null);
    }

    public final dd d1(String str, boolean z9, int i7, ng ngVar) {
        boolean z10;
        String str2;
        HashMap hashMap = this.T;
        dd ddVar = (dd) hashMap.get(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (ddVar != null && elapsedRealtime - ddVar.f21990b >= 300000) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ddVar != null && !z10 && (ddVar.f21989a || !z9)) {
            StringBuilder u10 = a8.p0.u("applyRemoteLanguage ", str, " is already loading");
            if (ddVar.f21989a) {
                str2 = " the whole langpack";
            } else {
                str2 = "";
            }
            u10.append(str2);
            u10.append(", wait for it");
            a8.b(u10.toString());
            ddVar.f21992e.add(ngVar);
            return null;
        }
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList();
        obj.f21992e = arrayList;
        obj.f21989a = z9;
        obj.f21990b = elapsedRealtime;
        obj.d = i7;
        if (z10) {
            arrayList.addAll(ddVar.f21992e);
            ddVar.f21992e.clear();
        }
        hashMap.put(str, obj);
        return obj;
    }

    public final boolean e(File file, int i7) {
        try {
            HashMap H0 = H0(file, false, false, true);
            String str = (String) H0.get("LanguageName");
            String str2 = (String) H0.get("LanguageNameInEnglish");
            String str3 = (String) H0.get("LanguageCode");
            if (str != null && str.length() > 0 && str2 != null && str2.length() > 0 && str3 != null && str3.length() > 0 && !str.contains("&") && !str.contains("|") && !str2.contains("&") && !str2.contains("|") && !str3.contains("&") && !str3.contains("|") && !str3.contains("/") && !str3.contains("\\")) {
                File file2 = new File(t0.h(), str3.concat(".xml"));
                if (g0.E(file, file2)) {
                    ed G0 = G0("local_" + str3.toLowerCase());
                    ed edVar = G0;
                    if (G0 == null) {
                        ?? obj = new Object();
                        obj.f22181a = str;
                        obj.f22182b = str2;
                        String lowerCase = str3.toLowerCase();
                        obj.f22183c = lowerCase;
                        obj.f22185f = lowerCase;
                        obj.d = file2.getAbsolutePath();
                        this.J.add(obj);
                        this.N.put(obj.b(), obj);
                        this.O.add(obj);
                        a1();
                        edVar = obj;
                    }
                    ed edVar2 = edVar;
                    ?? obj2 = new Object();
                    obj2.a(H0);
                    this.Y = new si.b(obj2);
                    this.Z = h(H0);
                    c(edVar2, true, false, true, false, i7, null);
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public final int f(final org.telegram.messenger.ed r19, java.lang.String r20, boolean r21, final int r22, java.lang.Runnable r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hd.f(org.telegram.messenger.ed, java.lang.String, boolean, int, java.lang.Runnable):int");
    }

    public final FastDateFormat g0() {
        if (this.f22894l == null) {
            synchronized (this) {
                try {
                    if (this.f22894l == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f22894l = k(locale, O0(2131742787, "chatDate", null), "d MMMM");
                    }
                } finally {
                }
            }
        }
        return this.f22894l;
    }

    public final FastDateFormat h0() {
        if (this.f22896n == null) {
            synchronized (this) {
                try {
                    if (this.f22896n == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f22896n = k(locale, O0(2131742785, "chatFullDate", null), "d MMMM yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f22896n;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hd.i():void");
    }

    public final void j(int i7) {
        ed edVar = this.B;
        if (edVar != null && !this.P && c1(edVar.f22183c)) {
            if (r2.f25199a) {
                a8.b("reload locale because locale file is not enough");
            }
            g0.h3(new vc(this, i7, 2));
        }
    }

    public final Locale k0() {
        return this.f22906y;
    }

    public final FastDateFormat m0() {
        String O0;
        String str;
        if (this.f22892j == null) {
            synchronized (this) {
                try {
                    if (this.f22892j == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        if (f22880c0) {
                            O0 = O0(2131742780, "formatterBannedUntil24H", null);
                        } else {
                            O0 = O0(2131742781, "formatterBannedUntil12H", null);
                        }
                        if (f22880c0) {
                            str = "MMM dd yyyy, HH:mm";
                        } else {
                            str = "MMM dd yyyy, h:mm a";
                        }
                        this.f22892j = k(locale, O0, str);
                    }
                } finally {
                }
            }
        }
        return this.f22892j;
    }

    public final FastDateFormat n0() {
        String O0;
        String str;
        if (this.f22893k == null) {
            synchronized (this) {
                try {
                    if (this.f22893k == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        if (f22880c0) {
                            O0 = O0(2131742778, "formatterBannedUntilThisYear24H", null);
                        } else {
                            O0 = O0(2131742779, "formatterBannedUntilThisYear12H", null);
                        }
                        if (f22880c0) {
                            str = "MMM dd, HH:mm";
                        } else {
                            str = "MMM dd, h:mm a";
                        }
                        this.f22893k = k(locale, O0, str);
                    }
                } finally {
                }
            }
        }
        return this.f22893k;
    }

    public final FastDateFormat o0() {
        if (this.f22902t == null) {
            synchronized (this) {
                try {
                    if (this.f22902t == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f22902t = k(locale, O0(2131742777, "formatterBoostExpired", null), "MMM dd, yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f22902t;
    }

    public final String p(long j3, String str) {
        return q(j3, true, true, false, str);
    }

    public final FastDateFormat p0() {
        String O0;
        String str;
        if (this.f22885a == null) {
            synchronized (this) {
                try {
                    if (this.f22885a == null) {
                        Locale locale = this.f22906y;
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
                        if (f22880c0) {
                            O0 = O0(2131742775, "formatterDay24H", null);
                        } else {
                            O0 = O0(2131742776, "formatterDay12H", null);
                        }
                        if (f22880c0) {
                            str = "HH:mm";
                        } else {
                            str = "h:mm a";
                        }
                        this.f22885a = k(locale, O0, str);
                    }
                } finally {
                }
            }
        }
        return this.f22885a;
    }

    public final String q(long j3, boolean z9, boolean z10, boolean z11, String str) {
        boolean z12;
        double d;
        int length;
        String upperCase = str.toUpperCase();
        if (j3 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        long abs = Math.abs(j3);
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
                double d2 = ((float) abs) / 100.0f;
                if (z9 && abs % 100 == 0) {
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
        if (z10) {
            str3 = str2;
        }
        String str4 = "";
        if (currency != null) {
            Locale locale = this.f22906y;
            if (locale == null) {
                locale = this.f22907z;
            }
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
            currencyInstance.setCurrency(currency);
            if (z11) {
                currencyInstance.setGroupingUsed(false);
            }
            if (!z10 || (z9 && upperCase.equals("IRR"))) {
                currencyInstance.setMaximumFractionDigits(0);
            }
            StringBuilder sb2 = new StringBuilder();
            if (z12) {
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
        if (z12) {
            str4 = "-";
        }
        return str4.concat(String.format(Locale.US, upperCase.concat(str3), Double.valueOf(d)));
    }

    public final FastDateFormat q0() {
        if (this.f22889f == null) {
            synchronized (this) {
                try {
                    if (this.f22889f == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f22889f = k(locale, O0(2131742769, "formatterMonth", null), "dd MMM");
                    }
                } finally {
                }
            }
        }
        return this.f22889f;
    }

    public final FastDateFormat r0() {
        String O0;
        String str;
        if (this.f22886b == null) {
            synchronized (this) {
                try {
                    if (this.f22886b == null) {
                        Locale locale = this.f22906y;
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
                        if (f22880c0) {
                            O0 = O0(2131742773, "formatterDayWithSeconds24H", null);
                        } else {
                            O0 = O0(2131742774, "formatterDayWithSeconds12H", null);
                        }
                        if (f22880c0) {
                            str = "HH:mm:ss";
                        } else {
                            str = "h:mm:ss a";
                        }
                        this.f22886b = k(locale, O0, str);
                    }
                } finally {
                }
            }
        }
        return this.f22886b;
    }

    public final FastDateFormat s0() {
        if (this.f22901s == null) {
            synchronized (this) {
                try {
                    if (this.f22901s == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f22901s = k(locale, O0(2131742772, "formatterGiveawayCard", null), "dd MMM yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f22901s;
    }

    public final FastDateFormat t0() {
        if (this.f22903u == null) {
            synchronized (this) {
                try {
                    if (this.f22903u == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f22903u = k(locale, O0(2131742771, "formatterGiveawayMonthDay", null), "MMMM dd");
                    }
                } finally {
                }
            }
        }
        return this.f22903u;
    }

    public final FastDateFormat u0() {
        if (this.v == null) {
            synchronized (this) {
                try {
                    if (this.v == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.v = k(locale, O0(2131742770, "formatterGiveawayMonthDayYear", null), "MMMM dd, yyyy");
                    }
                } finally {
                }
            }
        }
        return this.v;
    }

    public final FastDateFormat v0() {
        if (this.f22899q == null) {
            synchronized (this) {
                try {
                    if (this.f22899q == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f22899q = k(locale, O0(2131742766, "formatterMonthYear", null), "MMM yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f22899q;
    }

    public final FastDateFormat w0() {
        if (this.f22897o == null) {
            synchronized (this) {
                try {
                    if (this.f22897o == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f22897o = k(locale, O0(2131742783, "formatDateSchedule", null), "MMM d");
                    }
                } finally {
                }
            }
        }
        return this.f22897o;
    }

    public final FastDateFormat x0(int i7) {
        if (i7 >= 0) {
            FastDateFormat[] fastDateFormatArr = this.f22904w;
            if (i7 < fastDateFormatArr.length) {
                if (fastDateFormatArr[i7] == null) {
                    Locale locale = this.f22906y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    switch (i7) {
                        case 0:
                            fastDateFormatArr[i7] = k(locale, O0(2131745588, "SendTodayAt", null), "'Send today at' HH:mm");
                            break;
                        case 1:
                            fastDateFormatArr[i7] = k(locale, O0(2131745630, "SendDayAt", null), "'Send on' MMM d 'at' HH:mm");
                            break;
                        case 2:
                            fastDateFormatArr[i7] = k(locale, O0(2131745629, "SendDayYearAt", null), "'Send on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 3:
                            fastDateFormatArr[i7] = k(locale, O0(2131746322, "RemindTodayAt", null), "'Remind today at' HH:mm");
                            break;
                        case 4:
                            fastDateFormatArr[i7] = k(locale, O0(2131746324, "RemindDayAt", null), "'Remind on' MMM d 'at' HH:mm");
                            break;
                        case 5:
                            fastDateFormatArr[i7] = k(locale, O0(2131746323, "RemindDayYearAt", null), "'Remind on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 6:
                            fastDateFormatArr[i7] = k(locale, O0(2131744906, "StartTodayAt", null), "'Start today at' HH:mm");
                            break;
                        case 7:
                            fastDateFormatArr[i7] = k(locale, O0(2131744915, "StartDayAt", null), "'Start on' MMM d 'at' HH:mm");
                            break;
                        case 8:
                            fastDateFormatArr[i7] = k(locale, O0(2131744914, "StartDayYearAt", null), "'Start on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 9:
                            fastDateFormatArr[i7] = k(locale, O0(2131744909, "StartShortTodayAt", null), "'Today,' HH:mm");
                            break;
                        case 10:
                            fastDateFormatArr[i7] = k(locale, O0(2131744911, "StartShortDayAt", null), "MMM d',' HH:mm");
                            break;
                        case 11:
                            fastDateFormatArr[i7] = k(locale, O0(2131744910, "StartShortDayYearAt", null), "MMM d yyyy, HH:mm");
                            break;
                        case 12:
                            fastDateFormatArr[i7] = k(locale, O0(2131744898, "StartsTodayAt", null), "'Starts today at' HH:mm");
                            break;
                        case 13:
                            fastDateFormatArr[i7] = k(locale, O0(2131744900, "StartsDayAt", null), "'Starts on' MMM d 'at' HH:mm");
                            break;
                        case 14:
                            fastDateFormatArr[i7] = k(locale, O0(2131744899, "StartsDayYearAt", null), "'Starts on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 15:
                            fastDateFormatArr[i7] = k(locale, O0(2131746576, "PublishTodayAt", null), "'Publish today at' HH:mm");
                            break;
                        case 16:
                            fastDateFormatArr[i7] = k(locale, O0(2131746578, "PublishDayAt", null), "'Publish on' MMM d 'at' HH:mm");
                            break;
                        case 17:
                            fastDateFormatArr[i7] = k(locale, O0(2131746577, "PublishDayYearAt", null), "'Publish on' MMM d yyyy 'at' HH:mm");
                            break;
                    }
                }
                return fastDateFormatArr[i7];
            }
        }
        return null;
    }

    public final FastDateFormat y0() {
        if (this.f22898p == null) {
            synchronized (this) {
                try {
                    if (this.f22898p == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f22898p = k(locale, O0(2131742782, "formatDateScheduleYear", null), "MMM d yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f22898p;
    }

    public final FastDateFormat z0() {
        String O0;
        String str;
        if (this.f22891i == null) {
            synchronized (this) {
                try {
                    if (this.f22891i == null) {
                        Locale locale = this.f22906y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        if (f22880c0) {
                            O0 = O0(2131742763, "formatterStats24H", null);
                        } else {
                            O0 = O0(2131742764, "formatterStats12H", null);
                        }
                        if (f22880c0) {
                            str = "MMM dd yyyy, HH:mm";
                        } else {
                            str = "MMM dd yyyy, h:mm a";
                        }
                        this.f22891i = k(locale, O0, str);
                    }
                } finally {
                }
            }
        }
        return this.f22891i;
    }
}
