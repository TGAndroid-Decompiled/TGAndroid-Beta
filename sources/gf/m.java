package gf;

import java.util.ArrayList;
public final class m {
    public StringBuilder d;
    public String f13936e;
    public String f13937f;
    public char f13938g;
    public StringBuilder h;
    public int f13933a = 1;
    public final StringBuilder f13934b = new StringBuilder();
    public final ArrayList f13935c = new ArrayList();
    public boolean f13939i = false;

    public final void a() {
        String str;
        if (!this.f13939i) {
            return;
        }
        String a10 = jf.a.a(this.f13937f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = jf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f13936e;
        ?? pVar = new kf.p();
        pVar.f17275g = str2;
        pVar.h = a10;
        pVar.f17276i = str;
        this.f13935c.add(pVar);
        this.d = null;
        this.f13939i = false;
        this.f13936e = null;
        this.f13937f = null;
        this.h = null;
    }
}
