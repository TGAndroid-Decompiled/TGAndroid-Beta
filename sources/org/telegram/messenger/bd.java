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
import org.telegram.ui.Components.o31;
public final class bd {
    public static boolean f21784a0 = false;
    public static int f21785b0 = 1;
    public static boolean f21786c0 = false;
    public static volatile bd f21787d0;
    public static final char[] f21788e0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final char[][] f21789f0 = {new char[]{1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641}, new char[]{1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785}, new char[]{2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415}, new char[]{2790, 2791, 2792, 2793, 2794, 2795, 2796, 2797, 2798, 2799}, new char[]{2662, 2663, 2664, 2665, 2666, 2667, 2668, 2669, 2670, 2671}, new char[]{2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543}, new char[]{3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311}, new char[]{2918, 2919, 2920, 2921, 2922, 2923, 2924, 2925, 2926, 2927}, new char[]{3430, 3431, 3432, 3433, 3434, 3435, 3436, 3437, 3438, 3439}, new char[]{3046, 3047, 3048, 3049, 3050, 3051, 3052, 3053, 3054, 3055}, new char[]{3174, 3175, 3176, 3177, 3178, 3179, 3180, 3181, 3182, 3183}, new char[]{4160, 4161, 4162, 4163, 4164, 4165, 4166, 4167, 4168, 4169}, new char[]{3872, 3873, 3874, 3875, 3876, 3877, 3878, 3879, 3880, 3881}, new char[]{6160, 6161, 6162, 6163, 6164, 6165, 6166, 6167, 6168, 6169}, new char[]{6112, 6113, 6114, 6115, 6116, 6117, 6118, 6119, 6120, 6121}, new char[]{3664, 3665, 3666, 3667, 3668, 3669, 3670, 3671, 3672, 3673}, new char[]{3792, 3793, 3794, 3795, 3796, 3797, 3798, 3799, 3800, 3801}, new char[]{43472, 43473, 43474, 43475, 43476, 43477, 43478, 43479, 43480, 43481}};
    public static Boolean f21790g0;
    public zc A;
    public yc B;
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
    public ti.b U;
    public volatile Locale V;
    public volatile ti.b W;
    public volatile boolean X;
    public ti.b Y;
    public int Z;
    public volatile FastDateFormat f21791a;
    public volatile FastDateFormat f21792b;
    public volatile FastDateFormat f21793c;
    public volatile FastDateFormat d;
    public volatile FastDateFormat f21794e;
    public volatile FastDateFormat f21795f;
    public volatile FastDateFormat f21796g;
    public volatile FastDateFormat h;
    public volatile FastDateFormat f21797i;
    public volatile FastDateFormat f21798j;
    public volatile FastDateFormat f21799k;
    public volatile FastDateFormat f21800l;
    public volatile FastDateFormat f21801m;
    public volatile FastDateFormat f21802n;
    public volatile FastDateFormat f21803o;
    public volatile FastDateFormat f21804p;
    public volatile FastDateFormat f21805q;
    public volatile FastDateFormat f21806r;
    public volatile FastDateFormat f21807s;
    public volatile FastDateFormat f21808t;
    public volatile FastDateFormat f21809u;
    public volatile FastDateFormat v;
    public Locale f21812y;
    public Locale f21813z;
    public final FastDateFormat[] f21810w = new FastDateFormat[18];
    public final HashMap f21811x = new HashMap();
    public boolean D = false;

    public bd() {
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
        this.S = new HashMap();
        this.T = new HashMap();
        ti.b bVar = ti.b.f55445c;
        this.W = bVar;
        this.Y = bVar;
        b(new String[]{"bem", "brx", "da", "de", "el", "en", "eo", "es", "et", "fi", "fo", "gl", "he", "iw", "it", "nb", "nl", "nn", "no", "sv", "af", "bg", "bn", "ca", "eu", "fur", "fy", "gu", "ha", "is", "ku", "lb", "ml", "mr", "nah", "ne", "om", "or", "pa", "pap", "ps", "so", "sq", "sw", "ta", "te", "tk", "ur", "zu", "mn", "gsw", "chr", "rm", "pt", "an", "ast"}, new zc(11));
        b(new String[]{"cs", "sk"}, new zc(3));
        b(new String[]{"ff", "fr", "kab"}, new zc(4));
        b(new String[]{"ru", "uk", "be"}, new zc(1));
        b(new String[]{"sr", "hr", "bs", "sh"}, new zc(14));
        b(new String[]{"lv"}, new zc(6));
        b(new String[]{"lt"}, new zc(7));
        b(new String[]{"pl"}, new zc(12));
        b(new String[]{"ro", "mo"}, new zc(13));
        b(new String[]{"sl"}, new zc(15));
        b(new String[]{"ar"}, new zc(0));
        b(new String[]{"mk"}, new zc(8));
        b(new String[]{"cy"}, new zc(18));
        b(new String[]{"br"}, new zc(2));
        b(new String[]{"lag"}, new zc(5));
        b(new String[]{"shi"}, new zc(16));
        b(new String[]{"mt"}, new zc(9));
        b(new String[]{"ga", "se", "sma", "smi", "smj", "smn", "sms"}, new zc(17));
        b(new String[]{"ak", "am", "bh", "fil", "tl", "guw", "hi", "ln", "mg", "nso", "ti", "wa"}, new zc(19));
        b(new String[]{"az", "bm", "fa", "ig", "hu", "ja", "kde", "kea", "ko", "my", "ses", "sg", "to", "tr", "vi", "wo", "yo", "zh", "bo", "dz", "id", "jv", "jw", "ka", "km", "kn", "ms", "th", "in"}, new zc(10));
        ?? obj = new Object();
        obj.f26561a = "English";
        obj.f26562b = "English";
        obj.f26565f = "en";
        obj.f26563c = "en";
        yc ycVar = null;
        obj.d = null;
        obj.f26568j = true;
        arrayList.add(obj);
        hashMap.put(obj.f26563c, obj);
        ?? obj2 = new Object();
        obj2.f26561a = "Italiano";
        obj2.f26562b = "Italian";
        obj2.f26565f = "it";
        obj2.f26563c = "it";
        obj2.d = null;
        obj2.f26568j = true;
        arrayList.add(obj2);
        hashMap.put(obj2.f26563c, obj2);
        ?? obj3 = new Object();
        obj3.f26561a = "Español";
        obj3.f26562b = "Spanish";
        obj3.f26565f = "es";
        obj3.f26563c = "es";
        obj3.f26568j = true;
        arrayList.add(obj3);
        hashMap.put(obj3.f26563c, obj3);
        ?? obj4 = new Object();
        obj4.f26561a = "Deutsch";
        obj4.f26562b = "German";
        obj4.f26565f = "de";
        obj4.f26563c = "de";
        obj4.d = null;
        obj4.f26568j = true;
        arrayList.add(obj4);
        hashMap.put(obj4.f26563c, obj4);
        ?? obj5 = new Object();
        obj5.f26561a = "Nederlands";
        obj5.f26562b = "Dutch";
        obj5.f26565f = "nl";
        obj5.f26563c = "nl";
        obj5.d = null;
        obj5.f26568j = true;
        arrayList.add(obj5);
        hashMap.put(obj5.f26563c, obj5);
        ?? obj6 = new Object();
        obj6.f26561a = "العربية";
        obj6.f26562b = "Arabic";
        obj6.f26565f = "ar";
        obj6.f26563c = "ar";
        obj6.d = null;
        obj6.f26568j = true;
        obj6.f26566g = true;
        arrayList.add(obj6);
        hashMap.put(obj6.f26563c, obj6);
        ?? obj7 = new Object();
        obj7.f26561a = "Português (Brasil)";
        obj7.f26562b = "Portuguese (Brazil)";
        obj7.f26565f = "pt_br";
        obj7.f26563c = "pt_br";
        obj7.d = null;
        obj7.f26568j = true;
        arrayList.add(obj7);
        hashMap.put(obj7.f26563c, obj7);
        ?? obj8 = new Object();
        obj8.f26561a = "한국어";
        obj8.f26562b = "Korean";
        obj8.f26565f = "ko";
        obj8.f26563c = "ko";
        obj8.d = null;
        obj8.f26568j = true;
        arrayList.add(obj8);
        hashMap.put(obj8.f26563c, obj8);
        ?? obj9 = new Object();
        obj9.f26561a = "Українська";
        obj9.f26562b = "Ukrainian";
        obj9.f26565f = "uk";
        obj9.f26563c = "uk";
        obj9.d = null;
        obj9.f26568j = true;
        arrayList.add(obj9);
        hashMap.put(obj9.f26563c, obj9);
        ?? obj10 = new Object();
        obj10.f26561a = "Русский";
        obj10.f26562b = "Russian";
        obj10.f26565f = "ru";
        obj10.f26563c = "ru";
        obj10.d = null;
        obj10.f26568j = true;
        arrayList.add(obj10);
        hashMap.put(obj10.f26563c, obj10);
        SharedPreferences sharedPreferences = t0.f25457b.getSharedPreferences("langconfig", 0);
        String string = sharedPreferences.getString("locales", null);
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split("&")) {
                yc a10 = yc.a(str);
                if (a10 != null) {
                    this.O.add(a10);
                }
            }
        }
        String string2 = sharedPreferences.getString("remote", null);
        if (!TextUtils.isEmpty(string2)) {
            for (String str2 : string2.split("&")) {
                yc a11 = yc.a(str2);
                a11.f26563c = a11.f26563c.replace("-", "_");
                if (!this.M.containsKey(a11.b())) {
                    this.L.add(a11);
                    this.M.put(a11.b(), a11);
                }
            }
        }
        String string3 = sharedPreferences.getString("unofficial", null);
        if (!TextUtils.isEmpty(string3)) {
            for (String str3 : string3.split("&")) {
                yc a12 = yc.a(str3);
                if (a12 != null) {
                    a12.f26563c = a12.f26563c.replace("-", "_");
                    this.K.add(a12);
                }
            }
        }
        if (this.L.isEmpty()) {
            g0.h3(new Runnable(this) {
                public final bd f24188b;

                {
                    this.f24188b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f24188b.V0(h10.f22829t0, true);
                            return;
                        default:
                            bd bdVar = this.f24188b;
                            bdVar.getClass();
                            bdVar.F = bd.Q0();
                            return;
                    }
                }
            });
        }
        for (int i3 = 0; i3 < this.O.size(); i3++) {
            yc ycVar2 = (yc) this.O.get(i3);
            this.J.add(ycVar2);
            this.N.put(ycVar2.b(), ycVar2);
        }
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            yc ycVar3 = (yc) this.L.get(i10);
            yc G0 = G0(ycVar3.b());
            if (G0 != null) {
                G0.d = ycVar3.d;
                G0.h = ycVar3.h;
                G0.f26567i = ycVar3.f26567i;
                G0.f26569k = ycVar3.f26569k;
                this.L.set(i10, G0);
            } else {
                this.J.add(ycVar3);
                this.N.put(ycVar3.b(), ycVar3);
            }
        }
        for (int i11 = 0; i11 < this.K.size(); i11++) {
            yc ycVar4 = (yc) this.K.get(i11);
            yc G02 = G0(ycVar4.b());
            if (G02 != null) {
                G02.d = ycVar4.d;
                G02.h = ycVar4.h;
                G02.f26567i = ycVar4.f26567i;
                G02.f26569k = ycVar4.f26569k;
                this.K.set(i11, G02);
            } else {
                this.N.put(ycVar4.b(), ycVar4);
            }
        }
        this.f21813z = Locale.getDefault();
        f21786c0 = DateFormat.is24HourFormat(t0.f25457b);
        try {
            String string4 = hp.e1().getString("language", null);
            if (string4 != null && (ycVar = G0(string4)) != null) {
                z10 = true;
            }
            if (ycVar == null && this.f21813z.getLanguage() != null) {
                ycVar = G0(this.f21813z.getLanguage());
            }
            if (ycVar == null && (ycVar = G0(I0(this.f21813z))) == null) {
                ycVar = G0("en");
            }
            d(ycVar, z10, true, h10.f22829t0);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                t0.f25457b.registerReceiver(new androidx.mediarouter.app.f(this, 9), intentFilter, 4);
            } else {
                t0.f25457b.registerReceiver(new androidx.mediarouter.app.f(this, 9), intentFilter);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        g0.h3(new Runnable(this) {
            public final bd f24188b;

            {
                this.f24188b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f24188b.V0(h10.f22829t0, true);
                        return;
                    default:
                        bd bdVar = this.f24188b;
                        bdVar.getClass();
                        bdVar.F = bd.Q0();
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
                return ad.a(j12, locale);
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
            str = E0().B0().format(j11);
        }
        if (z12) {
            str2 = E0().s0().format(j11);
        } else if (tL_messageEntityFormattedDate.long_date) {
            str2 = E0().h0().format(j11);
        } else if (!tL_messageEntityFormattedDate.short_date) {
            str2 = "";
        } else {
            str2 = E0().C0().format(j11);
        }
        if (z12) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            if (calendar.get(13) != 0) {
                format = E0().r0().format(j11);
            } else {
                format = E0().p0().format(j11);
            }
            str4 = format;
        } else if (tL_messageEntityFormattedDate.long_time) {
            str4 = E0().r0().format(j11);
        } else if (tL_messageEntityFormattedDate.short_time) {
            str4 = E0().p0().format(j11);
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        boolean isEmpty3 = TextUtils.isEmpty(str4);
        if (isEmpty2 && isEmpty3) {
            return str;
        }
        if (!isEmpty2 && !isEmpty3) {
            str3 = a0(null, null, 2131742793, str2, str4);
        } else {
            if (isEmpty2) {
                str2 = str4;
            }
            str3 = str2;
        }
        if (!isEmpty) {
            return a0(null, null, 2131746342, str, str3);
        }
        return str3;
    }

    public static String B(long j10) {
        String a02;
        long j11 = j10 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                a02 = a0(null, null, 2131742793, E0().q0().format(new Date(j11)), E0().p0().format(new Date(j11)));
            } else {
                a02 = a0(null, null, 2131742793, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11)));
            }
            return a0(null, null, 2131752335, a02);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String C(int i3) {
        int i10;
        int i11;
        int i12 = (i3 / 60) / 60;
        int i13 = i3 - (i12 * 3600);
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

    public static String D(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i3 && i10 == i12) {
                int currentTime = ((int) (ConnectionsManager.getInstance(h10.f22829t0).getCurrentTime() - (j11 / 1000))) / 60;
                if (currentTime < 1) {
                    return M0(2131748753, null);
                }
                if (currentTime < 60) {
                    return G(currentTime, "UpdatedMinutes", new Object[0]);
                }
                return a0(null, null, 2131748754, a0("TodayAtFormatted", null, 2131744121, E0().p0().format(new Date(j11))));
            } else if (i11 + 1 == i3 && i10 == i12) {
                return a0(null, null, 2131748754, a0("YesterdayAtFormatted", null, 2131742853, E0().p0().format(new Date(j11))));
            } else {
                if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                    return a0(null, null, 2131748754, a0(null, null, 2131742793, E0().q0().format(new Date(j11)), E0().p0().format(new Date(j11))));
                }
                return a0(null, null, 2131748754, a0(null, null, 2131742793, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11))));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String E(long j10, char c2) {
        if (j10 < 0) {
            return k2.p1.l(-j10, c2, new StringBuilder("-"));
        }
        StringBuilder sb2 = new StringBuilder(String.format("%d", Long.valueOf(j10)));
        for (int length = sb2.length() - 3; length > 0; length -= 3) {
            sb2.insert(length, c2);
        }
        return sb2.toString();
    }

    public static bd E0() {
        bd bdVar;
        bd bdVar2 = f21787d0;
        if (bdVar2 == null) {
            synchronized (bd.class) {
                try {
                    bdVar = f21787d0;
                    if (bdVar == null) {
                        bdVar = new bd();
                        f21787d0 = bdVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bdVar;
        }
        return bdVar2;
    }

    public static CharSequence F(String str, int i3, CharSequence... charSequenceArr) {
        if (str.length() != 0 && E0().A != null) {
            E0();
            String C = a1.g.C(str, "_", f1(E0().A.a(i3)));
            Object[] objArr = new Object[charSequenceArr.length + 1];
            objArr[0] = Integer.valueOf(i3);
            System.arraycopy(charSequenceArr, 0, objArr, 1, charSequenceArr.length);
            return V(C, str.concat("_other"), 0, objArr);
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
            char c2 = (char) 55356;
            return new String(new char[]{c2, (char) (((charArray[0] + 61861) & 1023) + 56320), c2, (char) (((charArray[1] + 61861) & 1023) + 56320)});
        }
        return null;
    }

    public static String G(int i3, String str, Object... objArr) {
        if (str.length() != 0 && E0().A != null) {
            E0();
            String C = a1.g.C(str, "_", f1(E0().A.a(i3)));
            Object[] objArr2 = new Object[objArr.length + 1];
            objArr2[0] = Integer.valueOf(i3);
            System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
            return a0(C, str.concat("_other"), 0, objArr2);
        }
        return "LOC_ERR:".concat(str);
    }

    public static String H(char c2, String str, int i3) {
        return K(str, i3, c2, new Object[0]);
    }

    public static String I(int i3, String str) {
        return H(',', str, i3);
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

    public static String J(int i3, String str, Object... objArr) {
        return K(str, i3, ',', objArr);
    }

    public static String J0() {
        yc ycVar = E0().B;
        if (ycVar != null) {
            return ycVar.c();
        }
        Locale locale = E0().f21812y;
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

    public static String K(String str, int i3, char c2, Object... objArr) {
        StringBuilder sb2;
        try {
            if (str.length() != 0 && E0().A != null) {
                E0();
                String str2 = str + "_" + f1(E0().A.a(i3));
                StringBuilder sb3 = new StringBuilder(String.format("%d", Integer.valueOf(i3)));
                for (int length = sb3.length() - 3; length > 0; length -= 3) {
                    sb3.insert(length, c2);
                }
                boolean z10 = r2.f25040a;
                String b10 = E0().Y.b(str2);
                if (b10 == null) {
                    b10 = E0().Y.b(str + "_other");
                }
                if (b10 == null) {
                    try {
                        bd E0 = E0();
                        E0.i();
                        b10 = E0.W.b(str2);
                    } catch (Exception unused) {
                    }
                }
                if (b10 == null) {
                    bd E02 = E0();
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
                if (E0().f21812y != null) {
                    return String.format(E0().f21812y, replace, objArr2);
                }
                return String.format(replace, objArr2);
            }
            return "LOC_ERR:".concat(str);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: ".concat(str);
        }
    }

    public static String K0(int i3, String str) {
        if (str.length() != 0 && E0().A != null) {
            E0();
            return E0().O0(0, a1.g.C(str, "_", f1(E0().A.a(i3))), str.concat("_other"));
        }
        return "LOC_ERR:".concat(str);
    }

    public static String L(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i3 && i10 == i12) {
                return a0(null, null, 2131747210, E0().p0().format(new Date(j11)));
            }
            if (i11 + 1 == i3 && i10 == i12) {
                return a0(null, null, 2131747209, E0().p0().format(new Date(j11)));
            }
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                return a0(null, null, 2131747211, E0().q0().format(new Date(j11)), E0().p0().format(new Date(j11)));
            }
            return a0(null, null, 2131747211, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String L0(int i3) {
        return M0(i3, null);
    }

    public static String M(int i3, boolean z10) {
        String G;
        int i10;
        if (i3 < 86400) {
            G = R(i3);
        } else {
            G = G(i3 / 86400, "Days", new Object[0]);
        }
        if (z10) {
            i10 = 2131747168;
        } else {
            i10 = 2131747180;
        }
        return a0(null, null, i10, G);
    }

    public static String M0(int i3, String str) {
        return E0().O0(i3, str, null);
    }

    public static String N(long j10) {
        try {
            long j11 = j10 / 60;
            long j12 = j11 / 60;
            long j13 = j12 / 24;
            long j14 = j13 / 30;
            long j15 = j13 / 365;
            int i3 = (j15 > 1L ? 1 : (j15 == 1L ? 0 : -1));
            if (i3 >= 0) {
                if (i3 == 0) {
                    return M0(2131742866, null);
                }
                return H(',', "YearsAgo", (int) j15);
            }
            int i10 = (j14 > 1L ? 1 : (j14 == 1L ? 0 : -1));
            if (i10 >= 0) {
                if (i10 == 0) {
                    return M0(2131748353, null);
                }
                return H(',', "MonthsAgo", (int) j14);
            }
            int i11 = (j13 > 1L ? 1 : (j13 == 1L ? 0 : -1));
            if (i11 >= 0) {
                if (i11 == 0) {
                    return M0(2131751669, null);
                }
                return H(',', "DaysAgo", (int) j13);
            }
            int i12 = (j12 > 1L ? 1 : (j12 == 1L ? 0 : -1));
            if (i12 >= 0) {
                if (i12 == 0) {
                    return M0(2131749297, null);
                }
                return H(',', "HoursAgo", (int) j12);
            }
            int i13 = (j11 > 1L ? 1 : (j11 == 1L ? 0 : -1));
            if (i13 >= 0) {
                if (i13 == 0) {
                    return M0(2131748434, null);
                }
                return H(',', "MinutesAgo", (int) j11);
            }
            return M0(2131748995, null);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String N0(String str) {
        if (TextUtils.isEmpty(str)) {
            return t4.c.f("LOC_ERR:", str);
        }
        return M0(0, str);
    }

    public static String O(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i3 && i10 == i12) {
                return a0(null, null, 2131744120, E0().p0().format(new Date(j11)));
            }
            if (i11 + 1 == i3 && i10 == i12) {
                return a0(null, null, 2131742853, E0().p0().format(new Date(j11)));
            }
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                return a0(null, null, 2131742793, E0().q0().format(new Date(j11)), E0().p0().format(new Date(j11)));
            }
            return a0(null, null, 2131742793, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String P(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            long j12 = timeInMillis - j11;
            if (j12 < 60000) {
                return M0(2131745367, null);
            }
            if (j12 < 3600000) {
                return G((int) (j12 / 60000), "ShortMinutesAgo", new Object[0]);
            }
            if (i11 == i3 && i10 == i12) {
                if (j12 < 43200000) {
                    return G((int) (j12 / 3600000), "ShortHoursAgo", new Object[0]);
                }
                return M0(2131745365, null);
            } else if (i11 + 1 == i3 && i10 == i12) {
                return M0(2131745364, null);
            } else {
                if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                    return E0().q0().format(new Date(j11));
                }
                return a0(null, null, 2131742793, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11)));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String Q(long j10) {
        long j11 = j10 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                return E0().w0().format(new Date(j11)) + ", " + E0().p0().format(new Date(j11));
            }
            return E0().y0().format(new Date(j11)) + ", " + E0().p0().format(new Date(j11));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String Q0() {
        Locale locale = E0().f21813z;
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

    public static String R(int i3) {
        String str;
        String str2;
        int i10 = i3 / 3600;
        int i11 = (i3 / 60) % 60;
        int i12 = i3 % 60;
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

    public static String S(int[] iArr, int i3) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            int i11 = i3 / 1000;
            if (i11 <= 0) {
                break;
            }
            sb2.append("K");
            i10 = (i3 % 1000) / 100;
            i3 = i11;
        }
        if (iArr != null) {
            double d = (i10 / 10.0d) + i3;
            for (int i12 = 0; i12 < sb2.length(); i12++) {
                d *= 1000.0d;
            }
            iArr[0] = (int) d;
        }
        if (i10 != 0 && sb2.length() > 0) {
            if (sb2.length() == 2) {
                Locale locale = Locale.US;
                return i3 + "." + i10 + "M";
            }
            Locale locale2 = Locale.US;
            return i3 + "." + i10 + sb2.toString();
        } else if (sb2.length() == 2) {
            Locale locale3 = Locale.US;
            return com.google.android.recaptcha.internal.a.h(i3, "M");
        } else {
            Locale locale4 = Locale.US;
            return com.google.android.recaptcha.internal.a.h(i3, sb2.toString());
        }
    }

    public static String T(long j10) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i3 = calendar.get(1);
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(j11);
            if (i3 == calendar.get(1)) {
                return E0().q0().format(j11);
            }
            return E0().q0().format(j11) + ", " + calendar.get(1);
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

    public static CharSequence U(int i3, Object... objArr) {
        return V(null, null, i3, objArr);
    }

    public static boolean U0(int i3) {
        if (i3 != 9 && i3 != 10 && i3 != 13) {
            if (i3 < 32 || i3 > 55295) {
                if (i3 < 57344 || i3 > 65533) {
                    if (i3 < 65536 || i3 > 1114111) {
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

    public static CharSequence V(String str, String str2, int i3, Object... objArr) {
        String str3;
        try {
            String P0 = E0().P0(i3, str, str2);
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

    public static String W(int i3, long j10, boolean z10) {
        int i10;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        int i12 = calendar.get(6);
        calendar.setTimeInMillis(j10 * 1000);
        int i13 = calendar.get(1);
        int i14 = calendar.get(6);
        if (i11 == i13) {
            if (z10 && i14 == i12) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        } else {
            i10 = 2;
        }
        if (i3 == 1) {
            i10 += 3;
        } else if (i3 == 2) {
            i10 += 6;
        } else if (i3 == 3) {
            i10 += 9;
        } else if (i3 == 4) {
            i10 += 12;
        }
        return E0().x0(i10).format(calendar.getTimeInMillis());
    }

    public static String X(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            long j12 = timeInMillis - j11;
            if (j12 < 60000) {
                return M0(2131746008, null);
            }
            if (j12 < 3600000) {
                int i13 = (int) (j12 / 60000);
                return G(i13, "MinutesAgo", Integer.valueOf(i13));
            } else if (i11 == i3 && i10 == i12) {
                return a0(null, null, 2131744120, E0().p0().format(new Date(j11)));
            } else {
                if (i11 + 1 == i3 && i10 == i12) {
                    return a0(null, null, 2131742853, E0().p0().format(new Date(j11)));
                }
                if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                    return a0(null, null, 2131742793, E0().q0().format(new Date(j11)), E0().p0().format(new Date(j11)));
                }
                return a0(null, null, 2131742793, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11)));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static void X0(String str) {
        if (r2.f25040a) {
            a8.b("set as patched " + str + " langpack");
        }
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putBoolean("lngpack_patched_" + str, true).apply();
    }

    public static String Y(int i3, String str, Object... objArr) {
        return a0(str, null, i3, objArr);
    }

    public static String Z(int i3, Object... objArr) {
        return a0(null, null, i3, objArr);
    }

    public static String a(String str) {
        return str.replace(' ', (char) 160);
    }

    public static String a0(String str, String str2, int i3, Object... objArr) {
        try {
            String P0 = E0().P0(i3, str, str2);
            if (P0 == null) {
                return "LOC_ERR: " + str;
            } else if (E0().f21812y != null) {
                return String.format(E0().f21812y, P0, objArr);
            } else {
                return String.format(P0, objArr);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            if (i3 != 0) {
                try {
                    return String.format(t0.f25457b.getString(i3), objArr);
                } catch (Exception unused) {
                    return t4.c.f("LOC_ERR: ", str);
                }
            }
            return t4.c.f("LOC_ERR: ", str);
        }
    }

    public static String b0(String str, Object... objArr) {
        try {
            if (E0().f21812y != null) {
                return String.format(E0().f21812y, str, objArr);
            }
            return String.format(str, objArr);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: " + str;
        }
    }

    public static String c0(int i3) {
        if (i3 < 60) {
            return G(i3, "Seconds", new Object[0]);
        }
        if (i3 < 3600) {
            return G(i3 / 60, "Minutes", new Object[0]);
        }
        if (i3 < 86400) {
            return G((i3 / 60) / 60, "Hours", new Object[0]);
        }
        if (i3 < 604800) {
            return G(((i3 / 60) / 60) / 24, "Days", new Object[0]);
        }
        if (i3 < 2678400) {
            int i10 = ((i3 / 60) / 60) / 24;
            if (i3 % 7 == 0) {
                return G(i10 / 7, "Weeks", new Object[0]);
            }
            return a1.g.C(G(i10 / 7, "Weeks", new Object[0]), " ", G(i10 % 7, "Days", new Object[0]));
        } else if (i3 >= 31536000 && i3 % 31536000 == 0) {
            return G((((i3 / 60) / 60) / 24) / 365, "Years", new Object[0]);
        } else {
            return G((((i3 / 60) / 60) / 24) / 30, "Months", new Object[0]);
        }
    }

    public static String d0(int i3, TLRPC.User user, boolean[] zArr, boolean[] zArr2) {
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
        if (user != null && (userStatus2 = user.status) != null && userStatus2.expires <= 0 && hp.s1(i3).f22954a0.containsKey(Long.valueOf(user.f27150id))) {
            if (zArr != null) {
                zArr[0] = true;
            }
            return M0(2131747834, "Online");
        } else if (user != null && (userStatus = user.status) != null && userStatus.expires != 0 && !l10.x(user) && !(user instanceof TLRPC.TL_userEmpty)) {
            int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
            int i13 = user.status.expires;
            if (i13 > currentTime) {
                if (zArr != null) {
                    zArr[0] = true;
                }
                return M0(2131747834, "Online");
            } else if (i13 == -1) {
                return M0(2131749186, "Invisible");
            } else {
                if (i13 != -100 && i13 != -1000) {
                    if (i13 != -101 && i13 != -1001) {
                        if (i13 != -102 && i13 != -1002) {
                            return w(i13, zArr2);
                        }
                        return M0(2131742873, "WithinAMonth");
                    }
                    return M0(2131742872, "WithinAWeek");
                }
                return M0(2131749019, "Lately");
            }
        } else {
            return M0(2131754951, "ALongTimeAgo");
        }
    }

    public static String e0(long j10, boolean z10) {
        long j11 = 1000 * j10;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            String[] strArr = {M0(2131749094, null), M0(2131750830, null), M0(2131748691, null), M0(2131754173, null), M0(2131748670, null), M0(2131749072, null), M0(2131749074, null), M0(2131753895, null), M0(2131745575, null), M0(2131747838, null), M0(2131747843, null), M0(2131751606, null)};
            if (i3 == i10 && !z10) {
                return strArr[i11];
            }
            return strArr[i11] + " " + i10;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String e1(long j10) {
        long j11 = j10 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j11) >= 31536000000L) {
                return E0().C0().format(new Date(j11));
            }
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            calendar.setTimeInMillis(j11);
            int i10 = calendar.get(6) - i3;
            if (i10 != 0 && (i10 != -1 || System.currentTimeMillis() - j11 >= 28800000)) {
                if (i10 > -7 && i10 <= -1) {
                    return E0().A0().format(new Date(j11));
                }
                return E0().q0().format(new Date(j11));
            }
            return E0().p0().format(new Date(j11));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String f0(long j10) {
        long j11 = 1000 * j10;
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i3 = calendar.get(1);
            int i10 = calendar.get(2);
            int i11 = calendar.get(5);
            return new String[]{M0(2131749094, null), M0(2131750830, null), M0(2131748691, null), M0(2131754173, null), M0(2131748670, null), M0(2131749072, null), M0(2131749074, null), M0(2131753895, null), M0(2131745575, null), M0(2131747838, null), M0(2131747843, null), M0(2131751606, null)}[i10] + " " + i11 + ", " + i3;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String f1(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 != 8) {
                        if (i3 != 16) {
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
            ((Spannable) str).setSpan(new o31(g0.o()), 0, str.length(), 33);
            return (Spannable) str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new o31(g0.o()), 0, str.length(), 33);
        return spannableStringBuilder;
    }

    public static int h(HashMap hashMap) {
        String j10;
        HashSet hashSet = new HashSet();
        int i3 = 0;
        for (String str : hashMap.keySet()) {
            if (str != null) {
                if (str.endsWith("_other")) {
                    j10 = com.google.android.recaptcha.internal.a.j(str, 6, 0);
                } else if (!str.endsWith("_zero") && !str.endsWith("_many")) {
                    if (!str.endsWith("_one") && !str.endsWith("_two") && !str.endsWith("_few")) {
                        j10 = null;
                    } else {
                        j10 = com.google.android.recaptcha.internal.a.j(str, 4, 0);
                    }
                } else {
                    j10 = com.google.android.recaptcha.internal.a.j(str, 5, 0);
                }
                if (j10 != null) {
                    if (!hashSet.contains(j10)) {
                        hashSet.add(j10);
                    }
                }
                i3++;
            }
        }
        hashSet.clear();
        return i3;
    }

    public static String i0(int i3, String str) {
        if (str != null && str.equalsIgnoreCase("ft")) {
            return M0(i3, null);
        }
        try {
            return new Locale("", str).getDisplayCountry(E0().f21812y);
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static String j0() {
        yc ycVar = E0().B;
        if (ycVar != null && !TextUtils.isEmpty(ycVar.f26561a)) {
            return ycVar.f26561a;
        }
        return M0(2131749057, "LanguageName");
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
        if (f21790g0 == null) {
            int i3 = az.f21663s1;
            boolean z10 = false;
            if (i3 == 0) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) t0.f25457b.getSystemService("phone");
                    if (telephonyManager != null) {
                        String upperCase = telephonyManager.getSimCountryIso().toUpperCase();
                        if (!"US".equals(upperCase)) {
                            if (!"GB".equals(upperCase)) {
                                if (!"MM".equals(upperCase)) {
                                    if ("LR".equals(upperCase)) {
                                    }
                                    f21790g0 = Boolean.valueOf(z10);
                                    return;
                                }
                            }
                        }
                        z10 = true;
                        f21790g0 = Boolean.valueOf(z10);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    f21790g0 = Boolean.FALSE;
                    a8.g(e10, true);
                    return;
                }
            }
            if (i3 == 2) {
                z10 = true;
            }
            f21790g0 = Boolean.valueOf(z10);
        }
    }

    public static int l0(yc ycVar, TLRPC.TL_langPackDifference tL_langPackDifference) {
        String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
        if (lowerCase.equals(ycVar.f26563c)) {
            return 0;
        }
        if (lowerCase.equals(ycVar.f26564e)) {
            return 1;
        }
        return -1;
    }

    public static java.lang.String m(java.lang.String r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bd.m(java.lang.String, boolean):java.lang.String");
    }

    public static String n(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence);
        int length = sb2.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = sb2.charAt(i3);
            if ((charAt < '0' || charAt > '9') && charAt != '.' && charAt != ',') {
                int i10 = 0;
                while (i10 < 18) {
                    int i11 = 0;
                    while (true) {
                        char[] cArr = f21789f0[i10];
                        if (i11 >= cArr.length) {
                            break;
                        } else if (charAt == cArr[i11]) {
                            sb2.setCharAt(i3, f21788e0[i11]);
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

    public static String o(int i3) {
        if (i3 > 3600) {
            String G = G(i3 / 3600, "Hours", new Object[0]);
            int i10 = (i3 % 3600) / 60;
            if (i10 > 0) {
                StringBuilder h = t4.c.h(G, ", ");
                h.append(G(i10, "Minutes", new Object[0]));
                return h.toString();
            }
            return G;
        } else if (i3 > 60) {
            return G(i3 / 60, "Minutes", new Object[0]);
        } else {
            return G(i3, "Seconds", new Object[0]);
        }
    }

    public static String r(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i3 && i10 == i12) {
                if (z10) {
                    return M0(2131745365, null);
                }
                return E0().p0().format(new Date(j11));
            } else if (i11 + 1 == i3 && i10 == i12) {
                return M0(2131742855, "Yesterday");
            } else {
                if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                    return E0().q0().format(new Date(j11));
                }
                return E0().C0().format(new Date(j11));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: formatDate";
        }
    }

    public static String s(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i3 && i10 == i12) {
                if (z10) {
                    return a0(null, null, 2131744121, E0().p0().format(new Date(j11)));
                }
                return a0(null, null, 2131744120, E0().p0().format(new Date(j11)));
            } else if (i11 + 1 == i3 && i10 == i12) {
                return a0(null, null, 2131742853, E0().p0().format(new Date(j11)));
            } else {
                if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                    return a0(null, null, 2131742793, E0().q0().format(new Date(j11)), E0().p0().format(new Date(j11)));
                }
                return a0(null, null, 2131742793, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11)));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String t(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i3 && i10 == i12) {
                return E0().p0().format(new Date(j11));
            }
            if (i11 + 1 == i3 && i10 == i12) {
                return a0(null, null, 2131742853, E0().p0().format(new Date(j11)));
            }
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                bd E0 = E0();
                if (E0.f21801m == null) {
                    synchronized (E0) {
                        if (E0.f21801m == null) {
                            Locale locale = E0.f21812y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            E0.f21801m = k(locale, E0.O0(2131742795, "chatDateShort", null), "d MMM");
                        }
                    }
                }
                return a0(null, null, 2131742793, E0.f21801m.format(new Date(j11)), E0().p0().format(new Date(j11)));
            }
            return a0(null, null, 2131742793, E0().h0().format(new Date(j11)), E0().p0().format(new Date(j11)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String u(long j10, boolean z10) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i3 = calendar.get(1);
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(j11);
            if (z10) {
                if (i3 != calendar.get(1)) {
                }
                return E0().g0().format(j11);
            }
            if (z10 || Math.abs(System.currentTimeMillis() - j11) >= 31536000000L) {
                return E0().h0().format(j11);
            }
            return E0().g0().format(j11);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static String v(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            if (i3 == calendar.get(1)) {
                return E0().n0().format(new Date(j11));
            }
            return E0().m0().format(new Date(j11));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String w(long j10, boolean[] zArr) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            int i11 = calendar.get(11);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            int i14 = calendar.get(11);
            if (i12 == i3 && i10 == i13) {
                return a0(null, null, 2131749025, a0("TodayAtFormatted", null, 2131744121, E0().p0().format(new Date(j11))));
            }
            if (i12 + 1 == i3 && i10 == i13) {
                if (zArr != null) {
                    zArr[0] = true;
                    if (i11 <= 6 && i14 > 18 && f21786c0) {
                        return a0(null, null, 2131749025, E0().p0().format(new Date(j11)));
                    }
                    return a0(null, null, 2131742853, E0().p0().format(new Date(j11)));
                }
                return a0(null, null, 2131749025, a0("YesterdayAtFormatted", null, 2131742853, E0().p0().format(new Date(j11))));
            } else if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                return a0("LastSeenDateFormatted", null, 2131749028, a0("formatDateAtTime", null, 2131742793, E0().q0().format(new Date(j11)), E0().p0().format(new Date(j11))));
            } else {
                return a0("LastSeenDateFormatted", null, 2131749028, a0("formatDateAtTime", null, 2131742793, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11))));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String x(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i3 && i10 == i12 && z10) {
                return a0(null, null, 2131744120, E0().p0().format(new Date(j11)));
            }
            if (i11 + 1 == i3 && i10 == i12 && z10) {
                return a0(null, null, 2131742853, E0().p0().format(new Date(j11)));
            }
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                return a0(null, null, 2131742793, E0().g0().format(new Date(j11)), E0().p0().format(new Date(j11)));
            }
            return a0(null, null, 2131742793, E0().h0().format(new Date(j11)), E0().p0().format(new Date(j11)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String y(float f10, int i3, Boolean bool) {
        String format;
        String format2;
        l();
        if ((bool != null && bool.booleanValue()) || (bool == null && f21790g0.booleanValue())) {
            float f11 = f10 * 3.28084f;
            if (f11 < 1000.0f) {
                if (i3 != 0) {
                    if (i3 != 1) {
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
            if (i3 != 0) {
                if (i3 != 1) {
                    return a0("MilesShort", null, 2131748435, format2);
                }
                return a0("MilesFromYou", null, 2131748436, format2);
            }
            return a0("MilesAway", null, 2131748437, format2);
        } else if (f10 < 1000.0f) {
            if (i3 != 0) {
                if (i3 != 1) {
                    return a0("MetersShort", null, 2131748450, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
                }
                return a0("MetersFromYou2", null, 2131748451, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
            }
            return a0("MetersAway2", null, 2131748452, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
        } else {
            if (f10 % 1000.0f == 0.0f) {
                format = String.format("%d", Integer.valueOf((int) (f10 / 1000.0f)));
            } else {
                format = String.format("%.2f", Float.valueOf(f10 / 1000.0f));
            }
            if (i3 != 0) {
                if (i3 != 1) {
                    return a0("KMetersShort", null, 2131749069, format);
                }
                return a0("KMetersFromYou2", null, 2131749070, format);
            }
            return a0("KMetersAway2", null, 2131749071, format);
        }
    }

    public static String z(int i3) {
        if (i3 <= 0) {
            return G(0, "Seconds", new Object[0]);
        }
        int i10 = i3 / 3600;
        int i11 = (i3 / 60) % 60;
        int i12 = i3 % 60;
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
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.d = k(locale, O0(2131742771, "formatterWeek", null), "EEE");
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final FastDateFormat B0() {
        if (this.f21794e == null) {
            synchronized (this) {
                try {
                    if (this.f21794e == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f21794e = k(locale, O0(2131742770, "formatterWeekLong", null), "EEEE");
                    }
                } finally {
                }
            }
        }
        return this.f21794e;
    }

    public final FastDateFormat C0() {
        if (this.f21796g == null) {
            synchronized (this) {
                try {
                    if (this.f21796g == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f21796g = k(locale, O0(2131742769, "formatterYear", null), "dd.MM.yy");
                    }
                } finally {
                }
            }
        }
        return this.f21796g;
    }

    public final FastDateFormat D0() {
        if (this.h == null) {
            synchronized (this) {
                try {
                    if (this.h == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.h = k(locale, O0(2131742768, "formatterYearMax", null), "dd.MM.yyyy");
                    }
                } finally {
                }
            }
        }
        return this.h;
    }

    public final yc G0(String str) {
        if (str == null) {
            return null;
        }
        return (yc) this.N.get(str.toLowerCase().replace("-", "_"));
    }

    public final java.util.HashMap H0(java.io.File r12, boolean r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bd.H0(java.io.File, boolean, boolean, boolean):java.util.HashMap");
    }

    public final String O0(int i3, String str, String str2) {
        String P0 = P0(i3, str, str2);
        if (P0 == null) {
            return t4.c.f("LOC_ERR:", str);
        }
        return P0;
    }

    public final String P0(int i3, String str, String str2) {
        Context context = t0.f25457b;
        boolean z10 = r2.f25040a;
        String c2 = this.Y.c(i3, context, str);
        if (c2 != null) {
            return c2;
        }
        String b10 = this.Y.b(str2);
        if (b10 != null) {
            return b10;
        }
        i();
        String c10 = this.W.c(i3, context, str);
        if (c10 != null) {
            return c10;
        }
        return this.W.b(str2);
    }

    public final String R0(String str) {
        return S0(str, true, false);
    }

    public final String S0(String str, boolean z10, boolean z11) {
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
        int i3 = 0;
        boolean z12 = false;
        while (i3 < length) {
            int i10 = i3 + 1;
            String substring = str.substring(i3, i10);
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
            i3 = i10;
        }
        return sb2.toString();
    }

    public final void V0(int i3, boolean z10) {
        if (this.I) {
            return;
        }
        this.I = true;
        ConnectionsManager.getInstance(i3).sendRequest(new TLRPC.TL_langpack_getLanguages(), new vc(this, z10, i3), 8);
    }

    public final void W0(Configuration configuration) {
        if (this.D) {
            return;
        }
        f21786c0 = DateFormat.is24HourFormat(t0.f25457b);
        Locale locale = configuration.locale;
        this.f21813z = locale;
        if (this.C != null) {
            yc ycVar = this.B;
            this.B = null;
            d(ycVar, false, false, h10.f22829t0);
        } else if (locale != null) {
            String displayName = locale.getDisplayName();
            String displayName2 = this.f21812y.getDisplayName();
            if (displayName != null && displayName2 != null && !displayName.equals(displayName2)) {
                Y0();
            }
            this.f21812y = locale;
            yc ycVar2 = this.B;
            if (ycVar2 != null && !TextUtils.isEmpty(ycVar2.f26565f)) {
                this.A = (zc) this.f21811x.get(this.B.f26565f);
            }
            if (this.A == null) {
                zc zcVar = (zc) this.f21811x.get(this.f21812y.getLanguage());
                this.A = zcVar;
                if (zcVar == null) {
                    this.A = (zc) this.f21811x.get("en");
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
        yc ycVar;
        boolean z10;
        Locale locale = this.f21812y;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        if (language == null) {
            language = "en";
        }
        String lowerCase = language.toLowerCase();
        int i3 = 0;
        int i10 = 2;
        if ((lowerCase.length() != 2 || (!lowerCase.equals("ar") && !lowerCase.equals("fa") && !lowerCase.equals("he") && !lowerCase.equals("iw"))) && !lowerCase.startsWith("ar_") && !lowerCase.startsWith("fa_") && !lowerCase.startsWith("he_") && !lowerCase.startsWith("iw_") && ((ycVar = this.B) == null || !ycVar.f26566g)) {
            z10 = false;
        } else {
            z10 = true;
        }
        f21784a0 = z10;
        if (!lowerCase.equals("ko")) {
            i10 = 1;
        }
        f21785b0 = i10;
        this.f21808t = null;
        this.f21807s = null;
        this.f21809u = null;
        this.v = null;
        this.f21805q = null;
        this.f21806r = null;
        this.f21795f = null;
        this.f21796g = null;
        this.h = null;
        this.f21800l = null;
        this.f21802n = null;
        this.d = null;
        this.f21794e = null;
        this.f21803o = null;
        this.f21804p = null;
        this.f21791a = null;
        this.f21792b = null;
        this.f21793c = null;
        this.f21797i = null;
        this.f21798j = null;
        this.f21799k = null;
        while (true) {
            FastDateFormat[] fastDateFormatArr = this.f21810w;
            if (i3 < fastDateFormatArr.length) {
                fastDateFormatArr[i3] = null;
                i3++;
            } else {
                return;
            }
        }
    }

    public final void Z0(int i3, String str, boolean z10, qc qcVar) {
        if (str != null) {
            str = str.replace("-", "_");
        }
        String str2 = str;
        if (str2 != null) {
            yc ycVar = this.B;
            if (ycVar != null) {
                if (!str2.equals(ycVar.f26563c) && !str2.equals(this.B.f26564e)) {
                    return;
                }
            } else {
                return;
            }
        }
        f(this.B, str2, z10, i3, qcVar);
    }

    public final void a1() {
        SharedPreferences.Editor edit = t0.f25457b.getSharedPreferences("langconfig", 0).edit();
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < this.O.size(); i3++) {
            String f10 = ((yc) this.O.get(i3)).f();
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
            String f11 = ((yc) this.L.get(i10)).f();
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
            String f12 = ((yc) this.K.get(i11)).f();
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

    public final void b(String[] strArr, zc zcVar) {
        for (String str : strArr) {
            this.f21811x.put(str, zcVar);
        }
    }

    public final void b1(final yc ycVar, final TLRPC.TL_langPackDifference tL_langPackDifference, final int i3, final boolean z10, final Runnable runnable) {
        boolean z11;
        int i10;
        int i11;
        String str;
        int i12;
        File d;
        final File e10;
        boolean z12 = true;
        if (tL_langPackDifference != null && !tL_langPackDifference.strings.isEmpty() && ycVar != null && !ycVar.h()) {
            final int l02 = l0(ycVar, tL_langPackDifference);
            if (l02 == -1) {
                a8.b("saveRemoteLocaleStrings: unknown language " + tL_langPackDifference.lang_code + " (locale short=" + ycVar.f26563c + ", base=" + ycVar.f26564e + ")");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (l02 == 0) {
                str = ycVar.f26563c;
            } else {
                str = ycVar.f26564e;
            }
            final String str2 = str;
            if (l02 == 0) {
                i12 = ycVar.h;
            } else {
                i12 = ycVar.f26567i;
            }
            final int i13 = i12;
            if (l02 == 0) {
                d = ycVar.e();
            } else {
                d = ycVar.d();
            }
            if (d == null) {
                k2.p1.w(tL_langPackDifference.lang_code, new StringBuilder("saveRemoteLocaleStrings: no file for "));
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (!ycVar.g()) {
                e10 = null;
            } else if (l02 == 0) {
                e10 = ycVar.d();
            } else {
                e10 = ycVar.e();
            }
            if (this.R == null) {
                this.R = new q5("langpackQueue", true);
            }
            final File file = d;
            this.R.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tc.run():void");
                }
            });
            return;
        }
        StringBuilder sb2 = new StringBuilder("saveRemoteLocaleStrings: empty difference=");
        if (tL_langPackDifference != null && !tL_langPackDifference.strings.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        sb2.append(z11);
        sb2.append("; locale is local or null=");
        if (ycVar != null && !ycVar.h()) {
            z12 = false;
        }
        sb2.append(z12);
        a8.b(sb2.toString());
        if (tL_langPackDifference != null && ycVar != null && !ycVar.h() && tL_langPackDifference.from_version != 0) {
            int l03 = l0(ycVar, tL_langPackDifference);
            if (l03 == 0) {
                i10 = ycVar.h;
            } else {
                i10 = ycVar.f26567i;
            }
            if (l03 != -1 && tL_langPackDifference.from_version <= i10 && i10 < (i11 = tL_langPackDifference.version)) {
                if (l03 == 0) {
                    ycVar.h = i11;
                } else {
                    ycVar.f26567i = i11;
                }
                a1();
            }
        }
        Y0();
        hs.e().k(hs.f23337x4, new Object[0]);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final int c(org.telegram.messenger.yc r23, boolean r24, boolean r25, boolean r26, boolean r27, int r28, org.telegram.ui.a60 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bd.c(org.telegram.messenger.yc, boolean, boolean, boolean, boolean, int, org.telegram.ui.a60):int");
    }

    public final boolean c1(String str) {
        int i3;
        int i10 = hp.s1(h10.f22829t0).f23186z7;
        if (i10 > 0) {
            SharedPreferences e12 = hp.e1();
            if (!e12.getBoolean("lngpack_patched_" + str, false) && (i3 = this.Z) < i10) {
                a8.d("reinstalling " + str + " langpack because of patch (" + i3 + " keys, must be at least " + i10 + ")");
                X0(str);
                return true;
            }
        }
        return false;
    }

    public final void d(yc ycVar, boolean z10, boolean z11, int i3) {
        c(ycVar, z10, z11, false, false, i3, null);
    }

    public final xc d1(String str, boolean z10, int i3, fg fgVar) {
        boolean z11;
        String str2;
        HashMap hashMap = this.T;
        xc xcVar = (xc) hashMap.get(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (xcVar != null && elapsedRealtime - xcVar.f26362b >= 300000) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (xcVar != null && !z11 && (xcVar.f26361a || !z10)) {
            StringBuilder u10 = a1.g.u("applyRemoteLanguage ", str, " is already loading");
            if (xcVar.f26361a) {
                str2 = " the whole langpack";
            } else {
                str2 = "";
            }
            u10.append(str2);
            u10.append(", wait for it");
            a8.b(u10.toString());
            xcVar.f26364e.add(fgVar);
            return null;
        }
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList();
        obj.f26364e = arrayList;
        obj.f26361a = z10;
        obj.f26362b = elapsedRealtime;
        obj.d = i3;
        if (z11) {
            arrayList.addAll(xcVar.f26364e);
            xcVar.f26364e.clear();
        }
        hashMap.put(str, obj);
        return obj;
    }

    public final boolean e(File file, int i3) {
        try {
            HashMap H0 = H0(file, false, false, true);
            String str = (String) H0.get("LanguageName");
            String str2 = (String) H0.get("LanguageNameInEnglish");
            String str3 = (String) H0.get("LanguageCode");
            if (str != null && str.length() > 0 && str2 != null && str2.length() > 0 && str3 != null && str3.length() > 0 && !str.contains("&") && !str.contains("|") && !str2.contains("&") && !str2.contains("|") && !str3.contains("&") && !str3.contains("|") && !str3.contains("/") && !str3.contains("\\")) {
                File file2 = new File(t0.h(), str3.concat(".xml"));
                if (g0.E(file, file2)) {
                    yc G0 = G0("local_" + str3.toLowerCase());
                    yc ycVar = G0;
                    if (G0 == null) {
                        ?? obj = new Object();
                        obj.f26561a = str;
                        obj.f26562b = str2;
                        String lowerCase = str3.toLowerCase();
                        obj.f26563c = lowerCase;
                        obj.f26565f = lowerCase;
                        obj.d = file2.getAbsolutePath();
                        this.J.add(obj);
                        this.N.put(obj.b(), obj);
                        this.O.add(obj);
                        a1();
                        ycVar = obj;
                    }
                    yc ycVar2 = ycVar;
                    ?? obj2 = new Object();
                    obj2.a(H0);
                    this.Y = new ti.b(obj2);
                    this.Z = h(H0);
                    c(ycVar2, true, false, true, false, i3, null);
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public final int f(final org.telegram.messenger.yc r19, java.lang.String r20, boolean r21, final int r22, java.lang.Runnable r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bd.f(org.telegram.messenger.yc, java.lang.String, boolean, int, java.lang.Runnable):int");
    }

    public final FastDateFormat g0() {
        if (this.f21800l == null) {
            synchronized (this) {
                try {
                    if (this.f21800l == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f21800l = k(locale, O0(2131742796, "chatDate", null), "d MMMM");
                    }
                } finally {
                }
            }
        }
        return this.f21800l;
    }

    public final FastDateFormat h0() {
        if (this.f21802n == null) {
            synchronized (this) {
                try {
                    if (this.f21802n == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f21802n = k(locale, O0(2131742794, "chatFullDate", null), "d MMMM yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f21802n;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bd.i():void");
    }

    public final void j(int i3) {
        yc ycVar = this.B;
        if (ycVar != null && !this.P && c1(ycVar.f26563c)) {
            if (r2.f25040a) {
                a8.b("reload locale because locale file is not enough");
            }
            g0.h3(new pc(this, i3, 2));
        }
    }

    public final Locale k0() {
        return this.f21812y;
    }

    public final FastDateFormat m0() {
        String O0;
        String str;
        if (this.f21798j == null) {
            synchronized (this) {
                try {
                    if (this.f21798j == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        if (f21786c0) {
                            O0 = O0(2131742789, "formatterBannedUntil24H", null);
                        } else {
                            O0 = O0(2131742790, "formatterBannedUntil12H", null);
                        }
                        if (f21786c0) {
                            str = "MMM dd yyyy, HH:mm";
                        } else {
                            str = "MMM dd yyyy, h:mm a";
                        }
                        this.f21798j = k(locale, O0, str);
                    }
                } finally {
                }
            }
        }
        return this.f21798j;
    }

    public final FastDateFormat n0() {
        String O0;
        String str;
        if (this.f21799k == null) {
            synchronized (this) {
                try {
                    if (this.f21799k == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        if (f21786c0) {
                            O0 = O0(2131742787, "formatterBannedUntilThisYear24H", null);
                        } else {
                            O0 = O0(2131742788, "formatterBannedUntilThisYear12H", null);
                        }
                        if (f21786c0) {
                            str = "MMM dd, HH:mm";
                        } else {
                            str = "MMM dd, h:mm a";
                        }
                        this.f21799k = k(locale, O0, str);
                    }
                } finally {
                }
            }
        }
        return this.f21799k;
    }

    public final FastDateFormat o0() {
        if (this.f21808t == null) {
            synchronized (this) {
                try {
                    if (this.f21808t == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f21808t = k(locale, O0(2131742786, "formatterBoostExpired", null), "MMM dd, yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f21808t;
    }

    public final String p(long j10, String str) {
        return q(j10, true, true, false, str);
    }

    public final FastDateFormat p0() {
        String O0;
        String str;
        if (this.f21791a == null) {
            synchronized (this) {
                try {
                    if (this.f21791a == null) {
                        Locale locale = this.f21812y;
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
                        if (f21786c0) {
                            O0 = O0(2131742784, "formatterDay24H", null);
                        } else {
                            O0 = O0(2131742785, "formatterDay12H", null);
                        }
                        if (f21786c0) {
                            str = "HH:mm";
                        } else {
                            str = "h:mm a";
                        }
                        this.f21791a = k(locale, O0, str);
                    }
                } finally {
                }
            }
        }
        return this.f21791a;
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
        char c2 = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c2 = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c2 = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c2 = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c2 = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c2 = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c2 = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c2 = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c2 = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c2 = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c2 = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c2 = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c2 = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c2 = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c2 = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c2 = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c2 = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c2 = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c2 = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c2 = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c2 = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c2 = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c2 = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c2 = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c2 = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c2 = 29;
                    break;
                }
                break;
            case 87254:
                if (upperCase.equals("XTR")) {
                    c2 = 30;
                    break;
                }
                break;
        }
        String str2 = " %.2f";
        String str3 = " %.0f";
        switch (c2) {
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
            Locale locale = this.f21812y;
            if (locale == null) {
                locale = this.f21813z;
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
        if (this.f21795f == null) {
            synchronized (this) {
                try {
                    if (this.f21795f == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f21795f = k(locale, O0(2131742778, "formatterMonth", null), "dd MMM");
                    }
                } finally {
                }
            }
        }
        return this.f21795f;
    }

    public final FastDateFormat r0() {
        String O0;
        String str;
        if (this.f21792b == null) {
            synchronized (this) {
                try {
                    if (this.f21792b == null) {
                        Locale locale = this.f21812y;
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
                        if (f21786c0) {
                            O0 = O0(2131742782, "formatterDayWithSeconds24H", null);
                        } else {
                            O0 = O0(2131742783, "formatterDayWithSeconds12H", null);
                        }
                        if (f21786c0) {
                            str = "HH:mm:ss";
                        } else {
                            str = "h:mm:ss a";
                        }
                        this.f21792b = k(locale, O0, str);
                    }
                } finally {
                }
            }
        }
        return this.f21792b;
    }

    public final FastDateFormat s0() {
        if (this.f21807s == null) {
            synchronized (this) {
                try {
                    if (this.f21807s == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f21807s = k(locale, O0(2131742781, "formatterGiveawayCard", null), "dd MMM yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f21807s;
    }

    public final FastDateFormat t0() {
        if (this.f21809u == null) {
            synchronized (this) {
                try {
                    if (this.f21809u == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f21809u = k(locale, O0(2131742780, "formatterGiveawayMonthDay", null), "MMMM dd");
                    }
                } finally {
                }
            }
        }
        return this.f21809u;
    }

    public final FastDateFormat u0() {
        if (this.v == null) {
            synchronized (this) {
                try {
                    if (this.v == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.v = k(locale, O0(2131742779, "formatterGiveawayMonthDayYear", null), "MMMM dd, yyyy");
                    }
                } finally {
                }
            }
        }
        return this.v;
    }

    public final FastDateFormat v0() {
        if (this.f21805q == null) {
            synchronized (this) {
                try {
                    if (this.f21805q == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f21805q = k(locale, O0(2131742775, "formatterMonthYear", null), "MMM yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f21805q;
    }

    public final FastDateFormat w0() {
        if (this.f21803o == null) {
            synchronized (this) {
                try {
                    if (this.f21803o == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f21803o = k(locale, O0(2131742792, "formatDateSchedule", null), "MMM d");
                    }
                } finally {
                }
            }
        }
        return this.f21803o;
    }

    public final FastDateFormat x0(int i3) {
        if (i3 >= 0) {
            FastDateFormat[] fastDateFormatArr = this.f21810w;
            if (i3 < fastDateFormatArr.length) {
                if (fastDateFormatArr[i3] == null) {
                    Locale locale = this.f21812y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    switch (i3) {
                        case 0:
                            fastDateFormatArr[i3] = k(locale, O0(2131745597, "SendTodayAt", null), "'Send today at' HH:mm");
                            break;
                        case 1:
                            fastDateFormatArr[i3] = k(locale, O0(2131745639, "SendDayAt", null), "'Send on' MMM d 'at' HH:mm");
                            break;
                        case 2:
                            fastDateFormatArr[i3] = k(locale, O0(2131745638, "SendDayYearAt", null), "'Send on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 3:
                            fastDateFormatArr[i3] = k(locale, O0(2131746331, "RemindTodayAt", null), "'Remind today at' HH:mm");
                            break;
                        case 4:
                            fastDateFormatArr[i3] = k(locale, O0(2131746333, "RemindDayAt", null), "'Remind on' MMM d 'at' HH:mm");
                            break;
                        case 5:
                            fastDateFormatArr[i3] = k(locale, O0(2131746332, "RemindDayYearAt", null), "'Remind on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 6:
                            fastDateFormatArr[i3] = k(locale, O0(2131744915, "StartTodayAt", null), "'Start today at' HH:mm");
                            break;
                        case 7:
                            fastDateFormatArr[i3] = k(locale, O0(2131744924, "StartDayAt", null), "'Start on' MMM d 'at' HH:mm");
                            break;
                        case 8:
                            fastDateFormatArr[i3] = k(locale, O0(2131744923, "StartDayYearAt", null), "'Start on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 9:
                            fastDateFormatArr[i3] = k(locale, O0(2131744918, "StartShortTodayAt", null), "'Today,' HH:mm");
                            break;
                        case 10:
                            fastDateFormatArr[i3] = k(locale, O0(2131744920, "StartShortDayAt", null), "MMM d',' HH:mm");
                            break;
                        case 11:
                            fastDateFormatArr[i3] = k(locale, O0(2131744919, "StartShortDayYearAt", null), "MMM d yyyy, HH:mm");
                            break;
                        case 12:
                            fastDateFormatArr[i3] = k(locale, O0(2131744907, "StartsTodayAt", null), "'Starts today at' HH:mm");
                            break;
                        case 13:
                            fastDateFormatArr[i3] = k(locale, O0(2131744909, "StartsDayAt", null), "'Starts on' MMM d 'at' HH:mm");
                            break;
                        case 14:
                            fastDateFormatArr[i3] = k(locale, O0(2131744908, "StartsDayYearAt", null), "'Starts on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 15:
                            fastDateFormatArr[i3] = k(locale, O0(2131746585, "PublishTodayAt", null), "'Publish today at' HH:mm");
                            break;
                        case 16:
                            fastDateFormatArr[i3] = k(locale, O0(2131746587, "PublishDayAt", null), "'Publish on' MMM d 'at' HH:mm");
                            break;
                        case 17:
                            fastDateFormatArr[i3] = k(locale, O0(2131746586, "PublishDayYearAt", null), "'Publish on' MMM d yyyy 'at' HH:mm");
                            break;
                    }
                }
                return fastDateFormatArr[i3];
            }
        }
        return null;
    }

    public final FastDateFormat y0() {
        if (this.f21804p == null) {
            synchronized (this) {
                try {
                    if (this.f21804p == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f21804p = k(locale, O0(2131742791, "formatDateScheduleYear", null), "MMM d yyyy");
                    }
                } finally {
                }
            }
        }
        return this.f21804p;
    }

    public final FastDateFormat z0() {
        String O0;
        String str;
        if (this.f21797i == null) {
            synchronized (this) {
                try {
                    if (this.f21797i == null) {
                        Locale locale = this.f21812y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        if (f21786c0) {
                            O0 = O0(2131742772, "formatterStats24H", null);
                        } else {
                            O0 = O0(2131742773, "formatterStats12H", null);
                        }
                        if (f21786c0) {
                            str = "MMM dd yyyy, HH:mm";
                        } else {
                            str = "MMM dd yyyy, h:mm a";
                        }
                        this.f21797i = k(locale, O0, str);
                    }
                } finally {
                }
            }
        }
        return this.f21797i;
    }
}
