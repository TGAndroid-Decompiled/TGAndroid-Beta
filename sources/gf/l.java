package gf;

import java.util.ArrayList;
public final class l {
    public StringBuilder d;
    public String f13278e;
    public String f13279f;
    public char f13280g;
    public StringBuilder h;
    public int f13275a = 1;
    public final StringBuilder f13276b = new StringBuilder();
    public final ArrayList f13277c = new ArrayList();
    public boolean f13281i = false;

    public final void a() {
        String str;
        if (!this.f13281i) {
            return;
        }
        String a10 = jf.a.a(this.f13279f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = jf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f13278e;
        ?? pVar = new kf.p();
        pVar.f17837g = str2;
        pVar.h = a10;
        pVar.f17838i = str;
        this.f13277c.add(pVar);
        this.d = null;
        this.f13281i = false;
        this.f13278e = null;
        this.f13279f = null;
        this.h = null;
    }
}
