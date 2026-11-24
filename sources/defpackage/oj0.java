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
public final class oj0 {
    public static volatile oj0[] f = new oj0[4];
    public static final Object[] g = new Object[4];
    public final int a;
    public long b;
    public mj0 c;
    public final Set d;
    public boolean e;

    static {
        for (int i = 0; i < 4; i++) {
            g[i] = new Object();
        }
    }

    public oj0(int i) {
        oj0 oj0Var;
        Exception exc;
        nj0 nj0Var;
        this.a = i;
        SharedPreferences sharedPreferences = na7.q1(i).X3;
        this.b = sharedPreferences.getLong("bday_check", 0L);
        nj0 nj0Var2 = null;
        String string = sharedPreferences.getString("bday_contacts", null);
        if (string != null) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                int readInt32 = serializedData.readInt32(true);
                if (readInt32 != 290452237) {
                    try {
                        int i2 = nj0.b;
                    } catch (Exception e) {
                        exc = e;
                        oj0Var = this;
                        fa4.g(exc, true);
                        oj0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                    }
                } else {
                    try {
                        nj0Var2 = new nj0();
                    } catch (Exception e2) {
                        oj0Var = this;
                        exc = e2;
                        fa4.g(exc, true);
                        oj0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                    }
                }
                nj0Var = (nj0) TLObject.TLdeserialize(nj0.class, nj0Var2, serializedData, readInt32, true);
            } catch (Exception e3) {
                e = e3;
                oj0Var = this;
            }
            if (nj0Var != null && !nj0Var.a.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < nj0Var.a.size(); i3++) {
                    arrayList.add(Long.valueOf(((TL_account.TL_contactBirthday) nj0Var.a.get(i3)).contact_id));
                }
                oj0Var = this;
                try {
                    ad7.Y(i).a.c(new tn6(oj0Var, i, arrayList, nj0Var, (byte) 6));
                } catch (Exception e4) {
                    e = e4;
                    exc = e;
                    fa4.g(exc, true);
                    oj0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                }
                oj0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
            }
        }
        oj0Var = this;
        oj0Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
    }

    public static oj0 a(int i) {
        oj0 oj0Var;
        oj0 oj0Var2 = f[i];
        if (oj0Var2 == null) {
            synchronized (g[i]) {
                oj0Var = f[i];
                if (oj0Var == null) {
                    oj0[] oj0VarArr = f;
                    oj0 oj0Var3 = new oj0(i);
                    oj0VarArr[i] = oj0Var3;
                    oj0Var = oj0Var3;
                }
            }
            return oj0Var;
        }
        return oj0Var2;
    }

    public static boolean d(TLRPC.UserFull userFull) {
        if (userFull == null || !e(userFull.birthday) || l7c.c(userFull)) {
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

    public final mj0 b() {
        mj0 mj0Var = this.c;
        if (mj0Var == null || this.d.contains(mj0Var.a)) {
            return null;
        }
        return this.c;
    }

    public final boolean c(long j) {
        mj0 mj0Var = this.c;
        if (mj0Var != null && mj0Var.a(j)) {
            return true;
        }
        TLRPC.UserFull W1 = na7.q1(this.a).W1(j);
        if (W1 != null && e(W1.birthday) && !l7c.c(W1)) {
            return true;
        }
        return false;
    }
}
