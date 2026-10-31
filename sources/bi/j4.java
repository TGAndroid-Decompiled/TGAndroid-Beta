package bi;

import java.util.ArrayList;
public final class j4 {
    public final ArrayList f3120a;

    public j4(ArrayList arrayList) {
        this.f3120a = arrayList;
    }

    public void a(StringBuilder sb2) {
        String str;
        if (((Boolean) i0.a.v(1, this.f3120a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void b(StringBuilder sb2) {
        while (!this.f3120a.isEmpty()) {
            a(sb2);
        }
    }

    public hf.f c(int i10) {
        return (hf.f) this.f3120a.get(i10);
    }

    public j4(hf.f fVar) {
        ArrayList arrayList = new ArrayList(1);
        this.f3120a = arrayList;
        arrayList.add(fVar);
    }

    public j4() {
        this.f3120a = new ArrayList();
    }
}
