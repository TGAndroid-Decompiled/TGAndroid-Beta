package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public final class ug5 {
    public final ny8 a;
    public final zm9 b;
    public final la3 c;
    public final po5 d;
    public final po5 e;
    public final po5 f;
    public final po5 g;
    public final HashSet h;
    public final HashSet i;
    public final xgb j;
    public boolean k;
    public String l;
    public po5 m;

    public ug5(z8d z8dVar, mb3 mb3Var, zm9 zm9Var, la3 la3Var) {
        this.a = new ny8(new e05(z8dVar, (byte) 11));
        this.b = zm9Var;
        this.c = la3Var;
        po5 c = mb3Var.c(0);
        c.getClass();
        this.d = c;
        po5 c2 = mb3Var.c(1);
        c2.getClass();
        this.e = c2;
        po5 c3 = mb3Var.c(2);
        c3.getClass();
        this.f = c3;
        po5 c4 = mb3Var.c(3);
        c4.getClass();
        this.g = c4;
        yve.p(!c.isEmpty());
        qh5 qh5Var = (qh5) c.get(0);
        qh5Var.getClass();
        this.h = new HashSet(qh5Var.a());
        this.i = new HashSet();
        this.j = new xgb(new Handler(gcc.z(), null));
        this.l = ((qh5) c.get(0)).d;
    }

    public static Uri.Builder b(Uri uri, i2b i2bVar) {
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        String str = i2bVar.a;
        if (str != null) {
            clearQuery.authority(str);
        }
        TreeMap treeMap = new TreeMap();
        for (String str2 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str2);
            queryParameter.getClass();
            treeMap.put(str2, queryParameter);
        }
        treeMap.putAll(i2bVar.b);
        for (Map.Entry entry : treeMap.entrySet()) {
            clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return clearQuery;
    }

    public static void d(h2b h2bVar, List list, mo5 mo5Var, mo5 mo5Var2) {
        Uri build;
        i2b i2bVar = h2bVar.c;
        to5 to5Var = i2bVar.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qh5 qh5Var = (qh5) it.next();
            Uri uri = (Uri) qh5Var.b.get(h2bVar.a);
            String str = qh5Var.a.b;
            uri.getClass();
            if (to5Var.containsKey(str)) {
                build = (Uri) to5Var.get(str);
                build.getClass();
            } else {
                build = b(uri, i2bVar).build();
            }
            if (build != null) {
                mo5Var.c(build);
                mo5Var2.c(uri);
            }
        }
    }

    public final boolean a(long j) {
        if (this.k && this.m != null) {
            String str = this.l;
            e(j);
            if (!this.l.equals(str)) {
                this.i.add(str);
                this.j.a.postDelayed(new tg5(this, str, (byte) 0), j);
                return true;
            }
        }
        return false;
    }

    public final void c(long j) {
        boolean z;
        Uri uri;
        String str = this.l;
        mb3 mb3Var = (mb3) this.b.b;
        int i = (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1));
        if (i == 0 && mb3Var.J == null) {
            z = true;
        } else {
            z = false;
        }
        for (lb3 lb3Var : mb3Var.d.values()) {
            if (i != 0) {
                uri = lb3Var.a.b();
            } else {
                uri = null;
            }
            if (uri == null) {
                lb3Var.f(str, z);
            } else {
                lb3Var.a(j, uri, str);
            }
        }
    }

    public final void e(long j) {
        String str = this.l;
        no5 listIterator = this.m.listIterator(0);
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
        ny8 ny8Var = this.a;
        rx6 rx6Var = (rx6) ny8Var.j;
        if (rx6Var != null) {
            rx6Var.g0(null);
            ny8Var.j = null;
        }
        xgb xgbVar = (xgb) ny8Var.i;
        if (xgbVar != null) {
            xgbVar.f();
            ny8Var.i = null;
        }
        ny8Var.f = null;
        ny8Var.h = null;
        ny8Var.g = null;
        ny8Var.a = false;
        this.j.f();
        this.k = false;
    }
}
