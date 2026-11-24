package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class wob {
    public static volatile wob[] e = new wob[4];
    public static final Object[] f = new Object[4];
    public final int a;
    public boolean b;
    public boolean c;
    public final ArrayList d = new ArrayList();

    static {
        for (int i = 0; i < 4; i++) {
            f[i] = new Object();
        }
    }

    public wob(int i) {
        this.a = i;
    }

    public static wob b(int i) {
        wob wobVar;
        wob wobVar2 = e[i];
        if (wobVar2 == null) {
            synchronized (f[i]) {
                wobVar = e[i];
                if (wobVar == null) {
                    wob[] wobVarArr = e;
                    wob wobVar3 = new wob(i);
                    wobVarArr[i] = wobVar3;
                    wobVar = wobVar3;
                }
            }
            return wobVar;
        }
        return wobVar2;
    }

    public static String e(TLRPC.TL_timezone tL_timezone, boolean z) {
        if (tL_timezone == null) {
            return null;
        }
        String str = tL_timezone.name;
        if (z) {
            return str + ", " + f(tL_timezone);
        }
        return str;
    }

    public static String f(TLRPC.TL_timezone tL_timezone) {
        String str;
        String str2;
        int i = tL_timezone.utc_offset;
        if (i == 0) {
            return "GMT";
        }
        if (i < 0) {
            str = "-";
        } else {
            str = "+";
        }
        String concat = "GMT".concat(str);
        int abs = Math.abs(tL_timezone.utc_offset) / 60;
        int i2 = abs / 60;
        int i3 = abs % 60;
        StringBuilder sb = new StringBuilder(concat);
        String str3 = "";
        if (i2 >= 10) {
            str2 = "";
        } else {
            str2 = "0";
        }
        sb.append(str2);
        sb.append(i2);
        StringBuilder sb2 = new StringBuilder(sb.toString().concat(":"));
        if (i3 < 10) {
            str3 = "0";
        }
        sb2.append(str3);
        sb2.append(i3);
        return sb2.toString();
    }

    public final TLRPC.TL_timezone a(String str) {
        if (str != null) {
            g();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i < arrayList.size()) {
                    TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i);
                    if (TextUtils.equals(tL_timezone.id, str)) {
                        return tL_timezone;
                    }
                    i++;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wob.c():java.lang.String");
    }

    public final String d(String str, boolean z) {
        String str2;
        TLRPC.TL_timezone a = a(str);
        if (a != null) {
            return e(a, z);
        }
        ZoneId of = ZoneId.of(str);
        String str3 = "";
        if (of == null) {
            return "";
        }
        if (z) {
            String displayName = of.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, k96.D0().y);
            str2 = "GMT";
            if (displayName.length() != 1 || displayName.charAt(0) != 'Z') {
                str2 = "GMT".concat(displayName);
            }
        } else {
            str2 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(of.getId().replace("/", ", ").replace("_", " "));
        if (str2 != null) {
            str3 = ", ".concat(str2);
        }
        sb.append(str3);
        return sb.toString();
    }

    public final void g() {
        if (!this.b && !this.c) {
            this.b = true;
            int i = this.a;
            SharedPreferences sharedPreferences = na7.q1(i).X3;
            TLRPC.help_timezonesList help_timezoneslist = null;
            String string = sharedPreferences.getString("timezones", null);
            int i2 = 0;
            if (string != null) {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                help_timezoneslist = TLRPC.help_timezonesList.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            }
            ArrayList arrayList = this.d;
            arrayList.clear();
            if (help_timezoneslist != null) {
                arrayList.addAll(help_timezoneslist.timezones);
            }
            kk7.f(i).k(kk7.s3, new Object[0]);
            TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
            if (help_timezoneslist != null) {
                i2 = help_timezoneslist.hash;
            }
            tL_help_getTimezonesList.hash = i2;
            ConnectionsManager.getInstance(i).sendRequest(tL_help_getTimezonesList, new apa(this, sharedPreferences, (byte) 15));
        }
    }
}
