package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
public final class lb3 {
    public final qh5 a;
    public final HashMap b;
    public final boolean c;
    public final mb3 d;

    public lb3(mb3 mb3Var, qh5 qh5Var, boolean z) {
        this.d = mb3Var;
        this.a = qh5Var;
        HashMap hashMap = new HashMap();
        v9c n = qh5Var.a().n();
        while (n.hasNext()) {
            String str = (String) n.next();
            Uri uri = (Uri) qh5Var.b.get(str);
            uri.getClass();
            hashMap.put(uri, new kb3(this.d, uri, str));
        }
        this.b = hashMap;
        this.c = z;
    }

    public final boolean a(long j, Uri uri, String str) {
        Uri uri2;
        HashMap hashMap = this.b;
        yve.p(hashMap.containsKey(uri));
        kb3 kb3Var = (kb3) hashMap.get(uri);
        kb3Var.getClass();
        kb3Var.r = SystemClock.elapsedRealtime() + j;
        mb3 mb3Var = this.d;
        ug5 ug5Var = mb3Var.y;
        if (((ug5Var == null || !ug5Var.k || str != null) && f(str, false)) || ((uri2 = mb3Var.I) != null && !uri.equals(uri2))) {
            return true;
        }
        po5 po5Var = mb3Var.E;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < po5Var.size(); i++) {
            Uri b = ((qh5) po5Var.get(i)).b();
            lb3 lb3Var = (lb3) mb3Var.d.get(b);
            lb3Var.getClass();
            if (!lb3Var.c(elapsedRealtime, b)) {
                mb3Var.I = b;
                lb3Var.d(b, mb3Var.d(b));
                return true;
            }
        }
        return false;
    }

    public final fh5 b(Uri uri) {
        HashMap hashMap = this.b;
        yve.p(hashMap.containsKey(uri));
        kb3 kb3Var = (kb3) hashMap.get(uri);
        kb3Var.getClass();
        return kb3Var.e;
    }

    public final boolean c(long j, Uri uri) {
        HashMap hashMap = this.b;
        yve.p(hashMap.containsKey(uri));
        kb3 kb3Var = (kb3) hashMap.get(uri);
        kb3Var.getClass();
        if (j <= kb3Var.r) {
            return true;
        }
        return false;
    }

    public final void d(Uri uri, Uri uri2) {
        HashMap hashMap = this.b;
        yve.p(hashMap.containsKey(uri));
        kb3 kb3Var = (kb3) hashMap.get(uri);
        kb3Var.getClass();
        kb3Var.c(uri2);
    }

    public final void e(Uri uri, boolean z) {
        Uri uri2;
        HashMap hashMap = this.b;
        yve.p(hashMap.containsKey(uri));
        kb3 kb3Var = (kb3) hashMap.get(uri);
        kb3Var.getClass();
        if (z) {
            uri2 = kb3Var.a();
        } else {
            uri2 = kb3Var.a;
        }
        kb3Var.c(uri2);
    }

    public final boolean f(String str, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        qh5 qh5Var = this.a;
        HashMap hashMap = this.b;
        if (str != null) {
            for (kb3 kb3Var : hashMap.values()) {
                if (kb3Var.b.contains(str)) {
                    kb3Var.r = 0L;
                }
            }
        } else {
            Iterator it = hashMap.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    kb3 kb3Var2 = (kb3) it.next();
                    if (!kb3Var2.b.contains(qh5Var.d) && elapsedRealtime > kb3Var2.r) {
                        str = (String) kb3Var2.b.iterator().next();
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
        Uri b = qh5Var.b();
        yve.p(qh5Var.b.containsKey(str));
        qh5Var.d = str;
        Uri b2 = qh5Var.b();
        mb3 mb3Var = this.d;
        if (b.equals(mb3Var.I)) {
            mb3Var.i(b2, z);
        }
        kb3 kb3Var3 = (kb3) hashMap.get(b);
        kb3Var3.getClass();
        kb3 kb3Var4 = (kb3) hashMap.get(b2);
        kb3Var4.getClass();
        kb3Var4.x = kb3Var3.x;
        kb3Var3.x = false;
        return true;
    }
}
