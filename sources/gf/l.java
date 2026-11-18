package gf;

import java.util.ArrayList;
public final class l {
    public StringBuilder d;
    public String f13590e;
    public String f13591f;
    public char f13592g;
    public StringBuilder h;
    public int f13587a = 1;
    public final StringBuilder f13588b = new StringBuilder();
    public final ArrayList f13589c = new ArrayList();
    public boolean f13593i = false;

    public final void a() {
        String str;
        if (!this.f13593i) {
            return;
        }
        String a10 = jf.a.a(this.f13591f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = jf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f13590e;
        ?? pVar = new kf.p();
        pVar.f18229g = str2;
        pVar.h = a10;
        pVar.f18230i = str;
        this.f13589c.add(pVar);
        this.d = null;
        this.f13593i = false;
        this.f13590e = null;
        this.f13591f = null;
        this.h = null;
    }
}
