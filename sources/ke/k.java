package ke;

import java.util.ArrayList;
public final class k {
    public StringBuilder d;
    public String e;
    public String f10391f;
    public char f10392g;
    public StringBuilder h;
    public int f10388a = 1;
    public final StringBuilder f10389b = new StringBuilder();
    public final ArrayList f10390c = new ArrayList();
    public boolean f10393i = false;

    public final void a() {
        String str;
        if (!this.f10393i) {
            return;
        }
        String a2 = me.a.a(this.f10391f);
        StringBuilder sb = this.h;
        if (sb != null) {
            str = me.a.a(sb.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? pVar = new ne.p();
        pVar.f14952g = str2;
        pVar.h = a2;
        pVar.f14953i = str;
        this.f10390c.add(pVar);
        this.d = null;
        this.f10393i = false;
        this.e = null;
        this.f10391f = null;
        this.h = null;
    }
}
