package na;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
public final class g {
    public final SharedPreferences f14026a;

    public g(Context context, String str) {
        this.f14026a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j3 = this.f14026a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f14026a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f14026a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f14026a.edit().putStringSet(str, hashSet).putLong("fire-count", j3 - 1).commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f14026a.edit();
            int i10 = 0;
            for (Map.Entry<String, ?> entry : this.f14026a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    String d = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (((Set) entry.getValue()).contains(d)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d);
                        i10++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i10 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i10);
            }
            edit.commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f14026a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized String d(long j3) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j3)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j3));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f14026a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return entry.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public final synchronized boolean f(long j3, long j10) {
        return d(j3).equals(d(j10));
    }

    public final synchronized void g() {
        String d = d(System.currentTimeMillis());
        this.f14026a.edit().putString("last-used-date", d).commit();
        h(d);
    }

    public final synchronized void h(String str) {
        try {
            String e = e(str);
            if (e == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f14026a.getStringSet(e, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f14026a.edit().remove(e).commit();
            } else {
                this.f14026a.edit().putStringSet(e, hashSet).commit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean i(long j3) {
        return j(j3);
    }

    public final synchronized boolean j(long j3) {
        if (this.f14026a.contains("fire-global")) {
            if (!f(this.f14026a.getLong("fire-global", -1L), j3)) {
                this.f14026a.edit().putLong("fire-global", j3).commit();
                return true;
            }
            return false;
        }
        this.f14026a.edit().putLong("fire-global", j3).commit();
        return true;
    }

    public final synchronized void k(long j3, String str) {
        String d = d(j3);
        if (this.f14026a.getString("last-used-date", "").equals(d)) {
            String e = e(d);
            if (e == null) {
                return;
            }
            if (e.equals(str)) {
                return;
            }
            m(str, d);
            return;
        }
        long j10 = this.f14026a.getLong("fire-count", 0L);
        if (j10 + 1 == 30) {
            a();
            j10 = this.f14026a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f14026a.getStringSet(str, new HashSet()));
        hashSet.add(d);
        this.f14026a.edit().putStringSet(str, hashSet).putLong("fire-count", j10 + 1).putString("last-used-date", d).commit();
    }

    public final synchronized void l(long j3) {
        this.f14026a.edit().putLong("fire-global", j3).commit();
    }

    public final synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f14026a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f14026a.edit().putStringSet(str, hashSet).commit();
    }
}
