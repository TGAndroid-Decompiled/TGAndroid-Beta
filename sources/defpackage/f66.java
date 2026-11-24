package defpackage;

import java.util.ArrayList;
public final class f66 {
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
        String a = j54.a(this.f);
        StringBuilder sb = this.h;
        if (sb != null) {
            str = j54.a(sb.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? ui6Var = new ui6();
        ui6Var.g = str2;
        ui6Var.h = a;
        ui6Var.i = str;
        this.c.add(ui6Var);
        this.d = null;
        this.i = false;
        this.e = null;
        this.f = null;
        this.h = null;
    }
}
