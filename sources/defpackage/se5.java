package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public final class se5 {
    public final cv8 a;
    public final i4d b;
    public final s93 c;
    public final mm5 d;
    public final mm5 e;
    public final mm5 f;
    public final mm5 g;
    public final HashSet h;
    public final HashSet i;
    public final cdb j;
    public boolean k;
    public String l;
    public mm5 m;

    public se5(l69 l69Var, ta3 ta3Var, i4d i4dVar, s93 s93Var) {
        this.a = new cv8(new ry4(l69Var, (byte) 9));
        this.b = i4dVar;
        this.c = s93Var;
        mm5 c = ta3Var.c(0);
        c.getClass();
        this.d = c;
        mm5 c2 = ta3Var.c(1);
        c2.getClass();
        this.e = c2;
        mm5 c3 = ta3Var.c(2);
        c3.getClass();
        this.f = c3;
        mm5 c4 = ta3Var.c(3);
        c4.getClass();
        this.g = c4;
        gre.p(!c.isEmpty());
        of5 of5Var = (of5) c.get(0);
        of5Var.getClass();
        this.h = new HashSet(of5Var.a());
        this.i = new HashSet();
        this.j = new cdb(new Handler(g8c.z(), null));
        this.l = ((of5) c.get(0)).d;
    }

    public static Uri.Builder b(Uri uri, gya gyaVar) {
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        String str = gyaVar.a;
        if (str != null) {
            clearQuery.authority(str);
        }
        TreeMap treeMap = new TreeMap();
        for (String str2 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str2);
            queryParameter.getClass();
            treeMap.put(str2, queryParameter);
        }
        treeMap.putAll(gyaVar.b);
        for (Map.Entry entry : treeMap.entrySet()) {
            clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return clearQuery;
    }

    public static void d(fya fyaVar, List list, jm5 jm5Var, jm5 jm5Var2) {
        Uri build;
        gya gyaVar = fyaVar.c;
        qm5 qm5Var = gyaVar.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            of5 of5Var = (of5) it.next();
            Uri uri = (Uri) of5Var.b.get(fyaVar.a);
            String str = of5Var.a.b;
            uri.getClass();
            if (qm5Var.containsKey(str)) {
                build = (Uri) qm5Var.get(str);
                build.getClass();
            } else {
                build = b(uri, gyaVar).build();
            }
            if (build != null) {
                jm5Var.c(build);
                jm5Var2.c(uri);
            }
        }
    }

    public final boolean a(long j) {
        if (this.k && this.m != null) {
            String str = this.l;
            e(j);
            if (!this.l.equals(str)) {
                this.i.add(str);
                this.j.a.postDelayed(new hb5(this, str, (byte) 3), j);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c(long j) {
        boolean z;
        Uri uri;
        String str = this.l;
        ta3 ta3Var = (ta3) this.b.a;
        int i = (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1));
        if (i == 0 && ta3Var.J == null) {
            z = true;
        } else {
            z = false;
        }
        for (sa3 sa3Var : ta3Var.d.values()) {
            if (i != 0) {
                uri = sa3Var.a.b();
            } else {
                uri = null;
            }
            if (uri == null) {
                sa3Var.f(str, z);
            } else {
                sa3Var.a(j, uri, str);
            }
        }
    }

    public final void e(long j) {
        String str = this.l;
        km5 listIterator = this.m.listIterator(0);
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            String str2 = (String) listIterator.next();
            if (j == -9223372036854775807L || !str2.equals(str)) {
                if (this.h.contains(str2) && !this.i.contains(str2)) {
                    this.l = str2;
                    break;
                }
            }
        }
        if (!this.l.equals(str)) {
            c(j);
        }
    }

    public final void f() {
        cv8 cv8Var = this.a;
        mv6 mv6Var = (mv6) cv8Var.j;
        if (mv6Var != null) {
            mv6Var.b0(null);
            cv8Var.j = null;
        }
        cdb cdbVar = (cdb) cv8Var.i;
        if (cdbVar != null) {
            cdbVar.f();
            cv8Var.i = null;
        }
        cv8Var.f = null;
        cv8Var.h = null;
        cv8Var.g = null;
        cv8Var.a = false;
        this.j.f();
        this.k = false;
    }
}
