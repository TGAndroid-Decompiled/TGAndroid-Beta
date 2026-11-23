package gf;

import java.util.ArrayList;
public final class l {
    public StringBuilder d;
    public String f13622e;
    public String f13623f;
    public char f13624g;
    public StringBuilder h;
    public int f13619a = 1;
    public final StringBuilder f13620b = new StringBuilder();
    public final ArrayList f13621c = new ArrayList();
    public boolean f13625i = false;

    public final void a() {
        String str;
        if (!this.f13625i) {
            return;
        }
        String a10 = jf.a.a(this.f13623f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = jf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f13622e;
        ?? pVar = new kf.p();
        pVar.f18263g = str2;
        pVar.h = a10;
        pVar.f18264i = str;
        this.f13621c.add(pVar);
        this.d = null;
        this.f13625i = false;
        this.f13622e = null;
        this.f13623f = null;
        this.h = null;
    }
}
