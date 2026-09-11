package ig;

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
import org.telegram.ui.Cells.p6;
public final class f2 {
    public static volatile f2[] f12069e = new f2[4];
    public static final Object[] f12070f = new Object[4];
    public final int f12071a;
    public boolean f12072b;
    public boolean f12073c;
    public final ArrayList d = new ArrayList();

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f12070f[i10] = new Object();
        }
    }

    public f2(int i10) {
        this.f12071a = i10;
    }

    public static f2 b(int i10) {
        f2 f2Var;
        f2 f2Var2 = f12069e[i10];
        if (f2Var2 == null) {
            synchronized (f12070f[i10]) {
                try {
                    f2Var = f12069e[i10];
                    if (f2Var == null) {
                        f2[] f2VarArr = f12069e;
                        f2 f2Var3 = new f2(i10);
                        f2VarArr[i10] = f2Var3;
                        f2Var = f2Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return f2Var;
        }
        return f2Var2;
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
        StringBuilder u10 = a4.a.u(concat);
        String str3 = "";
        if (i11 >= 10) {
            str2 = "";
        } else {
            str2 = "0";
        }
        u10.append(str2);
        u10.append(i11);
        StringBuilder u11 = a4.a.u(p6.t(u10.toString(), ":"));
        if (i12 < 10) {
            str3 = "0";
        }
        u11.append(str3);
        u11.append(i12);
        return u11.toString();
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
            if (TextUtils.equals(tL_timezone.f20007id, str)) {
                return tL_timezone;
            }
            i10++;
        }
    }

    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: ig.f2.c():java.lang.String");
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
        if (!this.f12072b && !this.f12073c) {
            this.f12072b = true;
            int i10 = this.f12071a;
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
            ConnectionsManager.getInstance(i10).sendRequest(tL_help_getTimezonesList, new bi.m1(15, this, mainSettings));
        }
    }
}
