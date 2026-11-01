package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class y1 {
    public static volatile y1[] f19515f = new y1[4];
    public static final Object[] f19516g = new Object[4];
    public final int f19517a;
    public long f19518b;
    public w1 f19519c;
    public final Set d;
    public boolean e;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f19516g[i10] = new Object();
        }
    }

    public y1(int i10) {
        y1 y1Var;
        Exception exc;
        x1 x1Var;
        this.f19517a = i10;
        SharedPreferences sharedPreferences = wp.r1(i10).f7;
        this.f19518b = sharedPreferences.getLong("bday_check", 0L);
        x1 x1Var2 = null;
        String string = sharedPreferences.getString("bday_contacts", null);
        if (string != null) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                int readInt32 = serializedData.readInt32(true);
                if (readInt32 != 290452237) {
                    try {
                        int i11 = x1.f19372b;
                    } catch (Exception e) {
                        exc = e;
                        y1Var = this;
                        f8.g(exc, true);
                        y1Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                    }
                } else {
                    x1Var2 = new x1();
                }
                x1Var = (x1) TLObject.TLdeserialize(x1.class, x1Var2, serializedData, readInt32, true);
            } catch (Exception e7) {
                e = e7;
                y1Var = this;
            }
            if (x1Var != null && !x1Var.f19373a.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < x1Var.f19373a.size(); i12++) {
                    arrayList.add(Long.valueOf(((TL_account.TL_contactBirthday) x1Var.f19373a.get(i12)).contact_id));
                }
                y1Var = this;
                try {
                    is.a0(i10).f16331a.c(new dg(y1Var, i10, arrayList, x1Var, 2));
                } catch (Exception e10) {
                    e = e10;
                    exc = e;
                    f8.g(exc, true);
                    y1Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
                }
                y1Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
            }
        }
        y1Var = this;
        y1Var.d = sharedPreferences.getStringSet("bday_hidden", new HashSet());
    }

    public static y1 a(int i10) {
        y1 y1Var;
        y1 y1Var2 = f19515f[i10];
        if (y1Var2 == null) {
            synchronized (f19516g[i10]) {
                try {
                    y1Var = f19515f[i10];
                    if (y1Var == null) {
                        y1[] y1VarArr = f19515f;
                        y1 y1Var3 = new y1(i10);
                        y1VarArr[i10] = y1Var3;
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

    public static boolean d(TLRPC.UserFull userFull) {
        if (userFull == null || !e(userFull.birthday) || i20.b(userFull)) {
            return false;
        }
        return true;
    }

    public static boolean e(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(5);
        int i11 = calendar.get(2) + 1;
        if (tL_birthday.day != i10 || tL_birthday.month != i11) {
            return false;
        }
        return true;
    }

    public final w1 b() {
        w1 w1Var = this.f19519c;
        if (w1Var == null || this.d.contains(w1Var.f18962a)) {
            return null;
        }
        return this.f19519c;
    }

    public final boolean c(long j10) {
        w1 w1Var = this.f19519c;
        if (w1Var != null && w1Var.a(j10)) {
            return true;
        }
        TLRPC.UserFull a2 = wp.r1(this.f19517a).a2(j10);
        if (a2 != null && e(a2.birthday) && !i20.b(a2)) {
            return true;
        }
        return false;
    }
}
