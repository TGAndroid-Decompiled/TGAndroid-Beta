package lg;

import ai.f3;
import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class y1 {
    public static volatile y1[] f18517e = new y1[4];
    public static final Object[] f18518f = new Object[4];
    public final int f18519a;
    public boolean f18520b;
    public boolean f18521c;
    public final ArrayList d = new ArrayList();

    static {
        for (int i3 = 0; i3 < 4; i3++) {
            f18518f[i3] = new Object();
        }
    }

    public y1(int i3) {
        this.f18519a = i3;
    }

    public static y1 b(int i3) {
        y1 y1Var;
        y1 y1Var2 = f18517e[i3];
        if (y1Var2 == null) {
            synchronized (f18518f[i3]) {
                try {
                    y1Var = f18517e[i3];
                    if (y1Var == null) {
                        y1[] y1VarArr = f18517e;
                        y1 y1Var3 = new y1(i3);
                        y1VarArr[i3] = y1Var3;
                        y1Var = y1Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return y1Var;
        }
        return y1Var2;
    }

    public static String e(TLRPC.TL_timezone tL_timezone, boolean z10) {
        if (tL_timezone == null) {
            return null;
        }
        if (z10) {
            return tL_timezone.name + ", " + f(tL_timezone);
        }
        return tL_timezone.name;
    }

    public static String f(TLRPC.TL_timezone tL_timezone) {
        String str;
        String str2;
        int i3 = tL_timezone.utc_offset;
        if (i3 == 0) {
            return "GMT";
        }
        if (i3 < 0) {
            str = "-";
        } else {
            str = "+";
        }
        String concat = "GMT".concat(str);
        int abs = Math.abs(tL_timezone.utc_offset) / 60;
        int i10 = abs / 60;
        int i11 = abs % 60;
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(concat);
        String str3 = "";
        if (i10 >= 10) {
            str2 = "";
        } else {
            str2 = "0";
        }
        l10.append(str2);
        l10.append(i10);
        StringBuilder l11 = com.google.android.recaptcha.internal.a.l(t4.c.q(l10.toString(), ":"));
        if (i11 < 10) {
            str3 = "0";
        }
        l11.append(str3);
        l11.append(i11);
        return l11.toString();
    }

    public final TLRPC.TL_timezone a(String str) {
        if (str == null) {
            return null;
        }
        g();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 >= arrayList.size()) {
                return null;
            }
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i3);
            if (TextUtils.equals(tL_timezone.f27141id, str)) {
                return tL_timezone;
            }
            i3++;
        }
    }

    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: lg.y1.c():java.lang.String");
    }

    public final String d(String str, boolean z10) {
        String str2;
        TLRPC.TL_timezone a10 = a(str);
        if (a10 != null) {
            return e(a10, z10);
        }
        ZoneId of2 = ZoneId.of(str);
        String str3 = "";
        if (of2 == null) {
            return "";
        }
        if (z10) {
            String displayName = of2.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, bd.E0().f21812y);
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
        if (!this.f18520b && !this.f18521c) {
            this.f18520b = true;
            int i3 = this.f18519a;
            SharedPreferences sharedPreferences = hp.s1(i3).f22999e7;
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
            hs.f(i3).k(hs.f23296r3, new Object[0]);
            TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
            if (help_timezoneslist != null) {
                i10 = help_timezoneslist.hash;
            }
            tL_help_getTimezonesList.hash = i10;
            ConnectionsManager.getInstance(i3).sendRequest(tL_help_getTimezonesList, new f3(24, this, sharedPreferences));
        }
    }
}
