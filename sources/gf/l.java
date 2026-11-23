package gf;

import java.util.ArrayList;
public final class l {
    public StringBuilder d;
    public String f13585e;
    public String f13586f;
    public char f13587g;
    public StringBuilder h;
    public int f13582a = 1;
    public final StringBuilder f13583b = new StringBuilder();
    public final ArrayList f13584c = new ArrayList();
    public boolean f13588i = false;

    public final void a() {
        String str;
        if (!this.f13588i) {
            return;
        }
        String a10 = jf.a.a(this.f13586f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = jf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f13585e;
        ?? pVar = new kf.p();
        pVar.f18325g = str2;
        pVar.h = a10;
        pVar.f18326i = str;
        this.f13584c.add(pVar);
        this.d = null;
        this.f13588i = false;
        this.f13585e = null;
        this.f13586f = null;
        this.h = null;
    }
}
