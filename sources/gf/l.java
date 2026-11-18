package gf;

import java.util.ArrayList;
public final class l {
    public StringBuilder d;
    public String f13593e;
    public String f13594f;
    public char f13595g;
    public StringBuilder h;
    public int f13590a = 1;
    public final StringBuilder f13591b = new StringBuilder();
    public final ArrayList f13592c = new ArrayList();
    public boolean f13596i = false;

    public final void a() {
        String str;
        if (!this.f13596i) {
            return;
        }
        String a10 = jf.a.a(this.f13594f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = jf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f13593e;
        ?? pVar = new kf.p();
        pVar.f18232g = str2;
        pVar.h = a10;
        pVar.f18233i = str;
        this.f13592c.add(pVar);
        this.d = null;
        this.f13596i = false;
        this.f13593e = null;
        this.f13594f = null;
        this.h = null;
    }
}
