package mc;

import java.util.ArrayList;
import java.util.Map;
public final class a extends c {
    public final a e;
    public ArrayList f13910f;

    public a(String str, int i10, Map map, a aVar) {
        super(i10, str, map);
        this.e = aVar;
    }

    @Override
    public final Map a() {
        return this.f13913c;
    }

    public final void b(int i10) {
        if (this.d > -1) {
            return;
        }
        this.d = i10;
        ArrayList arrayList = this.f13910f;
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((a) obj).b(i10);
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BlockImpl{name='");
        sb.append(this.f13911a);
        sb.append("', start=");
        sb.append(this.f13912b);
        sb.append(", end=");
        sb.append(this.d);
        sb.append(", attributes=");
        sb.append(this.f13913c);
        sb.append(", parent=");
        a aVar = this.e;
        if (aVar != null) {
            str = aVar.f13911a;
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", children=");
        sb.append(this.f13910f);
        sb.append('}');
        return sb.toString();
    }
}
