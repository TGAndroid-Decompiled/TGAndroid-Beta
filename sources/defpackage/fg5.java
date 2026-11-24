package defpackage;

import java.util.ArrayList;
import java.util.Map;
public final class fg5 extends hg5 {
    public final fg5 e;
    public ArrayList f;

    public fg5(String str, int i, Map map, fg5 fg5Var) {
        super(i, str, map);
        this.e = fg5Var;
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
                ((fg5) obj).b(i);
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
        fg5 fg5Var = this.e;
        if (fg5Var != null) {
            str = fg5Var.a;
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
