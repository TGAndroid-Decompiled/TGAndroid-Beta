package defpackage;

import android.content.Context;
public final class ma0 extends t23 {
    public final Context a;
    public final hk2 b;
    public final hk2 c;
    public final String d;

    public ma0(Context context, hk2 hk2Var, hk2 hk2Var2, String str) {
        if (context != null) {
            this.a = context;
            if (hk2Var != null) {
                this.b = hk2Var;
                if (hk2Var2 != null) {
                    this.c = hk2Var2;
                    if (str != null) {
                        this.d = str;
                        return;
                    } else {
                        gxc.d("Null backendName");
                        throw null;
                    }
                }
                gxc.d("Null monotonicClock");
                throw null;
            }
            gxc.d("Null wallClock");
            throw null;
        }
        gxc.d("Null applicationContext");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t23) {
            ma0 ma0Var = (ma0) ((t23) obj);
            if (this.a.equals(ma0Var.a) && this.b.equals(ma0Var.b) && this.c.equals(ma0Var.c) && this.d.equals(ma0Var.d)) {
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
        return b10.j(sb, this.d, "}");
    }
}
