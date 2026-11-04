package ad;

import java.util.Arrays;
public final class m {
    public static final char[] f366r;
    public static final int[] f367s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f368a;
    public final c f369b;
    public l d;
    public k f374i;
    public final j f375j;
    public final i f376k;
    public final e f377l;
    public final g f378m;
    public final f f379n;
    public String f380o;
    public final int[] f381p;
    public final int[] f382q;
    public c2 f370c = c2.f317a;
    public boolean f371e = false;
    public String f372f = null;
    public final StringBuilder f373g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f366r = cArr;
        Arrays.sort(cArr);
    }

    public m(a aVar, c cVar) {
        ?? kVar = new k(2);
        kVar.f363k = new zc.b();
        this.f375j = kVar;
        this.f376k = new k(3);
        this.f377l = new l(5, 0);
        this.f378m = new g();
        this.f379n = new f();
        this.f381p = new int[1];
        this.f382q = new int[2];
        this.f368a = aVar;
        this.f369b = cVar;
    }

    public final void a(c2 c2Var) {
        this.f368a.a();
        this.f370c = c2Var;
    }

    public final void b(String str) {
        c cVar = this.f369b;
        if (cVar.size() < 0) {
            a aVar = this.f368a;
            cVar.add(new b(aVar.f312f + aVar.f311e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: ad.m.c(java.lang.Character, boolean):int[]");
    }

    public final k d(boolean z10) {
        k kVar;
        if (z10) {
            kVar = this.f375j;
            kVar.k();
        } else {
            kVar = this.f376k;
            kVar.b();
        }
        this.f374i = kVar;
        return kVar;
    }

    public final void e() {
        l.c(this.h);
    }

    public final void f(char c2) {
        h(String.valueOf(c2));
    }

    public final void g(l lVar) {
        if (!this.f371e) {
            this.d = lVar;
            this.f371e = true;
            int i3 = lVar.f365b;
            if (i3 == 2) {
                this.f380o = ((j) lVar).f357c;
                return;
            } else if (i3 == 3 && ((i) lVar).f363k != null) {
                c cVar = this.f369b;
                if (cVar.size() < 0) {
                    a aVar = this.f368a;
                    b bVar = new b(0);
                    bVar.f316c = aVar.f312f + aVar.f311e;
                    bVar.f315b = "Attributes incorrectly present on end tag";
                    cVar.add(bVar);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException("There is an unread token pending!");
    }

    public final void h(String str) {
        if (this.f372f == null) {
            this.f372f = str;
            return;
        }
        StringBuilder sb2 = this.f373g;
        if (sb2.length() == 0) {
            sb2.append(this.f372f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f379n);
    }

    public final void j() {
        g(this.f378m);
    }

    public final void k() {
        k kVar = this.f374i;
        if (kVar.f358e != null) {
            kVar.j();
        }
        g(this.f374i);
    }

    public final void l(c2 c2Var) {
        c cVar = this.f369b;
        if (cVar.size() < 0) {
            a aVar = this.f368a;
            cVar.add(new b(aVar.f312f + aVar.f311e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{c2Var}));
        }
    }

    public final void m(c2 c2Var) {
        c cVar = this.f369b;
        if (cVar.size() < 0) {
            a aVar = this.f368a;
            cVar.add(new b(aVar.f312f + aVar.f311e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.i()), c2Var}));
        }
    }

    public final boolean n() {
        if (this.f380o != null && this.f374i.i().equalsIgnoreCase(this.f380o)) {
            return true;
        }
        return false;
    }
}
