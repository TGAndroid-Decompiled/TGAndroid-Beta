package fe;

import java.util.ArrayList;
public final class k {
    public StringBuilder d;
    public String f6109e;
    public String f6110f;
    public char f6111g;
    public StringBuilder h;
    public int f6106a = 1;
    public final StringBuilder f6107b = new StringBuilder();
    public final ArrayList f6108c = new ArrayList();
    public boolean f6112i = false;

    public final void a() {
        String str;
        if (!this.f6112i) {
            return;
        }
        String a2 = he.a.a(this.f6110f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = he.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f6109e;
        ?? pVar = new ie.p();
        pVar.f11119g = str2;
        pVar.h = a2;
        pVar.f11120i = str;
        this.f6108c.add(pVar);
        this.d = null;
        this.f6112i = false;
        this.f6109e = null;
        this.f6110f = null;
        this.h = null;
    }
}
