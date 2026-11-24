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
public final class rf5 {
    public static final ni8 b = new ni8("fire-global");
    public static final ni8 c = new ni8("fire-count");
    public static final ni8 d = new ni8("last-used-date");
    public final wu5 a;

    public rf5(Context context, String str) {
        this.a = new wu5(context, "FirebaseHeartBeat".concat(str));
    }

    public static String c(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public static ni8 d(lj7 lj7Var, String str) {
        for (Map.Entry entry : lj7Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        String str3 = ((ni8) entry.getKey()).a;
                        str3.getClass();
                        return new ni8(str3);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static void f(lj7 lj7Var, String str) {
        ni8 d2 = d(lj7Var, str);
        if (d2 == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) one.a(lj7Var, d2, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            lj7Var.b();
            lj7Var.a.remove(d2);
            return;
        }
        lj7Var.d(d2, hashSet);
    }

    public final synchronized void a() {
        this.a.a(new dy2(this));
    }

    public final synchronized ArrayList b() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        String c2 = c(System.currentTimeMillis());
        for (Map.Entry entry : ((Map) lrd.a(new n83(this.a, null, (byte) 1))).entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(c2);
                if (!hashSet.isEmpty()) {
                    arrayList.add(new ua0(((ni8) entry.getKey()).a, new ArrayList(hashSet)));
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

    public final synchronized boolean h(ni8 ni8Var, long j) {
        if (c(((Long) this.a.b(ni8Var, -1L)).longValue()).equals(c(j))) {
            return false;
        }
        lj7 lj7Var = (lj7) lrd.a(new uu5(this.a, ni8Var, Long.valueOf(j), null, (byte) 1));
        return true;
    }

    public final synchronized void i(long j, String str) {
        try {
            try {
                String c2 = c(j);
                str.getClass();
                ni8 ni8Var = new ni8(str);
                this.a.a(new f23(this, c2, str, ni8Var, (byte) 2));
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
        this.a.a(new rr4() {
            @Override
            public final Object invoke(Object obj) {
                ((lj7) obj).c(rf5.b, Long.valueOf(j));
                return null;
            }
        });
    }
}
