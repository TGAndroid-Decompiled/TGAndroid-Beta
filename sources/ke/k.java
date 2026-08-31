package ke;

import java.util.ArrayList;
public final class k {
    public StringBuilder d;
    public String f11166e;
    public String f11167f;
    public char f11168g;
    public StringBuilder h;
    public int f11163a = 1;
    public final StringBuilder f11164b = new StringBuilder();
    public final ArrayList f11165c = new ArrayList();
    public boolean f11169i = false;

    public final void a() {
        String str;
        if (!this.f11169i) {
            return;
        }
        String a2 = me.a.a(this.f11167f);
        StringBuilder sb = this.h;
        if (sb != null) {
            str = me.a.a(sb.toString());
        } else {
            str = null;
        }
        String str2 = this.f11166e;
        ?? pVar = new ne.p();
        pVar.f15971g = str2;
        pVar.h = a2;
        pVar.f15972i = str;
        this.f11165c.add(pVar);
        this.d = null;
        this.f11169i = false;
        this.f11166e = null;
        this.f11167f = null;
        this.h = null;
    }
}
