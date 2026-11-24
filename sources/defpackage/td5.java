package defpackage;

import android.content.Context;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
public final class td5 {
    public static final lg8 b = new lg8("fire-global");
    public static final lg8 c = new lg8("fire-count");
    public static final lg8 d = new lg8("last-used-date");
    public final xs5 a;

    public td5(Context context, String str) {
        this.a = new xs5(context, "FirebaseHeartBeat".concat(str));
    }

    public static String c(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public static lg8 d(ih7 ih7Var, String str) {
        for (Map.Entry entry : ih7Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        String str3 = ((lg8) entry.getKey()).a;
                        str3.getClass();
                        return new lg8(str3);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static void f(ih7 ih7Var, String str) {
        lg8 d2 = d(ih7Var, str);
        if (d2 == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) mle.a(ih7Var, d2, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            ih7Var.b();
            ih7Var.a.remove(d2);
            return;
        }
        ih7Var.d(d2, hashSet);
    }

    public final synchronized void a() {
        this.a.a(new tw2(this));
    }

    public final synchronized ArrayList b() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        String c2 = c(System.currentTimeMillis());
        for (Map.Entry entry : ((Map) ipd.a(new b73(this.a, null, (byte) 1))).entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(c2);
                if (!hashSet.isEmpty()) {
                    arrayList.add(new u90(((lg8) entry.getKey()).a, new ArrayList(hashSet)));
                }
            }
        }
        j(System.currentTimeMillis());
        return arrayList;
    }

    public final synchronized void e() {
        this.a.a(new z1(this, c(System.currentTimeMillis())));
    }

    public final synchronized boolean g(long j) {
        return h(b, j);
    }

    public final synchronized boolean h(lg8 lg8Var, long j) {
        if (c(((Long) this.a.b(lg8Var, -1L)).longValue()).equals(c(j))) {
            return false;
        }
        ih7 ih7Var = (ih7) ipd.a(new vs5(this.a, lg8Var, Long.valueOf(j), null, (byte) 1));
        return true;
    }

    public final synchronized void i(long j, String str) {
        try {
            try {
                String c2 = c(j);
                str.getClass();
                lg8 lg8Var = new lg8(str);
                this.a.a(new t03(this, c2, str, lg8Var, (byte) 2));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void j(final long j) {
        this.a.a(new qp4() {
            @Override
            public final Object invoke(Object obj) {
                ((ih7) obj).c(td5.b, Long.valueOf(j));
                return null;
            }
        });
    }
}
