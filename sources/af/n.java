package af;

import java.util.ArrayList;
public final class n {
    public StringBuilder d;
    public String e;
    public String f611f;
    public char f612g;
    public StringBuilder h;
    public int f608a = 1;
    public final StringBuilder f609b = new StringBuilder();
    public final ArrayList f610c = new ArrayList();
    public boolean f613i = false;

    public final void a() {
        String str;
        if (!this.f613i) {
            return;
        }
        String a2 = cf.a.a(this.f611f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = cf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? pVar = new df.p();
        pVar.f6525g = str2;
        pVar.h = a2;
        pVar.f6526i = str;
        this.f610c.add(pVar);
        this.d = null;
        this.f613i = false;
        this.e = null;
        this.f611f = null;
        this.h = null;
    }
}
