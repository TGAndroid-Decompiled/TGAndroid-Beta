package kc;

import java.util.ArrayList;
import java.util.Map;
public final class a extends c {
    public final a f13612e;
    public ArrayList f13613f;

    public a(String str, int i10, Map map, a aVar) {
        super(i10, str, map);
        this.f13612e = aVar;
    }

    @Override
    public final Map a() {
        return this.f13616c;
    }

    public final void b(int i10) {
        if (this.d > -1) {
            return;
        }
        this.d = i10;
        ArrayList arrayList = this.f13613f;
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
        StringBuilder sb2 = new StringBuilder("BlockImpl{name='");
        sb2.append(this.f13614a);
        sb2.append("', start=");
        sb2.append(this.f13615b);
        sb2.append(", end=");
        sb2.append(this.d);
        sb2.append(", attributes=");
        sb2.append(this.f13616c);
        sb2.append(", parent=");
        a aVar = this.f13612e;
        if (aVar != null) {
            str = aVar.f13614a;
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(", children=");
        sb2.append(this.f13613f);
        sb2.append('}');
        return sb2.toString();
    }
}
