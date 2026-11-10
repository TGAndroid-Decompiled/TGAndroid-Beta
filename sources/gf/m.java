package gf;

import java.util.ArrayList;
public final class m {
    public StringBuilder d;
    public String f13938e;
    public String f13939f;
    public char f13940g;
    public StringBuilder h;
    public int f13935a = 1;
    public final StringBuilder f13936b = new StringBuilder();
    public final ArrayList f13937c = new ArrayList();
    public boolean f13941i = false;

    public final void a() {
        String str;
        if (!this.f13941i) {
            return;
        }
        String a10 = jf.a.a(this.f13939f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = jf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f13938e;
        ?? pVar = new kf.p();
        pVar.f17278g = str2;
        pVar.h = a10;
        pVar.f17279i = str;
        this.f13937c.add(pVar);
        this.d = null;
        this.f13941i = false;
        this.f13938e = null;
        this.f13939f = null;
        this.h = null;
    }
}
