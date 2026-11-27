package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class pj0 {
    public static volatile pj0[] f = new pj0[4];
    public static final Object[] g = new Object[4];
    public final int a;
    public long b;
    public nj0 c;
    public final Set d;
    public boolean e;

    static {
        for (int i = 0; i < 4; i++) {
            g[i] = new Object();
        }
    }

    public pj0(int i) {
        pj0 pj0Var;
        Exception exc;
        oj0 oj0Var;
        this.a = i;
        SharedPreferences sharedPreferences = uc7.s1(i).Y3;
        this.b = sharedPreferences.getLong("bday_check", 0L);
        oj0 oj0Var2 = null;
        String string = sharedPreferences.getString("bday_contacts", null);
        if (string != null) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                int readInt32 = serializedData.readInt32(true);
                if (readInt32 != 290452237) {
                    try {
                        int i2 = oj0.b;
                    } catch (Exception e) {
                        exc = e;
                        pj0Var = this;
                        cc4.g(exc, true);
                        pj0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                    }
                } else {
                    try {
                        oj0Var2 = new oj0();
                    } catch (Exception e2) {
                        pj0Var = this;
                        exc = e2;
                        cc4.g(exc, true);
                        pj0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                    }
                }
                oj0Var = (oj0) TLObject.TLdeserialize(oj0.class, oj0Var2, serializedData, readInt32, true);
            } catch (Exception e3) {
                e = e3;
                pj0Var = this;
            }
            if (oj0Var != null && !oj0Var.a.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < oj0Var.a.size(); i3++) {
                    arrayList.add(Long.valueOf(((TL_account.TL_contactBirthday) oj0Var.a.get(i3)).contact_id));
                }
                pj0Var = this;
                try {
                    kf7.a0(i).a.c(new gp6(pj0Var, i, arrayList, oj0Var, (byte) 6));
                } catch (Exception e4) {
                    e = e4;
                    exc = e;
                    cc4.g(exc, true);
                    pj0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                }
                pj0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
            }
        }
        pj0Var = this;
        pj0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
    }

    public static pj0 a(int i) {
        pj0 pj0Var;
        pj0 pj0Var2 = f[i];
        if (pj0Var2 == null) {
            synchronized (g[i]) {
                pj0Var = f[i];
                if (pj0Var == null) {
                    pj0[] pj0VarArr = f;
                    pj0 pj0Var3 = new pj0(i);
                    pj0VarArr[i] = pj0Var3;
                    pj0Var = pj0Var3;
                }
            }
            return pj0Var;
        }
        return pj0Var2;
    }

    public static boolean d(TLRPC.UserFull userFull) {
        if (userFull == null || !e(userFull.birthday) || lbc.c(userFull)) {
            return false;
        }
        return true;
    }

    public static boolean e(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(5);
        int i2 = calendar.get(2) + 1;
        if (tL_birthday.day != i || tL_birthday.month != i2) {
            return false;
        }
        return true;
    }

    public final nj0 b() {
        nj0 nj0Var = this.c;
        if (nj0Var == null || this.d.contains(nj0Var.a)) {
            return null;
        }
        return this.c;
    }

    public final boolean c(long j) {
        nj0 nj0Var = this.c;
        if (nj0Var != null && nj0Var.a(j)) {
            return true;
        }
        TLRPC.UserFull Y1 = uc7.s1(this.a).Y1(j);
        if (Y1 != null && e(Y1.birthday) && !lbc.c(Y1)) {
            return true;
        }
        return false;
    }
}
