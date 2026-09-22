package hg;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public static volatile g2[] e = new g2[4];
    public static final Object[] f10293f = new Object[4];
    public final int f10294a;
    public boolean f10295b;
    public boolean f10296c;
    public final ArrayList d = new ArrayList();

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f10293f[i10] = new Object();
        }
    }

    public g2(int i10) {
        this.f10294a = i10;
    }

    public static g2 b(int i10) {
        g2 g2Var;
        g2 g2Var2 = e[i10];
        if (g2Var2 == null) {
            synchronized (f10293f[i10]) {
                try {
                    g2Var = e[i10];
                    if (g2Var == null) {
                        g2[] g2VarArr = e;
                        g2 g2Var3 = new g2(i10);
                        g2VarArr[i10] = g2Var3;
                        g2Var = g2Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return g2Var;
        }
        return g2Var2;
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
        int i10 = tL_timezone.utc_offset;
        if (i10 == 0) {
            return "GMT";
        }
        if (i10 < 0) {
            str = "-";
        } else {
            str = "+";
        }
        String concat = "GMT".concat(str);
        int abs = Math.abs(tL_timezone.utc_offset) / 60;
        int i11 = abs / 60;
        int i12 = abs % 60;
        StringBuilder v = a4.a.v(concat);
        String str3 = "";
        if (i11 >= 10) {
            str2 = "";
        } else {
            str2 = "0";
        }
        v.append(str2);
        v.append(i11);
        StringBuilder v9 = a4.a.v(w.c.g(v.toString(), ":"));
        if (i12 < 10) {
            str3 = "0";
        }
        v9.append(str3);
        v9.append(i12);
        return v9.toString();
    }

    public final TLRPC.TL_timezone a(String str) {
        if (str == null) {
            return null;
        }
        g();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                return null;
            }
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i10);
            if (TextUtils.equals(tL_timezone.f18247id, str)) {
                return tL_timezone;
            }
            i10++;
        }
    }

    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: hg.g2.c():java.lang.String");
    }

    public final String d(String str, boolean z10) {
        String str2;
        TLRPC.TL_timezone a2 = a(str);
        if (a2 != null) {
            return e(a2, z10);
        }
        ZoneId of2 = ZoneId.of(str);
        String str3 = "";
        if (of2 == null) {
            return "";
        }
        if (z10) {
            String displayName = of2.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
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
        if (!this.f10295b && !this.f10296c) {
            this.f10295b = true;
            int i10 = this.f10294a;
            SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
            TLRPC.help_timezonesList help_timezoneslist = null;
            String string = mainSettings.getString("timezones", null);
            int i11 = 0;
            if (string != null) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                help_timezoneslist = TLRPC.help_timezonesList.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            }
            ArrayList arrayList = this.d;
            arrayList.clear();
            if (help_timezoneslist != null) {
                arrayList.addAll(help_timezoneslist.timezones);
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
            TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
            if (help_timezoneslist != null) {
                i11 = help_timezoneslist.hash;
            }
            tL_help_getTimezonesList.hash = i11;
            ConnectionsManager.getInstance(i10).sendRequest(tL_help_getTimezonesList, new ai.v1(15, this, mainSettings));
        }
    }
}
