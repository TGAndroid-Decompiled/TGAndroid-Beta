package ad;

import java.util.ArrayList;
import java.util.Map;
public final class a extends c {
    public final a f1030e;
    public ArrayList f1031f;

    public a(String str, int i7, Map map, a aVar) {
        super(i7, str, map);
        this.f1030e = aVar;
    }

    @Override
    public final Map a() {
        return this.f1034c;
    }

    public final void b(int i7) {
        if (this.d > -1) {
            return;
        }
        this.d = i7;
        ArrayList arrayList = this.f1031f;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((a) obj).b(i7);
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BlockImpl{name='");
        sb2.append(this.f1032a);
        sb2.append("', start=");
        sb2.append(this.f1033b);
        sb2.append(", end=");
        sb2.append(this.d);
        sb2.append(", attributes=");
        sb2.append(this.f1034c);
        sb2.append(", parent=");
        a aVar = this.f1030e;
        if (aVar != null) {
            str = aVar.f1032a;
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(", children=");
        sb2.append(this.f1031f);
        sb2.append('}');
        return sb2.toString();
    }
}
