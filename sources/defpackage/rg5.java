package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public final class rg5 {
    public final dx8 a;
    public final nl9 b;
    public final eb3 c;
    public final mo5 d;
    public final mo5 e;
    public final mo5 f;
    public final mo5 g;
    public final HashSet h;
    public final HashSet i;
    public final dfb j;
    public boolean k;
    public String l;
    public mo5 m;

    public rg5(k6d k6dVar, fc3 fc3Var, nl9 nl9Var, eb3 eb3Var) {
        this.a = new dx8(new wx4(k6dVar, (byte) 12));
        this.b = nl9Var;
        this.c = eb3Var;
        mo5 c = fc3Var.c(0);
        c.getClass();
        this.d = c;
        mo5 c2 = fc3Var.c(1);
        c2.getClass();
        this.e = c2;
        mo5 c3 = fc3Var.c(2);
        c3.getClass();
        this.f = c3;
        mo5 c4 = fc3Var.c(3);
        c4.getClass();
        this.g = c4;
        jte.p(!c.isEmpty());
        nh5 nh5Var = (nh5) c.get(0);
        nh5Var.getClass();
        this.h = new HashSet(nh5Var.a());
        this.i = new HashSet();
        this.j = new dfb(new Handler(hac.z(), null));
        this.l = ((nh5) c.get(0)).d;
    }

    public static Uri.Builder b(Uri uri, j0b j0bVar) {
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        String str = j0bVar.a;
        if (str != null) {
            clearQuery.authority(str);
        }
        TreeMap treeMap = new TreeMap();
        for (String str2 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str2);
            queryParameter.getClass();
            treeMap.put(str2, queryParameter);
        }
        treeMap.putAll(j0bVar.b);
        for (Map.Entry entry : treeMap.entrySet()) {
            clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return clearQuery;
    }

    public static void d(i0b i0bVar, List list, jo5 jo5Var, jo5 jo5Var2) {
        Uri build;
        j0b j0bVar = i0bVar.c;
        qo5 qo5Var = j0bVar.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nh5 nh5Var = (nh5) it.next();
            Uri uri = (Uri) nh5Var.b.get(i0bVar.a);
            String str = nh5Var.a.b;
            uri.getClass();
            if (qo5Var.containsKey(str)) {
                build = (Uri) qo5Var.get(str);
                build.getClass();
            } else {
                build = b(uri, j0bVar).build();
            }
            if (build != null) {
                jo5Var.c(build);
                jo5Var2.c(uri);
            }
        }
    }

    public final boolean a(long j) {
        if (this.k && this.m != null) {
            String str = this.l;
            e(j);
            if (!this.l.equals(str)) {
                this.i.add(str);
                this.j.a.postDelayed(new fd5(this, str, (byte) 4), j);
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
        fc3 fc3Var = (fc3) this.b.b;
        int i = (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1));
        if (i == 0 && fc3Var.J == null) {
            z = true;
        } else {
            z = false;
        }
        for (ec3 ec3Var : fc3Var.d.values()) {
            if (i != 0) {
                uri = ec3Var.a.b();
            } else {
                uri = null;
            }
            if (uri == null) {
                ec3Var.f(str, z);
            } else {
                ec3Var.a(j, uri, str);
            }
        }
    }

    public final void e(long j) {
        String str = this.l;
        ko5 listIterator = this.m.listIterator(0);
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
        dx8 dx8Var = this.a;
        mx6 mx6Var = (mx6) dx8Var.j;
        if (mx6Var != null) {
            mx6Var.e0(null);
            dx8Var.j = null;
        }
        dfb dfbVar = (dfb) dx8Var.i;
        if (dfbVar != null) {
            dfbVar.f();
            dx8Var.i = null;
        }
        dx8Var.f = null;
        dx8Var.h = null;
        dx8Var.g = null;
        dx8Var.a = false;
        this.j.f();
        this.k = false;
    }
}
