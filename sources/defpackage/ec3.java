package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
public final class ec3 {
    public final nh5 a;
    public final HashMap b;
    public final boolean c;
    public final fc3 d;

    public ec3(fc3 fc3Var, nh5 nh5Var, boolean z) {
        this.d = fc3Var;
        this.a = nh5Var;
        HashMap hashMap = new HashMap();
        v7c n = nh5Var.a().n();
        while (n.hasNext()) {
            String str = (String) n.next();
            Uri uri = (Uri) nh5Var.b.get(str);
            uri.getClass();
            hashMap.put(uri, new dc3(this.d, uri, str));
        }
        this.b = hashMap;
        this.c = z;
    }

    public final boolean a(long j, Uri uri, String str) {
        Uri uri2;
        HashMap hashMap = this.b;
        jte.p(hashMap.containsKey(uri));
        dc3 dc3Var = (dc3) hashMap.get(uri);
        dc3Var.getClass();
        dc3Var.r = SystemClock.elapsedRealtime() + j;
        fc3 fc3Var = this.d;
        rg5 rg5Var = fc3Var.y;
        if (((rg5Var == null || !rg5Var.k || str != null) && f(str, false)) || ((uri2 = fc3Var.I) != null && !uri.equals(uri2))) {
            return true;
        }
        mo5 mo5Var = fc3Var.E;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < mo5Var.size(); i++) {
            Uri b = ((nh5) mo5Var.get(i)).b();
            ec3 ec3Var = (ec3) fc3Var.d.get(b);
            ec3Var.getClass();
            if (!ec3Var.c(elapsedRealtime, b)) {
                fc3Var.I = b;
                ec3Var.d(b, fc3Var.d(b));
                return true;
            }
        }
        return false;
    }

    public final ch5 b(Uri uri) {
        HashMap hashMap = this.b;
        jte.p(hashMap.containsKey(uri));
        dc3 dc3Var = (dc3) hashMap.get(uri);
        dc3Var.getClass();
        return dc3Var.e;
    }

    public final boolean c(long j, Uri uri) {
        HashMap hashMap = this.b;
        jte.p(hashMap.containsKey(uri));
        dc3 dc3Var = (dc3) hashMap.get(uri);
        dc3Var.getClass();
        if (j <= dc3Var.r) {
            return true;
        }
        return false;
    }

    public final void d(Uri uri, Uri uri2) {
        HashMap hashMap = this.b;
        jte.p(hashMap.containsKey(uri));
        dc3 dc3Var = (dc3) hashMap.get(uri);
        dc3Var.getClass();
        dc3Var.c(uri2);
    }

    public final void e(Uri uri, boolean z) {
        Uri uri2;
        HashMap hashMap = this.b;
        jte.p(hashMap.containsKey(uri));
        dc3 dc3Var = (dc3) hashMap.get(uri);
        dc3Var.getClass();
        if (z) {
            uri2 = dc3Var.a();
        } else {
            uri2 = dc3Var.a;
        }
        dc3Var.c(uri2);
    }

    public final boolean f(String str, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        nh5 nh5Var = this.a;
        HashMap hashMap = this.b;
        if (str != null) {
            for (dc3 dc3Var : hashMap.values()) {
                if (dc3Var.b.contains(str)) {
                    dc3Var.r = 0L;
                }
            }
        } else {
            Iterator it = hashMap.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    dc3 dc3Var2 = (dc3) it.next();
                    if (!dc3Var2.b.contains(nh5Var.d) && elapsedRealtime > dc3Var2.r) {
                        str = (String) dc3Var2.b.iterator().next();
                        break;
                    }
                } else {
                    str = null;
                    break;
                }
            }
        }
        if (str == null) {
            return false;
        }
        Uri b = nh5Var.b();
        jte.p(nh5Var.b.containsKey(str));
        nh5Var.d = str;
        Uri b2 = nh5Var.b();
        fc3 fc3Var = this.d;
        if (b.equals(fc3Var.I)) {
            fc3Var.h(b2, z);
        }
        dc3 dc3Var3 = (dc3) hashMap.get(b);
        dc3Var3.getClass();
        dc3 dc3Var4 = (dc3) hashMap.get(b2);
        dc3Var4.getClass();
        dc3Var4.x = dc3Var3.x;
        dc3Var3.x = false;
        return true;
    }
}
