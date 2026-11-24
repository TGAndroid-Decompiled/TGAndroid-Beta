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
public final class ok0 {
    public static volatile ok0[] f = new ok0[4];
    public static final Object[] g = new Object[4];
    public final int a;
    public long b;
    public mk0 c;
    public final Set d;
    public boolean e;

    static {
        for (int i = 0; i < 4; i++) {
            g[i] = new Object();
        }
    }

    public ok0(int i) {
        ok0 ok0Var;
        Exception exc;
        nk0 nk0Var;
        this.a = i;
        SharedPreferences sharedPreferences = oc7.r1(i).X3;
        this.b = sharedPreferences.getLong("bday_check", 0L);
        nk0 nk0Var2 = null;
        String string = sharedPreferences.getString("bday_contacts", null);
        if (string != null) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                int readInt32 = serializedData.readInt32(true);
                if (readInt32 != 290452237) {
                    try {
                        int i2 = nk0.b;
                    } catch (Exception e) {
                        exc = e;
                        ok0Var = this;
                        fc4.g(exc, true);
                        ok0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                    }
                } else {
                    try {
                        nk0Var2 = new nk0();
                    } catch (Exception e2) {
                        ok0Var = this;
                        exc = e2;
                        fc4.g(exc, true);
                        ok0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                    }
                }
                nk0Var = (nk0) TLObject.TLdeserialize(nk0.class, nk0Var2, serializedData, readInt32, true);
            } catch (Exception e3) {
                e = e3;
                ok0Var = this;
            }
            if (nk0Var != null && !nk0Var.a.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < nk0Var.a.size(); i3++) {
                    arrayList.add(Long.valueOf(((TL_account.TL_contactBirthday) nk0Var.a.get(i3)).contact_id));
                }
                ok0Var = this;
                try {
                    cf7.Y(i).a.c(new up6(ok0Var, i, arrayList, nk0Var, (byte) 6));
                } catch (Exception e4) {
                    e = e4;
                    exc = e;
                    fc4.g(exc, true);
                    ok0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                }
                ok0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
            }
        }
        ok0Var = this;
        ok0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
    }

    public static ok0 a(int i) {
        ok0 ok0Var;
        ok0 ok0Var2 = f[i];
        if (ok0Var2 == null) {
            synchronized (g[i]) {
                ok0Var = f[i];
                if (ok0Var == null) {
                    ok0[] ok0VarArr = f;
                    ok0 ok0Var3 = new ok0(i);
                    ok0VarArr[i] = ok0Var3;
                    ok0Var = ok0Var3;
                }
            }
            return ok0Var;
        }
        return ok0Var2;
    }

    public static boolean d(TLRPC.UserFull userFull) {
        if (userFull == null || !e(userFull.birthday) || m9c.c(userFull)) {
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

    public final mk0 b() {
        mk0 mk0Var = this.c;
        if (mk0Var == null || this.d.contains(mk0Var.a)) {
            return null;
        }
        return this.c;
    }

    public final boolean c(long j) {
        mk0 mk0Var = this.c;
        if (mk0Var != null && mk0Var.a(j)) {
            return true;
        }
        TLRPC.UserFull X1 = oc7.r1(this.a).X1(j);
        if (X1 != null && e(X1.birthday) && !m9c.c(X1)) {
            return true;
        }
        return false;
    }
}
