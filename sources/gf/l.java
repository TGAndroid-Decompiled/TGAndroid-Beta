package gf;

import java.util.ArrayList;
public final class l {
    public StringBuilder d;
    public String f13619e;
    public String f13620f;
    public char f13621g;
    public StringBuilder h;
    public int f13616a = 1;
    public final StringBuilder f13617b = new StringBuilder();
    public final ArrayList f13618c = new ArrayList();
    public boolean f13622i = false;

    public final void a() {
        String str;
        if (!this.f13622i) {
            return;
        }
        String a10 = jf.a.a(this.f13620f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = jf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f13619e;
        ?? pVar = new kf.p();
        pVar.f18260g = str2;
        pVar.h = a10;
        pVar.f18261i = str;
        this.f13618c.add(pVar);
        this.d = null;
        this.f13622i = false;
        this.f13619e = null;
        this.f13620f = null;
        this.h = null;
    }
}
