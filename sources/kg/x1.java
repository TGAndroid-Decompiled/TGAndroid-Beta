package kg;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class x1 {
    public static volatile x1[] f17575e = new x1[4];
    public static final Object[] f17576f = new Object[4];
    public final int f17577a;
    public boolean f17578b;
    public boolean f17579c;
    public final ArrayList d = new ArrayList();

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            f17576f[i7] = new Object();
        }
    }

    public x1(int i7) {
        this.f17577a = i7;
    }

    public static x1 b(int i7) {
        x1 x1Var;
        x1 x1Var2 = f17575e[i7];
        if (x1Var2 == null) {
            synchronized (f17576f[i7]) {
                try {
                    x1Var = f17575e[i7];
                    if (x1Var == null) {
                        x1[] x1VarArr = f17575e;
                        x1 x1Var3 = new x1(i7);
                        x1VarArr[i7] = x1Var3;
                        x1Var = x1Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return x1Var;
        }
        return x1Var2;
    }

    public static String e(TLRPC.TL_timezone tL_timezone, boolean z9) {
        if (tL_timezone == null) {
            return null;
        }
        if (z9) {
            return tL_timezone.name + ", " + f(tL_timezone);
        }
        return tL_timezone.name;
    }

    public static String f(TLRPC.TL_timezone tL_timezone) {
        String str;
        String str2;
        int i7 = tL_timezone.utc_offset;
        if (i7 == 0) {
            return "GMT";
        }
        if (i7 < 0) {
            str = "-";
        } else {
            str = "+";
        }
        String concat = "GMT".concat(str);
        int abs = Math.abs(tL_timezone.utc_offset) / 60;
        int i10 = abs / 60;
        int i11 = abs % 60;
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(concat);
        String str3 = "";
        if (i10 >= 10) {
            str2 = "";
        } else {
            str2 = "0";
        }
        m10.append(str2);
        m10.append(i10);
        StringBuilder m11 = com.google.android.recaptcha.internal.a.m(rf.b.q(m10.toString(), ":"));
        if (i11 < 10) {
            str3 = "0";
        }
        m11.append(str3);
        m11.append(i11);
        return m11.toString();
    }

    public final TLRPC.TL_timezone a(String str) {
        if (str == null) {
            return null;
        }
        g();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 >= arrayList.size()) {
                return null;
            }
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i7);
            if (TextUtils.equals(tL_timezone.f27093id, str)) {
                return tL_timezone;
            }
            i7++;
        }
    }

    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: kg.x1.c():java.lang.String");
    }

    public final String d(String str, boolean z9) {
        String str2;
        TLRPC.TL_timezone a10 = a(str);
        if (a10 != null) {
            return e(a10, z9);
        }
        ZoneId of2 = ZoneId.of(str);
        String str3 = "";
        if (of2 == null) {
            return "";
        }
        if (z9) {
            String displayName = of2.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, hd.E0().f22906y);
            str2 = "GMT";
            if (displayName.length() != 1 || displayName.charAt(0) != 'Z') {
                str2 = "GMT".concat(displayName);
            }
        } else {
            str2 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(of2.getId().replace("/", ", ").replace("_", " "));
        if (str2 != null) {
            str3 = ", ".concat(str2);
        }
        sb2.append(str3);
        return sb2.toString();
    }

    public final void g() {
        if (!this.f17578b && !this.f17579c) {
            this.f17578b = true;
            int i7 = this.f17577a;
            SharedPreferences sharedPreferences = qp.s1(i7).f24767e7;
            TLRPC.help_timezonesList help_timezoneslist = null;
            String string = sharedPreferences.getString("timezones", null);
            int i10 = 0;
            if (string != null) {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                help_timezoneslist = TLRPC.help_timezonesList.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            }
            ArrayList arrayList = this.d;
            arrayList.clear();
            if (help_timezoneslist != null) {
                arrayList.addAll(help_timezoneslist.timezones);
            }
            qs.f(i7).k(qs.f25058r3, new Object[0]);
            TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
            if (help_timezoneslist != null) {
                i10 = help_timezoneslist.hash;
            }
            tL_help_getTimezonesList.hash = i10;
            ConnectionsManager.getInstance(i7).sendRequest(tL_help_getTimezonesList, new bi.j(21, this, sharedPreferences));
        }
    }
}
