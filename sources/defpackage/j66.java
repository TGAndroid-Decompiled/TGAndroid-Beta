package defpackage;

import java.util.ArrayList;
public final class j66 {
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
        String a = u44.a(this.f);
        StringBuilder sb = this.h;
        if (sb != null) {
            str = u44.a(sb.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? yi6Var = new yi6();
        yi6Var.g = str2;
        yi6Var.h = a;
        yi6Var.i = str;
        this.c.add(yi6Var);
        this.d = null;
        this.i = false;
        this.e = null;
        this.f = null;
        this.h = null;
    }
}
