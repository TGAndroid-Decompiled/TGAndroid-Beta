package defpackage;

import android.content.Context;
public final class m90 extends h13 {
    public final Context a;
    public final ti2 b;
    public final ti2 c;
    public final String d;

    public m90(Context context, ti2 ti2Var, ti2 ti2Var2, String str) {
        if (context != null) {
            this.a = context;
            if (ti2Var != null) {
                this.b = ti2Var;
                if (ti2Var2 != null) {
                    this.c = ti2Var2;
                    if (str != null) {
                        this.d = str;
                        return;
                    } else {
                        fvc.f("Null backendName");
                        throw null;
                    }
                }
                fvc.f("Null monotonicClock");
                throw null;
            }
            fvc.f("Null wallClock");
            throw null;
        }
        fvc.f("Null applicationContext");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h13) {
            m90 m90Var = (m90) ((h13) obj);
            if (this.a.equals(m90Var.a) && this.b.equals(m90Var.b) && this.c.equals(m90Var.c) && this.d.equals(m90Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return b00.j(sb, this.d, "}");
    }
}
