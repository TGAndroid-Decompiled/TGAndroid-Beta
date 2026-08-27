package mc;

import java.util.Arrays;

public final class l {

    public static final char[] f18003r;

    public static final int[] f18004s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    public final a f18005a;

    public final b f18006b;
    public k d;

    public j f18011i;

    public final i f18012j;

    public final h f18013k;

    public final d f18014l;

    public final f f18015m;

    public final e f18016n;

    public String f18017o;

    public final int[] f18018p;

    public final int[] f18019q;

    public b2 f18007c = b2.f17954a;

    public boolean f18008e = false;

    public String f18009f = null;

    public final StringBuilder f18010g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f18003r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        i iVar = new i(2);
        iVar.f18000k = new lc.b();
        this.f18012j = iVar;
        this.f18013k = new h(3);
        this.f18014l = new d(5, 0);
        this.f18015m = new f();
        this.f18016n = new e();
        this.f18018p = new int[1];
        this.f18019q = new int[2];
        this.f18005a = aVar;
        this.f18006b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f18005a.a();
        this.f18007c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f18006b;
        if (bVar.size() < 0) {
            a aVar = this.f18005a;
            bVar.add(new com.google.android.gms.internal.clearcut.a1("Invalid character reference: %s", aVar.f17952f + aVar.f17951e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: mc.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f18012j;
            jVar.c();
        } else {
            jVar = this.f18013k;
            jVar.c();
        }
        this.f18011i = jVar;
        return jVar;
    }

    public final void e() {
        k.d(this.h);
    }

    public final void f(char c10) {
        g(String.valueOf(c10));
    }

    public final void g(String str) {
        if (this.f18009f == null) {
            this.f18009f = str;
            return;
        }
        StringBuilder sb2 = this.f18010g;
        if (sb2.length() == 0) {
            sb2.append(this.f18009f);
        }
        sb2.append(str);
    }

    public final void h(k kVar) {
        if (this.f18008e) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.d = kVar;
        this.f18008e = true;
        int i10 = kVar.f18002b;
        if (i10 == 2) {
            this.f18017o = ((i) kVar).f17994c;
            return;
        }
        if (i10 != 3 || ((h) kVar).f18000k == null) {
            return;
        }
        b bVar = this.f18006b;
        if (bVar.size() < 0) {
            a aVar = this.f18005a;
            int i11 = aVar.f17952f + aVar.f17951e;
            com.google.android.gms.internal.clearcut.a1 a1Var = new com.google.android.gms.internal.clearcut.a1();
            a1Var.f3774b = i11;
            a1Var.f3775c = "Attributes incorrectly present on end tag";
            bVar.add(a1Var);
        }
    }

    public final void i() {
        h(this.f18016n);
    }

    public final void j() {
        h(this.f18015m);
    }

    public final void k() {
        j jVar = this.f18011i;
        if (jVar.f17995e != null) {
            jVar.k();
        }
        h(this.f18011i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f18006b;
        if (bVar.size() < 0) {
            a aVar = this.f18005a;
            bVar.add(new com.google.android.gms.internal.clearcut.a1("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f17952f + aVar.f17951e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f18006b;
        if (bVar.size() < 0) {
            a aVar = this.f18005a;
            bVar.add(new com.google.android.gms.internal.clearcut.a1("Unexpected character '%s' in input state [%s]", aVar.f17952f + aVar.f17951e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        return this.f18017o != null && this.f18011i.j().equalsIgnoreCase(this.f18017o);
    }
}
