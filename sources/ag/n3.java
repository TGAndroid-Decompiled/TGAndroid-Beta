package ag;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class n3 {
    public static volatile n3[] e = new n3[4];
    public static final Object[] f655f = new Object[4];
    public final int f656a;
    public boolean f657b;
    public boolean f658c;
    public final ArrayList d = new ArrayList();

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f655f[i10] = new Object();
        }
    }

    public n3(int i10) {
        this.f656a = i10;
    }

    public static n3 b(int i10) {
        n3 n3Var;
        n3 n3Var2 = e[i10];
        if (n3Var2 == null) {
            synchronized (f655f[i10]) {
                try {
                    n3Var = e[i10];
                    if (n3Var == null) {
                        n3[] n3VarArr = e;
                        n3 n3Var3 = new n3(i10);
                        n3VarArr[i10] = n3Var3;
                        n3Var = n3Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return n3Var;
        }
        return n3Var2;
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
        StringBuilder t10 = a1.g.t(concat);
        String str3 = "";
        if (i11 >= 10) {
            str2 = "";
        } else {
            str2 = "0";
        }
        t10.append(str2);
        t10.append(i11);
        StringBuilder t11 = a1.g.t(sc.e.A(t10.toString(), ":"));
        if (i12 < 10) {
            str3 = "0";
        }
        t11.append(str3);
        t11.append(i12);
        return t11.toString();
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
            if (TextUtils.equals(tL_timezone.f19934id, str)) {
                return tL_timezone;
            }
            i10++;
        }
    }

    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: ag.n3.c():java.lang.String");
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
            String displayName = of2.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, dd.D0().f15365y);
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
        if (!this.f657b && !this.f658c) {
            this.f657b = true;
            int i10 = this.f656a;
            SharedPreferences sharedPreferences = wp.r1(i10).f7;
            TLRPC.help_timezonesList help_timezoneslist = null;
            String string = sharedPreferences.getString("timezones", null);
            int i11 = 0;
            if (string != null) {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                help_timezoneslist = TLRPC.help_timezonesList.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            }
            ArrayList arrayList = this.d;
            arrayList.clear();
            if (help_timezoneslist != null) {
                arrayList.addAll(help_timezoneslist.timezones);
            }
            at.f(i10).k(at.f14776r3, new Object[0]);
            TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
            if (help_timezoneslist != null) {
                i11 = help_timezoneslist.hash;
            }
            tL_help_getTimezonesList.hash = i11;
            ConnectionsManager.getInstance(i10).sendRequest(tL_help_getTimezonesList, new k0(2, this, sharedPreferences));
        }
    }
}
