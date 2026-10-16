package af;

import java.util.ArrayList;
public final class n {
    public StringBuilder d;
    public String e;
    public String f615f;
    public char f616g;
    public StringBuilder h;
    public int f612a = 1;
    public final StringBuilder f613b = new StringBuilder();
    public final ArrayList f614c = new ArrayList();
    public boolean f617i = false;

    public final void a() {
        String str;
        if (!this.f617i) {
            return;
        }
        String a2 = cf.a.a(this.f615f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = cf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? pVar = new df.p();
        pVar.f6528g = str2;
        pVar.h = a2;
        pVar.f6529i = str;
        this.f614c.add(pVar);
        this.d = null;
        this.f617i = false;
        this.e = null;
        this.f615f = null;
        this.h = null;
    }
}
