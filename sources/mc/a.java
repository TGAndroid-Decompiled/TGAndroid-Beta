package mc;

import java.util.ArrayList;
import java.util.Map;
public final class a extends c {
    public final a f13628e;
    public ArrayList f13629f;

    public a(String str, int i10, Map map, a aVar) {
        super(i10, str, map);
        this.f13628e = aVar;
    }

    @Override
    public final Map a() {
        return this.f13632c;
    }

    public final void b(int i10) {
        if (this.d > -1) {
            return;
        }
        this.d = i10;
        ArrayList arrayList = this.f13629f;
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
        sb.append(this.f13630a);
        sb.append("', start=");
        sb.append(this.f13631b);
        sb.append(", end=");
        sb.append(this.d);
        sb.append(", attributes=");
        sb.append(this.f13632c);
        sb.append(", parent=");
        a aVar = this.f13628e;
        if (aVar != null) {
            str = aVar.f13630a;
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", children=");
        sb.append(this.f13629f);
        sb.append('}');
        return sb.toString();
    }
}
