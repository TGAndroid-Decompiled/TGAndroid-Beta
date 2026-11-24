package defpackage;

import java.util.ArrayList;
public final class f46 {
    public StringBuilder d;
    public String e;
    public String f;
    public char g;
    public StringBuilder h;
    public int a = 1;
    public final StringBuilder b = new StringBuilder();
    public final ArrayList c = new ArrayList();
    public boolean i = false;

    public final void a() {
        String str;
        if (!this.i) {
            return;
        }
        String a = z34.a(this.f);
        StringBuilder sb = this.h;
        if (sb != null) {
            str = z34.a(sb.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? tg6Var = new tg6();
        tg6Var.g = str2;
        tg6Var.h = a;
        tg6Var.i = str;
        this.c.add(tg6Var);
        this.d = null;
        this.i = false;
        this.e = null;
        this.f = null;
        this.h = null;
    }
}
