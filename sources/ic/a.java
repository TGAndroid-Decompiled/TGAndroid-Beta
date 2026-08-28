package ic;

import java.util.ArrayList;
import java.util.Map;
public final class a extends c {
    public final a f11089e;
    public ArrayList f11090f;

    public a(String str, int i9, Map map, a aVar) {
        super(i9, str, map);
        this.f11089e = aVar;
    }

    @Override
    public final Map a() {
        return this.f11093c;
    }

    public final void b(int i9) {
        if (this.d > -1) {
            return;
        }
        this.d = i9;
        ArrayList arrayList = this.f11090f;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((a) obj).b(i9);
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BlockImpl{name='");
        sb2.append(this.f11091a);
        sb2.append("', start=");
        sb2.append(this.f11092b);
        sb2.append(", end=");
        sb2.append(this.d);
        sb2.append(", attributes=");
        sb2.append(this.f11093c);
        sb2.append(", parent=");
        a aVar = this.f11089e;
        if (aVar != null) {
            str = aVar.f11091a;
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(", children=");
        sb2.append(this.f11090f);
        sb2.append('}');
        return sb2.toString();
    }
}
