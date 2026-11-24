package defpackage;

import java.util.ArrayList;
import java.util.Map;
public final class ei5 extends gi5 {
    public final ei5 e;
    public ArrayList f;

    public ei5(String str, int i, Map map, ei5 ei5Var) {
        super(i, str, map);
        this.e = ei5Var;
    }

    @Override
    public final Map a() {
        return this.c;
    }

    public final void b(int i) {
        if (this.d > -1) {
            return;
        }
        this.d = i;
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((ei5) obj).b(i);
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BlockImpl{name='");
        sb.append(this.a);
        sb.append("', start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.d);
        sb.append(", attributes=");
        sb.append(this.c);
        sb.append(", parent=");
        ei5 ei5Var = this.e;
        if (ei5Var != null) {
            str = ei5Var.a;
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", children=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
