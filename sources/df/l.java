package df;

import java.util.ArrayList;
public final class l {
    public StringBuilder d;
    public String f8906e;
    public String f8907f;
    public char f8908g;
    public StringBuilder h;
    public int f8903a = 1;
    public final StringBuilder f8904b = new StringBuilder();
    public final ArrayList f8905c = new ArrayList();
    public boolean f8909i = false;

    public final void a() {
        String str;
        if (!this.f8909i) {
            return;
        }
        String a10 = ff.a.a(this.f8907f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = ff.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f8906e;
        ?? pVar = new gf.p();
        pVar.f12263g = str2;
        pVar.h = a10;
        pVar.f12264i = str;
        this.f8905c.add(pVar);
        this.d = null;
        this.f8909i = false;
        this.f8906e = null;
        this.f8907f = null;
        this.h = null;
    }
}
