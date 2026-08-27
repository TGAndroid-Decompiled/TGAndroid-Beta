package jc;

import java.util.ArrayList;
import java.util.Map;

public final class a extends c {

    public final a f12891e;

    public ArrayList f12892f;

    public a(String str, int i10, Map map, a aVar) {
        super(i10, str, map);
        this.f12891e = aVar;
    }

    @Override
    public final Map a() {
        return this.f12895c;
    }

    public final void b(int i10) {
        if (this.d > -1) {
            return;
        }
        this.d = i10;
        ArrayList arrayList = this.f12892f;
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
        StringBuilder sb2 = new StringBuilder("BlockImpl{name='");
        sb2.append(this.f12893a);
        sb2.append("', start=");
        sb2.append(this.f12894b);
        sb2.append(", end=");
        sb2.append(this.d);
        sb2.append(", attributes=");
        sb2.append(this.f12895c);
        sb2.append(", parent=");
        a aVar = this.f12891e;
        sb2.append(aVar != null ? aVar.f12893a : null);
        sb2.append(", children=");
        sb2.append(this.f12892f);
        sb2.append('}');
        return sb2.toString();
    }
}
