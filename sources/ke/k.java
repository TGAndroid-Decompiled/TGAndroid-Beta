package ke;

import java.util.ArrayList;
public final class k {
    public StringBuilder d;
    public String e;
    public String f10370f;
    public char f10371g;
    public StringBuilder h;
    public int f10367a = 1;
    public final StringBuilder f10368b = new StringBuilder();
    public final ArrayList f10369c = new ArrayList();
    public boolean f10372i = false;

    public final void a() {
        String str;
        if (!this.f10372i) {
            return;
        }
        String a2 = me.a.a(this.f10370f);
        StringBuilder sb = this.h;
        if (sb != null) {
            str = me.a.a(sb.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? pVar = new ne.p();
        pVar.f14937g = str2;
        pVar.h = a2;
        pVar.f14938i = str;
        this.f10369c.add(pVar);
        this.d = null;
        this.f10372i = false;
        this.e = null;
        this.f10370f = null;
        this.h = null;
    }
}
