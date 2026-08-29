package ie;

import java.util.ArrayList;
public final class k {
    public StringBuilder d;
    public String f8946e;
    public String f8947f;
    public char f8948g;
    public StringBuilder h;
    public int f8943a = 1;
    public final StringBuilder f8944b = new StringBuilder();
    public final ArrayList f8945c = new ArrayList();
    public boolean f8949i = false;

    public final void a() {
        String str;
        if (!this.f8949i) {
            return;
        }
        String a2 = ke.a.a(this.f8947f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = ke.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f8946e;
        ?? pVar = new le.p();
        pVar.f15202g = str2;
        pVar.h = a2;
        pVar.f15203i = str;
        this.f8945c.add(pVar);
        this.d = null;
        this.f8949i = false;
        this.f8946e = null;
        this.f8947f = null;
        this.h = null;
    }
}
