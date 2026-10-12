package cd;

import java.util.ArrayList;
import java.util.Map;
public final class a extends c {
    public final a e;
    public ArrayList f4729f;

    public a(String str, int i10, Map map, a aVar) {
        super(i10, str, map);
        this.e = aVar;
    }

    @Override
    public final Map a() {
        return this.f4732c;
    }

    public final void b(int i10) {
        if (this.d > -1) {
            return;
        }
        this.d = i10;
        ArrayList arrayList = this.f4729f;
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
        sb2.append(this.f4730a);
        sb2.append("', start=");
        sb2.append(this.f4731b);
        sb2.append(", end=");
        sb2.append(this.d);
        sb2.append(", attributes=");
        sb2.append(this.f4732c);
        sb2.append(", parent=");
        a aVar = this.e;
        if (aVar != null) {
            str = aVar.f4730a;
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(", children=");
        sb2.append(this.f4729f);
        sb2.append('}');
        return sb2.toString();
    }
}
